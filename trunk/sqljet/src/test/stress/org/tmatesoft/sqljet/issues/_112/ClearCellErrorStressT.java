package org.tmatesoft.sqljet.issues._112;

import java.security.SecureRandom;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class ClearCellErrorStressT extends AbstractNewDbTest {

    private static final int INSERTS_COUNT = 10000;

    private static final String TABLE_DDL = "CREATE TABLE IF NOT EXISTS tiles (x int, y int, z int, s int, image blob, PRIMARY KEY (x,y,z,s))";
    private static final String INDEX_DDL = "CREATE INDEX IF NOT EXISTS IND on tiles (x,y,z,s)";

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
}
