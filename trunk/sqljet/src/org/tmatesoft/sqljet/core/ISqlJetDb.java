/**
 * ISqlJetDb.java
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
package org.tmatesoft.sqljet.core;

import java.io.File;
import java.util.Set;

import org.tmatesoft.sqljet.core.table.SqlJetIndex;
import org.tmatesoft.sqljet.core.table.SqlJetTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetDb {

    /**
     * Open data base.
     * 
     * @param file
     *            path to database
     * @param write
     *            false for read-only
     * 
     * @throws SqlJetException
     */
    void open(File file, boolean write) throws SqlJetException;

    /**
     * @return the write
     */
    boolean isWrite();

    /**
     * @throws SqlJetException
     */
    void close() throws SqlJetException;

    SqlJetEncoding getEncoding();

    /**
     * 
     */
    void lock();

    /**
     * 
     */
    void unlock();

    /**
     * @return
     */
    Set<String> getTablesNames();

    /**
     * @param tableName
     * @return
     */
    Set<String> getIndexesNames(String tableName);

    SqlJetTable openTable(String tableName) throws SqlJetException;

    SqlJetIndex openIndex(String indexName) throws SqlJetException;

    void beginTransaction() throws SqlJetException;

    void commit() throws SqlJetException;

    void rollback() throws SqlJetException;

}