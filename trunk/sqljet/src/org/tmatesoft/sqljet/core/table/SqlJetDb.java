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
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.ISqlJetLimits;
import org.tmatesoft.sqljet.core.internal.ISqlJetMutex;
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
 * <p>
 * Connection to database. This class currently is main entry point in SQLJet
 * API.
 * </p>
 * 
 * <p>
 * It allows to perform next tasks:
 * 
 * <ul>
 * <li>Open existed and create new SQLite database.</li>
 * <li>Get and modify database's schema.</li>
 * <li>Control transactions.</li>
 * <li>Read, search and modify data in database.</li>
 * <li>Get and set database's options.</li>
 * </ul>
 * 
 * </p>
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetDb implements ISqlJetLimits {

    private static final String TRANSACTION_ALREADY_STARTED = "Transaction already started";

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

    private boolean transaction;
    private SqlJetTransactionMode transactionMode;

    private boolean open = false;

    /**
     * Creates connection to database. Does not read the scheme so as not to
     * lock the database.
     * 
     * @param file
     *            path to data base. If file not exists then it will be tried to
     *            create.
     * @param writable
     *            if true then allow data modification.
     * @throws SqlJetException
     *             if any trouble with access to file or database format.
     */
    protected SqlJetDb(final File file, final boolean writable) throws SqlJetException {
        this.writable = writable;
        dbHandle = new SqlJetDbHandle();
        dbHandle.setBusyHandler(new SqlJetDefaultBusyHandler());
        btree = new SqlJetBtree();
        btree.open(file, dbHandle, writable ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB,
                writable ? WRITE_PREMISSIONS : READ_PERMISSIONS);
        open = true;
    }

    /**
     * Reads database schema and options.
     * 
     * @throws SqlJetException
     */
    private void readSchema() throws SqlJetException {
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                btree.enter();
                try {
                    dbHandle.setOptions(new SqlJetOptions(btree, dbHandle));
                    btree.setSchema(new SqlJetSchema(dbHandle, btree));
                } finally {
                    btree.leave();
                }
                return null;
            }
        });
    }

    /**
     * Opens connection to data base. It does not create any locking on
     * database. First lock will be created when be called any method which
     * requires real access to options or schema.
     * 
     * @param file
     *            path to data base. If file not exists then it will be tried to
     *            create.
     * @param writable
     *            if true then allow data modification.
     * @throws SqlJetException
     *             if any trouble with access to file or database format.
     */
    public static SqlJetDb open(File file, boolean write) throws SqlJetException {
        return new SqlJetDb(file, write);
    }

    /**
     * Checks is database open.
     * 
     * @return true if database is open.
     */
    public boolean isOpen() {
        return open;
    }

    private void checkOpen() throws SqlJetException {
        if (!isOpen())
            throw new SqlJetException(SqlJetErrorCode.MISUSE, "Database closed");
    }

    /**
     * Close connection to database. It is safe to call this method if database
     * connections is closed already.
     * 
     * @throws SqlJetException
     *             it is possible to get exception if there is actvie
     *             transaction and rollback did not success.
     */
    public void close() throws SqlJetException {
        if (open) {
            runWithLock(new ISqlJetRunnableWithLock() {
                public Object runWithLock(SqlJetDb db) throws SqlJetException {
                    if (btree != null) {
                        btree.close();
                        btree = null;
                        open = false;
                    }
                    return null;
                }
            });
            if (!open) {
                dbHandle = null;
            }
        }
    }

    /**
     * Set cache size (in count of pages).
     * 
     * @param cacheSize
     *            the count of pages which can hold cache.
     * @throws SqlJetException
     */
    public void setCacheSize(final int cacheSize) throws SqlJetException {
        checkOpen();
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                btree.setCacheSize(cacheSize);
                return null;
            }
        });
    }

    /**
     * Get cache size (in count of pages).
     * 
     * @return the count of pages which can hold cache.
     * @throws SqlJetException
     */
    public int getCacheSize() throws SqlJetException {
        checkOpen();
        refreshSchema();
        return (Integer) runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return btree.getCacheSize();
            }
        });
    }

    /**
     * Do some actions with locking database's internal threads synchronization
     * mutex. It is related only with synchronization of access to one
     * connection from multiple threads. It is not related with transactions and
     * locks of database file. For concurrent access to database from threads or
     * processes use transactions.
     * 
     * @param op
     * @return
     * @throws SqlJetException
     */
    public Object runWithLock(ISqlJetRunnableWithLock op) throws SqlJetException {
        checkOpen();
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
        checkOpen();
        return writable;
    }

    /**
     * Get database schema.
     * 
     * @return database schema.
     * @throws SqlJetException
     */
    public ISqlJetSchema getSchema() throws SqlJetException {
        return getSchemaInternal();
    }

    private SqlJetSchema getSchemaInternal() throws SqlJetException {
        checkOpen();
        refreshSchema();
        return btree.getSchema();
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
        checkOpen();
        refreshSchema();
        return (SqlJetTable) runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                return new SqlJetTable(db, btree, tableName, writable);
            }
        });
    }

    /**
     * Run modifications in write transaction.
     * 
     * @param op
     *            transaction's body (closure).
     * @return
     * @throws SqlJetException
     */
    public Object runWriteTransaction(ISqlJetTransaction op) throws SqlJetException {
        checkOpen();
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
     *            transaction's body (closure).
     * @return
     * @throws SqlJetException
     */
    public Object runReadTransaction(ISqlJetTransaction op) throws SqlJetException {
        checkOpen();
        return runTransaction(op, SqlJetTransactionMode.READ_ONLY);
    }

    /**
     * Run transaction.
     * 
     * @param op
     *            transaction's body (closure).
     * @param mode
     *            transaction's mode.
     * @return
     * @throws SqlJetException
     */
    public Object runTransaction(final ISqlJetTransaction op, final SqlJetTransactionMode mode) throws SqlJetException {
        checkOpen();
        return runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    if (mode != transactionMode && transactionMode == SqlJetTransactionMode.READ_ONLY) {
                        throw new SqlJetException(SqlJetErrorCode.MISUSE, TRANSACTION_ALREADY_STARTED);
                    } else {
                        return op.run(SqlJetDb.this);
                    }
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
                        transactionMode = null;
                    }
                }
            }

        });
    }

    /**
     * Begin transaction.
     * 
     * @param mode
     *            transaction's mode.
     * @throws SqlJetException
     */
    public void beginTransaction(final SqlJetTransactionMode mode) throws SqlJetException {
        checkOpen();
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                refreshSchema();
                if (transaction) {
                    throw new SqlJetException(SqlJetErrorCode.MISUSE, TRANSACTION_ALREADY_STARTED);
                } else {
                    btree.beginTrans(mode);
                    transaction = true;
                    transactionMode = mode;
                    return null;
                }
            }
        });
    }

    /**
     * Commit transaction.
     * 
     * @throws SqlJetException
     */
    public void commit() throws SqlJetException {
        checkOpen();
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    btree.closeAllCursors();
                    btree.commit();
                    transaction = false;
                    transactionMode = null;
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
        checkOpen();
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (transaction) {
                    try {
                        btree.closeAllCursors();
                        btree.rollback();
                    } finally {
                        transaction = false;
                        transactionMode = null;
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
        checkOpen();
        if (null == btree.getSchema()) {
            readSchema();
        }
        return dbHandle.getOptions();
    }

    /**
     * Executes pragma statement. If statement queries pragma value then pragma
     * value will be returned.
     */
    public Object pragma(final String sql) throws SqlJetException {
        checkOpen();
        refreshSchema();
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
     *            CREATE TABLE ... sentence.
     * @return definition of create table.
     * @throws SqlJetException
     */
    public ISqlJetTableDef createTable(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetTableDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().createTable(sql);
            }
        });
    }

    /**
     * Create index from SQL clause.
     * 
     * @param sql
     *            CREATE INDEX ... sentence.
     * @return definition of created index.
     * @throws SqlJetException
     */
    public ISqlJetIndexDef createIndex(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetIndexDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().createIndex(sql);
            }
        });
    }

    /**
     * Drop table.
     * 
     * @param tableName
     *            name of table.
     * @throws SqlJetException
     */
    public void dropTable(final String tableName) throws SqlJetException {
        checkOpen();
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                getSchemaInternal().dropTable(tableName);
                return null;
            }
        });
    }

    /**
     * Drop index.
     * 
     * @param indexName
     *            name of index.
     * @throws SqlJetException
     */
    public void dropIndex(final String indexName) throws SqlJetException {
        checkOpen();
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                getSchemaInternal().dropIndex(indexName);
                return null;
            }
        });
    }

    /**
     * Alters table.
     * 
     * @param sql
     *            ALTER TABLE ... sentence.
     * @return
     * @throws SqlJetException
     */
    public ISqlJetTableDef alterTable(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetTableDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().alterTable(sql);
            }
        });

    }

    /**
     * Get busy handler.
     * 
     * @return the busy handler.
     */
    public ISqlJetBusyHandler getBusyHandler() {
        return dbHandle.getBusyHandler();
    }

    /**
     * Set busy handler. Busy handler treats situation when database is locked
     * by other process or thread.
     * 
     * @param busyHandler
     *            the busy handler.
     */
    public void setBusyHandler(ISqlJetBusyHandler busyHandler) {
        dbHandle.setBusyHandler(busyHandler);
    }

    /**
     * Refresh database schema.
     * 
     * @throws SqlJetException
     */
    public void refreshSchema() throws SqlJetException {
        if (null == btree.getSchema() || !getOptions().verifySchemaVersion(false)) {
            readSchema();
        }
    }

    /**
     * Return true if a transaction is active.
     * 
     * @return
     */
    public boolean isInTransaction() {
        return transaction;
    }

    public SqlJetTransactionMode getTransactionMode() {
        return transactionMode;
    }

    /**
     * Get threading synchronization mutex.
     * 
     * @return
     */
    public ISqlJetMutex getMutex() {
        return dbHandle.getMutex();
    }
}
