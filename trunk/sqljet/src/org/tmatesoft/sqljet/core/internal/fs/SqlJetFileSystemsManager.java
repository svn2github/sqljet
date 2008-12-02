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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager;

/**
 * Singleton implementation of {@link ISqlJetFileSystemsManager}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFileSystemsManager implements ISqlJetFileSystemsManager {

    private Object lock = new Object();
    private ISqlJetFileSystem defaultFileSystem = null;
    private Map<String, ISqlJetFileSystem> fileSystems = new ConcurrentHashMap<String, ISqlJetFileSystem>();

    private static SqlJetFileSystemsManager manager = new SqlJetFileSystemsManager(); 
    
    /**
     * Protected constructor 
     */
    protected SqlJetFileSystemsManager() {
    }
    
    /**
     * Singleton accessor.
     * 
     * @return the manager
     */
    public static SqlJetFileSystemsManager getManager() {
        return manager;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#find(java.lang.String
     * )
     */
    public ISqlJetFileSystem find(final String name) {
        if (null != name)
            return fileSystems.get(name);
        else
            synchronized (lock) {
                return defaultFileSystem;
            }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#register(org.tmatesoft
     * .sqljet.core.ISqlJetFileSystem, boolean)
     */
    public void register(final ISqlJetFileSystem fs, final boolean isDefault) {
        fileSystems.put(fs.getName(), fs);
        if (isDefault || null == defaultFileSystem)
            synchronized (lock) {
                defaultFileSystem = fs;
            }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetFileSystemsManager#unregister(org.tmatesoft
     * .sqljet.core.ISqlJetFileSystem)
     */
    public void unregister(final ISqlJetFileSystem fs) {
        fileSystems.remove(fs.getName());
        if (fs == defaultFileSystem) {
            synchronized (lock) {
                defaultFileSystem = null;
                if (fileSystems.size() > 0) {
                    defaultFileSystem = fileSystems.values().iterator().next();
                } else
                    defaultFileSystem = null;
            }
        }
    }

}
