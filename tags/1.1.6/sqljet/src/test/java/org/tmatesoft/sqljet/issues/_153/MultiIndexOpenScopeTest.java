/**
 * MultiIndexOpenScopeTest.java
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
package org.tmatesoft.sqljet.issues._153;

import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetScope;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class MultiIndexOpenScopeTest extends AbstractNewDbTest {

    @Before
    public void setup() throws SqlJetException {
        db.createTable("CREATE TABLE IF NOT EXISTS pairs (x INTEGER, y INTEGER)");
        db.createIndex("CREATE INDEX IF NOT EXISTS pairs_idx ON pairs(x,y)");

        db.getTable("pairs").insert(1, 0);
        db.getTable("pairs").insert(1, 1);
        db.getTable("pairs").insert(1, 2);
        db.getTable("pairs").insert(1, 0);
        db.getTable("pairs").insert(1, 1);
        db.getTable("pairs").insert(1, 2);
    }

    @Test
    public void testScope() throws SqlJetException {
        Object[] expectedValue = {Long.valueOf(1), Long.valueOf(2)};
        SqlJetScope closedScope = new SqlJetScope(new Object[] {1, 2}, true, new Object[] {1, 2}, true);
        SqlJetScope openScope = new SqlJetScope(new Object[] {1, 1}, false, new Object[] {1, 2}, true);

        assertScope(closedScope, "pairs", "pairs_idx", true, new Object[] {expectedValue, expectedValue});
        assertScope(closedScope, "pairs", "pairs_idx", true, new Object[] {expectedValue, expectedValue});

        assertScope(openScope, "pairs", "pairs_idx", true, new Object[] {expectedValue, expectedValue});
    }

}
