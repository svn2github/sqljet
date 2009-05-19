/**
 * SqlJetDataTableCursor.java
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

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;

/**
 * Implementation of {@link ISqlJetIndex}
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetIndex extends SqlJetCursor implements ISqlJetIndex {

    private ISqlJetBtreeIndexTable indexTable;

    protected SqlJetIndex(ISqlJetBtreeIndexTable indexTable) {
        super(indexTable);
        this.indexTable = indexTable;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.table.ISqlJetIndex#lookup(java.lang.Object[])
     */
    public long lookup(boolean next, Object... values) throws SqlJetException {
        return indexTable.lookup(next, values);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.ISqlJetIndex#insert(long,
     * java.lang.Object[])
     */
    public void insert(long rowId, Object... key) throws SqlJetException {
        indexTable.insert(rowId, true, key);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.table.ISqlJetIndex#delete(long,java.lang.Object[])
     */
    public boolean delete(long rowId,Object... key) throws SqlJetException {
        return indexTable.delete(rowId, key);
    }

}
