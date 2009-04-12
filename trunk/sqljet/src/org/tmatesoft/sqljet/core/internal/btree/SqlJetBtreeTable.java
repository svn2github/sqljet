/**
 * SqlJetTableWrapper.java
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
package org.tmatesoft.sqljet.core.internal.btree;

import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetBtreeTable;
import org.tmatesoft.sqljet.core.ISqlJetRecord;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTable implements ISqlJetBtreeTable {

    private ISqlJetBtree btree;
    private int rootPage;

    private boolean write;
    private boolean index;

    private ISqlJetBtreeCursor cursor;

    /**
     * @throws SqlJetException
     * 
     */
    public SqlJetBtreeTable(ISqlJetBtree btree, int rootPage, boolean write, boolean index) throws SqlJetException {

        this.btree = btree;
        this.rootPage = rootPage;
        this.write = write;
        this.index = index;

        cursor = btree.getCursor(rootPage, write, null);
        cursor.enterCursor();
        try {
            cursor.first();
        } finally {
            cursor.leaveCursor();
        }

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.ISqlJetBtreeTable#next()
     */
    public ISqlJetRecord next() throws SqlJetException {
        cursor.enterCursor();
        try {
            if (eof())
                return null;
            try {
                return new SqlJetRecord(cursor, index);
            } finally {
                cursor.next();
            }
        } finally {
            cursor.leaveCursor();
        }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.ISqlJetBtreeTable#eof()
     */
    public boolean eof() {
        return cursor.eof();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.ISqlJetBtreeTable#close()
     */
    public void close() throws SqlJetException {
        cursor.closeCursor();
    }

}
