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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core.internal.table;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;

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
        super.first();
    }

    protected ISqlJetBtreeDataTable getBtreeDataTable() {
        return (ISqlJetBtreeDataTable) btreeTable;
    }

    public long getRowId() throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        if (table.eof()) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or the current record doesn't point to a data row");
        }
        return table.getRowId();
    }

    public boolean goTo(long rowId) throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        return table.goToRow(rowId);
    }

    private int getFieldSafe(String fieldName) throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        if (table.eof()) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or the current record doens't point to a data row");
        }
        if (fieldName == null) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Field name is null");
        }
        final int field = table.getDefinition().getColumnNumber(fieldName);
        if (field < 0) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Field not found: " + fieldName);
        }
        return field;
    }

    public SqlJetValueType getFieldType(String fieldName) throws SqlJetException {
        return getBtreeDataTable().getFieldType(getFieldSafe(fieldName));
    }

    public boolean isNull(String fieldName) throws SqlJetException {
        return getBtreeDataTable().isNull(getFieldSafe(fieldName));
    }

    public String getString(String fieldName) throws SqlJetException {
        return getBtreeDataTable().getString(getFieldSafe(fieldName));
    }

    public long getInteger(String fieldName) throws SqlJetException {
        return getBtreeDataTable().getInteger(getFieldSafe(fieldName));
    }

    public double getFloat(String fieldName) throws SqlJetException {
        return getBtreeDataTable().getFloat(getFieldSafe(fieldName));
    }

    public byte[] getBlobAsArray(String fieldName) throws SqlJetException {
        ByteBuffer buffer = getBtreeDataTable().getBlob(getFieldSafe(fieldName));
        return buffer != null ? buffer.array() : null;
    }

    public InputStream getBlobAsStream(String fieldName) throws SqlJetException {
        ByteBuffer buffer = getBtreeDataTable().getBlob(getFieldSafe(fieldName));
        return buffer != null ? new ByteArrayInputStream(buffer.array()) : null;
    }

    public Object getValue(String fieldName) throws SqlJetException {
        return getBtreeDataTable().getValue(getFieldSafe(fieldName));
    }

    public void update(Object... values) throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        if (table.eof())
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or current record doens't point to data row");
        table.update(values);
    }

    public void updateByFieldNames(Map<String, Object> values) throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        table.update(values);
    }

    public void delete() throws SqlJetException {
        final ISqlJetBtreeDataTable table = getBtreeDataTable();
        if (table.eof())
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Table is empty or current record doens't point to data row");
        table.delete();
    }
}