/**
 * ISqlJetBtreeIndexTable.java
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
 * 
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeIndexTable extends ISqlJetBtreeTable {

    /**
     * Lookup index entry by key values. If 'next' is true then just check next entry in index.
     * 
     * @param next just check next index entry
     * @param values the key values
     * 
     * @return
     * @throws SqlJetException
     */
    long lookup(boolean next, Object... values) throws SqlJetException;
    
    /**
     * Writes key into the index. Data for the entry is nil.
     * 
     * Append flag that provides a hint to the b-tree layer that this insert is
     * likely to be an append.
     * 
     * @param rowId
     * @param append
     * @param key
     * @throws SqlJetException
     */
    void insert(long rowId, boolean append, Object... key) throws SqlJetException;

    /**
     * Delete entry which matches to key and point to given rowId.
     * 
     * @param rowId
     * @param key
     * 
     * @return true if there was deleted entry which matches to key.
     * 
     * @throws SqlJetException
     */
    boolean delete(long rowId, Object... key) throws SqlJetException;
 
    /**
     * Check current record against key.
     * 
     * @param key
     * @return
     * @throws SqlJetException
     */
    boolean checkKey(Object... key) throws SqlJetException;
    
    long getKeyRowId() throws SqlJetException;
    
}