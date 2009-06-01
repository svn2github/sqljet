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
package org.tmatesoft.sqljet.core.table;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;

/**
 * Base implementation of {@link ISqlJetCursor}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class SqlJetCursor implements ISqlJetCursor {

    private ISqlJetBtreeTable btreeTable;

    /**
     * 
     */
    SqlJetCursor(ISqlJetBtreeTable table) {
        this.btreeTable = table;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#close()
     */
    public void close() throws SqlJetException {
        btreeTable.close();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#eof()
     */
    public boolean eof() {
        return btreeTable.eof();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#first()
     */
    public boolean first() throws SqlJetException {
        return btreeTable.first();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#last()
     */
    public boolean last() throws SqlJetException {
        return btreeTable.last();
    }

    public boolean hasNext() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#next()
     */
    public boolean next() throws SqlJetException {
        return btreeTable.next();
    }

    public boolean hasPrevious() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#previous()
     */
    public boolean previous() throws SqlJetException {
        return btreeTable.previous();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getFieldsCount()
     */
    public int getFieldsCount() throws SqlJetException {
        return btreeTable.getFieldsCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#isNull(int)
     */
    public boolean isNull(int field) throws SqlJetException {
        return btreeTable.isNull(field);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getString(int)
     */
    public String getString(int field) throws SqlJetException {
        return btreeTable.getString(field);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getInteger(int)
     */
    public long getInteger(int field) throws SqlJetException {
        return btreeTable.getInteger(field);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getReal(int)
     */
    public double getFloat(int field) throws SqlJetException {
        return btreeTable.getFloat(field);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getFieldType(int)
     */
    public SqlJetValueType getFieldType(int field) throws SqlJetException {
        return btreeTable.getFieldType(field);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getBlob(int)
     */
    public ByteBuffer getBlob(int field) throws SqlJetException {
        return btreeTable.getBlob(field);
    }

    public byte[] getBlobAsArray(int field) throws SqlJetException {
        ByteBuffer buffer = btreeTable.getBlob(field);
        return buffer.array();
    }

    public InputStream getBlobAsStream(int field) throws SqlJetException {
        ByteBuffer buffer = btreeTable.getBlob(field);
        return new ByteArrayInputStream(buffer.array());
    }
}
