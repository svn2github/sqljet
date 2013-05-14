package org.tmatesoft.sqljet.issues._177;

import junit.framework.Assert;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;

public class LargerThan2GbTest extends AbstractNewDbTest {
	
	@Test
	public void testIntOverflow() {
		final long i1 = 2*Integer.MAX_VALUE;
		final long i2 = 2*(long)Integer.MAX_VALUE;
		final long i3 = 2*((long)Integer.MAX_VALUE);
		Assert.assertTrue( i1 != i2 );
		Assert.assertTrue( i2 == i3 );
	}
    
    @Test
    public void testLargeDb() {
        try {
            db.beginTransaction(SqlJetTransactionMode.WRITE);
            db.createTable("CREATE TABLE test (x BLOB)");
            db.commit();
            
            byte[] megabyte = new byte[1048576];
            for(int i = 0; i < 4096; i++) {
                db.beginTransaction(SqlJetTransactionMode.WRITE);
                db.getTable("test").insert(megabyte);
                db.commit();
            }
        } catch(SqlJetException e) {
            try {
                db.rollback();
            } catch (SqlJetException e1) {
            }
            Assert.fail(e.getMessage());
        }
    }
}
