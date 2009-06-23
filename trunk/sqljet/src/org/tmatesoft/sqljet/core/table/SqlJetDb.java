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

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.SqlJetAutoVacuumMode;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchemaMeta;
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
    private static final Set<SqlJetFileOpenPermission> READ_PERMISSIONS = SqlJetUtility.of(SqlJetFileOpenPermission.READONLY);
    private static final Set<SqlJetBtreeFlags> WRITE_FLAGS = SqlJetUtility.of(SqlJetBtreeFlags.READWRITE,
            SqlJetBtreeFlags.CREATE);
    private static final Set<SqlJetFileOpenPermission> WRITE_PREMISSIONS = SqlJetUtility.of(
            SqlJetFileOpenPermission.READWRITE, SqlJetFileOpenPermission.CREATE);

    private final boolean write;
    private ISqlJetDbHandle dbHandle;
    private ISqlJetBtree btree;
    private ISqlJetSchema schema;

    private boolean transaction = false;

    /**
     * Create connection to data base.
     * 
     * @param file
     *            path to data base
     * @param write
     *            if true then allow data modification
     * @throws SqlJetException
     */
    protected SqlJetDb(final File file, final boolean write, final SqlJetAutoVacuumMode autoVacuumMode)
            throws SqlJetException {
        this.write = write;
        dbHandle = new SqlJetDbHandle();
        btree = new SqlJetBtree();
        btree.open(file, dbHandle, write ? WRITE_FLAGS : READ_FLAGS, SqlJetFileType.MAIN_DB, write ? WRITE_PREMISSIONS
                : READ_PERMISSIONS);
        runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                btree.enter();
                try {
                    if (null != autoVacuumMode)
                        btree.setAutoVacuum(autoVacuumMode);
                    dbHandle.setMeta(new SqlJetSchemaMeta(btree));
                    schema = new SqlJetSchema(dbHandle, btree);
                } finally {
                    btree.leave();
                }
                return null;
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
        return new SqlJetDb(file, write, null);
    }

    public static SqlJetDb open(File file, boolean write, SqlJetAutoVacuumMode autoVacuumMode) throws SqlJetException {
        return new SqlJetDb(file, write, autoVacuumMode);
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
        Object result = null;
        dbHandle.getMutex().enter();
        try {
            result = op.runWithLock(this);
        } finally {
            dbHandle.getMutex().leave();
        }
        return result;
    }

    /**
     * Check write access to data base.
     * 
     * @return true if modification is allowed
     */
    public boolean isWrite() {
        return write;
    }

    /**
     * Get data base's encoding.
     * 
     * @return data base's encoding
     */
    public SqlJetEncoding getEncoding() {
        return dbHandle.getEncoding();
    }

    public void setEncoding(SqlJetEncoding encoding) throws SqlJetException {
        dbHandle.setEncoding(encoding);
    }

    public ISqlJetSchema getSchema() {
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
                return new SqlJetTable(schema, tableName, write);
            }
        });
    }

    /**
     * Begin transaction if write access is allowed.
     * 
     * @throws SqlJetException
     */
    public void beginTransaction() throws SqlJetException {
        if (write) {
            btree.beginTrans(SqlJetTransactionMode.WRITE);
            transaction = true;
        }
    }

    /**
     * Commit transaction.
     * 
     * @throws SqlJetException
     */
    public void commit() throws SqlJetException {
        if (write && transaction) {
            btree.commit();
            transaction = false;
        }
    }

    /**
     * Rollback transaction.
     * 
     * @throws SqlJetException
     */
    public void rollback() throws SqlJetException {
        if (write && transaction) {
            btree.rollback();
            transaction = false;
        }
    }

    public int getPageCacheSize() {
        return dbHandle.getMeta().getPageCacheSize();
    }

    public void setPageCacheSize(int pageCacheSize) throws SqlJetException {
        btree.setCacheSize(pageCacheSize);
        dbHandle.getMeta().setPageCacheSize(pageCacheSize);
    }

    public int getUserCookie() {
        return dbHandle.getMeta().getUserCookie();
    }

    public void setUserCookie(int userCookie) throws SqlJetException {
        dbHandle.getMeta().setUserCookie(userCookie);
    }

}
