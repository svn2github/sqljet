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
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.SqlJetDb;
import org.tmatesoft.sqljet.core.table.SqlJetIndex;
import org.tmatesoft.sqljet.core.table.SqlJetTable;

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
    private SqlJetIndex index;

    /**
     * @throws SqlJetException
     * 
     */
    public RepCacheDao(File file, boolean write) throws SqlJetException {
        db = SqlJetDb.open(file, write);
        table = db.openTable(REP_CACHE_TABLE);
        index = db.openIndex(db.getSchema().getIndexes(REP_CACHE_TABLE).iterator().next().getName());
    }

    public void close() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                table.close();
                index.close();
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
                return table.eof();
            }
        });
    }

    public boolean first() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return table.first();
            }
        });
    }

    public boolean last() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return table.last();
            }
        });
    }

    public boolean next() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return table.next();
            }
        });
    }

    public boolean previous() throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return table.previous();
            }
        });
    }

    public RepCache getRepCache() throws SqlJetException {
        return (RepCache) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                return new RepCache(table);
            }
        });
    }

    public RepCache getByHash(final String hash) throws SqlJetException {
        return (RepCache) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final long rowId = index.lookup(false, hash);
                if (0 == rowId)
                    return null;
                if (!table.goToRow(rowId) && !table.next())
                    return null;
                return getRepCache();
            }
        });
    }

    public boolean deleteByHash(final String hash) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final long rowId = index.lookup(false, hash);
                if (0 == rowId)
                    return null;
                if (!table.goToRow(rowId) && !table.next())
                    return false;
                beginTransaction();
                index.delete(rowId, hash);
                table.delete(rowId);
                commit();
                return true;
            }
        });
    }

    public boolean insert(final RepCache repCache) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final long rowId = index.lookup(false, repCache.getHash());
                if (0 != rowId) {
                    return false;
                }
                beginTransaction();
                final long newRowId = table.insert(repCache.getHash(), repCache.getRevision(), repCache.getOffset(),
                        repCache.getSize(), repCache.getExpandedSize());
                index.insert(newRowId, repCache.getHash());
                commit();
                return true;
            }
        });
    }

    public boolean update(final RepCache repCache) throws SqlJetException {
        return (Boolean) db.runWithLock(new ISqlJetRunnableWithLock() {

            public Object runWithLock() throws SqlJetException {
                final long rowId = index.lookup(false, repCache.getHash());
                if (0 == rowId)
                    return false;
                if (!table.goToRow(rowId) && !table.next())
                    return false;
                beginTransaction();
                table.update(rowId, repCache.getHash(), repCache.getRevision(), repCache.getOffset(), repCache
                        .getSize(), repCache.getExpandedSize());
                commit();
                return true;
            }
        });
    }
}
