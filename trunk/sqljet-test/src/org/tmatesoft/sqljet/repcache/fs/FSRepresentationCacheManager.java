/**
 * FSRepresentationCacheManager.java
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
package org.tmatesoft.sqljet.repcache.fs;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetOptions;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class FSRepresentationCacheManager {

    public static final String REP_CACHE_TABLE = "rep_cache";
    private static final int REP_CACHE_DB_FORMAT = 1;
    private static final String REP_CACHE_DB_SQL = "create table rep_cache (hash text not null primary key, "
            + "                        revision integer not null, "
            + "                        offset integer not null, " + "                        size integer not null, "
            + "                        expanded_size integer not null); ";

    private SqlJetDb myRepCacheDB;
    private SqlJetTable myTable;
    private Object repositoryRoot;

    public static FSRepresentationCacheManager openRepresentationCache(File path) throws SqlJetException {
        final FSRepresentationCacheManager cacheObj = new FSRepresentationCacheManager();
        cacheObj.repositoryRoot = path;
        cacheObj.myRepCacheDB = SqlJetDb.open(path, true);
        cacheObj.myRepCacheDB.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                checkFormat(db);
                cacheObj.myTable = db.getTable(REP_CACHE_TABLE);
                return null;
            }
        });
        return cacheObj;
    }

    public static void createRepresentationCache(File path) throws SqlJetException {
        SqlJetDb db = null;
        try {
            db = SqlJetDb.open(path, true);
            db.runWithLock(new ISqlJetRunnableWithLock() {
                public Object runWithLock(SqlJetDb db) throws SqlJetException {
                    checkFormat(db);
                    return null;
                }
            });
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    private static void checkFormat(SqlJetDb db) throws SqlJetException {
        ISqlJetSchema schema = db.getSchema();
        final ISqlJetOptions options = db.getOptions();
        int version = options.getUserVersion();
        if (version < REP_CACHE_DB_FORMAT) {
            options.setAutovacuum(true);
            db.beginTransaction();
            try {
                options.setUserVersion(REP_CACHE_DB_FORMAT);                
                schema.createTable(FSRepresentationCacheManager.REP_CACHE_DB_SQL);
                db.commit();
            } catch (SqlJetException e) {
                db.rollback();
                throw e;
            }
        } else if (version > REP_CACHE_DB_FORMAT) {
            throw new SqlJetException("Schema format " + version + " not recognized");
        }

    }

    public void insert(final FSRepresentation representation, boolean rejectDup) throws SqlJetException {
        if (representation.getSHA1HexDigest() == null) {
            throw new SqlJetException(SqlJetErrorCode.MISUSE,
                    "Only SHA1 checksums can be used as keys in the rep_cache table.\n");
        }

        FSRepresentation oldRep = getRepresentationByHash(representation.getSHA1HexDigest());
        if (oldRep != null) {
            if (rejectDup
                    && (oldRep.getRevision() != representation.getRevision()
                            || oldRep.getOffset() != representation.getOffset()
                            || oldRep.getSize() != representation.getSize() || oldRep.getExpandedSize() != representation
                            .getExpandedSize())) {
                throw new SqlJetException(SqlJetErrorCode.MISUSE,String.format(
                                "Representation key for checksum ''{0}'' exists in "
                                        + "filesystem ''{1}'' with a different value ({2},{3},{4},{5}) than what we were about to store ({6},{7},{8},{9})",
                                new Object[] { representation.getSHA1HexDigest(), getRepositoryRoot(),
                                        String.valueOf(oldRep.getRevision()), String.valueOf(oldRep.getOffset()),
                                        String.valueOf(oldRep.getSize()), String.valueOf(oldRep.getExpandedSize()),
                                        String.valueOf(representation.getRevision()),
                                        String.valueOf(representation.getOffset()),
                                        String.valueOf(representation.getSize()),
                                        String.valueOf(representation.getExpandedSize()) }));
            }

            return;
        }

        myRepCacheDB.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor lookup = null;
                try {
                    lookup = myTable.lookup(myTable.getPrimaryKeyIndexName(), new Object[] { representation
                            .getSHA1HexDigest() });
                    if (!lookup.eof()) {
                        return null;
                    }
                } finally {
                    if (lookup != null) {
                        lookup.close();
                    }
                }
                db.beginTransaction();
                try {
                    myTable.insert(new Object[] { representation.getSHA1HexDigest(),
                            new Long(representation.getRevision()), new Long(representation.getOffset()),
                            new Long(representation.getSize()), new Long(representation.getExpandedSize()) });
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    /**
     * @return
     */
    private Object getRepositoryRoot() {
        return repositoryRoot;
    }

    public void close() throws SqlJetException {
        myRepCacheDB.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                myRepCacheDB.close();
                return null;
            }
        });
    }

    public FSRepresentation getRepresentationByHash(String hash) throws SqlJetException {
        FSRepresentationCacheRecord cache = getByHash(hash);
        if (cache != null) {
            FSRepresentation representation = new FSRepresentation();
            representation.setExpandedSize(cache.getExpandedSize());
            representation.setOffset(cache.getOffset());
            representation.setRevision(cache.getRevision());
            representation.setSize(cache.getSize());
            return representation;
        }
        return null;
    }

    private FSRepresentationCacheRecord getByHash(final String hash) throws SqlJetException {
        return (FSRepresentationCacheRecord) myRepCacheDB.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor lookup = null;
                try {
                    lookup = myTable.lookup(myTable.getPrimaryKeyIndexName(), new Object[] { hash });
                    if (!lookup.eof()) {
                        return new FSRepresentationCacheRecord(lookup);
                    }
                } finally {
                    if (lookup != null) {
                        lookup.close();
                    }
                }
                return null;
            }
        });
    }

}
