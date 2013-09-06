/**
 * SqlJetMapTest.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.map;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMapTest {

    protected File file;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        file = File.createTempFile("test", null);
        file.deleteOnExit();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        if (file != null) {
            SqlJetFileUtil.deleteFile(file);
        }
    }

    @Test
    public void testMapTable() throws SqlJetException {

        final SqlJetMapDb dbm = SqlJetMapDb.open(file, true);

        try {

            final ISqlJetMap map = dbm.getMap(dbm.createMap("map1").getMapName());
            Assert.assertNotNull(map);
            final ISqlJetMapTable mapTable = map.getMapTable();
            Assert.assertNotNull(mapTable);

            final String hello = "Hello world!";
            final String bye = "Good bye!";

            final Long[] keys = new Long[] { mapTable.put(0, hello), mapTable.put(0, bye) };

            Assert.assertNotNull(keys);
            Assert.assertTrue(keys.length == 2);
            Assert.assertNotNull(keys[0]);
            Assert.assertNotNull(keys[1]);
            Assert.assertNotNull(keys[0] > 0);
            Assert.assertNotNull(keys[1] > 0);

            try {
                final Object[] value = mapTable.get(keys[0]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(hello, value[0]);
            } finally {

            }

            try {
                final Object[] value = mapTable.get(keys[1]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(bye, value[0]);
            } finally {

            }

            mapTable.put(keys[0], bye);
            mapTable.put(keys[1], hello);

            try {
                final Object[] value = mapTable.get(keys[0]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(bye, value[0]);

            } finally {

            }

            try {
                final Object[] value = mapTable.get(keys[1]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(hello, value[0]);
            } finally {

            }

        } finally {
            dbm.close();
        }

    }

    @Test
    public void testMap() throws SqlJetException {

        final SqlJetMapDb dbm = SqlJetMapDb.open(file, true);

        try {

            final ISqlJetMap map = dbm.getMap(dbm.createMap("map1").getMapName());
            Assert.assertNotNull(map);

            final Object[] hello = new Object[] { "Hello world!" };
            final Object[] bye = new Object[] { "Good bye!" };

            map.put(hello, bye);
            map.put(bye, hello);

            final Object[] bye1 = map.get(hello);
            final Object[] hello1 = map.get(bye);

            Assert.assertNotNull(hello1);
            Assert.assertArrayEquals(hello, hello1);
            Assert.assertNotNull(bye1);
            Assert.assertArrayEquals(bye, bye);

        } finally {
            dbm.close();
        }

    }

    @Test
    public void testMapCursor() throws SqlJetException {

        final SqlJetMapDb dbm = SqlJetMapDb.open(file, true);

        try {

            final ISqlJetMap map = dbm.getMap(dbm.createMap("map1").getMapName());
            Assert.assertNotNull(map);

            final Object[] hello = new Object[] { "Hello world!" };
            final Object[] bye = new Object[] { "Good bye!" };

            dbm.runWriteTransaction(new ISqlJetMapTransaction() {
                public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                    map.put(hello, bye);
                    map.put(bye, hello);
                    return null;
                }
            });

            dbm.runReadTransaction(new ISqlJetMapTransaction() {
                public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                    final ISqlJetMapCursor cursor = map.getCursor();
                    try {
                        for (cursor.first(); !cursor.eof(); cursor.next()) {
                            final Object[] key = cursor.getKey();
                            final Object[] value = cursor.getValue();
                            Assert.assertNotNull(key);
                            Assert.assertNotNull(value);
                        }
                    } finally {
                        cursor.close();
                    }
                    return null;
                }
            });

        } finally {
            dbm.close();
        }

    }

}
