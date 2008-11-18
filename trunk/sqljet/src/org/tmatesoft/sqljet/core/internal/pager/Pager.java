/**
 * Pager.java
 * Copyright (C) 2008 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.internal.pager;

import java.io.File;

import org.tmatesoft.sqljet.core.IPage;
import org.tmatesoft.sqljet.core.IPageDestructor;
import org.tmatesoft.sqljet.core.IPager;
import org.tmatesoft.sqljet.core.ISqlJetLimits;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class Pager implements IPager, ISqlJetLimits, IPageDestructor {

    /*
     * The page cache as a whole is always in one of the following states:
     * 
     * PAGER_UNLOCK The page cache is not currently reading or writing the
     * database file. There is no data held in memory. This is the initial
     * state.
     * 
     * PAGER_SHARED The page cache is reading the database. Writing is not
     * permitted. There can be multiple readers accessing the same database file
     * at the same time.
     * 
     * PAGER_RESERVED This process has reserved the database for writing but has
     * not yet made any changes. Only one process at a time can reserve the
     * database. The original database file has not been modified so other
     * processes may still be reading the on-disk database file.
     * 
     * PAGER_EXCLUSIVE The page cache is writing the database. Access is
     * exclusive. No other processes or threads can be reading or writing while
     * one process is writing.
     * 
     * PAGER_SYNCED The pager moves to this state from PAGER_EXCLUSIVE after all
     * dirty pages have been written to the database file and the file has been
     * synced to disk. All that remains to do is to remove or truncate the
     * journal file and the transaction will be committed.
     * 
     * The page cache comes up in PAGER_UNLOCK. The first time a
     * sqlite3PagerGet() occurs, the state transitions to PAGER_SHARED. After
     * all pages have been released using sqlite_page_unref(), the state
     * transitions back to PAGER_UNLOCK. The first time that sqlite3PagerWrite()
     * is called, the state transitions to PAGER_RESERVED. (Note that
     * sqlite3PagerWrite() can only be called on an outstanding page which means
     * that the pager must be in PAGER_SHARED before it transitions to
     * PAGER_RESERVED.) PAGER_RESERVED means that there is an open rollback
     * journal. The transition to PAGER_EXCLUSIVE occurs before any changes are
     * made to the database file, though writes to the rollback journal occurs
     * with just PAGER_RESERVED. After an sqlite3PagerRollback() or
     * sqlite3PagerCommitPhaseTwo(), the state can go back to PAGER_SHARED, or
     * it can stay at PAGER_EXCLUSIVE if we are in exclusive access mode.
     */

    public static final int PAGER_UNLOCK = 0;
    public static final int PAGER_SHARED = 1; /* same as SHARED_LOCK */
    public static final int PAGER_RESERVED = 2; /* same as RESERVED_LOCK */
    public static final int PAGER_EXCLUSIVE = 4; /* same as EXCLUSIVE_LOCK */
    public static final int PAGER_SYNCED = 5;

    /*
     * If the SQLITE_BUSY_RESERVED_LOCK macro is set to true at compile-time,
     * then failed attempts to get a reserved lock will invoke the busy
     * callback. This is off by default. To see why, consider the following
     * scenario:
     * 
     * Suppose thread A already has a shared lock and wants a reserved lock.
     * Thread B already has a reserved lock and wants an exclusive lock. If both
     * threads are using their busy callbacks, it might be a long time be for
     * one of the threads give up and allows the other to proceed. But if the
     * thread trying to get the reserved lock gives up quickly (if it never
     * invokes its busy callback) then the contention will be resolved quickly.
     */

    public static final int SQLITE_BUSY_RESERVED_LOCK = 0;

    /*
     * Journal files begin with the following magic string. The data was
     * obtained from /dev/random. It is used only as a sanity check.
     * 
     * Since version 2.8.0, the journal format contains additional sanity
     * checking information. If the power fails while the journal is begin
     * written, semi-random garbage data might appear in the journal file after
     * power is restored. If an attempt is then made to roll the journal back,
     * the database could be corrupted. The additional sanity checking data is
     * an attempt to discover the garbage in the journal and ignore it.
     * 
     * The sanity checking information for the new journal format consists of a
     * 32-bit checksum on each page of data. The checksum covers both the page
     * number and the pPager->pageSize bytes of data for the page. This cksum is
     * initialized to a 32-bit random value that appears in the journal file
     * right after the header. The random initializer is important, because
     * garbage data that appears at the end of a journal is likely data that was
     * once in other files that have now been deleted. If the garbage data came
     * from an obsolete journal file, the checksums might be correct. But by
     * initializing the checksum to random value which is different for every
     * journal, we minimize that risk.
     */
    static final byte[] aJournalMagic = { (byte) 0xd9, (byte) 0xd5, (byte) 0x05, (byte) 0xf9, (byte) 0x20, (byte) 0xa1,
            (byte) 0x63, (byte) 0xd7 };

    /*
     * The maximum legal page number is (2^31 - 1).
     */
    public static final int PAGER_MAX_PGNO = 2147483647;

    boolean journalOpen; /* True if journal file descriptors is valid */
    boolean journalStarted; /* True if header of journal is synced */
    boolean useJournal; /* Use a rollback journal on this file */
    boolean noReadlock; /* Do not bother to obtain readlocks */
    boolean stmtOpen; /* True if the statement subjournal is open */
    boolean stmtInUse; /* True we are in a statement subtransaction */
    boolean stmtAutoopen; /* Open stmt journal when main journal is opened */
    boolean noSync; /* Do not sync the journal if true */
    boolean fullSync; /* Do extra syncs of the journal for robustness */
    boolean sync_flags; /* One of SYNC_NORMAL or SYNC_FULL */
    int state; /* PAGER_UNLOCK, _SHARED, _RESERVED, etc. */
    boolean tempFile; /* zFilename is a temporary file */
    boolean readOnly; /* True for a read-only database */
    boolean needSync; /* True if an fsync() is needed on the journal */
    boolean dirtyCache; /* True if cached pages have changed */
    boolean alwaysRollback; /* Disable DontRollback() for all pages */
    boolean memDb; /* True to inhibit all file I/O */
    boolean setMaster; /* True if a m-j name has been written to jrnl */
    boolean doNotSync; /* Boolean. While true, do not spill the cache */
    boolean exclusiveMode; /* Boolean. True if locking_mode==EXCLUSIVE */
    boolean journalMode; /* On of the PAGER_JOURNALMODE_ values */
    boolean dbModified; /* True if there are any changes to the Db */
    boolean changeCountDone; /* Set after incrementing the change-counter */
    boolean vfsFlags; /* Flags for sqlite3_vfs.xOpen() */

    int errCode; /* One of several kinds of errors */
    int dbSize; /* Number of pages in the file */
    int origDbSize; /* dbSize before the current change */
    int stmtSize; /* Size of database (in pages) at stmt_begin() */
    int nRec; /* Number of pages written to the journal */
    int cksumInit; /* Quasi-random value added to every checksum */
    int stmtNRec; /* Number of records in stmt subjournal */
    int nExtra; /* Add this many bytes to each in-memory page */
    int pageSize; /* Number of bytes in a page */
    int nPage; /* Total number of in-memory pages */
    int mxPage; /* Maximum number of pages to hold in cache */
    int mxPgno; /* Maximum allowed size of the database */
    Bitvec pInJournal; /* One bit for each page in the database file */
    Bitvec pInStmt; /* One bit for each page in the database */
    Bitvec pAlwaysRollback; /* One bit for each page marked always-rollback */
    String zFilename; /* Name of the database file */
    String zJournal; /* Name of the journal file */
    String zDirectory; /* Directory hold database and journal files */
    File fd, jfd; /* File descriptors for database and journal */
    File stfd; /* File descriptor for the statement subjournal */
    BusyHandler pBusyHandler; /* Pointer to sqlite.busyHandler */
    long journalOff; /* Current byte offset in the journal file */
    long journalHdr; /* Byte offset to previous journal header */
    long stmtHdrOff; /* First journal header written this statement */
    long stmtCksum; /* cksumInit when statement was started */
    long stmtJSize; /* Size of journal at stmt_begin() */
    int sectorSize; /* Assumed sector size during rollback */
    IPageDestructor xReiniter; /* Call this routine when reloading pages */
    byte[] pTmpSpace; /* Pager.pageSize bytes of space for tmp use */
    byte[] dbFileVers = new byte[16]; /* Changes whenever database file changes */
    long journalSizeLimit; /* Size limit for persistent journal files */
    PCache pPCache; /* Pointer to page cache object */

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.IPager#open(java.lang.String,
     * org.tmatesoft.sqljet.core.IPageDestructor, int, int)
     */
    public void open(String fileName, IPageDestructor xDesc, int extra, int flags) {

        nExtra = extra;
        pageSize = SQLJET_DEFAULT_PAGE_SIZE;
        pTmpSpace = new byte[SQLJET_DEFAULT_PAGE_SIZE];

        tempFile = null == fileName || "".equals(fileName);
        memDb = !this.tempFile && ":memory:".equals(fileName);
        useJournal = !memDb && (flags & PAGER_OMIT_JOURNAL) == 0;
        noReadlock = readOnly && (flags & PAGER_NO_READLOCK) != 0;

        /*
         * If a temporary file is requested, it is not opened immediately. In
         * this case we accept the default page size and delay actually opening
         * the file until the first call to OsWrite().
         */
        if (tempFile) {
            state = PAGER_EXCLUSIVE;
        } else if (!memDb) {
            fd = new File(fileName);
            zFilename = fd.getAbsolutePath();
            zDirectory = fd.getParent();
            zJournal = zFilename + "-journal";
        }

        // PAGERTRACE3("OPEN %d %s\n", FILEHANDLEID(pPager->fd),
        // pPager->zFilename);
        // IOTRACE(("OPEN %p %s\n", pPager, pPager->zFilename))

        dbSize = memDb ? 0 : -1;
        mxPage = 100;
        mxPgno = SQLJET_MAX_PAGE_COUNT;
        assert (state == (tempFile ? PAGER_EXCLUSIVE : PAGER_UNLOCK));
        exclusiveMode = tempFile;
        noSync = tempFile || !useJournal;
        fullSync = !noSync;
        // sync_flags = SQLITE_SYNC_NORMAL;
        journalSizeLimit = SQLITE_DEFAULT_JOURNAL_SIZE_LIMIT;
        if (!memDb)
            sectorSize = 512;

        // sqlite3PcacheOpen(szPageDflt, nExtra, !memDb, xDesc,
        // !memDb?pagerStress:0, (void *)pPager, pPager->pPCache);
        pPCache = new PCache(pageSize, nExtra, !memDb, xDesc, !memDb ? this : null);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.IPageDestructor#pageDestructor(org.tmatesoft
     * .sqljet.core.IPage)
     */
    public void pageDestructor(IPage page) {
        /*
        ** This function is called by the pcache layer when it has reached some
        ** soft memory limit. The argument is a pointer to a purgeable Pager 
        ** object. This function attempts to make a single dirty page that has no
        ** outstanding references (if one exists) clean so that it can be recycled 
        ** by the pcache layer.
        */
//        static int pagerStress(void *p, PgHdr *pPg){
//          Pager *pPager = (Pager *)p;
//          int rc = SQLITE_OK;
//
//          if( pPager->doNotSync ){
//            return SQLITE_OK;
//          }
//
//          assert( pPg->flags&PGHDR_DIRTY );
//          if( pPager->errCode==SQLITE_OK ){
//            if( pPg->flags&PGHDR_NEED_SYNC ){
//              rc = syncJournal(pPager);
//              if( rc==SQLITE_OK && pPager->fullSync && 
//                !(sqlite3OsDeviceCharacteristics(pPager->fd)&SQLITE_IOCAP_SAFE_APPEND)
//              ){
//                pPager->nRec = 0;
//                rc = writeJournalHdr(pPager);
//              }
//            }
//            if( rc==SQLITE_OK ){
//              pPg->pDirty = 0;
//              rc = pager_write_pagelist(pPg);
//            }
//            if( rc!=SQLITE_OK ){
//              pager_error(pPager, rc);
//            }
//          }
//
//          if( rc==SQLITE_OK ){
//            sqlite3PcacheMakeClean(pPg);
//          }
//          return rc;
//        }
        
    }
}
