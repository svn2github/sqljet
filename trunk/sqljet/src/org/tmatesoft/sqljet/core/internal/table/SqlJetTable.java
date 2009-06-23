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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core.internal.table;

import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
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
public class SqlJetTable implements ISqlJetTable {

    private ISqlJetBtreeDataTable dataTable;

    public SqlJetTable(ISqlJetSchema schema, String tableName, boolean write) throws SqlJetException {
        if (!schema.getTableNames().contains(tableName))
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Table not found: " + tableName);
        this.dataTable = new SqlJetBtreeDataTable(schema, tableName, write);
    }

    public boolean isRowIdPrimaryKey() {
        return dataTable.isRowIdPrimaryKey();
    }

    public boolean isAutoincrement() {
        return dataTable.isAutoincrement();
    }

    public String getPrimaryKeyIndex() {
        return dataTable.getPrimaryKeyIndex();
    }
    
    public ISqlJetTableDef getDefinition() {
        return dataTable.getDefinition();
    };

    public ISqlJetCursor open() throws SqlJetException {
        return new SqlJetTableDataCursor(new SqlJetBtreeDataTable((SqlJetBtreeDataTable) dataTable));
    }

    public ISqlJetCursor lookup(String indexName, Object... key) throws SqlJetException {
        if (!dataTable.getIndexDefinitions().containsKey(indexName))
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        return new SqlJetTableIndexCursor(new SqlJetBtreeDataTable((SqlJetBtreeDataTable) dataTable), indexName, key);
    }

    public long insert(Object... values) throws SqlJetException {
        return dataTable.insert(values);
    }

    public long insertAutoId(Object... values) throws SqlJetException {
        return dataTable.insertAutoId(values);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#insert(java.util.Map)
     */
    public long insert(Map<String, Object> values) throws SqlJetException {
        return dataTable.insert(values);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#insertAutoId(java.util.Map)
     */
    public long insertAutoId(Map<String, Object> values) throws SqlJetException {
        return dataTable.insertAutoId(values);
    }
        
    // Deprecated

    @Deprecated
    public long getRowId() throws SqlJetException {
        return dataTable.getRowId();
    }

    @Deprecated
    public boolean goToRow(long rowId) throws SqlJetException {
        return dataTable.goToRow(rowId);
    }

    @Deprecated
    public void update(long rowId, Object... values) throws SqlJetException {
        dataTable.update(rowId, values);
    }

    @Deprecated
    public void delete(long rowId) throws SqlJetException {
        dataTable.delete(rowId);
    }
}
