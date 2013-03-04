/**
 * MultiThreadingTest.java
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
package org.tmatesoft.sqljet.core.table;

import java.io.File;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

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
        protected static final ReadWriteLock rwlock = new ReentrantReadWriteLock();

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
        protected boolean own = false;

        public DbThread(final File file, final String threadName) {
            super(threadName);
            this.file = file;
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
            if (null == this.db) {
                this.db = SqlJetDb.open(file, true);
                own = true;
            }
        }

        @Override
        protected void tearDown() throws Exception {
            if (own && db != null) {
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
            lockMutex();
            try {
                table.insertOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
            } finally {
                unlockMutex();
            }
        }

        protected void lockMutex() {
            rwlock.writeLock().lock();
        }

        protected void unlockMutex() {
            rwlock.writeLock().unlock();
        }

    }

    public static class ReadThread extends TableThread {

        public ReadThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void work() throws Exception {
            lockMutex();
            try {
                db.runReadTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor cursor = table.open();
                        try {
                            do {
                                final Object b = cursor.getValue("b");
                                Assert.assertNotNull(b);
                            } while (cursor.next());
                        } finally {
                            cursor.close();
                        }
                        return null;
                    }
                });
            } finally {
                unlockMutex();
            }
        }

        protected void lockMutex() {
            rwlock.readLock().lock();
        }

        protected void unlockMutex() {
            rwlock.readLock().unlock();
        }

    }

    public static class LongReadThread extends TableThread {

        public LongReadThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void work() throws Exception {
            rwlock.readLock().lock();
            try {
                db.runReadTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor cursor = table.open();
                        try {
                            for (cursor.first(); !cursor.eof(); cursor.next()) {
                                final Object b = cursor.getValue("b");
                                Assert.assertNotNull(b);
                            }
                        } finally {
                            cursor.close();
                        }
                        return null;
                    }
                });
            } finally {
                rwlock.readLock().unlock();
            }
        }
    }

    public static class LongWriteThread extends TableThread {

        protected Random random = new Random();

        public LongWriteThread(final File file, final String threadName, final String tableName) {
            super(file, threadName, tableName);
        }

        @Override
        protected void work() throws Exception {
            rwlock.writeLock().lock();
            try {
                db.runWriteTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor cursor = table.open();
                        try {
                            for (cursor.first(); !cursor.eof(); cursor.next()) {
                                cursor.updateOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
                            }
                        } finally {
                            cursor.close();
                        }
                        return null;
                    }
                });
            } finally {
                rwlock.writeLock().unlock();
            }
        }
    }

    public static class WriteSynchronizedThread extends WriteThread {
        public WriteSynchronizedThread(final SqlJetDb db, final File file, final String threadName,
                final String tableName) {
            super(file, threadName, tableName);
            this.db = db;
        }

        @Override
        protected void lockMutex() {
        }

        @Override
        protected void unlockMutex() {
        }
    }

    public static class ReadSynchronizedThread extends ReadThread {
        public ReadSynchronizedThread(final SqlJetDb db, final File file, final String threadName,
                final String tableName) {
            super(file, threadName, tableName);
            this.db = db;
        }

        @Override
        protected void lockMutex() {
        }

        @Override
        protected void unlockMutex() {
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

    @Test
    public void longWrite() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongWriteThread(file, "writer1", TABLE_NAME),
                new LongWriteThread(file, "writer2", TABLE_NAME) });
    }

    @Test
    public void longWriteLongReaders() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new LongReadThread(file, "reader1", TABLE_NAME),
                new LongWriteThread(file, "writer1", TABLE_NAME) });
    }

    @Test
    public void synchronizedReadWrite() throws Exception {
        WorkThread.exec(TIMEOUT, new WorkThread[] { new ReadSynchronizedThread(db, file, "reader1", TABLE_NAME),
                new ReadSynchronizedThread(db, file, "reader2", TABLE_NAME),
                new WriteSynchronizedThread(db, file, "writer1", TABLE_NAME),
                new WriteSynchronizedThread(db, file, "writer2", TABLE_NAME) });
    }

}
