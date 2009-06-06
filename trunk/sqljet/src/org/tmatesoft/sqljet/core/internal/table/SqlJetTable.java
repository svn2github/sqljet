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
package org.tmatesoft.sqljet.core.internal.table;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

/**
 * Implementation of {@link ISqlJetTable}.
 * 
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

    public ISqlJetTableDef getDefinition() {
        return dataTable.getDefinition();
    };

    public ISqlJetCursor open() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    public ISqlJetCursor lookup(String indexName, Object... key) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    public long insert(Object... values) throws SqlJetException {
        return dataTable.insert(values);
    }

    public long insertAutoId(Object... values) throws SqlJetException {
        return dataTable.insertAutoId(values);        
    }
    
    // Deprecated

    public long getRowId() throws SqlJetException {
        return dataTable.getRowId();
    }

    public boolean goToRow(long rowId) throws SqlJetException {
        return dataTable.goToRow(rowId);
    }

    public void update(long rowId, Object... values) throws SqlJetException {
        dataTable.update(rowId, values);
    }

    public void delete(long rowId) throws SqlJetException {
        dataTable.delete(rowId);
    }
}
