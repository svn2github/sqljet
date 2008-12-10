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
import java.util.Arrays;
import java.util.EnumSet;

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

    private SqlJetFileType fileType;
    private EnumSet<SqlJetFileOpenPermission> permissions;
    private SqlJetFileSystem fileSystem;
    private RandomAccessFile file;
    private File filePath;
    private boolean noLock;

    private SqlJetLockType lockType = SqlJetLockType.NONE;

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
        this.fileType = fileType;
        this.permissions = permissions;
        this.noLock = noLock;

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
    public EnumSet<SqlJetFileOpenPermission> getPermissions() {
        // return clone to avoid manipulations with file's permissions
        return permissions.clone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#close()
     */
    public synchronized void close() throws SqlJetException {
        if (SqlJetLockType.NONE != lockType)
            unlock(SqlJetLockType.NONE);
        if (null != file) {
            try {
                file.close();
            } catch (IOException e) {
                throw new SqlJetException(SqlJetErrorCode.IOERR, e);
            } finally {
                file = null;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#read(byte[], int, long)
     */
    public int read(byte[] buffer, int amount, long offset) throws SqlJetException {
        assertion(amount > 0);
        assertion(offset >= 0);
        assertion(buffer);
        assertion(buffer.length >= amount);
        assertion(file);
        try {
            final ByteBuffer dst = ByteBuffer.wrap(buffer, 0, amount);
            final int read = file.getChannel().position(offset).read(dst);
            if (amount > read)
                Arrays.fill(buffer, read<0?0:read, amount, (byte) 0);
            return read<0?0:read;
        } catch (IOException e) {
            throw new SqlJetIOException(SqlJetIOErrorCode.IOERR_READ, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#write(byte[], int, long)
     */
    public void write(byte[] buffer, int amount, long offset) throws SqlJetException {
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
    public void truncate(long size) throws SqlJetException {
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
    public void sync(boolean dataOnly, boolean full) throws SqlJetException {
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
    public long fileSize() throws SqlJetException {
        assertion(file);
        try {
            return file.length();
        } catch (IOException e) {
            throw new SqlJetException(SqlJetErrorCode.IOERR, e);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#lockType()
     */
    public SqlJetLockType getLockType() throws SqlJetException {
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
         * If there is already a lock of this type or more restrictive on the
         * file then do nothing.
         */
        if (this.lockType.compareTo(lockType) > 0)
            return false;

        /* Make sure the locking sequence is correct */
        assert (lockType != SqlJetLockType.PENDING);
        assert (this.lockType != SqlJetLockType.NONE || lockType == SqlJetLockType.SHARED);
        assert (lockType != SqlJetLockType.RESERVED || this.lockType == SqlJetLockType.SHARED);

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFile#unlock(org.tmatesoft.sqljet.core
     * .SqlJetLockType)
     */
    public boolean unlock(SqlJetLockType lockType) throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#checkReservedLock()
     */
    public boolean checkReservedLock() {
        // TODO Auto-generated method stub
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

}
