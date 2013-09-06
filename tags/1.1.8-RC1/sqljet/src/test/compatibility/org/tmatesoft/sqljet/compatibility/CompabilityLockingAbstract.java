/**
 * SQLiteLockingNixCompability.java
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
package org.tmatesoft.sqljet.compatibility;

import java.io.File;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import junit.framework.Assert;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public abstract class CompabilityLockingAbstract {

    private static final String PROPERTY_IS_NOT_SPECIFIED = "property '%s'  is not specified";
    private static final String PROPERTY_NAMESPACE = "sqljet.test.compability.";
    private static final String FILE_PROPERTY = PROPERTY_NAMESPACE + "file";
    private static final String SEMAPHORE_PROPERTY = PROPERTY_NAMESPACE + "semaphore";
    private static final String FILE = SqlJetUtility.getSysProp(FILE_PROPERTY, null);
    private static final String SEMAPHORE = SqlJetUtility.getSysProp(SEMAPHORE_PROPERTY, null);
    private static final int MAXWAIT = SqlJetUtility.getIntSysProp(PROPERTY_NAMESPACE + "maxwait", 2500);

    private static void checkProperties() {
        Assert.assertNotNull(String.format(PROPERTY_IS_NOT_SPECIFIED, FILE_PROPERTY), FILE);
        Assert.assertNotNull(String.format(PROPERTY_IS_NOT_SPECIFIED, SEMAPHORE_PROPERTY), SEMAPHORE);
    }

    public static void setUpDb() throws Exception {
        checkProperties();
        final SqlJetDb db = SqlJetDb.open(new File(FILE), true);
        try {
            db.createTable("create table if not exists t(a integer primary key, b integer)");
            db.getTable("t").insert(null, 1);
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    public static void resetSemaphore() throws Exception {
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

    public static void notifySemaphore() throws Exception {
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

    public static void waitSemaphore() throws Exception {
        final File f = new File(SEMAPHORE);
        for (int i = 0; i < MAXWAIT; i++) {
            if (!f.exists() || f.length() == 0) {
                return;
            }
            Thread.sleep(10);
        }
    }

    public static void writeLockSQLite() throws Exception {
        checkProperties();
        Class.forName("org.sqlite.JDBC");
        final Connection conn = DriverManager.getConnection("jdbc:sqlite:" + FILE);
        try {
            final Statement stat = conn.createStatement();
            stat.execute("begin exclusive;");
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

    public static void readLockSQLite() throws Exception {
        checkProperties();
        Class.forName("org.sqlite.JDBC");
        final Connection conn = DriverManager.getConnection("jdbc:sqlite:" + FILE);
        try {
            final Statement stat = conn.createStatement();
            stat.execute("begin deferred;");
            final ResultSet rs = stat.executeQuery("select * from t;");
            do {
                @SuppressWarnings("unused")
                final long b = rs.getLong("b");
            } while (rs.next());
            try {
                notifySemaphore();
                waitSemaphore();
            } finally {
                rs.close();
                stat.execute("end;");
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void writeLockSQLJet() throws SqlJetException {
        checkProperties();
        final SqlJetDb db = SqlJetDb.open(new File(FILE), true);
        try {
            db.runTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    try {
                        notifySemaphore();
                        waitSemaphore();
                    } catch (Exception e) {
                        return null;
                    }
                    return null;
                }
            }, SqlJetTransactionMode.EXCLUSIVE);
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    public static void readLockSQLJet() throws SqlJetException {
        checkProperties();
        final SqlJetDb db = SqlJetDb.open(new File(FILE), true);
        try {
            db.runReadTransaction(new ISqlJetTransaction() {
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

    public static void openSQLite() throws Exception {
        checkProperties();
        Class.forName("org.sqlite.JDBC");
        final Connection conn = DriverManager.getConnection("jdbc:sqlite:" + FILE);
        try {
            notifySemaphore();
            waitSemaphore();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void openSQLJet() throws Exception {
        checkProperties();
        final SqlJetDb db = SqlJetDb.open(new File(FILE), true);
        try {
            notifySemaphore();
            waitSemaphore();
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
