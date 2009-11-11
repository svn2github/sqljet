/**
 * MultiThreadingTest.java
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
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MultiThreadingTest extends AbstractNewDbTest {

    private static final int TIMEOUT = 1000;
    private static final String TABLE_NAME = "t";
    private static final String CREATE_TABLE = String.format("create table %s(a integer primary key, b integer)",
            TABLE_NAME);

    @Override
    public void setUp() throws Exception {
        super.setUp();
        db.createTable(CREATE_TABLE);
        db.getTable(TABLE_NAME).insert(1, 1);
    }

    public static abstract class WorkThread implements Callable<Object> {

        protected static final ExecutorService threadPool = Executors.newCachedThreadPool();

        protected final String threadName;

        protected boolean run = true;
        protected Future<?> result;

        public WorkThread(final String threadName) {
            this.threadName = threadName;
        }

        public Future<?> submit() {
            return this.result = threadPool.submit(this);
        }

        public Future<?> getResult() {
            return result;
        }

        public Object get() throws InterruptedException, ExecutionException {
            return result.get();
        }

        public static void shutdown() {
            threadPool.shutdown();
        }

        public void kill() {
            this.run = false;
        }

        public Object call() throws Exception {
            setUp();
            final String defaultThreadName = Thread.currentThread().getName();
            try {
                Thread.currentThread().setName(threadName);
                while (run) {
                    synchronized (threadPool) {
                        work();
                    }
                }
            } finally {
                try {
                    tearDown();
                } finally {
                    Thread.currentThread().setName(defaultThreadName);
                }
            }
            return null;
        }

        protected void setUp() throws Exception {
        }

        protected void tearDown() throws Exception {

        }

        protected abstract void work() throws Exception;

        public static void exec(int timeout, final WorkThread[] threads) throws Exception {
            try {
                for (final WorkThread thread : threads) {
                    thread.submit();
                }
                Thread.sleep(timeout);
            } finally {
                for (final WorkThread thread : threads) {
                    thread.kill();
                }
            }
            for (final WorkThread thread : threads) {
                thread.get();
            }
        }

    }

    public static abstract class DbThread extends WorkThread {

        protected final File file;
        protected SqlJetDb db;

        public DbThread(final File file, final String threadName) {
            super(threadName);
            this.file = file;
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
            this.db = SqlJetDb.open(file, true);
        }

        @Override
        protected void tearDown() throws Exception {
            if (db != null) {
                db.close();
            }
            super.tearDown();
        }

    }

    public static abstract class TableThread extends DbThread {

        protected final String tableName;
        protected ISqlJetTable table;

        public TableThread(final File file, final String threadName, final String tableName) {
            super(file, threadName);
            this.tableName = tableName;
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
            table = db.getTable(tableName);
        }

    }

    public static class WriteThread extends TableThread {

        protected Random random = new Random();

        public WriteThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void work() throws Exception {
            table.insertOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
        }

    }

    public static class ReadThread extends TableThread {

        public ReadThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void work() throws Exception {
            final ISqlJetCursor cursor = table.open();
            try {
                do {
                    final Object b = cursor.getValue("b");
                    Assert.assertNotNull(b);
                } while (cursor.next());
            } finally {
                cursor.close();
            }
        }
    }

    public static class LongReadThread extends TableThread {

        protected ISqlJetCursor cursor;

        public LongReadThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        protected void setUp() throws Exception {
            super.setUp();
            cursor = table.open();
        }

        @Override
        protected void tearDown() throws Exception {
            try {
                cursor.close();
            } finally {
                super.tearDown();
            }
        }

        @Override
        protected void work() throws Exception {
            for (cursor.first(); !cursor.eof(); cursor.next()) {
                final Object b = cursor.getValue("b");
                Assert.assertNotNull(b);
            }
        }
    }

    public static class LongWriteThread extends TableThread {

        protected Random random = new Random();

        protected ISqlJetCursor cursor;

        public LongWriteThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
            cursor = table.open();
        }

        @Override
        protected void tearDown() throws Exception {
            try {
                cursor.close();
            } finally {
                super.tearDown();
            }
        }

        @Override
        protected void work() throws Exception {
            for (cursor.first(); !cursor.eof(); cursor.next()) {
                cursor.updateOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
            }
        }
    }

    @Test
    public void writers() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new WriteThread(file, "writer1", TABLE_NAME),
                new WriteThread(file, "writer2", TABLE_NAME) });
    }

    @Test
    public void readers() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new ReadThread(file, "reader1", TABLE_NAME),
                new ReadThread(file, "reader2", TABLE_NAME) });
    }

    @Test
    public void readWrite() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new ReadThread(file, "reader1", TABLE_NAME),
                new ReadThread(file, "reader2", TABLE_NAME), new WriteThread(file, "writer1", TABLE_NAME),
                new WriteThread(file, "writer2", TABLE_NAME) });
    }

    @Test
    public void longReaders() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongReadThread(file, "reader1", TABLE_NAME),
                new LongReadThread(file, "reader2", TABLE_NAME) });
    }

    @Test
    public void writeLongReaders() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongReadThread(file, "reader1", TABLE_NAME),
                new WriteThread(file, "writer1", TABLE_NAME) });
    }

    @Test(expected=ExecutionException.class)
    public void longWrite() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongWriteThread(file, "writer1", TABLE_NAME),
                new LongWriteThread(file, "writer2", TABLE_NAME) });
    }

    @Test
    public void longWriteLongReaders() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongReadThread(file, "reader1", TABLE_NAME),
                new LongWriteThread(file, "writer1", TABLE_NAME) });
    }

}
