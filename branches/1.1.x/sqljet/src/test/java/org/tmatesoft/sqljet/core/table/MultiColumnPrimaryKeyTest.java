/**
 * MultiColumnPrimaryKeyTest.java
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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MultiColumnPrimaryKeyTest {

    private File file;
    private SqlJetDb db;
    private ISqlJetTable table;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        file = File.createTempFile("test", null);
        file.deleteOnExit();
        db = SqlJetDb.open(file, true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t(a integer, b integer, c integer, primary key(a,b), unique(b,c));");
                return null;
            }
        });
        table = db.getTable("t");
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 1, 1);
                table.insert(1, 2, 1);
                table.insert(2, 1, 2);
                return null;
            }
        });
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            db.close();
        } finally {
            SqlJetFileUtil.deleteFile(file);
        }
    }

    @Test
    public void eof() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertTrue(!table.lookup(null, 1, 1).eof());
                Assert.assertTrue(!table.lookup(null, 1, 2).eof());
                Assert.assertTrue(!table.lookup(null, 2, 1).eof());
                Assert.assertTrue(table.lookup(null, 2, 2).eof());
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void insert() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 1, 2);
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void insertFail() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(2, 2, 1);
                return null;
            }
        });
    }

    @Test
    public void update() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.lookup(null, 1, 1).update(2, 2, 2);
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertTrue(table.lookup(null, 1, 1).eof());
                Assert.assertTrue(!table.lookup(null, 1, 2).eof());
                Assert.assertTrue(!table.lookup(null, 2, 1).eof());
                Assert.assertTrue(!table.lookup(null, 2, 2).eof());
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void updateFail() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.lookup(null, 1, 1).update(1, 2, 2);
                return null;
            }
        });
    }

    @Test
    public void delete() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.lookup(null, 1, 1).delete();
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertTrue(table.lookup(null, 1, 1).eof());
                Assert.assertTrue(!table.lookup(null, 1, 2).eof());
                Assert.assertTrue(!table.lookup(null, 2, 1).eof());
                return null;
            }
        });
    }

}
