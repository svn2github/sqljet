/**
 * LocateLastTest.java
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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class LocateLastTest extends AbstractNewDbTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t(a integer primary key, b integer)");
                db.createIndex("create index b on t(b,a)");
                db.createIndex("create index d on t(b desc, a desc)");
                final ISqlJetTable t = db.getTable("t");
                t.insert(1, 1);
                t.insert(2, 2);
                t.insert(3, 3);
                t.insert(4, 2);
                return null;
            }
        });
    }

    @Test
    public void order() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor b = t.order("b");
                Assert.assertTrue(b.last());
                Assert.assertEquals(3L, b.getValue("b"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(1L, b.getValue("b"));
                Assert.assertFalse(b.previous());
                return null;
            }
        });
    }

    @Test
    public void scope() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor b = t.scope("b", new Object[] { 2 }, new Object[] { 2 });
                Assert.assertTrue(b.last());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(4L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(2L, b.getValue("a"));
                Assert.assertFalse(b.previous());
                return null;
            }
        });
    }

    @Test
    public void orderDesc() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor b = t.order("d");
                Assert.assertTrue(b.last());
                Assert.assertEquals(1L, b.getValue("b"));
                Assert.assertEquals(1L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(2L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(4L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(3L, b.getValue("b"));
                Assert.assertEquals(3L, b.getValue("a"));
                Assert.assertFalse(b.previous());
                return null;
            }
        });
    }

    @Test
    public void scopeDesc() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor b = t.scope("d", new Object[] { 2 }, new Object[] { 1 });
                Assert.assertTrue(b.last());
                Assert.assertEquals(1L, b.getValue("b"));
                Assert.assertEquals(1L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(2L, b.getValue("a"));
                Assert.assertTrue(b.previous());
                Assert.assertEquals(2L, b.getValue("b"));
                Assert.assertEquals(4L, b.getValue("a"));
                Assert.assertFalse(b.previous());
                return null;
            }
        });
    }

}
