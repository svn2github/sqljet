/**
 * SqlJetDataBase.java
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
import java.util.EnumSet;
import java.util.Set;

import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.btree.table.SqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.btree.table.SqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.btree.table.SqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.table.SqlJetIndex;
import org.tmatesoft.sqljet.core.table.SqlJetTable;

/**
 * SQLJet API data base class.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetDb implements ISqlJetDb {

    private static final EnumSet<SqlJetBtreeFlags> READ_FLAGS = EnumSet.of(SqlJetBtreeFlags.READONLY);
    private static final EnumSet<SqlJetFileOpenPermission> READ_PERMISSIONS = EnumSet
            .of(SqlJetFileOpenPermission.READONLY);
    private static final EnumSet<SqlJetBtreeFlags> WRITE_FLAGS = EnumSet.of(SqlJetBtreeFlags.READWRITE,
            SqlJetBtreeFlags.CREATE);
    private static final EnumSet<SqlJetFileOpenPermission> WRITE_PREMISSIONS = EnumSet.of(
            SqlJetFileOpenPermission.READWRITE, SqlJetFileOpenPermission.CREATE);

    private File file;
    private boolean write;
    private ISqlJetDbHandle db;
    private ISqlJetBtree btree;
    private ISqlJetBtreeSchema schema;

    public static class SqlJetDataTable extends SqlJetTable {
        SqlJetDataTable(ISqlJetBtreeDataTable dataTable) {
            super(dataTable);
        }
    }

    public static class SqlJetIndexTable extends SqlJetIndex {
        SqlJetIndexTable(ISqlJetBtreeIndexTable indexTable) {
            super(indexTable);
        }
    }
    
    SqlJetDb() {
        
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#open(java.io.File, boolean)
     */
    public void open(File file, boolean write) throws SqlJetException {

        this.file = file;
        this.write = write;

        db = new SqlJetDbHandle();
        btree = new SqlJetBtree();
        btree.open(file, db, write ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB, write ? WRITE_PREMISSIONS
                : READ_PERMISSIONS);
        db.getMutex().enter();
        btree.enter();
        try {
            schema = new SqlJetBtreeSchema(btree);
            db.setEnc(schema.getMeta().getEncoding());
        } finally {
            btree.leave();
            db.getMutex().leave();
        }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#isWrite()
     */
    public boolean isWrite() {
        return write;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#close()
     */
    public void close() throws SqlJetException {
        lock();
        try {
            btree.close();
        } finally {
            unlock();
        }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getEncoding()
     */
    public SqlJetEncoding getEncoding() {
        return db.getEnc();
    } 
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#lock()
     */
    public void lock() {
        db.getMutex().enter();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#unlock()
     */
    public void unlock() {
        db.getMutex().leave();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getTablesNames()
     */
    public Set<String> getTablesNames() {
        return schema.getTableNames();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#getIndexesNames(java.lang.String)
     */
    public Set<String> getIndexesNames(String tableName) {
        return schema.getTableIndexes(tableName);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#openTable(java.lang.String)
     */
    public SqlJetTable openTable(String tableName) throws SqlJetException {
        lock();
        try {
            return new SqlJetDataTable(new SqlJetBtreeDataTable(schema, tableName, write));
        } finally {
            unlock();
        }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#openIndex(java.lang.String)
     */
    public SqlJetIndex openIndex(String indexName) throws SqlJetException {
        lock();
        try {
            return new SqlJetIndexTable(new SqlJetBtreeIndexTable(schema, indexName, write));
        } finally {
            unlock();
        }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#beginTransaction()
     */
    public void beginTransaction() throws SqlJetException {
        if (write)
            btree.beginTrans(SqlJetTransactionMode.WRITE);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#commit()
     */
    public void commit() throws SqlJetException {
        if (write)
            btree.commit();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetDb#rollback()
     */
    public void rollback() throws SqlJetException {
        if (write)
            btree.rollback();
    }
}
