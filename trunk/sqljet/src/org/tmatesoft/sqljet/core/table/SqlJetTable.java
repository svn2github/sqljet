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
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable;

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

    public ISqlJetTableDef getTableDef() {
        return dataTable.getTableDef();
    };

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#goToRow(long)
     */
    public boolean goToRow(long rowId) throws SqlJetException {
        return dataTable.goToRow(rowId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#getKey()
     */
    public long getRowId() throws SqlJetException {
        return dataTable.getRowId();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#delete(long)
     */
    public void delete(long rowId) throws SqlJetException {
        dataTable.delete(rowId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.table.ISqlJetTable#insert(java.lang.Object[])
     */
    public long insert(Object... values) throws SqlJetException {
        return dataTable.insert(values);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#update(long,
     * java.lang.Object[])
     */
    public void update(long rowId, Object... values) throws SqlJetException {
        dataTable.update(rowId, values);
    }

}
