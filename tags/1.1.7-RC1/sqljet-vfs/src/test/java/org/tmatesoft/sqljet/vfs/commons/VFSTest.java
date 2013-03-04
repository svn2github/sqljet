package org.tmatesoft.sqljet.vfs.commons;

import java.io.File;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class VFSTest {

    @Test
    @Ignore
    public void sampleVFSTest() throws SqlJetException {
        File file = new File("some/path/in/vfs");
        ISqlJetFileSystem fs = new SqlJetCommonFileSystem();
        
        SqlJetDb db = null;        
        try {
            db = SqlJetDb.open(file, true, fs);
            Assert.assertNotNull(db);
            Assert.assertEquals(db.getFile(), file);
        } finally {
            if (db != null) {
                db.close();
            }
        }
        
        db.close();
    }
}
