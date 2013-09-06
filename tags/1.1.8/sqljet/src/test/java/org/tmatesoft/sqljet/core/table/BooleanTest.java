/**
 * BooleanTest.java
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
import org.tmatesoft.sqljet.core.internal.ISqlJetLimits;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class BooleanTest extends AbstractNewDbTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.getOptions().setFileFormat(ISqlJetLimits.SQLJET_MAX_FILE_FORMAT);
        db.createTable("create table t(a integer primary key, b boolean)");
        db.createIndex("create index b on t(b)");
        final ISqlJetTable t = db.getTable("t");
        t.insert(null, true);
        t.insert(null, false);
    }

    @Test
    public void open() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertTrue(c.getBoolean(1));
                    Assert.assertTrue(c.next());
                    Assert.assertFalse(c.getBoolean(1));
                    Assert.assertFalse(c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void openFieldName() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertTrue(c.getBoolean("b"));
                    Assert.assertTrue(c.next());
                    Assert.assertFalse(c.getBoolean("b"));
                    Assert.assertFalse(c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void locateTrue() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor c = t.lookup("b", true);
                try {
                    Assert.assertFalse(c.eof());
                    Assert.assertTrue(c.getBoolean(1));
                    Assert.assertFalse(c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void locateFalse() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor c = t.lookup("b", false);
                try {
                    Assert.assertFalse(c.eof());
                    Assert.assertFalse(c.getBoolean(1));
                    Assert.assertFalse(c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void update() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable("t");
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertTrue(c.getBoolean(1));
                    c.update(null, false);
                    Assert.assertFalse(c.getBoolean(1));
                    Assert.assertTrue(c.next());
                    Assert.assertFalse(c.getBoolean(1));
                    c.update(null, true);
                    Assert.assertTrue(c.getBoolean(1));
                    Assert.assertFalse(c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

}
