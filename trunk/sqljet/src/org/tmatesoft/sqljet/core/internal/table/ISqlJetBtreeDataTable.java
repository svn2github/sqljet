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

import java.util.Set;

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
    ISqlJetTableDef getTableDef();

    
    /**
     * Get definitions of table's indexes. 
     * 
     * @return
     */
    Set<ISqlJetIndexDef> getIndexesDefs();
    
    
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
     * Update an entry in the table.
     * 
     * @param values
     * @throws SqlJetException
     */
    void update(long rowId, Object... values) throws SqlJetException;

    /**
     * Delete record by row's ID.
     * 
     * @param rowId
     * @throws SqlJetException
     */
    void delete(long rowId) throws SqlJetException;

}