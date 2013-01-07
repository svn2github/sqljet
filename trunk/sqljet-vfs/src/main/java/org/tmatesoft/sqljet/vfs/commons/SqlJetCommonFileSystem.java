/**
 * SqlJetCommonFileSystem.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetFile;
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.internal.SqlJetFileAccesPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;

/**
 * 
 * @author TMate Software Ltd.
 */
public class SqlJetCommonFileSystem implements ISqlJetFileSystem {

    public String getName() {
        return null;
    }

    public ISqlJetFile open(File path, SqlJetFileType type, Set<SqlJetFileOpenPermission> permissions) throws SqlJetException {
        return null;
    }

    public ISqlJetFile memJournalOpen() {
        return null;
    }

    public boolean delete(File path, boolean sync) throws SqlJetException {
        return false;
    }

    public boolean access(File path, SqlJetFileAccesPermission permission) throws SqlJetException {
        return false;
    }

    public byte[] randomness(int numBytes) {
        return null;
    }

    public long sleep(long microseconds) {
        return 0;
    }

    public long currentTime() {
        return 0;
    }

    public File getTempFile() throws IOException {
        return null;
    }

    public String getFullPath(File filename) throws SqlJetException {
        return null;
    }

}
