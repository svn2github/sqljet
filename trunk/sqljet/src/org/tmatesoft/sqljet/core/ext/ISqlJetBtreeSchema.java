/**
 * ISqlJetBtreeSchemaTable.java
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
package org.tmatesoft.sqljet.core.ext;

import java.util.Set;

import org.tmatesoft.sqljet.core.ISqlJetBtree;


/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeSchema {

    /**
     * @return
     */
    ISqlJetBtree getBtree();

    /**
     * @return
     */
    Set<String> getTableNames();
    
    ISqlJetTableDef getTable(String name);
    
    /**
     * @return the tables
     */
    int getTablePage(String tableName);

    /**
     * @param tableName
     * @return
     */
    Set<String> getIndexesOfTable(String tableName);
    
    int getIndexePage(String indexName);
    
}