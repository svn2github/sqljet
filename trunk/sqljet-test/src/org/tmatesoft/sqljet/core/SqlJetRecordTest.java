/**
 * SqlJetRecordTest.java
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
package org.tmatesoft.sqljet.core;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDb;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetRecordTest {

    private static Logger logger = Logger.getLogger(SqlJetAbstractMockTest.SQLJET_TEST_LOGGER);

    private File repCacheDb = new File("sqljet-test/db/rep-cache/rep-cache.db");

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReadMain() throws SqlJetException, UnsupportedEncodingException {
        ISqlJetDb db = new SqlJetDb();
        db.getMutex().enter();

        try {

            ISqlJetBtree btree = new SqlJetBtree();

            btree.open(repCacheDb, db, EnumSet.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB, EnumSet
                    .of(SqlJetFileOpenPermission.READONLY));
            try {

                final ISqlJetBtreeCursor c = btree.getCursor(ISqlJetDb.MASTER_ROOT, false, null);
                c.enterCursor();
                try {
                    if (!c.first()) {
                        do {
                            SqlJetRecord r = new SqlJetRecord(c, false);
                            for (int i = 0; i < r.getFieldsCount(); i++) {
                                SqlJetVdbeMem mem = new SqlJetVdbeMem();
                                r.getColumn(i, mem);
                                final ByteBuffer value = mem.valueText(SqlJetEncoding.UTF8);
                                String s = new String(value.array());
                                logger.info(s);
                            }

                        } while (!c.next());
                    }
                } finally {
                    c.leaveCursor();
                }

            } finally {
                btree.close();
            }

        } finally {
            db.getMutex().leave();
        }

    }

}
