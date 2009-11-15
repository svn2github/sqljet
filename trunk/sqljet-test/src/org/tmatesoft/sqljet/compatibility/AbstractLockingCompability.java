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

    private static final String PROPERTY_NAMESPACE = "sqljet.test.compability.";
    private static final String FILE_PROPERTY = PROPERTY_NAMESPACE + "file";
    private static final String FILE_NAME = SqlJetUtility.getSysProp(FILE_PROPERTY, null);
    private static final int TIMEOUT = SqlJetUtility.getIntSysProp(PROPERTY_NAMESPACE + "timeout", 1000);

    static void lockSQLite() throws Exception {
        Assert.assertNotNull(String.format("property '%s'  isn't specified", FILE_PROPERTY), FILE_NAME);
        Class.forName("org.sqlite.JDBC");
        final Connection conn = DriverManager.getConnection("jdbc:sqlite:" + FILE_NAME);
        try {
            final Statement stat = conn.createStatement();
            stat.execute("begin immediate;");
            try {
                Thread.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                return;
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
        Assert.assertNotNull(String.format("property '%s'  isn't specified", FILE_PROPERTY), FILE_NAME);
        final SqlJetDb db = SqlJetDb.open(new File(FILE_NAME), true);
        try {
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    try {
                        Thread.sleep(TIMEOUT);
                    } catch (InterruptedException e) {
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
