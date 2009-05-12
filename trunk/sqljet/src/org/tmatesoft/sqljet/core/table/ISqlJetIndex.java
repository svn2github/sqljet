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
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetIndex {

    /**
     * Lookup first index entry which matches to key and return rowId from it.
     * If there isn't any entry matched to key it returns 0.
     * 
     * @param key
     * @return
     * @throws SqlJetException
     */
    long lookup(Object... key) throws SqlJetException;

    /**
     * Lookup next index entry which matches to key and return rowId from it. If
     * there isn't any entry matched to key it returns 0. This method must be
     * called after sucessful call of {@link ISqlJetIndex#lookup(Object...)}.
     * 
     * @param key
     * @return
     * @throws SqlJetException
     */
    long lookupNext(Object... key) throws SqlJetException;

    /**
     * Writes index entry into the index. Entry is data table's rowId and key
     * @param record
     * 
     * @throws SqlJetException
     */
    void insert(long rowId, Object... key) throws SqlJetException;

    /**
     * Delete current entry from index.
     * 
     * @throws SqlJetException
     */
    void delete() throws SqlJetException;

    /**
     * Delete entry which matches to key.
     * 
     * @param key
     * @throws SqlJetException
     */
    void delete(Object... key) throws SqlJetException;

}