/**
 * SqlJetRecordTest.java
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
 */
package org.tmatesoft.sqljet.core;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDb;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTableTest {

    private static Logger logger = Logger.getLogger(SqlJetAbstractMockTest.SQLJET_TEST_LOGGER);

    private File repCacheDb = new File("sqljet-test/db/rep-cache/rep-cache.db");

    private ISqlJetDb db;
    private ISqlJetBtree btree;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        db = new SqlJetDb();
        db.getMutex().enter();
        btree = new SqlJetBtree();
        btree.open(repCacheDb, db, EnumSet.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB, EnumSet
                .of(SqlJetFileOpenPermission.READONLY));
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            btree.close();
        } finally {
            db.getMutex().leave();
        }
    }

    @Test
    public void testRecordReadMaster() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeCursor c = btree.getCursor(ISqlJetDb.MASTER_ROOT, false, null);
        c.enterCursor();
        try {
            if (!c.first())
                do {
                    ISqlJetRecord r = new SqlJetRecord(c, false);
                    Assert.assertNotNull(r.getFields());
                    Assert.assertTrue(!r.getFields().isEmpty());
                    for (ISqlJetVdbeMem field : r.getFields()) {
                        final ByteBuffer value = field.valueText(SqlJetEncoding.UTF8);
                        Assert.assertNotNull(value);
                        String s = new String(value.array());
                        logger.info(s);
                        passed = true;
                    }
                } while (!c.next());
            c.closeCursor();
        } finally {
            c.leaveCursor();
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testTableReadMaster() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeTable t = new SqlJetBtreeTable(btree, ISqlJetDb.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!t.eof());
            for (ISqlJetRecord r = t.next(); r != null; r = t.next()) {
                Assert.assertNotNull(r.getFields());
                Assert.assertTrue(!r.getFields().isEmpty());
                for (ISqlJetVdbeMem field : r.getFields()) {
                    final ByteBuffer value = field.valueText(SqlJetEncoding.UTF8);
                    Assert.assertNotNull(value);
                    String s = new String(value.array());
                    logger.info(s);
                    passed = true;
                }
            }
        } finally {
            t.close();
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testTableReadData() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btree, ISqlJetDb.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!master.eof());
            for (ISqlJetRecord r1 = master.next(); r1 != null; r1 = master.next()) {
                Assert.assertNotNull(r1.getFields());
                Assert.assertTrue(!r1.getFields().isEmpty());
                final String type = new String(r1.getFields().get(0).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(type);
                final String name = new String(r1.getFields().get(1).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(name);
                final long page = r1.getFields().get(3).intValue();
                if ("table".equals(type.trim()) && "rep_cache".equals(name.trim())) {
                    Assert.assertTrue(page > 0);
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btree, (int) page, false, false);
                    Assert.assertTrue(!data.eof());
                    for (ISqlJetRecord r2 = data.next(); r2 != null; r2 = data.next()) {
                        Assert.assertNotNull(r2.getFields());
                        Assert.assertTrue(!r2.getFields().isEmpty());
                        for (ISqlJetVdbeMem field : r2.getFields()) {
                            final ByteBuffer value = field.valueText(SqlJetEncoding.UTF8);
                            Assert.assertNotNull(value);
                            String s = new String(value.array());
                            logger.info(s);
                            passed = true;
                        }
                    }
                }
            }
        } finally {
            master.close();
        }
        Assert.assertTrue(passed);
    }

}
