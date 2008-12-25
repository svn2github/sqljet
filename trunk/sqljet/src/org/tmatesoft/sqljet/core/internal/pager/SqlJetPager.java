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

import static org.tmatesoft.sqljet.core.SqlJetException.assertion;

import java.io.File;
import java.util.BitSet;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageDestructor;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetPagerFlags;
import org.tmatesoft.sqljet.core.SqlJetPagerJournalMode;
import org.tmatesoft.sqljet.core.SqlJetPagerLockingMode;
import org.tmatesoft.sqljet.core.SqlJetPagerSafetyLevel;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFile;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFileSystem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetPager implements ISqlJetPager, ISqlJetLimits, ISqlJetPageDestructor {

    /**
     * The minimum sector size is 512
     */
    private static final int SQLJET_MIN_SECTOR_SIZE = 512;

    final static String JOURNAL = "-journal";

    /*
     * If the SQLJET_BUSY_RESERVED_LOCK poperty is set to true at compile-time,
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

    public static int SQLJET_BUSY_RESERVED_LOCK = 0;

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

    ISqlJetFileSystem fileSystem;
    SqlJetFileType type;
    EnumSet<SqlJetFileOpenPermission> permissions;

    SqlJetPagerState state = SqlJetPagerState.UNLOCK;
    SqlJetPagerJournalMode journalMode = SqlJetPagerJournalMode.DELETE;
    SqlJetPagerLockingMode lockingMode = SqlJetPagerLockingMode.NORMAL;

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
    boolean tempFile; /* fileName is a temporary file */
    boolean readOnly; /* True for a read-only database */
    boolean needSync; /* True if an fsync() is needed on the journal */
    boolean dirtyCache; /* True if cached pages have changed */
    boolean alwaysRollback; /* Disable DontRollback() for all pages */
    boolean memDb; /* True to inhibit all file I/O */
    boolean setMaster; /* True if a m-j name has been written to jrnl */
    boolean doNotSync; /* Boolean. While true, do not spill the cache */
    boolean dbModified; /* True if there are any changes to the Db */
    boolean changeCountDone; /* Set after incrementing the change-counter */

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
    BitSet pInJournal; /* One bit for each page in the database file */
    BitSet pInStmt; /* One bit for each page in the database */
    BitSet pAlwaysRollback; /* One bit for each page marked always-rollback */
    File fileName; /* Name of the database file */
    File journal; /* Name of the journal file */
    File directory; /* Directory hold database and journal files */
    ISqlJetFile fd, jfd; /* File descriptors for database and journal */
    ISqlJetFile stfd; /* File descriptor for the statement subjournal */
    SqlJetBusyHandler pBusyHandler; /* Pointer to sqlite.busyHandler */
    long journalOff; /* Current byte offset in the journal file */
    long journalHdr; /* Byte offset to previous journal header */
    long stmtHdrOff; /* First journal header written this statement */
    long stmtCksum; /* cksumInit when statement was started */
    long stmtJSize; /* Size of journal at stmt_begin() */
    int sectorSize; /* Assumed sector size during rollback */
    ISqlJetPageDestructor xReiniter; /* Call this routine when reloading pages */
    byte[] tmpSpace; /* Pager.pageSize bytes of space for tmp use */
    byte[] dbFileVers = new byte[16]; /* Changes whenever database file changes */
    long journalSizeLimit; /* Size limit for persistent journal files */
    SqlJetPageCache pPCache; /* Pointer to page cache object */

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#open(org.tmatesoft.sqljet.core
     * .ISqlJetFileSystem, java.lang.String,
     * org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet,
     * org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)
     */
    public void open(final ISqlJetFileSystem fileSystem, final File fileName, final ISqlJetPageDestructor xDesc,
            final int nExtra, final EnumSet<SqlJetPagerFlags> flags, final SqlJetFileType type,
            final EnumSet<SqlJetFileOpenPermission> permissions) throws SqlJetException {

        this.fileSystem = fileSystem;
        this.type = type;
        this.permissions = permissions;

        this.tempFile = false;
        this.memDb = false;
        this.readOnly = false;
        int szPageDflt = SQLJET_DEFAULT_PAGE_SIZE;

        this.fileName = null;
        if (null != fileName) {
            if (MEMORY_DB.equals(fileName.getPath())) {
                this.memDb = true;
                this.useJournal = false;
            } else {
                this.fileName = fileName;
            }
        }
        ;

        /* Open the pager file */
        if (null != this.fileName && !this.memDb) {

            this.directory = this.fileName.getParentFile();
            this.journal = new File(this.directory, this.fileName.getName() + JOURNAL);

            this.fd = this.fileSystem.open(this.fileName, this.type, this.permissions);
            this.readOnly = this.fd.getPermissions().contains(SqlJetFileOpenPermission.READONLY);

            /*
             * If the file was successfully opened for read/write access, choose
             * a default page size in case we have to create the database file.
             * The default page size is the maximum of:
             * 
             * + SQLITE_DEFAULT_PAGE_SIZE, + The value returned by
             * sqlite3OsSectorSize() + The largest page size that can be written
             * atomically.
             */
            if (!this.readOnly) {

                int iSectorSize = this.fd.sectorSize();
                if (szPageDflt < iSectorSize) {
                    szPageDflt = iSectorSize;
                }

                final EnumSet<SqlJetDeviceCharacteristics> dcs = this.fd.deviceCharacteristics();
                if (null != dcs) {
                    for (final SqlJetDeviceCharacteristics dc : dcs) {
                        if (dc.getIoCapAtomicSize() > 0)
                            szPageDflt = dc.getIoCapAtomicSize();
                    }
                }

                if (szPageDflt > SQLJET_MAX_DEFAULT_PAGE_SIZE) {
                    szPageDflt = SQLJET_MAX_DEFAULT_PAGE_SIZE;
                }

            }

        } else if (!memDb) {
            /*
             * If a temporary file is requested, it is not opened immediately.
             * In this case we accept the default page size and delay actually
             * opening the file until the first call to OsWrite().
             */
            this.tempFile = true;
            this.state = SqlJetPagerState.EXCLUSIVE;
        }

        this.tmpSpace = new byte[szPageDflt];

        pPCache = new SqlJetPageCache(szPageDflt, nExtra, !memDb, xDesc, !memDb ? this : null);

        this.useJournal = null == flags || !flags.contains(SqlJetPagerFlags.OMIT_JOURNAL);
        this.noReadlock = null != flags && flags.contains(SqlJetPagerFlags.NO_READLOCK) && this.readOnly;

        this.dbSize = this.memDb ? 0 : -1;
        this.pageSize = szPageDflt;
        this.mxPage = 100;
        this.mxPgno = SQLJET_MAX_PAGE_COUNT;
        assertion(this.state == (this.tempFile ? SqlJetPagerState.EXCLUSIVE : SqlJetPagerState.UNLOCK));
        this.lockingMode = this.tempFile ? SqlJetPagerLockingMode.EXCLUSIVE : SqlJetPagerLockingMode.NORMAL;

        this.noSync = this.tempFile || !this.useJournal;
        this.fullSync = !this.noSync;
        // pPager->sync_flags = SQLITE_SYNC_NORMAL;

        this.nExtra = nExtra;
        this.journalSizeLimit = SQLJET_DEFAULT_JOURNAL_SIZE_LIMIT;

        assertion(null != this.fd || this.memDb || this.tempFile);
        if (!this.memDb) {
            setSectorSize();
        }

    }

    /**
     * Set the sectorSize for the pager.
     * 
     * The sector size is at least as big as the sector size reported by
     * {@link SqlJetFile#sectorSize()}.
     */
    private void setSectorSize() throws SqlJetException {
        assertion(null != this.fd || this.tempFile);
        if ( !this.tempFile && null != this.fd ) {
            /* Sector size doesn't matter for temporary files. */
            this.sectorSize = this.fd.sectorSize();
        }
        if (this.sectorSize < SQLJET_MIN_SECTOR_SIZE) {
            this.sectorSize = SQLJET_MIN_SECTOR_SIZE;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageDestructor#pageDestructor(org.tmatesoft
     * .sqljet.core.ISqlJetPage)
     */
    public void pageDestructor(final ISqlJetPage page) {
        /*
         * This function is called by the pcache layer when it has reached some
         * soft memory limit. The argument is a pointer to a purgeable Pager
         * object. This function attempts to make a single dirty page that has
         * no outstanding references (if one exists) clean so that it can be
         * recycled by the pcache layer.
         */
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#acquire(int, boolean)
     */
    public ISqlJetPage acquirePage(int pageNumber, boolean read) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#begin(boolean)
     */
    public void begin(boolean exclusive) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#close()
     */
    public void close() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseOne(java.lang.String, int, boolean)
     */
    public void commitPhaseOne(String master, int pageNumberTrunc, boolean noSync) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseTwo()
     */
    public void commitPhaseTwo() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#get(int)
     */
    public ISqlJetPage getPage(int pageNumber) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getDirectoryName()
     */
    public File getDirectoryName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFile()
     */
    public SqlJetFile getFile() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFileName()
     */
    public File getFileName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFileSystem()
     */
    public SqlJetFileSystem getFileSystem() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalMode()
     */
    public SqlJetPagerJournalMode getJournalMode() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalName()
     */
    public File getJournalName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalSizeLimit()
     */
    public long getJournalSizeLimit() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getLockingMode()
     */
    public SqlJetPagerLockingMode getLockingMode() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getPageCount()
     */
    public int getPageCount() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getTempSpace()
     */
    public byte[] getTempSpace() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#isNoSync()
     */
    public boolean isNoSync() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#isReadOnly()
     */
    public boolean isReadOnly() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#lookup(int)
     */
    public ISqlJetPage lookupPage(int pageNumber) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#readFileHeader(int, byte[])
     */
    public void readFileHeader(int count, byte[] buffer) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#refCount()
     */
    public int refCount() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#rollback()
     */
    public void rollback() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setBusyhandler(org.tmatesoft.sqljet.core.ISqlJetBusyHandler)
     */
    public void setBusyhandler(ISqlJetBusyHandler busyHandler) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setCacheSize(int)
     */
    public void setCacheSize(int cacheSize) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setJournalMode(org.tmatesoft.sqljet.core.SqlJetPagerJournalMode)
     */
    public void setJournalMode(SqlJetPagerJournalMode journalMode) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setJournalSizeLimit(long)
     */
    public void setJournalSizeLimit(long limit) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setLockingMode(org.tmatesoft.sqljet.core.SqlJetPagerLockingMode)
     */
    public void setLockingMode(SqlJetPagerLockingMode lockingMode) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setMaxPageCount(int)
     */
    public int setMaxPageCount(int maxPageCount) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setPagesize(int)
     */
    public int setPageSize(int pageSize) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setReiniter(org.tmatesoft.sqljet.core.ISqlJetPageDestructor)
     */
    public void setReiniter(ISqlJetPageDestructor reinitier) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtBegin()
     */
    public void stmtBegin() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtCommit()
     */
    public void stmtCommit() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtRollback()
     */
    public void stmtRollback() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#sync()
     */
    public void sync() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#truncate(int)
     */
    public void truncate(int pagesNumber) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getSafetyLevel()
     */
    public SqlJetPagerSafetyLevel getSafetyLevel() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setSafetyLevel(org.tmatesoft.sqljet.core.SqlJetPagerSafetyLevel)
     */
    public void setSafetyLevel(SqlJetPagerSafetyLevel safetyLevel) {
        // TODO Auto-generated method stub
        
    }
}
