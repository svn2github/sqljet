CREATE TABLE NODES ( wc_id  INTEGER NOT NULL REFERENCES WCROOT (id), local_relpath  TEXT NOT NULL, op_depth INTEGER NOT NULL, parent_relpath TEXT, repos_id INTEGER REFERENCES REPOSITORY (id), repos_path  TEXT, revision INTEGER, presence TEXT NOT NULL, moved_here INTEGER, moved_to TEXT, kind TEXT NOT NULL, properties  BLOB, depth  TEXT, checksum  TEXT, symlink_target  TEXT, changed_revision  INTEGER, changed_date INTEGER, changed_author TEXT, translated_size INTEGER, last_mod_time  INTEGER, dav_cache  BLOB, file_external INTEGER, inherited_props BLOB, PRIMARY KEY (wc_id, local_relpath, op_depth) );

CREATE UNIQUE INDEX I_NODES_MOVED ON NODES (wc_id, moved_to, op_depth);

INSERT OR REPLACE INTO NODES (changed_revision, symlink_target, changed_date, repos_path, checksum, moved_to, properties, dav_cache, depth, repos_id, kind, inherited_props, file_external, translated_size, revision, wc_id, presence, local_relpath, parent_relpath, last_mod_time, changed_author, op_depth, moved_here) VALUES (1, NULL, 10000000000000, "A/B/E", NULL, "not_unique", "()", NULL, "infinity", 1, "dir", NULL, NULL, NULL, 1, 1, "normal", "A/B/E", "A/B", NULL, "jrandom", 0, NULL);

INSERT OR REPLACE INTO NODES (changed_revision, symlink_target, changed_date, repos_path, checksum, moved_to, properties, dav_cache, depth, repos_id, kind, inherited_props, file_external, translated_size, revision, wc_id, presence, local_relpath, parent_relpath, last_mod_time, changed_author, op_depth, moved_here) VALUES (1, NULL, 10000000000000, "A/B/E/beta", NULL, "unique", "()", NULL, "infinity", 1, "dir", NULL, NULL, NULL, 1, 1, "normal", "A/B/E/beta", "A/B/E", NULL, "jrandom", 0, NULL);

INSERT OR REPLACE INTO NODES (changed_revision, symlink_target, changed_date, repos_path, checksum, moved_to, properties, dav_cache, depth, repos_id, kind, inherited_props, file_external, translated_size, revision, wc_id, presence, local_relpath, parent_relpath, last_mod_time, changed_author, op_depth, moved_here) VALUES (1, NULL, 10000000000000, "A/B/E", NULL, "unique", "()", NULL, "infinity", 1, "dir", NULL, NULL, NULL, 1, 1, "normal", "A/B/E", "A/B/replaced", NULL, "jrandom", 0, NULL);

SELECT COUNT(*) FROM NODES WHERE wc_id==1 AND local_relpath=="A/B/E/beta";
SELECT COUNT(*) FROM NODES WHERE wc_id==1 AND local_relpath=="A/B/E" AND moved_to=="unique";
SELECT COUNT(*) FROM NODES;

