/**
 * SqlJetIndexTest.java
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
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 * 
 */
public class SqlJetIndexTest extends TestCase {

    private SqlJetDb db;

    public SqlJetIndexTest() {
        super("Index Tests");
    }

    @Override
    protected void setUp() throws Exception {
        File fileDb = File.createTempFile("indexTest", null);
        fileDb.deleteOnExit();
        db = SqlJetDb.open(fileDb, true);
    }

    @Override
    protected void tearDown() throws Exception {
        if (db != null) {
            db.close();
        }
    }

    private void createTableT() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a text, b text, c int, d int)");
                ISqlJetTable t = db.getTable("t");
                t.insert("n", "y", 10, 20);
                t.insert("x", "z", 11, 12);
                t.insert("a", "b", 10, 13);
                t.insert("c", "b", 10, 23);
                return null;
            }
        });
    }

    public void testSingleColumnIndex() throws Exception {
        createTableT();
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createIndex("create index tb on t (b)");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t);

                ISqlJetCursor c = t.lookup("tb", "z");
                assertTrue(!c.eof());
                assertEquals("x", c.getString("a"));
                c.next();
                assertTrue(c.eof());
                c.close();

                Set<String> values = new HashSet<String>();
                c = t.lookup("tb", "b");
                while (!c.eof()) {
                    values.add(c.getString("a"));
                    c.next();
                }
                c.close();
                assertTrue(values.size() == 2);
                assertTrue(values.contains("a"));
                assertTrue(values.contains("c"));
                return null;
            }
        });
    }

    public void testMultiColumnIndex() throws Exception {
        createTableT();
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createIndex("create index tbc on t (b,c)");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t);
                ISqlJetCursor c = t.lookup("tbc", "y", 10L);
                assertTrue(!c.eof());
                assertEquals("n", c.getString("a"));
                c.next();
                assertTrue(c.eof());
                c.close();

                Set<String> values = new HashSet<String>();
                c = t.lookup("tbc", "b", 10L);
                while (!c.eof()) {
                    values.add(c.getString("a"));
                    c.next();
                }
                c.close();
                assertTrue(values.size() == 2);
                assertTrue(values.contains("a"));
                assertTrue(values.contains("c"));
                return null;
            }
        });
    }

    public void testAutomaticIntConversion() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a int)");
                db.createIndex("create index ta on t (a)");
                ISqlJetTable t = db.getTable("t");
                t.insert(10L);
                t.insert(20L);
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                // 32bit integer, not long -> should be promoted to long
                ISqlJetCursor c = t.lookup("ta", 20);
                assertFalse(c.eof());
                assertEquals(20L, c.getInteger(0));
                c.next();
                assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }
    /*
    public void testAutomaticFloatConversion() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a real)");
                db.createIndex("create index ta on t (a)");
                ISqlJetTable t = db.getTable("t");
                t.insert(0.1D);
                t.insert(0.2D);
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertEquals(0.1D, t.open().getFloat(0));
                // float, not double -> should be promoted to double
                ISqlJetCursor c = t.lookup("ta", 0.2F);
                assertFalse(c.eof());
                assertEquals(0.2D, c.getFloat(0));
                c.next();
                assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }
    */
    public void testReadUsingColumnPK() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a int primary key, b text)");
                ISqlJetTable t = db.getTable("t");
                t.insert(1, "zzz");
                t.insert(2, "www");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t.getPrimaryKeyIndexName());
                ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), 1L);
                assertFalse(c.eof());
                assertEquals("zzz", c.getString(1));
                c.next();
                assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    public void testReadUsingColumnPKAutoinc() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a integer primary key autoincrement, b text)");
                ISqlJetTable t = db.getTable("t");
                // primary key has 'autoincrement' constraint - you are not
                // supposed
                // to provide it's value: it should be generated automatically
                t.insert(null, "zzz");
                t.insert(null, "www");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNull(t.getPrimaryKeyIndexName());
                ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), 2L);
                assertFalse(c.eof());
                assertEquals("www", c.getString(1));
                c.next();
                assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    public void testReadUsingSecondColumnPK() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a text, b int primary key)");
                ISqlJetTable t = db.getTable("t");
                t.insert("zzz", 1);
                t.insert("www", 2);
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t.getPrimaryKeyIndexName());
                ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), 2L);
                assertFalse(c.eof());
                assertEquals("www", c.getString(0));
                c.next();
                assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    public void testNoRowidPK() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a integer primary key, b text)");
                ISqlJetTable t = db.getTable("t");
                t.insert(null, "zzz");
                t.insert(null, "www");
                return null;
            }
        });
        ISqlJetTable t = db.getTable("t");
        assertNull(t.getPrimaryKeyIndexName());
    }

    public void testReadUsingSingleColumnTablePK() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a text, b text, primary key (a))");
                ISqlJetTable t = db.getTable("t");
                t.insert("set", "in");
                t.insert("get", "out");
                t.insert("bet", "down");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t.getPrimaryKeyIndexName());
                ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), "get");
                assertFalse(c.eof());
                assertEquals("out", c.getString(1));
                c.next();
                assertTrue(c.eof());
                return null;
            }
        });
    }

    public void testReadUsingMultiColumnTablePK() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t (a text, b text, primary key (a,b))");
                ISqlJetTable t = db.getTable("t");
                t.insert("get", "in");
                t.insert("get", "out");
                t.insert("get", "down");
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetTable t = db.getTable("t");
                assertNotNull(t.getPrimaryKeyIndexName());
                ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), "get", "out");
                assertFalse(c.eof());
                assertEquals("get", c.getString(0));
                assertEquals("out", c.getString(1));
                c.next();
                assertTrue(c.eof());
                return null;
            }
        });
    }
}
