/**
 * SqlJetTable.java
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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * Base implementation of {@link ISqlJetCursor}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class SqlJetCursor implements ISqlJetCursor {

    protected final ISqlJetBtreeTable btreeTable;
    protected final SqlJetDb db;

    SqlJetCursor(ISqlJetBtreeTable table, SqlJetDb db) {
        this.btreeTable = table;
        this.db = db;
    }

    public void close() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                btreeTable.close();
                return null;
            }
        });
    }

    public boolean eof() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.eof();
            }
        });
    }

    public boolean first() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.first();
            }
        });
    }

    public boolean last() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.last();
            }
        });
    }

    public boolean next() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.next();
            }
        });
    }

    public boolean previous() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.previous();
            }
        });
    }

    public int getFieldsCount() throws SqlJetException {
        return (Integer) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.getFieldsCount();
            }
        });
    }

    public SqlJetValueType getFieldType(final int field) throws SqlJetException {
        return (SqlJetValueType) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.getFieldType(field);
            }
        });
    }

    public boolean isNull(final int field) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.isNull(field);
            }
        });
    }

    public String getString(final int field) throws SqlJetException {
        return (String) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.getString(field);
            }
        });
    }

    public long getInteger(final int field) throws SqlJetException {
        return (Long) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.getInteger(field);
            }
        });
    }

    public double getFloat(final int field) throws SqlJetException {
        return (Double) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btreeTable.getFloat(field);
            }
        });
    }

    public byte[] getBlobAsArray(final int field) throws SqlJetException {
        return (byte[]) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                ByteBuffer buffer = btreeTable.getBlob(field);
                return buffer != null ? buffer.array() : null;
            }
        });
    }

    public InputStream getBlobAsStream(final int field) throws SqlJetException {
        return (InputStream) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                ByteBuffer buffer = btreeTable.getBlob(field);
                return buffer != null ? new ByteArrayInputStream(buffer.array()) : null;
            }
        });
    }

    public Object getValue(final int field) throws SqlJetException {
        return db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                Object value = btreeTable.getValue(field);
                if (value instanceof ByteBuffer) {
                    return new ByteArrayInputStream(((ByteBuffer) value).array());
                }
                return value;
            }
        });
    }
    
}
