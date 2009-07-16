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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal.table;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
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

    private boolean isRowIdPrimaryKey = false;
    private boolean isAutoincrement = false;

    private ISqlJetTableDef tableDef;

    private Map<String, ISqlJetIndexDef> indexesDefs;

    private Map<String, ISqlJetBtreeIndexTable> indexesTables;

    private Map<String, String> columnsConstraintsIndexes;
    private Map<String, List<String>> tableConstraintsIndexes;

    private String primaryKeyIndex;
    private String rowIdPrimaryKeyColumn;
    private int rowIdPrimaryKeyColumnIndex = -1;
    private List<String> primaryKeyColumns;

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
        resolveConstraints();
        openIndexes(schema);
    }

    /**
     * @param dataTable
     * @throws SqlJetException
     */
    public SqlJetBtreeDataTable(SqlJetBtreeDataTable dataTable) throws SqlJetException {
        super((SqlJetBtreeTable) dataTable);

        this.isRowIdPrimaryKey = dataTable.isRowIdPrimaryKey;
        this.isAutoincrement = dataTable.isAutoincrement;
        this.tableDef = dataTable.tableDef;
        this.indexesDefs = dataTable.indexesDefs;
        this.columnsConstraintsIndexes = dataTable.columnsConstraintsIndexes;
        this.tableConstraintsIndexes = dataTable.tableConstraintsIndexes;
        this.primaryKeyIndex = dataTable.primaryKeyIndex;
        this.primaryKeyColumns = dataTable.primaryKeyColumns;

        this.rowIdPrimaryKeyColumn = dataTable.rowIdPrimaryKeyColumn;
        this.rowIdPrimaryKeyColumnIndex = dataTable.rowIdPrimaryKeyColumnIndex;

        indexesTables = new HashMap<String, ISqlJetBtreeIndexTable>();
        for (Map.Entry<String, ISqlJetBtreeIndexTable> entry : dataTable.indexesTables.entrySet()) {
            indexesTables.put(entry.getKey(), new SqlJetBtreeIndexTable((SqlJetBtreeIndexTable) entry.getValue()));
        }

    }

    @Override
    public void close() throws SqlJetException {
        if (indexesTables != null) {
            for (String key : indexesTables.keySet()) {
                ISqlJetBtreeIndexTable table = indexesTables.get(key);
                table.close();
            }
        }
        super.close();
    }

    /**
     * @param tableDef
     * @return
     */
    private void resolveConstraints() {

        columnsConstraintsIndexes = new HashMap<String, String>();
        tableConstraintsIndexes = new HashMap<String, List<String>>();
        primaryKeyColumns = new ArrayList<String>();

        if (null == tableDef)
            return;

        int f = 0, i = 0;

        final List<ISqlJetColumnDef> columns = tableDef.getColumns();
        if (null != columns) {
            for (final ISqlJetColumnDef column : columns) {
                final List<ISqlJetColumnConstraint> constraints = column.getConstraints();
                if (null == constraints)
                    continue;
                for (final ISqlJetColumnConstraint constraint : constraints) {
                    if (constraint instanceof ISqlJetColumnPrimaryKey) {
                        primaryKeyColumns.add(column.getName());
                        if (SqlJetSchema.isExactlyIntegerTypeColumn(column)) {
                            rowIdPrimaryKeyColumn = column.getName();
                            rowIdPrimaryKeyColumnIndex = f;
                            isRowIdPrimaryKey = true;
                            isAutoincrement = ((ISqlJetColumnPrimaryKey) constraint).isAutoincremented();
                        } else {
                            String n = generateAutoIndexName(tableDef.getName(), ++i);
                            columnsConstraintsIndexes.put(n, column.getName());
                            primaryKeyIndex = n;
                        }
                    } else if (constraint instanceof ISqlJetColumnUnique) {
                        columnsConstraintsIndexes.put(generateAutoIndexName(tableDef.getName(), ++i), column.getName());
                    }
                }
                f++;
            }
        }

        final List<ISqlJetTableConstraint> constraints = tableDef.getConstraints();
        if (null != constraints) {
            for (final ISqlJetTableConstraint constraint : constraints) {
                if (constraint instanceof ISqlJetTablePrimaryKey) {
                    final ISqlJetTablePrimaryKey pk = (ISqlJetTablePrimaryKey) constraint;
                    primaryKeyColumns.addAll(pk.getColumns());
                    String n = generateAutoIndexName(tableDef.getName(), ++i);
                    tableConstraintsIndexes.put(n, pk.getColumns());
                    primaryKeyIndex = n;
                } else if (constraint instanceof ISqlJetTableUnique) {
                    tableConstraintsIndexes.put(generateAutoIndexName(tableDef.getName(), ++i),
                            ((ISqlJetTableUnique) constraint).getColumns());
                }
            }
        }

    }

    /**
     * Open all indexes
     * 
     * @throws SqlJetException
     * 
     */
    private void openIndexes(ISqlJetSchema schema) throws SqlJetException {
        indexesDefs = new HashMap<String, ISqlJetIndexDef>();
        indexesTables = new HashMap<String, ISqlJetBtreeIndexTable>();
        for (final ISqlJetIndexDef indexDef : schema.getIndexes(tableDef.getName())) {
            indexesDefs.put(indexDef.getName(), indexDef);
            indexesTables.put(indexDef.getName(), new SqlJetBtreeIndexTable(schema, indexDef.getName(), this.write));
        }
    }

    /**
     * @return the tableDef
     */
    public ISqlJetTableDef getDefinition() {
        return tableDef;
    }

    /**
     * @return the indexesDefs
     */
    public Map<String, ISqlJetIndexDef> getIndexDefinitions() {
        return Collections.unmodifiableMap(indexesDefs);
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

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#insert
     * (java.lang.Object[])
     */
    public long insert(Object... values) throws SqlJetException {

        if (null == values)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Values isn't defined");

        lock();
        try {

            long rowId;
            Object[] row;
            boolean setLastNewRowId = false;

            if (isAutoincrement) {
                final int primaryKeyColumnNumber = tableDef.getColumnNumber(rowIdPrimaryKeyColumn);
                if (primaryKeyColumnNumber == -1)
                    throw new SqlJetException(SqlJetErrorCode.ERROR);
                rowId = newRowId(lastNewRowId);
                row = SqlJetUtility.insertArray(values, new Object[] { rowId }, primaryKeyColumnNumber);
                setLastNewRowId = true;
            } else if (isRowIdPrimaryKey) {
                final int primaryKeyColumnNumber = tableDef.getColumnNumber(rowIdPrimaryKeyColumn);
                if (primaryKeyColumnNumber == -1)
                    throw new SqlJetException(SqlJetErrorCode.ERROR);
                if (primaryKeyColumnNumber > values.length)
                    throw new SqlJetException(SqlJetErrorCode.MISUSE,
                            "Primary key isn't defined for table with INTEGER PRIMARY KEY");
                final Object object = values[primaryKeyColumnNumber];
                if (!(object instanceof Number))
                    throw new SqlJetException(SqlJetErrorCode.MISUSE,
                            "Primary key isn't defined as number for table with INTEGER PRIMARY KEY");
                rowId = ((Number) object).longValue();
                row = values;
            } else {
                rowId = newRowId(lastNewRowId);
                row = values;
                setLastNewRowId = true;
            }

            doActionWithIndexes(Action.INSERT, rowId, row);
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(db.getOptions().getEncoding(), row).getRawRecord();
            cursor.insert(null, rowId, pData, pData.remaining(), 0, true);
            if (setLastNewRowId) {
                lastNewRowId = rowId;
            }
            goToRow(rowId);
            return rowId;

        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#insertAutoId
     * (java.lang.Object[])
     */
    public long insertAutoId(Object... values) throws SqlJetException {
        if (null == values)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Values isn't defined");
        if (!isRowIdPrimaryKey)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "This method only for tables with INTEGER PRIMARY KEY");
        lock();
        try {
            final int primaryKeyColumnNumber = tableDef.getColumnNumber(rowIdPrimaryKeyColumn);
            if (primaryKeyColumnNumber == -1)
                throw new SqlJetException(SqlJetErrorCode.ERROR);
            long rowId = newRowId(lastNewRowId);
            final Object[] row = SqlJetUtility.insertArray(values, new Object[] { rowId }, primaryKeyColumnNumber);
            doActionWithIndexes(Action.INSERT, rowId, row);
            lastNewRowId = rowId;
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(db.getOptions().getEncoding(), row).getRawRecord();
            cursor.insert(null, lastNewRowId, pData, pData.remaining(), 0, true);
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
            doUpdate(rowId, values);
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#update
     * (java.lang.Object[])
     */
    public void update(Object... values) throws SqlJetException {
        lock();
        try {
            doUpdate(getRowId(), values);
        } finally {
            unlock();
        }
    }

    /**
     * @param values
     * @throws SqlJetException
     */
    private void doUpdate(long rowId, Object... values) throws SqlJetException {
        final Object[] row = isAutoincrement ? SqlJetUtility.addArrays(new Object[] { rowId }, values) : values;
        doActionWithIndexes(Action.UPDATE, rowId, row);
        final ByteBuffer pData = SqlJetBtreeRecord.getRecord(db.getOptions().getEncoding(), row).getRawRecord();
        cursor.insert(null, rowId, pData, pData.remaining(), 0, false);
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
            if (rowId <= 0 || !goToRow(rowId))
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Incorrect rowId value: " + rowId);
            doDelete(rowId);
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#delete()
     */
    public void delete() throws SqlJetException {
        lock();
        try {
            if (eof())
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Table is empty");
            doDelete(getRowId());
        } finally {
            unlock();
        }
    }

    /**
     * @throws SqlJetException
     */
    private void doDelete(long rowId) throws SqlJetException {
        doActionWithIndexes(Action.DELETE, rowId);
        cursor.delete();
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
            for (final ISqlJetIndexDef indexDef : indexesDefs.values()) {
                if (indexDef.isUnique() || columnsConstraintsIndexes.containsKey(indexDef.getName())
                        || tableConstraintsIndexes.containsKey(indexDef.getName())) {
                    final Object[] indexKey = getKeyForIndex(fields, indexDef);
                    indexKeys.put(indexDef.getName(), indexKey);
                    final ISqlJetBtreeIndexTable indexTable = indexesTables.get(indexDef.getName());
                    final long lookup = indexTable.lookup(false, indexKey);
                    if (lookup != 0) {
                        if (Action.INSERT == action) {
                            throw new SqlJetException(SqlJetErrorCode.CONSTRAINT, "Insert fails: unique index "
                                    + indexDef.getName());
                        } else if (Action.UPDATE == action && lookup != rowId) {
                            throw new SqlJetException(SqlJetErrorCode.CONSTRAINT, "Update fails: unique index "
                                    + indexDef.getName());
                        }
                    }
                }
            }
        }

        // insert into indexes
        for (final ISqlJetIndexDef indexDef : indexesDefs.values()) {
            final ISqlJetBtreeIndexTable indexTable = indexesTables.get(indexDef.getName());
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
    public Map<String, Object> getAsNamedFields(Object... values) throws SqlJetException {

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
    public Object[] getKeyForIndex(final Map<String, Object> fields, final ISqlJetIndexDef indexDef) {

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

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#checkIndex
     * (java.lang.String, java.lang.Object[])
     */
    public boolean checkIndex(String indexName, Object[] key) throws SqlJetException {
        if (!isIndexExists(indexName))
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        if (null != indexName) {
            return Arrays.equals(key, getKeyForIndex(getAsNamedFields(getValues()), indexesDefs.get(indexName)));
        } else {
            return getRowId() == getKeyForRowId(key);
        }
    }

    private Long getKeyForRowId(Object[] key) throws SqlJetException {
        if (!isRowIdPrimaryKey)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Index not defined");
        if (key.length == 1) {
            final Object[] k = SqlJetUtility.adjustNumberTypes(key);
            if (k[0] instanceof Long) {
                return (Long) k[0];
            }
        }
        throw new SqlJetException(SqlJetErrorCode.MISUSE, "Bad key");
    }

    /**
     * @return the isRowIdPrimaryKey
     */
    public boolean isRowIdPrimaryKey() {
        return isRowIdPrimaryKey;
    }

    /**
     * @return the isAutoincrement
     */
    public boolean isAutoincrement() {
        return isAutoincrement;
    }

    /**
     * @return the primaryKeyIndex
     */
    public String getPrimaryKeyIndex() {
        return isRowIdPrimaryKey ? null : primaryKeyIndex;
    }

    public boolean locate(String indexName, boolean next, Object... key) throws SqlJetException {
        if (null == key)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Bad key");
        if (null != indexName) {
            if (!indexesDefs.containsKey(indexName))
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Index not found: " + indexName);
            final ISqlJetBtreeIndexTable indexTable = indexesTables.get(indexName);
            final long lookup = indexTable.lookup(next, key);
            return lookup != 0 && goToRow(lookup);
        } else {
            return goToRow(getKeyForRowId(key));
        }
    }

    /**
     * @return the indexesTables
     */
    public Map<String, ISqlJetBtreeIndexTable> getIndexesTables() {
        return Collections.unmodifiableMap(indexesTables);
    }

    public long insert(Map<String, Object> values) throws SqlJetException {

        if (null == values)
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Values isn't defined");

        lock();
        try {

            long rowId;
            Object[] row;
            boolean setLastNewRowId = false;

            if (isAutoincrement) {

                rowId = newRowId(lastNewRowId);
                row = unwrapValues(values, rowId);
                setLastNewRowId = true;

            } else if (isRowIdPrimaryKey) {

                final Object value = values.get(rowIdPrimaryKeyColumn);
                if (null == value)
                    throw new SqlJetException(SqlJetErrorCode.MISUSE,
                            "Primary key isn't defined for table with INTEGER PRIMARY KEY");
                if (!(value instanceof Number))
                    throw new SqlJetException(SqlJetErrorCode.MISUSE,
                            "Primary key isn't defined as number for table with INTEGER PRIMARY KEY");
                rowId = ((Number) value).longValue();
                row = unwrapValues(values);

            } else {

                rowId = newRowId(lastNewRowId);
                row = unwrapValues(values);
                setLastNewRowId = true;

            }

            doActionWithIndexes(Action.INSERT, rowId, row);
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(db.getOptions().getEncoding(), row).getRawRecord();
            cursor.insert(null, rowId, pData, pData.remaining(), 0, true);
            if (setLastNewRowId) {
                lastNewRowId = rowId;
            }
            goToRow(rowId);
            return rowId;

        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#insertAutoId
     * (java.util.Map)
     */
    public long insertAutoId(Map<String, Object> values) throws SqlJetException {
        if (!isRowIdPrimaryKey)
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        lock();
        try {
            long rowId = newRowId(lastNewRowId);
            final Object[] row = unwrapValues(values, rowId);
            doActionWithIndexes(Action.INSERT, rowId, row);
            lastNewRowId = rowId;
            final ByteBuffer pData = SqlJetBtreeRecord.getRecord(db.getOptions().getEncoding(), row).getRawRecord();
            cursor.insert(null, lastNewRowId, pData, pData.remaining(), 0, true);
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
     * (long, java.util.Map)
     */
    public void update(long rowId, Map<String, Object> values) throws SqlJetException {
        lock();
        try {
            if (rowId <= 0 || !goToRow(rowId))
                throw new SqlJetException(SqlJetErrorCode.MISUSE, "Incorrect rowId value: " + rowId);
            doUpdate(rowId, unwrapValues(values));
        } finally {
            unlock();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#update
     * (java.util.Map)
     */
    public void update(Map<String, Object> values) throws SqlJetException {
        lock();
        try {
            doUpdate(getRowId(), unwrapValues(values));
        } finally {
            unlock();
        }
    }

    /**
     * @param values
     * @return
     * 
     * @throws SqlJetException
     */
    private Object[] unwrapValues(Map<String, Object> values) {
        int i = 0;
        final List<ISqlJetColumnDef> columns = tableDef.getColumns();
        final Object[] unwrapped = new Object[columns.size()];
        for (ISqlJetColumnDef column : columns) {
            final String columnName = column.getName();
            final Object value = values.get(columnName);
            unwrapped[i++] = value;
        }
        return unwrapped;
    }

    private Object[] unwrapValues(Map<String, Object> values, long rowId) throws SqlJetException {
        if (!isRowIdPrimaryKey)
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        int i = 0;
        final List<ISqlJetColumnDef> columns = tableDef.getColumns();
        final Object[] unwrapped = new Object[columns.size()];
        for (ISqlJetColumnDef column : columns) {
            final String columnName = column.getName();
            if (columnName.equalsIgnoreCase(rowIdPrimaryKeyColumn)) {
                unwrapped[i++] = rowId;
            } else {
                unwrapped[i++] = values.get(columnName);
            }
        }
        return unwrapped;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable#getInteger(int)
     */
    @Override
    public long getInteger(int field) throws SqlJetException {
        if (field == rowIdPrimaryKeyColumnIndex) {
            return getRowId();
        } else {
            return super.getInteger(field);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable#isIndexExists
     * (java.lang.String)
     */
    public boolean isIndexExists(String indexName) {
        return (null == indexName && isRowIdPrimaryKey) || getIndexDefinitions().containsKey(indexName);
    }
}
