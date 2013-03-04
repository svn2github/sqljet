/**
 * SchemaRowModel.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.browser.core.schema;

import org.netbeans.swing.outline.RowModel;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SchemaRowModel implements RowModel {

    private static final String[] COLUMN_NAMES = {"Object", "Type", "Schema"};

    public Class<?> getColumnClass(int index) {
        return String.class;
    }
    
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    public String getColumnName(int index) {
        return COLUMN_NAMES[index];
    }
    
    public Object getValueFor(Object node, int index) {
        SchemaTreeNode treeNode = (SchemaTreeNode) node;
        if (index == 0) {
            return treeNode.getTypeName();
        } else if (index == 1) {
            return treeNode.getType();
        } else if (index == 2) {
            return treeNode.getSchema();
        }
        return null;
    }
    
    public boolean isCellEditable(Object arg0, int arg1) {
        return false;
    }
    public void setValueFor(Object arg0, int arg1, Object arg2) {
    }
}
