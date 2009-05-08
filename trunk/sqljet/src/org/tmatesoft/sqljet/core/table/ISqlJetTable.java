/**
 * ISqlJetTable.java
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
package org.tmatesoft.sqljet.core.table;

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetTable {

    int goToRow(long rowId) throws SqlJetException;

    long getRowId() throws SqlJetException;

    long newRowId() throws SqlJetException;

    void delete(long rowId) throws SqlJetException;

    /**
     * Write an entry into the table. A new entry is created if it doesn't
     * already exist or the data for an existing entry is overwritten.
     * 
     * @param rowId
     * @param data
     * @throws SqlJetException 
     */
    void insert(long rowId, SqlJetRecord data) throws SqlJetException;

}