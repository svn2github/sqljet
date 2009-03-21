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

import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.ISqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeCursor implements ISqlJetBtreeCursor {

    SqlJetBtree pBtree; /* The Btree to which this cursor belongs */
    SqlJetBtreeShared pBt; /* The BtShared this cursor points to */
    SqlJetBtreeCursor pNext, pPrev; /* Forms a linked list of all cursors */
    ISqlJetKeyInfo pKeyInfo; /* Argument passed to comparison function */
    int pgnoRoot; /* The root page of this tree */
    SqlJetBtreeCellInfo info; /* A parse of the cell we are pointing at */
    boolean wrFlag; /* True if writable */
    boolean atLast; /* Cursor pointing to the last entry */
    boolean validNKey; /* True if info.nKey is valid */
    CursorState eState; /* One of the CURSOR_XXX constants (see below) */
    Object pKey; /* Saved key that was cursor's last known position */
    long nKey; /* Size of pKey, or last integer key */
    SqlJetErrorCode skip; /*
                           * (skip<0) -> Prev() is a no-op. (skip>0) -> Next()
                           * is
                           */
    boolean isIncrblobHandle; /* True if this cursor is an incr. io handle */
    int aOverflow; /* Cache of overflow page locations */
    boolean pagesShuffled; /* True if Btree pages are rearranged by balance() */
    int iPage; /* Index of current page in apPage */
    SqlJetMemPage[] apPage = new SqlJetMemPage[BTCURSOR_MAX_DEPTH]; /*
                                                                     * Pages
                                                                     * from root
                                                                     * to
                                                                     * current
                                                                     * page
                                                                     */
    int[] aiIdx = new int[BTCURSOR_MAX_DEPTH]; /* Current index in apPage[i] */

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
    public SqlJetBtreeCursor(SqlJetBtree btree, int table, boolean wrFlag2, ISqlJetKeyInfo keyInfo)
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
            this.pKeyInfo = pKeyInfo;
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
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#clearCursor()
     */
    public void clearCursor() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#closeCursor()
     */
    public void closeCursor() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#cursorHasMoved()
     */
    public boolean cursorHasMoved() {
        // TODO Auto-generated method stub
        return false;
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
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#delete()
     */
    public void delete() {
        // TODO Auto-generated method stub

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
    public void key(int offset, int amt, byte[] buf) {
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
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveTo(byte[], long,
     * boolean)
     */
    public int moveTo(byte[] key, long key2, boolean bias) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveToUnpacked(org.tmatesoft
     * .sqljet.core.ISqlJetUnpackedRecord, long, boolean)
     */
    public int moveToUnpacked(ISqlJetUnpackedRecord unKey, long intKey, boolean bias) {
        // TODO Auto-generated method stub
        return 0;
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
