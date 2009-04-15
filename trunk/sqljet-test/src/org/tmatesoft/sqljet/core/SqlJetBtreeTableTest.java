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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.btree.ext.SqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.btree.ext.SqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.btree.ext.SqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.internal.btree.ext.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDb;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTableTest extends SqlJetAbstractLoggedTest {

    /**
     * 
     */
    public static final String REP_CACHE = "rep_cache";

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
                    ISqlJetBtreeRecord r = new SqlJetBtreeRecord(c, false);
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
            for (ISqlJetBtreeRecord r = t.getRecord(); !t.eof(); t.next(), r = t.getRecord()) {
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
            for (ISqlJetBtreeRecord r1 = master.getRecord(); !master.eof(); master.next(), r1 = master.getRecord()) {
                Assert.assertNotNull(r1.getFields());
                Assert.assertTrue(!r1.getFields().isEmpty());
                final String type = new String(r1.getFields().get(0).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(type);
                final String name = new String(r1.getFields().get(1).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(name);
                final long page = r1.getFields().get(3).intValue();
                if ("table".equals(type.trim())) {
                    logger.info(name.trim());
                    Assert.assertTrue(page > 0);
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btree, (int) page, false, false);
                    Assert.assertTrue(!data.eof());
                    for (ISqlJetBtreeRecord r2 = data.getRecord(); !data.eof(); data.next(), r2 = data.getRecord()) {
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

    @Test
    public void testTableReadIndex() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btree, ISqlJetDb.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!master.eof());
            for (ISqlJetBtreeRecord r1 = master.getRecord(); !master.eof(); master.next(), r1 = master.getRecord()) {
                Assert.assertNotNull(r1.getFields());
                Assert.assertTrue(!r1.getFields().isEmpty());
                final String type = new String(r1.getFields().get(0).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(type);
                final String name = new String(r1.getFields().get(1).valueText(SqlJetEncoding.UTF8).array());
                Assert.assertNotNull(name);
                final long page = r1.getFields().get(3).intValue();
                if ("index".equals(type.trim())) {
                    Assert.assertTrue(page > 0);
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btree, (int) page, false, true);
                    Assert.assertTrue(!data.eof());
                    for (ISqlJetBtreeRecord r2 = data.getRecord(); !data.eof(); data.next(), r2 = data.getRecord()) {
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

    @Test
    public void testSchema() throws SqlJetException {
        boolean passed = false;
        final ISqlJetBtreeSchema s = new SqlJetBtreeSchema(btree);
        for (String tableName : s.getTableNames()) {
            logger.info(tableName);
            passed = true;
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testDataTable() throws SqlJetException {
        boolean passed = false;
        final ISqlJetBtreeSchema s = new SqlJetBtreeSchema(btree);
        final ISqlJetBtreeTable t = new SqlJetBtreeDataTable(s, REP_CACHE, false);
        for (ISqlJetBtreeRecord r = t.getRecord(); !t.eof(); t.next(), r = t.getRecord()) {
            final int fields = r.getFieldsCount();
            for (int i = 0; i < fields; i++) {
                logger.info(r.getStringField(i, SqlJetEncoding.UTF8));
                passed = true;
            }
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testIndexTable() throws SqlJetException {
        boolean passed = false;
        final ISqlJetBtreeSchema s = new SqlJetBtreeSchema(btree);
        final String index = s.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(index);
        final ISqlJetBtreeTable t = new SqlJetBtreeIndexTable(s, index, false);
        for (ISqlJetBtreeRecord r = t.getRecord(); !t.eof(); t.next(), r = t.getRecord()) {
            final int fields = r.getFieldsCount();
            for (int i = 0; i < fields; i++) {
                logger.info(r.getStringField(i, SqlJetEncoding.UTF8));
                passed = true;
            }
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testIndexLookup() throws SqlJetException {
        boolean passed = false;
        
        final ISqlJetBtreeSchema s = new SqlJetBtreeSchema(btree);
        final ISqlJetBtreeDataTable d = new SqlJetBtreeDataTable(s, REP_CACHE, false);
        
        d.next();
        final ISqlJetBtreeRecord record = d.getRecord();
        final ISqlJetVdbeMem f = record.getFields().get(0);
        final ByteBuffer v = f.valueText(SqlJetEncoding.UTF8);
        final String hash = SqlJetUtility.toString(v);
        
        final String index = s.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(index);
        final ISqlJetBtreeIndexTable i = new SqlJetBtreeIndexTable(s, index, false);
        
        int row = i.lookup(new SqlJetBtreeRecord(new ISqlJetVdbeMem[] { f }));
        logger.info("loookup " + row);
        
        final SqlJetVdbeMem m = new SqlJetVdbeMem();
        m.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), SqlJetEncoding.UTF8);
        row = i.lookup(new SqlJetBtreeRecord(new ISqlJetVdbeMem[] { m }));
        logger.info("loookup " + row);

        //Assert.assertTrue(passed);
    }

}
