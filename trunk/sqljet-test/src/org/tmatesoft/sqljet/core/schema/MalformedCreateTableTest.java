/**
 * MalformedCreateTable.java
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
package org.tmatesoft.sqljet.core.schema;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.lang.SqlJetParserException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MalformedCreateTableTest extends AbstractNewDbTest {

    @Test
    public void malformedCreateTable() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE TESTXX (a int, b int, c int, " + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.commit();

        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db != null);
    }

    @Test
    public void malformedCreateTableIfNotExists() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE IF NOT EXISTS TESTXX (a int, b int, c int, "
                + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IF NOT EXISTS IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.commit();

        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db != null);

    }

    @Test
    public void malformedCreateTableExistsFail() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE IF NOT EXISTS TESTXX (a int, b int, c int, "
                + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IF NOT EXISTS IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.createTable(sql1);// twice
        db.createIndex(sql2);
        db.commit();
        Assert.assertTrue(true);

    }

    @Test
    public void fieldSize() throws Exception {
        final String sql = "CREATE TABLE SITE_VARS (SITEID VARCHAR (10) NOT NULL,"
                + " VARNAME VARCHAR (50) NOT NULL, VALUE VARCHAR (500))";
        final ISqlJetTableDef t = db.createTable(sql);
        final String sql2 = t.toSQL();
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void dollarInName() throws Exception {
        final String sql = "create table my$table(a$ integer primary key, b$ integer)";
        final ISqlJetTableDef def = db.createTable(sql);
        Assert.assertNotNull(def);
        final ISqlJetTable t = db.getTable("my$table");
        Assert.assertNotNull(t);
    }

    @Test(expected = SqlJetParserException.class)
    public void dollarInNameFail() throws Exception {
        final String sql = "create table $mytable($a integer primary key, $b integer)";
        @SuppressWarnings("unused")
        final ISqlJetTableDef def = db.createTable(sql);
        Assert.fail();
    }

    @Test
    public void parseExceptionMessage() throws Exception {
        final String sql = "it's wrong sql";
        try {
            @SuppressWarnings("unused")
            final ISqlJetTableDef def = db.createTable(sql);
        } catch (SqlJetParserException e) {
            final String msg = e.getMessage();
            Assert.assertTrue(msg.contains(sql));
        }
    }

}
