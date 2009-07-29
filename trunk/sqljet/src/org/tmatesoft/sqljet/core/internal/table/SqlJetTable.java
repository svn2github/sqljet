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
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * Implementation of {@link ISqlJetTable}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTable implements ISqlJetTable {

    private interface ISqlJetTableRun {
        public Object run(final ISqlJetBtreeDataTable table) throws SqlJetException;
    }

    private final SqlJetDb db;
    private ISqlJetSchema schema;
    private String tableName;
    private boolean write;
    private ISqlJetTableDef tableDef;

    public SqlJetTable(SqlJetDb db, ISqlJetSchema schema, String tableName, boolean write) throws SqlJetException {
        this.db = db;
        this.schema = schema;
        this.tableName = tableName;
        this.write = write;
        this.tableDef = schema.getTable(tableName);
        if (null == this.tableDef)
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Table not found: " + tableName);
    }

    public String getPrimaryKeyIndexName() throws SqlJetException {
        return tableDef.isRowIdPrimaryKey() ? null : tableDef.getPrimaryKeyIndexName();
    }

    public ISqlJetTableDef getDefinition() throws SqlJetException {
        return tableDef;
    };

    public ISqlJetCursor open() throws SqlJetException {
        return (ISqlJetCursor) db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTableDataCursor(new SqlJetBtreeDataTable(schema, tableName, write), db);
            }
        });
    }

    public ISqlJetCursor lookup(final String indexName, final Object... key) throws SqlJetException {
        return (ISqlJetCursor) db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTableIndexCursor(new SqlJetBtreeDataTable(schema, tableName, write), db, indexName,
                        SqlJetUtility.adjustNumberTypes(key));
            }
        });
    }

    private Object runWriteTransaction(final ISqlJetTableRun op) throws SqlJetException {
        return db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetBtreeDataTable table = new SqlJetBtreeDataTable(schema, tableName, write);
                try {
                    return op.run(table);
                } finally {
                    table.close();
                }
            }
        });
    }

    public long insert(final Object... values) throws SqlJetException {
        return (Long) runWriteTransaction(new ISqlJetTableRun() {
            public Object run(ISqlJetBtreeDataTable table) throws SqlJetException {
                return table.insert(values);
            }
        });
    }

    public long insertByFieldNames(final Map<String, Object> values) throws SqlJetException {
        return (Long) runWriteTransaction(new ISqlJetTableRun() {
            public Object run(ISqlJetBtreeDataTable table) throws SqlJetException {
                return table.insert(values);
            }
        });
    }

    public long insertWithRowId(final long rowId, final Object... values) throws SqlJetException {
        return (Long) runWriteTransaction(new ISqlJetTableRun() {
            public Object run(ISqlJetBtreeDataTable table) throws SqlJetException {
                return table.insertWithRowId(rowId, values);
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetTable#order(java.lang.String)
     */
    public ISqlJetCursor order(final String indexName) throws SqlJetException {
        return (ISqlJetCursor) db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetIndexOrderCursor(new SqlJetBtreeDataTable(schema, tableName, write), db, indexName);
            }
        });
    }

}
