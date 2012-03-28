/**
 * ReadOnlyBug.java
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

import java.io.File;
import java.util.logging.Level;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetAbstractLoggedTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class ReadOnlyBugTest extends SqlJetAbstractLoggedTest {

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
    public void testReadOnlyBug() throws SqlJetException {

        final SqlJetDb db1 = SqlJetDb.open(file, true);
        try {
            db1.createTable("create table t(a integer primary key, b text)");
        } finally {
            db1.close();
        }

        try {
            final SqlJetDb db2 = SqlJetDb.open(new File("doesnt/exists", file.getName()), false);
            db2.close();
        } catch (SqlJetException e) {
            logger.log(Level.INFO, "Tries to open unexisted file", e);
        }

        final SqlJetDb db3 = SqlJetDb.open(file, true);
        try {
            db3.createTable("create table t1(a integer primary key, b text)");
        } finally {
            db3.close();
        }

    }

}
