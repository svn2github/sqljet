/**
 * SqlJetBtreeDataTable.java
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
package org.tmatesoft.sqljet.core.internal.btree.ext;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchema;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeDataTable extends SqlJetBtreeTable implements ISqlJetBtreeDataTable {

    /**
     * Open data table by name
     * 
     * @throws SqlJetException
     * 
     */
    public SqlJetBtreeDataTable(ISqlJetBtreeSchema schema, String tableName, boolean write) throws SqlJetException {
        super(schema.getBtree(), schema.getTablePage(tableName), write, false);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.ext.ISqlJetBtreeDataTable#goToRow(int)
     */
    public int goToRow(int rowId) throws SqlJetException {
        lock();
        try {
            return cursor.moveTo(null, rowId, false);
        } finally {
            unlock();
        }
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ext.ISqlJetBtreeDataTable#getKey()
     */
    public long getKey() throws SqlJetException {
        lock();
        try {
            return cursor.getKeySize();
        } finally {
            unlock();
        }
    }
    
}
