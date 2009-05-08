/**
 * SqlJetDataTableCursor.java
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
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetTable extends SqlJetCursor implements ISqlJetTable {

    private ISqlJetBtreeDataTable dataTable;

    protected SqlJetTable(ISqlJetBtreeDataTable dataTable) {
        super(dataTable);
        this.dataTable = dataTable;
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#goToRow(long)
     */
    public int goToRow(long rowId) throws SqlJetException{
        return dataTable.goToRow(rowId);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#getKey()
     */
    public long getRowId() throws SqlJetException {
        return dataTable.getKey();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#newRowId()
     */
    public long newRowId() throws SqlJetException {
        return dataTable.newRowId(0);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#delete(long)
     */
    public void delete(long rowId) throws SqlJetException {
        dataTable.delete(rowId); 
     }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#insert(long, org.tmatesoft.sqljet.core.table.SqlJetRecord)
     */
    public void insert(long rowId, SqlJetRecord data) throws SqlJetException {
        dataTable.insert(rowId, data.getRecord(), true);
    }
        
}
