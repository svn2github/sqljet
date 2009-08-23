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
import java.util.logging.Logger;

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

    private static final String TIME_LOGGER = "org.tmatesoft.sqljet.benchmarks.timeLogger";
    public static final String DB_FILE = "sqljet-test/db/rep-cache/rep-cache.db";
    public static final String WORK_PATH = null;
    //public static final String WORK_PATH = "F://";
    public static final String COPY_PREFIX = "copy";
    public static final String TABLE_NAME = "rep_cache";
    protected static final int COUNT = 1000;

    protected static final String[] LOCATE_HASHES = { "b1e2b2360e6c54142cd77e96297b665740c28705",
            "3bc460e40d0355624872d8efa2cc5940f98bd02d", "4ef3399d8342c53901f7b621be17241bed68f4a8" };

    protected File dbFile;

    protected interface Measure {
        void measure() throws Exception;
    }

    private static final Logger timeLogger = Logger.getLogger(TIME_LOGGER);

    @Before
    public void setUp() throws Exception {
        final File workPath = WORK_PATH != null ? new File(WORK_PATH) : null;
        dbFile = File.createTempFile("copy", null, workPath);
        copyFile(new File(DB_FILE), dbFile, true);
    }

    @After
    public void tearDown() throws Exception {
        if (dbFile != null) {
            dbFile.delete();
        }
    }

    private long getTime(Measure m) throws Exception {
        final long t = System.currentTimeMillis();
        m.measure();
        return System.currentTimeMillis() - t;
    }

    private void logTime(String name, long time) {
        timeLogger.info(String.format("%s %d", name, time));
    }

    protected void measure(String name, Measure m) throws Exception {
        logTime(name, getTime(m));
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

    @Test
    public abstract void locate() throws Exception;

}
