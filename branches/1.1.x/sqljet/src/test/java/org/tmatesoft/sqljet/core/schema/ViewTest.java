/**
 * VirtualTablesTest.java
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
package org.tmatesoft.sqljet.core.schema;

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class ViewTest extends AbstractNewDbTest {
    
    private static final String VIEW_NAME = "X";
    private static final String VIEW_SELECT = "SELECT * FROM nodes AS n WHERE op_depth = (SELECT op_depth FROM nodes AS n2 WHERE n2.wc_id = n.wc_id  AND n2.local_relpath = n.local_relpath)";
    private static final String VIEW_CREATE = "CREATE VIEW " + VIEW_NAME + " AS " + VIEW_SELECT;
    
    @Test
    public void testCreateView() throws SqlJetException {
        ISqlJetViewDef viewDef = db.createView(VIEW_CREATE);
        Assert.assertNotNull(viewDef);
        Assert.assertEquals(VIEW_NAME, viewDef.getName());
        Assert.assertTrue(db.getSchema().getViewNames().contains(VIEW_NAME));
        Assert.assertEquals(viewDef, db.getSchema().getView(VIEW_NAME));
        
        db.close();
        db = SqlJetDb.open(file, true);

        Assert.assertTrue(db.getSchema().getViewNames().contains(VIEW_NAME));
        Assert.assertNotNull(db.getSchema().getView(VIEW_NAME));
        Assert.assertEquals(VIEW_NAME, db.getSchema().getView(VIEW_NAME).getName());
        Assert.assertEquals(VIEW_CREATE, db.getSchema().getView(VIEW_NAME).toSQL());
        
        db.dropView(VIEW_NAME);

        Assert.assertTrue(db.getSchema().getViewNames().isEmpty());
        Assert.assertFalse(db.getSchema().getViewNames().contains(VIEW_NAME));
        Assert.assertNull(db.getSchema().getView(VIEW_NAME));
        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db.getSchema().getViewNames().isEmpty());
        Assert.assertFalse(db.getSchema().getViewNames().contains(VIEW_NAME));
        Assert.assertNull(db.getSchema().getView(VIEW_NAME));
        
        try {
            db.dropView(VIEW_NAME);
            Assert.assertFalse("Should not be possible to delete missing view", true);
        } catch (SqlJetException e) {
            Assert.assertTrue("Should not be possible to delete missing view", true);
        }
        
        
    }

}
