/**
 * SQLiteLockingNixCompability.java
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
package org.tmatesoft.sqljet.compatibility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import junit.framework.Assert;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class AbstractLockingCompability {

    private static final String PROPERTY_IS_NOT_SPECIFIED = "property '%s'  is not specified";
    private static final String PROPERTY_NAMESPACE = "sqljet.test.compability.";
    private static final String FILE_PROPERTY = PROPERTY_NAMESPACE + "file";
    private static final String SEMAPHORE_PROPERTY = PROPERTY_NAMESPACE + "semaphore";
    private static final String FILE = SqlJetUtility.getSysProp(FILE_PROPERTY, null);
    private static final String SEMAPHORE = SqlJetUtility.getSysProp(SEMAPHORE_PROPERTY, null);
    private static final int MAXWAIT = SqlJetUtility.getIntSysProp(PROPERTY_NAMESPACE + "maxwait", 1000);

    private static void checkProperties() {
        Assert.assertNotNull(String.format(PROPERTY_IS_NOT_SPECIFIED, FILE_PROPERTY), FILE);
        Assert.assertNotNull(String.format(PROPERTY_IS_NOT_SPECIFIED, SEMAPHORE_PROPERTY), SEMAPHORE);
    }

    protected static void resetSemaphore() throws Exception {
        final File s = new File(SEMAPHORE);
        if (s.exists()) {
            final RandomAccessFile f = new RandomAccessFile(s, "rw");
            try {
                f.setLength(0);
            } finally {
                f.close();
            }
        }
    }

    private static void notifySemaphore() throws Exception {
        final File s = new File(SEMAPHORE);
        if (!s.exists()) {
            s.createNewFile();
        }
        final RandomAccessFile f = new RandomAccessFile(s, "rw");
        try {
            f.write(0);
        } finally {
            f.close();
        }
    }

    private static void waitSemaphore() throws Exception {
        final File f = new File(SEMAPHORE);
        for (int i = 0; i < MAXWAIT; i++) {
            if (!f.exists() || f.length() == 0) {
                return;
            }
            Thread.sleep(10);
        }
    }

    static void lockSQLite() throws Exception {
        checkProperties();
        Class.forName("org.sqlite.JDBC");
        final Connection conn = DriverManager.getConnection("jdbc:sqlite:" + FILE);
        try {
            final Statement stat = conn.createStatement();
            stat.execute("begin immediate;");
            try {
                notifySemaphore();
                waitSemaphore();
            } finally {
                stat.execute("end;");
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    static void lockSQLJet() throws SqlJetException {
        checkProperties();
        final SqlJetDb db = SqlJetDb.open(new File(FILE), true);
        try {
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    try {
                        notifySemaphore();
                        waitSemaphore();
                    } catch (Exception e) {
                        return null;
                    }
                    return null;
                }
            });
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
