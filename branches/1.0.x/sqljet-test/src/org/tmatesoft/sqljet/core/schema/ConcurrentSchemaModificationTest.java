/**
 * ConcurrenySchemaModification.java
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
package org.tmatesoft.sqljet.core.schema;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class ConcurrentSchemaModificationTest extends AbstractNewDbTest {

    private ExecutorService threadPool;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        threadPool = Executors.newCachedThreadPool();
    }

    private abstract class TransactionTask implements Callable<Object> {

        protected String taskName;
        protected boolean run = true;

        public TransactionTask(String taskName) {
            this.taskName = taskName;
        }

        public Object call() throws Exception {
            int i = 0;
            final Thread currentThread = Thread.currentThread();
            final String threadName = currentThread.getName();
            try {
                currentThread.setName(taskName);
                while (run) {
                    SqlJetDb db = null;
                    try {
                        final int n = i++;
                        db = SqlJetDb.open(file, true);
                        synchronized (TransactionTask.class) {
                            db.runWriteTransaction(new ISqlJetTransaction() {
                                public Object run(SqlJetDb db) throws SqlJetException {
                                    return workInTransaction(db, n);
                                }
                            });
                        }
                    } finally {
                        if (db != null) {
                            db.close();
                        }
                    }
                }
            } finally {
                currentThread.setName(threadName);
            }
            return null;
        }

        protected abstract Object workInTransaction(SqlJetDb db, int n) throws SqlJetException;

        public void kill() {
            run = false;
        }

    }

    private class SchemaModificationTask extends TransactionTask {

        private static final String CREATE = "create table %s%d(a int);";

        public SchemaModificationTask(String taskName) {
            super(taskName);
        }

        @Override
        protected Object workInTransaction(SqlJetDb db, int n) throws SqlJetException {
            db.createTable(String.format(CREATE, taskName, n));
            return null;
        }

    }

    @Test
    public void concurrentSchemaModification() throws Exception {
        final TransactionTask task1 = new SchemaModificationTask("thread1");
        final TransactionTask task2 = new SchemaModificationTask("thread2");
        final TransactionTask task3 = new SchemaModificationTask("thread3");
        final Future<Object> result1;
        final Future<Object> result2;
        final Future<Object> result3;
        try {
            result1 = threadPool.submit(task1);
            result2 = threadPool.submit(task2);
            result3 = threadPool.submit(task3);
            Thread.sleep(1000);
        } finally {
            task1.kill();
            task2.kill();
            task3.kill();
        }
        result1.get();
        result2.get();
        result3.get();
    }
}
