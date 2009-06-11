/**
 * SqlJetSchemaTest.java
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
package org.tmatesoft.sqljet.core.schema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetRunnableWithLock;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetSchemaTest extends AbstractDataCopyTest {

    public static final String SCHEMA_TEST = "SqlJetSchemaTest";

    public static final String DB = SqlJetUtility.getSysProp(SCHEMA_TEST + ".DB", "sqljet-test/db/testdb.sqlite");

    public static final String TABLE = SqlJetUtility.getSysProp(SCHEMA_TEST + ".TABLE", "test1");
    public static final String TABLE2 = SqlJetUtility.getSysProp(SCHEMA_TEST + ".TABLE", "test2");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(SCHEMA_TEST + ".DELETE_COPY", true);

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(SCHEMA_TEST + ".REP_CACHE_DB",
            "sqljet-test/db/rep-cache/rep-cache.db");
    public static final String REP_CACHE_TABLE = SqlJetUtility
            .getSysProp(SCHEMA_TEST + ".REP_CACHE_TABLE", "rep_cache");

    private File fileDb = new File(DB);
    private File fileDbCopy;
    private SqlJetDb db;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        fileDbCopy = copyFile(fileDb, DELETE_COPY);
        db = SqlJetDb.open(fileDbCopy, true);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        if (null != db)
            db.close();
    }

    @Test
    public void createTableTest() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insertAutoId("test");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createTableTest1() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    schema.createTable("create table test1( id integer primary key, name text )");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                Assert.assertTrue(false);
                return null;
            }
        });
    }

    @Test
    public void createTableTestUnique() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text unique )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insertAutoId("test");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createTableTestUniqueFail() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text unique )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insert("test");
                    openTable.insert("test");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                Assert.assertFalse(false);
                return null;
            }
        });
    }

    @Test
    public void createIndexTest() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insertAutoId("test");
                    schema.createIndex("CREATE INDEX test_name_index ON test(name);");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailTable() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    schema.createIndex("CREATE INDEX test_name_index ON test(name);");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                Assert.assertFalse(false);
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailColumn() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insert("test");
                    schema.createIndex("CREATE INDEX test_name_index ON test(test);");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                Assert.assertFalse(false);
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailName() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    final SqlJetTable openTable = db.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insert("test");
                    schema.createIndex("CREATE INDEX test_name_index ON test(name);");
                    schema.createIndex("CREATE INDEX test_name_index ON test(name);");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                Assert.assertFalse(false);
                return null;
            }
        });
    }

    @Test
    public void createIndexRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);

        repCache.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                repCache.beginTransaction();
                try {
                    final ISqlJetSchema schema = repCache.getSchema();
                    schema.createIndex("CREATE INDEX rep_cache_test_index ON " + REP_CACHE_TABLE
                            + "(hash, revision, offset, size, expanded_size);");
                    final SqlJetTable openTable = repCache.getTable(REP_CACHE_TABLE);
                    openTable.insert("test", 1, 2, 3, 4);
                    repCache.commit();
                } catch (SqlJetException e) {
                    repCache.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void createTableRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);

        repCache.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                repCache.beginTransaction();
                try {
                    final ISqlJetSchema schema = repCache.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    final SqlJetTable openTable = repCache.getTable(createTable.getName());
                    logger.info(createTable.toString());
                    openTable.insertAutoId("test");
                    schema.createIndex("CREATE INDEX test_index ON test(name);");
                    openTable.insertAutoId("test1");
                    repCache.commit();
                } catch (SqlJetException e) {
                    repCache.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void dropTableRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);
        repCache.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                repCache.beginTransaction();
                try {
                    final ISqlJetSchema schema = repCache.getSchema();
                    schema.dropTable(REP_CACHE_TABLE);
                    repCache.commit();
                    final ISqlJetTableDef openTable = schema.getTable(REP_CACHE_TABLE);
                    Assert.assertNull(openTable);
                } catch (SqlJetException e) {
                    repCache.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void dropTableTest1() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    schema.dropTable("test1");
                    db.commit();
                    final ISqlJetTableDef openTable = schema.getTable("test1");
                    Assert.assertNull(openTable);
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void dropIndex() throws SqlJetException {
        db.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                db.beginTransaction();
                try {
                    final ISqlJetSchema schema = db.getSchema();
                    schema.dropIndex("test1_name_index");
                    schema.dropIndex("test1_value_index");
                    db.commit();
                } catch (SqlJetException e) {
                    db.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void createDataBase() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile("create", null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                createDb.beginTransaction();
                try {
                    final ISqlJetSchema schema = createDb.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    logger.info(createTable.toString());
                    schema.createIndex("CREATE INDEX test_index ON test(name);");
                    final SqlJetTable openTable = createDb.getTable(createTable.getName());
                    openTable.insertAutoId("test");
                    openTable.insertAutoId("test1");
                    createDb.commit();
                } catch (SqlJetException e) {
                    createDb.rollback();
                    throw e;
                }
                return null;
            }
        });
    }

    @Test
    public void changeEncoding() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile("create", null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.runWithLock(new ISqlJetRunnableWithLock() {
            public Object runWithLock(SqlJetDb db) throws SqlJetException {
                createDb.beginTransaction();
                try {
                    createDb.getMeta().setEncoding(SqlJetEncoding.UTF16LE);
                    final ISqlJetSchema schema = createDb.getSchema();
                    final ISqlJetTableDef createTable = schema
                            .createTable("create table test( id integer primary key, name text )");
                    logger.info(createTable.toString());
                    schema.createIndex("CREATE INDEX test_index ON test(name);");
                    final SqlJetTable openTable = createDb.getTable(createTable.getName());
                    openTable.insertAutoId("test");
                    openTable.insertAutoId("test1");
                    openTable.insertAutoId("\320\242\320\265\321\201\321\202");
                    createDb.commit();
                } catch (SqlJetException e) {
                    createDb.rollback();
                    throw e;
                }
                return null;
            }
        });
    }
    
}
