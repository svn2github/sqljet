/**
 * CaseInsensitiveNamesTest.java
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
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class CaseInsensitiveNamesTest extends AbstractNewDbTest {

    @Test
    public void caseInsensitiveTablesTest() throws SqlJetException {
        db.createTable("create table t(a int)");
        Assert.assertNotNull(db.getTable("T"));
        db.createTable("create table TT(a int)");
        Assert.assertNotNull(db.getTable("tt"));
    }

    @Test
    public void caseInsensitiveIndicesTest() throws SqlJetException {
        final ISqlJetTable t = db.getTable(db.createTable("create table t(a int)").getName());
        db.createIndex("create index i on t(a)");
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertNotNull(t.getIndexDef("I"));
                Assert.assertNotNull(t.order("I"));
                Assert.assertNotNull(t.lookup("I", 0));
                Assert.assertNotNull(t.scope("I", new Object[] { 0 }, new Object[] { 0 }));
                return null;
            }
        });
        db.createIndex("create index II on t(a)");
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Assert.assertNotNull(t.getIndexDef("ii"));
                Assert.assertNotNull(t.order("ii"));
                Assert.assertNotNull(t.scope("ii", new Object[] { 0 }, new Object[] { 0 }));
                return null;
            }
        });
    }

    @Test
    public void caseInsensitiveFieldsTest() throws SqlJetException {
        final ISqlJetTableDef def = db.createTable("create table t(a int, B int)");
        Assert.assertNotNull(def.getColumn("A"));
        Assert.assertNotNull(def.getColumn("b"));
        final ISqlJetTable table = db.getTable("T");
        Assert.assertNotNull(table);
        final ISqlJetTableDef def2 = table.getDefinition();
        Assert.assertNotNull(def2.getColumn("A"));
        Assert.assertNotNull(def2.getColumn("b"));
    }

}
