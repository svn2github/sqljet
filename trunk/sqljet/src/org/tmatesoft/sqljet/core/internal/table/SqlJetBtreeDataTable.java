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
import java.util.Random;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeTableCreateFlags;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchema;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeDataTable extends SqlJetBtreeTable implements ISqlJetBtreeDataTable {

    private long priorNewRowid;

    /**
     * Open data table by name.
     * 
     * @throws SqlJetException
     */
    public SqlJetBtreeDataTable(ISqlJetSchema schema, String tableName, boolean write) throws SqlJetException {
        super(schema.getBtree(), schema.getTable(tableName).getPage(), write, false, schema.getMeta().getEncoding());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeDataTable#
     * goToRow (int)
     */
    public int goToRow(long rowId) throws SqlJetException {
        lock();
        try {
            return cursor.moveTo(null, rowId, false);
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#getKey()
     */
    public long getRowId() throws SqlJetException {
        lock();
        try {
            return cursor.getKeySize();
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#newRowId
     * (long)
     */
    public long newRowId(long prev) throws SqlJetException {
        /*
         * The next rowid or record number (different terms for the same thing)
         * is obtained in a two-step algorithm. First we attempt to find the
         * largest existing rowid and add one to that. But if the largest
         * existing rowid is already the maximum positive integer, we have to
         * fall through to the second probabilistic algorithm. The second
         * algorithm is to select a rowid at random and see if it already exists
         * in the table. If it does not exist, we have succeeded. If the random
         * rowid does exist, we select a new one and try again, up to 1000
         * times.For a table with less than 2 billion entries, the probability
         * of not finding a unused rowid is about 1.0e-300. This is a non-zero
         * probability, but it is still vanishingly small and should never cause
         * a problem. You are much, much more likely to have a hardware failure
         * than for this algorithm to fail.
         * 
         * To promote locality of reference for repetitive inserts, the first
         * few attempts at choosing a random rowid pick values just a little
         * larger than the previous rowid. This has been shown experimentally to
         * double the speed of the COPY operation.
         */

        lock();
        try {
            boolean useRandomRowid = false;
            long v = 0;
            int res = 0;
            int cnt = 0;

            if ((cursor.flags() & (SqlJetBtreeTableCreateFlags.INTKEY.getValue() | SqlJetBtreeTableCreateFlags.ZERODATA
                    .getValue())) != SqlJetBtreeTableCreateFlags.INTKEY.getValue()) {
                throw new SqlJetException(SqlJetErrorCode.CORRUPT);
            }

            assert ((cursor.flags() & SqlJetBtreeTableCreateFlags.INTKEY.getValue()) != 0);
            assert ((cursor.flags() & SqlJetBtreeTableCreateFlags.ZERODATA.getValue()) == 0);

            long MAX_ROWID = 0x7fffffff;

            final boolean last = cursor.last();

            if (last) {
                v = 1;
            } else {
                v = cursor.getKeySize();
                if (v == MAX_ROWID) {
                    useRandomRowid = true;
                } else {
                    v++;
                }

                if (prev != 0) {
                    if (prev == MAX_ROWID || useRandomRowid) {
                        throw new SqlJetException(SqlJetErrorCode.FULL);
                    }
                    if (v < prev) {
                        v = prev + 1;
                    }
                }

                if (useRandomRowid) {
                    v = priorNewRowid;
                    Random random = new Random();
                    /* SQLITE_FULL must have occurred prior to this */
                    assert (prev == 0);
                    cnt = 0;
                    do {
                        if (cnt == 0 && (v & 0xffffff) == v) {
                            v++;
                        } else {
                            v = random.nextInt();
                            if (cnt < 5)
                                v &= 0xffffff;
                        }
                        if (v == 0)
                            continue;
                        res = cursor.moveToUnpacked(null, v, false);
                        cnt++;
                    } while (cnt < 100 && res == 0);
                    priorNewRowid = v;
                    if (res == 0) {
                        throw new SqlJetException(SqlJetErrorCode.FULL);
                    }
                }
            }
            return v;
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#insert
     * (long, org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord)
     */
    public void insert(long rowId, ISqlJetBtreeRecord data, boolean append) throws SqlJetException {
        lock();
        try {
            final ByteBuffer pData = data.getRawRecord();
            cursor.insert(null, rowId, pData, pData.remaining(), 0, append);
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#delete
     * (long)
     */
    public void delete(long rowId) throws SqlJetException {
        lock();
        try {
            if (goToRow(rowId) == 0) {
                cursor.delete();
            }
        } finally {
            unlock();
        }
    }

}
