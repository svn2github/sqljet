/**
 * AbstractBenchmark.java
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
package org.tmatesoft.sqljet.benchmarks;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class AbstractBenchmark extends AbstractDataCopyTest {

    private static final String SQL_JET_BENCHMARK_TIME_LOG = "SqlJetBenchmark.TimeLog";
    public static final String DB_FILE = "src/test/data/db/rep-cache/rep-cache.db";
    public static final String WORK_PATH = null; // "F:"
    public static final String COPY_PREFIX = "copy";
    public static final String TABLE_NAME = "rep_cache";
    protected static final int SCALE_FACTOR = SqlJetUtility.getIntSysProp("SqlJetBenchmark.ScaleFactor", 1);
    protected static final int COUNT = 1000;

    protected static final String[] LOCATE_HASHES = { "b1e2b2360e6c54142cd77e96297b665740c28705",
            "3bc460e40d0355624872d8efa2cc5940f98bd02d", "4ef3399d8342c53901f7b621be17241bed68f4a8" };

    protected File dbFile;

    private boolean warmUp = false;

    protected interface Measure {
        void measure() throws Exception;
    }

    static private Logger timeLogger;

    @BeforeClass
    static public void setUpClass() throws Exception {
        timeLogger = Logger.getAnonymousLogger();
        if (!SqlJetUtility.getBoolSysProp(SQL_JET_BENCHMARK_TIME_LOG, false)) {
            timeLogger.setLevel(Level.OFF);
        }
    }

    @Before
    public void setUp() throws Exception {
        final File workPath = WORK_PATH != null ? new File(WORK_PATH) : null;
        dbFile = File.createTempFile("copy", null, workPath);
        copyFile(new File(DB_FILE), dbFile, true);
    }

    @After
    public void tearDown() throws Exception {
        if (dbFile != null) {
            SqlJetFileUtil.deleteFile(dbFile);
        }
    }

    private long getTime(Measure m) throws Exception {
        final long t = System.currentTimeMillis();
        for (int i = 0; i < SCALE_FACTOR; i++) {
            m.measure();
        }
        return System.currentTimeMillis() - t;
    }

    private void logTime(String name, long time) {
        timeLogger.info(String.format("%s %d", name, time));
    }

    protected void measure(String name, Measure m) throws Exception {
        if (!warmUp) {
            logTime(name, getTime(m));
        } else {
            m.measure(); // just warm up
        }
    }

    @Test
    public abstract void nothing() throws Exception;

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

    private void runTests() throws Exception {

        setUp();
        nothing();
        tearDown();

        setUp();
        selectAll();
        tearDown();

        setUp();
        updateAll();
        tearDown();

        setUp();
        deleteAll();
        tearDown();

        setUp();
        insertRandoms();
        tearDown();

        setUp();
        clear();
        tearDown();

        setUp();
        locate();
        tearDown();

    }

    protected void warmUp() throws Exception {
        warmUp = true;
        try {
            runTests();
        } finally {
            warmUp = false;
        }
    }

}
