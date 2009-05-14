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
package org.tmatesoft.sqljet.core.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetKeyInfo;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTableTest extends AbstractDataCopyTest {

    public static final String BTREE_TABLE_TEST = "SqlJetBtreeTableTest";

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(BTREE_TABLE_TEST + ".REP_CACHE_DB",
            "sqljet-test/db/rep-cache/rep-cache.db");

    public static final String REP_CACHE_TABLE = SqlJetUtility.getSysProp(BTREE_TABLE_TEST + ".REP_CACHE_TABLE",
            "rep_cache");

    private static final int REPEATS_COUNT = SqlJetUtility.getIntSysProp(BTREE_TABLE_TEST + ".REPEATS_COUNT", 1000);

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(BTREE_TABLE_TEST + ".DELETE_COPY", false);

    private File repCacheDb = new File(REP_CACHE_DB);
    private File repCacheDbCopy;

    private ISqlJetDbHandle db;
    private ISqlJetBtree btree;
    private ISqlJetBtree btreeCopy;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        copyRepCache();

        db = new SqlJetDbHandle();
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
        repCacheDbCopy = copyFile(repCacheDb, DELETE_COPY);
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
                    if (DELETE_COPY)
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
        final ISqlJetBtreeCursor c = btree.getCursor(ISqlJetDbHandle.MASTER_ROOT, false, null);
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

    private SqlJetEncoding getEncoding(ISqlJetBtree btree) throws SqlJetException {
        switch (btree.getMeta(5)) {
        case 1:
            return SqlJetEncoding.UTF8;
        case 2:
            return SqlJetEncoding.UTF16LE;
        case 3:
            return SqlJetEncoding.UTF16BE;
        default:
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        }
    }

    @Test
    public void testTableReadMaster() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeTable t = new SqlJetBtreeTable(btree, ISqlJetDbHandle.MASTER_ROOT, false, false,
                getEncoding(btree));
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
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btree, ISqlJetDbHandle.MASTER_ROOT, false, false,
                getEncoding(btree));
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
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btree, (int) page, false, false,
                            getEncoding(btree));
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
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btree, ISqlJetDbHandle.MASTER_ROOT, false, false,
                getEncoding(btree));
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
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btree, (int) page, false, true,
                            getEncoding(btree));
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
        final ISqlJetSchema s = new SqlJetSchema(btree);
        for (String tableName : s.getTableNames()) {
            logger.info(tableName);
            passed = true;
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testDataTable() throws SqlJetException {
        boolean passed = false;
        final ISqlJetSchema s = new SqlJetSchema(btree);
        final ISqlJetBtreeTable t = new SqlJetBtreeDataTable(s, REP_CACHE_TABLE, false);
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
        final ISqlJetSchema s = new SqlJetSchema(btree);
        final String index = s.getIndexNames(REP_CACHE_TABLE).iterator().next();
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
        final ISqlJetSchema s = new SqlJetSchema(btree);
        final ISqlJetBtreeDataTable d = new SqlJetBtreeDataTable(s, REP_CACHE_TABLE, false);
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
        boolean passed = false;
        final ISqlJetSchema schema = new SqlJetSchema(btree);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            final String hash = getRandomHash(schema);
            if (null == hash)
                break;
            passed = hashIndexLookupTest(schema, hash);
            Assert.assertTrue(passed);
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testIndexLookupIncorrect() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btree);
        boolean failed = hashIndexLookupTest(schema, "incorrect");
        Assert.assertTrue(!failed);
    }

    /**
     * @param schema
     * @throws SqlJetException
     */
    private boolean hashIndexLookupTest(final ISqlJetSchema schema, String hash) throws SqlJetException {
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, false);
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
    private long locateHash(final ISqlJetSchema schema, final String hash) throws SqlJetException {
        final String i = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, i, false);
        try {
            final ISqlJetVdbeMem mem = new SqlJetVdbeMem();
            mem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), SqlJetEncoding.UTF8);
            final ISqlJetBtreeRecord record = index.lookup(false, new SqlJetBtreeRecord(mem));
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
    private String getRandomHash(final ISqlJetSchema schema) throws SqlJetException {
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, false);
        try {
            data.last();
            long lastKey = data.getRowId();
            if (lastKey <= 0)
                return null;
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
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        insertHash(schema, data, index, "TEST");
        btreeCopy.commit();
    }

    @Test
    public void testInsertRepeatlyShort() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
            insertHash(schema, data, index, String.valueOf(i));
            btreeCopy.commit();
        }
    }

    @Test
    public void testInsertRepeatlyLong() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            insertHash(schema, data, index, String.valueOf(i));
        }
        btreeCopy.commit();
    }

    @Test
    public void testInsertRandomShort() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        Random random = new Random();
        for (int i = 0; i < REPEATS_COUNT; i++) {
            btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
            insertHash(schema, data, index, String.valueOf(SqlJetUtility.fromUnsigned(random.nextInt())));
            btreeCopy.commit();
        }
    }

    @Test
    public void testInsertRandomLong() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, idx, true);
        Random random = new Random();
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            insertHash(schema, data, index, String.valueOf(SqlJetUtility.fromUnsigned(random.nextInt())));
        }
        btreeCopy.commit();
    }

    public void insertHash(ISqlJetSchema schema, ISqlJetBtreeDataTable data, ISqlJetBtreeIndexTable index,
            String hash) throws SqlJetException {

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

        ISqlJetBtreeRecord dataRecord = new SqlJetBtreeRecord(hashMem, f1, f2, f3, f4);

        final long rowId = data.newRowId(0);

        ISqlJetVdbeMem rowIdMem = new SqlJetVdbeMem();
        rowIdMem.setInt64(rowId);

        ISqlJetBtreeRecord indexRecord = new SqlJetBtreeRecord(hashMem, rowIdMem);

        index.lockTable(true);
        data.lockTable(true);

        index.insert(indexRecord, false);
        data.insert(rowId, dataRecord, false);

    }

    @Test
    public void testDeleteOnce() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        final String hash = getRandomHash(schema);
        if (null != hash) {
            logger.info(hash);
            deleteHash(schema, data, hash);
        }
        btreeCopy.commit();
    }

    @Test
    public void testDeleteRepeatlyShort() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            final String hash = getRandomHash(schema);
            if (null != hash) {
                btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
                logger.info(hash);
                deleteHash(schema, data, hash);
                btreeCopy.commit();
            } else
                break;
        }
    }

    @Test
    public void testDeleteRepeatlyLong() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            final String hash = getRandomHash(schema);
            if (null != hash) {
                logger.info(hash);
                deleteHash(schema, data, hash);
            } else
                break;
        }
        btreeCopy.commit();
    }

    @Test
    public void testDeleteCorrupt() throws SqlJetException {
        final ISqlJetSchema schema = new SqlJetSchema(btreeCopy);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(schema, REP_CACHE_TABLE, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        String hash = "8e204eb864658660ffa6e28dda57dcecb95b1847";
        locateHash(schema, hash);
        deleteHash(schema, data, hash);
        btreeCopy.commit();
        locateHash(schema, hash);
    }

    /**
     * @param schema
     * @param data
     * @throws SqlJetException
     */
    private void deleteHash(final ISqlJetSchema schema, final ISqlJetBtreeDataTable data, String hash)
            throws SqlJetException {
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
    private void deleteIndex(final ISqlJetSchema schema, final String hash) throws SqlJetException {
        final String i = schema.getIndexNames(REP_CACHE_TABLE).iterator().next();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(schema, i, true);
        try {
            final ISqlJetVdbeMem mem = new SqlJetVdbeMem();
            mem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(hash)), schema.getMeta().getEncoding());
            index.delete(new SqlJetBtreeRecord(mem));
        } finally {
            index.close();
        }
    }

}
