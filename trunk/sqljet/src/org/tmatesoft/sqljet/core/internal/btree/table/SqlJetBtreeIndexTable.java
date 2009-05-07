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
package org.tmatesoft.sqljet.core.internal.btree.table;

import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUnpackedRecordFlags;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeIndexTable extends SqlJetBtreeTable implements ISqlJetBtreeIndexTable {

    /**
     * Open index by name
     * 
     * @throws SqlJetException
     * 
     */
    public SqlJetBtreeIndexTable(ISqlJetBtreeSchema schema, String indexName, boolean write) throws SqlJetException {
        super(schema.getBtree(), schema.getIndexPage(indexName), write, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeIndexTable#lookup
     * (org.tmatesoft.sqljet.core.internal.table.ISqlJetRecord)
     */
    public ISqlJetBtreeRecord lookup(ISqlJetBtreeRecord key) throws SqlJetException {
        lock();
        try {
            adjustKeyInfo(key);
            final ByteBuffer k = key.getRawRecord();
            if (cursor.moveTo(k, k.remaining(), false) < 0) {
                next();
            }
            final ISqlJetBtreeRecord record = getRecord();
            if (null == record)
                return null;
            if (keyCompare(k, record.getRawRecord()) != 0)
                return null;
            return record;
        } finally {
            unlock();
        }
    }

    /**
     * 
     * @param key
     * @param record
     * @return
     * 
     * @throws SqlJetException
     */
    private int keyCompare(ByteBuffer key, ByteBuffer record) throws SqlJetException {
        final SqlJetUnpackedRecord unpacked = keyInfo.recordUnpack(key.remaining(), key);
        unpacked.getFlags().add(SqlJetUnpackedRecordFlags.IGNORE_ROWID);
        return unpacked.recordCompare(record.remaining(), record);
    }

    /**
     * @param key
     */
    private void adjustKeyInfo(ISqlJetBtreeRecord key) {
        if (null != keyInfo) {
            keyInfo.setNField(key.getFieldsCount());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable#insert(org.tmatesoft
     * .sqljet.core.ext.ISqlJetBtreeRecord, boolean)
     */
    public void insert(ISqlJetBtreeRecord key, boolean append) throws SqlJetException {
        lock();
        try {
            final ByteBuffer zKey = key.getRawRecord();
            cursor.insert(zKey, zKey.remaining(), ByteBuffer.allocate(0), 0, 0, append);
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable#delete(org.tmatesoft
     * .sqljet.core.ext.ISqlJetBtreeRecord)
     */
    public void delete(ISqlJetBtreeRecord key) throws SqlJetException {
        lock();
        try {
            adjustKeyInfo(key);
            final ByteBuffer r = key.getRawRecord();
            if (cursor.moveTo(r, r.remaining(), false) < 0) {
                next();
            }
            if (!eof()) {
                cursor.delete();
            }
        } finally {
            unlock();
        }
    }

}
