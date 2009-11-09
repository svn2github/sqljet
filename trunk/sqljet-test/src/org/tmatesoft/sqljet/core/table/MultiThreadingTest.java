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

    @Override
    public void setUp() throws Exception {
        super.setUp();
        db.createTable("create table t(a integer primary key, b integer)");
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
        }

        public Object call() throws Exception {
            setUp();
            final String defaultThreadName = Thread.currentThread().getName();
            try {
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

    public static class WriteThread extends WorkThread {

        protected final File file;
        protected SqlJetDb db;

        protected Random random = new Random();

        public WriteThread(final File file, final String threadName) {
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

        @Override
        protected void work() throws Exception {
            try {
                db.getTable("t").insertOr(SqlJetConflictAction.REPLACE, 1, random.nextLong());
            } catch (SqlJetException e) {
                Assert.assertTrue(e.getMessage(), false);
            }
        }
    }

    @Test
    public void writers() throws Exception {
        final WriteThread writer1 = new WriteThread(file, "writer1");
        final WriteThread writer2 = new WriteThread(file, "writer2");
        try {
            writer1.submit();
            writer2.submit();
            Thread.sleep(10000);
        } finally {
            writer1.kill();
            writer2.kill();
        }
    }

}
