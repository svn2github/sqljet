package org.tmatesoft.sqljet.core.table;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class UnqiueIndexTest extends AbstractNewDbTest {
    private static final String[] schemaWithUniqueIndex =
    {
        "CREATE TABLE NODES ( wc_id  INTEGER NOT NULL REFERENCES WCROOT (id), local_relpath  TEXT NOT NULL, op_depth INTEGER NOT NULL, parent_relpath TEXT, repos_id INTEGER REFERENCES REPOSITORY (id), repos_path  TEXT, revision INTEGER, presence TEXT NOT NULL, moved_here INTEGER, moved_to TEXT, kind TEXT NOT NULL, properties  BLOB, depth  TEXT, checksum  TEXT, symlink_target  TEXT, changed_revision  INTEGER, changed_date INTEGER, changed_author TEXT, translated_size INTEGER, last_mod_time  INTEGER, dav_cache  BLOB, file_external INTEGER, inherited_props BLOB, PRIMARY KEY (wc_id, local_relpath, op_depth) );",
        "CREATE UNIQUE INDEX I_NODES_MOVED ON NODES (wc_id, moved_to, op_depth);",
        //"CREATE UNIQUE INDEX I_NODES_PARENT ON NODES (wc_id, parent_relpath, op_depth);", 
    };
        
    @Test
    public void testReplaceCorruptsTable() throws SqlJetException {
        createTables();
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B", "unique"));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E/beta", "A/B/E", "unique"));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B/replaced", "unique"));
                return null;
            }            
        }, SqlJetTransactionMode.WRITE);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor alreadyReplaced = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E/beta"});
                try {
                    Assert.assertTrue(alreadyReplaced.eof());
                } finally {
                    alreadyReplaced.close();
                }
                final ISqlJetCursor present = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E"});
                try {
                    Assert.assertEquals("A/B/replaced", present.getString("parent_relpath"));
                } finally {
                    present.close();
                }
                final ISqlJetCursor all = db.getTable("NODES").open();
                try {
                    Assert.assertEquals(1, all.getRowCount());
                } finally {
                    all.close();
                }
                return null;
            }
        }, SqlJetTransactionMode.READ_ONLY);
        
        db.close();

    }

    @Test
    public void testReplaceReplacesWrongRow() throws SqlJetException {
        createTables();
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B", "not_unique"));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E/beta", "A/B/E", "unique"));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B/replaced", "unique"));
                return null;
            }            
        }, SqlJetTransactionMode.WRITE);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor alreadyReplaced = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E/beta"});
                try {
                    Assert.assertTrue(alreadyReplaced.eof());
                } finally {
                    alreadyReplaced.close();
                }
                final ISqlJetCursor present = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E"});
                try {
                    Assert.assertEquals("unique", present.getString("moved_to"));
                } finally {
                    present.close();
                }
                final ISqlJetCursor all = db.getTable("NODES").open();
                try {
                    Assert.assertEquals(1, all.getRowCount());
                } finally {
                    all.close();
                }
                return null;
            }
        }, SqlJetTransactionMode.READ_ONLY);
        
        db.close();
    }

    @Test
    public void testNullsAreDistinctInUniqueColumn() throws SqlJetException {
        createTables();
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B", null));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E/beta", "A/B/E", null));
                db.getTable("NODES").insertByFieldNamesOr(SqlJetConflictAction.REPLACE, getRowForPath("A/B/E", "A/B/replaced", null));
                return null;
            }            
        }, SqlJetTransactionMode.WRITE);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor all = db.getTable("NODES").open();
                try {
                    Assert.assertEquals(2, all.getRowCount());
                } finally {
                    all.close();
                }
                final ISqlJetCursor twoRows = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E"});
                try {
                    Assert.assertEquals(1, twoRows.getRowCount());
                } finally {
                    twoRows.close();
                }
                final ISqlJetCursor oneRow = db.getTable("NODES").lookup(null, new Object[] {1, "A/B/E/beta"});
                try {
                    Assert.assertEquals(1, oneRow.getRowCount());
                } finally {
                    oneRow.close();
                }
                return null;
            }
        }, SqlJetTransactionMode.READ_ONLY);
        
        db.close();
    }

    private void createTables() throws SqlJetException {
        for (String sql : schemaWithUniqueIndex) {
        	System.out.println(sql);
            if (sql.startsWith("CREATE TABLE")) {
                db.createTable(sql);
            } else if (sql.startsWith("CREATE INDEX") || sql.startsWith("CREATE UNIQUE INDEX")) {
                db.createIndex(sql);
            } else if (sql.startsWith("CREATE VIEW")) {
                db.createView(sql);
            } else if (sql.startsWith("CREATE TRIGGER")) {
                db.createTrigger(sql);
            }
        }
    }
    
    private Map<String, Object> getRowForPath(String path, String parentPath, Object nullValue) {
        final Map<String, Object> values = new HashMap<String, Object>();        
        values.put("wc_id", 1);
        values.put("local_relpath", path);
        values.put("op_depth", 0);
        values.put("parent_relpath", parentPath);
        values.put("repos_id", 1);
        values.put("repos_path", path);
        values.put("revision", 1);
        values.put("presence", "normal");
        values.put("moved_here", null);
        values.put("moved_to", nullValue);
        values.put("kind", "dir");
        values.put("properties", "()");
        values.put("depth", "infinity");
        values.put("checksum", null); 
        values.put("symlink_target", null);
        values.put("changed_revision", 1);
        values.put("changed_date", 10000000000000L);
        values.put("changed_author", "jrandom");        
        values.put("translated_size", null);
        values.put("last_mod_time", null);
        values.put("dav_cache", null);
        values.put("file_external", null);
        values.put("inherited_props", null);
        System.out.println(values);
        return values;

    }
    

}
