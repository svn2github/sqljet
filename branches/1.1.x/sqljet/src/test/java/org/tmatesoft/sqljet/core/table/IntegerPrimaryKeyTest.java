/**
 * IntegerPrimaryKeyTest.java
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
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class IntegerPrimaryKeyTest {

    private static final String ID = "id";
    private static final String ROWID = "ROWID";

    private File file;
    private SqlJetDb db;
    private ISqlJetTable table, table2;
    private Map<String, Object> values;
    private boolean success, t2;
    private long rowId = 1L;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        file = File.createTempFile("test", null);
        file.deleteOnExit();
        db = SqlJetDb.open(file, true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table t(id integer primary key);");
                db.createTable("create table t2(id integer);");
                db.createTable("create table t3(id integer, a integer, primary key(id));");
                return null;
            }
        });
        table = db.getTable("t");
        table2 = db.getTable("t2");
        values = new HashMap<String, Object>();
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
                        final ISqlJetCursor c = t2 ? table2.open() : table
                                .lookup(table.getPrimaryKeyIndexName(), rowId);
                        Assert.assertTrue(!c.eof());
                        Assert.assertEquals(rowId, c.getInteger(ID));
                        Assert.assertEquals(rowId, c.getInteger(ROWID));
                        Assert.assertEquals(rowId, c.getValue(ID));
                        Assert.assertEquals(rowId, c.getValue(ROWID));
                        Assert.assertEquals(rowId, c.getRowId());
                        return null;
                    }
                });
            }
        } finally {
            try {
                db.close();
            } finally {
                SqlJetFileUtil.deleteFile(file);
            }
        }
    }

    @Test
    public void integerPrimaryKey3() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey4() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert((Object[]) null);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey4_1() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(new Object[] { null });
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey6() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey8() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey10() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey12() throws SqlJetException {
        values.put(ID, null);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey14() throws SqlJetException {
        values.put(ROWID, null);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey16() throws SqlJetException {
        rowId = 2;
        values.put(ID, rowId);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey18() throws SqlJetException {
        rowId = 2;
        values.put(ROWID, rowId);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey20() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1);
                table.open().update(2);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey21() throws SqlJetException {
        rowId = 2;
        values.put(ID, rowId);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1);
                table.open().updateByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void integerPrimaryKey22() throws SqlJetException {
        rowId = 2;
        values.put(ROWID, rowId);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(1);
                table.open().updateByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowId1() throws SqlJetException {
        rowId = 2;
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insertWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowId2() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(0, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowId3() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(0);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowId4() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(0, new Object[] { null });
                return null;
            }
        });
        success = true;
    }

    @Test(expected = SqlJetException.class)
    public void insertWithRowId5() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertWithRowId(1);
                table.insertWithRowId(1);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void insertWithRowId6() throws SqlJetException {
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insertWithRowId(0, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test(expected = SqlJetException.class)
    public void insertWithRowId7() throws SqlJetException {
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insertWithRowId(rowId, rowId);
                table2.insertWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId1() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId2() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(rowId, 1);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId3() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId4() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(rowId, (Object[]) null);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId5() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(rowId, new Object[] { null });
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId6() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(0, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId7() throws SqlJetException {
        rowId = 2;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert();
                table.open().updateWithRowId(0, new Object[] { rowId });
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId8() throws SqlJetException {
        rowId = 2;
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insert();
                table2.open().updateWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId9() throws SqlJetException {
        rowId = 2;
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insert(1);
                table2.open().updateWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateWithRowId10() throws SqlJetException {
        t2 = true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insertWithRowId(rowId, rowId);
                rowId = 2;
                table2.open().updateWithRowId(rowId, rowId);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void updateByFieldNames1() throws SqlJetException {
        t2 = true;
        rowId = 2;
        values.put(ROWID, rowId);
        values.put(ID, rowId);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insert();
                table2.open().updateByFieldNames(values);
                return null;
            }
        });
        success = true;
    }

    @Test
    public void otherWay() throws SqlJetException {
        success = false;
        final ISqlJetTable table3 = db.getTable("t3");
        Assert.assertNotNull(table3);
        Assert.assertNull(table3.getPrimaryKeyIndexName());
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table3.insert();
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertEquals(1L, table3.open().getValue(ID));
                return null;
            }
        });
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table3.insertWithRowId(0, 2L, null);
                return null;
            }
        });
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertTrue(!table3.lookup(null, 2L).eof());
                return null;
            }
        });
    }

}
