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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.table;

import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * Table's interface.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetTable {

    /**
     * @return the primaryKeyIndex
     */
    String getPrimaryKeyIndexName() throws SqlJetException;

    /**
     * Get table's schema definition.
     */
    ISqlJetTableDef getDefinition() throws SqlJetException;

    /**
     * Open cursor for all table records. Client is responsible to close the
     * cursor after use.
     */
    ISqlJetCursor open() throws SqlJetException;

    /**
     * Open cursor for indexed records. Client is responsible to close the
     * cursor after use.
     * 
     * @param indexName
     *            Name of the searched index.
     * @param key
     *            Key for the index lookup.
     */
    ISqlJetCursor lookup(String indexName, Object... key) throws SqlJetException;

    /**
     * Open cursors which sorts table by index. If indexName is NULL then
     * primary key will be used.
     * 
     * @param string
     * @return
     * @throws SqlJetException
     */
    ISqlJetCursor order(String indexName) throws SqlJetException;

    /**
     * Open cursor which restricts table to some scope of index values. Scope is
     * specified as pair of index keys. First key means start of scope and last
     * key means end of scope. One of these keys (or even both) could be NULL.
     * In this case scope is open from one side (or both sides). If indexName is
     * NULL then primary key will be used.
     * 
     * @param indexName
     * @param firstKey
     * @param lastKey
     * @return
     * @throws SqlJetException
     */
    ISqlJetCursor scope(String indexName, Object[] firstKey, Object[] lastKey) throws SqlJetException;

    /**
     * Add new record to the table with specified values. All relevant indexes
     * are updated automatically.
     * 
     * @param values
     *            Values for the new record.
     */
    long insert(Object... values) throws SqlJetException;

    /**
     * Insert record by values by names of fields.
     * 
     * @param values
     * @return
     * @throws SqlJetException
     */
    long insertByFieldNames(Map<String, Object> values) throws SqlJetException;

    /**
     * Inserts record at specified rowId. If rowId is 0 then it generates new
     * rowId. If table has INTEGER PRIMARY KEY column and rowId isn't 0 then
     * value for this field will be ignored and could be specified just as null.
     * If table has INTEGER PRIMARY KEY column and rowId is 0 then value for
     * this field used as rowId.
     * 
     * @param rowId
     * @param values
     * @throws SqlJetException
     */
    long insertWithRowId(long rowId, Object... values) throws SqlJetException;
}
