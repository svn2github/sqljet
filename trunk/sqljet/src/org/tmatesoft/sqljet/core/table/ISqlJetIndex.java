/**
 * ISqlJetIndex.java
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
 * Index's interface.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetIndex {

    /**
     * If 'next' is false then lookup a first index entry which matches to key
     * and return rowId from it. If there isn't any entry matched to key it
     * returns 0.
     * 
     * If 'next' is false then lookup the next index entry which matches to key
     * and return rowId from it. If there isn't any entry matched to key it
     * returns 0.
     * 
     * @param next
     *            lookup next entry which matches key
     * 
     * @param key
     *            key value
     * 
     * @return
     * @throws SqlJetException
     */
    long lookup(boolean next, Object... key) throws SqlJetException;

    /**
     * Delete entry which matches to key and point to given rowId.
     * 
     * @param key
     * 
     * @return true if there was deleted entry which matches to key.
     * 
     * @throws SqlJetException
     */
    boolean delete(long rowId, Object... key) throws SqlJetException;

    /**
     * Write an entry into the table. A new entry is created if it doesn't
     * already exist or the data for an existing entry is overwritten.
     * 
     * @param rowId
     * @param data
     * @throws SqlJetException 
     */
    void insert(long rowId, Object ... data) throws SqlJetException;
    
}