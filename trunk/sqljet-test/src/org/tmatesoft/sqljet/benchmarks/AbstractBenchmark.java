/**
 * AbstractBenchmark.java
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
package org.tmatesoft.sqljet.benchmarks;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class AbstractBenchmark extends AbstractDataCopyTest {

    public static final String DB_FILE = "sqljet-test/db/rep-cache/rep-cache.db";
    public static final String TABLE_NAME = "rep_cache";
    protected static final int COUNT = 1000;

    protected File dbFile;

    @Before
    public void setUp() throws Exception {
        dbFile = copyFile(new File(DB_FILE), true);
    }

    @After
    public void tearDown() throws Exception {
        if (dbFile != null) {
            dbFile.delete();
        }
    }

    @Test
    public abstract void selectAll() throws Exception;

    @Test
    public abstract void updateAll() throws Exception;

    @Test
    public abstract void deleteAll() throws Exception;

    @Test
    public abstract void insertRandoms() throws Exception;

    @Test
    public abstract void clear() throws Exception;
    
}
