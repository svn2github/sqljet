/**
 * SqlJetIndexTest.java
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
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.getSchema().createTable("create table t (a text, b text, c int, d int)");
                ISqlJetTable t = db.getTable("t");
                t.insert("n", "y", 10, 20);
                t.insert("x", "z", 11, 12);
                t.insert("a", "b", 10, 13);
                t.insert("c", "b", 10, 23);
                db.getSchema().createTable("create table tpk (a int primary key, b text)");
                t = db.getTable("tpk");
                t.insertAutoId("zzz");
                t.insertAutoId("www");
                db.getSchema().createTable("create table tpkr (a integer primary key, b text)");
                t = db.getTable("tpkr");
                t.insertAutoId("zzz");
                t.insertAutoId("www");
                return null;
            }
        });
    }

    @Override
    protected void tearDown() throws Exception {
        if (db != null) {
            db.close();
        }
    }

    public void testSingleColumnIndex() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.getSchema().createIndex("create index tb on t (b)");
                return null;
            }
        });
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
    }

    public void testMultiColumnIndex() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.getSchema().createIndex("create index tbc on t (b,c)");
                return null;
            }
        });
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
    }

    public void testPKRead() throws Exception {
        ISqlJetTable t = db.getTable("tpk");
        assertNotNull(t.getPrimaryKeyIndexName());
        ISqlJetCursor c = t.lookup(t.getPrimaryKeyIndexName(), 1L);
        assertFalse(c.eof());
        assertEquals("zzz", c.getString(1));
    }

    public void testRowidPK() throws Exception {
        ISqlJetTable t = db.getTable("tpkr");
        assertNull(t.getPrimaryKeyIndexName());
    }
}
