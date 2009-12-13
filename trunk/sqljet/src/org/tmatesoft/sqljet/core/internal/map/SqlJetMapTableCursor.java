/**
 * SqlJetMapTableCursor.java
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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal.map;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.map.ISqlJetMapTableCursor;
import org.tmatesoft.sqljet.core.map.SqlJetMapDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMapTableCursor implements ISqlJetMapTableCursor {

    /**
     * 
     */
    private static final String KEY_MUST_BE_MORE_THAN_ZERO = "Key must be more than zero: ";

    /**
     * 
     */
    private final SqlJetMapDb mapDb;

    /**
     * 
     */
    private final ISqlJetBtree btree;
    /**
     * 
     */
    private final SqlJetMapTableDef mapTableDef;
    /**
     * 
     */
    private boolean writable;

    /**
     * 
     */
    private ISqlJetBtreeTable btreeTable;

    /**
     * @param mapDb
     * @param btree
     * @param mapTableDef
     * @param writable
     */
    public SqlJetMapTableCursor(final SqlJetMapDb mapDb, ISqlJetBtree btree, SqlJetMapTableDef mapTableDef,
            boolean writable) {
        this.mapDb = mapDb;
        this.btree = btree;
        this.mapTableDef = mapTableDef;
        this.writable = writable;
    }

    /**
     * @return
     * @throws SqlJetException
     */
    protected synchronized ISqlJetBtreeTable getBtreeTable() throws SqlJetException {
        if (btreeTable == null) {
            final int page = mapTableDef.getVirtualTableDef().getPage();
            btreeTable = new SqlJetBtreeTable(btree, page, writable, false);
        }
        return btreeTable;
    }

    /**
     * @throws SqlJetException
     */
    public synchronized void close() throws SqlJetException {
        if (btreeTable != null) {
            btreeTable.close();
            btreeTable = null;
        }
    }

    /**
     * @return
     * @throws SqlJetException
     */
    public long getKey() throws SqlJetException {
        return getBtreeTable().getKeySize();
    }

    /**
     * @return
     * @throws SqlJetException
     */
    public Object[] getValue() throws SqlJetException {
        return getBtreeTable().getValues();
    }

    /**
     * @param key
     * @return
     * @throws SqlJetException
     */
    public boolean goToKey(long key) throws SqlJetException {
        if (key > 0) {
            final int moveTo = getBtreeTable().moveTo(null, key, false);
            if (moveTo < 0 && !getBtreeTable().next()) {
                return false;
            }
            if (moveTo != 0) {
                if (key != getBtreeTable().getKeySize()) {
                    return false;
                }
            }
            return true;
        } else {
            throw new SqlJetException(String.format(KEY_MUST_BE_MORE_THAN_ZERO, key));
        }
    }

    /**
     * @param key
     * @param value
     * @return
     * @throws SqlJetException
     */
    public long put(long key, Object... values) throws SqlJetException {
        if (values != null) {
            final SqlJetEncoding encoding = mapDb.getOptions().getEncoding();
            ISqlJetBtreeRecord record = SqlJetBtreeRecord.getRecord(encoding, values);
            final ISqlJetMemoryPointer pData = record.getRawRecord();
            key = key > 0 ? key : getBtreeTable().newRowId();
            getBtreeTable().insert(null, key, pData, pData.remaining(), 0, true);
            return key;
        } else {
            if (goToKey(key)) {
                getBtreeTable().delete();
                return key;
            } else {
                return 0;
            }
        }
    }

}
