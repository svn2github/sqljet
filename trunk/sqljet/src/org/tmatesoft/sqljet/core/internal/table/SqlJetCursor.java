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
 */
package org.tmatesoft.sqljet.core.internal.table;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * Base implementation of {@link ISqlJetCursor}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class SqlJetCursor implements ISqlJetCursor {

    protected ISqlJetBtreeTable btreeTable;

    SqlJetCursor(ISqlJetBtreeTable table) {
        this.btreeTable = table;
    }

    public void close() throws SqlJetException {
        btreeTable.close();
    }

    public boolean eof() throws SqlJetException {
        return btreeTable.eof();
    }

    public boolean first() throws SqlJetException {
        return btreeTable.first();
    }

    public boolean last() throws SqlJetException {
        return btreeTable.last();
    }

    public boolean next() throws SqlJetException {
        return btreeTable.next();
    }

    public boolean previous() throws SqlJetException {
        return btreeTable.previous();
    }

    public int getFieldsCount() throws SqlJetException {
        return btreeTable.getFieldsCount();
    }

    public SqlJetValueType getFieldType(int field) throws SqlJetException {
        return btreeTable.getFieldType(field);
    }

    public boolean isNull(int field) throws SqlJetException {
        return btreeTable.isNull(field);
    }

    public String getString(int field) throws SqlJetException {
        return btreeTable.getString(field);
    }

    public long getInteger(int field) throws SqlJetException {
        return btreeTable.getInteger(field);
    }

    public double getFloat(int field) throws SqlJetException {
        return btreeTable.getFloat(field);
    }

    public ByteBuffer getBlob(int field) throws SqlJetException {
        return btreeTable.getBlob(field);
    }

    public byte[] getBlobAsArray(int field) throws SqlJetException {
        ByteBuffer buffer = btreeTable.getBlob(field);
        return buffer != null ? buffer.array() : null;
    }

    public InputStream getBlobAsStream(int field) throws SqlJetException {
        ByteBuffer buffer = btreeTable.getBlob(field);
        return buffer != null ? new ByteArrayInputStream(buffer.array()) : null;
    }
}
