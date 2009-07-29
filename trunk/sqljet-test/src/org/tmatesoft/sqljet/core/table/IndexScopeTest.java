/**
 * IndexOrderTest.java
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
public class IndexScopeTest extends AbstractNewDbTest {

    private ISqlJetTable table, table1;

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
                
                table = db.getTable("t");

                for (int i = 10; i > 0; i--) {
                    table.insert(null, i);
                }

                table1 = db.getTable("t1");
                table1.insert(null, 3);
                table1.insert(null, 5);
                table1.insert(null, 7);
                table1.insert(null, 9);
                
                return null;

            }
        });

    }

    @Test
    public void scope() throws SqlJetException {
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
    }

    @Test
    public void scopeFirst() throws SqlJetException {
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
    }

    @Test
    public void scopeLast() throws SqlJetException {
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
    }

    @Test
    public void scopeNull() throws SqlJetException {
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
    }

    @Test
    public void scopeNear() throws SqlJetException {
        final ISqlJetCursor c = table1.scope("b1", new Object[] { 4 }, new Object[] { 8 });
        Assert.assertTrue(!c.eof());
        Assert.assertEquals(5L, c.getInteger("b"));
        Assert.assertTrue(c.next());
        Assert.assertEquals(7L, c.getInteger("b"));
        Assert.assertTrue(!c.next());
        Assert.assertTrue(c.eof());
        c.close();
    }

    @Test
    public void scopeMulti1() throws SqlJetException {
        final ISqlJetCursor c = table.scope("ab", new Object[] { 2,9 }, new Object[] { 9,2 });
        Assert.assertTrue(!c.eof());
        Assert.assertEquals(2L, c.getInteger("a"));
        Assert.assertEquals(9L, c.getInteger("b"));
        Assert.assertTrue(c.next());
        Assert.assertEquals(3L, c.getInteger("a"));
        Assert.assertEquals(8L, c.getInteger("b"));
        c.close();
    }
    
    
}
