/**
 * TempDbTest.java
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
package org.tmatesoft.sqljet.core.table;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class TempDbTest extends AbstractNewDbTest {
    
    @Test
    public void testCreateTempDb() throws SqlJetException {
        SqlJetDb tempDb = db.getTemporaryDatabase();
        
        assertNotNull(tempDb);
        assertTrue(tempDb.isOpen());
        assertTrue(tempDb.isWritable());
        
        tempDb.createTable("CREATE TABLE t (wc_id  INTEGER NOT NULL, local_relpath TEXT NOT NULL, parent_relpath TEXT, kind TEXT NOT NULL);");
        tempDb.createIndex("CREATE INDEX t_kind ON t (kind)");
        
        assertTrue(tempDb == db.getTemporaryDatabase());
        ISqlJetTable table = db.getTemporaryDatabase().getTable("t");
        assertNotNull(table);
    }
    
    @Test
    public void tempDatabaseIsRecreatedIfClosed() throws SqlJetException {
        SqlJetDb tempDb = db.getTemporaryDatabase();
        assertNotNull(tempDb);
        tempDb.close();
        File tmpDbFile = tempDb.getFile();
        assertTrue(tmpDbFile.isFile());
        
        SqlJetDb tempDb2 = db.getTemporaryDatabase();
        
        assertFalse(tmpDbFile.exists());
        File tmpDbFile2 = tempDb2.getTemporaryDatabase().getFile();
        assertTrue(tmpDbFile2.isFile());
    }
    
    @Test
    public void tempDatabaseIsDeletedOnClose() throws SqlJetException {
        SqlJetDb tempDb = db.getTemporaryDatabase();
        assertNotNull(tempDb);
        File tmpDbFile = tempDb.getFile();
        assertTrue(tmpDbFile.isFile());
        db.close();
        assertFalse(tmpDbFile.exists());
    }

}
