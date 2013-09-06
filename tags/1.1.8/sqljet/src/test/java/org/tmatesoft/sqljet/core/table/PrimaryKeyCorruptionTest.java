package org.tmatesoft.sqljet.core.table;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;

public class PrimaryKeyCorruptionTest extends AbstractNewDbTest {

    private static final String[] fullSchema =
    {
        "CREATE TABLE NODES ( " +
                "wc_id INTEGER NOT NULL, " +
                "local_relpath TEXT NOT NULL, " +
                "op_depth INTEGER NOT NULL, " +
                "parent_relpath TEXT, " +
                "repos_id INTEGER, " +
                "repos_path TEXT, " +
                "revision INTEGER, " +
                "presence TEXT NOT NULL, " +
                "moved_here INTEGER, " +
                "moved_to TEXT, " +
                "kind TEXT NOT NULL, " +
                "properties  BLOB, " +
                "depth TEXT, " +
                "checksum  TEXT," +
                "symlink_target TEXT, " +
                "changed_revision INTEGER, " +
                "changed_date INTEGER, " +
                "changed_author TEXT, " +
                "translated_size INTEGER, " +
                "last_mod_time INTEGER, " +
                "dav_cache BLOB, " +
                "file_external INTEGER, " +
                "inherited_props BLOB, " +
                "PRIMARY KEY (wc_id, local_relpath, op_depth) );", 
    };

    @Test
    public void testInsertCorruptsTable() throws SqlJetException {
        createTables(fullSchema);

        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "", "parent_relpath", null, "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A", "parent_relpath", "", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/B", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/B", "parent_relpath", "A", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/B/E", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/B/E", "parent_relpath", "A/B", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B/E/beta", "properties", new byte[] {40,41}, "checksum", "$sha1$d001710ac8e622c6d1fe59b1e265a3908acdd2a3", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B/E/beta", "parent_relpath", "A/B/E", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B/E/alpha", "properties", new byte[] {40,41}, "checksum", "$sha1$b347d1da69df9a6a70433ceeaa0d46c8483e8c03", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B/E/alpha", "parent_relpath", "A/B/E", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B/E", "properties", new byte[] {40,41}, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B/E", "parent_relpath", "A/B", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/B/F", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/B/F", "parent_relpath", "A/B", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B/F", "properties", new byte[] {40,41}, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B/F", "parent_relpath", "A/B", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B/lambda", "properties", new byte[] {40,41}, "checksum", "$sha1$784a9298366863da2b65ebf82b4e1123755a2421", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B/lambda", "parent_relpath", "A/B", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/B", "properties", new byte[] {40,41}, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/B", "parent_relpath", "A", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/C", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/C", "parent_relpath", "A", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/C", "properties", new byte[] {40,41}, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/C", "parent_relpath", "A", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/D", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/D", "parent_relpath", "A", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/D/G", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/D/G", "parent_relpath", "A/D", "last_mod_time", null, "changed_author", null, "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/D/G/tau", "properties", new byte[] {40,41}, "checksum", "$sha1$62e8c07d56bee94ea4577e80414fa8805aaf0175", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/D/G/tau", "parent_relpath", "A/D/G", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/D/G/pi", "properties", new byte[] {40,41}, "checksum", "$sha1$411e258dc14b42701fdc29b75f653e93f8686415", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/D/G/pi", "parent_relpath", "A/D/G", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 2L, "symlink_target", null, "changed_date", 1363808353056975L, "repos_path", "A/D/G/rho", "properties", new byte[] {40,41}, "checksum", "$sha1$e263cd0ae5ccb242013a48113684674f0902ae63", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/D/G/rho", "parent_relpath", "A/D/G", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 2L, "symlink_target", null, "changed_date", 1363808353056975L, "repos_path", "A/D/G", "properties", new byte[] {40,41}, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/D/G", "parent_relpath", "A/D", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", 1L, "symlink_target", null, "changed_date", 1363808351828940L, "repos_path", "A/D/gamma", "properties", new byte[] {40,41}, "checksum", "$sha1$74b75d7f2e1a0292f17d5a57c570bd89783f5d1c", "dav_cache", null, "repos_id", 1L, "depth", null, "kind", "file", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "normal", "local_relpath", "A/D/gamma", "parent_relpath", "A/D", "last_mod_time", null, "changed_author", "jrandom", "op_depth", 0L);
        insertRow( "NODES", "changed_revision", null, "symlink_target", null, "changed_date", null, "repos_path", "A/D/H", "properties", null, "checksum", null, "dav_cache", null, "repos_id", 1L, "depth", "infinity", "kind", "dir", "file_external", null, "translated_size", null, "revision", 2L, "wc_id", 1L, "presence", "incomplete", "local_relpath", "A/D/H", "parent_relpath", "A/D", "last_mod_time", null, "changed_author", null, "op_depth", 0L);

        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor twoRows = db.getTable("NODES").lookup(null, new Object[] {1, "A/D/gamma", 0});
                try {
                    Assert.assertEquals(1, twoRows.getRowCount());
                    Assert.assertEquals("A/D/gamma", twoRows.getValue("local_relpath"));
                } finally {
                    twoRows.close();
                }
                return null;
            }
        }, SqlJetTransactionMode.READ_ONLY);
    }

    private void createTables(String[] schema) throws SqlJetException {
        for (String sql : schema) {
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
    
    private long insertRow(final String tableName, Object... row) throws SqlJetException {
        final Map<String, Object> values = new HashMap<String, Object>();
        for (int i = 0; i < row.length; i+=2) {
            final Object name = row[i];
            final Object value = row[i+1];
            if (name != null) {
                values.put(name.toString(), value);
            }
        }

        final Long rowId = (Long) db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                return db.getTable(tableName).insertByFieldNamesOr(SqlJetConflictAction.REPLACE, values);
            }
        }, SqlJetTransactionMode.WRITE);
        System.out.println(rowId);
        return rowId;
    }

}
