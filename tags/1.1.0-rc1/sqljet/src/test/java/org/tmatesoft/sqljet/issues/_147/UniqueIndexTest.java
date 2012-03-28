/**
 * UniqueIndexTest.java
 * Copyright (C) 2009-2011 TMate Software Ltd
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
package org.tmatesoft.sqljet.issues._147;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
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
public class UniqueIndexTest extends AbstractNewDbTest {

    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.createTable("CREATE TABLE IF NOT EXISTS names (name_id INTEGER PRIMARY KEY AUTOINCREMENT,unique_name TEXT NOT NULL)");
        db.createIndex("CREATE UNIQUE INDEX IF NOT EXISTS names_unique_name_idx ON names(unique_name)");
    }

    @Test
    public void testUniqueIndex() throws Exception {

        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb arg0) throws SqlJetException {
                ISqlJetTable table = db.getTable("names");
                table.insertOr(SqlJetConflictAction.REPLACE, null, "same name");
                table.insertOr(SqlJetConflictAction.REPLACE, null, "same name");

                return null;
            }
        }, SqlJetTransactionMode.WRITE); // I would expect transaction fails or
                                         // one record in table. But in table
                                         // are two records!

        Integer count = (Integer) db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb arg0) throws SqlJetException {
                ISqlJetTable table = db.getTable("names");
                ISqlJetCursor cur = table.order(null);
                Integer counter = 0;
                if (!cur.eof()) {
                    do {
                        ++counter;
                    } while (cur.next());

                }
                ;
                return counter;
            }
        }, SqlJetTransactionMode.READ_ONLY);

        assertEquals(Integer.valueOf(1), count); // count is 2 but correctly is
                                                 // 1

    }

}
