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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal.table;

import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * Implementation of {@link ISqlJetTable}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTable implements ISqlJetTable {

    private final SqlJetDb db;
    private ISqlJetBtreeDataTable dataTable;

    public SqlJetTable(SqlJetDb db, ISqlJetSchema schema, String tableName, boolean write) throws SqlJetException {
        if (!schema.getTableNames().contains(tableName))
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Table not found: " + tableName);
        this.db = db;
        this.dataTable = new SqlJetBtreeDataTable(schema, tableName, write);
    }

    public boolean isRowIdPrimaryKey() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.isRowIdPrimaryKey();
            }
        });
    }

    public boolean isAutoincrement() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.isAutoincrement();
            }
        });
    }

    public String getPrimaryKeyIndexName() throws SqlJetException {
        return (String) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.getPrimaryKeyIndex();
            }
        });
    }

    public ISqlJetTableDef getDefinition() throws SqlJetException {
        return (ISqlJetTableDef) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.getDefinition();
            }
        });
    };

    public ISqlJetCursor open() throws SqlJetException {
        return (ISqlJetCursor) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTableDataCursor(new SqlJetBtreeDataTable((SqlJetBtreeDataTable) dataTable), db);
            }
        });
    }

    public ISqlJetCursor lookup(final String indexName, final Object... key) throws SqlJetException {
        return (ISqlJetCursor) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (!dataTable.getIndexDefinitions().containsKey(indexName)) {
                    throw new SqlJetException(SqlJetErrorCode.MISUSE);
                }
                return new SqlJetTableIndexCursor(new SqlJetBtreeDataTable((SqlJetBtreeDataTable) dataTable), db,
                        indexName, key);
            }
        });
    }

    public long insert(final Object... values) throws SqlJetException {
        return (Long) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.insert(values);
            }
        });
    }

    public long insertAutoId(final Object... values) throws SqlJetException {
        return (Long) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.insertAutoId(values);
            }
        });
    }

    public long insertByFieldNames(final Map<String, Object> values) throws SqlJetException {
        return (Long) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.insert(values);
            }
        });
    }

    public long insertByFieldNamesAutoId(final Map<String, Object> values) throws SqlJetException {
        return (Long) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return dataTable.insertAutoId(values);
            }
        });
    }
}
