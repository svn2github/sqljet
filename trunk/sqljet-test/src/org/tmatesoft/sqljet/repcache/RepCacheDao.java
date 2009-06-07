/**
 * RepCacheDao.java
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
 */
package org.tmatesoft.sqljet.repcache;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.SqlJetCursor;
import org.tmatesoft.sqljet.core.internal.table.SqlJetIndex;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCacheDao {

    public static final String REP_CACHE_DAO = "RepCacheDao";

    public static final String REP_CACHE_TABLE = SqlJetUtility.getSysProp(REP_CACHE_DAO + ".REP_CACHE_TABLE",
            "rep_cache");

    private SqlJetDb db;
    private SqlJetTable table;
    private ISqlJetCursor cursor;

    /**
     * @throws SqlJetException
     * 
     */
    public RepCacheDao(File file, boolean write) throws SqlJetException {
        db = SqlJetDb.open(file, write);
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock() throws SqlJetException {
                table = db.openTable(REP_CACHE_TABLE);
                cursor = table.open();
                return null;
            }
        });
    }

    public void close() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                cursor.close();
                db.close();
                return null;
            }
        });
    }

    public void beginTransaction() throws SqlJetException {
        db.beginTransaction();
    }

    public void commit() throws SqlJetException {
        db.commit();
    }

    public void rollback() throws SqlJetException {
        db.rollback();
    }

    public boolean eof() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return cursor.eof();
            }
        });
    }

    public boolean first() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return cursor.first();
            }
        });
    }

    public boolean last() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return cursor.last();
            }
        });
    }

    public boolean next() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return cursor.next();
            }
        });
    }

    public boolean previous() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return cursor.previous();
            }
        });
    }

    public RepCache getRepCache() throws SqlJetException {
        return (RepCache) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return new RepCache(cursor);
            }
        });
    }

    public RepCache getByHash(final String hash) throws SqlJetException {
        return (RepCache) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndex(), hash);
                if (!lookup.eof())
                    return new RepCache(lookup);

                return null;
            }
        });
    }

    public boolean deleteByHash(final String hash) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {

                final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndex(), hash);
                if (!lookup.eof()) {
                    db.beginTransaction();
                    try {
                        lookup.delete();
                        db.commit();
                    } catch (SqlJetException e) {
                        db.rollback();
                    }
                }

                return true;
            }
        });
    }

    public boolean insert(final RepCache repCache) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndex(), repCache.getHash());
                if (!lookup.eof())
                    return false;
                db.beginTransaction();
                try {
                    final long newRowId = table.insert(repCache.getHash(), repCache.getRevision(),
                            repCache.getOffset(), repCache.getSize(), repCache.getExpandedSize());
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                }
                return true;
            }
        });
    }

    public boolean update(final RepCache repCache) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndex(), repCache.getHash());
                if (lookup.eof())
                    return false;
                db.beginTransaction();
                try {
                    lookup.update(repCache.getHash(), repCache.getRevision(), repCache.getOffset(), repCache.getSize(),
                            repCache.getExpandedSize());
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                }
                return true;
            }
        });
    }
}
