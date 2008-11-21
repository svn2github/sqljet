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

import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetLockType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetFile implements ISqlJetFile {

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#checkReservedLock()
     */
    public boolean checkReservedLock() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#close()
     */
    public void close() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#deviceCharacteristics()
     */
    public EnumSet<SqlJetDeviceCharacteristics> deviceCharacteristics() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#fileSize()
     */
    public long fileSize() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#getPermissions()
     */
    public EnumSet<SqlJetFileOpenPermission> getPermissions() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#lock(org.tmatesoft.sqljet.core.SqlJetLockType)
     */
    public void lock(SqlJetLockType lockType) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#lockType()
     */
    public SqlJetLockType lockType() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#read(byte[], int, long)
     */
    public int read(byte[] buffer, int amount, long offset) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sectorSize()
     */
    public int sectorSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#sync(boolean, boolean)
     */
    public void sync(boolean dataOnly, boolean full) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#truncate(long)
     */
    public boolean truncate(long size) throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#unlock(org.tmatesoft.sqljet.core.SqlJetLockType)
     */
    public void unlock(SqlJetLockType lockType) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFile#write(byte[], int, long)
     */
    public int write(byte[] buffer, int amount, long offset) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

}
