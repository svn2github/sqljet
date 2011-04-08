/**
 * InsertOrUpdateDoesntWorkTest.java
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
package org.tmatesoft.sqljet.issues._128;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class InsertOrUpdateDoesntWorkTest extends AbstractNewDbTest {

    private void assertInsertedOrReplaced(final ISqlJetTable table,
            final long actual, final Object ... key) throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor lookup = table.lookup(null, key);
                Assert.assertEquals(actual, lookup.getInteger("time"));
                return null;
            }
        });
    }

    private void assertCount(final ISqlJetTable table, final int count) throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor open = table.open();
                Assert.assertEquals(count, open.getRowCount());
                return null;
            }
        });
    }

    @Test
    public void testInsertOrUpdate1() throws SqlJetException {
        final ISqlJetTableDef createTable = db.createTable("CREATE TABLE IF NOT EXISTS files ("
                + " name TEXT NOT NULL PRIMARY KEY, time INTEGER)");
        final ISqlJetTable table = db.getTable(createTable.getName());
        for (long actual = 1; actual < 10; actual++) {
            table.insertOr(SqlJetConflictAction.REPLACE, "test", new Long(actual));
            assertInsertedOrReplaced(table, actual, "test");
        }
        assertCount(table, 1);
    }


    @Test
    public void testInsertOrUpdate2() throws SqlJetException {
        final ISqlJetTableDef createTable = db.createTable("CREATE TABLE IF NOT EXISTS files ("
                + " id INTEGER NOT NULL PRIMARY KEY, time INTEGER)");
        final ISqlJetTable table = db.getTable(createTable.getName());
        for (long actual = 1; actual < 10; actual++) {
            table.insertOr(SqlJetConflictAction.REPLACE, 1, new Long(actual));
            assertInsertedOrReplaced(table, actual, 1);
        }
        assertCount(table, 1);
    }

}
