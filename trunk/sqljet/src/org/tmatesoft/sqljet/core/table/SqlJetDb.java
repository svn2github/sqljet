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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.ISqlJetLimits;
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
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * Connection to database.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetDb implements ISqlJetLimits {

    private static final class BusyHandler implements ISqlJetBusyHandler {

        private static final int TRANSACTION_BUSY_RETRIES = SqlJetUtility.getIntSysProp(
                "SQLJET.TRANSACTION_BUSY_RETRIES", 1000);
        private static final int TRANSACTION_BUSY_SLEEP = SqlJetUtility.getIntSysProp("SQLJET.TRANSACTION_BUSY_SLEEP",
                1);

        public boolean call(int number) {
            try {
                Thread.sleep(TRANSACTION_BUSY_SLEEP);
            } catch (InterruptedException e) {
                return false;
            }
            return number <= TRANSACTION_BUSY_RETRIES;
        }
    }

    private static final BusyHandler busyHandler = new BusyHandler();

    private static final Set<SqlJetBtreeFlags> READ_FLAGS = SqlJetUtility.of(SqlJetBtreeFlags.READONLY);
    private static final Set<SqlJetFileOpenPermission> READ_PERMISSIONS = SqlJetUtility
            .of(SqlJetFileOpenPermission.READONLY);
    private static final Set<SqlJetBtreeFlags> WRITE_FLAGS = SqlJetUtility.of(SqlJetBtreeFlags.READWRITE,
            SqlJetBtreeFlags.CREATE);
    private static final Set<SqlJetFileOpenPermission> WRITE_PREMISSIONS = SqlJetUtility.of(
            SqlJetFileOpenPermission.READWRITE, SqlJetFileOpenPermission.CREATE);

    private final boolean writable;
    private ISqlJetDbHandle dbHandle;
    private ISqlJetBtree btree;
    private final SqlJetSchema schema;

    private boolean transaction;

    /**
     * Create connection to data base.
     * 
     * @param file
     *            path to data base
     * @param writable
     *            if true then allow data modification
     * @throws SqlJetException
     */
    protected SqlJetDb(final File file, final boolean writable) throws SqlJetException {
        this.writable = writable;
        dbHandle = new SqlJetDbHandle();
        dbHandle.setBusyHandler(busyHandler);
        btree = new SqlJetBtree();
        btree.open(file, dbHandle, writable ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB,
                writable ? WRITE_PREMISSIONS : READ_PERMISSIONS);
        schema = (SqlJetSchema) runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                SqlJetSchema schema = null;
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
     *            if true then allows data modification
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
    public boolean isWritable() throws SqlJetException {
        return writable;
    }

    /**
     * Get database schema.
     * 
     * @return
     * @throws SqlJetException
     */
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
    public ISqlJetTable getTable(final String tableName) throws SqlJetException {
        return (SqlJetTable) runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTable(db, schema, tableName, writable);
            }
        });
    }

    /**
     * Run modifications in write transaction.
     * 
     * @param op
     * @return
     * @throws SqlJetException
     */
    public Object runWriteTransaction(ISqlJetTransaction op) throws SqlJetException {
        if (writable) {
            return runTransaction(op, SqlJetTransactionMode.WRITE);
        } else {
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Can't start write transaction on read-only database");
        }
    }

    /**
     * Run read-only transaction.
     * 
     * @param op
     * @return
     * @throws SqlJetException
     */
    public Object runReadTransaction(ISqlJetTransaction op) throws SqlJetException {
        return runTransaction(op, SqlJetTransactionMode.READ_ONLY);
    }

    /**
     * Run transaction.
     * 
     * @param op
     * @param mode
     * @return
     * @throws SqlJetException
     */
    public Object runTransaction(final ISqlJetTransaction op, final SqlJetTransactionMode mode) throws SqlJetException {
        return runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    return op.run(SqlJetDb.this);
                } else {
                    beginTransaction(mode);
                    boolean success = false;
                    try {
                        final Object result = op.run(SqlJetDb.this);
                        btree.commit();
                        success = true;
                        return result;
                    } finally {
                        if (!success) {
                            btree.rollback();
                        }
                        transaction = false;
                    }
                }
            }

        });
    }

    /**
     * Begin transaction.
     * 
     * @param mode
     * @throws SqlJetException
     */
    public void beginTransaction(final SqlJetTransactionMode mode) throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    throw new SqlJetException(SqlJetErrorCode.MISUSE, "Transaction already started");
                } else {
                    btree.beginTrans(mode);
                    transaction = true;
                    return null;
                }
            }
        });
    }

    /**
     * Begin transaction if write access is allowed.
     * 
     * @throws SqlJetException
     */
    @Deprecated
    public void beginTransaction() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    throw new SqlJetException("Write transaction already in progress.");
                }
                if (writable) {
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
                if (transaction) {
                    btree.commit();
                    transaction = false;
                } else {
                    throw new SqlJetException(SqlJetErrorCode.MISUSE, "Transaction wasn't started");
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
                if (transaction) {
                    try {
                        btree.rollback();
                    } finally {
                        transaction = false;
                    }
                } else {
                    throw new SqlJetException(SqlJetErrorCode.MISUSE, "Transaction wasn't started");
                }
                return null;
            }
        });
    }

    /**
     * Get database options.
     * 
     * @return
     * @throws SqlJetException
     */
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

    /**
     * Create table from SQL clause.
     * 
     * @param sql
     * @return
     * @throws SqlJetException
     */
    public ISqlJetTableDef createTable(final String sql) throws SqlJetException {
        return (ISqlJetTableDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return schema.createTable(sql);
            }
        });
    }

    /**
     * Create index from SQL clause.
     * 
     * @param sql
     * @return
     * @throws SqlJetException
     */
    public ISqlJetIndexDef createIndex(final String sql) throws SqlJetException {
        return (ISqlJetIndexDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return schema.createIndex(sql);
            }
        });
    }

    /**
     * Drop table.
     * 
     * @param tableName
     * @throws SqlJetException
     */
    public void dropTable(final String tableName) throws SqlJetException {
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                schema.dropTable(tableName);
                return null;
            }
        });
    }

    /**
     * Drop index.
     * 
     * @param indexName
     * @throws SqlJetException
     */
    public void dropIndex(final String indexName) throws SqlJetException {
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                schema.dropIndex(indexName);
                return null;
            }
        });
    }
}
