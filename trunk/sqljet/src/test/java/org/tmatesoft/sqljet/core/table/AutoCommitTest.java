/**
 * AutoCommitTest.java
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
package org.tmatesoft.sqljet.core.table;

import java.util.Map;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class AutoCommitTest extends AbstractNewDbTest {

    private static final String B = "b";
    private static final String A = "a";

    private ISqlJetTable table;
    private boolean success = false;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t(a integer primary key, b integer);");
                return null;
            }
        });
        table = db.getTable("t");
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {

            if (success) {
                db.runReadTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor lookup1 = table.lookup(null, 1);
                        Assert.assertTrue(!lookup1.eof());
                        Assert.assertEquals(2L, lookup1.getValue(B));
                        lookup1.close();

                        final ISqlJetCursor lookup3 = table.lookup(null, 3);
                        Assert.assertTrue(!lookup3.eof());
                        Assert.assertEquals(4L, lookup3.getValue(B));
                        lookup3.close();
                        return null;
                    }
                });
            }

        } finally {
            super.tearDown();
        }
    }

    private Map<String, Object> map(Object... values) throws SqlJetException {
        if (values == null)
            return null;
        if (values.length % 2 != 0)
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        final Map<String, Object> map = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
        String name = null;
        for (Object value : values) {
            if (name != null) {
                map.put(name, value);
                name = null;
            } else {
                if (value != null && value instanceof String) {
                    name = (String) value;
                } else
                    throw new SqlJetException(SqlJetErrorCode.MISUSE);
            }
        }
        if (name != null)
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
        return map;
    }

    @Test
    public void insertAutoCommit() throws SqlJetException {
        table.insert(1, 2);
        table.insert(3, 4);
        success = true;
    }

    @Test
    public void insertTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 2);
                table.insert(3, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertMixed() throws SqlJetException {
        table.insert(1, 2);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(3, 4);
                table.insert(5, 6);
                return null;
            }
        });
        table.insert(7, 8);
        success = true;
    }

    @Test
    public void insertWithRowIdAutoCommit() throws SqlJetException {
        table.insertWithRowId(1, null, 2);
        table.insertWithRowId(3, null, 4);
        success = true;
    }

    @Test
    public void insertWithRowIdTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(1, null, 2);
                table.insertWithRowId(3, null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowIdMixed() throws SqlJetException {
        table.insertWithRowId(1, null, 2);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(3, null, 4);
                table.insertWithRowId(5, null, 6);
                return null;
            }
        });
        table.insertWithRowId(7, null, 8);
        success = true;
    }

    @Test
    public void insertWithNamesAutoCommit() throws SqlJetException {
        table.insertByFieldNames(map(A, 1, B, 2));
        table.insertByFieldNames(map(A, 3, B, 4));
        success = true;
    }

    @Test
    public void insertWithNamesTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 1, B, 2));
                table.insertByFieldNames(map(A, 3, B, 4));
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithNamesMixed() throws SqlJetException {
        table.insertByFieldNames(map(A, 1, B, 2));
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 3, B, 4));
                table.insertByFieldNames(map(A, 5, B, 6));
                return null;
            }
        });
        table.insertByFieldNames(map(A, 7, B, 8));
        success = true;
    }

    @Test
    public void updateAutoCommit() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 1);
                table.insert(3, 3);
                table.lookup(null, 1).update(null, 2);
                table.lookup(null, 3).update(null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 2);
                table.insert(3, 4);
                table.lookup(null, 1).update(null, 2);
                table.lookup(null, 3).update(null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateMixed() throws SqlJetException {
        table.insert(1, 2);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(3, 4);
                table.insert(5, 6);
                table.lookup(null, 1).update(null, 2);
                return null;
            }
        });
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(7, 8);
                table.lookup(null, 3).update(null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowIdAutoCommit() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(1, null, 1);
                table.insertWithRowId(3, null, 3);
                table.lookup(null, 1).updateWithRowId(0, null, 2);
                table.lookup(null, 3).updateWithRowId(0, null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowIdTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(1, null, 1);
                table.insertWithRowId(3, null, 3);
                table.lookup(null, 1).updateWithRowId(0, null, 2);
                table.lookup(null, 3).updateWithRowId(0, null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowIdMixed() throws SqlJetException {
        table.insertWithRowId(1, null, 1);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(3, null, 3);
                table.insertWithRowId(5, null, 6);
                table.lookup(null, 1).updateWithRowId(0, null, 2);
                return null;
            }
        });
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(7, null, 8);
                table.lookup(null, 3).updateWithRowId(0, null, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateByFieldNamesAutoCommit() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 1, B, 1));
                table.insertByFieldNames(map(A, 3, B, 3));
                table.lookup(null, 1).updateByFieldNames(map(B, 2));
                table.lookup(null, 3).updateByFieldNames(map(B, 4));
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateByFieldNamesTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 1, B, 1));
                table.insertByFieldNames(map(A, 3, B, 3));
                table.lookup(null, 1).updateByFieldNames(map(B, 2));
                table.lookup(null, 3).updateByFieldNames(map(B, 4));
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateByFieldNamesMixed() throws SqlJetException {
        table.insertByFieldNames(map(A, 1, B, 1));
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 3, B, 3));
                table.insertByFieldNames(map(A, 5, B, 6));
                table.lookup(null, 1).updateByFieldNames(map(B, 2));
                return null;
            }
        });
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(map(A, 7, B, 8));
                table.lookup(null, 3).updateByFieldNames(map(B, 4));
                return null;
            }
        });
        success = true;
    }

    @Test
    public void deleteAutoCommit() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 1);
                table.insert(3, 3);
                table.lookup(null, 1).delete();
                table.lookup(null, 3).delete();
                table.insert(1, 2);
                table.insert(3, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void deleteTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1, 1);
                table.insert(3, 3);
                table.lookup(null, 1).delete();
                table.lookup(null, 3).delete();
                table.insert(1, 2);
                table.insert(3, 4);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void deleteMixed() throws SqlJetException {
        table.insert(1, 1);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(3, 3);
                table.lookup(null, 1).delete();
                return null;
            }
        });
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.lookup(null, 3).delete();
                table.insert(1, 2);
                table.insert(3, 4);
                success = true;
                return null;
            }
        });
    }

    @Test
    public void createTableAutocommit() throws SqlJetException {
        db.createTable("create table t1(a,b)");
        Assert.assertNotNull(db.getTable("t1"));
    }

    @Test
    public void createIndexAutocommit() throws SqlJetException {
        table.insert(1, 1);
        db.createIndex("create index idx on t(a,b)");
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertTrue(!db.getTable("t").lookup("idx", 1, 1).eof());
                return null;
            }
        });
    }

    @Test
    public void dropTableAutocommit() throws SqlJetException {
        db.createTable("create table t1(a,b)");
        Assert.assertNotNull(db.getSchema().getTable("t1"));
        db.close();
        db = SqlJetDb.open(file, true);
        db.dropTable("t1");
        Assert.assertNull(db.getSchema().getTable("t1"));
    }

    @Test
    public void dropIndexAutocommit() throws SqlJetException {
        db.createIndex("create index idx on t(a,b)");
        Assert.assertNotNull(db.getSchema().getIndex("idx"));
        db.close();
        db = SqlJetDb.open(file, true);
        db.dropIndex("idx");
        Assert.assertNull(db.getSchema().getIndex("idx"));
    }

    @Test
    public void dropTableTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t1(a,b)");
                Assert.assertNotNull(db.getSchema().getTable("t1"));
                return null;
            }
        });
        db.close();
        db = SqlJetDb.open(file, true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.dropTable("t1");
                Assert.assertNull(db.getSchema().getTable("t1"));
                return null;
            }
        });
    }

    @Test
    public void dropIndexTransaction() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createIndex("create index idx on t(a,b)");
                Assert.assertNotNull(db.getSchema().getIndex("idx"));
                return null;
            }
        });
        db.close();
        db = SqlJetDb.open(file, true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.dropIndex("idx");
                Assert.assertNull(db.getSchema().getIndex("idx"));
                return null;
            }
        });
    }

    @Test
    public void createTableManaged() throws SqlJetException {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        boolean commited = false;
        try {
            db.createTable("create table t1(a,b)");
            db.commit();
            commited = true;
        } finally {
            if (!commited) {
                db.rollback();
            }
        }
        Assert.assertNotNull(db.getTable("t1"));
    }

    @Ignore // Fixed (see beginReadMany/beginWriteMany)
    @Test(expected = SqlJetException.class)
    public void beginTransactionFail() throws SqlJetException {
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
    }

    @Ignore // Fixed (see commitTwice)
    @Test(expected = SqlJetException.class)
    public void commitFail() throws SqlJetException {
        db.commit();
    }

    @Test
    public void beginReadMany() throws SqlJetException {
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
    }

    @Test
    public void beginWriteMany() throws SqlJetException {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
    }

    @Test
    public void commitTwice() throws SqlJetException {
        db.commit();
        db.commit();
    }

    @Test
    public void rollbackTwice() throws SqlJetException {
        db.rollback();
        db.rollback();
    }

}
