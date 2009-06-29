/**
 * SqlJetTableTest.java
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
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableTest extends AbstractDataCopyTest {

    public static final String TABLE_TEST = "SqlJetTableTest";

    public static final String DB = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "sqljet-test/db/testdb.sqlite");

    public static final String DB2 = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "sqljet-test/db/test2.sqlite");
    public static final String DB3 = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "sqljet-test/db/test3.sqlite");

    public static final String TABLE = SqlJetUtility.getSysProp(TABLE_TEST + ".TABLE", "test1");
    public static final String TABLE2 = SqlJetUtility.getSysProp(TABLE_TEST + ".TABLE", "test2");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(TABLE_TEST + ".DELETE_COPY", true);

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

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        fileDbCopy = copyFile(fileDb, DELETE_COPY);
        file2DbCopy = copyFile(file2Db, DELETE_COPY);
        file3DbCopy = copyFile(file3Db, DELETE_COPY);
        dbCopy = SqlJetDb.open(fileDbCopy, true);
        db2Copy = SqlJetDb.open(file2DbCopy, true);
        db3Copy = SqlJetDb.open(file3DbCopy, true);
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
                if (null != db3Copy)
                    db3Copy.close();
            }
        }
    }

    @Test
    public void indexLookupNext() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);

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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE);
                final ISqlJetCursor lookup = table.lookup(NAME_INDEX, TEST);
                Assert.assertTrue(!lookup.eof());

                lookup.delete();
                Assert.assertTrue(lookup.next());
                lookup.delete();
                Assert.assertTrue(lookup.eof());

                dbCopy.commit();
                lookup.close();

                return null;

            }
        });
    }

    @Test
    public void readBlob() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);
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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);

                final ISqlJetTableDef tableDef = table.getDefinition();

                Assert.assertNotNull(tableDef);

                final String tableName = tableDef.getName();

                Assert.assertNotNull(tableName);
                Assert.assertEquals(TABLE, tableName);

                final List<ISqlJetColumnDef> columns = tableDef.getColumns();

                Assert.assertNotNull(columns);
                Assert.assertEquals(4, columns.size());

                return null;

            }
        });

    }

    @Test(expected = SqlJetException.class)
    public void insertNotNull() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE2);

                table.insert(null, null);

                dbCopy.rollback();

                Assert.assertTrue(false);

                return null;

            }
        });

    }

    @Test
    public void insertFieldCountOK() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE2);

                table.insertAutoId("test", "test");

                dbCopy.commit();

                return null;

            }
        });

    }

    @Test(expected = SqlJetException.class)
    public void insertFieldCountFail() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE2);

                table.insertAutoId("test", "test", "test");

                dbCopy.rollback();

                Assert.assertTrue(false);

                return null;

            }
        });

    }

    private void testEncoding(final SqlJetDb db, final String tableName, final String testString)
            throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                db.beginTransaction();

                final SqlJetTable table = db.getTable(tableName);
                Assert.assertNotNull(table);

                final long newRowId = table.insertAutoId(testString);

                db.commit();

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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE);

                table.insertAutoId("test1", 1);
                dbCopy.commit();

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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE2);

                table.insert("test", "test");
                table.insert("test", "test");

                dbCopy.commit();

                Assert.assertFalse(true);

                return null;

            }
        });

    }

    @Test
    public void first() throws SqlJetException {
        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);

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
        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);

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
        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                final SqlJetTable table = dbCopy.getTable(TABLE);

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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE);

                final Map<String, Object> values = new HashMap<String, Object>();
                values.put("name", "test1");
                values.put("value", 1);

                table.insertAutoId(values);
                dbCopy.commit();

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

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE);
                final ISqlJetCursor open = table.open();

                final Map<String, Object> values = new HashMap<String, Object>();
                values.put("name", "test1");
                values.put("value", 1);

                open.updateByFieldNames(values);
                dbCopy.commit();

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
    public void insertByNamesNull() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.getTable(TABLE);

                final Map<String, Object> values = new HashMap<String, Object>();
                values.put("name", "test1");

                table.insertAutoId(values);
                dbCopy.commit();

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

    
}
