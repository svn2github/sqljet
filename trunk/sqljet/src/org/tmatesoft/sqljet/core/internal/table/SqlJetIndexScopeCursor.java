/**
 * SqlJetIndexScopeCursor.java
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

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetIndexScopeCursor extends SqlJetIndexOrderCursor {

    private Object[] firstKey;
    private Object[] lastKey;

    /**
     * @param table
     * @param db
     * @param indexName
     * @param firstKey
     * @param lastKey
     * @throws SqlJetException
     */
    public SqlJetIndexScopeCursor(ISqlJetBtreeDataTable table, SqlJetDb db, String indexName, Object[] firstKey,
            Object[] lastKey) throws SqlJetException {
        super(table, db, indexName);
        this.firstKey = firstKey;
        this.lastKey = lastKey;
        first();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetTableDataCursor#goTo(long)
     */
    @Override
    public boolean goTo(final long rowId) throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                if (indexTable == null || firstKey == null) {
                    return SqlJetIndexScopeCursor.super.goTo(rowId);
                } else {
                    if (SqlJetIndexScopeCursor.super.goTo(rowId)) {
                        return !eof();
                    }
                }
                return false;
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetIndexOrderCursor#first()
     */
    @Override
    public boolean first() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                if (indexTable == null || firstKey == null) {
                    return SqlJetIndexScopeCursor.super.first();
                } else {
                    final long lookup = indexTable.lookupNear(false, firstKey);
                    if (lookup != 0) {
                        return goTo(lookup);
                    }
                }
                return false;
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetIndexOrderCursor#next()
     */
    @Override
    public boolean next() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                if (eof()) {
                    return false;
                }
                if (indexTable == null || lastKey == null) {
                    return SqlJetIndexScopeCursor.super.next();
                } else {
                    if (indexTable.next() && !eof()) {
                        return goTo(indexTable.getKeyRowId());
                    }
                }
                return false;
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetIndexOrderCursor#eof()
     */
    @Override
    public boolean eof() throws SqlJetException {
        return (Boolean) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                if (indexTable == null) {
                    return SqlJetIndexScopeCursor.super.eof();
                } else {
                    return SqlJetIndexScopeCursor.super.eof() || !checkScope();
                }
            }
        });
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private boolean checkScope() throws SqlJetException {
        if (firstKey != null) {
            if (indexTable.compareKey(firstKey) < 0)
                return false;
        }
        if (lastKey != null) {
            if (indexTable.compareKey(lastKey) > 0)
                return false;
        }
        return true;
    }
}
