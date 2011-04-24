/**
 * SqlJetRecordTest.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable;
import org.tmatesoft.sqljet.core.internal.table.SqlJetOptions;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetKeyInfo;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTableTest extends AbstractDataCopyTest {

    public static final String BTREE_TABLE_TEST = "SqlJetBtreeTableTest";

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(BTREE_TABLE_TEST + ".REP_CACHE_DB",
            "src/test/data/db/rep-cache/rep-cache.db");

    public static final String REP_CACHE_TABLE = SqlJetUtility.getSysProp(BTREE_TABLE_TEST + ".REP_CACHE_TABLE",
            "rep_cache");

    private static final int REPEATS_COUNT = SqlJetUtility.getIntSysProp(BTREE_TABLE_TEST + ".REPEATS_COUNT", 1000);

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(BTREE_TABLE_TEST + ".DELETE_COPY", false);

    private File repCacheDb = new File(REP_CACHE_DB);
    private File repCacheDbCopy;

    private ISqlJetDbHandle db;
    private ISqlJetBtree btreeCopy;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        copyRepCache();

        db = new SqlJetDbHandle();
        db.getMutex().enter();

        btreeCopy = new SqlJetBtree();
        btreeCopy.open(repCacheDbCopy, db, SqlJetUtility.of(SqlJetBtreeFlags.READWRITE, SqlJetBtreeFlags.CREATE),
                SqlJetFileType.MAIN_DB, SqlJetUtility.of(SqlJetFileOpenPermission.READWRITE,
                        SqlJetFileOpenPermission.CREATE));

        db.setOptions(new SqlJetOptions(btreeCopy, db));

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
                if (null != btreeCopy) {
                    btreeCopy.close();
                }
            } finally {
                if (DELETE_COPY) {
                    SqlJetFileUtil.deleteFile(repCacheDbCopy);
                }
            }
        } finally {
            db.getMutex().leave();
        }
    }

    @Test
    public void testRecordReadMaster() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeCursor c = btreeCopy.getCursor(ISqlJetDbHandle.MASTER_ROOT, false, null);
        c.enterCursor();
        try {
            if (!c.first())
                do {
                    ISqlJetBtreeRecord r = new SqlJetBtreeRecord(c, false, ISqlJetLimits.SQLJET_MIN_FILE_FORMAT);
                    Assert.assertNotNull(r.getFields());
                    Assert.assertTrue(!r.getFields().isEmpty());
                    for (ISqlJetVdbeMem field : r.getFields()) {
                        if (!field.isNull()) {
                            final ISqlJetMemoryPointer value = field.valueText(SqlJetEncoding.UTF8);
                            Assert.assertNotNull(value);
                            String s = SqlJetUtility.toString(value);
                            logger.info(s);
                        } else {
                            logger.info("null");
                        }
                        passed = true;
                    }
                } while (!c.next());
            c.closeCursor();
        } finally {
            c.leaveCursor();
        }
        Assert.assertTrue(passed);
    }

    /*
     * private SqlJetEncoding getEncoding(ISqlJetBtree btree) throws
     * SqlJetException { switch (btree.getMeta(5)) { case 1: return
     * SqlJetEncoding.UTF8; case 2: return SqlJetEncoding.UTF16LE; case 3:
     * return SqlJetEncoding.UTF16BE; default: throw new
     * SqlJetException(SqlJetErrorCode.CORRUPT); } }
     */

    @Test
    public void testTableReadMaster() throws SqlJetException, UnsupportedEncodingException {
        boolean passed = false;
        final ISqlJetBtreeTable t = new SqlJetBtreeTable(btreeCopy, ISqlJetDbHandle.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!t.eof());
            for (ISqlJetBtreeRecord r = t.getRecord(); !t.eof(); t.next(), r = t.getRecord()) {
                Assert.assertNotNull(r.getFields());
                Assert.assertTrue(!r.getFields().isEmpty());
                for (ISqlJetVdbeMem field : r.getFields()) {
                    if (!field.isNull()) {
                        final ISqlJetMemoryPointer value = field.valueText(SqlJetEncoding.UTF8);
                        Assert.assertNotNull(value);
                        String s = SqlJetUtility.toString(value);
                        logger.info(s);
                    } else {
                        logger.info("null");
                    }
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
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btreeCopy, ISqlJetDbHandle.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!master.eof());
            for (ISqlJetBtreeRecord r1 = master.getRecord(); !master.eof(); master.next(), r1 = master.getRecord()) {
                Assert.assertNotNull(r1.getFields());
                Assert.assertTrue(!r1.getFields().isEmpty());
                final String type = SqlJetUtility.toString(r1.getFields().get(0).valueText(SqlJetEncoding.UTF8));
                Assert.assertNotNull(type);
                final String name = SqlJetUtility.toString(r1.getFields().get(1).valueText(SqlJetEncoding.UTF8));
                Assert.assertNotNull(name);
                final long page = r1.getFields().get(3).intValue();
                if ("table".equals(type.trim())) {
                    logger.info(name.trim());
                    Assert.assertTrue(page > 0);
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btreeCopy, (int) page, false, false);
                    Assert.assertTrue(!data.eof());
                    for (ISqlJetBtreeRecord r2 = data.getRecord(); !data.eof(); data.next(), r2 = data.getRecord()) {
                        Assert.assertNotNull(r2.getFields());
                        Assert.assertTrue(!r2.getFields().isEmpty());
                        for (ISqlJetVdbeMem field : r2.getFields()) {
                            final ISqlJetMemoryPointer value = field.valueText(SqlJetEncoding.UTF8);
                            Assert.assertNotNull(value);
                            String s = SqlJetUtility.toString(value);
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
        final ISqlJetBtreeTable master = new SqlJetBtreeTable(btreeCopy, ISqlJetDbHandle.MASTER_ROOT, false, false);
        try {
            Assert.assertTrue(!master.eof());
            for (ISqlJetBtreeRecord r1 = master.getRecord(); !master.eof(); master.next(), r1 = master.getRecord()) {
                Assert.assertNotNull(r1.getFields());
                Assert.assertTrue(!r1.getFields().isEmpty());
                final String type = SqlJetUtility.toString(r1.getFields().get(0).valueText(SqlJetEncoding.UTF8));
                Assert.assertNotNull(type);
                final String name = SqlJetUtility.toString(r1.getFields().get(1).valueText(SqlJetEncoding.UTF8));
                Assert.assertNotNull(name);
                final long page = r1.getFields().get(3).intValue();
                if ("index".equals(type.trim())) {
                    Assert.assertTrue(page > 0);
                    final ISqlJetBtreeTable data = new SqlJetBtreeTable(btreeCopy, (int) page, false, true);
                    Assert.assertTrue(!data.eof());
                    for (ISqlJetBtreeRecord r2 = data.getRecord(); !data.eof(); data.next(), r2 = data.getRecord()) {
                        Assert.assertNotNull(r2.getFields());
                        Assert.assertTrue(!r2.getFields().isEmpty());
                        for (ISqlJetVdbeMem field : r2.getFields()) {
                            final ISqlJetMemoryPointer value = field.valueText(SqlJetEncoding.UTF8);
                            Assert.assertNotNull(value);
                            String s = SqlJetUtility.toString(value);
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
        final ISqlJetSchema s = new SqlJetSchema(db, btreeCopy);
        for (String tableName : s.getTableNames()) {
            logger.info(tableName);
            passed = true;
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void testDataTable() throws SqlJetException {
        boolean passed = false;
        final SqlJetSchema s = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(s);
        final ISqlJetBtreeTable t = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, false);
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
        final SqlJetSchema s = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(s);
        final String index = s.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(index);
        final ISqlJetBtreeTable t = new SqlJetBtreeIndexTable(btreeCopy, index, false);
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
        final SqlJetSchema s = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(s);
        final ISqlJetBtreeDataTable d = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, false);
        final ISqlJetBtreeRecord r = d.getRecord();
        final ISqlJetVdbeMem f = r.getFields().get(0);
        final ISqlJetMemoryPointer v = f.valueText(SqlJetEncoding.UTF8);
        final String h = SqlJetUtility.toString(v);
        final SqlJetBtreeRecord r1 = new SqlJetBtreeRecord(f);
        final SqlJetVdbeMem m = new SqlJetVdbeMem();
        m.setStr(SqlJetUtility.wrapPtr(SqlJetUtility.getBytes(h)), SqlJetEncoding.UTF8);
        final SqlJetBtreeRecord r2 = new SqlJetBtreeRecord(m);
        SqlJetKeyInfo keyInfo = new SqlJetKeyInfo();
        keyInfo.setEnc(SqlJetEncoding.UTF8);
        keyInfo.setNField(r1.getFieldsCount());
        final ISqlJetMemoryPointer raw1 = r1.getRawRecord();
        final SqlJetUnpackedRecord u = keyInfo.recordUnpack(raw1.remaining(), raw1);
        final ISqlJetMemoryPointer raw2 = r2.getRawRecord();
        final int c1 = u.recordCompare(raw2.remaining(), raw2);
        logger.info("compare " + c1);
        final int c2 = raw1.compareTo(raw2);
        logger.info("compare2 " + c2);
        Assert.assertTrue(c1 == c2);
    }

    @Test
    public void testIndexLookup() throws SqlJetException {
        boolean passed = false;
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
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
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        boolean failed = hashIndexLookupTest(schema, "incorrect");
        Assert.assertTrue(!failed);
    }

    /**
     * @param schema
     * @throws SqlJetException
     */
    private boolean hashIndexLookupTest(final ISqlJetSchema schema, String hash) throws SqlJetException {
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, false);
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
        final String i = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, i, false);
        try {
            return index.lookup(false, hash);
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
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, false);
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
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        insertHash(schema, data, index, "TEST");
        btreeCopy.commit();
    }

    @Test
    public void testInsertRepeatlyShort() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
            insertHash(schema, data, index, String.valueOf(i));
            btreeCopy.commit();
        }
    }

    @Test
    public void testInsertRepeatlyLong() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            insertHash(schema, data, index, String.valueOf(i));
        }
        btreeCopy.commit();
    }

    @Test
    public void testInsertRandomShort() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        Random random = new Random();
        for (int i = 0; i < REPEATS_COUNT; i++) {
            btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
            final String hash = String.valueOf(SqlJetUtility.fromUnsigned(random.nextInt()));
            if (locateHash(schema, hash) == 0) {
                insertHash(schema, data, index, hash);
            }
            btreeCopy.commit();
        }
    }

    @Test
    public void testInsertRandomLong() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        Random random = new Random();
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        for (int i = 0; i < REPEATS_COUNT; i++) {
            final String hash = String.valueOf(SqlJetUtility.fromUnsigned(random.nextInt()));
            if (locateHash(schema, hash) == 0) {
                insertHash(schema, data, index, hash);
            }
        }
        btreeCopy.commit();
    }

    public void insertHash(ISqlJetSchema schema, ISqlJetBtreeDataTable data, ISqlJetBtreeIndexTable index, String hash)
            throws SqlJetException {

        index.lockTable(true);
        data.lockTable(true);

        final long rowId = data.insert(null, hash, 1, 1, 1, 1);
        index.insert(rowId, false, hash);

    }

    @Test
    public void testDeleteOnce() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
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
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
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
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
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
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
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
            deleteIndex(schema, hash, rowId);
            data.delete(rowId);
        }
    }

    /**
     * @param schema
     * @param hash
     * @return
     * @throws SqlJetException
     */
    private void deleteIndex(final ISqlJetSchema schema, final String hash, long rowId) throws SqlJetException {
        final String i = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(i);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, i, true);
        try {
            index.delete(rowId, hash);
        } finally {
            index.close();
        }
    }

    @Test(expected = SqlJetException.class)
    public void verifySchemaCookie() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final ISqlJetBtreeDataTable data = new SqlJetBtreeDataTable(btreeCopy, REP_CACHE_TABLE, true);
        data.first();
        final SqlJetOptions meta = new SqlJetOptions(btreeCopy, db);
        btreeCopy.beginTrans(SqlJetTransactionMode.WRITE);
        meta.changeSchemaVersion();
        btreeCopy.commit();
        db.getOptions().verifySchemaVersion(true);
        data.first();
        Assert.assertTrue(false);
    }

    @Test
    public void checkIndexSorted() throws SqlJetException {
        final SqlJetSchema schema = new SqlJetSchema(db, btreeCopy);
        btreeCopy.setSchema(schema);
        final String idx = schema.getIndexes(REP_CACHE_TABLE).iterator().next().getName();
        Assert.assertNotNull(idx);
        final ISqlJetBtreeIndexTable index = new SqlJetBtreeIndexTable(btreeCopy, idx, true);
        String prev = null;
        for (index.first(); !index.eof(); index.next()) {
            final String hash = index.getString(0);
            logger.info(hash);
            if (prev != null && hash != null) {
                Assert.assertTrue(hash.compareTo(prev) > 0);
            }
            prev = hash;
        }
    }
}
