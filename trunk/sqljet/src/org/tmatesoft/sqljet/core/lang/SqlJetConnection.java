/**
 * SqlJetConnection.java
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
package org.tmatesoft.sqljet.core.lang;

import java.io.File;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetConnection {

    private ISqlJetDbHandle db;
    private ISqlJetBtree btree;

    protected SqlJetConnection(String fileName) throws SqlJetException {
        db = new SqlJetDbHandle();
        db.getMutex().enter();
        btree = new SqlJetBtree();
        btree.open(new File(fileName), db, EnumSet.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB, EnumSet
                .of(SqlJetFileOpenPermission.READONLY));
    }

    public static SqlJetConnection open(String fileName) throws SqlJetException {
        return new SqlJetConnection(fileName);
    }

    public SqlJetPreparedStatement prepare(String sql) throws SqlJetException {
        if (sql == null || sql.trim().length() == 0) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "SQL statement is empty");
        }
        return new SqlJetPreparedStatement(db, btree, sql);
    }

    public void exec(String sql, SqlJetExecCallback callback) throws SqlJetException {
        SqlJetPreparedStatement stmt = prepare(sql);
        try {
            while (stmt.step()) {
                if (callback != null) {
                    callback.processRow(stmt);
                }
            }
        } finally {
            stmt.close();
        }
    }

    public void close() throws SqlJetException {
        try {
            if (btree != null) {
                btree.close();
                btree = null;
            }
        } finally {
            db.getMutex().leave();
            db = null;
        }
    }
}
