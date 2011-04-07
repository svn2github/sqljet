/**
 * DoubleColumnTest.java
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
package org.tmatesoft.sqljet.issues._143;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author jhruby.web
 *
 */
public class DoubleColumnTest extends AbstractNewDbTest {

    @Test
    public void testBadCreateTable() throws Exception {
        boolean testOk = false;
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try { // memory_slot_id is duplicit
            db.createTable("CREATE TABLE IF NOT EXISTS memory_slots (memory_slot_id INTEGER PRIMARY KEY AUTOINCREMENT,memory_slot_id INTEGER NOT NULL,name TEXT NOT NULL,registration TEXT,fuel_type TEXT,fuel_units TEXT,distance_units TEXT NOT NULL )");
        } catch (SqlJetException ex) {
            testOk = true;
        } finally {
            db.commit();
        }

        assertEquals(true, testOk);
    }
}
