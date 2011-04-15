/**
 * SQLiteLockingCompatibilityTest.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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
package org.tmatesoft.sqljet.compatibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class CompatibilityLockingInThreads extends AbstractNewDbTest {

    private static final String TABLE_NAME = "t";

    private Connection conn;
    private Statement stat;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
        stat = conn.createStatement();
        stat.execute(String.format("create table %s(a integer primary key, b integer);", TABLE_NAME));
    }

    @Override
    public void tearDown() throws Exception {
        if (conn != null) {
            conn.close();
        }
        super.tearDown();
    }

    @Test
    public void lockingSQLJet() throws Exception {
        stat.execute(String.format("insert into %s(b) values(1);", TABLE_NAME));
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                try {
                    stat.execute(String.format("insert into %s(b) values(2);", TABLE_NAME));
                } catch (SQLException e) {
                    return null;
                }
                Assert.fail();
                return null;
            }
        });
    }

    @Test
    public void lockingSQLite() throws Exception {
        db.getTable(TABLE_NAME).insert(null, 1);
        stat.execute("begin immediate;");
        try {
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    db.getTable(TABLE_NAME).insert(null, 2);
                    return null;
                }
            });
        } catch (SqlJetException e) {
            Assert.assertEquals(SqlJetErrorCode.BUSY, e.getErrorCode());
            return;
        } finally {
            stat.execute("end;");
        }
        Assert.fail();
    }

}
