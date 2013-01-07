/**
 * DBInMemoryTest.java
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

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class DbInMemoryTest {

    @Test
    public void createDbInMemory() throws Exception {
        SqlJetDb db = new SqlJetDb(SqlJetDb.IN_MEMORY, true);
        db.open();
        try {
            final ISqlJetTableDef tDef = db.createTable("create table t(a integer primary key, b text);");
            final ISqlJetTable t = db.getTable(tDef.getName());
            t.insert(null, "hello");
            t.insert(null, "world");
            db.runReadTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    final ISqlJetCursor c = t.open();
                    try {
                        while (!c.eof()) {
                            Assert.assertNotNull(c.getInteger("a"));
                            Assert.assertNotNull(c.getString("b"));
                            c.next();
                        }
                    } finally {
                        c.close();
                    }
                    return null;
                }
            });
        } finally {
            db.close();
        }
    }

}
