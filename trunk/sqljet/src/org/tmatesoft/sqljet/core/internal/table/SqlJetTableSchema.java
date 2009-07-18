/**
 * SqlJetTableSchema.java
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnConstraint;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnPrimaryKey;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnUnique;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableConstraint;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTablePrimaryKey;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableUnique;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableSchema implements ISqlJetTableSchema {

    public static String AUTOINDEX = "sqlite_autoindex_%s_%d";

    private boolean isRowIdPrimaryKey = false;
    private boolean isAutoincrement = false;

    private Map<String, String> columnsConstraintsIndexes;
    private Map<String, List<String>> tableConstraintsIndexes;

    private String primaryKeyIndex;
    private String rowIdPrimaryKeyColumn;
    private int rowIdPrimaryKeyColumnIndex = -1;
    private List<String> primaryKeyColumns;

    /**
     * 
     */
    public SqlJetTableSchema(ISqlJetTableDef tableDef, Set<ISqlJetIndexDef> indexes) {
        resolveConstraints(tableDef, indexes);
    }

    /**
     * @param tableDef
     * @return
     */
    private void resolveConstraints(ISqlJetTableDef tableDef, Set<ISqlJetIndexDef> indexes) {

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
     * @param i
     * @return
     */
    public static String generateAutoIndexName(String tableName, int i) {
        return String.format(AUTOINDEX, tableName, i);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#isRowIdPrimaryKey
     * ()
     */
    public boolean isRowIdPrimaryKey() {
        return isRowIdPrimaryKey;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#isAutoincrement
     * ()
     */
    public boolean isAutoincrement() {
        return isAutoincrement;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getColumnsConstraintsIndexes()
     */
    public Map<String, String> getColumnsConstraintsIndexes() {
        return columnsConstraintsIndexes;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getTableConstraintsIndexes()
     */
    public Map<String, List<String>> getTableConstraintsIndexes() {
        return tableConstraintsIndexes;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getPrimaryKeyIndex()
     */
    public String getPrimaryKeyIndex() {
        return primaryKeyIndex;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getRowIdPrimaryKeyColumn()
     */
    public String getRowIdPrimaryKeyColumn() {
        return rowIdPrimaryKeyColumn;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getRowIdPrimaryKeyColumnIndex()
     */
    public int getRowIdPrimaryKeyColumnIndex() {
        return rowIdPrimaryKeyColumnIndex;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.table.ISqlJetTableSchema#
     * getPrimaryKeyColumns()
     */
    public List<String> getPrimaryKeyColumns() {
        return primaryKeyColumns;
    }

}
