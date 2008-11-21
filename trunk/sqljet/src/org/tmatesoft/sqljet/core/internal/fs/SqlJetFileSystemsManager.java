/**
 * SqlJetFileSystemsManager.java
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

import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetFileSystemsManager implements ISqlJetFileSystemsManager {

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#find(java.lang.String)
     */
    public ISqlJetFileSystem find(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#register(org.tmatesoft.sqljet.core.ISqlJetFileSystem, boolean)
     */
    public void register(ISqlJetFileSystem fs, boolean isDefault) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#unregister(org.tmatesoft.sqljet.core.ISqlJetFileSystem)
     */
    public void unregister(ISqlJetFileSystem fs) {
        // TODO Auto-generated method stub

    }

}
