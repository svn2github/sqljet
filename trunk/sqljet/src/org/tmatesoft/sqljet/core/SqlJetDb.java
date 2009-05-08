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
 * Connection to database.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetDb {

    private static final EnumSet<SqlJetBtreeFlags> READ_FLAGS = EnumSet.of(SqlJetBtreeFlags.READONLY);
    private static final EnumSet<SqlJetFileOpenPermission> READ_PERMISSIONS = EnumSet
            .of(SqlJetFileOpenPermission.READONLY);
    private static final EnumSet<SqlJetBtreeFlags> WRITE_FLAGS = EnumSet.of(SqlJetBtreeFlags.READWRITE,
            SqlJetBtreeFlags.CREATE);
    private static final EnumSet<SqlJetFileOpenPermission> WRITE_PREMISSIONS = EnumSet.of(
            SqlJetFileOpenPermission.READWRITE, SqlJetFileOpenPermission.CREATE);

    private final boolean write;
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

    protected SqlJetDb(File file, boolean write) throws SqlJetException {
        this.write = write;
        db = new SqlJetDbHandle();
        btree = new SqlJetBtree();
        btree.open(file, db, write ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB, write ? WRITE_PREMISSIONS
                : READ_PERMISSIONS);
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                btree.enter();
                try {
                    schema = new SqlJetBtreeSchema(btree);
                    db.setEnc(schema.getMeta().getEncoding());
                } finally {
                    btree.leave();
                }
                return null;
            }
        });
    }

    public static SqlJetDb open(File file, boolean write) throws SqlJetException {
        return new SqlJetDb(file, write);
    }

    public void close() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                btree.close();
                return null;
            }
        });
    }

    public Object runWithLock(ISqlJetRunnableWithLock op) throws SqlJetException {
        Object result = null;
        db.getMutex().enter();
        try {
            result = op.runWithLock();
        } finally {
            db.getMutex().leave();
        }
        return result;
    }

    public boolean isWrite() {
        return write;
    }

    public SqlJetEncoding getEncoding() {
        return db.getEnc();
    }

    public Set<String> getTableNames() {
        return schema.getTableNames();
    }

    public Set<String> getIndexNames(String tableName) {
        return schema.getTableIndexes(tableName);
    }

    public SqlJetTable openTable(final String tableName) throws SqlJetException {
        return (SqlJetTable) runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return new SqlJetDataTable(new SqlJetBtreeDataTable(schema, tableName, write));
            }
        });
    }

    public SqlJetIndex openIndex(final String indexName) throws SqlJetException {
        return (SqlJetIndexTable) runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return new SqlJetIndexTable(new SqlJetBtreeIndexTable(schema, indexName, write));
            }
        });
    }

    public void beginTransaction() throws SqlJetException {
        if (write) {
            btree.beginTrans(SqlJetTransactionMode.WRITE);
        }
    }

    public void commit() throws SqlJetException {
        if (write) {
            btree.commit();
        }
    }

    public void rollback() throws SqlJetException {
        if (write) {
            btree.rollback();
        }
    }
}
