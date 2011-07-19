/**
 * VirtualTablesTest.java
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
package org.tmatesoft.sqljet.core.schema;

import java.io.File;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class VirtualTablesTest extends AbstractNewDbTest {

    private static final String FTS3_DB = "src/test/data/db/fts3.sqlite";

    @Test
    public void fts3() throws SqlJetException {
        final SqlJetDb fts3Db = SqlJetDb.open(new File(FTS3_DB), false);
        try {
            final ISqlJetSchema schema = fts3Db.getSchema();
            final Set<String> virtualTableNames = schema.getVirtualTableNames();
            Assert.assertNotNull(virtualTableNames);
            Assert.assertTrue(virtualTableNames.size() > 0);
        } finally {
            fts3Db.close();
        }
    }

    @Test
    public void createVirtualTableTest() throws SqlJetException {

        final ISqlJetVirtualTableDef createTable = db.createVirtualTable("create virtual table t using sqljetmap");
        Assert.assertNotNull(createTable);
        Assert.assertNotNull(createTable.getTableName());
        Assert.assertNotNull(createTable.getModuleName());

        final ISqlJetSchema schema = db.getSchema();
        final Set<String> virtualTableNames = schema.getVirtualTableNames();
        Assert.assertNotNull(virtualTableNames);
        Assert.assertTrue(virtualTableNames.size() > 0);
        Assert.assertTrue(virtualTableNames.contains("t"));

        final ISqlJetVirtualTableDef virtualTable = schema.getVirtualTable("t");
        Assert.assertNotNull(virtualTable);
        Assert.assertNotNull(virtualTable.getModuleName());
        Assert.assertEquals("sqljetmap", virtualTable.getModuleName());
        Assert.assertNotNull(virtualTable.getModuleColumns());
        Assert.assertTrue(virtualTable.getModuleColumns().size() == 0);

    }

    @Test
    public void createVirtualTableTest2() throws SqlJetException {

        final ISqlJetVirtualTableDef createTable = db
                .createVirtualTable("create virtual table t using sqljetmap( raw, rowid )");
        Assert.assertNotNull(createTable);
        Assert.assertNotNull(createTable.getTableName());
        Assert.assertNotNull(createTable.getModuleName());

        final ISqlJetSchema schema = db.getSchema();
        final Set<String> virtualTableNames = schema.getVirtualTableNames();
        Assert.assertNotNull(virtualTableNames);
        Assert.assertTrue(virtualTableNames.size() > 0);
        Assert.assertTrue(virtualTableNames.contains("t"));

        final ISqlJetVirtualTableDef virtualTable = schema.getVirtualTable("t");
        Assert.assertNotNull(virtualTable);
        Assert.assertNotNull(virtualTable.getModuleName());
        Assert.assertEquals("sqljetmap", virtualTable.getModuleName());
        Assert.assertNotNull(virtualTable.getModuleColumns());
        Assert.assertTrue(virtualTable.getModuleColumns().size() > 0);

    }

}
