/**
 * SqlJetDbHandle.java
 * Copyright (C) 2009 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.internal.db;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBackend;
import org.tmatesoft.sqljet.core.internal.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.internal.ISqlJetConfig;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.internal.ISqlJetMutex;
import org.tmatesoft.sqljet.core.internal.SqlJetDbFlags;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFileSystemsManager;
import org.tmatesoft.sqljet.core.internal.mutex.SqlJetMutex;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchemaMeta;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetDbHandle implements ISqlJetDbHandle {

    private EnumSet<SqlJetDbFlags> flags = EnumSet.noneOf(SqlJetDbFlags.class);
    private ISqlJetConfig config = new SqlJetConfig();
    private ISqlJetFileSystem fileSystem = SqlJetFileSystemsManager.getManager().find(null);
    private ISqlJetMutex mutex = new SqlJetMutex();
    private List<ISqlJetBackend> backends = new LinkedList<ISqlJetBackend>();
    private SqlJetEncoding enc = SqlJetEncoding.UTF8;
    private ISqlJetSchemaMeta meta;

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getBackends()
     */
    public List<ISqlJetBackend> getBackends() {
        return backends;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getBusyHaldler()
     */
    public ISqlJetBusyHandler getBusyHandler() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getConfig()
     */
    public ISqlJetConfig getConfig() {
        return config;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getFileSystem()
     */
    public ISqlJetFileSystem getFileSystem() {
        return fileSystem;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getFlags()
     */
    public EnumSet<SqlJetDbFlags> getFlags() {
        // TODO Auto-generated method stub
        return flags;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getMutex()
     */
    public ISqlJetMutex getMutex() {
        return mutex;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getSavepointNum()
     */
    public int getSavepointNum() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#setConfig(org.tmatesoft.sqljet.core.ISqlJetConfig)
     */
    public void setConfig(ISqlJetConfig config) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getEnc()
     */
    public SqlJetEncoding getEncoding() {
        return meta.getEncoding();
    }
    
    /**
     * @param enc the enc to set
     * 
     * @throws SqlJetException 
     */
    public void setEncoding(SqlJetEncoding enc) throws SqlJetException {
        this.meta.setEncoding(enc);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle#getMeta()
     */
    public ISqlJetSchemaMeta getMeta() {
        return meta;
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle#setMeta(org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchemaMeta)
     */
    public void setMeta(ISqlJetSchemaMeta meta) {
        this.meta = meta;
    }
    
}
