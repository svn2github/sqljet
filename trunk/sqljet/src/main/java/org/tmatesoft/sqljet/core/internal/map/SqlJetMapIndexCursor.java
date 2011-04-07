/**
 * SqlJetMapTableCursor.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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

import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.SqlJetUnpackedRecordFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.map.ISqlJetMapIndexCursor;
import org.tmatesoft.sqljet.core.map.SqlJetMapDb;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMapIndexCursor extends SqlJetBtreeTable implements ISqlJetMapIndexCursor {

    private final SqlJetMapDb mapDb;

    /**
     * @param mapDb
     * @param btree
     * @param mapTableDef
     * @param writable
     * @throws SqlJetException
     */
    public SqlJetMapIndexCursor(final SqlJetMapDb mapDb, ISqlJetBtree btree, ISqlJetIndexDef indexDef, boolean writable)
            throws SqlJetException {
        super(btree, indexDef.getPage(), writable, true);
        if (mapDb.isInTransaction()) {
            this.mapDb = mapDb;
        } else {
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Cursor requires active transaction");
        }
    }

    /**
     * @return
     * @throws SqlJetException
     */
    public Object[] getKey() throws SqlJetException {
        final Object[] values = getValues();
        if (values != null && values.length > 1) {
            final int i = values.length - 1;
            final Object[] key = new Object[i];
            System.arraycopy(values, 0, key, 0, i);
            return key;
        }
        return null;
    }

    /**
     * @return
     * @throws SqlJetException
     */
    public Long getValue() throws SqlJetException {
        final Object[] values = getValues();
        if (values != null && values.length > 1) {
            final Object value = values[values.length - 1];
            if (value != null && value instanceof Long) {
                return (Long) value;
            }
        }
        return null;
    }

    /**
     * @param key
     * @return
     * @throws SqlJetException
     */
    public boolean goToKey(Object[] key) throws SqlJetException {
        if (key != null && key.length > 0) {
            final SqlJetEncoding encoding = mapDb.getOptions().getEncoding();
            final ISqlJetMemoryPointer pKey = SqlJetBtreeRecord.getRecord(encoding, key).getRawRecord();
            final int moveTo = moveTo(pKey, pKey.remaining(), false);
            if (moveTo < 0 && !next()) {
                return false;
            }
            if (moveTo != 0) {
                final ISqlJetBtreeRecord record = getRecord();
                if (null == record) {
                    return false;
                }
                if (keyCompare(key.length, pKey, record.getRawRecord()) != 0) {
                    return false;
                }
            }
            return true;
        } else {
            throw new SqlJetException("Key must be not null");
        }
    }

    private int keyCompare(int keyLength, ISqlJetMemoryPointer key, ISqlJetMemoryPointer record) throws SqlJetException {
        getKeyInfo().setNField(keyLength);
        final SqlJetUnpackedRecord unpacked = getKeyInfo().recordUnpack(key.remaining(), key);
        final Set<SqlJetUnpackedRecordFlags> flags = unpacked.getFlags();
        flags.add(SqlJetUnpackedRecordFlags.IGNORE_ROWID);
        flags.add(SqlJetUnpackedRecordFlags.PREFIX_MATCH);
        return unpacked.recordCompare(record.remaining(), record);
    }

    /**
     * @param key
     * @param value
     * @return
     * @throws SqlJetException
     */
    public void put(Object[] key, Long value) throws SqlJetException {
        if (write) {
            if (value != null) {
                lock();
                try {
                    final SqlJetEncoding encoding = mapDb.getOptions().getEncoding();
                    final ISqlJetMemoryPointer zKey = SqlJetBtreeRecord.getRecord(encoding,
                            SqlJetUtility.addArrays(key, new Object[] { value })).getRawRecord();
                    getCursor().insert(zKey, zKey.remaining(), SqlJetUtility.allocatePtr(0), 0, 0, true);
                    clearRecordCache();
                } finally {
                    unlock();
                }
            } else {
                if (goToKey(key)) {
                    delete();
                }
            }
        } else {
            throw new SqlJetException("Read-only");
        }
    }

}
