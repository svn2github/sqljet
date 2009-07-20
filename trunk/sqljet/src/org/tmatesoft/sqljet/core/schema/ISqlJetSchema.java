/**
 * ISqlJetSchema.java
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
package org.tmatesoft.sqljet.core.schema;

import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 */
public interface ISqlJetSchema {

    Set<String> getTableNames() throws SqlJetException;

    ISqlJetTableDef getTable(String name) throws SqlJetException;

    Set<String> getIndexNames() throws SqlJetException;

    ISqlJetIndexDef getIndex(String name) throws SqlJetException;

    Set<ISqlJetIndexDef> getIndexes(String tableName) throws SqlJetException;

    ISqlJetTableDef createTable(String sql) throws SqlJetException;

    ISqlJetIndexDef createIndex(String sql) throws SqlJetException;

    void dropTable(String tableName) throws SqlJetException;

    void dropIndex(String indexName) throws SqlJetException;
}
