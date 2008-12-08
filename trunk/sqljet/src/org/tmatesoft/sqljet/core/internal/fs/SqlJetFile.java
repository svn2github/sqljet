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

import java.io.File;
import java.io.RandomAccessFile;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetLockType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFile implements ISqlJetFile {

    private SqlJetFileType fileType;
    private EnumSet<SqlJetFileOpenPermission> permissions;
    private SqlJetFileSystem fileSystem;
    private RandomAccessFile file;
    private File filePath;
    private boolean noLock;

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
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#checkReservedLock()
     */
    public boolean checkReservedLock() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#close()
     */
    public void close() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#deviceCharacteristics()
     */
    public EnumSet<SqlJetDeviceCharacteristics> deviceCharacteristics() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#fileSize()
     */
    public long fileSize() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFile#lock(org.tmatesoft.sqljet.core.
     * SqlJetLockType)
     */
    public boolean lock(SqlJetLockType lockType) throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#lockType()
     */
    public SqlJetLockType lockType() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#read(byte[], int, long)
     */
    public int read(byte[] buffer, int amount, long offset) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sectorSize()
     */
    public int sectorSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sync(boolean, boolean)
     */
    public void sync(boolean dataOnly, boolean full) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#truncate(long)
     */
    public boolean truncate(long size) throws SqlJetException {
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
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#write(byte[], int, long)
     */
    public void write(byte[] buffer, int amount, long offset) throws SqlJetException {
        // TODO Auto-generated method stub
    }

}
