/**
 * SqlJetCommonFile.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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
package org.tmatesoft.sqljet.vfs.commons;

import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetIOException;
import org.tmatesoft.sqljet.core.internal.ISqlJetFile;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.SqlJetDeviceCharacteristics;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.SqlJetLockType;
import org.tmatesoft.sqljet.core.internal.SqlJetSyncFlags;

/**
 * 
 * @author TMate Software Ltd.
 */
public class SqlJetCommonFile implements ISqlJetFile {

    public SqlJetFileType getFileType() {
        return null;
    }

    public Set<SqlJetFileOpenPermission> getPermissions() {
        return null;
    }

    public void close() throws SqlJetException {
    }

    public int read(ISqlJetMemoryPointer buffer, int amount, long offset) throws SqlJetIOException {
        return 0;
    }

    public void write(ISqlJetMemoryPointer buffer, int amount, long offset) throws SqlJetIOException {
    }

    public void truncate(long size) throws SqlJetIOException {
    }

    public void sync(Set<SqlJetSyncFlags> syncFlags) throws SqlJetIOException {
    }

    public long fileSize() throws SqlJetException {
        return 0;
    }

    public boolean lock(SqlJetLockType lockType) throws SqlJetIOException {
        return false;
    }

    public boolean unlock(SqlJetLockType lockType) throws SqlJetIOException {
        return false;
    }

    public boolean checkReservedLock() {
        return false;
    }

    public SqlJetLockType getLockType() {
        return null;
    }

    public int sectorSize() {
        return 0;
    }

    public Set<SqlJetDeviceCharacteristics> deviceCharacteristics() {
        return null;
    }

    public boolean isMemJournal() {
        return false;
    }

}
