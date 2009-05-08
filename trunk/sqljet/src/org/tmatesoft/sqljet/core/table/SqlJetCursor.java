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

import java.util.ArrayList;
import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;

/**
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

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#close()
     */
    public void close() throws SqlJetException {
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
        return btreeTable.first();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#last()
     */
    public boolean last() throws SqlJetException {
        return btreeTable.last();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#next()
     */
    public boolean next() throws SqlJetException {
        return btreeTable.next();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#previous()
     */
    public boolean previous() throws SqlJetException {
        return btreeTable.previous();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetCursor#getRecord()
     */
    public ISqlJetRecord getRecord() throws SqlJetException {
        return new SqlJetRecord(btreeTable.getRecord());
    }

}
