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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.table.SqlJetOptions;
import org.tmatesoft.sqljet.core.internal.table.SqlJetPragmasHandler;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;

/**
 * Connection to database.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetDb {

    private static final Set<SqlJetBtreeFlags> READ_FLAGS = SqlJetUtility.of(SqlJetBtreeFlags.READONLY);
    private static final Set<SqlJetFileOpenPermission> READ_PERMISSIONS = SqlJetUtility
            .of(SqlJetFileOpenPermission.READONLY);
    private static final Set<SqlJetBtreeFlags> WRITE_FLAGS = SqlJetUtility.of(SqlJetBtreeFlags.READWRITE,
            SqlJetBtreeFlags.CREATE);
    private static final Set<SqlJetFileOpenPermission> WRITE_PREMISSIONS = SqlJetUtility.of(
            SqlJetFileOpenPermission.READWRITE, SqlJetFileOpenPermission.CREATE);

    private final boolean write;
    private ISqlJetDbHandle dbHandle;
    private ISqlJetBtree btree;
    private final ISqlJetSchema schema;

    private boolean transaction;

    /**
     * Create connection to data base.
     * 
     * @param file
     *            path to data base
     * @param write
     *            if true then allow data modification
     * @throws SqlJetException
     */
    protected SqlJetDb(final File file, final boolean write)
            throws SqlJetException {
        this.write = write;
        dbHandle = new SqlJetDbHandle();
        btree = new SqlJetBtree();
        btree.open(file, dbHandle, write ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB, write ? WRITE_PREMISSIONS
                : READ_PERMISSIONS);
        schema = (ISqlJetSchema) runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                ISqlJetSchema schema = null;
                btree.enter();
                try {
                    dbHandle.setOptions(new SqlJetOptions(btree, dbHandle));
                    schema = new SqlJetSchema(dbHandle, btree);
                } finally {
                    btree.leave();
                }
                return schema;
            }
        });
    }

    /**
     * Open connection to data base.
     * 
     * @param file
     *            path to data base
     * @param write
     *            if true then allow data modification
     * @throws SqlJetException
     */
    public static SqlJetDb open(File file, boolean write) throws SqlJetException {
        return new SqlJetDb(file, write);
    }

    /**
     * Close connection to data base.
     * 
     * @throws SqlJetException
     */
    public void close() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                btree.close();
                return null;
            }
        });
    }

    /**
     * Do some actions with locking data base.
     * 
     * @param op
     * @return
     * @throws SqlJetException
     */
    public Object runWithLock(ISqlJetRunnableWithLock op) throws SqlJetException {
        dbHandle.getMutex().enter();
        try {
            return op.runWithLock(this);
        } finally {
            dbHandle.getMutex().leave();
        }
    }

    /**
     * Check write access to data base.
     * 
     * @return true if modification is allowed
     */
    public boolean isWrite() throws SqlJetException {
        return write;
    }

    public ISqlJetSchema getSchema() throws SqlJetException {
        return schema;
    }

    /**
     * Open table.
     * 
     * @param tableName
     *            table name
     * @return opened table
     * @throws SqlJetException
     */
    public SqlJetTable getTable(final String tableName) throws SqlJetException {
        return (SqlJetTable) runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTable(db, schema, tableName, write);
            }
        });
    }

    public Object runWriteTransaction(ISqlJetTransaction op) throws SqlJetException {
        return runTransaction(op, SqlJetTransactionMode.WRITE);
    }

    public Object runTransaction(ISqlJetTransaction op, SqlJetTransactionMode mode) throws SqlJetException {
        if (!write) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Database is not writable");
        }
        dbHandle.getMutex().enter();
        try {

            boolean success = false;
            btree.beginTrans(mode);
            try {
                Object result = op.run(this);
                success = true;
                btree.commit();
                return result;
            } finally {
                if (!success) {
                    btree.rollback();
                }
            }

        } finally {
            dbHandle.getMutex().leave();
        }
    }

    /**
     * Begin transaction if write access is allowed.
     * 
     * @throws SqlJetException
     */
    public void beginTransaction() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    throw new SqlJetException("Write transaction already in progress.");
                }
                if (write) {
                    btree.beginTrans(SqlJetTransactionMode.WRITE);
                    transaction = true;
                }
                return null;
            }
        });
    }

    /**
     * Commit transaction.
     * 
     * @throws SqlJetException
     */
    public void commit() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (write && transaction) {
                    btree.commit();
                    transaction = false;
                }
                return null;
            }
        });
    }

    /**
     * Rollback transaction.
     * 
     * @throws SqlJetException
     */
    public void rollback() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (write && transaction) {
                    btree.rollback();
                    transaction = false;
                }
                return null;
            }
        });
    }

    public ISqlJetOptions getOptions() throws SqlJetException {
        return dbHandle.getOptions();
    }

    /**
     * Executes pragma statement. If statement queries pragma value then pragma
     * value will be returned.
     */
    public Object pragma(final String sql) throws SqlJetException {
        return runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetPragmasHandler(getOptions()).pragma(sql);
            }
        });
    }
}
