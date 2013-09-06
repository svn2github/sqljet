package org.tmatesoft.sqljet.core.schema;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class Svn17To18UpgradeTest extends AbstractDataCopyTest {
    
    private static final String DB = "src/test/data/db/svn1.7/wc17.db";

    
    @Test
    public void testUpgrade() throws IOException, SqlJetException {
        final File dbToUpgrade = copyFile(new File(DB), true);
        SqlJetDb db = SqlJetDb.open(dbToUpgrade, true);
        
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            db.alterTable("ALTER TABLE NODES ADD COLUMN inherited_props BLOB;");

            final ISqlJetCursor cursor = db.getTable("NODES").lookup(null, new Long(1));
            while(!cursor.eof()) cursor.next();
            cursor.close();
            
            db.commit();
        } catch (SqlJetException e) {
            db.rollback();
        } finally {
            db.close();
        }
    }

}
