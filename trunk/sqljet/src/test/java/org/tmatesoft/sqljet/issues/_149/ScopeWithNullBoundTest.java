/**
 * ScopeWithNullBoundTest.java
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
package org.tmatesoft.sqljet.issues._149;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetScope;
import org.tmatesoft.sqljet.core.table.SqlJetScope.SqlJetScopeBound;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class ScopeWithNullBoundTest extends AbstractNewDbTest {
    
    @Before
    public void setup() throws SqlJetException {
        db.createTable("CREATE TABLE record (a INTEGER NOT NULL, b INTEGER NOT NULL)");
        db.createIndex("CREATE INDEX record_idx ON record (a, b)");
        
        db.getTable("record").insert(1, 1);
        db.getTable("record").insert(2, 1);
        db.getTable("record").insert(3, 1);
        db.getTable("record").insert(4, 1);
        db.getTable("record").insert(5, 1);
        db.getTable("record").insert(6, 1);
        db.getTable("record").insert(7, 1);
    }
    
    @Test
    public void testScopeWithNullBound() throws SqlJetException {

        SqlJetScope upScope = new SqlJetScope(new Object[] {5}, null);
        SqlJetScope upScopeExclusive = new SqlJetScope(new Object[] {5}, false, null, true);
        
        SqlJetScope downScope = new SqlJetScope(null, new Object[] {5});
        SqlJetScope downScopeExclusive = new SqlJetScope(null, true, new Object[] {5}, false);
        
        // [0,5], not [infinity:5]. 
        SqlJetScope downScope2 = new SqlJetScope(new Object[] {null}, new Object[] {5});

        SqlJetScope allScope = new SqlJetScope((SqlJetScopeBound) null, null);
        SqlJetScope allScope2 = new SqlJetScope((Object[]) null, null);
        
        List<Long> upValues = Arrays.asList(Long.valueOf(5), Long.valueOf(6), Long.valueOf(7));
        List<Long> downValues = Arrays.asList(Long.valueOf(1), Long.valueOf(2), Long.valueOf(3), Long.valueOf(4), Long.valueOf(5));
        List<Long> upValuesExclusive = Arrays.asList(Long.valueOf(6), Long.valueOf(7));
        List<Long> downValuesExclusive = Arrays.asList(Long.valueOf(1), Long.valueOf(2), Long.valueOf(3), Long.valueOf(4));

        List<Long> allValues = new ArrayList<Long>(downValuesExclusive);
        allValues.addAll(upValues);
        
        assertScope(upScope, upValues);
        assertScope(downScope, downValues);
        assertScope(downScope2, downValues);
        assertScope(allScope, allValues);
        assertScope(allScope2, allValues);
        assertScope(upScopeExclusive, upValuesExclusive);
        assertScope(downScopeExclusive, downValuesExclusive);
        
        assertScope(upScope.reverse(), downValues);
        assertScope(downScope.reverse(), upValues);
        assertScope(upScopeExclusive.reverse(), downValuesExclusive);
        assertScope(downScopeExclusive.reverse(), upValuesExclusive);
        
        // [5:0], not [5:infinity].
        Collections.reverse(downValues);
        assertScope(downScope2.reverse(), downValues);
    }

    private void assertScope(SqlJetScope scope, List<Long> expectedValues) throws SqlJetException {
        assertScope(scope, "record", "record_idx", expectedValues.toArray());
    }

}
