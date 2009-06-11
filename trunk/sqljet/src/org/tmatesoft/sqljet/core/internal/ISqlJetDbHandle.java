/**
 * ISqlJet.java
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
package org.tmatesoft.sqljet.core.internal;

import java.util.EnumSet;
import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchemaMeta;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetDbHandle {

    /**
    * Name of the master database table.  The master database table
    * is a special table that holds the names and attributes of all
    * user tables and indices.
    */
    String MASTER_NAME = "sqlite_master";
    String TEMP_MASTER_NAME = "sqlite_temp_master";

    /**
    * The root-page of the master database table.
    */
    int MASTER_ROOT = 1;
    
    /**
     * Get config
     * 
     * @return
     */
    ISqlJetConfig getConfig();
    
    /**
     * Set config
     * 
     * @param config
     */
    void setConfig(ISqlJetConfig config);
    
    /**
     * @return
     */
    ISqlJetFileSystem getFileSystem();
    
    /**
     * @return
     */
    EnumSet<SqlJetDbFlags> getFlags();
    
    List<ISqlJetBackend> getBackends();
    
    ISqlJetMutex getMutex();

    /**
     * @return
     */
    ISqlJetBusyHandler getBusyHandler();

    /**
     * @return
     */
    int getSavepointNum();
    
    SqlJetEncoding getEncoding();

    void setEncoding(SqlJetEncoding enc) throws SqlJetException;
    
    ISqlJetSchemaMeta getMeta();
    
    void setMeta(ISqlJetSchemaMeta meta);
    
}
