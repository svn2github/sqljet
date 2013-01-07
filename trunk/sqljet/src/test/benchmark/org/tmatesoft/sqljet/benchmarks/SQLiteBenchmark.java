/**
 * NestedVmBenchmark.java
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
package org.tmatesoft.sqljet.benchmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Random;

import org.junit.BeforeClass;

import junit.framework.Assert;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SQLiteBenchmark extends AbstractBenchmark {

    private Connection conn;
    private Statement stat;

    @BeforeClass
    static public void setUpClass() throws Exception {
        AbstractBenchmark.setUpClass();
        final SQLiteBenchmark warmUp = new SQLiteBenchmark();
        warmUp.warmUp();
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile.getAbsolutePath());
        stat = conn.createStatement();
    }

    @Override
    public void tearDown() throws Exception {
        if (conn != null) {
            conn.close();
        }
        super.tearDown();
    }

    @Override
    public void nothing() throws Exception {
    }

    @Override
    public void selectAll() throws Exception {
        measure("NestedVmBenchmark.selectAll", new Measure() {
            public void measure() throws Exception {
                ResultSet rs = stat.executeQuery(String.format("select * from %s;", TABLE_NAME));
                final ResultSetMetaData metaData = rs.getMetaData();
                final int columnCount = metaData.getColumnCount();
                int rows = 0;
                while (rs.next()) {
                    final StringBuilder s = new StringBuilder();
                    for (int column = 1; column <= columnCount; column++) {
                        final Object value = rs.getObject(column);
                        s.append(value).append(" ");
                    }
                    logger.info(s.toString());
                    rows++;
                }
                logger.info(String.format("rows %d", rows));
                rs.close();
            }
        });
    }

    @Override
    public void updateAll() throws Exception {
        measure("NestedVmBenchmark.updateAll", new Measure() {
            public void measure() throws Exception {
                stat.execute(String.format("update %s set revision=revision+1;", TABLE_NAME));
            }
        });
    }

    @Override
    public void deleteAll() throws Exception {
        measure("NestedVmBenchmark.deleteAll", new Measure() {
            public void measure() throws Exception {
                stat.execute(String.format("delete from %s where hash is not null;", TABLE_NAME));
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.benchmarks.AbstractBenchmark#insertRandoms()
     */
    @Override
    public void insertRandoms() throws Exception {
        measure("NestedVmBenchmark.insertRandoms", new Measure() {
            public void measure() throws Exception {
                conn.setAutoCommit(false);
                final PreparedStatement prep = conn.prepareStatement(String.format(
                        "insert into %s(hash,revision,offset,size,expanded_size) " + "values(?,?,?,?,?);", TABLE_NAME));
                boolean success = false;
                try {
                    final Random rand = new Random();
                    for (int i = 0; i < COUNT; i++) {
                        prep.setString(1, Long.toString(Math.abs(rand.nextLong())));
                        prep.setLong(2, Math.abs(rand.nextLong()));
                        prep.setLong(3, Math.abs(rand.nextLong()));
                        prep.setLong(4, Math.abs(rand.nextLong()));
                        prep.setLong(5, Math.abs(rand.nextLong()));
                        prep.execute();
                    }
                    conn.commit();
                    success = true;
                } finally {
                    try {
                        if (success) {
                            conn.rollback();
                        }
                    } finally {
                        conn.setAutoCommit(true);
                    }
                    prep.close();
                }
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.benchmarks.AbstractBenchmark#clear()
     */
    @Override
    public void clear() throws Exception {
        measure("NestedVmBenchmark.clear", new Measure() {
            public void measure() throws Exception {
                stat.execute(String.format("delete from %s;", TABLE_NAME));
            }
        });
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.benchmarks.AbstractBenchmark#locate()
     */
    @Override
    public void locate() throws Exception {
        measure("NestedVmBenchmark.locate", new Measure() {
            public void measure() throws Exception {
                final PreparedStatement prep = conn.prepareStatement(String.format("select * from %s where hash=?;",
                        TABLE_NAME));
                for (int i = 0; i < COUNT; i++) {
                    for (String hashe : LOCATE_HASHES) {
                        prep.setString(1, hashe);
                        final ResultSet rs = prep.executeQuery();
                        try {
                            Assert.assertFalse(rs.isAfterLast());
                            logger.info(rs.getString(1));
                        } finally {
                            rs.close();
                        }
                    }
                }
                prep.close();
            }
        });
    }

}
