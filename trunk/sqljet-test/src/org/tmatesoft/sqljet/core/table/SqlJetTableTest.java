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
import java.nio.ByteBuffer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableTest extends AbstractDataCopyTest {

    public static final String TABLE_TEST = "SqlJetTableTest";

    public static final String DB = SqlJetUtility.getSysProp(TABLE_TEST + ".DB", "sqljet-test/db/testdb.sqlite");

    public static final String TABLE = SqlJetUtility.getSysProp(TABLE_TEST + ".TABLE", "test1");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(TABLE_TEST + ".DELETE_COPY", true);

    private static final String NAME_INDEX = "test1_name_index";

    private static final int DATA_FIELD = 3;

    private static final int NAME_FIELD = 1;

    private static final String TEST = "test";

    private File fileDb = new File(DB);
    private File fileDbCopy;

    private SqlJetDb db;
    private SqlJetDb dbCopy;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        fileDbCopy = copyFile(fileDb, DELETE_COPY);
        db = SqlJetDb.open(fileDb, false);
        dbCopy = SqlJetDb.open(fileDbCopy, true);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            dbCopy.close();
        } finally {
            db.close();
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
                final boolean deleteFirst = nameIndex.delete(table.getRowId(),TEST);
                Assert.assertTrue(deleteFirst);
                
                Assert.assertTrue(table.next());
                final boolean deleteSecondFail = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertFalse(deleteSecondFail);

                Assert.assertTrue(table.next());
                final boolean deleteSecond = nameIndex.delete(table.getRowId(), TEST);
                Assert.assertTrue(deleteSecond);
                
                final boolean deleteLast = nameIndex.delete(table.getRowId(),TEST);
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

}
