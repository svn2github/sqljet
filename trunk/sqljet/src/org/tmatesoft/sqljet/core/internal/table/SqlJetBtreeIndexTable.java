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
package org.tmatesoft.sqljet.core.internal.table;

import java.nio.ByteBuffer;
import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.internal.SqlJetUnpackedRecordFlags;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchema;
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
    public SqlJetBtreeIndexTable(ISqlJetSchema schema, String indexName, boolean write) throws SqlJetException {
        super(schema.getBtree(), schema.getIndexPage(indexName), write, true, schema.getMeta().getEncoding());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeIndexTable
     * #lookup (org.tmatesoft.sqljet.core.internal.table.ISqlJetRecord)
     */
    public ISqlJetBtreeRecord lookup(boolean next, ISqlJetBtreeRecord key) throws SqlJetException {
        lock();
        try {
            adjustKeyInfo(key);
            final ByteBuffer k = key.getRawRecord();
            if (next || cursor.moveTo(k, k.remaining(), false) < 0) {
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
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable#insert
     * (org.tmatesoft .sqljet.core.ext.ISqlJetBtreeRecord, boolean)
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
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable#delete
     * (long,org.tmatesoft .sqljet.core.ext.ISqlJetBtreeRecord)
     */
    public boolean delete(long rowId, ISqlJetBtreeRecord key) throws SqlJetException {
        lock();
        try {
            adjustKeyInfo(key);
            final ByteBuffer k = key.getRawRecord();
            if (cursor.moveTo(k, k.remaining(), false) < 0) {
                next();
            }
            do {
                final ISqlJetBtreeRecord record = getRecord();
                if (null == record)
                    return false;
                if (keyCompare(k, record.getRawRecord()) != 0)
                    return false;
                if(getKeyRowId(record)==rowId) {
                    cursor.delete();
                    return true;
                }
            } while(next());
            return false;
        } finally {
            unlock();
        }
    }

    public long getKeyRowId(ISqlJetBtreeRecord record) {
        if (null == record)
            return 0;
        final List<ISqlJetVdbeMem> fields = record.getFields();
        if (null == fields || 0 == fields.size())
            return 0;
        return fields.get(fields.size() - 1).intValue();
    }
    
}
