/**
 * SqlJetFile.java
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
package org.tmatesoft.sqljet.core.internal.fs;

import static org.tmatesoft.sqljet.core.SqlJetException.assertion;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetIOErrorCode;
import org.tmatesoft.sqljet.core.SqlJetIOException;
import org.tmatesoft.sqljet.core.SqlJetLockType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFile implements ISqlJetFile {

    public static final int SQLJET_DEFAULT_SECTOR_SIZE = 512;

    /**
     * An instance of the following structure is allocated for each open inode
     * on each thread with a different process ID. A single inode can have
     * multiple file descriptors, so each unixFile structure contains a pointer
     * to an instance of this object and this object keeps a count of the number
     * of unixFile pointing to it.
     */
    private class FileLockInfo {
        private SqlJetLockType lockType = SqlJetLockType.NONE;
        /** Number of SHARED locks held */
        private int sharedLockCount = 0;
        /** Number of pointers to this structure */
        private int numRef = 1;
    };

    /**
     * An instance of the following structure is allocated for each open inode.
     * This structure keeps track of the number of locks on that inode. If a
     * close is attempted against an inode that is holding locks, the close is
     * deferred until all locks clear by adding the file descriptor to be closed
     * to the pending list.
     */
    private class FileOpenCount {
        /** Number of pointers to this structure */
        private int numRef = 1;
        /** Number of outstanding locks */
        private int numLock = 0;
        private Map<Thread, FileLockInfo> threadsLockInfo = new ConcurrentHashMap<Thread, FileLockInfo>();
        /** Malloced space holding fd's awaiting a close() */
        private List<RandomAccessFile> pending = new ArrayList<RandomAccessFile>();
    };

    private static Map<String, FileOpenCount> filesOpenCounts = new ConcurrentHashMap<String, FileOpenCount>();

    private SqlJetFileType fileType;
    private EnumSet<SqlJetFileOpenPermission> permissions;
    private SqlJetFileSystem fileSystem;
    private RandomAccessFile file;
    private File filePath;
    private String filePathAbsolute;
    private boolean noLock;

    private SqlJetLockType lockType = SqlJetLockType.NONE;
    private Map<SqlJetLockType, FileLock> locks = new ConcurrentHashMap<SqlJetLockType, FileLock>();

    private Thread thread = Thread.currentThread();
    private FileOpenCount openCount = null;
    private FileLockInfo lockInfo = null;

    /**
     * @param fileSystem
     * @param file
     * @param filePath
     * @param permissions
     * @param type
     * @param noLock
     */

    SqlJetFile(final SqlJetFileSystem fileSystem, final RandomAccessFile file, final File filePath,
            final SqlJetFileType fileType, final EnumSet<SqlJetFileOpenPermission> permissions, final boolean noLock) {

        this.fileSystem = fileSystem;
        this.file = file;
        this.filePath = filePath;
        this.filePathAbsolute = filePath.getAbsolutePath();
        this.fileType = fileType;
        this.permissions = permissions;
        this.noLock = noLock;

        findLockInfo();

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#getFileType()
     */
    public SqlJetFileType getFileType() {
        return fileType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#getPermissions()
     */
    public synchronized EnumSet<SqlJetFileOpenPermission> getPermissions() {
        // return clone to avoid manipulations with file's permissions
        return permissions.clone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#close()
     */
    public synchronized void close() throws SqlJetException {
        if (null == file)
            return;

        if (!noLock && SqlJetLockType.NONE != lockType) {
            unlock(SqlJetLockType.NONE);

            /*
             * If there are outstanding locks, do not actually close the file
             * just yet because that would clear those locks. Instead, add the
             * file descriptor to pOpen->aPending. It will be automatically
             * closed when the last lock is cleared.
             */
            if (null != openCount && null != lockInfo && lockInfo.sharedLockCount > 0) {
                openCount.pending.add(file);
                return;
            }
        }

        try {
            file.close();
        } catch (IOException e) {
            throw new SqlJetException(SqlJetErrorCode.IOERR, e);
        } finally {
            file = null;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#read(byte[], int, long)
     */
    public synchronized int read(byte[] buffer, int amount, long offset) throws SqlJetException {
        assertion(amount > 0);
        assertion(offset >= 0);
        assertion(buffer);
        assertion(buffer.length >= amount);
        assertion(file);
        try {
            final ByteBuffer dst = ByteBuffer.wrap(buffer, 0, amount);
            final int read = file.getChannel().position(offset).read(dst);
            if (amount > read)
                Arrays.fill(buffer, read < 0 ? 0 : read, amount, (byte) 0);
            return read < 0 ? 0 : read;
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_READ, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#write(byte[], int, long)
     */
    public synchronized void write(byte[] buffer, int amount, long offset) throws SqlJetException {
        assertion(amount > 0);
        assertion(offset >= 0);
        assertion(buffer);
        assertion(buffer.length >= amount);
        assertion(file);
        try {
            final ByteBuffer src = ByteBuffer.wrap(buffer, 0, amount);
            file.getChannel().position(offset).write(src);
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_WRITE, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#truncate(long)
     */
    public synchronized void truncate(long size) throws SqlJetException {
        assertion(size >= 0);
        assertion(file);
        try {
            file.setLength(size);
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_TRUNCATE, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sync(boolean, boolean)
     */
    public synchronized void sync(boolean dataOnly, boolean full) throws SqlJetException {
        assertion(file);
        try {
            file.getChannel().force(!dataOnly || full);
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_FSYNC, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#fileSize()
     */
    public synchronized long fileSize() throws SqlJetException {
        assertion(file);
        try {
            return file.getChannel().size();
        } catch (IOException e) {
            throw new SqlJetException(SqlJetErrorCode.IOERR, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#lockType()
     */
    public synchronized SqlJetLockType getLockType() throws SqlJetException {
        return lockType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFile#lock(org.tmatesoft.sqljet.core.
     * SqlJetLockType)
     */

    public synchronized boolean lock(final SqlJetLockType lockType) throws SqlJetException {
        assertion(lockType);
        assertion(file);

        /*
         * The following describes the implementation of the various locks and
         * lock transitions in terms of the POSIX advisory shared and exclusive
         * lock primitives (called read-locks and write-locks below, to avoid
         * confusion with SQLite lock names). The algorithms are complicated
         * slightly in order to be compatible with windows systems
         * simultaneously accessing the same database file, in case that is ever
         * required.
         * 
         * Symbols defined in os.h indentify the 'pending byte' and the
         * 'reserved byte', each single bytes at well known offsets, and the
         * 'shared byte range', a range of 510 bytes at a well known offset.
         * 
         * To obtain a SHARED lock, a read-lock is obtained on the 'pending
         * byte'. If this is successful, a random byte from the 'shared byte
         * range' is read-locked and the lock on the 'pending byte' released.
         * 
         * A process may only obtain a RESERVED lock after it has a SHARED lock.
         * A RESERVED lock is implemented by grabbing a write-lock on the
         * 'reserved byte'.
         * 
         * A process may only obtain a PENDING lock after it has obtained a
         * SHARED lock. A PENDING lock is implemented by obtaining a write-lock
         * on the 'pending byte'. This ensures that no new SHARED locks can be
         * obtained, but existing SHARED locks are allowed to persist. A process
         * does not have to obtain a RESERVED lock on the way to a PENDING lock.
         * This property is used by the algorithm for rolling back a journal
         * file after a crash.
         * 
         * An EXCLUSIVE lock, obtained after a PENDING lock is held, is
         * implemented by obtaining a write-lock on the entire 'shared byte
         * range'. Since all other locks require a read-lock on one of the bytes
         * within this range, this ensures that no other locks are held on the
         * database.
         * 
         * The reason a single byte cannot be used instead of the 'shared byte
         * range' is that some versions of windows do not support read-locks. By
         * locking a random byte from a range, concurrent SHARED locks may exist
         * even if the locking primitive used is always a write-lock.
         */

        if (noLock)
            return false;

        /*
         * If there is already a lock of this type or more restrictive on the
         * file then do nothing.
         */
        if (this.lockType.compareTo(lockType) > 0)
            return false;

        /* Make sure the locking sequence is correct */
        assertion(lockType != SqlJetLockType.PENDING);
        assertion(this.lockType != SqlJetLockType.NONE || lockType == SqlJetLockType.SHARED);
        assertion(lockType != SqlJetLockType.RESERVED || this.lockType == SqlJetLockType.SHARED);

        assertion(lockInfo);

        /*
         * If some thread using this PID has a lock via a different unixFile
         * handle that precludes the requested lock, return BUSY.
         */
        if (this.lockType != lockInfo.lockType
                && (SqlJetLockType.PENDING.compareTo(lockInfo.lockType) <= 0 || SqlJetLockType.SHARED
                        .compareTo(lockType) < 0)) {
            return false;
        }

        /*
         * If a SHARED lock is requested, and some thread using this PID already
         * has a SHARED or RESERVED lock, then increment reference counts and
         * return SQLITE_OK.
         */
        if (lockType == SqlJetLockType.SHARED
                && (lockInfo.lockType == SqlJetLockType.SHARED || lockInfo.lockType == SqlJetLockType.RESERVED)) {
            this.lockType = SqlJetLockType.SHARED;
            lockInfo.sharedLockCount++;
            openCount.numLock++;
            return true;
        }

        try {

            final FileChannel channel = file.getChannel();

            /*
             * A PENDING lock is needed before acquiring a SHARED lock and
             * before acquiring an EXCLUSIVE lock. For the SHARED lock, the
             * PENDING will be released.
             */

            if (lockType == SqlJetLockType.SHARED
                    || (lockType == SqlJetLockType.EXCLUSIVE && this.lockType.compareTo(SqlJetLockType.PENDING) < 0)) {
                final FileLock pendingLock = channel.tryLock(PENDING_BYTE, 1, lockType == SqlJetLockType.SHARED);
                locks.put(SqlJetLockType.PENDING, pendingLock);
                if (null == pendingLock)
                    return false;
            }

            /*
             * If control gets to this point, then actually go ahead and make
             * operating system calls for the specified lock.
             */
            if (lockType == SqlJetLockType.SHARED) {

                /* Now get the read-lock */
                final FileLock sharedLock = channel.tryLock(SHARED_FIRST, SHARED_SIZE, true);
                locks.put(SqlJetLockType.SHARED, sharedLock);

                /* Drop the temporary PENDING lock */
                final FileLock pendingLock = locks.get(SqlJetLockType.PENDING);
                if (null != pendingLock) {
                    pendingLock.release();
                    locks.remove(SqlJetLockType.PENDING);
                }

                if (null == sharedLock)
                    return false;

                this.lockType = SqlJetLockType.SHARED;
                openCount.numLock++;
                lockInfo.sharedLockCount=1;
                
            } else if (lockType == SqlJetLockType.EXCLUSIVE && lockInfo.sharedLockCount > 1) {
                /*
                 * We are trying for an exclusive lock but another thread in
                 * this same process is still holding a shared lock.
                 */
                return false;

            } else {
                /*
                 * The request was for a RESERVED or EXCLUSIVE lock. It is
                 * assumed that there is a SHARED or greater lock on the file
                 * already.
                 */
                assertion(SqlJetLockType.NONE != this.lockType);

                switch (lockType) {
                case RESERVED:
                    final FileLock reservedLock = channel.tryLock(RESERVED_BYTE, 1, false);
                    locks.put(SqlJetLockType.RESERVED, reservedLock);
                    if (null == reservedLock)
                        return false;
                    break;
                case EXCLUSIVE:
                    final FileLock sharedLock = locks.get(SqlJetLockType.SHARED);
                    if (null != sharedLock) {
                        sharedLock.release();
                        locks.remove(SqlJetLockType.SHARED);
                    }
                    final FileLock exclusiveLock = channel.tryLock(SHARED_FIRST, SHARED_SIZE, false);
                    locks.put(SqlJetLockType.EXCLUSIVE, exclusiveLock);
                    if (null == exclusiveLock) {
                        this.lockType = SqlJetLockType.PENDING;
                        lockInfo.lockType = SqlJetLockType.PENDING;
                        return false;
                    }
                    break;
                default:
                    assertion(false);
                }

            }

            this.lockType = lockType;
            lockInfo.lockType = lockType;
            return true;
            
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_LOCK, e);
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFile#unlock(org.tmatesoft.sqljet.core
     * .SqlJetLockType)
     */
    public synchronized boolean unlock(final SqlJetLockType lockType) throws SqlJetException {
        assertion(lockType);
        assertion(file);

        /*
         * Lower the locking level on file descriptor pFile to locktype.
         * locktype must be either NONE or SHARED.
         * 
         * If the locking level of the file descriptor is already at or below
         * the requested locking level, this routine is a no-op.
         */

        if (noLock)
            return false;

        assertion(SqlJetLockType.SHARED.compareTo(lockType) >= 0);
        if (this.lockType.compareTo(lockType) <= 0)
            return true;

        assertion(lockInfo);
        assertion(lockInfo.sharedLockCount > 0);

        try {

            final FileChannel channel = file.getChannel();

            if (SqlJetLockType.SHARED.compareTo(this.lockType) < 0) {

                if (SqlJetLockType.SHARED == lockType) {

                    final FileLock sharedLock = channel.lock(SHARED_FIRST, SHARED_SIZE, true);
                    if (null == sharedLock)
                        return false;
                    locks.put(SqlJetLockType.SHARED, sharedLock);

                }

                final FileLock reservedLock = locks.get(SqlJetLockType.RESERVED);
                if (null != reservedLock) {
                    if (reservedLock.isValid())
                        reservedLock.release();
                    locks.remove(SqlJetLockType.PENDING);
                }

                final FileLock pendingLock = locks.get(SqlJetLockType.PENDING);
                if (null != pendingLock) {
                    if (pendingLock.isValid())
                        pendingLock.release();
                    locks.remove(SqlJetLockType.PENDING);
                }

                this.lockType = SqlJetLockType.SHARED;

            }
            if (lockType == SqlJetLockType.NONE) {
                /*
                 * Decrement the shared lock counter. Release the lock using an
                 * OS call only when all threads in this same process have
                 * released the lock.
                 */
                lockInfo.sharedLockCount--;
                if (lockInfo.sharedLockCount == 0) {
                    lockInfo.sharedLockCount = 1;
                    for (final FileLock l : locks.values()) {
                        if (l.isValid())
                            l.release();
                    }
                    locks.clear();
                    lockInfo.sharedLockCount = 0;
                    this.lockType = SqlJetLockType.NONE;
                }
            }

            this.lockType = lockType;

        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_LOCK, e);
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#checkReservedLock()
     */
    public synchronized boolean checkReservedLock() {

        if (noLock)
            return false;
        
        if (null == file)
            return false;

        if (null==lockInfo)
            return false;
        
        /* Check if a thread in this process holds such a lock */
        if (SqlJetLockType.SHARED.compareTo(lockInfo.lockType) < 0)
            return true;

        /* Otherwise see if some other process holds it. */
        try {

            final FileLock reservedLock = file.getChannel().tryLock(RESERVED_BYTE, 1, false);

            if (null == reservedLock)
                return true;

            reservedLock.release();

        } catch (IOException e) {
        }

        return false;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sectorSize()
     */
    public int sectorSize() {
        return SQLJET_DEFAULT_SECTOR_SIZE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#deviceCharacteristics()
     */
    public EnumSet<SqlJetDeviceCharacteristics> deviceCharacteristics() {
        return null;
    }

    private synchronized void findLockInfo() {
        if (null == openCount) {
            final FileOpenCount fileOpenCount = filesOpenCounts.get(filePathAbsolute);
            if (null != fileOpenCount) {
                openCount = fileOpenCount;
                openCount.numRef++;
            } else {
                openCount = new FileOpenCount();
                filesOpenCounts.put(filePathAbsolute, openCount);
            }
        }
        final Thread currentThread = Thread.currentThread();
        final FileLockInfo fileLockInfo = openCount.threadsLockInfo.get(currentThread);
        if (null != fileLockInfo) {
            lockInfo = fileLockInfo;
            lockInfo.numRef++;
        } else {
            lockInfo = new FileLockInfo();
            openCount.threadsLockInfo.put(currentThread, lockInfo);
        }
    }
}
