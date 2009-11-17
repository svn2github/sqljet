/**
 * RowNumTest.java
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
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RowNumTest extends AbstractDataCopyTest {

    public static final File REP_CACHE_DB = new File("sqljet-test/db/rep-cache/rep-cache.db");

    public static final String REP_CACHE_TABLE = "rep_cache";

    private File dbFile;
    private SqlJetDb db;
    private ISqlJetTable table;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        dbFile = copyFile(REP_CACHE_DB, true);
        db = SqlJetDb.open(dbFile, true);
        table = db.getTable(REP_CACHE_TABLE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        table = null;
        if (db != null) {
            try {
                db.commit();
            } finally {
                db.close();
            }
        }
        if (dbFile != null) {
            dbFile.delete();
        }
    }

    @Test
    public void testCalibration() throws SqlJetException {
    }

    @Test
    public void testRowCount() throws SqlJetException {
        final ISqlJetCursor c = table.open();
        try {
            final long rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
        } finally {
            c.close();
        }
    }

    @Test
    public void testGoToRowNum() throws SqlJetException {
        final ISqlJetCursor c = table.open();
        try {
            final long rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
            Assert.assertTrue(c.goToRowNum(1));
            Assert.assertEquals(1, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(2));
            Assert.assertEquals(2, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(3));
            Assert.assertEquals(3, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(123));
            Assert.assertEquals(123, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(3));
            Assert.assertEquals(3, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(2));
            Assert.assertEquals(2, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(1));
            Assert.assertEquals(1, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(123));
            Assert.assertEquals(123, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(122));
            Assert.assertEquals(122, c.getCurrentRowNum());
            Assert.assertFalse(c.goToRowNum(Long.MAX_VALUE));
            Assert.assertEquals(122, c.getCurrentRowNum());
        } finally {
            c.close();
        }
    }

    @Test
    public void testGoToRowNumScope() throws SqlJetException {
        final ISqlJetCursor c = table.scope(null, new Object[] { "bc6105f82f1a12e2442882209cf86fa48a968802" },
                new Object[] { "bee8dcea971507d892819c4bd962285e07efc280" });
        try {
            final long rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
            Assert.assertTrue(c.goToRowNum(1));
            Assert.assertEquals(1, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(2));
            Assert.assertEquals(2, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(3));
            Assert.assertEquals(3, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(2));
            Assert.assertEquals(2, c.getCurrentRowNum());
            Assert.assertTrue(c.goToRowNum(1));
            Assert.assertEquals(1, c.getCurrentRowNum());
            Assert.assertFalse(c.goToRowNum(Long.MAX_VALUE));
            Assert.assertEquals(1, c.getCurrentRowNum());
        } finally {
            c.close();
        }
    }

    @Test
    public void testDelete() throws SqlJetException {
        final ISqlJetCursor c = table.open();
        try {
            final long rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
            c.delete();
            Assert.assertTrue(rowCount > c.getRowsCount());
        } finally {
            c.close();
        }
    }

    @Test
    public void testInsert() throws SqlJetException {
        final long rowCount;
        final ISqlJetCursor c = table.open();
        try {
            rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
        } finally {
            c.close();
        }
        final Random random = new Random();
        table.insert(Long.toString(SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE))), SqlJetUtility
                .toUnsigned(random.nextInt(Integer.MAX_VALUE)), SqlJetUtility.toUnsigned(random
                .nextInt(Integer.MAX_VALUE)), SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE)),
                SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE)));
        final ISqlJetCursor c1 = table.open();
        try {
            Assert.assertTrue(rowCount < c1.getRowsCount());
        } finally {
            c1.close();
        }
    }

    @Test
    public void testDeleteScope() throws SqlJetException {
        final ISqlJetCursor c = table.scope(null, new Object[] { "bc6105f82f1a12e2442882209cf86fa48a968802" },
                new Object[] { "bee8dcea971507d892819c4bd962285e07efc280" });
        try {
            final long rowCount = c.getRowsCount();
            Assert.assertTrue(rowCount > 0);
            c.delete();
            Assert.assertTrue(rowCount > c.getRowsCount());
        } finally {
            c.close();
        }
    }

    @Test
    public void testLimit() throws SqlJetException {
        final ISqlJetCursor c = table.open();
        try {
            Assert.assertTrue(c.getRowsCount() > 10);
            Assert.assertTrue(c.goToRowNum(11));
            c.setLimit(10);
            for (c.first(); !c.eof(); c.next())
                ;
            Assert.assertTrue(c.getCurrentRowNum() <= 10);
            c.first();
            c.last();
            Assert.assertTrue(c.getCurrentRowNum() <= 10);
            Assert.assertFalse(c.goToRowNum(11));
            Assert.assertTrue(c.getRowsCount() == 10);
            c.setLimit(0);
            Assert.assertTrue(c.getRowsCount() > 10);
            Assert.assertTrue(c.goToRowNum(11));
            c.last();
            Assert.assertTrue(c.getCurrentRowNum() > 10);
        } finally {
            c.close();
        }
    }
}
