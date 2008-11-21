/**
 * SqlJetFileSystem.java
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
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileAccesPermission;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetFileSystem implements ISqlJetFileSystem {

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#access(java.io.File, org.tmatesoft.sqljet.core.SqlJetFileAccesPermission)
     */
    public boolean access(File path, SqlJetFileAccesPermission permission) throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#currentTime()
     */
    public double currentTime() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#delete(java.io.File, boolean)
     */
    public boolean delete(File path, boolean sync) throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#getName()
     */
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#open(java.io.File, java.util.EnumSet)
     */
    public ISqlJetFile open(File path, EnumSet<SqlJetFileOpenPermission> permissions) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#randomness(int)
     */
    public byte[] randomness(int numBytes) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#sleep(int)
     */
    public int sleep(int microseconds) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

}
