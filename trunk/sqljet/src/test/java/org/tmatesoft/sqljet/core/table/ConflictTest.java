/**
 * ConflictTest.java
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

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class ConflictTest extends AbstractNewDbTest {

    private ISqlJetTable table;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        table = db.getTable(db.createTable("create table t (a integer primary key, b int)").getName());
        db.createIndex("create unique index i on t(b)");
        table.insert(1, 1);
        table.insert(3, 3);
    }

    @Test
    public void insertOrIgnore() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertOr(SqlJetConflictAction.IGNORE, 1, 2);
                final ISqlJetCursor c = table.lookup(null, 1);
                Assert.assertNotNull(c);
                Assert.assertFalse(c.eof());
                try {
                    final long b = c.getInteger("b");
                    Assert.assertNotNull(b);
                    Assert.assertTrue(b == 1);
                } finally {
                    c.close();
                }
                return null;
            }
        });

    }

    @Test
    public void insertOrReplace() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertOr(SqlJetConflictAction.REPLACE, 1, 2);
                final ISqlJetCursor c = table.lookup(null, 1);
                Assert.assertNotNull(c);
                Assert.assertFalse(c.eof());
                try {
                    final long b = c.getInteger("b");
                    Assert.assertNotNull(b);
                    Assert.assertTrue(b == 2);
                } finally {
                    c.close();
                }
                return null;
            }
        });

    }

    @Test
    public void updateOrIgnore() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.lookup(null, 1);
                Assert.assertNotNull(c);
                Assert.assertFalse(c.eof());
                try {
                    c.updateOr(SqlJetConflictAction.IGNORE, 1, 3);
                    final long b = c.getInteger("b");
                    Assert.assertNotNull(b);
                    Assert.assertTrue(b == 1);
                } finally {
                    c.close();
                }
                return null;
            }
        });

    }

    @Test
    public void updateOrReplace() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.lookup(null, 1);
                Assert.assertNotNull(c);
                Assert.assertFalse(c.eof());
                try {
                    c.updateOr(SqlJetConflictAction.REPLACE, 1, 3);
                    final long b = c.getInteger("b");
                    Assert.assertNotNull(b);
                    Assert.assertTrue(b == 3);
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void notNull() throws SqlJetException {
        db.createTable("create table t1(a integer primary key, b integer not null default 0," + "c integer not null);");
        final ISqlJetTable t1 = db.getTable("t1");
        t1.insert(null, null, 0);
        try {
            t1.insert(null, null, null);
            Assert.fail();
        } catch (SqlJetException e) {
        }
        t1.insertOr(SqlJetConflictAction.IGNORE, null, null, null);
        try {
            t1.insertOr(SqlJetConflictAction.REPLACE, null, null, null);
            Assert.fail();
        } catch (SqlJetException e) {
        }
        t1.insertOr(SqlJetConflictAction.REPLACE, null, null, 0);
    }

}
