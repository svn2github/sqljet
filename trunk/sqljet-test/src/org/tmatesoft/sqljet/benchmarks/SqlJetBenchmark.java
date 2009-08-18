/**
 * SqlJetBenchmark.java
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
package org.tmatesoft.sqljet.benchmarks;

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

    @Override
    public void setUp() throws Exception {
        super.setUp();
        db = SqlJetDb.open(dbFile, true);
        table = db.getTable(TABLE_NAME);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.benchmarks.AbstractBenchmark#tearDown()
     */
    @Override
    public void tearDown() throws Exception {
        db.close();
        super.tearDown();
    }

    @Override
    public void selectAll() throws Exception {
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

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.benchmarks.AbstractBenchmark#updateAll()
     */
    @Override
    public void updateAll() throws Exception {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = table.open();
                try {
                    final int fieldsCount = c.getFieldsCount();
                    final Object[] values = new Object[fieldsCount];
                    do {
                        for (int field = 0; field < fieldsCount; field++) {
                            values[field] = c.getValue(field);
                        }
                        final Object revision = values[1];
                        if (revision instanceof Long) {
                            values[1] = (Long) revision + 1;
                        }
                        //c.update(values);
                    } while (c.next());
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }
}
