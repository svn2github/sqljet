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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MultiThreadingTest extends AbstractNewDbTest {

    private static final int TIMEOUT = 1000;
    private static final String TABLE_NAME = "t";
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(a integer primary key, b integer)";

    @Override
    public void setUp() throws Exception {
        super.setUp();
        db.getOptions().setAutovacuum(true);
        db.createTable(CREATE_TABLE);
        db.getTable(TABLE_NAME).insert(1, 1);
    }

    public static abstract class WorkThread implements Callable<Object> {

        protected static final ExecutorService threadPool = Executors.newCachedThreadPool();

        protected final String threadName;

        protected Future<?> result;
        protected boolean kill = false;

        public WorkThread(final String threadName) {
            this.threadName = threadName;
        }

        public Future<?> submit() {
            return this.result = threadPool.submit(this);
        }

        public Future<?> getResult() {
            return result;
        }

        public static void shutdown() {
            threadPool.shutdown();
        }

        public void kill() {
            this.kill = true;
            try {
                this.result.get();
            } catch (Exception e) {
                this.result.cancel(true);
            }
        }

        public Object call() throws Exception {
            setUp();
            final String defaultThreadName = Thread.currentThread().getName();
            try {
                Thread.currentThread().setName(threadName);
                while (!kill) {
                    work();
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
            try {
                table.insertOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
            } catch (SqlJetException e) {
                Assert.assertTrue(e.getMessage(), false);
            }
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
            } catch (SqlJetException e) {
                Assert.assertTrue(e.getMessage(), false);
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
            super.tearDown();
            cursor.close();
        }

        @Override
        protected void work() throws Exception {
            try {
                for (cursor.first(); !cursor.eof(); cursor.next()) {
                    final Object b = cursor.getValue("b");
                    Assert.assertNotNull(b);
                }
            } catch (SqlJetException e) {
                Assert.assertTrue(e.getMessage(), false);
            }
        }
    }

    @Test
    public void writers() throws Exception {
        final WriteThread writer1 = new WriteThread(file, "writer1", TABLE_NAME);
        final WriteThread writer2 = new WriteThread(file, "writer2", TABLE_NAME);
        try {
            writer1.submit();
            writer2.submit();
            Thread.sleep(TIMEOUT);
        } finally {
            writer1.kill();
            writer2.kill();
        }
    }

    @Test
    public void readers() throws Exception {
        final ReadThread reader1 = new ReadThread(file, "reader1", TABLE_NAME);
        final ReadThread reader2 = new ReadThread(file, "reader2", TABLE_NAME);
        try {
            reader1.submit();
            reader2.submit();
            Thread.sleep(TIMEOUT);
        } finally {
            reader1.kill();
            reader2.kill();
        }
    }

    @Test
    public void readWrite() throws Exception {
        final ReadThread reader1 = new ReadThread(file, "reader1", TABLE_NAME);
        final ReadThread reader2 = new ReadThread(file, "reader2", TABLE_NAME);
        final WriteThread writer1 = new WriteThread(file, "writer1", TABLE_NAME);
        final WriteThread writer2 = new WriteThread(file, "writer2", TABLE_NAME);
        try {
            reader1.submit();
            reader2.submit();
            writer1.submit();
            writer2.submit();
            Thread.sleep(TIMEOUT);
        } finally {
            reader1.kill();
            reader2.kill();
            writer1.kill();
            writer2.kill();
        }
    }

    @Test
    public void longReaders() throws Exception {
        final LongReadThread reader1 = new LongReadThread(file, "reader1", TABLE_NAME);
        final LongReadThread reader2 = new LongReadThread(file, "reader2", TABLE_NAME);
        try {
            reader1.submit();
            reader2.submit();
            Thread.sleep(TIMEOUT);
        } finally {
            reader1.kill();
            reader2.kill();
        }
    }

    @Test
    public void writeLongReaders() throws Exception {
        final LongReadThread reader1 = new LongReadThread(file, "reader1", TABLE_NAME);
        final WriteThread writer1 = new WriteThread(file, "writer1", TABLE_NAME) {
            @Override
            protected void setUp() throws Exception {
                super.setUp();
                db.setBusyHandler(null);
            }
        };
        try {
            reader1.submit();
            writer1.submit();
            Thread.sleep(TIMEOUT);
        } finally {
            reader1.kill();
            writer1.kill();
        }
    }

}
