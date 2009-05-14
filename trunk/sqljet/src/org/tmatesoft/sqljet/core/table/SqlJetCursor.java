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

import java.nio.ByteBuffer;
import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class SqlJetCursor implements ISqlJetCursor {
    
    private ISqlJetBtreeTable btreeTable;
    private ISqlJetBtreeRecord cachedRecord;
    
    /**
     * 
     */
    SqlJetCursor(ISqlJetBtreeTable table) {
        this.btreeTable = table;
        this.cachedRecord = null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#close()
     */
    public void close() throws SqlJetException {
        clearCachedRecord();
        btreeTable.close();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#eof()
     */
    public boolean eof() {
        return btreeTable.eof();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#first()
     */
    public boolean first() throws SqlJetException {
        clearCachedRecord();
        return btreeTable.first();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#last()
     */
    public boolean last() throws SqlJetException {
        clearCachedRecord();
        return btreeTable.last();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#next()
     */
    public boolean next() throws SqlJetException {
        clearCachedRecord();
        return btreeTable.next();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#previous()
     */
    public boolean previous() throws SqlJetException {
        clearCachedRecord();
        return btreeTable.previous();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getFieldsCount()
     */
    public int getFieldsCount() throws SqlJetException {
        final ISqlJetBtreeRecord r = getCachedRecord();
        if(null==r) return 0;
        return r.getFieldsCount();
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#isNull(int)
     */
    public boolean isNull(int field) throws SqlJetException {
        final ISqlJetVdbeMem value = getValue(field);
        if(null==value) return true;
        return value.isNull();
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getString(int)
     */
    public String getString(int field) throws SqlJetException {
        if(isNull(field)) return null;
        return SqlJetUtility.toString(getValue(field).valueText(btreeTable.getEncoding()));
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getInteger(int)
     */
    public long getInteger(int field) throws SqlJetException {
        if(isNull(field)) return 0;
        return getValue(field).intValue();
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getReal(int)
     */
    public double getReal(int field) throws SqlJetException {
        if(isNull(field)) return 0;
        return getValue(field).realValue();
    }
        
    protected void clearCachedRecord() {
        cachedRecord = null;
    }
    
    protected ISqlJetBtreeRecord getCachedRecord() throws SqlJetException {
        if(null == cachedRecord) {
            cachedRecord = btreeTable.getRecord();
        }
        return cachedRecord;
    } 
    
    protected boolean checkField(int field) throws SqlJetException {
        return (field>=0 && field<getFieldsCount());
    }
    
    protected ISqlJetVdbeMem getValue(int field) throws SqlJetException {
        if(!checkField(field)) return null;
        final ISqlJetBtreeRecord r = getCachedRecord();
        if(null==r) return null;
        final List<ISqlJetVdbeMem> fields = r.getFields();
        if(null==fields) return null;
        return fields.get(field);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getFieldType(int)
     */
    public SqlJetValueType getFieldType(int field) throws SqlJetException {
        if(isNull(field)) return SqlJetValueType.NULL;
        return getValue(field).getType();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getBlob(int)
     */
    public ByteBuffer getBlob(int field) throws SqlJetException {
        if(isNull(field)) return null;
        return getValue(field).valueBlob();
    }
}
