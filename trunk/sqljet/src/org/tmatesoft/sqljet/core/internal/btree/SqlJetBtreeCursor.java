/**
 * SqlJetBtreeCursor.java
 * Copyright (C) 2009 TMate Software Ltd
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
package org.tmatesoft.sqljet.core.internal.btree;

import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.ISqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeCursor implements ISqlJetBtreeCursor {

    /** The Btree to which this cursor belongs */
    SqlJetBtree pBtree;

    /** The BtShared this cursor points to */
    SqlJetBtreeShared pBt;

    /** Forms a linked list of all cursors */
    SqlJetBtreeCursor pNext, pPrev;

    /** Argument passed to comparison function */
    ISqlJetKeyInfo pKeyInfo;

    /** The root page of this tree */
    int pgnoRoot;

    /** A parse of the cell we are pointing at */
    SqlJetBtreeCellInfo info;

    /** True if writable */
    boolean wrFlag;

    /** Cursor pointing to the last entry */
    boolean atLast;

    /** True if info.nKey is valid */
    boolean validNKey;

    /** One of the CURSOR_XXX constants (see below) */
    CursorState eState;

    /** Saved key that was cursor's last known position */
    ByteBuffer pKey;

    /** Size of pKey, or last integer key */
    long nKey;

    SqlJetErrorCode error;
    
    /**
     * (skip<0) -> Prev() is a no-op. (skip>0) -> Next() is
     */
    int skip;

    /** True if this cursor is an incr. io handle */
    boolean isIncrblobHandle;

    /** Cache of overflow page locations */
    int[] aOverflow;

    /** True if Btree pages are rearranged by balance() */
    boolean pagesShuffled;

    /** Index of current page in apPage */
    int iPage;

    /**
     * Pages from root to current page
     */
    SqlJetMemPage[] apPage = new SqlJetMemPage[BTCURSOR_MAX_DEPTH];

    /** Current index in apPage[i] */
    int[] aiIdx = new int[BTCURSOR_MAX_DEPTH];

    /**
     * Potential values for BtCursor.eState.
     * 
     * CURSOR_VALID: Cursor points to a valid entry. getPayload() etc. may be
     * called.
     * 
     * CURSOR_INVALID: Cursor does not point to a valid entry. This can happen
     * (for example) because the table is empty or because BtreeCursorFirst()
     * has not been called.
     * 
     * CURSOR_REQUIRESEEK: The table that this cursor was opened on still
     * exists, but has been modified since the cursor was last used. The cursor
     * position is saved in variables BtCursor.pKey and BtCursor.nKey. When a
     * cursor is in this state, restoreCursorPosition() can be called to attempt
     * to seek the cursor to the saved position.
     * 
     * CURSOR_FAULT: A unrecoverable error (an I/O error or a malloc failure)
     * has occurred on a different connection that shares the BtShared cache
     * with this cursor. The error has left the cache in an inconsistent state.
     * Do nothing else with this cursor. Any attempt to use the cursor should
     * return the error code stored in BtCursor.skip
     */
    static enum CursorState {
        INVALID, // 0
        VALID, // 1
        REQUIRESEEK, // 2
        FAULT
        // 3
    }

    /**
     * Create a new cursor for the BTree whose root is on the page iTable. The
     * act of acquiring a cursor gets a read lock on the database file.
     * 
     * If wrFlag==0, then the cursor can only be used for reading. If wrFlag==1,
     * then the cursor can be used for reading or for writing if other
     * conditions for writing are also met. These are the conditions that must
     * be met in order for writing to be allowed:
     * 
     * 1: The cursor must have been opened with wrFlag==1
     * 
     * 2: Other database connections that share the same pager cache but which
     * are not in the READ_UNCOMMITTED state may not have cursors open with
     * wrFlag==0 on the same table. Otherwise the changes made by this write
     * cursor would be visible to the read cursors in the other database
     * connection.
     * 
     * 3: The database must be writable (not on read-only media)
     * 
     * 4: There must be an active transaction.
     * 
     * No checking is done to make sure that page iTable really is the root page
     * of a b-tree. If it is not, then the cursor acquired will not work
     * correctly.
     * 
     * It is assumed that the sqlite3BtreeCursorSize() bytes of memory pointed
     * to by pCur have been zeroed by the caller.
     * 
     * 
     * @param sqlJetBtree
     * @param table
     * @param wrFlag2
     * @param keyInfo
     * 
     * @throws SqlJetException
     */
    public SqlJetBtreeCursor(SqlJetBtree btree, int table, boolean wrFlag, ISqlJetKeyInfo keyInfo)
            throws SqlJetException {

        int nPage;
        SqlJetBtreeShared pBt = btree.pBt;

        assert (btree.holdsMutex());

        if (wrFlag) {
            assert (!pBt.readOnly);
            if (pBt.readOnly) {
                throw new SqlJetException(SqlJetErrorCode.READONLY);
            }
            if (btree.checkReadLocks(table, null, 0)) {
                throw new SqlJetException(SqlJetErrorCode.LOCKED);
            }
        }

        if (pBt.pPage1 == null) {
            btree.lockWithRetry();
        }
        this.pgnoRoot = table;
        nPage = pBt.pPager.getPageCount();
        try {

            if (table == 1 && nPage == 0) {
                throw new SqlJetException(SqlJetErrorCode.EMPTY);
            }
            this.apPage[0] = pBt.getAndInitPage(pgnoRoot);

            /*
             * Now that no other errors can occur, finish filling in the
             * BtCursor* variables, link the cursor into the BtShared list and
             * set *ppCur (the* output argument to this function).
             */
            this.pKeyInfo = keyInfo;
            this.pBtree = btree;
            this.pBt = pBt;
            this.wrFlag = wrFlag;
            this.pNext = pBt.pCursor;
            if (this.pNext != null) {
                this.pNext.pPrev = this;
            }
            pBt.pCursor = this;
            this.eState = CursorState.INVALID;

        } catch (SqlJetException e) {
            // create_cursor_exception:
            SqlJetMemPage.releasePage(this.apPage[0]);
            pBt.unlockBtreeIfUnused();
            throw e;
        }
    }

    /**
     * @return
     */
    private boolean holdsMutex() {
        return pBt.mutex.held();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#clearCursor()
     */
    public void clearCursor() {
        assert (holdsMutex());
        pKey = null;
        eState = CursorState.INVALID;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#closeCursor()
     */
    public void closeCursor() throws SqlJetException {
        if (pBtree != null) {
            int i;
            pBtree.enter();
            try {
                pBt.db = pBtree.db;
                clearCursor();
                if (pPrev != null) {
                    pPrev.pNext = pNext;
                } else {
                    pBt.pCursor = pNext;
                }
                if (pNext != null) {
                    pNext.pPrev = pPrev;
                }
                for (i = 0; i <= iPage; i++) {
                    SqlJetMemPage.releasePage(apPage[i]);
                }
                pBt.unlockBtreeIfUnused();
                invalidateOverflowCache();
                /* sqlite3_free(pCur); */
            } finally {
                pBtree.leave();
            }
        }
    }

    /**
     * Invalidate the overflow page-list cache for cursor pCur, if any.
     */
    private void invalidateOverflowCache() {
        assert (holdsMutex());
        aOverflow = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveTo(byte[], long,
     * boolean)
     */
    public int moveTo(ByteBuffer pKey, long nKey, boolean bias) throws SqlJetException {
        /* Unpacked index key */
        SqlJetUnpackedRecord pIdxKey;

        if (pKey != null) {
            assert (nKey == (long) (int) nKey);
            pIdxKey = pKeyInfo.recordUnpack((int) nKey, pKey);
            if (pIdxKey == null)
                throw new SqlJetException(SqlJetErrorCode.NOMEM);
        } else {
            pIdxKey = null;
        }

        try {
            return moveToUnpacked(pIdxKey, nKey, bias);
        } finally {
            if (pKey != null) {
                SqlJetUnpackedRecord.delete(pIdxKey);
            }
        }
    }

    /**
     * Move the cursor to the root page
     */
    private void moveToRoot() throws SqlJetException {
        SqlJetMemPage pRoot;

        assert (this.holdsMutex());
        assert (CursorState.INVALID.compareTo(CursorState.REQUIRESEEK) < 0);
        assert (CursorState.VALID.compareTo(CursorState.REQUIRESEEK) < 0);
        assert (CursorState.FAULT.compareTo(CursorState.REQUIRESEEK) < 0);
        if (this.eState.compareTo(CursorState.REQUIRESEEK) >= 0) {
            if (this.eState == CursorState.FAULT) {
                throw new SqlJetException(this.error);
            }
            this.clearCursor();
        }

        if (this.iPage >= 0) {
            int i;
            for (i = 1; i <= this.iPage; i++) {
                SqlJetMemPage.releasePage(this.apPage[i]);
            }
        } else {
            try {
                this.apPage[0] = pBt.getAndInitPage(this.pgnoRoot);
            } catch (SqlJetException e) {
                this.eState = CursorState.INVALID;
                throw e;
            }
        }

        pRoot = this.apPage[0];
        assert (pRoot.pgno == this.pgnoRoot);
        this.iPage = 0;
        this.aiIdx[0] = 0;
        this.info.nSize = 0;
        this.atLast = false;
        this.validNKey = false;

        if (pRoot.nCell == 0 && !pRoot.leaf) {
            int subpage;
            assert (pRoot.pgno == 1);
            subpage = SqlJetUtility.get4byte(pRoot.aData, pRoot.hdrOffset + 8);
            assert (subpage > 0);
            this.eState = CursorState.VALID;
            moveToChild(subpage);
        } else {
            this.eState = ((pRoot.nCell > 0) ? CursorState.VALID : CursorState.INVALID);
        }

    }

    /**
     * Move the cursor down to a new child page. The newPgno argument is the
     * page number of the child page to move to.
     */
    private void moveToChild(int newPgno) throws SqlJetException {
        int i = this.iPage;
        SqlJetMemPage pNewPage;

        assert (this.holdsMutex());
        assert (this.eState == CursorState.VALID);
        assert (this.iPage < BTCURSOR_MAX_DEPTH);
        if (this.iPage >= (BTCURSOR_MAX_DEPTH - 1)) {
            throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
        }
        pNewPage = pBt.getAndInitPage(newPgno);
        this.apPage[i + 1] = pNewPage;
        this.aiIdx[i + 1] = 0;
        this.iPage++;

        this.info.nSize = 0;
        this.validNKey = false;
        if (pNewPage.nCell < 1) {
            throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
        }
    }

    /**
     * Make sure the BtCursor has a valid BtCursor.info structure. If it is not
     * already valid, call sqlite3BtreeParseCell() to fill it in.
     * 
     * BtCursor.info is a cache of the information in the current cell. Using
     * this cache reduces the number of calls to sqlite3BtreeParseCell().
     * 
     */
    private void getCellInfo() {
        if (this.info.nSize == 0) {
            this.info = this.apPage[iPage].parseCell(this.aiIdx[iPage]);
            this.validNKey = true;
        }
    }

    /**
     * Return a pointer to payload information from the entry that the pCur
     * cursor is pointing to. The pointer is to the beginning of the key if
     * skipKey==0 and it points to the beginning of data if skipKey==1. The
     * number of bytes of available key/data is written into *pAmt. If *pAmt==0,
     * then the value returned will not be a valid pointer.
     * 
     * This routine is an optimization. It is common for the entire key and data
     * to fit on the local page and for there to be no overflow pages. When that
     * is so, this routine can be used to access the key and data without making
     * a copy. If the key and/or data spills onto overflow pages, then
     * accessPayload() must be used to reassembly the key/data and copy it into
     * a preallocated buffer.
     * 
     * The pointer returned by this routine looks directly into the cached page
     * of the database. The data might change or move the next time any btree
     * routine is called.
     * 
     * @param pAmt
     *            Write the number of available bytes here
     * @param skipKey
     *            read beginning at data if this is true
     * @return
     */
    private ByteBuffer fetchPayload(int[] pAmt, boolean skipKey) {
        ByteBuffer aPayload;
        SqlJetMemPage pPage;
        int nKey;
        int nLocal;

        assert (this.iPage >= 0 && this.apPage[this.iPage] != null);
        assert (this.eState == CursorState.VALID);
        assert (this.holdsMutex());
        pPage = this.apPage[this.iPage];
        assert (this.aiIdx[this.iPage] < pPage.nCell);
        this.getCellInfo();
        aPayload = this.info.pCell;
        aPayload = SqlJetUtility.slice(aPayload, this.info.nHeader);
        if (pPage.intKey) {
            nKey = 0;
        } else {
            nKey = (int) this.info.nKey;
        }
        if (skipKey) {
            aPayload = SqlJetUtility.slice(aPayload, nKey);
            nLocal = this.info.nLocal - nKey;
        } else {
            nLocal = this.info.nLocal;
            if (nLocal > nKey) {
                nLocal = nKey;
            }
        }
        pAmt[0] = nLocal;
        return aPayload;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveToUnpacked(org.tmatesoft
     * .sqljet.core.ISqlJetUnpackedRecord, long, boolean)
     */
    public int moveToUnpacked(ISqlJetUnpackedRecord pIdxKey, long intKey, boolean biasRight) throws SqlJetException {

        assert (holdsMutex());
        assert (pBtree.db.getMutex().held());

        /*
         * If the cursor is already positioned at the point we are trying* to
         * move to, then just return without doing any work
         */
        if (this.eState == CursorState.VALID && this.validNKey && this.apPage[0].intKey) {
            if (this.info.nKey == intKey) {
                return 0;
            }
            if (this.atLast && this.info.nKey < intKey) {
                return -1;
            }
        }

        moveToRoot();

        assert (this.apPage[this.iPage] != null);
        assert (this.apPage[this.iPage].isInit);
        if (this.eState == CursorState.INVALID) {
            assert (this.apPage[this.iPage].nCell == 0);
            return -1;
        }
        assert (this.apPage[0].intKey || pIdxKey != null);
        for (;;) {
            int lwr, upr;
            int chldPg;
            SqlJetMemPage pPage = this.apPage[this.iPage];
            int c = -1; /* pRes return if table is empty must be -1 */
            lwr = 0;
            upr = pPage.nCell - 1;
            if ((!pPage.intKey && pIdxKey == null) || upr < 0) {
                throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
            }
            if (biasRight) {
                this.aiIdx[this.iPage] = upr;
            } else {
                this.aiIdx[this.iPage] = ((upr + lwr) / 2);
            }
            for (;;) {
                ByteBuffer pCellKey;
                long[] nCellKey = new long[1];
                int idx = this.aiIdx[this.iPage];
                this.info.nSize = 0;
                this.validNKey = true;
                if (pPage.intKey) {
                    ByteBuffer pCell;
                    pCell = SqlJetUtility.slice(pPage.findCell(idx), pPage.childPtrSize);
                    if (pPage.hasData) {
                        int[] dummy = new int[1];
                        pCell = SqlJetUtility.slice(pCell, SqlJetUtility.getVarint32(pCell, dummy));
                    }
                    SqlJetUtility.getVarint(pCell, nCellKey);
                    if (nCellKey[0] == intKey) {
                        c = 0;
                    } else if (nCellKey[0] < intKey) {
                        c = -1;
                    } else {
                        assert (nCellKey[0] > intKey);
                        c = +1;
                    }
                } else {
                    int[] available = new int[1];
                    pCellKey = this.fetchPayload(available, false);
                    nCellKey[0] = this.info.nKey;
                    if (available[0] >= nCellKey[0]) {
                        c = pIdxKey.recordCompare((int) nCellKey[0], pCellKey);
                    } else {
                        pCellKey = ByteBuffer.allocate((int) nCellKey[0]);
                        try {
                            this.key(0, (int) nCellKey[0], pCellKey);
                        } finally {
                            c = pIdxKey.recordCompare((int) nCellKey[0], pCellKey);
                            // sqlite3_free(pCellKey);
                        }
                    }
                }
                if (c == 0) {
                    this.info.nKey = nCellKey[0];
                    if (pPage.intKey && !pPage.leaf) {
                        lwr = idx;
                        upr = lwr - 1;
                        break;
                    } else {
                        return 0;
                    }
                }
                if (c < 0) {
                    lwr = idx + 1;
                } else {
                    upr = idx - 1;
                }
                if (lwr > upr) {
                    this.info.nKey = nCellKey[0];
                    break;
                }
                this.aiIdx[this.iPage] = (int) ((lwr + upr) / 2);
            }
            assert (lwr == upr + 1);
            assert (pPage.isInit);
            if (pPage.leaf) {
                chldPg = 0;
            } else if (lwr >= pPage.nCell) {
                chldPg = SqlJetUtility.get4byte(pPage.aData, pPage.hdrOffset + 8);
            } else {
                chldPg = SqlJetUtility.get4byte(pPage.findCell(lwr));
            }
            if (chldPg == 0) {
                assert (this.aiIdx[this.iPage] < this.apPage[this.iPage].nCell);
                return c;
            }
            this.aiIdx[this.iPage] = (int) lwr;
            this.info.nSize = 0;
            this.validNKey = false;
            moveToChild(chldPg);
        }

    }

    /**
    * Restore the cursor to the position it was in (or as close to as possible)
    * when saveCursorPosition() was called. Note that this call deletes the 
    * saved position info stored by saveCursorPosition(), so there can be
    * at most one effective restoreCursorPosition() call after each 
    * saveCursorPosition().
    */
    private void restoreCursorPosition() throws SqlJetException{
      if( this.eState.compareTo(CursorState.REQUIRESEEK) <0 ) return;
      assert( this.holdsMutex() );
      if( this.eState==CursorState.FAULT ){
        throw new SqlJetException(this.error);
      }
      this.eState = CursorState.INVALID;
      this.skip = this.moveTo( this.pKey, this.nKey, false);
      this.pKey = null;
      assert( this.eState==CursorState.VALID || this.eState==CursorState.INVALID );
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#cursorHasMoved()
     */
    public boolean cursorHasMoved() {
        try {
            restoreCursorPosition();
        } catch(SqlJetException e) {
          return true;
        }
        if( eState!=CursorState.VALID || skip!=0 ){
          return true;
        }else{
          return false;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#delete()
     */
    public void delete() {
        // TODO Auto-generated method stub

    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#cacheOverflow()
     */
    public void cacheOverflow() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#data(int, int, byte[])
     */
    public void data(int offset, int amt, byte[] buf) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#dataFetch(int[])
     */
    public byte[] dataFetch(int[] amt) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#eof()
     */
    public boolean eof() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#first()
     */
    public boolean first() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#flags()
     */
    public byte flags() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getCursorDb()
     */
    public ISqlJetDb getCursorDb() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getDataSize()
     */
    public int getDataSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getKeySize()
     */
    public long getKeySize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#insert(byte[], long,
     * byte[], int, int, boolean)
     */
    public void insert(byte[] key, long key2, byte[] data, int data2, int zero, boolean bias) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#key(int, int, byte[])
     */
    public void key(int offset, int amt, ByteBuffer buf) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#keyFetch(int[])
     */
    public byte[] keyFetch(int[] amt) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#last()
     */
    public boolean last() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#next()
     */
    public boolean next() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#previous()
     */
    public boolean previous() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#putData(int, int,
     * byte[])
     */
    public void putData(int offset, int amt, byte[] data) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     */
    public boolean saveCursorPosition() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

}
