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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeTableCreateFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetTableDef;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnConstraint;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnNotNull;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnPrimaryKey;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnUnique;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexedColumn;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableConstraint;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTablePrimaryKey;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableUnique;
import org.tmatesoft.sqljet.core.schema.SqlJetTypeAffinity;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeDataTable extends SqlJetBtreeTable implements ISqlJetBtreeDataTable {

    private static String AUTOINDEX = "sqlite_autoindex_%s_%d";

    private long priorNewRowid = 0;

    private long lastNewRowId = 0;

    private boolean isRowIdPrimaryKey = false;

    private ISqlJetTableDef tableDef;

    private Set<ISqlJetIndexDef> indexesDefs;

    private Map<String, SqlJetBtreeIndexTable> indexesTables;

    private Map<String, String> columnsConstraintsIndexes;
    private Map<String, List<String>> tableConstraintsIndexes;

    private enum Action {
        INSERT, UPDATE, DELETE
    };

    /**
     * Open data table by name.
     * 
     * @throws SqlJetException
     */
    public SqlJetBtreeDataTable(ISqlJetSchema schema, String tableName, boolean write) throws SqlJetException {
        super(((SqlJetSchema) schema).getDb(), ((SqlJetSchema) schema).getBtree(), ((SqlJetTableDef) schema
                .getTable(tableName)).getPage(), write, false);
        this.tableDef = schema.getTable(tableName);
        this.indexesDefs = schema.getIndexes(tableName);
        resolveConstraints();
        openIndexes(schema);
    }

    /**
     * @param tableDef
     * @return
     */
    private void resolveConstraints() {

        columnsConstraintsIndexes = new HashMap<String, String>();
        tableConstraintsIndexes = new HashMap<String, List<String>>();

        if (null == tableDef)
            return;

        int i = 0;

        final List<ISqlJetColumnDef> columns = tableDef.getColumns();
        if (null != columns) {
            for (final ISqlJetColumnDef column : columns) {
                final List<ISqlJetColumnConstraint> constraints = column.getConstraints();
                if (null == constraints)
                    continue;
                for (final ISqlJetColumnConstraint constraint : constraints) {
                    if (constraint instanceof ISqlJetColumnPrimaryKey) {
                        if (column.getTypeAffinity() == SqlJetTypeAffinity.INTEGER) {
                            isRowIdPrimaryKey = true;
                        } else {
                            columnsConstraintsIndexes.put(generateAutoIndexName(++i), column.getName());
                        }
                    } else if (constraint instanceof ISqlJetColumnUnique) {
                        columnsConstraintsIndexes.put(generateAutoIndexName(++i), column.getName());
                    }
                }
            }
        }

        final List<ISqlJetTableConstraint> constraints = tableDef.getConstraints();
        if (null != constraints) {
            for (final ISqlJetTableConstraint constraint : constraints) {
                if (constraint instanceof ISqlJetTablePrimaryKey) {
                    tableConstraintsIndexes.put(generateAutoIndexName(++i), ((ISqlJetTablePrimaryKey) constraint)
                            .getColumns());
                } else if (constraint instanceof ISqlJetTableUnique) {
                    tableConstraintsIndexes.put(generateAutoIndexName(++i), ((ISqlJetTableUnique) constraint)
                            .getColumns());
                }
            }
        }

    }

    /**
     * @param i
     * @return
     */
    private String generateAutoIndexName(int i) {
        return String.format(AUTOINDEX, tableDef.getName(), i);
    }

    /**
     * Open all indexes
     * 
     * @throws SqlJetException
     * 
     */
    private void openIndexes(ISqlJetSchema schema) throws SqlJetException {
        indexesTables = new HashMap<String, SqlJetBtreeIndexTable>();
        for (final ISqlJetIndexDef indexDef : indexesDefs) {
            indexesTables.put(indexDef.getName(), new SqlJetBtreeIndexTable(schema, indexDef.getName(), this.write));
        }
    }

    /**
     * @return the tableDef
     */
    public ISqlJetTableDef getTableDef() {
        return tableDef;
    }

    /**
     * @return the indexesDefs
     */
    public Set<ISqlJetIndexDef> getIndexesDefs() {
        return indexesDefs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeDataTable#
     * goToRow (int)
     */
    public boolean goToRow(long rowId) throws SqlJetException {
        lock();
        try {
            clearCachedRecord();
            return cursor.moveTo(null, rowId, false) == 0;
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

    /**
     * Get a new integer record number (a.k.a "rowid") used as the key to a
     * table. The record number is not previously used as a key in the database
     * table that cursor P1 points to. The new record number is written written
     * to register P2.
     * 
     * Prev is the largest previously generated record number. No new record
     * numbers are allowed to be less than this value. When this value reaches
     * its maximum, a SQLITE_FULL error is generated. This mechanism is used to
     * help implement the AUTOINCREMENT feature.
     * 
     * @param prev
     * @return
     * @throws SqlJetException
     */
    private long newRowId(long prev) throws SqlJetException {
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
     * (java.lang.Object[])
     */
    public long insert(Object... values) throws SqlJetException {
        lock();
        try {
            long rowId = newRowId(lastNewRowId);
            final Object[] row = !isRowIdPrimaryKey ? values : SqlJetUtility.addArrays(new Object[] { rowId }, values);
            doActionWithIndexes(Action.INSERT, rowId, row);
            lastNewRowId = rowId;
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(row).getRawRecord();
            cursor.insert(null, lastNewRowId, pData, pData.remaining(), 0, true);
            clearCachedRecord();
            return lastNewRowId;
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#update
     * (long, java.lang.Object[])
     */
    public void update(long rowId, Object... values) throws SqlJetException {
        lock();
        try {
            if (rowId <= 0 || !goToRow(rowId))
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Incorrect rowId value: " + rowId);
            final Object[] row = !isRowIdPrimaryKey ? values : SqlJetUtility.addArrays(new Object[] { rowId }, values);
            doActionWithIndexes(Action.UPDATE, rowId, row);
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(row).getRawRecord();
            cursor.insert(null, rowId, pData, pData.remaining(), 0, false);
            clearCachedRecord();
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
            if (goToRow(rowId)) {
                doActionWithIndexes(Action.DELETE, rowId);
                cursor.delete();
            }
        } finally {
            unlock();
        }
    }

    /**
     * @param row
     * @return
     * @throws SqlJetException
     */
    private void doActionWithIndexes(Action action, long rowId, Object... row) throws SqlJetException {

        final Map<String, Object[]> indexKeys = new HashMap<String, Object[]>();

        final Map<String, Object> fields = Action.DELETE != action ? getAsNamedFields(row) : null;

        // check unique indexes
        if (Action.DELETE != action) {
            for (final ISqlJetIndexDef indexDef : indexesDefs) {
                if (indexDef.isUnique() || columnsConstraintsIndexes.containsKey(indexDef.getName())
                        || tableConstraintsIndexes.containsKey(indexDef.getName())) {
                    final Object[] indexKey = getKeyForIndex(fields, indexDef);
                    indexKeys.put(indexDef.getName(), indexKey);
                    final SqlJetBtreeIndexTable indexTable = indexesTables.get(indexDef.getName());
                    final long lookup = indexTable.lookup(false, indexKey);
                    if (lookup != 0 || (Action.UPDATE == action && lookup != rowId)) {
                        throw new SqlJetException(SqlJetErrorCode.CONSTRAINT, "Unique index " + indexDef.getName()
                                + " prevents this insertion");
                    }
                }
            }
        }

        // insert into indexes
        for (final ISqlJetIndexDef indexDef : indexesDefs) {
            final SqlJetBtreeIndexTable indexTable = indexesTables.get(indexDef.getName());
            if (Action.INSERT != action) {
                indexTable.delete(rowId, getKeyForIndex(getAsNamedFields(getValues()), indexDef));
            }
            if (Action.DELETE != action) {
                final Object[] indexKey = indexDef.isUnique() ? indexKeys.get(indexDef.getName()) : getKeyForIndex(
                        fields, indexDef);
                indexTable.insert(rowId, true, indexKey);
            }
        }

    }

    /**
     * @param values
     * @return
     */
    private Map<String, Object> getAsNamedFields(Object... values) throws SqlJetException {

        if (values == null)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Values are missing");

        final int fieldsSize = values.length;
        final List<ISqlJetColumnDef> columns = tableDef.getColumns();
        final int columnsSize = columns.size();
        if (fieldsSize > columnsSize) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Data values count is more than columns in table");
        }

        final Map<String, Object> namedFields = new HashMap<String, Object>();

        int i = 0;
        for (final ISqlJetColumnDef column : columns) {
            if (null != column.getConstraints()) {
                for (final ISqlJetColumnConstraint constraint : column.getConstraints()) {
                    if (constraint instanceof ISqlJetColumnNotNull) {
                        if (i >= fieldsSize || null == values[i]) {
                            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Column " + column.getName()
                                    + " is NOT NULL");
                        }
                    }
                }
            }
            namedFields.put(column.getName(), (i < fieldsSize ? values[i] : null));
            i++;
        }

        return namedFields;
    }

    /**
     * @param fields
     * @param indexDef
     * @return
     */
    private Object[] getKeyForIndex(final Map<String, Object> fields, final ISqlJetIndexDef indexDef) {

        if (columnsConstraintsIndexes.containsKey(indexDef.getName())) {

            final String column = columnsConstraintsIndexes.get(indexDef.getName());
            return new Object[] { fields.get(column) };

        } else if (tableConstraintsIndexes.containsKey(indexDef.getName())) {

            final List<String> columns = tableConstraintsIndexes.get(indexDef.getName());
            final int columnsCount = columns.size();
            final Object[] key = new Object[columnsCount];
            int i = 0;
            for (final String column : columns) {
                key[i++] = fields.get(column);
            }
            return key;

        } else {

            final List<ISqlJetIndexedColumn> indexedColumns = indexDef.getColumns();
            final int columnsCount = indexedColumns.size();
            final Object[] key = new Object[columnsCount];
            int i = 0;
            for (final ISqlJetIndexedColumn column : indexedColumns) {
                key[i++] = fields.get(column.getName());
            }
            return key;

        }
    }

}
