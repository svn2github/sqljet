/**
 * ISqlJetBtreeDataTable.java
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

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeDataTable extends ISqlJetBtreeTable {

    int goToRow(long rowId) throws SqlJetException;

    long getKey() throws SqlJetException;

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
    long newRowId(long prev) throws SqlJetException;

    /**
     * Write an entry into the table. A new entry is created if it doesn't
     * already exist or the data for an existing entry is overwritten.
     * 
     * @param rowId
     * @param data
     * @throws SqlJetException 
     */
    void insert(long rowId, ISqlJetBtreeRecord data, boolean append) throws SqlJetException;
    
    void delete(long rowId) throws SqlJetException;
    
}