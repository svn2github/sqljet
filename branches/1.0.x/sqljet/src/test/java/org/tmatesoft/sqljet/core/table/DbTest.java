/**
 * DbTest.java
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
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
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

    /**
     * @param dbTmp
     * @throws SqlJetException
     */
    private void testDb(final SqlJetDb dbTmp) throws SqlJetException {
        Assert.assertNotNull(dbTmp);
        dbTmp.createTable("create table if not exists t(a integer primary key, b integer)");
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
    }

    @Test
    public void testTemporary() throws SqlJetException {
        final SqlJetDb dbTmp = SqlJetDb.open(null, true);
        try {
            testDb(dbTmp);
        } finally {
            dbTmp.close();
        }
    }

    @Test
    public void testInMemory() throws SqlJetException {
        final SqlJetDb dbMem = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            Assert.assertTrue(dbMem.isOpen());
            Assert.assertTrue(dbMem.isWritable());
            testDb(dbMem);
        } finally {
            dbMem.close();
        }
    }

    @Test
    public void testReopen() throws SqlJetException {
        final SqlJetDb db2 = new SqlJetDb(file, true);
        Assert.assertFalse(db2.isOpen());
        db2.open();
        Assert.assertTrue(db2.isOpen());
        try {
            testDb(db2);
        } finally {
            db2.close();
        }
        Assert.assertFalse(db2.isOpen());
        db2.open();
        Assert.assertTrue(db2.isOpen());
        try {
            testDb(db2);
        } finally {
            db2.close();
        }
    }

    @Test
    public void testOpenRO() throws SqlJetException, FileNotFoundException, IOException {
        Assert.assertTrue(db.isOpen());
        Assert.assertTrue(db.isWritable());
        db.close();

        // copy file and make it ro.

        File file2 = new File(file.getParentFile(), "readonly" + file.getName());
        file2.deleteOnExit();
        AbstractDataCopyTest.copyFile(file, file2);
        file2.setReadOnly();

        SqlJetDb db2 = new SqlJetDb(file2, true);
        Assert.assertFalse(db2.isOpen());
        db2.open();
        Assert.assertTrue(db2.isOpen());
        Assert.assertFalse(db2.isWritable());
        try {
            db2.beginTransaction(SqlJetTransactionMode.WRITE);
            Assert.assertTrue("Readonly DB shouldn't allow WRITE transactions", false);
        } catch (SqlJetException e) {
            Assert.assertEquals(SqlJetErrorCode.READONLY, e.getErrorCode());
        } finally {
            db2.rollback();
        }
        try {
            db2.beginTransaction(SqlJetTransactionMode.EXCLUSIVE);
            Assert.assertTrue("Readonly DB shouldn't allow EXCLUSIVE transactions", false);
        } catch (SqlJetException e) {
            Assert.assertEquals(SqlJetErrorCode.READONLY, e.getErrorCode());
        } finally {
            db2.rollback();
        }
        try {
            db2.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        } catch (SqlJetException e) {
            Assert.assertTrue(e.getMessage(), false);
        } finally {
            db2.rollback();
        }
        db2.close();
    }

    @Test
    public void testRowValues() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b integer, c text)");
        final ISqlJetTable t = db.getTable("t");
        t.insertWithRowId(1, 555, "a");
        t.insertWithRowId(2, 777, "b");
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                try {
                    Object[] r1 = c.getRowValues();
                    Assert.assertArrayEquals(new Object[] { new Long(1), new Long(555), "a" }, r1);
                    c.next();
                    Object[] r2 = c.getRowValues();
                    Assert.assertArrayEquals(new Object[] { new Long(2), new Long(777), "b" }, r2);
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void testInsertRowIdLogic() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b integer, c text)");
        final ISqlJetTable t = db.getTable("t");
        t.insert(555, "a");
        t.insert(777, "b");
        t.insert(null, 888, "c");
        t.insert(null, 999, "d");
        t.insert(7, 111, "e");
        t.insert(8, 222, "f");
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                try {
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(555), r[1]);
                        Assert.assertEquals("a", r[2]);
                    }
                    c.next();
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(777), r[1]);
                        Assert.assertEquals("b", r[2]);
                    }
                    c.next();
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(888), r[1]);
                        Assert.assertEquals("c", r[2]);
                    }
                    c.next();
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(999), r[1]);
                        Assert.assertEquals("d", r[2]);
                    }
                    c.next();
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(7), r[0]);
                        Assert.assertEquals(new Long(111), r[1]);
                        Assert.assertEquals("e", r[2]);
                    }
                    c.next();
                    {
                        Object[] r = c.getRowValues();
                        Assert.assertEquals(new Long(8), r[0]);
                        Assert.assertEquals(new Long(222), r[1]);
                        Assert.assertEquals("f", r[2]);
                    }
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }


}
