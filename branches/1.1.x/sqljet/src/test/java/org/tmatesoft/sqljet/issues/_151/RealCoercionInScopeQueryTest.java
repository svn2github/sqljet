/**
 * RealCoercionInScopeQueryTest.java
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
package org.tmatesoft.sqljet.issues._151;

import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetScope;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class RealCoercionInScopeQueryTest extends AbstractNewDbTest {

    @Before
    public void setup() throws SqlJetException {
        db.createTable("CREATE TABLE halves (a REAL NOT NULL)");
        db.createIndex("CREATE INDEX halves_idx ON halves (a)");

        ISqlJetTable halves = db.getTable("halves");
        for (int i = 0; i < 10; i++) {
            halves.insert(((double)i) + .5);
        }

        db.createTable("CREATE TABLE wholes (a REAL NOT NULL)");
        db.createIndex("CREATE INDEX wholes_idx ON wholes (a)");

        ISqlJetTable wholes = db.getTable("wholes");
        for (int i = 0; i < 10; i++) {
            wholes.insert(((double)i));
        }
    }

    @Test
    public void testScopeWithCoercion() throws SqlJetException {
        SqlJetScope halvesScope = new SqlJetScope(new Object[] {2}, new Object[] {5});
        assertScope(halvesScope, "halves", "halves_idx", 2.5, 3.5, 4.5);

        SqlJetScope wholesScope = new SqlJetScope(new Object[] {2}, new Object[] {5});
        assertScope(wholesScope, "wholes", "wholes_idx", 2.0, 3.0, 4.0, 5.0);
    }

}
