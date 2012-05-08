/**
 * ReverseScopeTest.java
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
package org.tmatesoft.sqljet.issues._132;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class ReverseScopeTest extends AbstractNewDbTest {

    @Test
    public void testScopeReverse() throws Exception {
        // Prepare data
        try {
            db.beginTransaction(SqlJetTransactionMode.WRITE);
            db.createTable("CREATE TABLE IF NOT EXISTS test (test_bean_id INTEGER PRIMARY KEY AUTOINCREMENT,number FLOAT)");

            ISqlJetTable table = db.getTable("test");
            for (int i = 0; i < 30; i++) {
                table.insert(null, Double.valueOf(30.0));
            }
        } finally {
            db.commit();
        }
        try {
            db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
            ISqlJetTable table = db.getTable("test");
            ISqlJetCursor cursor = table.scope(null, new Object[] { Long.valueOf(10) },
                    new Object[] { Long.valueOf(20) });
            assertEquals(11, cursor.getRowCount());
            ISqlJetCursor reversed = cursor.reverse();
            assertEquals(11, reversed.getRowCount());
            List<Long> list = new LinkedList<Long>();
            if (!reversed.eof()) {
                do {
                    list.add(reversed.getInteger(0));
                } while (reversed.next());
            }
            assertEquals(11, list.size());
            assertEquals(Long.valueOf(20), list.get(0));
            assertEquals(Long.valueOf(10), list.get(list.size() - 1));
        } finally {
            db.commit();
        }
    }

}
