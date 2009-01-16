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

    boolean journalOpen; /* True if journal file descriptors is valid */
    boolean journalStarted; /* True if header of journal is synced */
    boolean useJournal; /* Use a rollback journal on this file */
    boolean noReadlock; /* Do not bother to obtain readlocks */
    boolean stmtOpen; /* True if the statement subjournal is open */
    boolean stmtInUse; /* True we are in a statement subtransaction */
    boolean stmtAutoopen; /* Open stmt journal when main journal is opened */
    boolean noSync; /* Do not sync the journal if true */
    boolean fullSync; /* Do extra syncs of the journal for robustness */
    boolean syncDataOnly; /* One of SYNC_NORMAL or SYNC_FULL */
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
    ISqlJetFile fd, jfd; /* File descriptors for database and journal */
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
        this.syncDataOnly = false;

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
        if (pInJournal != null)
            pInJournal.clear();
        if (pAlwaysRollback != null)
            pAlwaysRollback.clear();
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
        pCache.close();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#acquire(int, boolean)
     */
    public ISqlJetPage acquirePage(final int pageNumber, final boolean read) throws SqlJetException {

        assertion(state == SqlJetPagerState.UNLOCK || pCache.getRefCount() > 0 || pageNumber == 1);

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

        final ISqlJetPage page = pCache.fetch(pageNumber, true);

        if (null == page.getPager()) {
            /*
             * The pager cache has created a new page. Its content needs to be
             * initialized.
             */
            page.setPager(this);

            if (pInJournal.get(pageNumber)) {
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
            // #ifdef SQLITE_CHECK_PAGES
            page.setHash(pageHash(page));
            // #endif
        } else {
            /* The requested page is in the page cache. */
            assert (pCache.getRefCount() > 0 || 1 == pageNumber);
            if (read) {
                try {
                    get_content(page);
                } catch (SqlJetException e) {
                    page.unref();
                    throw e;
                }
            }
        }

        // TODO Auto-generated method stub
        return null;

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
    private void get_content(final ISqlJetPage page) throws SqlJetException {
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
     */
    private long pageHash(ISqlJetPage page) {
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
        pCache.drop(page);
        unlockIfUnused();
    }

    /**
     * If the reference count has reached zero, and the pager is not in the
     * middle of a write transaction or opened in exclusive mode, unlock it.
     * 
     * @throws SqlJetException
     */
    private void unlockIfUnused() throws SqlJetException {
        if ((pCache.getRefCount() == 0) && (SqlJetPagerLockingMode.EXCLUSIVE != lockingMode || journalOff > 0)) {
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
            System.arraycopy(dbFileVers, 0, data, 2, dbFileVers.length);
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
        if (!memDb && lockingMode == SqlJetPagerLockingMode.EXCLUSIVE && pCache.getRefCount() == 0 && null != errCode) {
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
                    assertion(pCache.getRefCount() == 0);

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

                    if (pCache.getPageCount() > 0) {
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
     * @param b
     */
    private void playback(boolean b) throws SqlJetException {

        // TODO Auto-generated method stub

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
            return pCache.fetch(pageNumber, false);
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
     */
    private void truncateCache() {
        pCache.truncate(dbSize);
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
                        jfd.sync(syncDataOnly, fullSync);
                    }

                    jrnlOff = journalHdr + aJournalMagic.length;
                    write32bits(jfd, jrnlOff, nRec);
                }
                if (!dc.contains(SqlJetDeviceCharacteristics.IOCAP_SEQUENTIAL)) {
                    jfd.sync(syncDataOnly, fullSync);
                }
                journalStarted = true;
            }

            needSync = false;

            /* Erase the needSync flag from every page. */
            pCache.clearFlags(EnumSet.of(SqlJetPageFlags.NEED_SYNC));

        }
    }

    /**
     * Write a 32-bit integer into the given file descriptor. Return SQLITE_OK
     * on success or an error code is something goes wrong.
     * 
     * @throws SqlJetException
     */
    private void write32bits(ISqlJetFile fd, long offset, int val) throws SqlJetException {
        final byte[] b = SqlJetUtility.put4byte(val);
        fd.write(b, b.length, offset);
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
     * @see org.tmatesoft.sqljet.core.ISqlJetPager#begin(boolean)
     */
    public void begin(boolean exclusive) throws SqlJetException {
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

}
