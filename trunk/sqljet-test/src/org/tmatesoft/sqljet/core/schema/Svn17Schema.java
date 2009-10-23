/**
 * Svn17Schema.java
 * Copyright (C) 2009 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.schema;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class Svn17Schema extends AbstractNewDbTest {

    private static final String[] svn17WcTables =

    {
            "CREATE TABLE ACTUAL_NODE (   wc_id  INTEGER NOT NULL,   local_relpath  TEXT NOT NULL,   parent_relpath  TEXT,   properties  BLOB,   conflict_old  TEXT,   conflict_new  TEXT,   conflict_working  TEXT,   prop_reject  TEXT,     changelist  TEXT,   text_mod  TEXT,   tree_conflict_data  TEXT, conflict_data  BLOB, older_checksum  TEXT, left_checksum  TEXT, right_checksum  TEXT,   PRIMARY KEY (wc_id, local_relpath)   );",
            "CREATE TABLE BASE_NODE (   wc_id  INTEGER NOT NULL,   local_relpath  TEXT NOT NULL,   repos_id  INTEGER,   repos_relpath  TEXT,   parent_relpath  TEXT,   presence  TEXT NOT NULL,   kind  TEXT NOT NULL,   revnum  INTEGER,   checksum  TEXT,   translated_size  INTEGER,   changed_rev  INTEGER,   changed_date  INTEGER,     changed_author  TEXT,   depth  TEXT,   symlink_target  TEXT,   last_mod_time  INTEGER,     properties  BLOB,   dav_cache  BLOB,   incomplete_children  INTEGER,   file_external  TEXT,   PRIMARY KEY (wc_id, local_relpath)   );",
            "CREATE TABLE LOCK (   repos_id  INTEGER NOT NULL,   repos_relpath  TEXT NOT NULL,   lock_token  TEXT NOT NULL,   lock_owner  TEXT,   lock_comment  TEXT,   lock_date  INTEGER,      PRIMARY KEY (repos_id, repos_relpath)   );",
            "CREATE TABLE PRISTINE (   checksum  TEXT NOT NULL PRIMARY KEY,   compression  INTEGER,   size  INTEGER,   refcount  INTEGER NOT NULL   );",
            "CREATE TABLE REPOSITORY (   id INTEGER PRIMARY KEY AUTOINCREMENT,   root  TEXT UNIQUE NOT NULL,   uuid  TEXT NOT NULL   );",
            "CREATE TABLE WCROOT (   id  INTEGER PRIMARY KEY AUTOINCREMENT,   local_abspath  TEXT UNIQUE   );",
            "CREATE TABLE WC_LOCK (   wc_id  INTEGER NOT NULL,   local_dir_relpath  TEXT NOT NULL,   PRIMARY KEY (wc_id, local_dir_relpath)  );",
            "CREATE TABLE WORKING_NODE (   wc_id  INTEGER NOT NULL,   local_relpath  TEXT NOT NULL,   parent_relpath  TEXT,   presence  TEXT NOT NULL,   kind  TEXT NOT NULL,   checksum  TEXT,   translated_size  INTEGER,   changed_rev  INTEGER,   changed_date  INTEGER,     changed_author  TEXT,   depth  TEXT,   symlink_target  TEXT,   copyfrom_repos_id  INTEGER,   copyfrom_repos_path  TEXT,   copyfrom_revnum  INTEGER,   moved_here  INTEGER,   moved_to  TEXT,   last_mod_time  INTEGER,     properties  BLOB,   keep_local  INTEGER,   PRIMARY KEY (wc_id, local_relpath)   );",
            "CREATE TABLE WORK_QUEUE (   id  INTEGER PRIMARY KEY AUTOINCREMENT,   work  BLOB NOT NULL   );" };

    private static final String[] svn17WcIndices =

    { "CREATE INDEX I_ACTUAL_CHANGELIST ON ACTUAL_NODE (changelist);",
            "CREATE INDEX I_ACTUAL_PARENT ON ACTUAL_NODE (wc_id, parent_relpath);",
            "CREATE UNIQUE INDEX I_LOCAL_ABSPATH ON WCROOT (local_abspath);",
            "CREATE INDEX I_PARENT ON BASE_NODE (wc_id, parent_relpath);", "CREATE INDEX I_ROOT ON REPOSITORY (root);",
            "CREATE INDEX I_UUID ON REPOSITORY (uuid);",
            "CREATE INDEX I_WORKING_PARENT ON WORKING_NODE (wc_id, parent_relpath);" };

    @Test
    public void createSVN17WcDb() throws SqlJetException {
        for (String sql : svn17WcTables) {
            db.createTable(sql);
        }
        for (String sql : svn17WcIndices) {
            db.createIndex(sql);
        }
    }
}
