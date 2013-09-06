/**
 * IndexOrderTest.java
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

import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.table.SqlJetScope.SqlJetScopeBound;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class IndexScopeTest extends AbstractNewDbTest {

    private ISqlJetTable table, table1, table2, table3, table4, table5;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                db.createTable("create table t(a integer primary key, b integer)");
                db.createIndex("create index b on t(b)");
                db.createIndex("create index ab on t(a,b)");

                db.createTable("create table t1(a integer primary key, b integer)");
                db.createIndex("create index b1 on t1(b)");

                db.createTable("create table t2(a integer, b integer, primary key(a,b))");
                db.createTable("create table t3(a integer primary key)");

                db.createTable("create table t4(a text not null primary key, b integer not null)");
                db.createIndex("create index b4 on t4(b)");

                db.createTable("create table t5(a integer)");

                table = db.getTable("t");

                for (int i = 10; i > 0; i--) {
                    table.insert(null, i);
                }

                table1 = db.getTable("t1");
                table1.insert(null, 3);
                table1.insert(null, 5);
                table1.insert(null, 7);
                table1.insert(null, 9);

                table2 = db.getTable("t2");

                for (int i = 10; i > 0; i--) {
                    table2.insert(i, i);
                }

                table3 = db.getTable("t3");
                table3.insert(3);
                table3.insert(5);
                table3.insert(7);
                table3.insert(9);

                table4 = db.getTable("t4");
                table4.insert("s", 10);
                table4.insert("q", 4);
                table4.insert("l", 3);
                table4.insert("j", 2);
                table4.insert("e", 1);
                table4.insert("t", 8);

                table5 = db.getTable("t5");

                return null;

            }
        });

    }

    @Test
    public void scope() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.scope("b", new Object[] { 2 }, new Object[] { 4 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(2L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(4L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeFirst() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetCursor c = table.scope("b", new Object[] { 5 }, null);
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(5L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(6L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(7L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(8L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(9L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(10L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeLast() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.scope("b", null, new Object[] { 5 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(1L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(4L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(5L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeNull() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetCursor c = table.scope("b", null, null);
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(1L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(4L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(5L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(6L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(7L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(8L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(9L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(10L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeNear() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table1.scope("b1", new Object[] { 4 }, new Object[] { 8 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(5L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(7L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeMulti1() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.scope("ab", new Object[] { 2, 9 }, new Object[] { 9, 2 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(2L, c.getInteger("a"));
                Assert.assertEquals(9L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("a"));
                Assert.assertEquals(8L, c.getInteger("b"));
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopePrimary() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table2.scope(null, new Object[] { 2 }, new Object[] { 4 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(2L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(4L, c.getInteger("a"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeRowId() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.scope(null, new Object[] { 2 }, new Object[] { 4 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(2L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(4L, c.getInteger("a"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeRowIdNear() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table3.scope(null, new Object[] { 4 }, new Object[] { 8 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(5L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(7L, c.getInteger("a"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeDeleteInScope() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table4.scope("b4", new Object[] { 7L }, new Object[] { 20L });
                // should get two rows, one with 8, another with 10.
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(8L, c.getInteger("b"));
                c.delete();
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(10L, c.getInteger("b"));
                c.delete();
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeReverse() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.scope("b", new Object[] { 4 }, new Object[] { 2 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(4L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopeReverse2() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = table.scope("b", new Object[] { 2 }, new Object[] { 4 });
                c = c.reverse();
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(4L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("b"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("b"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopePrimaryReverse() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table2.scope(null, new Object[] { 4 }, new Object[] { 2 });
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(4L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("a"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test
    public void scopePrimaryReverse2() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = table2.scope(null, new Object[] { 2 }, new Object[] { 4 });
                c = c.reverse();
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(4L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(3L, c.getInteger("a"));
                Assert.assertTrue(c.next());
                Assert.assertEquals(2L, c.getInteger("a"));
                Assert.assertTrue(!c.next());
                Assert.assertTrue(c.eof());
                c.close();
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexScope() throws SqlJetException {
        table.scope("unexistedIndex", new Object[] { 1 }, new Object[] { 10 });
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexLookup() throws SqlJetException {
        table.lookup("unexistedIndex", new Object[] { 10 });
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexOrder() throws SqlJetException {
        table.order("unexistedIndex");
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexScope2() throws SqlJetException {
        table5.scope(null, new Object[] { 1 }, new Object[] { 10 });
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexLookup2() throws SqlJetException {
        table5.lookup(null, new Object[] { 10 });
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void unexistedIndexOrder2() throws SqlJetException {
        table5.order(null);
        Assert.assertTrue(false);
    }
    
    @Test
    public void testNoAssertionOnGetRowId() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                for(String tableName : db.getSchema().getTableNames()) {
                    ISqlJetTable table = db.getTable(tableName);
                    Set<ISqlJetIndexDef> indices = db.getSchema().getIndexes(tableName);
                    if (indices != null) {
                        for (ISqlJetIndexDef indexDef : indices) {
                            SqlJetScope scope = new SqlJetScope((SqlJetScopeBound) null, null);
                            ISqlJetCursor cursor = table.scope(indexDef.getName(), scope);
                            Assert.assertNotNull(cursor);
                            while(!cursor.eof()) {
                                cursor.getRowId();
                                cursor.next();
                            }
                            cursor.close();
                        }
                    }
                }
                return null;
            }
        });
    }


}
