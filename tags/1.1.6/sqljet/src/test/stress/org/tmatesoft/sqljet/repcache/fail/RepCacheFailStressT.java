/**
 * RepCacheFail.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.repcache.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCacheFailStressT extends AbstractDataCopyTest {

    public static final String DB_ARCHIVE = "src/test/data/db/rep-cache/fail/rep-cache.zip";
    public static final String DB_FILE_NAME = "rep-cache.db";
    public static final String TABLE = "rep_cache";

    @Test
    public void repCacheFail() throws Exception {

        final File dbFile1 = File.createTempFile("repCacheFail", null);
        final File dbFile2 = File.createTempFile("repCacheFail", null);
        dbFile2.deleteOnExit();

        deflate(new File(DB_ARCHIVE), DB_FILE_NAME, dbFile1, true);

        final SqlJetDb db1 = SqlJetDb.open(dbFile1, false);
        final SqlJetDb db2 = SqlJetDb.open(dbFile2, true);

        db2.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table rep_cache (hash text not null primary key, "
                        + "                        revision integer not null, "
                        + "                        offset integer not null, "
                        + "                        size integer not null, "
                        + "                        expanded_size integer not null); ");
                return null;
            }
        });

        db1.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = null;
                final Collection<Object> values = new ArrayList<Object>();
                final Collection<Collection<Object>> block = new LinkedList<Collection<Object>>();
                try {
                    c = db.getTable("rep_cache").open();
                    long currentRev = 0;
                    while (!c.eof()) {
                        values.clear();
                        for (int i = 0; i < c.getFieldsCount(); i++) {
                            values.add(c.getValue(i));
                        }
                        long rev = c.getInteger(1);
                        if (rev != currentRev) {
                            db2.runWriteTransaction(new ISqlJetTransaction() {
                                public Object run(SqlJetDb db) throws SqlJetException {
                                    for (Collection<Object> row : block) {
                                        db2.getTable("rep_cache").insert(row.toArray());
                                    }
                                    return null;
                                }
                            });

                            currentRev = rev;
                            block.clear();
                        }
                        block.add(new ArrayList<Object>(values));
                        c.next();
                    }
                    if (!block.isEmpty()) {
                        db2.runWriteTransaction(new ISqlJetTransaction() {
                            public Object run(SqlJetDb db) throws SqlJetException {
                                for (Collection<Object> row : block) {
                                    db2.getTable("rep_cache").insert(row.toArray());
                                }
                                return null;
                            }
                        });
                    }
                } finally {
                    if (c != null) {
                        c.close();
                    }
                }
                return null;
            }
        });

    }
}
