/**
 * SqlJetTableDataCursor.java
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

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * Implementation of cursor which allow access to all table's rows.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetTableDataCursor extends SqlJetCursor {

    public SqlJetTableDataCursor(ISqlJetBtreeDataTable table) throws SqlJetException {
        super(table);
    }

    public void update(Object... values) throws SqlJetException {
        final ISqlJetBtreeDataTable table = (ISqlJetBtreeDataTable) btreeTable;
        if (table.eof())
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or current record doens't point to data row");
        table.update(table.getRowId(), values);
    }

    public boolean goTo(long rowId) throws SqlJetException {
        final ISqlJetBtreeDataTable table = (ISqlJetBtreeDataTable) btreeTable;
        return table.goToRow(rowId);
    }

    public long getRowId() throws SqlJetException {
        final ISqlJetBtreeDataTable table = (ISqlJetBtreeDataTable) btreeTable;
        if (table.eof())
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or current record doens't point to data row");
        return table.getRowId();
    }

    public void delete() throws SqlJetException {
        final ISqlJetBtreeDataTable table = (ISqlJetBtreeDataTable) btreeTable;
        if (table.eof())
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or current record doens't point to data row");
        table.delete(table.getRowId());
    }
    
}