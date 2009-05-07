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
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeIndexTable extends ISqlJetBtreeTable {

    ISqlJetBtreeRecord lookup(ISqlJetBtreeRecord key) throws SqlJetException;

    /**
     * Writes key into the index. Data for the entry is nil.
     * 
     * Append flag that provides a hint to the b-tree layer that this insert is
     * likely to be an append.
     * 
     * @param record
     * @param append
     * @throws SqlJetException
     */
    void insert(ISqlJetBtreeRecord key, boolean append) throws SqlJetException;

    void delete(ISqlJetBtreeRecord key) throws SqlJetException;
    
}