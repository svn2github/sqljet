/**
 * IntegerPrimaryKeyTest.java
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
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;

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
                final ISqlJetSchema schema = db.getSchema();
                schema.createTable("create table t(id integer primary key);");
                schema.createTable("create table t2(id integer);");
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
                final ISqlJetCursor c = t2 ? table2.open() : table.lookup(table.getPrimaryKeyIndexName(), rowId);
                Assert.assertTrue(!c.eof());
                Assert.assertEquals(rowId, c.getInteger(ID));
                Assert.assertEquals(rowId, c.getInteger(ROWID));
                Assert.assertEquals(rowId, c.getValue(ID));
                Assert.assertEquals(rowId, c.getValue(ROWID));
                Assert.assertEquals(rowId, c.getRowId());
            }
        } finally {
            try {
                db.close();
            } finally {
                file.delete();
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
        rowId = 2; t2=true;
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                table2.insertWithRowId(rowId,rowId);
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
                table.insertWithRowId(0,rowId);
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
                table.insertWithRowId(0,new Object[]{null});
                return null;
            }
        });
        success = true;
    }
    
}
