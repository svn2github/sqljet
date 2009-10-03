package org.tmatesoft.sqljet.core.table;

import java.security.SecureRandom;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;

public class BlobsTest extends AbstractNewDbTest {

    private static final String T_DDL = "CREATE TABLE t (x int, image blob, PRIMARY KEY (x))";

    @Test
    public void readBlob() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable(T_DDL);
                return true;
            }
        });

        final SecureRandom rnd = new SecureRandom();
        final ISqlJetTable t = db.getTable("t");
        final byte[] blob = new byte[1024 + 4096];

        rnd.nextBytes(blob);

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                try {
                    t.insert(rnd.nextInt(2048), blob);
                } catch (SqlJetException e) {
                    if (!SqlJetErrorCode.CONSTRAINT.equals(e.getErrorCode())) {
                        throw e;
                    }
                }

                return true;
            }
        });

        final ISqlJetCursor c = t.open();
        try {
            if (!c.eof()) {
                do {
                    final byte[] b = c.getBlobAsArray(1);
                    Assert.assertArrayEquals(blob, b);
                } while (c.next());
            }
        } finally {
            c.close();
        }

    }

}
