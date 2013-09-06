/**
 * SqlJetDataBase.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
import java.io.IOException;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.internal.ISqlJetPager;
import org.tmatesoft.sqljet.core.internal.table.SqlJetPragmasHandler;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTriggerDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetViewDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetVirtualTableDef;
import org.tmatesoft.sqljet.core.table.engine.ISqlJetEngineSynchronized;
import org.tmatesoft.sqljet.core.table.engine.ISqlJetEngineTransaction;
import org.tmatesoft.sqljet.core.table.engine.SqlJetEngine;

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
public class SqlJetDb extends SqlJetEngine {

    /**
     * File name for in memory database.
     */
    public static final File IN_MEMORY = new File(ISqlJetPager.MEMORY_DB);
    
    private SqlJetDb temporaryDb;

    /**
     * <p>
     * Creates connection to database but not open it. Doesn't open database
     * file until not called method {@link #open()}.
     * </p>
     * 
     * <p>
     * File could be null or have special value {@link #IN_MEMORY}. If file is
     * null then will be created temporary file which will be deleted at close.
     * If file is {@link #IN_MEMORY} then file doesn't created and instead
     * database will placed in memory. If regular file is specified but doesn't
     * exist then it will be tried to created.
     * </p>
     * 
     * @param file
     *            path to data base. Could be null or {@link #IN_MEMORY}.
     * @param writable
     *            if true then will allow data modification.
     */
    public SqlJetDb(final File file, final boolean writable) {
        super(file, writable);
    }

    public SqlJetDb(final File file, final boolean writable, final ISqlJetFileSystem fs) {
        super(file, writable, fs);
    }

    public SqlJetDb(final File file, final boolean writable, final String fsName) throws SqlJetException {
        super(file, writable, fsName);
    }

    /**
     * <p>
     * Opens connection to data base. It does not create any locking on
     * database. First lock will be created when be called any method which
     * requires real access to options or schema.
     * <p>
     * 
     * <p>
     * File could be null or have special value {@link #IN_MEMORY}. If file is
     * null then will be created temporary file which will be deleted at close.
     * If file is {@link #IN_MEMORY} then file doesn't created and instead
     * database will placed in memory. If regular file is specified but doesn't
     * exist then it will be tried to created.
     * </p>
     * 
     * @param file
     *            path to data base. Could be null or {@link #IN_MEMORY}.
     * @param write
     *            open for writing if true.
     * @throws SqlJetException
     *             if any trouble with access to file or database format.
     */
    public static SqlJetDb open(File file, boolean write) throws SqlJetException {
        final SqlJetDb db = new SqlJetDb(file, write);
        db.open();
        return db;
    }

    /**
     * @param file
     * @param write
     * @param fs
     * @return SqlJetDb object for opened database
     * @throws SqlJetException
     */
    public static SqlJetDb open(File file, boolean write, final ISqlJetFileSystem fs) throws SqlJetException {
        final SqlJetDb db = new SqlJetDb(file, write, fs);
        db.open();
        return db;
    }

    /**
     * @param file
     * @param write
     * @param fsName
     * @return SqlJetDb object for opened database
     * @throws SqlJetException
     */
    public static SqlJetDb open(File file, boolean write, final String fsName) throws SqlJetException {
        final SqlJetDb db = new SqlJetDb(file, write, fsName);
        db.open();
        return db;
    }

    /**
     * Do some actions with locking database's internal threads synchronization
     * mutex. It is related only with synchronization of access to one
     * connection from multiple threads. It is not related with transactions and
     * locks of database file. For concurrent access to database from threads or
     * processes use transactions.
     * 
     * @param op operation to run
     * @return result of the {@link ISqlJetRunnableWithLock#runWithLock(SqlJetDb)} call.
     *  
     * @throws SqlJetException in case operation fails to run.
     */
    public Object runWithLock(final ISqlJetRunnableWithLock op) throws SqlJetException {
        return runSynchronized(new ISqlJetEngineSynchronized() {
            public Object runSynchronized(SqlJetEngine db) throws SqlJetException {
                return op.runWithLock(SqlJetDb.this);
            }
        });
    }

    /**
     * Get database schema.
     * 
     * @return database schema.
     */
    public ISqlJetSchema getSchema() throws SqlJetException {
        return getSchemaInternal();
    }

    /**
     * Open table.
     * 
     * @param tableName name of the table to open.
     * @return opened table
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
     * @param op transaction to run.
     * @return result of the {@link ISqlJetTransaction#run(SqlJetDb)} call.
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
     * @param op transaction to run.
     * @return result of the {@link ISqlJetTransaction#run(SqlJetDb)} call.
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
     * @return result of the {@link ISqlJetTransaction#run(SqlJetDb)} call.
     */
    public Object runTransaction(final ISqlJetTransaction op, final SqlJetTransactionMode mode) throws SqlJetException {
        return runEngineTransaction(new ISqlJetEngineTransaction() {
            public Object run(SqlJetEngine engine) throws SqlJetException {
                return op.run(SqlJetDb.this);
            }
        }, mode);
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
     * @param tableName name of table to drop.
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
     * @param indexName name of the index to drop.
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
     * Drop view.
     * 
     * @param viewName name of the view to drop.
     */
    public void dropView(final String viewName) throws SqlJetException {
        checkOpen();
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                getSchemaInternal().dropView(viewName);
                return null;
            }
        });
    }
    
    /**
     * Drop trigger.
     * 
     * @param triggerName name of the trigger to drop.
     */
    public void dropTrigger(final String triggerName) throws SqlJetException {
        checkOpen();
        runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                getSchemaInternal().dropTrigger(triggerName);
                return null;
            }
        });
    }

    /**
     * Alters table.
     * 
     * @param sql
     *            ALTER TABLE ... sentence.
     * @return altered table schema definition.
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
     * Creates virtual table from SQL clause.
     * 
     * @param sql
     *            CREATE VIRTUAL TABLE ... sentence.
     * @return definition of create virtual table.
     */
    public ISqlJetVirtualTableDef createVirtualTable(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetVirtualTableDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().createVirtualTable(sql, 0);
            }
        });
    }
    
    /**
     * Creates view from SQL clause.
     * 
     * @param sql
     *            CREATE VIEW X AS SELECT ... sentence.
     * @return definition of the view being created.
     */
    public ISqlJetViewDef createView(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetViewDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().createView(sql);
            }
        });
    }

    
    /**
     * Creates trigger from SQL clause.
     * 
     * @param sql
     *            CREATE TRIGGER ... sentence.
     * @return definition of the trigger being created.
     */
    public ISqlJetTriggerDef createTrigger(final String sql) throws SqlJetException {
        checkOpen();
        return (ISqlJetTriggerDef) runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return getSchemaInternal().createTrigger(sql);
            }
        });
    }

    /**
     * @see #getTemporaryDatabase(boolean)
     * 
     * @return SqlJetDb object for temporary database
     * @throws SqlJetException
     */
    public SqlJetDb getTemporaryDatabase() throws SqlJetException {
        return getTemporaryDatabase(false);
    }
    
    /**
     * Opens temporary on-disk database which life span is less or equal to that
     * of this object. Temporary database is closed and deleted as soon as 
     * this database connection is closed.
     * 
     * Temporary file is used to store temporary database.
     * 
     * Subsequent calls to this method will return the same temporary database
     * In case previously create temporary database is closed by the user, 
     * then another one is created by this method. 
     * 
     * @param inMemory when true open temporary database in memory. 
     * 
     * @return temporary database being created or existing temporary database.
     * @throws SqlJetException
     */
    public SqlJetDb getTemporaryDatabase(final boolean inMemory) throws SqlJetException {
        checkOpen();        
        return (SqlJetDb) runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                if (temporaryDb == null || !temporaryDb.isOpen()) {
                    closeTemporaryDatabase();
                    final File tmpDbFile = getTemporaryDatabaseFile(inMemory);
                    if (tmpDbFile != null) {
                        temporaryDb = SqlJetDb.open(tmpDbFile, true);
                    }
                }
                return temporaryDb;
            }

        });
    }
    
    @Override
    protected void closeResources() throws SqlJetException {
        closeTemporaryDatabase();
    }

    private void closeTemporaryDatabase() throws SqlJetException {
        if (temporaryDb != null) {
            temporaryDb.close();
            File tmpDbFile = temporaryDb.getFile();
            if (tmpDbFile != null && !IN_MEMORY.equals(tmpDbFile)) {
                getFileSystem().delete(tmpDbFile, false);
            }
        }
        temporaryDb = null;
    }

    private File getTemporaryDatabaseFile(boolean inMemory) throws SqlJetException {
        if (inMemory) {
            return IN_MEMORY;
        }
        File tmpDbFile = null;
        try {
            tmpDbFile = getFileSystem().getTempFile();
        } catch (IOException e) {
            throw new SqlJetException(SqlJetErrorCode.CANTOPEN, e);
        }
        if (tmpDbFile == null) {
            throw new SqlJetException(SqlJetErrorCode.CANTOPEN);
        }
        return tmpDbFile;
    }
}
