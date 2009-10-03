package org.tmatesoft.sqljet.issues._112;

import java.security.SecureRandom;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class ClearCellError extends AbstractNewDbTest {

    private static final int INSERTS_COUNT = 1000;

    private static final String TABLE_DDL = "CREATE TABLE IF NOT EXISTS tiles (x int, y int, z int, s int, image blob, PRIMARY KEY (x,y,z,s))";
    private static final String INDEX_DDL = "CREATE INDEX IF NOT EXISTS IND on tiles (x,y,z,s)";

    private static final String T_DDL = "CREATE TABLE t (x int, image blob, PRIMARY KEY (x))";

    @Test
    public void clearCellError() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        db.createTable(TABLE_DDL);
        db.createIndex(INDEX_DDL);
        db.commit();

        SecureRandom rnd = new SecureRandom();
        ISqlJetTable table = db.getTable("tiles");
        for (int i = 0; i < INSERTS_COUNT; i++) {
            byte[] blob = new byte[1024 + rnd.nextInt(4096)];
            rnd.nextBytes(blob);

            int x = rnd.nextInt(2048);
            int y = 0;
            int zoom = 10;
            db.beginTransaction(SqlJetTransactionMode.WRITE);
            try {
                table.insert(x, y, zoom, 0, blob);
            } catch (SqlJetException e) {
                if (SqlJetErrorCode.CONSTRAINT.equals(e.getErrorCode())) {
                    // insert failed because record already exists -> update
                    // it

                    Object[] key = new Object[] { x, y, zoom, 0 };
                    ISqlJetCursor updateCursor = table.lookup("IND", key);
                    do {
                        updateCursor.update(x, y, zoom, 0, blob);
                    } while (updateCursor.next());
                    updateCursor.close();

                } else
                    throw e;
            }
            db.commit();
        }
    }

    @Test
    public void updateBlob() throws Exception {

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
                    rnd.nextBytes(blob);

                    try {
                        c.update(rnd.nextInt(2048), blob);
                    } catch (SqlJetException e) {
                        if (!SqlJetErrorCode.CONSTRAINT.equals(e.getErrorCode())) {
                            throw e;
                        }
                    }

                } while (c.next());
            }
        } finally {
            c.close();
        }

    }

}
