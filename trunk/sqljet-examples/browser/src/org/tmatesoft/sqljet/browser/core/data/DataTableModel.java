/**
 * DataTableModel.java
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
package org.tmatesoft.sqljet.browser.core.data;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DataTableModel implements TableModel {
    
    public static DataTableModel createInstance(ISqlJetTable table, long fromID) throws SqlJetException {
        ArrayList<DataRow> data = new ArrayList<DataRow>(1000);
        ISqlJetTableDef tableDef = table.getDefinition();
        List<String> names = new ArrayList<String>();
        for(ISqlJetColumnDef column : tableDef.getColumns()) {
            names.add(column.getName());
        }
        String[] namesArray = (String[]) names.toArray(new String[names.size()]);

        ISqlJetCursor cursor = table.open();
        try {
            cursor.goTo(fromID);
            int count = 0;
            while(!cursor.eof() && count < 1000) {
                data.add(DataRow.read(cursor, namesArray));
                cursor.next();
                count++;
            }
        } finally {
            cursor.close();
        }
        return new DataTableModel(data, namesArray);
    }
    
    private List<DataRow> myData;
    private String[] myNames;
    
    private DataTableModel(List<DataRow> data, String[] names) {
        myData = data;
        myNames = names;
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
    public int getRowCount() {
        return myData.size();
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        columnIndex -= 1;
        if (columnIndex < 0) {
            return myData.get(rowIndex).getID();
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
