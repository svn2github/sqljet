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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;

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
    private ISqlJetTable table;

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
                db.getSchema().createTable("create table t(id integer primary key);");
                return null;
            }
        });
        table = db.getTable("t");
    }

    @Test
    public void integerPrimaryKey() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction(){
            public Object run(SqlJetDb db) throws SqlJetException {
                table.insertAutoId();
                return null;
            }
        });
    }
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        final ISqlJetCursor c = table.lookup(table.getPrimaryKeyIndexName(), 1L);
        Assert.assertTrue(!c.eof());
        Assert.assertEquals(1L, c.getInteger(ID));
        Assert.assertEquals(1L, c.getInteger(ROWID));
        Assert.assertEquals(1L, c.getValue(ID));
        Assert.assertEquals(1L, c.getValue(ROWID));
        file.delete();
    }

}
