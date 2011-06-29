/**
 * JetCurruptionTest.java
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author jhruby.web
 *
 */
public class JetCurruptionStress {

    private File dbFile;
    private SqlJetDb db;

    @Before
    public void setUp() throws Exception {
        String tmp = System.getProperty("java.io.tmpdir");
        dbFile = new File(tmp, "jetdbtest.db");
        db = SqlJetDb.open(dbFile, true);
        db.createTable("CREATE TABLE IF NOT EXISTS places (place_id INTEGER PRIMARY KEY AUTOINCREMENT,geoid INTEGER NOT NULL,class_id INTEGER NOT NULL,country_id INTEGER NOT NULL,name TEXT NOT NULL,user_defined INTEGER NOT NULL,location_lon INTEGER,location_lat INTEGER)");
        db.createIndex("CREATE INDEX IF NOT EXISTS places_geoid_idx ON places(geoid)");
        db.createIndex("CREATE INDEX IF NOT EXISTS places_country_id_name_idx ON places(country_id,name)");
    }

    @After
    public void tearDown() throws Exception {
        db.close();
        dbFile.delete();
    }

    @Test
    public void testLoadManyData() throws Exception {
        ISqlJetTable table = db.getTable("places");
        try {
            db.beginTransaction(SqlJetTransactionMode.WRITE);
            File errTxt = new File("src/test/data/issues/133/err.txt");
            FileInputStream input = new FileInputStream(errTxt);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input, "utf-8"));

            int counter = 0;
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] data = line.split("\t");

                table.insert(null, Long.valueOf(data[1]), Long.valueOf(data[2]), Long.valueOf(data[3]), data[4],
                        Long.valueOf(data[5]), Long.valueOf(data[6]), Long.valueOf(data[7]));

                counter++;
                if (counter % 1000 == 0) {
                    db.commit();
                    db.beginTransaction(SqlJetTransactionMode.WRITE);
                }
            }

        } finally {
            db.commit();
        }
    }

}
