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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.repcache;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
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

    public RepCacheDao(File file, boolean write) throws SqlJetException {
        db = SqlJetDb.open(file, write);
        table = db.getTable(REP_CACHE_TABLE);
        cursor = table.open();
    }

    public void close() throws SqlJetException {
        cursor.close();
        db.close();
    }

    public boolean eof() throws SqlJetException {
        return cursor.eof();
    }

    public boolean first() throws SqlJetException {
        return cursor.first();
    }

    public boolean last() throws SqlJetException {
        return cursor.last();
    }

    public boolean next() throws SqlJetException {
        return cursor.next();
    }

    public boolean previous() throws SqlJetException {
        return cursor.previous();
    }

    public RepCache getRepCache() throws SqlJetException {
        return new RepCache(cursor);
    }

    public RepCache getByHash(final String hash) throws SqlJetException {
        final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), hash);
        return lookup.eof() ? null : new RepCache(lookup);
    }

    public boolean deleteByHash(final String hash) throws SqlJetException {
        final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), hash);
        if (!lookup.eof()) {
            db.runWriteTransaction(new ISqlJetTransaction() {

                public Object run(SqlJetDb db) throws SqlJetException {
                    lookup.delete();
                    return null;
                }
            });
        }
        return true;
    }

    public boolean insert(final RepCache repCache) throws SqlJetException {
        final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), repCache.getHash());
        if (!lookup.eof()) {
            return false;
        }
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                table.insert(repCache.getHash(), repCache.getRevision(), repCache.getOffset(), repCache.getSize(),
                        repCache.getExpandedSize());
                return null;
            }
        });
        return true;
    }

    public boolean update(final RepCache repCache) throws SqlJetException {
        final ISqlJetCursor lookup = table.lookup(table.getPrimaryKeyIndexName(), repCache.getHash());
        if (lookup.eof()) {
            return false;
        }
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                lookup.update(repCache.getHash(), repCache.getRevision(), repCache.getOffset(), repCache.getSize(),
                        repCache.getExpandedSize());
                return null;
            }
        });
        return true;
    }
}
