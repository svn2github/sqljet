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
 */
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.SqlJetIndex;
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

            public Object runWithLock() throws SqlJetException {

                final SqlJetTable table = dbCopy.openTable(TABLE);
                final SqlJetIndex nameIndex = dbCopy.openIndex(NAME_INDEX);

                final long rowFirst = nameIndex.lookup(false, TEST);
                Assert.assertTrue(rowFirst != 0);
                final boolean gotoFirst = table.goToRow(rowFirst);
                Assert.assertTrue(gotoFirst);
                final boolean firstNull = table.isNull(NAME_FIELD);
                Assert.assertFalse(firstNull);
                final SqlJetValueType firstType = table.getFieldType(NAME_FIELD);
                Assert.assertTrue(firstType == SqlJetValueType.TEXT);
                final String firstName = table.getString(NAME_FIELD);
                Assert.assertNotNull(firstName);
                Assert.assertEquals(TEST, firstName);

                final long rowSecond = nameIndex.lookup(true, TEST);
                Assert.assertTrue(rowSecond != 0);
                Assert.assertTrue(rowSecond != rowFirst);
                final boolean gotoSecond = table.goToRow(rowSecond);
                Assert.assertTrue(gotoSecond);
                final boolean secondNull = table.isNull(NAME_FIELD);
                Assert.assertFalse(secondNull);
                final SqlJetValueType secondType = table.getFieldType(NAME_FIELD);
                Assert.assertTrue(secondType == SqlJetValueType.TEXT);
                final String secondName = table.getString(NAME_FIELD);
                Assert.assertNotNull(secondName);
                Assert.assertEquals(TEST, secondName);

                table.close();
                nameIndex.close();

                return null;

            }
        });
    }

    @Test
    public void indexDelete() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE);
                final SqlJetIndex nameIndex = dbCopy.openIndex(NAME_INDEX);

                Assert.assertTrue(table.first());
                final boolean deleteFirst = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertTrue(deleteFirst);

                Assert.assertTrue(table.next());
                final boolean deleteSecondFail = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertFalse(deleteSecondFail);

                Assert.assertTrue(table.next());
                final boolean deleteSecond = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertTrue(deleteSecond);

                final boolean deleteLast = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertFalse(deleteLast);

                final long rowFirst = nameIndex.lookup(false, TEST);
                Assert.assertTrue(rowFirst == 0);

                dbCopy.commit();

                nameIndex.close();

                return null;

            }
        });
    }

    @Test
    public void readBlob() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                final SqlJetTable table = dbCopy.openTable(TABLE);

                Assert.assertTrue(table.first());

                Assert.assertFalse(table.isNull(DATA_FIELD));
                final ByteBuffer firstData = table.getBlob(DATA_FIELD);
                Assert.assertNotNull(firstData);
                Assert.assertTrue(firstData.remaining() > 0);

                Assert.assertTrue(table.next());

                Assert.assertTrue(table.isNull(DATA_FIELD));
                final ByteBuffer secondData = table.getBlob(DATA_FIELD);
                Assert.assertNull(secondData);

                Assert.assertTrue(table.next());

                Assert.assertFalse(table.isNull(DATA_FIELD));
                final ByteBuffer lastData = table.getBlob(DATA_FIELD);
                Assert.assertNotNull(lastData);
                Assert.assertTrue(lastData.remaining() > 0);

                Assert.assertFalse(table.next());
                Assert.assertTrue(table.eof());

                table.close();

                return null;

            }
        });
    }

    @Test
    public void tableDef() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                final SqlJetTable table = dbCopy.openTable(TABLE);

                final ISqlJetTableDef tableDef = table.getTableDef();

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

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE2);

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

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE2);

                table.insert("test", "test");

                dbCopy.commit();

                return null;

            }
        });

    }

    @Test(expected = SqlJetException.class)
    public void insertFieldCountFail() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE2);

                table.insert("test", "test", "test");

                dbCopy.rollback();

                Assert.assertTrue(false);

                return null;

            }
        });

    }

    /**
     * @param testString
     * @throws SqlJetException
     */
    private void testEncoding(final SqlJetDb db, final String tableName, final String testString)
            throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                db.beginTransaction();

                final SqlJetTable table = db.openTable(tableName);
                Assert.assertNotNull(table);

                final long newRowId = table.insert(testString);

                db.commit();

                table.goToRow(newRowId);
                final String stringField = table.getString(NAME_FIELD);
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

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE);

                table.insert("test1", 1);
                dbCopy.commit();
                
                final SqlJetIndex nameIndex = dbCopy.openIndex("test1_name_index");
                final long lookup = nameIndex.lookup(false, "test1");
                Assert.assertTrue(lookup!=0);
                
                final boolean goToRow = table.goToRow(lookup);
                Assert.assertTrue(goToRow);
                
                final String nameField = table.getString(1);
                Assert.assertNotNull(nameField);
                Assert.assertEquals("test1",nameField);

                return null;

            }
        });

    }

    @Test(expected=SqlJetException.class)
    public void indexAutoupdate2() throws SqlJetException {

        dbCopy.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                dbCopy.beginTransaction();

                final SqlJetTable table = dbCopy.openTable(TABLE2);

                table.insert("test", "test");
                table.insert("test", "test");

                dbCopy.commit();
                
                Assert.assertFalse(true);

                return null;

            }
        });

    }
    
    
}
