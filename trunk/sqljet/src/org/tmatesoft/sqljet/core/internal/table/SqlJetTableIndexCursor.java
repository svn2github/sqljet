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
 */
package org.tmatesoft.sqljet.core.internal.table;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * Implementation of cursor which allow acces to indexed data in table.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableIndexCursor extends SqlJetTableDataCursor {

    boolean hasData = false;

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
    public SqlJetTableIndexCursor(ISqlJetBtreeDataTable table, String indexName, Object... key) throws SqlJetException {
        super(table);
        this.key = key;
        this.indexName = indexName;
        this.index = table.getIndexesTables().get(indexName);
        if (null == index)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Index not found: " + indexName);
        first();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetTableDataCursor#goTo(long)
     */
    @Override
    public boolean goTo(long rowId) throws SqlJetException {
        if (!hasData)
            return false;
        return hasData = super.goTo(rowId) && check();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#eof()
     */
    @Override
    public boolean eof() throws SqlJetException {
        if (!hasData)
            return true;
        return !(hasData = check());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#first()
     */
    @Override
    public boolean first() throws SqlJetException {
        return hasData = locate(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#last()
     */
    @Override
    public boolean last() throws SqlJetException {
        if (!hasData)
            return false;
        long last = 0;
        for (long row = index.lookup(false, key); row != 0; row = index.lookup(true, key)) {
            last = row;
        }
        return hasData = last != 0 &&  goTo(last);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#next()
     */
    @Override
    public boolean next() throws SqlJetException {
        if (!hasData)
            return false;
        return hasData = locate(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#previous()
     */
    @Override
    public boolean previous() throws SqlJetException {
        if (!hasData)
            return false;
        return hasData = index.previous() && index.checkKey(key) && goTo(index.getKeyRowId());
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private boolean locate(boolean next) throws SqlJetException {
        return getBtreeDataTable().locate(indexName, next, key) & check();
    }

    /**
     * @return
     * 
     * @throws SqlJetException
     */
    private boolean check() throws SqlJetException {
        return !super.eof() && getBtreeDataTable().checkIndex(indexName, key);
    }

}
