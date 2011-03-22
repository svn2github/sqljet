/**
 * OpenScopeTest.java
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
package org.tmatesoft.sqljet.issues._148;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;
import org.tmatesoft.sqljet.core.table.SqlJetScope;
import org.tmatesoft.sqljet.core.table.SqlJetScope.SqlJetScopeBound;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class OpenScopeTest extends AbstractNewDbTest {

    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.createTable("CREATE TABLE IF NOT EXISTS table (name TEXT, count INTEGER)");
        db.createIndex("CREATE UNIQUE INDEX IF NOT EXISTS names_idx ON table(name)");
        
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                
                db.getTable("table").insert("XYZ", 1);
                db.getTable("table").insert("XYZZ", 1);
                db.getTable("table").insert("ABC", 1);
                db.getTable("table").insert("ABCD", 1);
                db.getTable("table").insert("ABCDEF", 1);
                db.getTable("table").insert("A", 1);
                
                return null;
            }
        });
    }

    @Test
    public void testOpenScope() throws SqlJetException {
        
        SqlJetScope closedScope = new SqlJetScope(new Object[] {"ABC"}, new Object[] {"XYZ"});
        SqlJetScope openScope = new SqlJetScope(new Object[] {"ABC"}, false, new Object[] {"XYZ"}, false);
        SqlJetScope emptyOpenScope = new SqlJetScope(new Object[] {"ABCD"}, false, new Object[] {"ABCDEF"}, false);
        SqlJetScope notMatchingOpenScope = new SqlJetScope(new Object[] {"AB"}, false, new Object[] {"XY"}, false);
        SqlJetScope notMatchingClosedScope = new SqlJetScope(new Object[] {"AB"}, true, new Object[] {"XY"}, true);
        SqlJetScope outOfBoundsClosedScope = new SqlJetScope(new Object[] {"XYZZZ"}, true, new Object[] {"XYZZZZZ"}, true);
        SqlJetScope outOfBoundsOpenScope = new SqlJetScope(new Object[] {"XYZZ"}, false, new Object[] {"XYZZZZZ"}, true);
        SqlJetScope unbounded = new SqlJetScope((SqlJetScopeBound) null, (SqlJetScopeBound) null);
        SqlJetScope unbounded2 = new SqlJetScope((Object[]) null, (Object[]) null);
        
        assertScope(closedScope, "ABC", "ABCD", "ABCDEF", "XYZ");
        assertScope(closedScope.reverse(), "XYZ", "ABCDEF", "ABCD", "ABC");
        assertScope(openScope, "ABCD", "ABCDEF");
        assertScope(openScope.reverse(), "ABCDEF", "ABCD");
        assertScope(emptyOpenScope);
        assertScope(emptyOpenScope.reverse());
        assertScope(notMatchingClosedScope, "ABC", "ABCD", "ABCDEF");
        assertScope(notMatchingOpenScope, "ABC", "ABCD", "ABCDEF");
        assertScope(outOfBoundsClosedScope);
        assertScope(outOfBoundsOpenScope);

        assertScope(unbounded, "A", "ABC", "ABCD", "ABCDEF", "XYZ", "XYZZ" );
        assertScope(unbounded.reverse(), "A", "ABC", "ABCD", "ABCDEF", "XYZ", "XYZZ" );
        assertScope(unbounded2, "A", "ABC", "ABCD", "ABCDEF", "XYZ", "XYZZ" );
        assertScope(unbounded2.reverse(), "A", "ABC", "ABCD", "ABCDEF", "XYZ", "XYZZ" );
    }

    private void assertScope(SqlJetScope scope, String... expectedKeysInScope) throws SqlJetException {
        Collection<String> expected = Arrays.asList(expectedKeysInScope);
        Object actualKeysInScope = queryScope(scope);
        Assert.assertEquals(expected, actualKeysInScope);
    }

    private Object queryScope(final SqlJetScope scope) throws SqlJetException {
        return db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                Collection<String> namesInScope = new ArrayList<String>();  
                ISqlJetCursor scopeCursor = db.getTable("table").scope("names_idx", scope);
                while(!scopeCursor.eof()) {
                    namesInScope.add(scopeCursor.getString(0));
                    scopeCursor.next();
                }
                return namesInScope;
            }
        });
    }

}
