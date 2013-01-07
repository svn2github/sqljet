/**
 * AutoincrementTest.java
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
package org.tmatesoft.sqljet.issues._134;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class AutoincrementTest extends AbstractNewDbTest {

    @Test
    public void testAutoincrement() throws Exception {

        ISqlJetTableDef createTable = db.createTable(
        "CREATE TABLE `JOBLIST` (" +
        "`id` INTEGER PRIMARY KEY AUTOINCREMENT," +
        "`jobname` VARCHAR(75) NOT NULL," +
        "`startdate` LONG not null" +
        ");" );

        final ISqlJetTable table = db.getTable(createTable.getName());
        db.beginTransaction(SqlJetTransactionMode.EXCLUSIVE);
        try{
            table.insert(null, "jobname", 123456);
            table.insert(null, "jobname", 123456);
        } finally {
            db.commit();
        }

        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor open = table.open();
                try {
                    while (!open.eof()) {
                        long id = open.getInteger("id");
                        Assert.assertNotNull(id);
                        open.next();
                    }
                } finally {
                    open.close();
                }
                return null;
            }
        });
    }

}
