/**
 * LeftOuterJoin.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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
package org.tmatesoft.sqljet.svn17;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class Svn17WCDao {

    /*
     * "select base_node.repos_id, base_node.repos_relpath, presence, kind, " \
     * " revnum, checksum, translated_size, changed_rev, changed_date, " \
     * " changed_author, depth, symlink_target, last_mod_time, properties, " \
     * " lock_token, lock_owner, lock_comment, lock_date " \ "from base_node " \
     * "left outer join lock on base_node.repos_id = lock.repos_id " \
     * " and base_node.repos_relpath = lock.repos_relpath " \
     * "where wc_id = ?1 and local_relpath = ?2; " \ ""
     */

    private static final File WC = new File("src/test/data/db/svn1.7/wc.db");

    private static final String BASE_NODE = "base_node";

    private static final String[] BASE_NODE_FIELDS = { "repos_id", "repos_relpath", "presence", "kind", "revnum",
            "checksum", "translated_size", "changed_rev", "changed_date", "changed_author", "depth", "symlink_target",
            "last_mod_time", "properties" };

    private static final String LOCK = "lock";

    private static final String[] LOCK_FIELDS = { "lock_token", "lock_owner", "lock_comment", "lock_date" };

    private static final String BASE_NODE_JOIN_LOCK_FIELD1 = "repos_id";
    private static final String BASE_NODE_JOIN_LOCK_FIELD2 = "repos_relpath";

    private SqlJetDb db;

    public void open() throws SqlJetException {
        open(WC);
    }

    public void open(final File wc) throws SqlJetException {
        close();
        db = SqlJetDb.open(wc, true);
    }

    public void close() throws SqlJetException {
        if (db != null) {
            db.close();
        }
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> queryBaseNodeWithLock(final long wc_id, final String local_relpath,
            final boolean withLock) throws SqlJetException {

        assert (wc_id > 0);
        assert (null != local_relpath);

        return (Map<String, Object>) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor base_node = db.getTable(BASE_NODE).lookup(null, wc_id, local_relpath);
                if (base_node.eof()) {
                    return Collections.EMPTY_MAP;
                } else {
                    final Map<String, Object> result = new HashMap<String, Object>();
                    for (String field : BASE_NODE_FIELDS) {
                        result.put(field, base_node.getValue(field));
                    }
                    if (withLock) {
                        final ISqlJetCursor lock = db.getTable(LOCK).lookup(null,
                                result.get(BASE_NODE_JOIN_LOCK_FIELD1), result.get(BASE_NODE_JOIN_LOCK_FIELD2));
                        if (!lock.eof()) {
                            for (String field : LOCK_FIELDS) {
                                result.put(field, lock.getValue(field));
                            }
                        }
                    }
                    return result;
                }
            }
        });

    }

    @Before
    public void setUp() throws SqlJetException {
        open();
    }

    @After
    public void tearDown() throws SqlJetException {
        close();
    }

    @Test
    public void testBaseNodeWithLock() throws SqlJetException {
        final Map<String, Object> bn1A = queryBaseNodeWithLock(1, "A", true);
        Assert.assertNotNull(bn1A);
        Assert.assertTrue(bn1A.size() > 0);
    }

}
