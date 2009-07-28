/**
 * SqlJetTableIndexCursor.java
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

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * Implementation of cursor which allow acces to indexed data in table.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableIndexCursor extends SqlJetTableDataCursor {

    private Object[] key;
    private String indexName;
    private ISqlJetBtreeIndexTable index;

    /**
     * @param table
     * @param indexName
     * @param key
     * 
     * @throws SqlJetException
     */
    public SqlJetTableIndexCursor(ISqlJetBtreeDataTable table, SqlJetDb db, String indexName, Object... key)
            throws SqlJetException {
        super(table, db);
        this.key = key;
        this.indexName = indexName;
        if (null == indexName && !table.getDefinition().isRowIdPrimaryKey()) {
            this.indexName = table.getPrimaryKeyIndex();
        }
        if (null != this.indexName) {
            this.index = table.getIndexesTables().get(this.indexName);
            if (null == index)
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Index not found: " + this.indexName);
        }
        first();
    }

    @Override
    public boolean goTo(final long rowId) throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return SqlJetTableIndexCursor.super.goTo(rowId) && check();
            }
        });
    }

    @Override
    public boolean eof() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return !check();
            }
        });
    }

    @Override
    public boolean first() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return locate(false);
            }
        });
    }

    @Override
    public boolean last() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                long last = 0;
                for (long row = index.lookup(false, key); row != 0; row = index.lookup(true, key)) {
                    last = row;
                }
                if (last != 0 && goTo(last)) {
                    if (index.eof()) {
                        for (long row = index.lookup(false, key); row != 0 && row != last; row = index
                                .lookup(true, key)) {
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    @Override
    public boolean next() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                if (!locate(true)) {
                    if (!eof()) {
                        SqlJetTableIndexCursor.super.next();
                    }
                    return false;
                } else {
                    return true;
                }
            }
        });
    }

    @Override
    public boolean previous() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return index.previous() && index.checkKey(key) && goTo(index.getKeyRowId());
            }
        });
    }

    private boolean locate(boolean next) throws SqlJetException {
        return getBtreeDataTable().locate(indexName, next, key) & check();
    }

    private boolean check() throws SqlJetException {
        return !super.eof() && getBtreeDataTable().checkIndex(indexName, key);
    }
}
