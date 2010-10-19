/**
 * CorruptIndexTest.java
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
package org.tmatesoft.sqljet.issues._133;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class CorruptIndexTest extends AbstractNewDbTest {

    private static final String TABLE_CREATE = "CREATE TABLE IF NOT EXISTS places (place_id INTEGER PRIMARY KEY AUTOINCREMENT,geoid INTEGER NOT NULL,class_id INTEGER NOT NULL,country_id INTEGER NOT NULL,name TEXT NOT NULL,user_defined INTEGER NOT NULL,location_lon INTEGER,location_lat INTEGER )";
    private static final String INDEX1_CREATE = "CREATE INDEX IF NOT EXISTS places_geoid_idx ON places(geoid)";
    private static final String INDEX2_CREATE = "CREATE INDEX IF NOT EXISTS places_country_id_name_idx ON places(country_id,name)";

    private static final int COUNT = 10000;

    @Test
    public void testCorruptIndex() throws Exception {
        final ISqlJetTableDef createTable = db.createTable(TABLE_CREATE);
        db.createIndex(INDEX1_CREATE);
        db.createIndex(INDEX2_CREATE);

        final ISqlJetTable table = db.getTable(createTable.getName());

        for (int i = 0; i < COUNT; i++) {
            table.insert(null, i, i, i, "test", i, i, i);
        }

        for (int i = 0; i < COUNT; i++) {
            final int id = i;
            db.runWriteTransaction(new ISqlJetTransaction() {
                public Object run(SqlJetDb db) throws SqlJetException {
                    table.insert(null, id, id, id, "test", id, id, id);
                    return null;
                }
            });
        }

        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                for (int i = 0; i < COUNT; i++) {
                    table.insert(null, i, i, i, "test", i, i, i);
                }
                return null;
            }
        });

    }
}
