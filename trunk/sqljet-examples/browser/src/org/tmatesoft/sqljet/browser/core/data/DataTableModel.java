/**
 * DataTableModel.java
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
package org.tmatesoft.sqljet.browser.core.data;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.tmatesoft.sqljet.browser.core.IProgress;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class DataTableModel implements TableModel {

    public static TableModel createInstance(final ISqlJetTable table, final long fromID, final int pageSize,
            final IProgress progress) throws SqlJetException {
        if (table == null) {
            return new DefaultTableModel();
        }
        final ArrayList<DataRow> data = new ArrayList<DataRow>(pageSize);
        final ISqlJetTableDef tableDef = table.getDefinition();
        final List<String> names = new ArrayList<String>();
        for (ISqlJetColumnDef column : tableDef.getColumns()) {
            names.add(column.getName());
        }
        final String[] namesArray = (String[]) names.toArray(new String[names.size()]);

        table.getDataBase().runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor cursor = table.open();// order(table.getPrimaryKeyIndexName());
                try {
                    for (long i = 0; i < fromID && !cursor.eof(); i++) {
                        cursor.next();
                    }
                    int count = 0;
                    while (!cursor.eof() && count < pageSize) {
                        data.add(DataRow.read(cursor, fromID + count, namesArray));
                        progress.current(count);
                        cursor.next();
                        count++;
                    }
                } finally {
                    cursor.close();
                }
                return null;
            }
        });

        return new DataTableModel(data, namesArray, fromID);
    }

    private List<DataRow> myData;
    private String[] myNames;
    private long myIndex;

    private DataTableModel(List<DataRow> data, String[] names, long fromIndex) {
        myData = data;
        myNames = names;
        myIndex = fromIndex;
    }

    public Class<?> getColumnClass(int columnIndex) {
        return Object.class;
    }

    public int getColumnCount() {
        return myNames.length + 1;
    }

    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "";
        }
        return myNames[columnIndex - 1];
    }

    public long getFirstIndex() {
        return myIndex;
    }

    public int getRowCount() {
        return myData.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        columnIndex -= 1;
        if (columnIndex < 0) {
            return myData.get(rowIndex).getID() + 1;
        }
        return myData.get(rowIndex).getValueAt(columnIndex);
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {
    }
}
