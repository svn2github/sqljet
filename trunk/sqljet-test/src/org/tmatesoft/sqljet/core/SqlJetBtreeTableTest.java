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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Random;
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
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetKeyInfo;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;
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
    private static final boolean deleteCopy = SqlJetUtility.getBoolSysProp("SqlJetBtreeTableTest.deleteCopy", false);

    private File repCacheDb = new File("sqljet-test/db/rep-cache/rep-cache.db");
    private File repCacheDbCopy;

    private ISqlJetDb db;
    private ISqlJetBtree btree;
    private ISqlJetBtree btreeCopy;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        copyRepCache();

        db = new SqlJetDb();
        db.getMutex().enter();
        btree = new SqlJetBtree();
        btree.open(repCacheDb, db, EnumSet.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB, EnumSet
                .of(SqlJetFileOpenPermission.READONLY));

        btreeCopy = new SqlJetBtree();
        btreeCopy
                .open(repCacheDbCopy, db, EnumSet.of(SqlJetBtreeFlags.READWRITE, SqlJetBtreeFlags.CREATE),
                        SqlJetFileType.MAIN_DB, EnumSet.of(SqlJetFileOpenPermission.READWRITE,
                                SqlJetFileOpenPermission.CREATE));
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    private void copyRepCache() throws IOException, FileNotFoundException {
        repCacheDbCopy = File.createTempFile("rep-cache", null);
        if (deleteCopy)
            repCacheDbCopy.deleteOnExit();
        RandomAccessFile in = new RandomAccessFile(repCacheDb, "r");
        RandomAccessFile out = new RandomAccessFile(repCacheDbCopy, "rw");
        byte[] b = new byte[4096];
        for (int i = in.read(b); i > 0; i = in.read(b))
            out.write(b, 0, i);
        in.close();
        out.close();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            try {
                if (null != btree)
                    btree.close();
            } finally {
                try {
                    if (null != btreeCopy)
                        btreeCopy.close();
                } finally {
                    if (deleteCopy)
                        repCacheDbCopy.delete();
                }
            }
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
    public void testRecordCompare() throws SqlJetException {
        final ISqlJetBtreeSchema s = new SqlJetBtreeSchema(btree);
        final ISqlJetBtreeDataTable d = new SqlJetBtreeDataTable(s, REP_CACHE, false);
        final ISqlJetBtreeRecord r = d.getRecord();
        final ISqlJetVdbeMem f = r.getFields().get(0);
        final ByteBuffer v = f.valueText(SqlJetEncoding.UTF8);
        final String h = SqlJetUtility.toString(v);
        final SqlJetBtreeRecord r1 = new SqlJetBtreeRecord(f);
        final SqlJetVdbeMem m = new SqlJetVdbeMem();
        m.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(h)), SqlJetEncoding.UTF8);
        final SqlJetBtreeRecord r2 = new SqlJetBtreeRecord(m);
        SqlJetKeyInfo keyInfo = new SqlJetKeyInfo();
        keyInfo.setEnc(SqlJetEncoding.UTF8);
        keyInfo.setNField(r1.getFieldsCount());
        final ByteBuffer raw1 = r1.getRawRecord();
        final SqlJetUnpackedRecord u = keyInfo.recordUnpack(raw1.remaining(), raw1);
        final ByteBuffer raw2 = r2.getRawRecord();
        final int c1 = u.recordCompare(raw2.remaining(), raw2);
        logger.info("compare " + c1);
        final int c2 = raw1.compareTo(raw2);
        logger.info("compare2 " + c2);
        Assert.assertTrue(c1 == c2);
    }

    @Test
    public void testIndexLookup() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btree);
        for (int i = 0; i < 100; i++) {
            final String randomHash = getRandomHash(schema);
            boolean passed = hashIndexLookupTest(schema, randomHash);
            Assert.assertTrue(passed);
        }
    }

    @Test
    public void testIndexLookupIncorrect() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btree);
        boolean failed = hashIndexLookupTest(schema, "incorrect");
        Assert.assertTrue(!failed);
    }

    /**
     * @param schema
     * @throws SqlJetException
     */
    private boolean hashIndexLookupTest(final ISqlJetBtreeSchema schema, String hash) throws SqlJetException {
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, false);
        try {
            final long row = locateHash(schema, hash);
            if (0 == row)
                return false;
            data.goToRow((int) row);
            final ISqlJetBtreeRecord record = data.getRecord();
            final ISqlJetVdbeMem field = record.getFields().get(0);
            final String foundHash = SqlJetUtility.toString(field.valueText(SqlJetEncoding.UTF8));
            Assert.assertEquals(hash, foundHash);
            return true;
        } finally {
            data.close();
        }
    }

    /**
     * @param schema
     * @param hash
     * @return
     * @throws SqlJetException
     */
    private long locateHash(final ISqlJetBtreeSchema schema, final String hash) throws SqlJetException {
        final String i = schema.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, i, false);
        try {
            final ISqlJetVdbeMem mem = new SqlJetVdbeMem();
            mem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), SqlJetEncoding.UTF8);
            final ISqlJetBtreeRecord record = index.lookup(new SqlJetBtreeRecord(mem));
            if (null == record)
                return 0;
            final long row = record.getFields().get(1).intValue();
            return row;
        } finally {
            index.close();
        }
    }

    /**
     * @param schema
     * @return
     * @throws SqlJetException
     */
    private String getRandomHash(final ISqlJetBtreeSchema schema) throws SqlJetException {
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, false);
        try {
            data.last();
            long lastKey = data.getKey();
            Random random = new Random();
            final int key = random.nextInt((int) lastKey);
            data.goToRow(key);
            final ISqlJetBtreeRecord record = data.getRecord();
            final ISqlJetVdbeMem field = record.getFields().get(0);
            final String hash = SqlJetUtility.toString(field.valueText(SqlJetEncoding.UTF8));
            return hash;
        } finally {
            data.close();
        }
    }

    @Test
    public void testInsertOnce() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, true);
        final String idx = schema.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        insertHash(schema, data, index);
    }

    @Test
    public void testInsertRepeatly() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, true);
        final String idx = schema.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        for (int i = 0; i < 100; i++) {
            insertHash(schema, data, index);
        }
    }
    
    public void insertHash(ISqlJetBtreeSchema schema, ISqlJetBtreeDataTable data, ISqlJetBtreeIndexTable index)
            throws SqlJetException {

        Random random = new Random();

        String hash = "test." + random.nextLong();
        ISqlJetVdbeMem hashMem = new SqlJetVdbeMem();
        hashMem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), SqlJetEncoding.UTF8);

        ISqlJetVdbeMem f1 = new SqlJetVdbeMem();
        f1.setInt64(1);
        ISqlJetVdbeMem f2 = new SqlJetVdbeMem();
        f2.setInt64(1);
        ISqlJetVdbeMem f3 = new SqlJetVdbeMem();
        f3.setInt64(1);
        ISqlJetVdbeMem f4 = new SqlJetVdbeMem();
        f4.setInt64(1);

        ISqlJetBtreeRecord dataRecord = new SqlJetBtreeRecord( hashMem, f1, f2, f3, f4 );

        final long rowId = data.newRowId(0);

        ISqlJetVdbeMem rowIdMem = new SqlJetVdbeMem();
        rowIdMem.setInt64(rowId);

        ISqlJetBtreeRecord indexRecord = new SqlJetBtreeRecord( hashMem, rowIdMem );

        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        index.lockTable(true);
        data.lockTable(true);

        index.insert(indexRecord, false);
        data.insert(rowId, dataRecord, false);

        btreeCopy.commit();

    }

    @Test
    public void testDeleteOnce() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        final String hash = getRandomHash(schema);
        logger.info(hash);
        deleteHash(schema, data,hash);
        btreeCopy.commit();
    }
    
    @Test
    public void testDeleteRepeatly() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, true);
        for (int i = 0; i < 100; i++) {
            btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
            final String hash = getRandomHash(schema);
            logger.info(hash);
            deleteHash(schema, data,hash);
            btreeCopy.commit();
        }
    }

    @Test
    public void testDeleteCorrupt() throws SqlJetException {
        final ISqlJetBtreeSchema schema = new SqlJetBtreeSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        String hash="8e204eb864658660ffa6e28dda57dcecb95b1847";
        locateHash(schema, hash);
        deleteHash(schema, data,hash);
        btreeCopy.commit();
        locateHash(schema, hash);
    }
    
    
    /**
     * @param schema
     * @param data
     * @throws SqlJetException
     */
    private void deleteHash(final ISqlJetBtreeSchema schema, 
            final ISqlJetBtreeDataTable data, String hash) throws SqlJetException {
        final long rowId = locateHash(schema, hash);
        if (rowId > 0) {
            deleteIndex(schema, hash);
            data.delete(rowId);
        }
    }

    /**
     * @param schema
     * @param hash
     * @return
     * @throws SqlJetException
     */
    private void deleteIndex(final ISqlJetBtreeSchema schema, final String hash) throws SqlJetException {
        final String i = schema.getIndexesOfTable(REP_CACHE).iterator().next();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, i, true);
        try {
            final ISqlJetVdbeMem mem = new SqlJetVdbeMem();
            mem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), SqlJetEncoding.UTF8);
            index.delete(new SqlJetBtreeRecord(mem));
        } finally {
            index.close();
        }
    }

}
