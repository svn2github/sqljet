/**
 * SqlJetBtree.java
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

import static org.tmatesoft.sqljet.core.SqlJetException.assertion;

import java.io.File;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetBackend;
import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetAutoVacuumMode;
import org.tmatesoft.sqljet.core.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.SqlJetBtreeTableCreateFlags;
import org.tmatesoft.sqljet.core.SqlJetDbFlags;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetSafetyLevel;
import org.tmatesoft.sqljet.core.SqlJetSavepointOperation;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.pager.SqlJetPager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtree implements ISqlJetBtree {

    /** The database connection holding this btree */
    ISqlJetDb db;

    /** Sharable content of this btree */
    SqlJetBtreeShared pBt;

    /*
     * Btree.inTrans may take one of the following values.
     * 
     * If the shared-data extension is enabled, there may be multiple users of
     * the Btree structure. At most one of these may open a write transaction,
     * but any number may have active read transactions.
     */
    static enum TransMode {
        NONE, READ, WRITE
    }

    /** TRANS_NONE, TRANS_READ or TRANS_WRITE */
    TransMode inTrans;

    /** True if we can share pBt with another db */
    boolean sharable;

    /** True if db currently has pBt locked */
    boolean locked;

    /** Number of nested calls to sqlite3BtreeEnter() */
    int wantToLock;

    /** List of other sharable Btrees from the same db */
    SqlJetBtree pNext;

    /** Back pointer of the same list */
    SqlJetBtree pPrev;

    /**
     * A list of BtShared objects that are eligible for participation in shared
     * cache.
     */
    static List<SqlJetBtreeShared> sharedCacheList = new LinkedList<SqlJetBtreeShared>();

    /**
     * A bunch of assert() statements to check the transaction state variables
     * of handle p (type Btree*) are internally consistent.
     */
    private void integrity() throws SqlJetException {
        assertion(pBt.inTransaction != TransMode.NONE || pBt.nTransaction == 0);
        assertion(pBt.inTransaction.compareTo(inTrans) >= 0);
    }
    
    /**
     * Enter a mutex on the given BTree object.
     * 
     * If the object is not sharable, then no mutex is ever required and this
     * routine is a no-op. The underlying mutex is non-recursive. But we keep a
     * reference count in Btree.wantToLock so the behavior of this interface is
     * recursive.
     * 
     * To avoid deadlocks, multiple Btrees are locked in the same order by all
     * database connections. The p->pNext is a list of other Btrees belonging to
     * the same database connection as the p Btree which need to be locked after
     * p. If we cannot get a lock on p, then first unlock all of the others on
     * p->pNext, then wait for the lock to become available on p, then relock
     * all of the subsequent Btrees that desire a lock.
     */
    private void enter() throws SqlJetException {
        SqlJetBtree p = this;
        SqlJetBtree pLater;

        /*
         * Some basic sanity checking on the Btree. The list of Btrees connected
         * by pNext and pPrev should be in sorted order by Btree.pBt value. All
         * elements of the list should belong to the same connection. Only
         * shared Btrees are on the list.
         */
        assertion(p.pNext == null || p.pNext.pBt.hashCode() > p.pBt.hashCode());
        assertion(p.pPrev == null || p.pPrev.pBt.hashCode() < p.pBt.hashCode());
        assertion(p.pNext == null || p.pNext.db == p.db);
        assertion(p.pPrev == null || p.pPrev.db == p.db);
        assertion(p.sharable || (p.pNext == null && p.pPrev == null));

        /* Check for locking consistency */
        assertion(!p.locked || p.wantToLock > 0);
        assertion(p.sharable || p.wantToLock == 0);

        /* We should already hold a lock on the database connection */
        assertion(p.db.getMutex().held());

        if (!p.sharable)
            return;
        p.wantToLock++;
        if (p.locked)
            return;

        /*
         * In most cases, we should be able to acquire the lock we want without
         * having to go throught the ascending lock procedure that follows. Just
         * be sure not to block.
         */
        if (p.pBt.mutex.attempt()) {
            p.locked = true;
            return;
        }

        /*
         * To avoid deadlock, first release all locks with a larger BtShared
         * address. Then acquire our lock. Then reacquire the other BtShared
         * locks that we used to hold in ascending order.
         */
        for (pLater = p.pNext; pLater != null; pLater = pLater.pNext) {
            assertion(pLater.sharable);
            assertion(pLater.pNext == null || pLater.pNext.pBt.hashCode() > pLater.pBt.hashCode());
            assertion(!pLater.locked || pLater.wantToLock > 0);
            if (pLater.locked) {
                pLater.pBt.mutex.leave();
                pLater.locked = false;
            }
        }
        p.pBt.mutex.enter();
        p.locked = true;
        for (pLater = p.pNext; pLater != null; pLater = pLater.pNext) {
            if (pLater.wantToLock > 0) {
                pLater.pBt.mutex.enter();
                pLater.locked = true;
            }
        }
    }

    /*
     * Exit the recursive mutex on a Btree.
     */
    private void leave() throws SqlJetException {
        SqlJetBtree p = this;
        if (p.sharable) {
            assertion(p.wantToLock > 0);
            p.wantToLock--;
            if (p.wantToLock == 0) {
                assertion(p.locked);
                p.pBt.mutex.leave();
                p.locked = false;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#open(java.io.File,
     * org.tmatesoft.sqljet.core.ISqlJetDb, java.util.EnumSet,
     * org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)
     */
    public void open(File filename, ISqlJetDb db, EnumSet<SqlJetBtreeFlags> flags, final SqlJetFileType type,
            final EnumSet<SqlJetFileOpenPermission> permissions) throws SqlJetException {

        ISqlJetFileSystem pVfs; /* The VFS to use for this btree */
        SqlJetBtreeShared pBt = null; /* Shared part of btree structure */
        SqlJetException rc = null;
        int nReserve;
        byte[] zDbHeader = new byte[100];

        /*
         * Set the variable isMemdb to true for an in-memory database, or false
         * for a file-based database. This symbol is only required if either of
         * the shared-data or autovacuum features are compiled into the library.
         */
        final boolean isMemdb = filename != null && ISqlJetPager.MEMORY_DB.equals(filename.getPath());

        assertion(db != null);

        pVfs = db.getFileSystem();
        this.inTrans = TransMode.NONE;
        this.db = db;

        /*
         * If this Btree is a candidate for shared cache, try to find an
         * existing BtShared object that we can share with
         */
        if (!isMemdb && !db.getFlags().contains(SqlJetDbFlags.Vtab) && filename != null
                && !"".equals(filename.getPath())) {
            if (db.getConfig().isSharedCacheEnabled()) {
                this.sharable = true;
                db.getFlags().add(SqlJetDbFlags.SharedCache);
                final String fullPathname = pVfs.getFullPath(filename);
                synchronized (sharedCacheList) {
                    for (final Iterator<SqlJetBtreeShared> i = sharedCacheList.iterator(); i.hasNext(); pBt = i.next()) {
                        assertion(pBt.nRef > 0);
                        final String pagerFilename = pVfs.getFullPath(pBt.pPager.getFileName());
                        if (fullPathname.equals(pagerFilename) && pVfs == pBt.pPager.getFileSystem()) {
                            this.pBt = pBt;
                            pBt.nRef++;
                            break;
                        }
                    }
                }
            }
        }

        try {
            if (pBt == null) {
                /*
                 * The following asserts make sure that structures used by the
                 * btree are the right size. This is to guard against size
                 * changes that result when compiling on a different
                 * architecture.
                 */
                // assert( sizeof(i64)==8 || sizeof(i64)==4 );
                // assert( sizeof(u64)==8 || sizeof(u64)==4 );
                // assert( sizeof(u32)==4 );
                // assert( sizeof(u16)==2 );
                // assert( sizeof(Pgno)==4 );
                pBt = new SqlJetBtreeShared();
                pBt.pPager = new SqlJetPager();
                pBt.pPager.open(pVfs, filename, SqlJetBtreeFlags.toPagerFlags(flags), type, permissions);
                pBt.pPager.readFileHeader(zDbHeader.length, zDbHeader);
                pBt.pPager.setBusyhandler(new ISqlJetBusyHandler() {
                    public boolean call(int number) {
                        try {
                            return invokeBusyHandler(number);
                        } catch (SqlJetException e) {
                            return false;
                        }
                    }
                });
                this.pBt = pBt;
                pBt.pPager.setReiniter(new ISqlJetPageCallback() {
                    public void pageCallback(ISqlJetPage page) throws SqlJetException {
                        pageReinit(page);
                    }
                });

                pBt.pCursor = null;
                pBt.pPage1 = null;
                pBt.readOnly = pBt.pPager.isReadOnly();
                pBt.pageSize = SqlJetUtility.get2byte(zDbHeader, 16);

                if (pBt.pageSize < ISqlJetLimits.SQLJET_MIN_PAGE_SIZE
                        || pBt.pageSize > ISqlJetLimits.SQLJET_MAX_PAGE_SIZE
                        || ((pBt.pageSize - 1) & pBt.pageSize) != 0) {
                    pBt.pageSize = 0;
                    pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);
                    /*
                     * If the magic name ":memory:" will create an in-memory
                     * database, then leave the autoVacuum mode at 0 (do not
                     * auto-vacuum), even if SQLITE_DEFAULT_AUTOVACUUM is true.
                     * On the other hand, if SQLITE_OMIT_MEMORYDB has been
                     * defined, then ":memory:" is just a regular file-name. In
                     * this case the auto-vacuum applies as per normal.
                     */
                    if (null != filename && !isMemdb) {
                        pBt.autoVacuum = SQLJET_DEFAULT_AUTOVACUUM != SqlJetAutoVacuumMode.NONE;
                        pBt.incrVacuum = SQLJET_DEFAULT_AUTOVACUUM == SqlJetAutoVacuumMode.FULL;
                    }
                    nReserve = 0;
                } else {
                    nReserve = zDbHeader[20];
                    pBt.pageSizeFixed = true;
                    pBt.autoVacuum = (SqlJetUtility.get4byte(zDbHeader, 36 + 4 * 4) != 0);
                    pBt.incrVacuum = (SqlJetUtility.get4byte(zDbHeader, 36 + 7 * 4) != 0);
                }
                pBt.usableSize = pBt.pageSize - nReserve;
                assertion((pBt.pageSize & 7) == 0); /*
                                                     * 8-byte alignment of
                                                     * pageSize
                                                     */
                pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);

                /*
                 * Add the new BtShared object to the linked list sharable
                 * BtShareds.
                 */
                if (this.sharable) {
                    pBt.nRef = 1;
                    synchronized (sharedCacheList) {
                        sharedCacheList.add(pBt);
                    }
                }
            }

            /*
             * If the new Btree uses a sharable pBtShared, then link the new
             * Btree into the list of all sharable Btrees for the same
             * connection. The list is kept in ascending order by pBt address.
             */
            if (this.sharable) {
                for (final ISqlJetBackend backend : db.getBackends()) {
                    final ISqlJetBtree btree = backend.getBtree();
                    if (btree == null || !(btree instanceof SqlJetBtree))
                        continue;
                    SqlJetBtree pSib = (SqlJetBtree) btree;
                    if (pSib.sharable) {
                        while (pSib.pPrev != null) {
                            pSib = pSib.pPrev;
                        }
                        if (this.pBt.hashCode() < pSib.pBt.hashCode()) {
                            this.pNext = pSib;
                            this.pPrev = null;
                            pSib.pPrev = this;
                        } else {
                            while (pSib.pNext != null && pSib.pNext.pBt.hashCode() < this.pBt.hashCode()) {
                                pSib = pSib.pNext;
                            }
                            this.pNext = pSib.pNext;
                            this.pPrev = pSib;
                            if (this.pNext != null) {
                                this.pNext.pPrev = this;
                            }
                            pSib.pNext = this;
                        }
                        break;
                    }
                }
            }

        } catch (SqlJetException e) {

            // btree_open_out:
            if (pBt != null && pBt.pPager != null) {
                pBt.pPager.close();
            }
            throw e;
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#close()
     */
    public void close() throws SqlJetException {
        SqlJetBtree p = this;
        SqlJetBtreeCursor pCur;

        /* Close all cursors opened via this handle. */

        assertion(p.db.getMutex().held());
        p.enter();
        try {
            pBt.db = db;
            pCur = pBt.pCursor;
            while (pCur != null) {
                SqlJetBtreeCursor pTmp = pCur;
                pCur = pCur.pNext;
                if (pTmp.pBtree == p) {
                    pTmp.closeCursor();
                }
            }

            /*
             * Rollback any active transaction and free the handle structure.
             * The call to sqlite3BtreeRollback() drops any table-locks held by
             * this handle.
             */
            p.rollback();
        } finally {
            p.leave();
        }

        /*
         * If there are still other outstanding references to the shared-btree
         * structure, return now. The remainder of this procedure cleans up the
         * shared-btree.
         */
        assertion(p.wantToLock == 0 && !p.locked);
        if (!p.sharable || removeFromSharingList(pBt)) {
            /*
             * The pBt is no longer on the sharing list, so we can access it
             * without having to hold the mutex.
             * 
             * Clean out and delete the BtShared object.
             */
            assertion(pBt.pCursor == null);
            pBt.pPager.close();
            pBt.pSchema = null;
            pBt.pTmpSpace = null;
        }

        assertion(p.wantToLock == 0);
        assertion(!p.locked);
        if (p.pPrev != null)
            p.pPrev.pNext = p.pNext;
        if (p.pNext != null)
            p.pNext.pPrev = p.pPrev;
    }

    /**
     * Decrement the BtShared.nRef counter. When it reaches zero, remove the
     * BtShared structure from the sharing list. Return true if the
     * BtShared.nRef counter reaches zero and return false if it is still
     * positive.
     * 
     * @param bt
     * @return
     * @throws SqlJetException
     */
    static private boolean removeFromSharingList(SqlJetBtreeShared pBt) throws SqlJetException {
        boolean removed = false;
        assertion(!pBt.mutex.held());
        synchronized (sharedCacheList) {
            pBt.nRef--;
            if (pBt.nRef <= 0) {
                sharedCacheList.remove(pBt);
                removed = true;
            }
        }
        return removed;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setCacheSize(int)
     */
    public void setCacheSize(int mxPage) throws SqlJetException {
        assertion(db.getMutex().held());
        enter();
        try {
            pBt.pPager.setCacheSize(mxPage);
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#setSafetyLevel(org.tmatesoft.sqljet
     * .core.SqlJetSafetyLevel)
     */
    public void setSafetyLevel(SqlJetSafetyLevel level) throws SqlJetException {
        assertion(db.getMutex().held());
        enter();
        try {
            pBt.pPager.setSafetyLevel(level);
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isSyncDisabled()
     */
    public boolean isSyncDisabled() throws SqlJetException {
        assertion(db.getMutex().held());
        enter();
        try {
            assertion(pBt != null && pBt.pPager != null);
            return pBt.pPager.isNoSync();
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setPageSize(int, int)
     */
    public void setPageSize(int pageSize, int reserve) throws SqlJetException {
        assertion(reserve >= -1 && reserve <= 255);
        enter();
        try {
            if (pBt.pageSizeFixed) {
                throw new SqlJetException(SqlJetErrorCode.READONLY);
            }
            if (reserve < 0) {
                reserve = pBt.pageSize - pBt.usableSize;
            }
            assertion(reserve >= 0 && reserve <= 255);
            if (pageSize >= ISqlJetLimits.SQLJET_MIN_PAGE_SIZE && pageSize <= ISqlJetLimits.SQLJET_MAX_PAGE_SIZE
                    && ((pageSize - 1) & pageSize) == 0) {
                assertion((pageSize & 7) == 0);
                assertion(pBt.pPage1 == null && pBt.pCursor == null);
                pBt.pageSize = pageSize;
                pBt.pTmpSpace = null;
                pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);
            }
            pBt.usableSize = pBt.pageSize - reserve;
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getPageSize()
     */
    public int getPageSize() throws SqlJetException {
        return pBt.pageSize;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setMaxPageCount(int)
     */
    public void setMaxPageCount(int mxPage) throws SqlJetException {
        enter();
        try {
            pBt.pPager.setMaxPageCount(mxPage);
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getReserve()
     */
    public int getReserve() throws SqlJetException {
        enter();
        try {
            return pBt.pageSize - pBt.usableSize;
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#setAutoVacuum(org.tmatesoft.sqljet
     * .core.SqlJetAutoVacuumMode)
     */
    public void setAutoVacuum(SqlJetAutoVacuumMode autoVacuum) throws SqlJetException {
        boolean av = autoVacuum != SqlJetAutoVacuumMode.NONE;
        enter();
        try {
            if (pBt.pageSizeFixed && av != pBt.autoVacuum) {
                throw new SqlJetException(SqlJetErrorCode.READONLY);
            } else {
                pBt.autoVacuum = av;
            }
        } finally {
            leave();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getAutoVacuum()
     */
    public SqlJetAutoVacuumMode getAutoVacuum() throws SqlJetException {
        enter();
        try {
            return !pBt.autoVacuum ? SqlJetAutoVacuumMode.NONE : !pBt.incrVacuum ? SqlJetAutoVacuumMode.FULL
                    : SqlJetAutoVacuumMode.INCR;
        } finally {
            leave();
        }
    }

    /**
     * Get a reference to pPage1 of the database file. This will also acquire a
     * readlock on that file.
     * 
     * SQLITE_OK is returned on success. If the file is not a well-formed
     * database file, then SQLITE_CORRUPT is returned. SQLITE_BUSY is returned
     * if the database is locked. SQLITE_NOMEM is returned if we run out of
     * memory.
     */
    private void lockBtree() throws SqlJetException {

        SqlJetException rc = null;
        SqlJetMemPage pPage1;
        int nPage;

        assertion(pBt.mutex.held());

        if (pBt.pPage1 != null)
            return;

        pPage1 = pBt.getPage(1, false);

        try {
            /*
             * Do some checking to help insure the file we opened really is a
             * valid database file.
             */
            nPage = pBt.pPager.getPageCount();
            if (nPage > 0) {

                int pageSize;
                int usableSize;
                byte[] page1 = pPage1.aData.array();
                rc = new SqlJetException(SqlJetErrorCode.NOTADB);
                if (SqlJetUtility.memcmp(page1, zMagicHeader, 16) != 0) {
                    throw rc;
                }
                if (page1[18] > 1) {
                    pBt.readOnly = true;
                }
                if (page1[19] > 1) {
                    throw rc;
                }

                /*
                 * The maximum embedded fraction must be exactly 25%. And the
                 * minimum embedded fraction must be 12.5% for both leaf-data
                 * and non-leaf-data. The original design allowed these amounts
                 * to vary, but as of version 3.6.0, we require them to be
                 * fixed.
                 */
                if (SqlJetUtility.memcmp(page1, 21, new byte[] { (byte) 0100, (byte) 040, (byte) 040 }, 0, 3) != 0) {
                    throw rc;
                }

                pageSize = SqlJetUtility.get2byte(page1, 16);
                if (((pageSize - 1) & pageSize) != 0
                        || pageSize < ISqlJetLimits.SQLJET_MIN_PAGE_SIZE
                        || (ISqlJetLimits.SQLJET_MAX_PAGE_SIZE < 32768 && pageSize > ISqlJetLimits.SQLJET_MAX_PAGE_SIZE)) {
                    throw rc;
                }
                assertion((pageSize & 7) == 0);
                usableSize = pageSize - page1[20];
                if (pageSize != pBt.pageSize) {
                    /*
                     * After reading the first page of the database assuming a
                     * page size of BtShared.pageSize, we have discovered that
                     * the page-size is actually pageSize. Unlock the database,
                     * leave pBt->pPage1 at zero and return SQLITE_OK. The
                     * caller will call this function again with the correct
                     * page-size.
                     */
                    SqlJetMemPage.releasePage(pPage1);
                    pBt.usableSize = usableSize;
                    pBt.pageSize = pageSize;
                    freeTempSpace(pBt);
                    pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);
                    return;
                }
                if (usableSize < 500) {
                    throw rc;
                }
                pBt.pageSize = pageSize;
                pBt.usableSize = usableSize;
                pBt.autoVacuum = (SqlJetUtility.get4byte(page1, 36 + 4 * 4) > 0);
                pBt.incrVacuum = (SqlJetUtility.get4byte(page1, 36 + 7 * 4) > 0);
            }

            /*
             * maxLocal is the maximum amount of payload to store locally for a
             * cell. Make sure it is small enough so that at least minFanout
             * cells can will fit on one page. We assume a 10-byte page header.
             * Besides the payload, the cell must store: 2-byte pointer to the
             * cell 4-byte child pointer 9-byte nKey value 4-byte nData value
             * 4-byte overflow page pointer So a cell consists of a 2-byte
             * poiner, a header which is as much as 17 bytes long, 0 to N bytes
             * of payload, and an optional 4 byte overflow page pointer.
             */
            pBt.maxLocal = (pBt.usableSize - 12) * 64 / 255 - 23;
            pBt.minLocal = (pBt.usableSize - 12) * 32 / 255 - 23;
            pBt.maxLeaf = pBt.usableSize - 35;
            pBt.minLeaf = (pBt.usableSize - 12) * 32 / 255 - 23;
            assertion(pBt.maxLeaf + 23 <= pBt.MX_CELL_SIZE());
            pBt.pPage1 = pPage1;
            return;

        } catch (SqlJetException e) {
            // page1_init_failed:
            SqlJetMemPage.releasePage(pPage1);
            pBt.pPage1 = null;
            throw e;
        }
    }

    /**
     * @param bt
     */
    private void freeTempSpace(SqlJetBtreeShared bt) {
        bt.pTmpSpace = null;
    }

    /**
     * Set up a raw page so that it looks like a database page holding no
     * entries.
     */
    private void zeroPage(SqlJetMemPage pPage, int flags) throws SqlJetException {
        byte[] data = pPage.aData.array();
        SqlJetBtreeShared pBt = pPage.pBt;
        byte hdr = pPage.hdrOffset;
        int first;

        assertion(pPage.pDbPage.getPageNumber() == pPage.pgno);
        assertion(pPage.pDbPage.getExtra() == pPage);
        assertion(pPage.pDbPage.getData() == data);
        assertion(pBt.mutex.held());

        data[hdr] = (byte) flags;
        first = hdr + 8 + 4 * ((flags & SqlJetMemPage.PTF_LEAF) == 0 ? 1 : 0);
        SqlJetUtility.memset(data, hdr + 1, (byte) 0, 4);
        data[hdr + 7] = 0;
        SqlJetUtility.put2byte(data, hdr + 5, pBt.usableSize);
        pPage.nFree = pBt.usableSize - first;
        pPage.decodeFlags(flags);
        pPage.hdrOffset = hdr;
        pPage.cellOffset = first;
        pPage.nOverflow = 0;
        assertion(pBt.pageSize >= 512 && pBt.pageSize <= 32768);
        pPage.maskPage = pBt.pageSize - 1;
        pPage.nCell = 0;
        pPage.isInit = true;

    }

    /*
     * Create a new database by initializing the first page of the file.
     */
    private void newDatabase() throws SqlJetException {
        SqlJetMemPage pP1;
        byte[] data;
        SqlJetException rc;
        int nPage;

        assertion(pBt.mutex.held());
        nPage = pBt.pPager.getPageCount();
        if (nPage > 0) {
            return;
        }
        pP1 = pBt.pPage1;
        assertion(pP1 != null);
        data = pP1.aData.array();
        pP1.pDbPage.write();
        SqlJetUtility.memcpy(data, zMagicHeader, zMagicHeader.length);
        assertion(zMagicHeader.length == 16);
        SqlJetUtility.put2byte(data, 16, pBt.pageSize);
        data[18] = 1;
        data[19] = 1;
        assertion(pBt.usableSize <= pBt.pageSize && pBt.usableSize + 255 >= pBt.pageSize);
        data[20] = (byte) (pBt.pageSize - pBt.usableSize);
        data[21] = 64;
        data[22] = 32;
        data[23] = 32;
        SqlJetUtility.memset(data, 24, (byte) 0, 100 - 24);
        zeroPage(pP1, SqlJetMemPage.PTF_INTKEY | SqlJetMemPage.PTF_LEAF | SqlJetMemPage.PTF_LEAFDATA);
        pBt.pageSizeFixed = true;
        assertion(pBt.autoVacuum || !pBt.autoVacuum);
        assertion(pBt.incrVacuum || !pBt.incrVacuum);
        SqlJetUtility.put4byte(data, 36 + 4 * 4, pBt.autoVacuum ? 1 : 0);
        SqlJetUtility.put4byte(data, 36 + 7 * 4, pBt.incrVacuum ? 1 : 0);
        return;
    }

    /**
     * If there are no outstanding cursors and we are not in the middle of a
     * transaction but there is a read lock on the database, then this routine
     * unrefs the first page of the database file which has the effect of
     * releasing the read lock.
     * 
     * If there are any outstanding cursors, this routine is a no-op.
     * 
     * If there is a transaction in progress, this routine is a no-op.
     */
    private void unlockBtreeIfUnused() throws SqlJetException {
        assertion(pBt.mutex.held());
        if (pBt.inTransaction == TransMode.NONE && pBt.pCursor == null && pBt.pPage1 != null) {
            if (pBt.pPager.getRefCount() >= 1) {
                assertion(pBt.pPage1.aData);
                SqlJetMemPage.releasePage(pBt.pPage1);
            }
            pBt.pPage1 = null;
            pBt.inStmt = false;
        }
    }

    /*
     * Invoke the busy handler for a btree.
     */
    private boolean invokeBusyHandler(int number) throws SqlJetException {
        assertion(pBt.db != null);
        assertion(pBt.db.getMutex().held());
        return pBt.db.getBusyHaldler().call(number);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#beginTrans(org.tmatesoft.sqljet
     * .core.SqlJetTransactionMode)
     */
    public void beginTrans(SqlJetTransactionMode mode) throws SqlJetException {

        SqlJetException rc = null;

        enter();

        try {

            pBt.db = db;
            integrity();

            /*
             * If the btree is already in a write-transaction, or it is already
             * in a read-transaction and a read-transaction is requested, this
             * is a no-op.
             */
            if (inTrans == TransMode.WRITE || (inTrans == TransMode.READ && mode == SqlJetTransactionMode.READ_ONLY)) {
                return;
            }

            /* Write transactions are not possible on a read-only database */
            if (pBt.readOnly && mode != SqlJetTransactionMode.READ_ONLY) {
                throw new SqlJetException(SqlJetErrorCode.READONLY);
            }

            /*
             * If another database handle has already opened a write transaction
             * on this shared-btree structure and a second write transaction is
             * requested, return SQLITE_BUSY.
             */
            if (pBt.inTransaction == TransMode.WRITE && mode != SqlJetTransactionMode.READ_ONLY) {
                throw new SqlJetException(SqlJetErrorCode.BUSY);
            }

            if (mode == SqlJetTransactionMode.EXCLUSIVE) {
                SqlJetBtreeLock pIter;
                for (pIter = pBt.pLock; pIter != null; pIter = pIter.pNext) {
                    if (pIter.pBtree != this) {
                        throw new SqlJetException(SqlJetErrorCode.BUSY);
                    }
                }
            }

            int nBusy = 0;
            do {
                try {

                    if (pBt.pPage1 == null) {
                        do {
                            lockBtree();
                        } while (pBt.pPage1 == null);
                    }

                    if (mode != SqlJetTransactionMode.READ_ONLY) {
                        if (pBt.readOnly) {
                            throw new SqlJetException(SqlJetErrorCode.READONLY);
                        } else {
                            pBt.pPager.begin(mode == SqlJetTransactionMode.EXCLUSIVE);
                            newDatabase();
                        }
                    }

                    if (mode != SqlJetTransactionMode.READ_ONLY)
                        pBt.inStmt = false;

                } catch (SqlJetException e) {
                    rc = e;
                    unlockBtreeIfUnused();
                }

            } while (rc != null && rc.getErrorCode() == SqlJetErrorCode.BUSY && pBt.inTransaction == TransMode.NONE
                    && invokeBusyHandler(nBusy) && (nBusy++) > -1);

            if (rc == null) {
                if (inTrans == TransMode.NONE) {
                    pBt.nTransaction++;
                }
                inTrans = (mode != SqlJetTransactionMode.READ_ONLY ? TransMode.WRITE : TransMode.READ);
                if (inTrans.compareTo(pBt.inTransaction) > 0) {
                    pBt.inTransaction = inTrans;
                }
                if (mode == SqlJetTransactionMode.EXCLUSIVE) {
                    assertion(pBt.pExclusive == null);
                    pBt.pExclusive = this;
                }
            }

        } catch (SqlJetException e) {
            rc = e;
        } finally {
            // trans_begun:

            if (rc == null && mode != SqlJetTransactionMode.READ_ONLY) {
                /*
                 * This call makes sure that the pager has the correct number of
                 * open savepoints. If the second parameter is greater than 0
                 * and the sub-journal is not already open, then it will be
                 * opened here.
                 */
                try {
                    pBt.pPager.openSavepoint(db.getSavepointNum());
                } catch (SqlJetException e) {
                    rc = e;
                }
            }

            integrity();
            leave();
            if (rc != null)
                throw rc;
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#commitPhaseOne(java.lang.String)
     */
    public void commitPhaseOne(String master) throws SqlJetException {
        if( this.inTrans== TransMode.WRITE ){
          enter();
          try {
              pBt.db = this.db;
              if( pBt.autoVacuum ){
                  pBt.autoVacuumCommit();
              }
              pBt.pPager.commitPhaseOne(master, false);
          } finally {
              leave();
          }
        }
    }    

    /**
     * @param page
     */
    protected void pageReinit(ISqlJetPage page) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#beginStmt()
     */
    public void beginStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#clearTable(int, int[])
     */
    public void clearTable(int table, int[] change) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commit()
     */
    public void commit() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commitPhaseTwo()
     */
    public void commitPhaseTwo() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commitStmt()
     */
    public void commitStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#copyFile(org.tmatesoft.sqljet.
     * core.ISqlJetBtree)
     */
    public void copyFile(ISqlJetBtree from) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#createTable(java.util.EnumSet)
     */
    public int createTable(EnumSet<SqlJetBtreeTableCreateFlags> flags) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#dropTable(int)
     */
    public int dropTable(int table) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getCursor(int, boolean,
     * org.tmatesoft.sqljet.core.ISqlJetKeyInfo)
     */
    public ISqlJetBtreeCursor getCursor(int table, boolean wrFlag, ISqlJetKeyInfo keyInfo) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getDirname()
     */
    public File getDirname() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getFilename()
     */
    public File getFilename() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getJournalname()
     */
    public File getJournalname() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getMeta(int)
     */
    public int[] getMeta(int idx) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getPager()
     */
    public ISqlJetPager getPager() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getSchema()
     */
    public Object getSchema() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#incrVacuum()
     */
    public void incrVacuum() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#integrityCheck(int[], int,
     * int, int[])
     */
    public String integrityCheck(int[] root, int root2, int mxErr, int[] err) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInReadTrans()
     */
    public void isInReadTrans() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInStmt()
     */
    public void isInStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInTrans()
     */
    public void isInTrans() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isSchemaLocked()
     */
    public boolean isSchemaLocked() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#lockTable(int, boolean)
     */
    public void lockTable(int table, boolean isWriteLock) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#rollback()
     */
    public void rollback() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#rollbackStmt()
     */
    public void rollbackStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#savepoint(org.tmatesoft.sqljet
     * .core.SqlJetSavepointOperation, int)
     */
    public void savepoint(SqlJetSavepointOperation op, int savepoint) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setSchema(java.lang.Object)
     */
    public void setSchema(Object schema) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#tripAllCursors(org.tmatesoft.sqljet
     * .core.SqlJetErrorCode)
     */
    public void tripAllCursors(SqlJetErrorCode errCode) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#updateMeta(int, int[])
     */
    public void updateMeta(int idx, int[] value) throws SqlJetException {
        // TODO Auto-generated method stub

    }

}
