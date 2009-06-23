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
 * contact TMate Software at support@svnkit.com
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
        return super.goTo(rowId) && check();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#eof()
     */
    @Override
    public boolean eof() throws SqlJetException {
        return !check();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#first()
     */
    @Override
    public boolean first() throws SqlJetException {
        return locate(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#last()
     */
    @Override
    public boolean last() throws SqlJetException {
        long last = 0;
        for (long row = index.lookup(false, key); row != 0; row = index.lookup(true, key)) {
            last = row;
        }
        if (last != 0 && goTo(last)) {
            if (index.eof()) {
                for (long row = index.lookup(false, key); row != 0 && row != last; row = index.lookup(true, key))
                    ;
            }
            return true;
        } else
            return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#next()
     */
    @Override
    public boolean next() throws SqlJetException {
        if (!locate(true)) {
            if (!eof()) {
                super.next();
            }
            return false;
        } else {
            return true;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#previous()
     */
    @Override
    public boolean previous() throws SqlJetException {
        return index.previous() && index.checkKey(key) && goTo(index.getKeyRowId());
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
