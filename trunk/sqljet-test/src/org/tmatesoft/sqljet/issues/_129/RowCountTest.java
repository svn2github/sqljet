/**
 * RowCountTest.java
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
package org.tmatesoft.sqljet.issues._129;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class RowCountTest {

    private static final String CREATE_TABLE_PRIMARY_KEY_IMPLICIT = "create table t(id integer primary key, value varchar);";
    private static final String CREATE_TABLE_PRIMARY_KEY_EXPLICIT = "create table t(id integer, value varchar, primary key(id,value));";

    @Test
    public void testRowCount() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_IMPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(null, "test1");
                    t.insert(null, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.open();
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCount2() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_EXPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(1, "test1");
                    t.insert(2, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.open();
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountOrder() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_IMPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(null, "test1");
                    t.insert(null, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.order(null);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountOrder2() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_EXPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(1, "test1");
                    t.insert(2, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.order(null);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountScope() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_IMPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(null, "test1");
                    t.insert(null, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.scope(null, null, null);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountScope2() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_EXPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(1, "test1");
                    t.insert(2, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.scope(null, null, null);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountLookup() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_IMPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(null, "test1");
                    t.insert(null, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.lookup(null);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(2, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountLookup3() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_EXPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(1, "test1");
                    t.insert(2, "test2");
                    return null;
                }
            });
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.lookup(null,2);
                    long rc = pk.getRowCount();
                    Assert.assertEquals(1, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

    @Test
    public void testRowCountLookup2() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_IMPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(null, "test1");
                    t.insert(null, "test2");
                    return null;
                }
            });
            db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
            try {
                ISqlJetCursor pk = t.lookup(null);
                long rc = pk.getRowCount();
                Assert.assertEquals(2, rc);
            } finally {
                db.commit();
            }
        } finally {
            db.close();
        }
    }

    @Test
    public void testDelete() throws Exception {
        final SqlJetDb db = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
        try {
            final ISqlJetTableDef def = db.createTable(CREATE_TABLE_PRIMARY_KEY_EXPLICIT);
            final ISqlJetTable t = db.getTable(def.getName());
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    t.insert(1, "test1");
                    t.insert(2, "test2");
                    return null;
                }
            });
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    ISqlJetCursor pk = t.lookup(null,2);
                    pk.delete();
                    long rc = pk.getRowCount();
                    Assert.assertEquals(0, rc);
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

}
