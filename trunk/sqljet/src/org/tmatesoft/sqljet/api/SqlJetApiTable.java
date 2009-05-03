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
package org.tmatesoft.sqljet.api;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetApiTable extends SqlJetApiCursor {

    private ISqlJetBtreeDataTable dataTable;

    /**
     * 
     */
    SqlJetApiTable(ISqlJetBtreeDataTable dataTable) {
        super(dataTable);
        this.dataTable = dataTable;
    }
    
    public int goToRow(long rowId) throws SqlJetException{
        return dataTable.goToRow(rowId);
    }

    public long getKey() throws SqlJetException {
        return dataTable.getKey();
    }

    public long newRowId() throws SqlJetException {
        return dataTable.newRowId(0);
    }

    public void delete(long rowId) throws SqlJetException {
        dataTable.delete(rowId); 
     }
    
    /**
     * Write an entry into the table. A new entry is created if it doesn't
     * already exist or the data for an existing entry is overwritten.
     * 
     * @param rowId
     * @param data
     * @throws SqlJetException 
     */
    public void insert(long rowId, SqlJetApiRecord data) throws SqlJetException {
        dataTable.insert(rowId, data.getRecord(), true);
    }
        
}
