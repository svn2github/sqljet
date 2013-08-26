/**
 * AlterTableTest.java
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
package org.tmatesoft.sqljet.core.schema;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.lang.SqlJetParserException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class AlterTableTest extends AbstractNewDbTest {

    private ISqlJetTable table;

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.AbstractNewDbTest#setUp()
     */
    @Override
    public void setUp() throws Exception {
        super.setUp();
        final ISqlJetTableDef createTable = db.createTable("create table t(a text primary key);");
        table = db.getTable(createTable.getName());
        db.createIndex("create index i on t(a);");
        db.createTable("create table t2(a int primary key);");
    }

    /**
     * @throws SqlJetException
     */
    private void assertDbOpen() throws SqlJetException {
        final SqlJetDb db2 = SqlJetDb.open(file, false);
        try {
            Assert.assertNotNull(db2);
        } finally {
            if (db2 != null) {
                db2.close();
            }
        }
    }

    @Test
    public void addField() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t add b int;");
        final ISqlJetTable t = db.getTable("t");
        Assert.assertNotNull(alterTable);
        Assert.assertNotNull(alterTable.getColumn("b"));
        Assert.assertNotNull(table.getDefinition().getColumn("b"));
        Assert.assertNotNull(t);
        Assert.assertNotNull(t.getDefinition().getColumn("b"));
        assertDbOpen();
    }

    @Test
    public void addField1() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t add b int");
        final ISqlJetTable t = db.getTable("t");
        Assert.assertNotNull(alterTable);
        Assert.assertNotNull(alterTable.getColumn("b"));
        Assert.assertNotNull(table.getDefinition().getColumn("b"));
        Assert.assertNotNull(t);
        Assert.assertNotNull(t.getDefinition().getColumn("b"));
        assertDbOpen();
    }

    @Test
    public void addField2() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t add column b int;");
        final ISqlJetTable t = db.getTable("t");
        Assert.assertNotNull(alterTable);
        Assert.assertNotNull(alterTable.getColumn("b"));
        Assert.assertNotNull(table.getDefinition().getColumn("b"));
        Assert.assertNotNull(t);
        Assert.assertNotNull(t.getDefinition().getColumn("b"));
        assertDbOpen();
    }

    @Test
    public void addField3() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t add column b int default 0;");
        final ISqlJetTable t = db.getTable("t");
        Assert.assertNotNull(alterTable);
        Assert.assertNotNull(alterTable.getColumn("b"));
        Assert.assertNotNull(table.getDefinition().getColumn("b"));
        Assert.assertNotNull(t);
        Assert.assertNotNull(t.getDefinition().getColumn("b"));
        assertDbOpen();
    }

    @Test
    public void addField4() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t add column b int not null default 0;");
        final ISqlJetTable t = db.getTable("t");
        Assert.assertNotNull(alterTable);
        Assert.assertNotNull(alterTable.getColumn("b"));
        Assert.assertNotNull(table.getDefinition().getColumn("b"));
        Assert.assertNotNull(t);
        Assert.assertNotNull(t.getDefinition().getColumn("b"));
        assertDbOpen();
    }

    @Test(expected = SqlJetException.class)
    public void addField5() throws SqlJetException {
        db.alterTable("alter table t add column b int not null;");
        assertDbOpen();
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void addField6() throws SqlJetException {
        db.alterTable("alter table t add column b int primary key;");
        assertDbOpen();
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void addField7() throws SqlJetException {
        db.alterTable("alter table t add column b int unique;");
        assertDbOpen();
        Assert.assertTrue(false);
    }

    @Test(expected = SqlJetException.class)
    public void addField8() throws SqlJetException {
        try {
            db.alterTable("alter table t add column b int primary key;");
            Assert.assertTrue(false);
        } catch (SqlJetException e) {
            assertDbOpen();
            throw e;
        }
    }

    @Test(expected = SqlJetParserException.class)
    public void addField9() throws SqlJetException {
        try {
            db.alterTable("alter table t add column b int, c int;");
            Assert.assertTrue(false);
        } catch (SqlJetException e) {
            assertDbOpen();
        }
    }

    @Test(expected = SqlJetParserException.class)
    public void addField10() throws SqlJetException {
        try {
            db.alterTable("alter table t add column b int, c int;");
            Assert.assertTrue(false);
        } catch (SqlJetException e) {
            assertDbOpen();
        }
    }
    
    @Test
    public void renameTable() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t rename to t1;");
        Assert.assertNotNull(alterTable);
        Assert.assertTrue("t1".equals(alterTable.getName()));
        final ISqlJetTable t = db.getTable("t1");
        Assert.assertNotNull(t);
        assertDbOpen();
    }

    @Test(expected = SqlJetException.class)
    public void renameTable2() throws SqlJetException {
        db.alterTable("alter table t rename to t2;");
        Assert.assertTrue(false);
    }

    @Test
    public void addFieldAndModify() throws SqlJetException {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            db.getTable("t2").insert(1L);
        } finally {
            db.commit();
        }
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            db.alterTable("alter table t2 add column b blob;");
            db.getTable("t2").open().update(1L, "blob".getBytes());
        } finally {
            db.commit();
        }

        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            final byte[] blob = (byte[]) db.getTable("t2").open().getBlobAsArray("b");
            Assert.assertArrayEquals("blob".getBytes(), blob);
        } finally {
            db.commit();
        }
    }

}
