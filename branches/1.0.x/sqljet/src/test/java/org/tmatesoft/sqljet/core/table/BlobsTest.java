package org.tmatesoft.sqljet.core.table;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;

public class BlobsTest extends AbstractNewDbTest {

    private static final String T_DDL = "CREATE TABLE t (x int, image blob, PRIMARY KEY (x))";
    private static final String T_DDL_2 = "CREATE TABLE t (x int, image blob, t text, PRIMARY KEY (x))";

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

        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
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
                return null;
            }
        });

    }
    
    @Test
    public void updateButBlob() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable(T_DDL_2);
                return true;
            }
        });

        final SecureRandom rnd = new SecureRandom();
        final ISqlJetTable t = db.getTable("t");
        final byte[] blob = "text".getBytes();
        final String text = "text";

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                try {
                    for(int i = 0; i < 10000; i++) {
                        t.insert(rnd.nextInt(2048), blob, text);
                    }
                } catch (SqlJetException e) {
                    if (!SqlJetErrorCode.CONSTRAINT.equals(e.getErrorCode())) {
                        throw e;
                    }
                }
                return true;
            }
        });

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                Map<String, Object> values = new HashMap<String, Object>();
                try {
                    if (!c.eof()) {
                        do {                            
                            while (true) {
                                values.put("x", rnd.nextInt(2048) + 1024);
                                try {
                                    c.updateByFieldNames(values);
                                    break;
                                } catch (SqlJetException e) {
                                    if (!SqlJetErrorCode.CONSTRAINT.equals(e.getErrorCode())) {
                                        throw e;
                                    }
                                }
                            }
                        } while (c.next());
                    }
                } finally {
                    c.close();
                }
                return null;
            }
        });

        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                try {
                    if (!c.eof()) {
                        do {
                            byte[] b = c.getBlobAsArray("image");
                            long xValue = c.getInteger("x");
                            String tValue = c.getString("t");
                            Assert.assertArrayEquals(b, blob);
                            Assert.assertTrue(xValue >= 1024);
                            Assert.assertEquals(text, tValue);
                        } while (c.next());
                    }
                } finally {
                    c.close();
                }
                return null;
            }
        });
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

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
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
                return null;
            }
        });

    }

}
