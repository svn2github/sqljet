/**
 * SqlJetTableThreadsTest.java
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetTableThreadsTest extends AbstractDataCopyTest {

    public static final String THREADS_TEST = "SqlJetTableThreadsTest";

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(THREADS_TEST + ".REP_CACHE_DB",
            "sqljet-test/db/rep-cache/rep-cache.db");
    public static final String REP_CACHE_TABLE = SqlJetUtility.getSysProp(THREADS_TEST + ".REP_CACHE_TABLE",
            "rep_cache");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(THREADS_TEST + ".DELETE_COPY", true);

    private static final int PASS_COUNT = SqlJetUtility.getIntSysProp(THREADS_TEST + ".PASS_COUNT", 100);

    private File dbFile;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        dbFile = copyFile(new File(REP_CACHE_DB), DELETE_COPY);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    protected <T> Future<T> execThread(final Callable<T> thread) {
        return Executors.newCachedThreadPool().submit(thread);
    }

    private abstract class Worker implements Callable<Object> {

        protected File dbFile;
        protected String workerName;
        protected boolean write;
        protected SqlJetDb db;
        protected ISqlJetTable table;

        public Worker(File dbFile, String workerName, boolean write) {
            this.dbFile = dbFile;
            this.workerName = workerName;
            this.write = write;
        }

        public Object call() throws Exception {
            final String threadName = Thread.currentThread().getName();
            try {
                Thread.currentThread().setName(workerName);
                db = SqlJetDb.open(dbFile, write);
                try {
                    return db.runWithLock(new ISqlJetRunnableWithLock() {
                        public Object runWithLock(SqlJetDb db) throws SqlJetException {
                            table = db.getTable(REP_CACHE_TABLE);
                            return work();
                        }
                    });
                } finally {
                    db.close();
                }
            } finally {
                Thread.currentThread().setName(threadName);
            }
        }

        abstract protected Object work() throws SqlJetException;
    }

    abstract private class SleepWorker extends Worker {

        public SleepWorker(File dbFile, String workerName, boolean write) {
            super(dbFile, workerName, write);
        }

        @Override
        protected Object work() throws SqlJetException {
            int pass = 0;
            for (final ISqlJetCursor open = table.open(); !open.eof(); open.next()) {
                pass++;
                beforeSleep(open);
                sleep();
                afterSleep(open);
                if (PASS_COUNT != 0 && pass == PASS_COUNT) {
                    break;
                }
            }
            return Boolean.TRUE;

        }

        protected void sleep() throws SqlJetException {
            try {
                Thread.sleep(0, Math.round((float) Math.random() * 2));
            } catch (InterruptedException e) {
                throw new SqlJetException(SqlJetErrorCode.ABORT);
            }
        }

        abstract protected void beforeSleep(ISqlJetCursor cursor) throws SqlJetException;

        abstract protected void afterSleep(ISqlJetCursor cursor) throws SqlJetException;

    }


    public static Map<String, Object> getValuesWithFieldNames(ISqlJetCursor cursor) throws SqlJetException {
        final Map<String, Object> map = new LinkedHashMap<String, Object>();
        for (int i = 0; i < cursor.getFieldsCount(); i++) {
            Object value = cursor.getValue(i);
            map.put(String.valueOf(i), value);
        }
        return map;
    }

    private class Reader extends SleepWorker {

        public Reader(File dbFile, String readerName) {
            super(dbFile, readerName, false);
        }

        @Override
        protected void beforeSleep(ISqlJetCursor cursor) throws SqlJetException {
            final Map<String, Object> values = getValuesWithFieldNames(cursor);
            boolean first = true;
            final StringBuilder b = new StringBuilder();
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b.append(first ? " " : ", ");
                b.append(entry.getKey()).append(" : ").append(entry.getValue());
                if (first)
                    first = false;
            }
            logger.info(String.format("[%s] %s", workerName, b.toString()));
        }

        @Override
        protected void afterSleep(ISqlJetCursor arg0) throws SqlJetException {
        }

        @Override
        protected void sleep() throws SqlJetException {
        }

    }

    private class Writer extends SleepWorker {

        public Writer(File dbFile, String writerName) {
            super(dbFile, writerName, true);
        }

        @Override
        protected void beforeSleep(ISqlJetCursor cursor) throws SqlJetException {
            final Map<String, Object> values = getValuesWithFieldNames(cursor);
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                if (!"hash".equals(entry.getKey())) {
                    if (null != entry.getValue() && entry.getValue() instanceof Long) {
                        entry.setValue(((Long) entry.getValue()) + 1);
                    }
                }
            }

            for (boolean exit = false; !exit;)
                try {
                    db.beginTransaction();
                    exit = true;
                } catch (SqlJetException e) {
                    if (e.getErrorCode() != SqlJetErrorCode.BUSY) {
                        throw e;
                    }
                }

            final Object hash = values.get("hash");
            try {
                table.lookup(table.getPrimaryKeyIndexName(), hash).updateByFieldNames(values);
                db.commit();
                logger.info(String.format("[%s] commit: %s", workerName, hash));
            } catch (SqlJetException e) {
                db.rollback();
                logger.info(String.format("[%s] roolback: %s", workerName, e.getMessage()));
            }
        }

        @Override
        protected void afterSleep(ISqlJetCursor arg0) throws SqlJetException {
        }

        @Override
        protected void sleep() throws SqlJetException {
        }

    }

    private class WriteCloser extends Writer {

        public WriteCloser(File dbFile, String writerName) {
            super(dbFile, writerName);
        }

        @Override
        protected Object work() throws SqlJetException {
            for (final ISqlJetCursor open = table.open(); !open.eof(); /*
                                                                        * open.next
                                                                        * ()
                                                                        */) {
                beforeSleep(open);
                sleep();
                afterSleep(open);
                break;
            }
            return Boolean.TRUE;

        }

    }

    @Test
    public void read() throws SqlJetException, InterruptedException, ExecutionException {

        final Future<Object> reader1 = execThread(new Reader(dbFile, "reader1"));
        final Future<Object> reader2 = execThread(new Reader(dbFile, "reader2"));
        final Future<Object> reader3 = execThread(new Reader(dbFile, "reader3"));
        final Future<Object> reader4 = execThread(new Reader(dbFile, "reader4"));

        Assert.assertTrue(reader1.get() == Boolean.TRUE);
        Assert.assertTrue(reader2.get() == Boolean.TRUE);
        Assert.assertTrue(reader3.get() == Boolean.TRUE);
        Assert.assertTrue(reader4.get() == Boolean.TRUE);

    }

    @Test
    public void write() throws SqlJetException, InterruptedException, ExecutionException {

        final Future<Object> writer1 = execThread(new Writer(dbFile, "writer1"));
        final Future<Object> writer2 = execThread(new Writer(dbFile, "writer2"));

        Assert.assertTrue(writer1.get() == Boolean.TRUE);
        Assert.assertTrue(writer2.get() == Boolean.TRUE);

    }

    @Test
    public void readWrite() throws SqlJetException, InterruptedException, ExecutionException {

        final Future<Object> writer1 = execThread(new Writer(dbFile, "writer1"));
        final Future<Object> reader1 = execThread(new Reader(dbFile, "reader1"));
        final Future<Object> reader2 = execThread(new Reader(dbFile, "reader2"));

        Assert.assertTrue(writer1.get() == Boolean.TRUE);
        Assert.assertTrue(reader1.get() == Boolean.TRUE);
        Assert.assertTrue(reader2.get() == Boolean.TRUE);

    }

    @Test
    public void writeClose() throws SqlJetException, InterruptedException, ExecutionException {

        final Future<Object> writer1 = execThread(new Writer(dbFile, "writer1"));
        Thread.sleep(10);
        final Future<Object> writeCloser = execThread(new WriteCloser(dbFile, "writeCloser"));

        Assert.assertTrue(writer1.get() == Boolean.TRUE);
        Assert.assertTrue(writeCloser.get() == Boolean.TRUE);

    }

}
