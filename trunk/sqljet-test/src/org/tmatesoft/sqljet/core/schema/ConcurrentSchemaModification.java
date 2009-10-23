/**
 * ConcurrenySchemaModification.java
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
package org.tmatesoft.sqljet.core.schema;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

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
public class ConcurrentSchemaModification extends AbstractNewDbTest {

    private static final String CREATE = "create table %s%d(a int);";

    private class Task implements Runnable {

        private String taskName;
        private boolean run = true;

        public Task(String taskName) {
            this.taskName = taskName;
        }

        public void run() {
            int i = 0;
            try {
                Thread.currentThread().setName(taskName);
                while (run) {
                    try {
                        SqlJetDb db = null;
                        try {
                            final int n = i++;
                            db = SqlJetDb.open(file, true);
                            db.runWriteTransaction(new ISqlJetTransaction() {
                                public Object run(SqlJetDb db) throws SqlJetException {
                                    db.createTable(String.format(CREATE, taskName, n));
                                    return null;
                                }
                            });
                        } finally {
                            if (db != null) {
                                db.close();
                            }
                        }
                    } catch (SqlJetException e) {
                        logger.log(Level.INFO, taskName, e);
                    }
                }
            } catch (Exception e) {
                logger.log(Level.INFO, taskName, e);
            } finally {
                Thread.currentThread().setName(null);
            }
        }

        public void kill() {
            run = false;
        }
    }

    @Test
    public void concurrentSchemaModification() throws Exception {

        final ExecutorService threadPool = Executors.newCachedThreadPool();
        final Task task1 = new Task("thread1");
        final Task task2 = new Task("thread2");
        final Task task3 = new Task("thread3");
        try {
            threadPool.submit(task1);
            threadPool.submit(task2);
            threadPool.submit(task3);
            Thread.sleep(10000);
        } finally {
            task1.kill();
            task2.kill();
            task3.kill();
            threadPool.awaitTermination(10, TimeUnit.SECONDS);
        }
    }
}
