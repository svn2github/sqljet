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
public abstract class SqlJetCursor {
    
    private ISqlJetBtreeTable btreeTable;
    
    /**
     * 
     */
    SqlJetCursor(ISqlJetBtreeTable table) {
        this.btreeTable = table;
    }

    public void close() throws SqlJetException {
        btreeTable.close();
    }

    public boolean eof() {
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

    public SqlJetRecord getRecord() throws SqlJetException {
        return new SqlJetRecord(btreeTable.getRecord());
    }

}
