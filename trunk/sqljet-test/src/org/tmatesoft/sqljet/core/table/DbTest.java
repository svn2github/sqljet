/**
 * DbTest.java
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

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class DbTest extends AbstractNewDbTest {

    @Test
    public void testCloseTwice() throws SqlJetException {
        Assert.assertTrue(db.isOpen());
        db.close();
        Assert.assertFalse(db.isOpen());
        db.close();
    }

    @Test(expected = SqlJetException.class)
    public void testClose() throws SqlJetException {
        Assert.assertTrue(db.isOpen());
        db.close();
        Assert.assertFalse(db.isOpen());
        db.createTable("create table t(a integer primary key, b integer)");
    }

    @Test(expected = SqlJetException.class)
    public void testCantOpen() throws SqlJetException {
        final SqlJetDb db1 = SqlJetDb.open(new File("x:/cantopen"), false);
        if (db1 != null) {
            db1.close();
        }
    }

    @Test
    public void testBigInteger() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b integer)");
        final ISqlJetTable t = db.getTable("t");
        final long v = Long.MAX_VALUE;
        t.insert(v, v);
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                final long i = c.getInteger(0);
                final long f = c.getInteger(1);
                Assert.assertEquals(v, i);
                Assert.assertEquals(v, f);
                return null;
            }
        });
    }

    @Test
    public void testVarint() throws SqlJetException {
        final byte[] b = new byte[9];
        final long l = Long.MAX_VALUE;
        final ISqlJetMemoryPointer p = SqlJetUtility.wrapPtr(b);
        SqlJetUtility.putVarint(p, l);
        final long[] v = new long[] { 0 };
        SqlJetUtility.getVarint(p, v);
        Assert.assertEquals(l, v[0]);
    }

    @Test
    public void testCacheSize() throws SqlJetException {
        db.setCacheSize(1000);
        Assert.assertEquals(1000, db.getCacheSize());
        db.createTable("create table t(a integer primary key, b integer)");
        final ISqlJetTable t = db.getTable("t");
        t.insert(1, 1);
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertEquals(1, c.getInteger(0));
                    Assert.assertEquals(1, c.getInteger(1));
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void testTemporary() throws SqlJetException {
        final SqlJetDb dbTmp = SqlJetDb.open(null, true);
        Assert.assertNotNull(dbTmp);
        dbTmp.createTable("create table t(a integer primary key, b integer)");
        final ISqlJetTable table = dbTmp.getTable("t");
        table.insert(null, 1);
        dbTmp.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.open();
                if (!c.eof()) {
                    do {
                        final long b = c.getInteger("b");
                        Assert.assertEquals(1L, b);
                    } while (c.next());
                }
                return null;
            }
        });
        dbTmp.close();
    }

    @Test
    public void testInMemory() throws SqlJetException {
        final SqlJetDb dbMem = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        Assert.assertNotNull(dbMem);
        dbMem.createTable("create table t(a integer primary key, b integer)");
        final ISqlJetTable table = dbMem.getTable("t");
        table.insert(null, 1);
        dbMem.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.open();
                if (!c.eof()) {
                    do {
                        final long b = c.getInteger("b");
                        Assert.assertEquals(1L, b);
                    } while (c.next());
                }
                return null;
            }
        });
        dbMem.close();
    }

}
