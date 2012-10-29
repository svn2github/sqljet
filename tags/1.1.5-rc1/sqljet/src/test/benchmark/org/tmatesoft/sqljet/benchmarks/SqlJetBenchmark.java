/**
 * SqlJetBenchmark.java
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
package org.tmatesoft.sqljet.benchmarks;

import java.util.Random;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBenchmark extends AbstractBenchmark {

    private SqlJetDb db;
    private ISqlJetTable table;

    @BeforeClass
    static public void setUpClass() throws Exception {
        AbstractBenchmark.setUpClass();
        final SqlJetBenchmark warmUp = new SqlJetBenchmark();
        warmUp.warmUp();
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        db = SqlJetDb.open(dbFile, true);
        table = db.getTable(TABLE_NAME);
    }

    @Override
    public void tearDown() throws Exception {
        if (null != db) {
            db.close();
        }
        super.tearDown();
    }

    @Override
    public void nothing() throws Exception {
    }

    @Override
    public void selectAll() throws Exception {
        measure("SqlJetBenchmark.selectAll", new Measure() {
            public void measure() throws Exception {
                db.runReadTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor c = table.open();
                        try {
                            final int fieldsCount = c.getFieldsCount();
                            int rows = 0;
                            do {
                                final StringBuilder s = new StringBuilder();
                                for (int field = 0; field < fieldsCount; field++) {
                                    final Object value = c.getValue(field);
                                    s.append(value).append(" ");
                                }
                                logger.info(s.toString());
                                rows++;
                            } while (c.next());
                            logger.info(String.format("rows %d", rows));
                        } finally {
                            c.close();
                        }
                        return null;
                    }
                });
            }
        });
    }

    @Override
    public void updateAll() throws Exception {
        measure("SqlJetBenchmark.updateAll", new Measure() {
            public void measure() throws Exception {
                db.runWriteTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor c = table.open();
                        try {
                            final Object[] values = new Object[5];
                            do {
                                values[0]=c.getString(0);
                                values[1]=c.getInteger(1)+1;
                                values[2]=c.getInteger(2);
                                values[3]=c.getInteger(3);
                                values[4]=c.getInteger(4);
                                c.update(values);
                            } while (c.next());
                        } finally {
                            c.close();
                        }
                        return null;
                    }
                });
            }
        });
    }

    @Override
    public void deleteAll() throws Exception {
        measure("SqlJetBenchmark.deleteAll", new Measure() {
            public void measure() throws Exception {
                db.runWriteTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final ISqlJetCursor c = table.open();
                        try {
                            do {
                                if (!c.isNull(0)) {
                                    c.delete();
                                } else {
                                    c.next();
                                }
                            } while (!c.eof());
                        } finally {
                            c.close();
                        }
                        return null;
                    }
                });
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
        measure("SqlJetBenchmark.insertRandoms", new Measure() {
            public void measure() throws Exception {
                db.runWriteTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        final Random rand = new Random();
                        final Object[] values = new Object[5];
                        for (int i = 0; i < COUNT; i++) {
                            values[0] = Long.toString(Math.abs(rand.nextLong()));
                            values[1] = Math.abs(rand.nextLong());
                            values[2] = Math.abs(rand.nextLong());
                            values[3] = Math.abs(rand.nextLong());
                            values[4] = Math.abs(rand.nextLong());
                            table.insert(values);
                        }
                        return null;
                    }
                });
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
        measure("SqlJetBenchmark.clear", new Measure() {
            public void measure() throws Exception {
                db.runWriteTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        table.clear();
                        return null;
                    }
                });
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
        measure("SqlJetBenchmark.locate", new Measure() {
            public void measure() throws Exception {
                db.runReadTransaction(new ISqlJetTransaction() {
                    public Object run(SqlJetDb db) throws SqlJetException {
                        for (int i = 0; i < COUNT; i++) {
                            for (String hashe : LOCATE_HASHES) {
                                final ISqlJetCursor c = table.lookup(null, hashe);
                                try {
                                    Assert.assertFalse(c.eof());
                                    logger.info(c.getString(0));
                                } finally {
                                    c.close();
                                }
                            }
                        }
                        return null;
                    }
                });
            }
        });
    }

}
