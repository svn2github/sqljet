/**
 * ISqlJetTable.java
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
package org.tmatesoft.sqljet.core.table;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * Table's interface.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetTable {

    /**
     * Get table's schema definition.
     */
    ISqlJetTableDef getDefinition();

    /**
     * Open cursor for all table records. Client is responsible to close the
     * cursor after use.
     */
    ISqlJetCursor open() throws SqlJetException;

    /**
     * Open cursor for indexed records. Client is responsible to close the
     * cursor after use.
     * 
     * @param indexName
     *            Name of the searched index.
     * @param key
     *            Key for the index lookup.
     */
    ISqlJetCursor lookup(String indexName, Object... key) throws SqlJetException;

    /**
     * Add new record to the table with specified values. All relevant indexes
     * are updated automatically. If table have INTEGER PRIMARY KEY
     * AUTOINCREMENT field then 'values' should not have value for this field.
     * 
     * @param values
     *            Values for the new record.
     */
    long insert(Object... values) throws SqlJetException;

    /**
     * Version of insert() for tables with INTEGER PRIMARY KEY field. Method
     * implements AUTOINCREMENT even if it doesn't have AUTOINCREMENT in
     * definition.
     * 
     * @param values
     * @return
     * @throws SqlJetException
     */
    long insertAutoId(Object... values) throws SqlJetException;

    // The following methods are deprecated and should be removed.

    /**
     * Go to record which has given row's ID (taken from index).
     * 
     * @param rowId
     *            row's ID which was taken from index
     * @return true if record exists
     * @throws SqlJetException
     * 
     * 
     * @deprecated use cursor
     */
    boolean goToRow(long rowId) throws SqlJetException;

    /**
     * Get row's ID of current record.
     * 
     * @return row ID of current record
     * @throws SqlJetException
     * 
     * @deprecated use cursor
     */
    long getRowId() throws SqlJetException;

    /**
     * Delete record by row's ID.
     * 
     * @param rowId
     * @throws SqlJetException
     * 
     * @deprecated use cursor method
     */
    void delete(long rowId) throws SqlJetException;

    /**
     * Update an entry in the table.
     * 
     * @param rowId
     * @param values
     * @throws SqlJetException
     * 
     * @deprecated use cursor method
     */
    void update(long rowId, Object... values) throws SqlJetException;
    
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
    
    
}
