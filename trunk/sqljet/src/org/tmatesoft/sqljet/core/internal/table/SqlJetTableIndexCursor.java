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

    private Object[] key;
    private String indexName;
    
    
    /**
     * @param table
     * @param indexName
     * @param key
     * 
     * @throws SqlJetException 
     */
    public SqlJetTableIndexCursor(ISqlJetBtreeDataTable table, 
            String indexName, Object... key) throws SqlJetException {
        super(table);
        this.key = key;
        this.indexName = indexName;
        first();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetTableDataCursor#goTo(long)
     */
    @Override
    public boolean goTo(long rowId) throws SqlJetException {
        throw new SqlJetException(SqlJetErrorCode.MISUSE);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#eof()
     */
    @Override
    public boolean eof() throws SqlJetException {
        return !check();
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#first()
     */
    @Override
    public boolean first() throws SqlJetException {
        return ((ISqlJetBtreeDataTable) btreeTable).locate(indexName, false, key);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#last()
     */
    @Override
    public boolean last() throws SqlJetException {
        throw new SqlJetException(SqlJetErrorCode.MISUSE);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#next()
     */
    @Override
    public boolean next() throws SqlJetException {
        return ((ISqlJetBtreeDataTable) btreeTable).locate(indexName, true, key);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.table.SqlJetCursor#previous()
     */
    @Override
    public boolean previous() throws SqlJetException {
        throw new SqlJetException(SqlJetErrorCode.MISUSE);
    }
    
    /**
     * @return
     * 
     * @throws SqlJetException 
     */
    private boolean check() throws SqlJetException {
        return !super.eof() && ((ISqlJetBtreeDataTable) btreeTable).checkIndex(indexName, key);
    }
    
}
