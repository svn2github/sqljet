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
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileAccesPermission;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetIOErrorCode;
import org.tmatesoft.sqljet.core.SqlJetIOException;
import org.tmatesoft.sqljet.core.SqlJetLockType;
import org.tmatesoft.sqljet.core.SqlJetPageFlags;
import org.tmatesoft.sqljet.core.SqlJetPagerFlags;
import org.tmatesoft.sqljet.core.SqlJetPagerJournalMode;
import org.tmatesoft.sqljet.core.SqlJetPagerLockingMode;
import org.tmatesoft.sqljet.core.SqlJetPagerSafetyLevel;
import org.tmatesoft.sqljet.core.SqlJetSyncFlags;
import org.tmatesoft.sqljet.core.SqlJetUtility;
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

    /** True if journal file descriptors is valid */
    boolean journalOpen;

    /** True if header of journal is synced */
    boolean journalStarted;

    /** Use a rollback journal on this file */
    boolean useJournal;

    /** Do not bother to obtain readlocks */
    boolean noReadlock;

    /** True if the statement subjournal is open */
    boolean stmtOpen;

    /** True we are in a statement subtransaction */
    boolean stmtInUse;

    /** Open stmt journal when main journal is opened */
    boolean stmtAutoopen;

    /** Do not sync the journal if true */
    boolean noSync;

    /** Do extra syncs of the journal for robustness */
    boolean fullSync;

    /** One of SYNC_NORMAL or SYNC_FULL */
    EnumSet<SqlJetSyncFlags> syncFlags;

    /** fileName is a temporary file */
    boolean tempFile;

    /** True for a read-only database */
    boolean readOnly;

    /** True if an fsync() is needed on the journal */
    boolean needSync;

    /** True if cached pages have changed */
    boolean dirtyCache;

    /** Disable DontRollback() for all pages */
    boolean alwaysRollback;

    /** True to inhibit all file I/O */
    boolean memDb;

    /** True if a m-j name has been written to jrnl */
    boolean setMaster;

    /** Boolean. While true, do not spill the cache */
    boolean doNotSync;

    /** True if there are any changes to the Db */
    boolean dbModified;

    /** Set after incrementing the change-counter */
    boolean changeCountDone;

    /** Number of pages in the file */
    int dbSize;

    /** dbSize before the current change */
    int origDbSize;

    /** Size of database (in pages) at stmt_begin() */
    int stmtSize;

    /** Number of pages written to the journal */
    int nRec;

    /** Quasi-random value added to every checksum */
    int cksumInit;

    /** Number of records in stmt subjournal */
    int stmtNRec;

    /** Add this many bytes to each in-memory page */
    int nExtra;

    /** Number of bytes in a page */
    int pageSize;

    /** Total number of in-memory pages */
    int nPage;

    /** Maximum number of pages to hold in cache */
    int mxPage;

    /** Maximum allowed size of the database */
    int mxPgno;

    /** One bit for each page in the database file */
    BitSet pagesInJournal;

    /** One bit for each page in the database */
    BitSet pagesInStmt;

    /** One bit for each page marked always-rollback */
    BitSet pagesAlwaysRollback;

    /** Name of the database file */
    File fileName;

    /** Name of the journal file */
    File journal;

    /** Directory hold database and journal files */
    File directory;

    /** File descriptors for database and journal */
    ISqlJetFile fd, jfd;

    /** File descriptor for the sub-journal */
    ISqlJetFile stfd;

    /** Current byte offset in the journal file */
    long journalOff;

    /** Byte offset to previous journal header */
    long journalHdr;

    /** First journal header written this statement */
    long stmtHdrOff;

    /** cksumInit when statement was started */
    int stmtCksum;

    /** Size of journal at stmt_begin() */
    long stmtJSize;

    /** Assumed sector size during rollback */
    int sectorSize;

    /** Pager.pageSize bytes of space for tmp use */
    byte[] tmpSpace;

    /** Changes whenever database file changes */
    byte[] dbFileVers = new byte[16];

    /** Size limit for persistent journal files */
    long journalSizeLimit;

    /** Pointer to page cache object */
    SqlJetPageCache pageCache;

    SqlJetPagerSafetyLevel safetyLevel;

    /**
     * Call this routine when reloading pages
     */
    ISqlJetPageCallback reiniter;
    ISqlJetBusyHandler busyHandler;

    /** One of several kinds of errors */
    SqlJetErrorCode errCode;

    /**
     * The size of the header and of each page in the journal is determined by
     * the following macros.
     */
    private int JOURNAL_PG_SZ() {
        return pageSize + 8;
    }

    /**
     * The journal header size for this pager. In the future, this could be set
     * to some value read from the disk controller. The important characteristic
     * is that it is the same size as a disk sector.
     */
    private int JOURNAL_HDR_SZ() {
        return sectorSize;
    }

    /**
     * Page number PAGER_MJ_PGNO is never used in an SQLite database (it is
     * reserved for working around a windows/posix incompatibility). It is used
     * in the journal to signify that the remainder of the journal file is
     * devoted to storing a master journal name - there are no more pages to
     * roll back. See comments for function writeMasterJournal() for details.
     * 
     * @return
     */
    long PAGER_MJ_PGNO() {
        return (ISqlJetFile.PENDING_BYTE / pageSize) + 1;
    }

    int int_PAGER_MJ_PGNO() {
        return Long.valueOf(PAGER_MJ_PGNO()).intValue();
    }

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
        this.useJournal = null == flags || !flags.contains(SqlJetPagerFlags.OMIT_JOURNAL);

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

        pageCache = new SqlJetPageCache();
        pageCache.open(szPageDflt, nExtra, !memDb, xDesc, !memDb ? this : null);

        this.noReadlock = null != flags && flags.contains(SqlJetPagerFlags.NO_READLOCK) && this.readOnly;

        this.dbSize = this.memDb ? 0 : -1;
        this.pageSize = szPageDflt;
        this.mxPage = 100;
        this.mxPgno = SQLJET_MAX_PAGE_COUNT;
        assertion(this.state == (this.tempFile ? SqlJetPagerState.EXCLUSIVE : SqlJetPagerState.UNLOCK));
        this.lockingMode = this.tempFile ? SqlJetPagerLockingMode.EXCLUSIVE : SqlJetPagerLockingMode.NORMAL;

        this.noSync = this.tempFile || !this.useJournal;
        this.fullSync = !this.noSync;
        this.syncFlags = EnumSet.of(SqlJetSyncFlags.NORMAL);

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
        if (!this.tempFile && null != this.fd) {
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
        return fd;
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

        noSync = safetyLevel == SqlJetPagerSafetyLevel.OFF || tempFile || memDb;
        fullSync = safetyLevel == SqlJetPagerSafetyLevel.FULL && !tempFile;
        if (noSync)
            needSync = false;

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
        if (pageSize != this.pageSize && (!this.memDb || this.dbSize == 0) && pageCache.getRefCount() == 0) {
            reset();
            this.pageSize = pageSize;
            if (!this.memDb)
                setSectorSize();
            this.tmpSpace = new byte[pageSize];
            pageCache.setPageSize(pageSize);
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
     ** Find a page in the hash table given its page number. Return a pointer to
     * the page or NULL if not found.
     * 
     * @throws SqlJetException
     */
    ISqlJetPage lookup(int pageNumber) throws SqlJetException {
        return pageCache.fetch(pageNumber, false);
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
            pageCache.clear();
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
        pageCache.setCacheSize(cacheSize);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#readFileHeader(int, byte[])
     */
    public void readFileHeader(final int count, final byte[] buffer) throws SqlJetException {
        Arrays.fill(buffer, 0, count, (byte) 0);
        assertion(memDb || null != fd || tempFile);
        if (null != fd) {
            try {
                fd.read(buffer, count, 0);
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
            assertion(null != fd || tempFile);
            long l = 0;
            if (null != fd) {
                try {
                    l = fd.fileSize();
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
            if (SqlJetPagerState.UNLOCK == state && pageCache.getRefCount() == 0) {
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
                    if (null != fd)
                        fd.unlock(SqlJetLockType.NONE);
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
                    pagesInJournal = null;
                    pagesAlwaysRollback = null;
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
                        pagesInStmt = null;
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
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#close()
     */
    public void close() throws SqlJetException {
        errCode = null;
        lockingMode = SqlJetPagerLockingMode.NORMAL;
        reset();
        rollback();
        if (journalOpen) {
            if (null != jfd)
                jfd.close();
        }
        pagesInJournal = null;
        pagesAlwaysRollback = null;
        if (stmtOpen) {
            if (null != stfd)
                stfd.close();
        }
        if (null != fd)
            fd.close();

        /*
         * Temp files are automatically deleted by the OS if( pPager->tempFile
         * ){ sqlite3OsDelete(pPager->zFilename); }
         */

        tmpSpace = null;
        pageCache.close();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#acquire(int, boolean)
     */
    public ISqlJetPage acquirePage(final int pageNumber, final boolean read) throws SqlJetException {

        assertion(state == SqlJetPagerState.UNLOCK || pageCache.getRefCount() > 0 || pageNumber == 1);

        if (pageNumber > PAGER_MAX_PGNO || pageNumber == 0
                || pageNumber == ((ISqlJetFile.PENDING_BYTE / (pageSize)) + 1)) {
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        }

        /*
         * If this is the first page accessed, then get a SHARED lock on the
         * database file. pagerSharedLock() is a no-op if a database lock is
         * already held.
         */
        sharedLock();
        assertion(state != SqlJetPagerState.UNLOCK);

        final ISqlJetPage page = pageCache.fetch(pageNumber, true);

        if (null == page.getPager()) {
            /*
             * The pager cache has created a new page. Its content needs to be
             * initialized.
             */
            page.setPager(this);

            if (SqlJetUtility.bitSetTest(pagesInJournal, pageNumber)) {
                assertion(!memDb);
                if (null == page.getFlags())
                    page.setFlags(EnumSet.noneOf(SqlJetPageFlags.class));
                page.getFlags().add(SqlJetPageFlags.IN_JOURNAL);
            }

            Arrays.fill(page.getExtra(), (byte) 0);

            int nMax;
            try {
                nMax = getPageCount();
            } catch (SqlJetException e) {
                page.unref();
                throw e;
            }

            if (nMax < pageNumber || memDb || !read) {

                if (pageNumber > mxPgno) {
                    page.unref();
                    throw new SqlJetException(SqlJetErrorCode.FULL);
                }

                Arrays.fill(page.getData(), (byte) 0);

                if (!read) {
                    if (null == page.getFlags())
                        page.setFlags(EnumSet.noneOf(SqlJetPageFlags.class));
                    page.getFlags().add(SqlJetPageFlags.NEED_READ);
                }

            } else {
                try {
                    readDbPage(page, pageNumber);
                } catch (SqlJetIOException e) {
                    if (SqlJetIOErrorCode.IOERR_SHORT_READ != e.getIoErrorCode()) {
                        dropPage(page);
                        throw e;
                    }
                }
            }
            page.setHash(pageHash(page));
        } else {
            /* The requested page is in the page cache. */
            assert (pageCache.getRefCount() > 0 || 1 == pageNumber);
            if (read) {
                try {
                    getContent(page);
                } catch (SqlJetException e) {
                    page.unref();
                    throw e;
                }
            }
        }

        return page;

    }

    /**
     * Make sure we have the content for a page. If the page was previously
     * acquired with noContent==1, then the content was just initialized to
     * zeros instead of being read from disk. But now we need the real data off
     * of disk. So make sure we have it. Read it in if we do not have it
     * already.
     * 
     * @param page
     */
    void getContent(final ISqlJetPage page) throws SqlJetException {
        final EnumSet<SqlJetPageFlags> flags = page.getFlags();
        if (null != flags && flags.contains(SqlJetPageFlags.NEED_READ)) {
            readDbPage(page, page.getPageNumber());
            flags.remove(SqlJetPageFlags.NEED_READ);
        }
    }

    /**
     * Return a 32-bit hash of the page data for pPage
     * 
     * @param page
     * @return
     * @throws SqlJetException
     */
    long pageHash(ISqlJetPage page) throws SqlJetException {
        return dataHash(pageSize, page.getData());
    }

    /**
     * @param numByte
     * @param data
     * @return
     */
    private long dataHash(int numByte, byte[] data) {
        long hash = 0;
        int i;
        for (i = 0; i < numByte; i++) {
            hash = (hash * 1039) + data[i];
        }
        return hash;
    }

    /**
     * @param page
     * @throws SqlJetException
     */
    private void dropPage(final ISqlJetPage page) throws SqlJetException {
        pageCache.drop(page);
        unlockIfUnused();
    }

    /**
     * If the reference count has reached zero, and the pager is not in the
     * middle of a write transaction or opened in exclusive mode, unlock it.
     * 
     * @throws SqlJetException
     */
    void unlockIfUnused() throws SqlJetException {
        if ((pageCache.getRefCount() == 0) && (SqlJetPagerLockingMode.EXCLUSIVE != lockingMode || journalOff > 0)) {
            unlockAndRollback();
        }
    }

    /**
     * Execute a rollback if a transaction is active and unlock the database
     * file. If the pager has already entered the error state, do not attempt
     * the rollback.
     * 
     * @throws SqlJetException
     */
    private void unlockAndRollback() throws SqlJetException {
        if (errCode == null && SqlJetPagerState.RESERVED.compareTo(state) <= 0) {
            rollback();
        }
        unlock();
    }

    /**
     * Read the content of page pPg out of the database file.
     * 
     * @param page
     * @param pageNumber
     */
    private void readDbPage(final ISqlJetPage page, int pageNumber) throws SqlJetException {
        assertion(!memDb);
        assertion(null != fd || tempFile);
        if (null == fd) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_SHORT_READ);
        }
        long offset = (pageNumber - 1) * pageSize;
        final byte[] data = page.getData();
        fd.read(data, pageSize, offset);
        if (1 == pageNumber) {
            SqlJetUtility.memcpy(dbFileVers, 0, data, 24, dbFileVers.length);
        }
    }

    /**
     * This function is called to obtain the shared lock required before data
     * may be read from the pager cache. If the shared lock has already been
     * obtained, this function is a no-op.
     * 
     * Immediately after obtaining the shared lock (if required), this function
     * checks for a hot-journal file. If one is found, an emergency rollback is
     * performed immediately.
     * 
     * @throws SqlJetException
     */
    private void sharedLock() throws SqlJetException {

        boolean isErrorReset = false;

        /*
         * If this database is opened for exclusive access, has no outstanding
         * page references and is in an error-state, now is the chance to clear
         * the error. Discard the contents of the pager-cache and treat any open
         * journal file as a hot-journal.
         */
        if (!memDb && lockingMode == SqlJetPagerLockingMode.EXCLUSIVE && pageCache.getRefCount() == 0
                && null != errCode) {
            if (journalOpen) {
                isErrorReset = true;
            }
            errCode = null;
            reset();
        }

        /*
         * If the pager is still in an error state, do not proceed. The error
         * state will be cleared at some point in the future when all page
         * references are dropped and the cache can be discarded.
         */
        if (null != errCode && errCode != SqlJetErrorCode.FULL) {
            throw new SqlJetException(errCode);
        }

        if (SqlJetPagerState.UNLOCK == state || isErrorReset)
            try {
                if (!memDb) {

                    boolean isHotJournal = false;
                    assertion(pageCache.getRefCount() == 0);

                    if (!noReadlock) {
                        try {
                            waitOnLock(SqlJetLockType.SHARED);
                        } catch (SqlJetException e) {
                            error(e);
                            throw e;
                        }
                        assertion(SqlJetPagerState.SHARED == state);
                    }

                    /*
                     * If a journal file exists, and there is no RESERVED lock
                     * on the database file, then it either needs to be played
                     * back or deleted.
                     */
                    if (!isErrorReset) {
                        isHotJournal = hasHotJournal();
                    }

                    if (isErrorReset || isHotJournal) {
                        /*
                         * Get an EXCLUSIVE lock on the database file. At this
                         * point it is important that a RESERVED lock is not
                         * obtained on the way to the EXCLUSIVE lock. If it
                         * were, another process might open the database file,
                         * detect the RESERVED lock, and conclude that the
                         * database is safe to read while this process is still
                         * rolling it back.
                         * 
                         * Because the intermediate RESERVED lock is not
                         * requested, the second process will get to this point
                         * in the code and fail to obtain its own EXCLUSIVE lock
                         * on the database file.
                         */
                        if (SqlJetPagerState.EXCLUSIVE.compareTo(state) > 0) {
                            try {
                                fd.lock(SqlJetLockType.EXCLUSIVE);
                            } catch (SqlJetException e) {
                                error(e);
                                throw e;
                            }
                            state = SqlJetPagerState.EXCLUSIVE;
                        }

                        /*
                         * Open the journal for read/write access. This is
                         * because in exclusive-access mode the file descriptor
                         * will be kept open and possibly used for a transaction
                         * later on. On some systems, the OsTruncate() call used
                         * in exclusive-access mode also requires a read/write
                         * file handle.
                         */
                        if (!isErrorReset && !journalOpen) {

                            try {
                                if (fileSystem.access(journal, SqlJetFileAccesPermission.EXISTS)) {

                                    assertion(!tempFile);

                                    jfd = fileSystem.open(journal, SqlJetFileType.MAIN_JOURNAL, EnumSet
                                            .of(SqlJetFileOpenPermission.READWRITE));
                                    if (null != jfd) {
                                        try {
                                            final EnumSet<SqlJetFileOpenPermission> p = jfd.getPermissions();
                                            if (p.contains(SqlJetFileOpenPermission.READONLY))
                                                throw new SqlJetException(SqlJetErrorCode.BUSY);
                                        } finally {
                                            jfd.close();
                                        }
                                    }

                                } else {
                                    /*
                                     * If the journal does not exist, that means
                                     * some other process has already rolled it
                                     * back
                                     */
                                    throw new SqlJetException(SqlJetErrorCode.BUSY);
                                }

                            } catch (SqlJetIOException e) {
                                if (SqlJetIOErrorCode.IOERR_UNLOCK != e.getIoErrorCode()) {
                                    throw new SqlJetException(SqlJetErrorCode.BUSY);
                                }
                                throw e;
                            }

                            journalOpen = true;
                            journalStarted = false;
                            journalOff = 0;
                            setMaster = false;
                            journalHdr = 0;

                            /*
                             * Playback and delete the journal. Drop the
                             * database write lock and reacquire the read lock.
                             */
                            try {
                                playback(true);
                            } catch (SqlJetException e) {
                                error(e);
                                throw e;
                            }
                            assertion(SqlJetPagerState.SHARED == state
                                    || (SqlJetPagerLockingMode.EXCLUSIVE == lockingMode && SqlJetPagerState.SHARED
                                            .compareTo(state) < 0));

                        }

                    }

                    if (pageCache.getPageCount() > 0) {
                        /*
                         * The shared-lock has just been acquired on the
                         * database file and there are already pages in the
                         * cache (from a previous read or write transaction).
                         * Check to see if the database has been modified. If
                         * the database has changed, flush the cache.
                         * 
                         * Database changes is detected by looking at 15 bytes
                         * beginning at offset 24 into the file. The first 4 of
                         * these 16 bytes are a 32-bit counter that is
                         * incremented with each change. The other bytes change
                         * randomly with each file change when a codec is in
                         * use.
                         * 
                         * There is a vanishingly small chance that a change
                         * will not be detected. The chance of an undetected
                         * change is so small that it can be neglected.
                         */
                        getPageCount();

                        if (null != errCode) {
                            throw new SqlJetException(errCode);
                        }

                        if (dbSize > 0) {
                            fd.read(dbFileVers, dbFileVers.length, 24);
                        } else {
                            Arrays.fill(dbFileVers, (byte) 0);
                        }

                    }

                }

                assert (SqlJetPagerLockingMode.EXCLUSIVE == lockingMode || SqlJetPagerState.SHARED.compareTo(state) >= 0);
                if (SqlJetPagerState.UNLOCK == state) {
                    state = SqlJetPagerState.SHARED;
                }

            } catch (SqlJetException e) {
                unlock();
                throw e;
            }

    }

    /**
     * 
     * Playback the journal and thus restore the database file to the state it
     * was in before we started making changes.
     * 
     * The journal file format is as follows:
     * 
     * (1) 8 byte prefix. A copy of aJournalMagic[]. (2) 4 byte big-endian
     * integer which is the number of valid page records in the journal. If this
     * value is 0xffffffff, then compute the number of page records from the
     * journal size. (3) 4 byte big-endian integer which is the initial value
     * for the sanity checksum. (4) 4 byte integer which is the number of pages
     * to truncate the database to during a rollback. (5) 4 byte big-endian
     * integer which is the sector size. The header is this many bytes in size.
     * (6) 4 byte big-endian integer which is the page case. (7) 4 byte integer
     * which is the number of bytes in the master journal name. The value may be
     * zero (indicate that there is no master journal.) (8) N bytes of the
     * master journal name. The name will be nul-terminated and might be shorter
     * than the value read from (5). If the first byte of the name is \000 then
     * there is no master journal. The master journal name is stored in UTF-8.
     * (9) Zero or more pages instances, each as follows: + 4 byte page number.
     * + pPager->pageSize bytes of data. + 4 byte checksum
     * 
     * When we speak of the journal header, we mean the first 8 items above.
     * Each entry in the journal is an instance of the 9th item.
     * 
     * Call the value from the second bullet "nRec". nRec is the number of valid
     * page entries in the journal. In most cases, you can compute the value of
     * nRec from the size of the journal file. But if a power failure occurred
     * while the journal was being written, it could be the case that the size
     * of the journal file had already been increased but the extra entries had
     * not yet made it safely to disk. In such a case, the value of nRec
     * computed from the file size would be too large. For that reason, we
     * always use the nRec value in the header.
     * 
     * If the nRec value is 0xffffffff it means that nRec should be computed
     * from the file size. This value is used when the user selects the no-sync
     * option for the journal. A power failure could lead to corruption in this
     * case. But for things like temporary table (which will be deleted when the
     * power is restored) we don't care.
     * 
     * If the file opened as the journal file is not a well-formed journal file
     * then all pages up to the first corrupted page are rolled back (or no
     * pages if the journal header is corrupted). The journal file is then
     * deleted and SQLITE_OK returned, just as if no corruption had been
     * encountered.
     * 
     * If an I/O or malloc() error occurs, the journal-file is not deleted and
     * an error code is returned.
     * 
     * @param isHot
     */
    private void playback(boolean isHot) throws SqlJetException {

        SqlJetException rc = null;

        long szJ; /* Size of the journal file in bytes */
        int nRec = -1; /* Number of Records in the journal */
        int u; /* Unsigned loop counter */
        int mxPg = 0; /* Size of the original file in pages */
        boolean res = true; /* Value returned by sqlite3OsAccess() */
        String zMaster = null; /* Name of master journal file if any */

        /*
         * Figure out how many records are in the journal. Abort early if the
         * journal is empty.
         */
        assertion(journalOpen);

        try {
            szJ = jfd.fileSize();
            if (szJ == 0) {
                return;
            }

            /*
             * Read the master journal name from the journal, if it is present.
             * If a master journal file name is specified, but the file is not
             * present on disk, then the journal is not hot and does not need to
             * be played back.
             */
            zMaster = readMasterJournal(jfd);
            if (null != zMaster) {
                res = fileSystem.access(new File(zMaster), SqlJetFileAccesPermission.EXISTS);
            }
            if (!res) {
                return;
            }
            journalOff = 0;

            /*
             * This loop terminates either when the readJournalHdr() call
             * returns SQLITE_DONE or an IO error occurs.
             */
            while (true) {

                /*
                 * Read the next journal header from the journal file. If there
                 * are not enough bytes left in the journal file for a complete
                 * header, or it is corrupted, then a process must of failed
                 * while writing it. This indicates nothing more needs to be
                 * rolled back.
                 */
                try {
                    final int[] readJournalHdr = readJournalHdr(szJ);
                    nRec = readJournalHdr[0];
                    mxPg = readJournalHdr[1];
                } catch (SqlJetException e) {
                    if (SqlJetErrorCode.DONE == e.getErrorCode())
                        return;
                }

                /*
                 * If nRec is 0xffffffff, then this journal was created by a
                 * process working in no-sync mode. This means that the rest of
                 * the journal file consists of pages, there are no more journal
                 * headers. Compute the value of nRec based on this assumption.
                 */
                if (nRec == 0xffffffff) {
                    assertion(journalOff == JOURNAL_HDR_SZ());
                    nRec = (int) ((szJ - JOURNAL_HDR_SZ()) / JOURNAL_PG_SZ());
                }

                /*
                 * If nRec is 0 and this rollback is of a transaction created by
                 * this process and if this is the final header in the journal,
                 * then it means that this part of the journal was being filled
                 * but has not yet been synced to disk. Compute the number of
                 * pages based on the remaining size of the file.
                 * 
                 * The third term of the test was added to fix ticket #2565.
                 * When rolling back a hot journal, nRec==0 always means that
                 * the next chunk of the journal contains zero pages to be
                 * rolled back. But when doing a ROLLBACK and the nRec==0 chunk
                 * is the last chunk in the journal, it means that the journal
                 * might contain additional pages that need to be rolled back
                 * and that the number of pages should be computed based on the
                 * journal file size.
                 */
                if (nRec == 0 && !isHot && journalHdr + JOURNAL_HDR_SZ() == journalOff) {
                    nRec = (int) ((szJ - journalOff) / JOURNAL_PG_SZ());
                }

                /*
                 * If this is the first header read from the journal, truncate
                 * the database file back to its original size.
                 */
                if (journalOff == JOURNAL_HDR_SZ()) {
                    doTruncate(mxPg);
                    dbSize = mxPg;
                }

                /*
                 * Copy original pages out of the journal and back into the
                 * database file.
                 */
                for (u = 0; u < nRec; u++) {

                    try {
                        playbackOnePage(jfd, journalOff, true);
                    } catch (SqlJetException e) {
                        if (e.getErrorCode() == SqlJetErrorCode.DONE) {
                            journalOff = szJ;
                            break;
                        } else {
                            /*
                             * If we are unable to rollback, then the database
                             * is probably going to end up being corrupt. It is
                             * corrupt to us, anyhow. Perhaps the next process
                             * to come along can fix it....
                             */
                            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
                        }
                    }

                }
            }

        } catch (SqlJetException e) {
            rc = e;
        } finally {

            // end_playback:

            if (rc == null) {
                try {
                    zMaster = readMasterJournal(jfd);
                } catch (SqlJetException e) {
                    rc = e;
                }
            }

            if (rc == null) {
                try {
                    endTransaction(zMaster != null);
                } catch (SqlJetException e) {
                    rc = e;
                }
            }

            if (rc == null && zMaster != null) {
                /*
                 * If there was a master journal and this routine will return
                 * success, see if it is possible to delete the master journal.
                 */
                try {
                    deleteMaster(zMaster);
                } catch (SqlJetException e) {
                    rc = e;
                }
            }
        }

        /*
         * The Pager.sectorSize variable may have been updated while rolling
         * back a journal created by a process with a different sector size
         * value. Reset it to the correct value for this process.
         */
        setSectorSize();
        if (rc != null)
            throw rc;
    }

    /**
     * Parameter zMaster is the name of a master journal file. A single journal
     * file that referred to the master journal file has just been rolled back.
     * This routine checks if it is possible to delete the master journal file,
     * and does so if it is.
     * 
     * Argument zMaster may point to Pager.pTmpSpace. So that buffer is not
     * available for use within this function.
     * 
     * 
     * The master journal file contains the names of all child journals. To tell
     * if a master journal can be deleted, check to each of the children. If all
     * children are either missing or do not refer to a different master
     * journal, then this master journal can be deleted.
     * 
     * @param master
     */
    private void deleteMaster(String master) throws SqlJetException {

        boolean master_open = false;
        ISqlJetFile pMaster = null;
        byte[] zMasterJournal = null; /* Contents of master journal file */
        int nMasterJournal; /* Size of master journal file */

        try {

            /*
             * Open the master journal file exclusively in case some other
             * process is running this routine also. Not that it makes too much
             * difference.
             */
            pMaster = fileSystem.open(new File(master), SqlJetFileType.MASTER_JOURNAL, EnumSet
                    .of(SqlJetFileOpenPermission.READONLY));
            master_open = true;

            nMasterJournal = Long.valueOf(pMaster.fileSize()).intValue();

            if (nMasterJournal > 0) {

                /*
                 * Load the entire master journal file into space obtained from
                 * sqlite3_malloc() and pointed to by zMasterJournal.
                 */
                zMasterJournal = new byte[nMasterJournal];
                pMaster.read(zMasterJournal, nMasterJournal, 0);

                int nMasterPtr = 0;
                while (nMasterPtr < nMasterJournal) {

                    int zMasterPtr = SqlJetUtility.strlen(zMasterJournal, nMasterPtr);
                    String zJournal = new String(zMasterJournal, nMasterPtr, zMasterPtr);
                    final File journalPath = new File(zJournal);
                    boolean exists = fileSystem.access(journalPath, SqlJetFileAccesPermission.EXISTS);

                    if (exists) {
                        /*
                         * One of the journals pointed to by the master journal
                         * exists. Open it and check if it points at the master
                         * journal. If so, return without deleting the master
                         * journal file.
                         */
                        final ISqlJetFile pJournal = fileSystem.open(journalPath, SqlJetFileType.MAIN_JOURNAL, EnumSet
                                .of(SqlJetFileOpenPermission.READONLY));
                        try {
                            final String readJournal = readMasterJournal(pJournal);
                            if (readJournal != null && readJournal.equals(master)) {
                                /*
                                 * We have a match. Do not delete the master
                                 * journal file.
                                 */
                                return;
                            }
                        } finally {
                            pJournal.close();
                        }
                    }
                    nMasterPtr += zMasterPtr + 1;
                }
            }

            fileSystem.delete(new File(master), false);

        } finally {
            // delmaster_out:
            if (master_open && pMaster != null) {
                pMaster.close();
            }
        }
    }

    /**
     * This routine ends a transaction. A transaction is ended by either a
     * COMMIT or a ROLLBACK.
     * 
     * When this routine is called, the pager has the journal file open and a
     * RESERVED or EXCLUSIVE lock on the database. This routine will release the
     * database lock and acquires a SHARED lock in its place if that is the
     * appropriate thing to do. Release locks usually is appropriate, unless we
     * are in exclusive access mode or unless this is a COMMIT AND BEGIN or
     * ROLLBACK AND BEGIN operation.
     * 
     * The journal file is either deleted or truncated.
     * 
     * TODO: Consider keeping the journal file open for temporary databases.
     * This might give a performance improvement on windows where opening a file
     * is an expensive operation.
     * 
     * @param hasMaster
     */
    private void endTransaction(boolean hasMaster) throws SqlJetException {

        SqlJetException rc = null;
        SqlJetException rc2 = null;

        assertion(!memDb);

        if (state.compareTo(SqlJetPagerState.RESERVED) < 0) {
            return;
        }

        stmtCommit();

        if (stmtOpen && !exclusiveMode()) {
            stfd.close();
            stmtOpen = false;
        }
        if (journalOpen) {
            if (exclusiveMode() || journalMode == SqlJetPagerJournalMode.PERSIST) {
                try {
                    zeroJournalHdr(hasMaster);
                } catch (SqlJetException e) {
                    rc = e;
                }
                if (rc != null)
                    error(rc);
                journalOff = 0;
                journalStarted = false;
            } else {
                jfd.close();
                journalOpen = false;
                if (rc == null && !tempFile) {
                    try {
                        fileSystem.delete(journal, false);
                    } catch (SqlJetException e) {
                        rc = e;
                    }
                }
            }
            pagesInJournal = null;
            pagesAlwaysRollback = null;
            pageCache.cleanAll();
            // sqlite3PcacheIterate(pPager->pPCache, pager_set_pagehash);
            // pCache.iterate(setPageHash)
            pageCache.clearFlags(EnumSet.of(SqlJetPageFlags.IN_JOURNAL, SqlJetPageFlags.NEED_SYNC));
            dirtyCache = false;
            nRec = 0;

        } else {

            assertion(null == pagesInJournal);

        }

        if (!exclusiveMode()) {
            if (null != fd) {
                try {
                    fd.unlock(SqlJetLockType.SHARED);
                } catch (SqlJetException e) {
                    rc2 = e;
                }
            }
            state = SqlJetPagerState.SHARED;
        } else if (state == SqlJetPagerState.SYNCED) {
            state = SqlJetPagerState.EXCLUSIVE;
        }
        origDbSize = 0;
        setMaster = false;
        needSync = false;
        dbSize = -1;
        dbModified = false;

        if (rc != null)
            throw rc;
        if (rc2 != null)
            throw rc2;

    }

    /**
     * Write zeros over the header of the journal file. This has the effect of
     * invalidating the journal file and committing the transaction.
     * 
     * @param doTruncate
     */
    private void zeroJournalHdr(boolean doTruncate) throws SqlJetException {

        SqlJetException rc = null;
        byte[] zeroHdr = new byte[28];
        Arrays.fill(zeroHdr, (byte) 0);

        if (journalOff > 0) {

            long iLimit = journalSizeLimit;

            if (doTruncate || iLimit == 0) {
                try {
                    jfd.truncate(0);
                } catch (SqlJetException e) {
                    rc = e;
                }
            } else {
                try {
                    jfd.write(zeroHdr, zeroHdr.length, 0);
                } catch (SqlJetException e) {
                    rc = e;
                }
            }
            if (rc == null && !noSync) {
                jfd.sync(syncFlags);
            }

            /*
             * At this point the transaction is committed but the write lock is
             * still held on the file. If there is a size limit configured for
             * the persistent journal and the journal file currently consumes
             * more space than that limit allows for, truncate it now. There is
             * no need to sync the file following this operation.
             */
            if (rc == null && iLimit > 0) {
                long sz = 0;

                try {
                    sz = jfd.fileSize();
                } catch (SqlJetException e) {
                    rc = e;
                }

                if (rc == null && sz > iLimit) {
                    try {
                        jfd.truncate(iLimit);
                    } catch (SqlJetException e) {
                        rc = e;
                    }
                }
            }
        }

        if (null != rc)
            throw rc;

    }

    /**
     * @return
     */
    private boolean exclusiveMode() {
        return lockingMode == SqlJetPagerLockingMode.EXCLUSIVE;
    }

    /**
     * Read a single page from the journal file opened on file descriptor jfd.
     * Playback this one page.
     * 
     * The isMainJrnl flag is true if this is the main rollback journal and
     * false for the statement journal. The main rollback journal uses checksums
     * - the statement journal does not.
     * 
     * @param jfd
     *            The file that is the journal being rolled back
     * @param pOffset
     *            Offset of the page within the journal
     * @param isMainJrnl
     *            True for main rollback journal. False for Stmt jrnl
     * @throws SqlJetException
     */
    private void playbackOnePage(ISqlJetFile jfd, long pOffset, boolean isMainJrnl) throws SqlJetException {
        ISqlJetPage pPg; /* An existing page in the cache */
        int pgno; /* The page number of a page in journal */
        int cksum; /* Checksum used for sanity checking */
        byte[] aData; /* Temporary storage for the page */

        aData = tmpSpace;
        assertion(aData); /* Temp storage must have already been allocated */

        assertion(jfd == (isMainJrnl ? this.jfd : this.stfd));

        pgno = read32bits(jfd, pOffset);
        jfd.read(aData, pageSize, pOffset + 4);
        journalOff += pageSize + 4;

        /*
         * Sanity checking on the page. This is more important that I originally
         * thought. If a power failure occurs while the journal is being
         * written, it could cause invalid data to be written into the journal.
         * We need to detect this invalid data (with high probability) and
         * ignore it.
         */
        if (pgno == 0 || pgno == PAGER_MJ_PGNO()) {
            throw new SqlJetException(SqlJetErrorCode.DONE);
        }
        if (pgno > dbSize) {
            return;
        }
        if (isMainJrnl) {
            cksum = read32bits(jfd, pOffset - 4);
            journalOff += 4;
            if (cksum(aData) != cksum) {
                throw new SqlJetException(SqlJetErrorCode.DONE);
            }
        }

        assertion(state == SqlJetPagerState.RESERVED || state.compareTo(SqlJetPagerState.EXCLUSIVE) >= 0);

        /*
         * If the pager is in RESERVED state, then there must be a copy of this
         * page in the pager cache. In this case just update the pager cache,
         * not the database file. The page is left marked dirty in this case.
         * 
         * An exception to the above rule: If the database is in no-sync mode
         * and a page is moved during an incremental vacuum then the page may
         * not be in the pager cache. Later: if a malloc() or IO error occurs
         * during a Movepage() call, then the page may not be in the cache
         * either. So the condition described in the above paragraph is not
         * assert()able.
         * 
         * If in EXCLUSIVE state, then we update the pager cache if it exists
         * and the main file. The page is then marked not dirty.
         * 
         * Ticket #1171: The statement journal might contain page content that
         * is different from the page content at the start of the transaction.
         * This occurs when a page is changed prior to the start of a statement
         * then changed again within the statement. When rolling back such a
         * statement we must not write to the original database unless we know
         * for certain that original page contents are synced into the main
         * rollback journal. Otherwise, a power loss might leave modified data
         * in the database file without an entry in the rollback journal that
         * can restore the database to its original form. Two conditions must be
         * met before writing to the database files. (1) the database must be
         * locked. (2) we know that the original page content is fully synced in
         * the main journal either because the page is not in cache or else the
         * page is marked as needSync==0.
         * 
         * 2008-04-14: When attempting to vacuum a corrupt database file, it is
         * possible to fail a statement on a database that does not yet exist.
         * Do not attempt to write if database file has never been opened.
         */
        pPg = lookup(pgno);
        if (state.compareTo(SqlJetPagerState.EXCLUSIVE) >= 0
                && (pPg == null || !pPg.getFlags().contains(SqlJetPageFlags.NEED_SYNC)) && null != fd) {
            long ofst = (pgno - 1) * pageSize;
            fd.write(aData, pageSize, ofst);
        }
        if (null != pPg) {
            /*
             * No page should ever be explicitly rolled back that is in use,
             * except for page 1 which is held in use in order to keep the lock
             * on the database active. However such a page may be rolled back as
             * a result of an internal error resulting in an automatic call to
             * sqlite3PagerRollback().
             */
            final byte[] pData = pPg.getData();
            SqlJetUtility.memcpy(pData, aData, pageSize);

            if (null != reiniter) {
                reiniter.pageCallback(pPg);
            }
            if (isMainJrnl)
                pageCache.makeClean(pPg);
            pPg.setHash(pageHash(pPg));
            /*
             * If this was page 1, then restore the value of Pager.dbFileVers.
             * Do this before any decoding.
             */
            if (pgno == 1) {
                SqlJetUtility.memcpy(dbFileVers, 0, pData, 24, dbFileVers.length);
            }

            pageCache.release(pPg);
        }
    }

    /**
     * Compute and return a checksum for the page of data.
     * 
     * This is not a real checksum. It is really just the sum of the random
     * initial value and the page number. We experimented with a checksum of the
     * entire data, but that was found to be too slow.
     * 
     * Note that the page number is stored at the beginning of data and the
     * checksum is stored at the end. This is important. If journal corruption
     * occurs due to a power failure, the most likely scenario is that one end
     * or the other of the record will be changed. It is much less likely that
     * the two ends of the journal record will be correct and the middle be
     * corrupt. Thus, this "checksum" scheme, though fast and simple, catches
     * the mostly likely kind of corruption.
     * 
     * FIX ME: Consider adding every 200th (or so) byte of the data to the
     * checksum. That way if a single page spans 3 or more disk sectors and only
     * the middle sector is corrupt, we will still have a reasonable chance of
     * failing the checksum and thus detecting the problem.
     * 
     * @param data
     * @return
     */
    int cksum(byte[] data) {
        int cksum = cksumInit;
        int i = pageSize - 200;
        while (i > 0) {
            cksum += data[i];
            i -= 200;
        }
        return cksum;
    }

    /**
     * When this is called the journal file for pager pPager must be open. The
     * master journal file name is read from the end of the file and written
     * into memory supplied by the caller.
     * 
     * zMaster must point to a buffer of at least nMaster bytes allocated by the
     * caller. This should be sqlite3_vfs.mxPathname+1 (to ensure there is
     * enough space to write the master journal name). If the master journal
     * name in the journal is longer than nMaster bytes (including a
     * nul-terminator), then this is handled as if no master journal name were
     * present in the journal.
     * 
     * If no master journal file name is present zMaster[0] is set to 0 and
     * SQLITE_OK returned.
     * 
     * @throws SqlJetException
     */
    private String readMasterJournal(final ISqlJetFile journal) throws SqlJetException {
        int len;
        long szJ;
        int cksum;
        int u; /* Unsigned loop counter */
        byte[] aMagic = new byte[8]; /* A buffer to hold the magic header */

        szJ = journal.fileSize();
        if (szJ < 16)
            return null;

        len = read32bits(journal, szJ - 16);
        cksum = read32bits(journal, szJ - 12);

        journal.read(aMagic, aMagic.length, szJ - 8);
        if (!Arrays.equals(aMagic, aJournalMagic))
            return null;

        byte[] zMaster = new byte[len];
        journal.read(zMaster, len, szJ - 16 - len);

        /* See if the checksum matches the master journal name */
        for (u = 0; u < len; u++) {
            cksum -= zMaster[u];
        }
        if (cksum > 0) {
            /*
             * If the checksum doesn't add up, then one or more of the disk
             * sectors containing the master journal filename is corrupted. This
             * means definitely roll back, so just return SQLITE_OK and report a
             * (nul) master-journal filename.
             */
            return null;
        }

        return new String(zMaster);
    }

    /**
     * @param fd
     * @param offset
     * @return
     * @throws SqlJetException
     */
    private int read32bits(final ISqlJetFile fd, final long offset) throws SqlJetException {
        byte[] ac = new byte[4];
        fd.read(ac, ac.length, offset);
        return SqlJetUtility.get4byte(ac);
    }

    /*
     * The journal file must be open when this is called. A journal header file
     * (JOURNAL_HDR_SZ bytes) is read from the current location in the journal
     * file. The current location in the journal file is given by
     * pPager->journalOff. See comments above function writeJournalHdr() for a
     * description of the journal header format.
     * 
     * If the header is read successfully,nRec is set to the number of page
     * records following this header anddbSize is set to the size of the
     * database before the transaction began, in pages. Also, pPager->cksumInit
     * is set to the value read from the journal header. SQLITE_OK is returned
     * in this case.
     * 
     * If the journal header file appears to be corrupted, SQLITE_DONE is
     * returned andnRec anddbSize are undefined. If JOURNAL_HDR_SZ bytes cannot
     * be read from the journal file an error code is returned.
     */
    private int[] readJournalHdr(long journalSize) throws SqlJetException {

        int[] result = new int[2];

        byte[] aMagic = new byte[8]; /* A buffer to hold the magic header */
        long jrnlOff;
        int iPageSize;
        int iSectorSize;

        seekJournalHdr();
        if (journalOff + JOURNAL_HDR_SZ() > journalSize) {
            throw new SqlJetException(SqlJetErrorCode.DONE);
        }
        jrnlOff = journalOff;

        jfd.read(aMagic, aMagic.length, jrnlOff);
        jrnlOff += aMagic.length;

        if (!Arrays.equals(aMagic, aJournalMagic)) {
            throw new SqlJetException(SqlJetErrorCode.DONE);
        }

        int pNRec = read32bits(jfd, jrnlOff);
        cksumInit = read32bits(jfd, jrnlOff + 4);
        int pDbSize = read32bits(jfd, jrnlOff + 8);

        result[0] = pNRec;
        result[1] = pDbSize;

        if (journalOff == 0) {
            iPageSize = read32bits(jfd, jrnlOff + 16);

            if (iPageSize < SQLJET_MIN_PAGE_SIZE || iPageSize > SQLJET_MAX_PAGE_SIZE
                    || ((iPageSize - 1) & iPageSize) != 0) {
                /*
                 * If the page-size in the journal-header is invalid, then the
                 * process that wrote the journal-header must have crashed
                 * before the header was synced. In this case stop reading the
                 * journal file here.
                 */
                throw new SqlJetException(SqlJetErrorCode.DONE);
            } else {
                setPageSize(iPageSize);
                assertion(pageSize == iPageSize);
            }

            /*
             * Update the assumed sector-size to match the value used by the
             * process that created this journal. If this journal was created by
             * a process other than this one, then this routine is being called
             * from within pager_playback(). The local value of Pager.sectorSize
             * is restored at the end of that routine.
             */

            iSectorSize = read32bits(jfd, jrnlOff + 12);

            if ((iSectorSize & (iSectorSize - 1)) != 0 || iSectorSize < SQLJET_MIN_PAGE_SIZE
                    || iSectorSize > SQLJET_MAX_PAGE_SIZE) {
                throw new SqlJetException(SqlJetErrorCode.DONE);
            }
            sectorSize = iSectorSize;
        }

        journalOff += JOURNAL_HDR_SZ();

        return result;
    }

    /**
     * Seek the journal file descriptor to the next sector boundary where a
     * journal header may be read or written. Pager.journalOff is updated with
     * the new seek offset.
     * 
     * i.e for a sector size of 512:
     * 
     * Input Offset Output Offset --------------------------------------- 0 0
     * 512 512 100 512 2000 2048
     * 
     * @throws SqlJetException
     * 
     */
    private long journalHdrOffset() throws SqlJetException {
        long offset = 0;
        long c = journalOff;
        if (c > 0) {
            offset = ((c - 1) / JOURNAL_HDR_SZ() + 1) * JOURNAL_HDR_SZ();
        }
        assertion(offset % JOURNAL_HDR_SZ() == 0);
        assertion(offset >= c);
        assertion((offset - c) < JOURNAL_HDR_SZ());
        return offset;
    }

    private void seekJournalHdr() throws SqlJetException {
        journalOff = journalHdrOffset();
    }

    /**
     * Return true if there is a hot journal on the given pager. A hot journal
     * is one that needs to be played back.
     * 
     * If the current size of the database file is 0 but a journal file exists,
     * that is probably an old journal left over from a prior database with the
     * same name. Just delete the journal.
     * 
     * Return false if unable to determine the status of the journal.
     * 
     * This routine does not open the journal file to examine its content.
     * Hence, the journal might contain the name of a master journal file that
     * has been deleted, and hence not be hot. Or the header of the journal
     * might be zeroed out. This routine does not discover these cases of a
     * non-hot journal - if the journal file exists and is not empty this
     * routine assumes it is hot. The pager_playback() routine will discover
     * that the journal file is not really hot and will no-op.
     * 
     * @return
     * @throws SqlJetException
     */
    private boolean hasHotJournal() throws SqlJetException {
        boolean exists = false;
        boolean locked = false;
        assertion(useJournal);
        assertion(null != fd);
        exists = fileSystem.access(journal, SqlJetFileAccesPermission.EXISTS);
        if (exists) {
            locked = fd.checkReservedLock();
        }
        if (exists && !locked) {
            if (0 == getPageCount()) {
                fileSystem.delete(journal, false);
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Try to obtain a lock on a file. Invoke the busy callback if the lock is
     * currently not available. Repeat until the busy callback returns false or
     * until the lock succeeds.
     * 
     * Return SQLITE_OK on success and an error code if we cannot obtain the
     * lock.
     * 
     * @param lockType
     * @throws SqlJetException
     */
    private void waitOnLock(final SqlJetLockType lockType) throws SqlJetException {

        /* If the file is currently unlocked then the size must be unknown */
        assertion(SqlJetPagerState.SHARED.compareTo(state) <= 0 || dbSize < 0 || !memDb);

        if (state.getLockType().compareTo(lockType) < 0) {
            boolean lock = false;
            int n = 0;
            do {
                lock = fd.lock(lockType);
                if (!lock && null != busyHandler) {
                    if (!busyHandler.call(n++))
                        break;
                }
            } while (lock != true);
            if (lock) {
                state = SqlJetPagerState.getPagerState(lockType);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#get(int)
     */
    public ISqlJetPage getPage(int pageNumber) throws SqlJetException {
        return acquirePage(pageNumber, false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#lookup(int)
     */
    public ISqlJetPage lookupPage(int pageNumber) throws SqlJetException {
        assertion(pageNumber != 0);
        if ((state != SqlJetPagerState.UNLOCK) && (errCode == null || errCode == SqlJetErrorCode.FULL)) {
            return pageCache.fetch(pageNumber, false);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#truncate(int)
     */
    public void truncate(int pagesNumber) throws SqlJetException {

        assertion(state.compareTo(SqlJetPagerState.SHARED) >= 0 || memDb);

        getPageCount();
        checkErrorCode();
        if (pagesNumber < dbSize) {
            if (memDb) {
                dbSize = pagesNumber;
                truncateCache();
            } else {
                syncJournal();
                waitOnLock(SqlJetLockType.EXCLUSIVE);
                doTruncate(nPage);
            }
        }

    }

    /**
     * Truncate the main file of the given pager to the number of pages
     * indicated. Also truncate the cached representation of the file.
     * 
     * Might might be the case that the file on disk is smaller than nPage. This
     * can happen, for example, if we are in the middle of a transaction which
     * has extended the file size and the new pages are still all held in cache,
     * then an INSERT or UPDATE does a statement rollback. Some operating system
     * implementations can get confused if you try to truncate a file to some
     * size that is larger than it currently is, so detect this case and write a
     * single zero byte to the end of the new file instead.
     * 
     * @param page
     */
    private void doTruncate(int pageNumber) throws SqlJetException {
        if (state.compareTo(SqlJetPagerState.EXCLUSIVE) >= 0 && null != fd) {
            long currentSize, newSize;
            currentSize = fd.fileSize();
            newSize = pageSize * pageNumber;
            if (currentSize != newSize) {
                if (currentSize > newSize) {
                    fd.truncate(newSize);
                } else {
                    final byte[] b = new byte[] { (byte) 0 };
                    fd.write(b, 1, newSize - 1);
                }
            }
        }
        dbSize = pageNumber;
        truncateCache();
    }

    /**
     * This routine is used to truncate the cache when a database is truncated.
     * Drop from the cache all pages whose pgno is larger than dbSize and is
     * unreferenced.
     * 
     * Referenced pages larger than dbSize are zeroed.
     * 
     * Actually, at the point this routine is called, it would be an error to
     * have a referenced page. But rather than delete that page and guarantee a
     * subsequent segfault, it seems better to zero it and hope that we error
     * out sanely.
     * 
     * @throws SqlJetException
     */
    private void truncateCache() throws SqlJetException {
        pageCache.truncate(dbSize);
    }

    /**
     * Sync the journal. In other words, make sure all the pages that have been
     * written to the journal have actually reached the surface of the disk. It
     * is not safe to modify the original database file until after the journal
     * has been synced. If the original database is modified before the journal
     * is synced and a power failure occurs, the unsynced journal data would be
     * lost and we would be unable to completely rollback the database changes.
     * Database corruption would occur.
     * 
     * This routine also updates the nRec field in the header of the journal.
     * (See comments on the pager_playback() routine for additional
     * information.) If the sync mode is FULL, two syncs will occur. First the
     * whole journal is synced, then the nRec field is updated, then a second
     * sync occurs.
     * 
     * For temporary databases, we do not care if we are able to rollback after
     * a power failure, so no sync occurs.
     * 
     * If the IOCAP_SEQUENTIAL flag is set for the persistent media on which the
     * database is stored, then OsSync() is never called on the journal file. In
     * this case all that is required is to update the nRec field in the journal
     * header.
     * 
     * This routine clears the needSync field of every page current held in
     * memory.
     */
    private void syncJournal() throws SqlJetException {

        /*
         * Sync the journal before modifying the main database (assuming there
         * is a journal and it needs to be synced.)
         */
        if (needSync) {
            if (!tempFile) {
                assertion(journalOpen);

                final EnumSet<SqlJetDeviceCharacteristics> dc = fd.deviceCharacteristics();

                if (!dc.contains(SqlJetDeviceCharacteristics.IOCAP_SAFE_APPEND)) {
                    /*
                     * Write the nRec value into the journal file header. If in
                     * full-synchronous mode, sync the journal first. This
                     * ensures that all data has really hit the disk before nRec
                     * is updated to mark it as a candidate for rollback.
                     * 
                     * This is not required if the persistent media supports the
                     * SAFE_APPEND property. Because in this case it is not
                     * possible for garbage data to be appended to the file, the
                     * nRec field is populated with 0xFFFFFFFF when the journal
                     * header is written and never needs to be updated.
                     */
                    long jrnlOff;
                    if (fullSync && !dc.contains(SqlJetDeviceCharacteristics.IOCAP_SEQUENTIAL)) {
                        jfd.sync(syncFlags);
                    }

                    jrnlOff = journalHdr + aJournalMagic.length;
                    write32bits(jfd, jrnlOff, nRec);
                }
                if (!dc.contains(SqlJetDeviceCharacteristics.IOCAP_SEQUENTIAL)) {
                    jfd.sync(syncFlags);
                }
                journalStarted = true;
            }

            needSync = false;

            /* Erase the needSync flag from every page. */
            pageCache.clearFlags(EnumSet.of(SqlJetPageFlags.NEED_SYNC));

        }
    }

    /**
     * Write a 32-bit integer into the given file descriptor. Return SQLITE_OK
     * on success or an error code is something goes wrong.
     * 
     * @throws SqlJetException
     */
    static void write32bits(ISqlJetFile fd, long offset, int val) throws SqlJetException {
        final byte[] b = SqlJetUtility.put4byte(val);
        fd.write(b, b.length, offset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#begin(boolean)
     */
    public void begin(boolean exclusive) throws SqlJetException {
        SqlJetException rc = null;
        assertion(state != SqlJetPagerState.UNLOCK);
        if (state == SqlJetPagerState.SHARED) {
            assertion(pagesInJournal == null);
            if (memDb) {
                state = SqlJetPagerState.EXCLUSIVE;
                origDbSize = dbSize;
            } else {
                fd.lock(SqlJetLockType.RESERVED);
                state = SqlJetPagerState.RESERVED;
                if (exclusive) {
                    waitOnLock(SqlJetLockType.EXCLUSIVE);
                }
                dirtyCache = false;
                if (useJournal && !tempFile && journalMode != SqlJetPagerJournalMode.OFF) {
                    openJournal();
                }
            }
        } else if (journalOpen && journalOff == 0) {
            /*
             * This happens when the pager was in exclusive-access mode the last
             * time a (read or write) transaction was successfully concluded by
             * this connection. Instead of deleting the journal file it was kept
             * open and either was truncated to 0 bytes or its header was
             * overwritten with zeros.
             */
            assertion(nRec == 0);
            assertion(origDbSize == 0);
            assertion(pagesInJournal == null);
            getPageCount();
            pagesInJournal = new BitSet(dbSize);
            origDbSize = dbSize;
            writeJournalHdr();
        }
        assertion(!journalOpen || journalOff > 0);
    }

    /**
     * The journal file must be open when this routine is called. A journal
     * header (JOURNAL_HDR_SZ bytes) is written into the journal file at the
     * current location.
     * 
     * The format for the journal header is as follows: - 8 bytes: Magic
     * identifying journal format. - 4 bytes: Number of records in journal, or
     * -1 no-sync mode is on. - 4 bytes: Random number used for page hash. - 4
     * bytes: Initial database page count. - 4 bytes: Sector size used by the
     * process that wrote this journal. - 4 bytes: Database page size.
     * 
     * Followed by (JOURNAL_HDR_SZ - 28) bytes of unused space.
     * 
     */
    private void writeJournalHdr() throws SqlJetException {

        SqlJetException rc = null;

        byte[] zHeader = tmpSpace;
        int nHeader = pageSize;
        int nWrite;

        if (nHeader > JOURNAL_HDR_SZ()) {
            nHeader = JOURNAL_HDR_SZ();
        }

        if (stmtHdrOff == 0) {
            stmtHdrOff = journalOff;
        }

        seekJournalHdr();
        journalHdr = journalOff;

        SqlJetUtility.memcpy(zHeader, aJournalMagic, aJournalMagic.length);

        /*
         * Write the nRec Field - the number of page records that follow this
         * journal header. Normally, zero is written to this value at this time.
         * After the records are added to the journal (and the journal synced,
         * if in full-sync mode), the zero is overwritten with the true number
         * of records (see syncJournal()).
         * 
         * A faster alternative is to write 0xFFFFFFFF to the nRec field. When
         * reading the journal this value tells SQLite to assume that the rest
         * of the journal file contains valid page records. This assumption is
         * dangerous, as if a failure occured whilst writing to the journal file
         * it may contain some garbage data. There are two scenarios where this
         * risk can be ignored:
         * 
         * When the pager is in no-sync mode. Corruption can follow a power
         * failure in this case anyway.
         * 
         * When the SQLITE_IOCAP_SAFE_APPEND flag is set. This guarantees that
         * garbage data is never appended to the journal file.
         */
        assertion(fd != null || noSync);
        if (noSync || fd.deviceCharacteristics().contains(SqlJetDeviceCharacteristics.IOCAP_SAFE_APPEND)) {
            put32bits(zHeader, aJournalMagic.length, 0xffffffff);
        } else {
            put32bits(zHeader, aJournalMagic.length, 0);
        }

        /* The random check-hash initialiser */
        cksumInit = randomnessInt();
        put32bits(zHeader, aJournalMagic.length + 4, cksumInit);

        /* The initial database size */
        put32bits(zHeader, aJournalMagic.length + 8, dbSize);

        /* The assumed sector size for this process */
        put32bits(zHeader, aJournalMagic.length + 8, sectorSize);

        if (journalHdr == 0) {
            /* The page size */
            put32bits(zHeader, aJournalMagic.length + 8, pageSize);
        }

        for (nWrite = 0; rc == null && nWrite < JOURNAL_HDR_SZ(); nWrite += nHeader) {
            try {
                jfd.write(zHeader, nHeader, journalOff);
            } catch (SqlJetException e) {
                rc = e;
            }
            journalOff += nHeader;
        }

        if (rc != null)
            throw rc;
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private int randomnessInt() throws SqlJetException {
        return SqlJetUtility.get4byte(fileSystem.randomness(4));
    }

    /**
     * Write a 32-bit integer into a buffer in big-endian byte order.
     * 
     * @param p
     * @param pos
     * @param v
     */
    private void put32bits(byte[] p, int pos, int v) {
        SqlJetUtility.put4byte(p, pos, v);
    }

    private void put32bits(byte[] p, int v) {
        put32bits(p, 0, v);
    }

    /**
     * Create a journal file for pPager. There should already be a RESERVED or
     * EXCLUSIVE lock on the database file when this routine is called.
     * 
     * Return SQLITE_OK if everything. Return an error code and release the
     * write lock if anything goes wrong.
     */
    void openJournal() throws SqlJetException {

        SqlJetFileType fileType = null;

        EnumSet<SqlJetFileOpenPermission> flags = EnumSet.of(SqlJetFileOpenPermission.READWRITE,
                SqlJetFileOpenPermission.EXCLUSIVE, SqlJetFileOpenPermission.CREATE);

        SqlJetException rc = null;

        assertion(!memDb);
        assertion(state.compareTo(SqlJetPagerState.RESERVED) >= 0);
        assertion(useJournal);
        assertion(pagesInJournal == null);

        getPageCount();
        pagesInJournal = new BitSet(dbSize);

        try {

            if (!journalOpen) {
                if (tempFile) {
                    flags.add(SqlJetFileOpenPermission.DELETEONCLOSE);
                    fileType = SqlJetFileType.TEMP_JOURNAL;
                } else {
                    fileType = SqlJetFileType.MAIN_JOURNAL;
                }
                try {
                    jfd = fileSystem.open(journal, fileType, flags);
                } catch (SqlJetException e) {
                    rc = e;
                }
                assertion(rc != null || jfd != null);
                journalOff = 0;
                setMaster = false;
                journalHdr = 0;

                if (rc != null) {
                    fileSystem.delete(journal, false);
                    throw rc;
                }

            }
            journalOpen = true;
            journalStarted = false;
            needSync = false;
            nRec = 0;
            if (errCode != null) {
                rc = new SqlJetException(errCode);
                throw rc;
            }
            origDbSize = dbSize;

            try {
                writeJournalHdr();
            } catch (SqlJetException e) {
                rc = e;
            }

            if (stmtAutoopen && rc == null) {
                try {
                    stmtBegin();
                } catch (SqlJetException e) {
                    rc = e;
                }
            }
            if (rc != null) {
                rc = null;
                try {
                    endTransaction(false);
                } catch (SqlJetException e) {
                    rc = e;
                }
                if (rc == null) {
                    rc = new SqlJetException(SqlJetErrorCode.FULL);
                    throw rc;
                }
            }

        } finally {
            // failed_to_open_journal:
            if (rc != null) {
                pagesInJournal = null;
                throw rc;
            }

        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseOne(java.lang.String,
     * int, boolean)
     */
    public void commitPhaseOne(String master, int pageNumberTrunc, boolean noSync) throws SqlJetException {

        SqlJetException rc = null;

        if (errCode != null) {
            throw new SqlJetException(errCode);
        }

        /*
         * If no changes have been made, we can leave the transaction early.
         */
        if (!dbModified && (journalMode != SqlJetPagerJournalMode.DELETE || exclusiveMode())) {
            assertion(!dirtyCache || !journalOpen);
            return;
        }

        /*
         * If this is an in-memory db, or no pages have been written to, or this
         * function has already been called, it is a no-op.
         */
        try {
            if (state != SqlJetPagerState.SYNCED && !memDb && dirtyCache) {

                /*
                 * If a master journal file name has already been written to the
                 * journal file, then no sync is required. This happens when it
                 * is written, then the process fails to upgrade from a RESERVED
                 * to an EXCLUSIVE lock. The next time the process tries to
                 * commit the transaction the m-j name will have already been
                 * written.
                 */
                if (!setMaster) {

                    incrChangeCounter();

                    if (journalMode != SqlJetPagerJournalMode.OFF) {

                        if (pageNumberTrunc != 0) {
                            /*
                             * If this transaction has made the database
                             * smaller, then all pages being discarded by the
                             * truncation must be written to the journal file.
                             */
                            int i;
                            long iSkip = PAGER_MJ_PGNO();
                            for (i = pageNumberTrunc + 1; i <= origDbSize; i++) {
                                if (!SqlJetUtility.bitSetTest(pagesInJournal, i) && i != iSkip) {
                                    final ISqlJetPage pg = getPage(i);
                                    pg.write();
                                    pg.unref();
                                }
                            }
                        }

                        writeMasterJournal(master);
                        syncJournal();
                    }
                }

                if (pageNumberTrunc != 0) {
                    truncate(pageNumberTrunc);
                }

                /* Write all dirty pages to the database file */
                final ISqlJetPage dirtyList = pageCache.getDirtyList();
                writePageList(dirtyList);
                /*
                 * The error might have left the dirty list all fouled up here,
                 * but that does not matter because if the if the dirty list did
                 * get corrupted, then the transaction will roll back and
                 * discard the dirty list. There is an assert in
                 * pager_get_all_dirty_pages() that verifies that no attempt is
                 * made to use an invalid dirty list.
                 */
                pageCache.cleanAll();

                /* Sync the database file. */
                if (!this.noSync && !noSync) {
                    fd.sync(syncFlags);
                }

                state = SqlJetPagerState.SYNCED;

            } else if (memDb && pageNumberTrunc != 0) {
                truncate(pageNumberTrunc);
            }

        } catch (SqlJetIOException e) {
            if (e.getIoErrorCode() == SqlJetIOErrorCode.IOERR_BLOCKED) {
                /*
                 * pager_incr_changecounter() may attempt to obtain an exclusive
                 * lock to spill the cache and return IOERR_BLOCKED. But since
                 * there is no chance the cache is inconsistent, it is better to
                 * return SQLITE_BUSY.
                 */
                throw new SqlJetException(SqlJetErrorCode.BUSY);
            }
        }
    }

    /**
     * Given a list of pages (connected by the PgHdr.pDirty pointer) write every
     * one of those pages out to the database file. No calls are made to the
     * page-cache to mark the pages as clean. It is the responsibility of the
     * caller to use PcacheCleanAll() or PcacheMakeClean() to mark the pages as
     * clean.
     * 
     * @param pList
     */
    private void writePageList(ISqlJetPage pList) throws SqlJetException {

        if (pList == null)
            return;

        /*
         * At this point there may be either a RESERVED or EXCLUSIVE lock on the
         * database file. If there is already an EXCLUSIVE lock, the following
         * calls to sqlite3OsLock() are no-ops.
         * 
         * Moving the lock from RESERVED to EXCLUSIVE actually involves going
         * through an intermediate state PENDING. A PENDING lock prevents new
         * readers from attaching to the database but is unsufficient for us to
         * write. The idea of a PENDING lock is to prevent new readers from
         * coming in while we wait for existing readers to clear.
         * 
         * While the pager is in the RESERVED state, the original database file
         * is unchanged and we can rollback without having to playback the
         * journal into the original database file. Once we transition to
         * EXCLUSIVE, it means the database file has been changed and any
         * rollback will require a journal playback.
         */
        waitOnLock(SqlJetLockType.EXCLUSIVE);

        for (ISqlJetPage page = pList; page != null; page = page.getNext()) {

            /* If the file has not yet been opened, open it now. */
            if (null == fd) {
                assertion(tempFile);
                fd = openTemp(type, permissions);
            }

            /*
             * If there are dirty pages in the page cache with page numbers
             * greater than Pager.dbSize, this means sqlite3PagerTruncate() was
             * called to make the file smaller (presumably by auto-vacuum code).
             * Do not write any such pages to the file.
             */
            if (page.getPageNumber() <= dbSize && !page.getFlags().contains(SqlJetPageFlags.DONT_WRITE)) {

                long offset = (page.getPageNumber() - 1) * pageSize;

                byte[] pData = page.getData();

                fd.write(pData, pageSize, offset);
                if (page.getPageNumber() == 1) {
                    SqlJetUtility.memcpy(dbFileVers, 0, pData, 24, dbFileVers.length);
                }
            }

            page.setHash(pageHash(page));
        }

    }

    /**
     * Open a temporary file.
     * 
     * Write the file descriptor into *fd. Return SQLITE_OK on success or some
     * other error code if we fail. The OS will automatically delete the
     * temporary file when it is closed.
     * 
     * @param fd2
     * @param type2
     * @param permissions2
     */
    private ISqlJetFile openTemp(SqlJetFileType type, EnumSet<SqlJetFileOpenPermission> permissions)
            throws SqlJetException {

        final EnumSet<SqlJetFileOpenPermission> flags = null != permissions ? EnumSet.copyOf(permissions) : EnumSet
                .noneOf(SqlJetFileOpenPermission.class);
        flags.add(SqlJetFileOpenPermission.READWRITE);
        flags.add(SqlJetFileOpenPermission.CREATE);
        flags.add(SqlJetFileOpenPermission.EXCLUSIVE);
        flags.add(SqlJetFileOpenPermission.DELETEONCLOSE);
        return fileSystem.open(null, type, flags);

    }

    /**
     * Write the supplied master journal name into the journal file for pager
     * pPager at the current location. The master journal name must be the last
     * thing written to a journal file. If the pager is in full-sync mode, the
     * journal file descriptor is advanced to the next sector boundary before
     * anything is written. The format is:
     * 
     * + 4 bytes: PAGER_MJ_PGNO. + N bytes: length of master journal name. + 4
     * bytes: N + 4 bytes: Master journal name checksum. + 8 bytes:
     * aJournalMagic[].
     * 
     * The master journal page checksum is the sum of the bytes in the master
     * journal name.
     * 
     * If zMaster is a NULL pointer (occurs for a single database transaction),
     * this call is a no-op.
     * 
     * @param master
     */
    private void writeMasterJournal(String master) throws SqlJetException {

        int len;
        int i;
        long jrnlOff;
        long jrnlSize;
        int cksum = 0;
        byte[] zBuf = new byte[aJournalMagic.length + 2 * 4];

        if (null == master || setMaster)
            return;

        setMaster = true;

        final byte[] zMaster = master.getBytes();

        len = zMaster.length;
        for (i = 0; i < len; i++) {
            cksum += zMaster[i];
        }

        /*
         * If in full-sync mode, advance to the next disk sector before writing
         * the master journal name. This is in case the previous page written to
         * the journal has already been synced.
         */
        if (fullSync) {
            seekJournalHdr();
        }
        jrnlOff = journalOff;
        journalOff += (len + 20);

        write32bits(jfd, jrnlOff, int_PAGER_MJ_PGNO());
        jrnlOff += 4;

        jfd.write(zMaster, len, jrnlOff);
        jrnlOff += len;

        put32bits(zBuf, len);
        put32bits(zBuf, 4, cksum);
        SqlJetUtility.memcpy(zBuf, 8, aJournalMagic, 0, aJournalMagic.length);

        try {
            jfd.write(zBuf, zBuf.length, jrnlOff);
        } finally {
            jrnlOff += zBuf.length;
            needSync = !noSync;
        }

        /*
         * If the pager is in peristent-journal mode, then the physical
         * journal-file may extend past the end of the master-journal name and 8
         * bytes of magic data just written to the file. This is dangerous
         * because the code to rollback a hot-journal file will not be able to
         * find the master-journal name to determine whether or not the journal
         * is hot.
         * 
         * Easiest thing to do in this scenario is to truncate the journal file
         * to the required size.
         */
        jrnlSize = jfd.fileSize();
        if (jrnlSize > jrnlOff) {
            jfd.truncate(jrnlOff);
        }
    }

    /**
     * This routine is called to increment the database file change-counter,
     * stored at byte 24 of the pager file.
     * 
     * @param b
     */
    private void incrChangeCounter() throws SqlJetException {

        ISqlJetPage page;
        int change_counter;

        if (!changeCountDone) {
            /* Open page 1 of the file for writing. */
            page = getPage(1);

            try {
                page.write();
            } catch (SqlJetException e) {
                page.unref();
                throw e;
            }

            /* Increment the value just read and write it back to byte 24. */
            change_counter = SqlJetUtility.get4byte(dbFileVers);
            change_counter++;
            put32bits(page.getData(), 24, change_counter);

            /* Release the page reference. */
            page.unref();
            changeCountDone = true;
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#commitPhaseTwo()
     */
    public void commitPhaseTwo() throws SqlJetException {
        if (null != errCode) {
            throw new SqlJetException(errCode);
        }
        if (state.compareTo(SqlJetPagerState.RESERVED) < 0) {
            throw new SqlJetException(SqlJetErrorCode.ERROR);
        }
        if (!dbModified && (journalMode != SqlJetPagerJournalMode.DELETE || !exclusiveMode())) {
            assertion(!dirtyCache || !journalOpen);
            return;
        }
        // PAGERTRACE2("COMMIT %d\n", PAGERID(pPager));
        if (memDb) {
            pageCache.commit(false);
            pageCache.cleanAll();
            state = SqlJetPagerState.SHARED;
        } else {
            assertion(state == SqlJetPagerState.SYNCED || !dirtyCache);
            try {
                endTransaction(setMaster);
            } catch (SqlJetException e) {
                error(e);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#rollback()
     */
    public void rollback() throws SqlJetException {
        // PAGERTRACE2("ROLLBACK %d\n", PAGERID(pPager));
        if (memDb) {
            pageCache.rollback(true, reiniter);
            pageCache.rollback(false, reiniter);
            pageCache.cleanAll();
            dbSize = origDbSize;
            truncateCache();
            stmtInUse = false;
            state = SqlJetPagerState.SHARED;
        } else if (!dirtyCache || !journalOpen) {
            endTransaction(setMaster);
        } else if (null != errCode && errCode != SqlJetErrorCode.FULL) {
            if (state.compareTo(SqlJetPagerState.EXCLUSIVE) >= 0) {
                playback(false);
            }
            throw new SqlJetException(errCode);
        } else {
            try {
                if (state == SqlJetPagerState.RESERVED) {
                    try {
                        playback(false);
                    } finally {
                        endTransaction(setMaster);
                    }
                } else {
                    playback(false);
                }
            } catch (SqlJetException e) {
                dbSize = -1;
                /*
                 * If an error occurs during a ROLLBACK, we can no longer trust
                 * the pager cache. So call pager_error() on the way out to make
                 * any error persistent.
                 */
                error(e);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtBegin()
     */
    public void stmtBegin() throws SqlJetException {
        assertion(!stmtInUse);
        assertion(state.compareTo(SqlJetPagerState.SHARED) >= 0);
        assertion(dbSize >= 0);
        // PAGERTRACE2("STMT-BEGIN %d\n", PAGERID(pPager));
        if (memDb) {
            stmtInUse = true;
            stmtSize = dbSize;
            return;
        }
        if (!journalOpen) {
            stmtAutoopen = true;
            return;
        }
        assertion(journalOpen);
        assertion(null == pagesInStmt);
        pagesInStmt = new BitSet(dbSize);
        stmtJSize = journalOff;
        stmtSize = dbSize;
        stmtHdrOff = 0;
        stmtCksum = cksumInit;
        if (!stmtOpen) {
            try {
                stfd = openTemp(SqlJetFileType.SUBJOURNAL, null);
                stmtOpen = true;
                stmtNRec = 0;
            } catch (SqlJetException e) {
                // stmt_begin_failed:
                if (null != pagesInStmt) {
                    pagesInStmt = null;
                }
                throw e;
            }
        }
        stmtInUse = true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtCommit()
     */
    public void stmtCommit() throws SqlJetException {
        if (stmtInUse) {
            // PAGERTRACE2("STMT-COMMIT %d\n", PAGERID(pPager));
            if (!memDb) {
                pagesInStmt = null;
            } else {
                pageCache.commit(true);
            }
            stmtNRec = 0;
            stmtInUse = false;
        }
        stmtAutoopen = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#stmtRollback()
     */
    public void stmtRollback() throws SqlJetException {
        if (stmtInUse) {
            // PAGERTRACE2("STMT-ROLLBACK %d\n", PAGERID(pPager));
            if (memDb) {
                pageCache.rollback(true, reiniter);
                dbSize = stmtSize;
                truncateCache();
            } else {
                stmtPlayback();
            }
            stmtCommit();
        }
        stmtAutoopen = false;
    }

    /**
     * Playback the statement journal.
     * 
     * This is similar to playing back the transaction journal but with a few
     * extra twists.
     * 
     * (1) The number of pages in the database file at the start of the
     * statement is stored in pPager->stmtSize, not in the journal file itself.
     * 
     * (2) In addition to playing back the statement journal, also playback all
     * pages of the transaction journal beginning at offset pPager->stmtJSize.
     */
    private void stmtPlayback() throws SqlJetException {
        long szJ; /* Size of the full journal */
        long hdrOff;
        int nRec; /* Number of Records */
        long i; /* Loop counter */
        int rc;

        szJ = journalOff;

        /*
         * Set hdrOff to be the offset just after the end of the last journal
         * page written before the first journal-header for this statement
         * transaction was written, or the end of the file if no journal header
         * was written.
         */
        hdrOff = stmtHdrOff;
        assertion(fullSync || 0 == hdrOff);
        if (0 == hdrOff) {
            hdrOff = szJ;
        }

        /*
         * Truncate the database back to its original size.
         */
        try {
            doTruncate(stmtSize);
        } finally {
            assertion(state.compareTo(SqlJetPagerState.SHARED) >= 0);
        }

        /*
         * Figure out how many records are in the statement journal.
         */
        assertion(stmtInUse && journalOpen);
        nRec = stmtNRec;

        /*
         * Copy original pages out of the statement journal and back into the
         * database file. Note that the statement journal omits checksums from
         * each record since power-failure recovery is not important to
         * statement journals.
         */
        for (i = 0; i < nRec; i++) {
            long offset = i * (4 + pageSize);
            playbackOnePage(stfd, offset, false);
        }

        /*
         * Now roll some pages back from the transaction journal.
         * Pager.stmtJSize was the size of the journal file when this statement
         * was started, so everything after that needs to be rolled back, either
         * into the database, the memory cache, or both.
         * 
         * If it is not zero, then Pager.stmtHdrOff is the offset to the start
         * of the first journal header written during this statement
         * transaction.
         */
        journalOff = stmtJSize;
        cksumInit = stmtCksum;
        while (journalOff < hdrOff) {
            playbackOnePage(jfd, journalOff, true);
        }

        while (journalOff < szJ) {
            long nJRec; /* Number of Journal Records */
            final int[] a = readJournalHdr(szJ);
            nJRec = a[0];
            if (nJRec == 0) {
                nJRec = (szJ - journalOff) / (pageSize + 8);
            }
            for (i = nJRec - 1; i >= 0 && journalOff < szJ; i--) {
                playbackOnePage(jfd, journalOff, true);
            }
        }

        journalOff = szJ;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#sync()
     */
    public void sync() throws SqlJetException {
        if (!memDb) {
            fd.sync(syncFlags);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#refCount()
     */
    public int getRefCount() throws SqlJetException {
        return pageCache.getRefCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageDestructor#pageDestructor(org.tmatesoft
     * .sqljet.core.ISqlJetPage)
     */
    public void pageCallback(final ISqlJetPage page) throws SqlJetException {
        /*
         * This function is called by the pcache layer when it has reached some
         * soft memory limit. The argument is a pointer to a purgeable Pager
         * object. This function attempts to make a single dirty page that has
         * no outstanding references (if one exists) clean so that it can be
         * recycled by the pcache layer.
         */

        if (doNotSync) {
            return;
        }

        assertion(page.getFlags().contains(SqlJetPageFlags.DIRTY));
        if (errCode == null) {
            try {
                if (page.getFlags().contains(SqlJetPageFlags.NEED_SYNC)) {
                    syncJournal();
                    if (fullSync && !fd.deviceCharacteristics().contains(SqlJetDeviceCharacteristics.IOCAP_SAFE_APPEND)) {
                        nRec = 0;
                        writeJournalHdr();
                    }
                }
                writePageList(page);
            } catch (SqlJetException e) {
                error(e);
            }
        }
        pageCache.makeClean(page);
    }

}
