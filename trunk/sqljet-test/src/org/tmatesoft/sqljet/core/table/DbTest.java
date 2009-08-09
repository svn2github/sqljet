/**
 * DbTest.java
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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.table;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class DbTest extends AbstractNewDbTest {

    @Test
    public void testCloseTwice() throws SqlJetException {
        Assert.assertTrue(db.isOpen());
        db.close();
        Assert.assertFalse(db.isOpen());
        db.close();
    }

    @Test(expected = SqlJetException.class)
    public void testClose() throws SqlJetException {
        Assert.assertTrue(db.isOpen());
        db.close();
        Assert.assertFalse(db.isOpen());
        db.createTable("create table t(a integer primary key, b integer)");
    }

    @Test(expected = SqlJetException.class)
    public void testCantOpen() throws SqlJetException {
        final SqlJetDb db1 = SqlJetDb.open(new File("x:/cantopen"), false);
        if (db1 != null) {
            db1.close();
        }
    }
}
