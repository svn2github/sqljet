/**
 * SqlJetTableTest.java
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
package org.tmatesoft.sqljet.core.table;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableTest extends AbstractDataCopyTest {

    public static final String TABLE_TEST = "SqlJetTableTest";

    public static final String DB = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "src/test/data/db/testdb.sqlite");

    public static final String DB2 = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "src/test/data/db/test2.sqlite");
    public static final String DB3 = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "src/test/data/db/test3.sqlite");

    public static final String TABLE = SqlJetUtility.getSysProp(TABLE_TEST + ".TABLE", "test1");
    public static final String TABLE2 = SqlJetUtility.getSysProp(TABLE_TEST + ".TABLE", "test2");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(TABLE_TEST + ".DELETE_COPY", true);

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(TABLE_TEST + ".REP_CACHE_DB",
            "src/test/data/db/rep-cache/rep-cache.db");

    public static final String REP_CACHE_TABLE = SqlJetUtility.getSysProp(TABLE_TEST + ".REP_CACHE_TABLE", "rep_cache");

    private static final int REPEATS_COUNT = SqlJetUtility.getIntSysProp(TABLE_TEST + ".REPEATS_COUNT", 100);

    private static final String NAME_INDEX = "test1_name_index";

    private static final int DATA_FIELD = 3;

    private static final int NAME_FIELD = 1;

    private static final String TEST = "test";

    private File fileDb = new File(DB);
    private File fileDbCopy;
    private SqlJetDb dbCopy;

    private File file2Db = new File(DB2);
    private File file2DbCopy;
    private SqlJetDb db2Copy;

    private File file3Db = new File(DB3);
    private File file3DbCopy;
    private SqlJetDb db3Copy;

    private File repCache = new File(REP_CACHE_DB);
    private File repCacheCopy;
    private SqlJetDb repCacheDb;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        fileDbCopy = copyFile(fileDb, DELETE_COPY);
        file2DbCopy = copyFile(file2Db, DELETE_COPY);
        file3DbCopy = copyFile(file3Db, DELETE_COPY);
        repCacheCopy = copyFile(repCache, DELETE_COPY);
        dbCopy = SqlJetDb.open(fileDbCopy, true);
        db2Copy = SqlJetDb.open(file2DbCopy, true);
        db3Copy = SqlJetDb.open(file3DbCopy, true);
        repCacheDb = SqlJetDb.open(repCacheCopy, true);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            if (null != dbCopy)
                dbCopy.close();
        } finally {
            try {
                if (null != db2Copy)
                    db2Copy.close();
            } finally {
                try {
                    if (null != db3Copy)
                        db3Copy.close();
                } finally {
                    if (null != repCacheDb)
                        repCacheDb.close();
                }
            }
        }
    }

    @Test
    public void indexLookupNext() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTable table = dbCopy.getTable(TABLE);

                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);
                Assert.assertTrue(!lookup.eof());
                final boolean firstNull = lookup.isNull(NAME_FIELD);
                Assert.assertFalse(firstNull);
                final SqlJetValueType firstType = lookup.getFieldType(NAME_FIELD);
                Assert.assertTrue(firstType == SqlJetValueType.TEXT);
                final String firstName = lookup.getString(NAME_FIELD);
                Assert.assertNotNull(firstName);
                Assert.assertEquals(TEST, firstName);

                final boolean gotoSecond = lookup.next();
                Assert.assertTrue(gotoSecond);
                final boolean secondNull = lookup.isNull(NAME_FIELD);
                Assert.assertFalse(secondNull);
                final SqlJetValueType secondType = lookup.getFieldType(NAME_FIELD);
                Assert.assertTrue(secondType == SqlJetValueType.TEXT);
                final String secondName = lookup.getString(NAME_FIELD);
                Assert.assertNotNull(secondName);
                Assert.assertEquals(TEST, secondName);

                final boolean gotoLast = lookup.next();
                Assert.assertFalse(gotoLast);
                final boolean eof = lookup.eof();
                Assert.assertTrue(eof);

                lookup.close();

                return null;
            }
        });
    }

    @Test
    public void indexDelete() throws SqlJetException {
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable table = dbCopy.getTable(TABLE);
                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);
                Assert.assertTrue(!lookup.eof());
                lookup.delete();
                Assert.assertFalse(lookup.eof());
                lookup.delete();
                Assert.assertTrue(lookup.eof());
                lookup.close();
                return null;
            }
        });
    }

    @Test
    public void readBlob() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTable table = dbCopy.getTable(TABLE);
                final ISqlJetCursor cursor = table.open();

                Assert.assertTrue(cursor.first());

                Assert.assertFalse(cursor.isNull(DATA_FIELD));
                final byte[] firstData = cursor.getBlobAsArray(DATA_FIELD);
                Assert.assertNotNull(firstData);
                Assert.assertTrue(firstData.length > 0);

                Assert.assertTrue(cursor.next());

                Assert.assertTrue(cursor.isNull(DATA_FIELD));
                final byte[] secondData = cursor.getBlobAsArray(DATA_FIELD);
                Assert.assertNull(secondData);

                Assert.assertTrue(cursor.next());

                Assert.assertFalse(cursor.isNull(DATA_FIELD));
                final byte[] lastData = cursor.getBlobAsArray(DATA_FIELD);
                Assert.assertNotNull(lastData);
                Assert.assertTrue(lastData.length > 0);

                Assert.assertFalse(cursor.next());
                Assert.assertTrue(cursor.eof());

                cursor.close();

                return null;
            }
        });
    }

    @Test
    public void tableDef() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE);

        final ISqlJetTableDef tableDef = table.getDefinition();

        Assert.assertNotNull(tableDef);

        final String tableName = tableDef.getName();

        Assert.assertNotNull(tableName);
        Assert.assertEquals(TABLE, tableName);

        final List<ISqlJetColumnDef> columns = tableDef.getColumns();

        Assert.assertNotNull(columns);
        Assert.assertEquals(4, columns.size());
    }

    @Test(expected = SqlJetException.class)
    public void insertNotNull() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE2);
        table.insert(null, null);
        Assert.assertTrue(false);
    }

    @Test
    public void insertFieldCountOK() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE2);
        table.insert(null, "test", "test");
    }

    @Test(expected = SqlJetException.class)
    public void insertFieldCountFail() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE2);
        table.insert(null, "test", "test", "test");
        Assert.assertTrue(false);
    }

    private void testEncoding(final SqlJetDb db, final String tableName, final String testString)
            throws SqlJetException {
        final ISqlJetTable table = db.getTable(tableName);
        Assert.assertNotNull(table);
        final long newRowId = table.insert(null, testString);
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor cursor = table.open();
                cursor.goTo(newRowId);
                final String stringField = cursor.getString(NAME_FIELD);
                Assert.assertEquals(testString, stringField);
                return null;
            }
        });
    }

    @Test
    public void encodingKOI8() throws SqlJetException, UnsupportedEncodingException {
        final String testKOI8 = new String(new byte[] { (byte) 0364, (byte) 0305, (byte) 0323, (byte) 0324 }, "koi8");
        testEncoding(dbCopy, TABLE, testKOI8);
    }

    @Test
    public void encodingUTF8() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF8 = new String(new byte[] { (byte) 0xD0, (byte) 0xA2, (byte) 0xD0, (byte) 0xB5,
                (byte) 0xD1, (byte) 0x81, (byte) 0xD1, (byte) 0x82 }, SqlJetEncoding.UTF8.getCharsetName());
        testEncoding(dbCopy, TABLE, testUTF8);
    }

    @Test
    public void encodingUTF16() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF16 = new String(new byte[] { (byte) 0xFF, (byte) 0xFE, (byte) 0x22, (byte) 0x04,
                (byte) 0x35, (byte) 0x04, (byte) 0x41, (byte) 0x04, (byte) 0x42, (byte) 0x04 }, SqlJetEncoding.UTF16
                .getCharsetName());
        testEncoding(dbCopy, TABLE, testUTF16);
    }

    @Test
    public void encoding2KOI8() throws SqlJetException, UnsupportedEncodingException {
        final String testKOI8 = new String(new byte[] { (byte) 0364, (byte) 0305, (byte) 0323, (byte) 0324 }, "koi8");
        testEncoding(db2Copy, TEST, testKOI8);
    }

    @Test
    public void encoding2UTF8() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF8 = new String(new byte[] { (byte) 0xD0, (byte) 0xA2, (byte) 0xD0, (byte) 0xB5,
                (byte) 0xD1, (byte) 0x81, (byte) 0xD1, (byte) 0x82 }, SqlJetEncoding.UTF8.getCharsetName());
        testEncoding(db2Copy, TEST, testUTF8);
    }

    @Test
    public void encoding2UTF16() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF16 = new String(new byte[] { (byte) 0xFF, (byte) 0xFE, (byte) 0x22, (byte) 0x04,
                (byte) 0x35, (byte) 0x04, (byte) 0x41, (byte) 0x04, (byte) 0x42, (byte) 0x04 }, SqlJetEncoding.UTF16
                .getCharsetName());
        testEncoding(db3Copy, TEST, testUTF16);
    }

    @Test
    public void encoding3KOI8() throws SqlJetException, UnsupportedEncodingException {
        final String testKOI8 = new String(new byte[] { (byte) 0364, (byte) 0305, (byte) 0323, (byte) 0324 }, "koi8");
        testEncoding(db3Copy, TEST, testKOI8);
    }

    @Test
    public void encoding3UTF8() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF8 = new String(new byte[] { (byte) 0xD0, (byte) 0xA2, (byte) 0xD0, (byte) 0xB5,
                (byte) 0xD1, (byte) 0x81, (byte) 0xD1, (byte) 0x82 }, SqlJetEncoding.UTF8.getCharsetName());
        testEncoding(db3Copy, TEST, testUTF8);
    }

    @Test
    public void encoding3UTF16() throws SqlJetException, UnsupportedEncodingException {
        final String testUTF16 = new String(new byte[] { (byte) 0xFF, (byte) 0xFE, (byte) 0x22, (byte) 0x04,
                (byte) 0x35, (byte) 0x04, (byte) 0x41, (byte) 0x04, (byte) 0x42, (byte) 0x04 }, SqlJetEncoding.UTF16
                .getCharsetName());
        testEncoding(db3Copy, TEST, testUTF16);
    }

    @Test
    public void indexAutoupdate1() throws SqlJetException {
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable table = dbCopy.getTable(TABLE);
                table.insert(null, "test1", 1);
                final ISqlJetCursor lookup = table.lookup("test1_name_index", "test1");
                Assert.assertFalse(lookup.eof());
                final String nameField = lookup.getString(1);
                Assert.assertNotNull(nameField);
                Assert.assertEquals("test1", nameField);
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void indexAutoupdate2() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE2);
        table.insert("test", "test");
        table.insert("test", "test");
        Assert.assertFalse(true);
    }

    @Test
    public void first() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTable table = dbCopy.getTable(TABLE);

                final ISqlJetCursor lookupFail = table.lookup(NAME_INDEX, "");

                Assert.assertFalse(lookupFail.first());
                Assert.assertTrue(lookupFail.eof());
                Assert.assertFalse(lookupFail.next());
                Assert.assertTrue(lookupFail.eof());
                Assert.assertFalse(lookupFail.next());
                Assert.assertTrue(lookupFail.eof());

                Assert.assertFalse(lookupFail.first());
                Assert.assertTrue(lookupFail.eof());
                Assert.assertFalse(lookupFail.next());
                Assert.assertTrue(lookupFail.eof());
                Assert.assertFalse(lookupFail.next());
                Assert.assertTrue(lookupFail.eof());

                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);

                Assert.assertTrue(lookup.first());
                Assert.assertFalse(lookup.eof());
                Assert.assertTrue(lookup.next());
                Assert.assertFalse(lookup.eof());
                Assert.assertFalse(lookup.next());
                Assert.assertTrue(lookup.eof());
                Assert.assertFalse(lookup.next());
                Assert.assertTrue(lookup.eof());

                Assert.assertTrue(lookup.first());
                Assert.assertFalse(lookup.eof());
                Assert.assertTrue(lookup.next());
                Assert.assertFalse(lookup.eof());
                Assert.assertFalse(lookup.next());
                Assert.assertTrue(lookup.eof());
                Assert.assertFalse(lookup.next());
                Assert.assertTrue(lookup.eof());

                return null;
            }
        });
    }

    @Test
    public void last() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTable table = dbCopy.getTable(TABLE);

                final ISqlJetCursor lookupFail = table.lookup(NAME_INDEX, "");

                Assert.assertFalse(lookupFail.last());
                Assert.assertTrue(lookupFail.eof());

                Assert.assertFalse(lookupFail.last());
                Assert.assertTrue(lookupFail.eof());

                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);

                Assert.assertTrue(lookup.last());
                Assert.assertFalse(lookup.eof());
                Assert.assertTrue(lookup.previous());
                Assert.assertFalse(lookup.eof());
                Assert.assertFalse(lookup.previous());

                return null;
            }
        });
    }

    @Test
    public void prev() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTable table = dbCopy.getTable(TABLE);

                final ISqlJetCursor lookupFail = table.lookup(NAME_INDEX, "");

                Assert.assertFalse(lookupFail.previous());
                Assert.assertTrue(lookupFail.eof());

                Assert.assertFalse(lookupFail.previous());
                Assert.assertTrue(lookupFail.eof());

                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);

                Assert.assertTrue(lookup.next());
                Assert.assertFalse(lookup.eof());
                Assert.assertTrue(lookup.previous());
                Assert.assertFalse(lookup.eof());
                Assert.assertFalse(lookup.previous());

                Assert.assertTrue(lookup.first());
                Assert.assertTrue(lookup.next());
                Assert.assertFalse(lookup.eof());
                Assert.assertTrue(lookup.previous());
                Assert.assertFalse(lookup.eof());
                Assert.assertFalse(lookup.previous());

                return null;
            }
        });
    }

    @Test
    public void insertByNames() throws SqlJetException {
        final Map<String, Object> values = new HashMap<String, Object>();
        values.put("name", "test1");
        values.put("value", 1);
        final ISqlJetTable table = dbCopy.getTable(TABLE);
        table.insertByFieldNames(values);
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup("test1_name_index", "test1");
                Assert.assertFalse(lookup.eof());
                final Object nameField = lookup.getValue("name");
                Assert.assertNotNull(nameField);
                Assert.assertEquals("test1", nameField);
                return null;
            }
        });
    }

    @Test
    public void updateByNames() throws SqlJetException {
        final Map<String, Object> values = new HashMap<String, Object>();
        values.put("name", "test1");
        values.put("value", 111);
        final ISqlJetTable table = dbCopy.getTable(TABLE);
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor open = table.open();
                open.updateByFieldNames(values);
                return null;
            }
        });
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup("test1_name_index", "test1");
                Assert.assertFalse(lookup.eof());
                final Object nameField = lookup.getValue("name");
                Assert.assertNotNull(nameField);
                Assert.assertEquals("test1", nameField);
                Assert.assertEquals(111L, lookup.getValue("value"));
                return null;
            }
        });
    }

    @Test
    public void updateByNamesSetNull() throws SqlJetException {
        final Map<String, Object> values = new HashMap<String, Object>();
        values.put("name", "zzz");
        values.put("value", null);
        final ISqlJetTable table = dbCopy.getTable(TABLE);
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor open = table.open();
                open.updateByFieldNames(values);
                return null;
            }
        });
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup("test1_name_index", "zzz");
                Assert.assertFalse(lookup.eof());
                Assert.assertNull(lookup.getValue("value"));
                return null;
            }
        });
    }

    @Test
    public void insertByNamesNull() throws SqlJetException {
        final ISqlJetTable table = dbCopy.getTable(TABLE);
        final Map<String, Object> values = new HashMap<String, Object>();
        values.put("name", "test1");
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup("test1_name_index", "test1");
                Assert.assertFalse(lookup.eof());
                final Object nameField = lookup.getValue("name");
                Assert.assertNotNull(nameField);
                Assert.assertEquals("test1", nameField);
                final Object valueField = lookup.getValue("value");
                Assert.assertNull(valueField);
                return null;
            }
        });
    }

    @Test
    public void repCacheInsertLong() throws SqlJetException {
        final ISqlJetTable table = repCacheDb.getTable(REP_CACHE_TABLE);
        repCacheDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final Random random = new Random();
                for (int i = 0; i < REPEATS_COUNT; i++) {
                    for (int y = 0; y < REPEATS_COUNT; y++) {
                        final String hash = String.valueOf(Math.abs(random.nextLong()));
                        ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), hash);
                        if (!lookup.first()) {
                            logger.info(i + " " + hash);
                            table.insert(hash, i, i, i, i);
                            break;
                        }
                    }
                }
                return null;
            }
        });
    }

    @Test
    public void repCacheInsertShort() throws SqlJetException {
        repCacheDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable table = repCacheDb.getTable(REP_CACHE_TABLE);
                final Random random = new Random();
                for (int i = 0; i < REPEATS_COUNT; i++) {
                    for (int y = 0; y < REPEATS_COUNT; y++) {
                        final String hash = String.valueOf(Math.abs(random.nextLong()));
                        ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), hash);
                        if (!lookup.first()) {
                            logger.info(i + " " + hash);
                            table.insert(hash, i, i, i, i);
                            break;
                        }
                    }
                }
                return null;
            }
        });
    }

    @Test
    public void testManyNamesOfRowid() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = dbCopy.getTable("test1").open();
                try {
                    c.goTo(1L);
                    Assert.assertFalse(c.eof());
                    Assert.assertEquals(1L, c.getInteger("ROWID"));
                    Assert.assertEquals(1L, c.getInteger("_ROWID_"));
                    Assert.assertEquals(1L, c.getInteger("OID"));
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void testUpdateByNamesWithPK() throws SqlJetException {
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = dbCopy.getTable("test1").open();
                c.goTo(1L);
                Assert.assertFalse(c.eof());
                Assert.assertEquals(1L, c.getInteger("id"));
                Assert.assertEquals("test", c.getString("name"));
                Map<String, Object> values = new HashMap<String, Object>();
                values.put("name", "mess");
                c.updateByFieldNames(values);
                Assert.assertEquals(1L, c.getInteger("id"));
                Assert.assertEquals("mess", c.getString("name"));
                c.close();
                return null;
            }
        });
    }

    private void createTableWithBlob() throws SqlJetException {
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table blobt (a blob)");
                return null;
            }
        });
    }

    private static final String BLOB_DATA = "8Mb";

    private void checkBlobWasAdded() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = dbCopy.getTable("blobt").open();
                Assert.assertFalse(c.eof());

                byte[] bytes = c.getBlobAsArray(0);
                Assert.assertNotNull(bytes);
                try {
                    Assert.assertEquals(BLOB_DATA, new String(bytes, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }

                bytes = c.getBlobAsArray("a");
                Assert.assertNotNull(bytes);
                try {
                    Assert.assertEquals(BLOB_DATA, new String(bytes, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }

                InputStream stream = c.getBlobAsStream(0);
                Assert.assertNotNull(stream);
                byte[] blob = null;
                try {
                    blob = new byte[stream.available()];
                    stream.read(blob);
                    stream.close();
                } catch (IOException e) {
                    Assert.fail();
                }
                try {
                    Assert.assertEquals(BLOB_DATA, new String(blob, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }

                stream = c.getBlobAsStream("a");
                Assert.assertNotNull(stream);
                blob = null;
                try {
                    blob = new byte[stream.available()];
                    stream.read(blob);
                    stream.close();
                } catch (IOException e) {
                    Assert.fail();
                }
                try {
                    Assert.assertEquals(BLOB_DATA, new String(blob, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }
                return null;
            }
        });
    }

    @Test
    public void testWriteBlobAsBytes() throws SqlJetException {
        createTableWithBlob();
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                try {
                    db.getTable("blobt").insert(BLOB_DATA.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }
                return null;
            }
        });
        checkBlobWasAdded();
    }

    @Test
    public void testWriteBlobAsStream() throws SqlJetException {
        createTableWithBlob();
        dbCopy.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                try {
                    byte[] blob = BLOB_DATA.getBytes("UTF-8");
                    db.getTable("blobt").insert(new ByteArrayInputStream(blob));
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }
                return null;
            }
        });
        checkBlobWasAdded();
    }

    @Test
    public void testLookupByRowIdPK() throws SqlJetException {
        dbCopy.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = dbCopy.getTable("test1");
                final ISqlJetCursor c1 = t.lookup(t.getPrimaryKeyIndexName(), 1);
                try {
                    Assert.assertFalse(c1.eof());
                    Assert.assertEquals(1L, c1.getInteger("id"));
                    Assert.assertEquals("test", c1.getString("name"));
                } finally {
                    c1.close();
                }
                final ISqlJetCursor c2 = t.lookup(t.getPrimaryKeyIndexName(), 2);
                try {
                    Assert.assertFalse(c2.eof());
                    Assert.assertEquals(2L, c2.getInteger("id"));
                    Assert.assertEquals(777L, c2.getInteger("value"));
                } finally {
                    c2.close();
                }
                return null;
            }
        });
    }

    @Test
    public void testDeleteRepcache() throws SqlJetException {
        repCacheDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable(REP_CACHE_TABLE);
                final ISqlJetCursor c = t.open();
                try {
                    while (!c.eof()) {
                        logger.info(String.format("%d", c.getRowId()));
                        c.delete();
                    }
                    Assert.assertFalse(c.first());
                    Assert.assertTrue(c.eof());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    @Test
    public void clear() throws Exception {
        repCacheDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable t = db.getTable(REP_CACHE_TABLE);
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertTrue(c.first());
                    Assert.assertFalse(c.eof());
                } finally {
                    c.close();
                }
                t.clear();
                final ISqlJetCursor c1 = t.open();
                try {
                    Assert.assertFalse(c1.first());
                    Assert.assertTrue(c1.eof());
                } finally {
                    c1.close();
                }
                return null;
            }
        });
    }

}
