/**
 * DataRow.java
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
package org.tmatesoft.sqljet.browser.core.data;

import org.tmatesoft.sqljet.core.SqlJetException;

import org.tmatesoft.sqljet.core.table.ISqlJetCursor;


/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
class DataRow {
    
    public static DataRow read(ISqlJetCursor cursor, long index, String[] names) throws SqlJetException {
        Object[] data = new Object[names.length];
        for(int i = 0; i < names.length; i++) {
            data[i] = cursor.getValue(names[i]);
        }
        return new DataRow(data, index);
    }

    private Object[] myData;
    private long myID;
    
    private DataRow(Object[] data, long rowID) {
        myData = data;
        myID = rowID;
    }
    
    public int getFieldsCount() {
        return myData.length;
    }
    
    public Object getValueAt(int field) {
        return myData[field];
    }
    
    public long getID() {
        return myID;
    }
}
