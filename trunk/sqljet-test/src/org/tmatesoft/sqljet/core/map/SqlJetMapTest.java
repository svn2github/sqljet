/**
 * SqlJetMapTest.java
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
package org.tmatesoft.sqljet.core.map;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;

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
            file.delete();
        }
    }

    @Test
    public void testMap() throws SqlJetException {

        final SqlJetMapDb dbm = SqlJetMapDb.open(file, true);

        try {

            final ISqlJetMapTable map = dbm.getMapTable(dbm.createMapTable("map1").getMapTableName());
            Assert.assertNotNull(map);

            final String hello = "Hello world!";
            final String bye = "Good bye!";

            final Long[] keys = new Long[] { map.put(0, hello), map.put(0, bye) };

            Assert.assertNotNull(keys);
            Assert.assertTrue(keys.length == 2);
            Assert.assertNotNull(keys[0]);
            Assert.assertNotNull(keys[1]);
            Assert.assertNotNull(keys[0] > 0);
            Assert.assertNotNull(keys[1] > 0);

            try {
                final Object[] value = map.get(keys[0]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(hello, value[0]);
            } finally {

            }

            try {
                final Object[] value = map.get(keys[1]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(bye, value[0]);
            } finally {

            }

            map.put(keys[0], bye);
            map.put(keys[1], hello);

            try {
                final Object[] value = map.get(keys[0]);
                Assert.assertNotNull(value);
                Assert.assertTrue(value.length > 0);
                Assert.assertNotNull(value[0]);
                Assert.assertEquals(bye, value[0]);

            } finally {

            }

            try {
                final Object[] value = map.get(keys[1]);
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
}
