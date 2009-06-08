/**
 * ISqlJetBtreeDataTable.java
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
package org.tmatesoft.sqljet.core.internal.table;

import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeDataTable extends ISqlJetBtreeTable {

    /**
     * Get table's schema definition.
     * 
     * @return
     */
    ISqlJetTableDef getDefinition();

    /**
     * Get definitions of table's indexes. 
     * 
     * @return
     */
    Map<String, ISqlJetIndexDef> getIndexDefinitions();
    
    /**
     * Get indexes which are related with table.
     * 
     * @return
     */
    Map<String, ISqlJetBtreeIndexTable> getIndexesTables();
    
    
    /**
     * Go to record with given rowID. Return boolean to indicate success.
     * 
     * @param rowId
     * @return
     * @throws SqlJetException
     */
    boolean goToRow(long rowId) throws SqlJetException;

    /**
     * Generate new rowID.
     * 
     * @return
     * @throws SqlJetException
     */
    long getRowId() throws SqlJetException;

    /**
     * Write an new entry into the table.
     * 
     * @param values
     * @throws SqlJetException
     */
    long insert(Object... values) throws SqlJetException;

    /**
     * @param values
     * @return
     * @throws SqlJetException
     */
    long insertAutoId(Object... values) throws SqlJetException;
    
    /**
     * Update an entry in the table by rowId.
     * 
     * @param rowId
     * @param values
     * @throws SqlJetException
     */
    void update(long rowId, Object... values) throws SqlJetException;

    /**
     * Update the current entry in the table.
     * 
     * @param values
     * @throws SqlJetException
     */
    void update(Object... values) throws SqlJetException;
    
    /**
     * Delete record by row's ID.
     * 
     * @param rowId
     * @throws SqlJetException
     */
    void delete(long rowId) throws SqlJetException;

    /**
     * Delete curent record.
     * 
     * @throws SqlJetException
     */
    void delete() throws SqlJetException;
    
    /**
     * @param indexName
     * @param key
     * @return
     * @throws SqlJetException 
     */
    boolean checkIndex(String indexName, Object[] key) throws SqlJetException;

    /**
     * @return the isRowIdPrimaryKey
     */
    boolean isRowIdPrimaryKey();
    
    /**
     * @return the isAutoincrement
     */
    boolean isAutoincrement();
    
    /**
     * @return the primaryKeyIndex
     */
    String getPrimaryKeyIndex();
    
    public boolean locate(String indexName, boolean next, Object ... key) throws SqlJetException;
    
}