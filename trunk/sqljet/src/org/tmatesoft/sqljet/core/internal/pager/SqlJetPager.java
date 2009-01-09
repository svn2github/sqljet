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
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetIOErrorCode;
import org.tmatesoft.sqljet.core.SqlJetIOException;
import org.tmatesoft.sqljet.core.SqlJetLockType;
import org.tmatesoft.sqljet.core.SqlJetPagerFlags;
import org.tmatesoft.sqljet.core.SqlJetPagerJournalMode;
import org.tmatesoft.sqljet.core.SqlJetPagerLockingMode;
import org.tmatesoft.sqljet.core.SqlJetPagerSafetyLevel;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFile;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetPager implements ISqlJetPager, ISqlJetLimits, ISqlJetPageCallback {

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
    ISqlJetFile file, jfd; /* File descriptors for database and journal */
    ISqlJetFile stfd; /* File descriptor for the statement subjournal */
    long journalOff; /* Current byte offset in the journal file */
    long journalHdr; /* Byte offset to previous journal header */
    long stmtHdrOff; /* First journal header written this statement */
    long stmtCksum; /* cksumInit when statement was started */
    long stmtJSize; /* Size of journal at stmt_begin() */
    int sectorSize; /* Assumed sector size during rollback */
    byte[] tmpSpace; /* Pager.pageSize bytes of space for tmp use */
    byte[] dbFileVers = new byte[16]; /* Changes whenever database file changes */
    long journalSizeLimit; /* Size limit for persistent journal files */
    SqlJetPageCache pCache; /* Pointer to page cache object */

    private SqlJetPagerSafetyLevel safetyLevel;

    private ISqlJetPageCallback reiniter; /*
                                           * Call this routine when reloading
                                           * pages
                                           */
    private ISqlJetBusyHandler busyHandler;

    private SqlJetErrorCode errCode; /* One of several kinds of errors */

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#open(org.tmatesoft.sqljet.core
     * .ISqlJetFileSystem, java.lang.String,
     * org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet,
     * org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)
     */
    public void open(final ISqlJetFileSystem fileSystem, final File fileName, final ISqlJetPageCallback xDesc,
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

            this.file = this.fileSystem.open(this.fileName, this.type, this.permissions);
            this.readOnly = this.file.getPermissions().contains(SqlJetFileOpenPermission.READONLY);

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

                int iSectorSize = this.file.sectorSize();
                if (szPageDflt < iSectorSize) {
                    szPageDflt = iSectorSize;
                }

                final EnumSet<SqlJetDeviceCharacteristics> dcs = this.file.deviceCharacteristics();
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

        pCache = new SqlJetPageCache();
        pCache.open(szPageDflt, nExtra, !memDb, xDesc, !memDb ? this : null);

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

        assertion(null != this.file || this.memDb || this.tempFile);
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
        assertion(null != this.file || this.tempFile);
        if (!this.tempFile && null != this.file) {
            /* Sector size doesn't matter for temporary files. */
            this.sectorSize = this.file.sectorSize();
        }
        if (this.sectorSize < SQLJET_MIN_SECTOR_SIZE) {
            this.sectorSize = SQLJET_MIN_SECTOR_SIZE;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getDirectoryName()
     */
    public File getDirectoryName() {
        return directory;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFileName()
     */
    public File getFileName() {
        return fileName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFileSystem()
     */
    public ISqlJetFileSystem getFileSystem() {
        return fileSystem;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getFile()
     */
    public ISqlJetFile getFile() {
        return file;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalName()
     */
    public File getJournalName() {
        return journal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#isNoSync()
     */
    public boolean isNoSync() {
        return noSync;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#isReadOnly()
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getLockingMode()
     */
    public SqlJetPagerLockingMode getLockingMode() {
        return lockingMode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#setLockingMode(org.tmatesoft.sqljet
     * .core.SqlJetPagerLockingMode)
     */
    public void setLockingMode(final SqlJetPagerLockingMode lockingMode) throws SqlJetException {
        this.lockingMode = lockingMode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalMode()
     */
    public SqlJetPagerJournalMode getJournalMode() {
        return journalMode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#setJournalMode(org.tmatesoft.sqljet
     * .core.SqlJetPagerJournalMode)
     */
    public void setJournalMode(final SqlJetPagerJournalMode journalMode) throws SqlJetException {
        this.journalMode = journalMode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getJournalSizeLimit()
     */
    public long getJournalSizeLimit() {
        return journalSizeLimit;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setJournalSizeLimit(long)
     */
    public void setJournalSizeLimit(final long limit) throws SqlJetException {
        if (limit >= -1)
            journalSizeLimit = limit;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getSafetyLevel()
     */
    public SqlJetPagerSafetyLevel getSafetyLevel() {
        return safetyLevel;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#setSafetyLevel(org.tmatesoft.sqljet
     * .core.SqlJetPagerSafetyLevel)
     */
    public void setSafetyLevel(final SqlJetPagerSafetyLevel safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getTempSpace()
     */
    public byte[] getTempSpace() {
        return tmpSpace;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#setBusyhandler(org.tmatesoft.sqljet
     * .core.ISqlJetBusyHandler)
     */
    public void setBusyhandler(final ISqlJetBusyHandler busyHandler) throws SqlJetException {
        this.busyHandler = busyHandler;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#setReiniter(org.tmatesoft.sqljet
     * .core.ISqlJetPageDestructor)
     */
    public void setReiniter(final ISqlJetPageCallback reinitier) throws SqlJetException {
        this.reiniter = reinitier;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setPagesize(int)
     */
    public void setPageSize(final int pageSize) throws SqlJetException {
        checkErrorCode();
        assertion(pageSize >= SQLJET_MIN_PAGE_SIZE && pageSize <= SQLJET_MAX_PAGE_SIZE);
        if (pageSize != this.pageSize && (!this.memDb || this.dbSize == 0) && pCache.getRefCount() == 0) {
            reset();
            this.pageSize = pageSize;
            if (!this.memDb)
                setSectorSize();
            this.tmpSpace = new byte[pageSize];
            pCache.setPageSize(pageSize);
        }

    }

    /**
     * @throws SqlJetException
     */
    private void checkErrorCode() throws SqlJetException {
        if (null != errCode)
            throw new SqlJetException(errCode);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getPagesize()
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Clear the in-memory cache. This routine sets the state of the pager back
     * to what it was when it was first opened. Any outstanding pages are
     * invalidated and subsequent attempts to access those pages will likely
     * result in a coredump.
     * 
     * @throws SqlJetException
     */
    private void reset() {
        if (null != errCode)
            return;
        try {
            pCache.clear();
        } catch (final SqlJetException e) {
            // e.printStackTrace();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setMaxPageCount(int)
     */
    public void setMaxPageCount(int maxPageCount) throws SqlJetException {
        if (maxPageCount > 0) {
            this.mxPgno = maxPageCount;
        }
        getPageCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setMaxPageCount()
     */
    public int getMaxPageCount() {
        return mxPgno;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#setCacheSize(int)
     */
    public void setCacheSize(int cacheSize) throws SqlJetException {
        pCache.setCacheSize(cacheSize);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#readFileHeader(int, byte[])
     */
    public void readFileHeader(final int count, final byte[] buffer) throws SqlJetException {
        Arrays.fill(buffer, 0, count, (byte) 0);
        assertion(memDb || null != file || tempFile);
        if (null != file) {
            try {
                file.read(buffer, count, 0);
            } catch (final SqlJetIOException e) {
                if (SqlJetIOErrorCode.IOERR_SHORT_READ != e.getIoErrorCode())
                    throw e;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#getPageCount()
     */
    public int getPageCount() throws SqlJetException {
        checkErrorCode();

        int n = 0;

        if (dbSize >= 0) {
            n = dbSize;
        } else {
            assertion(null != file || tempFile);
            long l = 0;
            if (null != file) {
                try {
                    l = file.fileSize();
                } catch (SqlJetException e) {
                    error(e);
                    throw e;
                }
            }
            if (l > 0 && l < pageSize) {
                n = 1;
            } else {
                l /= pageSize;
                n = (new Long(l)).intValue();
            }
            if (SqlJetPagerState.UNLOCK != state) {
                dbSize = n;
            }
        }
        if (n == (ISqlJetFile.PENDING_BYTE / pageSize)) {
            n++;
        }
        if (n > mxPgno) {
            mxPgno = n;
        }
        return n;
    }

    /**
     * This function should be called when an error occurs within the pager
     * code. The first argument is a pointer to the pager structure, the second
     * the error-code about to be returned by a pager API function. The value
     * returned is a copy of the second argument to this function.
     * 
     * If the second argument is SQLITE_IOERR, SQLITE_CORRUPT, or SQLITE_FULL
     * the error becomes persistent. Until the persisten error is cleared,
     * subsequent API calls on this Pager will immediately return the same error
     * code.
     * 
     * A persistent error indicates that the contents of the pager-cache cannot
     * be trusted. This state can be cleared by completely discarding the
     * contents of the pager-cache. If a transaction was active when the
     * persistent error occured, then the rollback journal may need to be
     * replayed.
     * 
     * @param e
     */
    private void error(final SqlJetException e) {
        final SqlJetErrorCode c = e.getErrorCode();
        if (SqlJetErrorCode.FULL == c || SqlJetErrorCode.IOERR == c || SqlJetErrorCode.CORRUPT == c) {
            errCode = c;
            if (SqlJetPagerState.UNLOCK == state && pCache.getRefCount() == 0) {
                /*
                 * If the pager is already unlocked, call pager_unlock() now to
                 * clear the error state and ensure that the pager-cache is
                 * completely empty.
                 */
                unlock();
            }
        }
    }

    /**
     * Unlock the database file.
     * 
     * If the pager is currently in error state, discard the contents of the
     * cache and reset the Pager structure internal state. If there is an open
     * journal-file, then the next time a shared-lock is obtained on the pager
     * file (by this or any other process), it will be treated as a hot-journal
     * and rolled back.
     * 
     */
    private void unlock() {
        if (SqlJetPagerLockingMode.EXCLUSIVE != lockingMode) {
            if (!memDb) {

                errCode = null;
                try {
                    if (null != file)
                        file.unlock(SqlJetLockType.NONE);
                } catch (final SqlJetException e) {
                    errCode = e.getErrorCode();
                }

                dbSize = -1;

                /*
                 * Always close the journal file when dropping the database
                 * lock. Otherwise, another connection with journal_mode=delete
                 * might delete the file out from under us.
                 */
                if (journalOpen) {
                    if (null != jfd)
                        try {
                            jfd.close();
                        } catch (final SqlJetException e) {
                            // e.printStackTrace();
                        }
                    journalOpen = false;
                    if (null != pInJournal) {
                        pInJournal.clear();
                    } else {
                        pInJournal = new BitSet();
                    }
                    if (null != pAlwaysRollback) {
                        pAlwaysRollback.clear();
                    } else {
                        pAlwaysRollback = new BitSet();
                    }
                }

                /*
                 * If Pager.errCode is set, the contents of the pager cache
                 * cannot be trusted. Now that the pager file is unlocked, the
                 * contents of the cache can be discarded and the error code
                 * safely cleared.
                 */
                if (null != errCode) {
                    errCode = null;
                    reset();
                    if (stmtOpen) {
                        if (null != stfd)
                            try {
                                stfd.close();
                            } catch (final SqlJetException e) {
                                // e.printStackTrace();
                            }
                        pInStmt.clear();
                    }
                    stmtOpen = false;
                    stmtInUse = false;
                    journalOff = 0;
                    journalStarted = false;
                    stmtAutoopen = false;
                    origDbSize = 0;
                }
            }

            if (!memDb || null == errCode) {
                state = SqlJetPagerState.UNLOCK;
                changeCountDone = false;
            }
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageDestructor#pageDestructor(org.tmatesoft
     * .sqljet.core.ISqlJetPage)
     */
    public void pageCallback(final ISqlJetPage page) {
        /*
         * This function is called by the pcache layer when it has reached some
         * soft memory limit. The argument is a pointer to a purgeable Pager
         * object. This function attempts to make a single dirty page that has
         * no outstanding references (if one exists) clean so that it can be
         * recycled by the pcache layer.
         */
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#acquire(int, boolean)
     */
    public ISqlJetPage acquirePage(int pageNumber, boolean read) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#begin(boolean)
     */
    public void begin(boolean exclusive) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#close()
     */
    public void close() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseOne(java.lang.String,
     * int, boolean)
     */
    public void commitPhaseOne(String master, int pageNumberTrunc, boolean noSync) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseTwo()
     */
    public void commitPhaseTwo() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#get(int)
     */
    public ISqlJetPage getPage(int pageNumber) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#lookup(int)
     */
    public ISqlJetPage lookupPage(int pageNumber) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#refCount()
     */
    public int refCount() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#rollback()
     */
    public void rollback() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtBegin()
     */
    public void stmtBegin() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtCommit()
     */
    public void stmtCommit() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtRollback()
     */
    public void stmtRollback() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#sync()
     */
    public void sync() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#truncate(int)
     */
    public void truncate(int pagesNumber) throws SqlJetException {
        // TODO Auto-generated method stub

    }

}
