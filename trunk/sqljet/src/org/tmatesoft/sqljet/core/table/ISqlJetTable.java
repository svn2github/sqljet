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
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetTableDef;

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
     * 
     * @return
     */
    ISqlJetTableDef getTableDef();

    /**
     * Go to record which has given row's ID (taken from index).
     * 
     * @param rowId
     *            row's ID which was taken from index
     * @return true if record exists
     * @throws SqlJetException
     */
    boolean goToRow(long rowId) throws SqlJetException;

    /**
     * Get row's ID of current record.
     * 
     * @return row ID of current record
     * @throws SqlJetException
     */
    long getRowId() throws SqlJetException;

    /**
     * Delete record by row's ID.
     * 
     * @param rowId
     * @throws SqlJetException
     */
    void delete(long rowId) throws SqlJetException;

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
     * @param rowId
     * @param values
     * @throws SqlJetException
     */
    void update(long rowId, Object... values) throws SqlJetException;

}