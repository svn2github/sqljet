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

public class TriggerTest extends AbstractNewDbTest {
    
    private static final String TRIGGER_NAME = "X";
    private static final String TRIGGER_TABLE_NAME = "Y";
    
    private static final String TRIGGER_CREATE = 
        "CREATE TRIGGER " + TRIGGER_NAME + " AFTER INSERT ON " + TRIGGER_TABLE_NAME + " WHEN NEW.checksum IS NOT NULL BEGIN  UPDATE pristine SET refcount = refcount + 1  WHERE checksum = NEW.checksum; END";
    
    @Test
    public void testCreateTrigger() throws SqlJetException {
        ISqlJetTriggerDef triggerDef = db.createTrigger(TRIGGER_CREATE);
        Assert.assertNotNull(triggerDef);
        Assert.assertEquals(TRIGGER_NAME, triggerDef.getName());
        Assert.assertEquals(TRIGGER_TABLE_NAME, triggerDef.getTableName());
        Assert.assertTrue(db.getSchema().getTriggerNames().contains(TRIGGER_NAME));
        Assert.assertEquals(triggerDef, db.getSchema().getTrigger(TRIGGER_NAME));
        
        db.close();
        
        db = SqlJetDb.open(file, true);

        Assert.assertTrue(db.getSchema().getTriggerNames().contains(TRIGGER_NAME));
        Assert.assertNotNull(db.getSchema().getTrigger(TRIGGER_NAME));
        Assert.assertEquals(TRIGGER_NAME, db.getSchema().getTrigger(TRIGGER_NAME).getName());
        Assert.assertEquals(TRIGGER_CREATE, db.getSchema().getTrigger(TRIGGER_NAME).toSQL());
        
        db.dropTrigger(TRIGGER_NAME);

        Assert.assertTrue(db.getSchema().getTriggerNames().isEmpty());
        Assert.assertFalse(db.getSchema().getTriggerNames().contains(TRIGGER_NAME));
        Assert.assertNull(db.getSchema().getTrigger(TRIGGER_NAME));
        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db.getSchema().getTriggerNames().isEmpty());
        Assert.assertFalse(db.getSchema().getTriggerNames().contains(TRIGGER_NAME));
        Assert.assertNull(db.getSchema().getTrigger(TRIGGER_NAME));
        
        try {
            db.dropTrigger(TRIGGER_NAME);
            Assert.assertFalse("Should not be possible to delete missing trigger", true);
        } catch (SqlJetException e) {
            Assert.assertTrue("Should not be possible to delete missing trigger", true);
        }
        
        
    }

}
