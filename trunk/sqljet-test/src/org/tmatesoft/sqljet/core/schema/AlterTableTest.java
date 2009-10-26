/**
 * AlterTableTest.java
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

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
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
                db.close();
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

    @Test
    public void renameTable() throws SqlJetException {
        final ISqlJetTableDef alterTable = db.alterTable("alter table t rename to t1;");
        final ISqlJetTable t = db.getTable("t1");
        Assert.assertNotNull(alterTable);
        Assert.assertTrue("t1".equals(alterTable.getName()));
        assertDbOpen();
    }

}
