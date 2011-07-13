/**
 * SqlJetSchemaTest.java
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
package org.tmatesoft.sqljet.core.schema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetLimits;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetSchemaTest extends AbstractDataCopyTest {

    public static final String SCHEMA_TEST = "SqlJetSchemaTest";

    public static final String DB = SqlJetUtility.getSysProp(SCHEMA_TEST + ".DB", "src/test/data/db/testdb.sqlite");

    public static final String TABLE = SqlJetUtility.getSysProp(SCHEMA_TEST + ".TABLE", "test1");
    public static final String TABLE2 = SqlJetUtility.getSysProp(SCHEMA_TEST + ".TABLE", "test2");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(SCHEMA_TEST + ".DELETE_COPY", true);

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(SCHEMA_TEST + ".REP_CACHE_DB",
            "src/test/data/db/rep-cache/rep-cache.db");
    public static final String REP_CACHE_TABLE = SqlJetUtility
            .getSysProp(SCHEMA_TEST + ".REP_CACHE_TABLE", "rep_cache");

    private static final byte[] TEST_UTF8 = new byte[] { (byte) 0320, (byte) 0242, (byte) 0320, (byte) 0265,
            (byte) 0321, (byte) 0201, (byte) 0321, (byte) 0202 };

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
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert(null, "test");
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createTableTest1() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createTable("create table test1( id integer primary key, name text )");
                return null;
            }
        });
        Assert.assertTrue(false);
    }

    @Test
    public void createTableTestUnique() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text unique )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert(null, "test");
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createTableTestUniqueFail() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text unique )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert("test");
                openTable.insert("test");
                return null;
            }
        });
        Assert.assertFalse(false);
    }

    @Test
    public void createIndexTest() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert(null, "test");
                db.createIndex("CREATE INDEX test_name_index ON test(name);");
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailTable() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createIndex("CREATE INDEX test_name_index ON test(name);");
                return null;
            }
        });
        Assert.assertFalse(false);
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailColumn() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert("test");
                db.createIndex("CREATE INDEX test_name_index ON test(test);");
                return null;
            }
        });
        Assert.assertFalse(false);
    }

    @Test(expected = SqlJetException.class)
    public void createIndexFailName() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                final ISqlJetTable openTable = db.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert("test");
                db.createIndex("CREATE INDEX test_name_index ON test(name);");
                db.createIndex("CREATE INDEX test_name_index ON test(name);");
                return null;
            }
        });
        Assert.assertFalse(false);
    }

    @Test
    public void createIndexRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);
        repCache.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.createIndex("CREATE INDEX rep_cache_test_index ON " + REP_CACHE_TABLE
                        + "(hash, revision, offset, size, expanded_size);");
                final ISqlJetTable openTable = repCache.getTable(REP_CACHE_TABLE);
                openTable.insert("test", 1, 2, 3, 4);
                return null;
            }
        });
    }

    @Test
    public void createTableRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);
        repCache.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                final ISqlJetTable openTable = repCache.getTable(createTable.getName());
                logger.info(createTable.toString());
                openTable.insert(null, "test");
                db.createIndex("CREATE INDEX test_index ON test(name);");
                openTable.insert(null, "test1");
                return null;
            }
        });
    }

    @Test
    public void dropTableRepCache() throws SqlJetException, FileNotFoundException, IOException {
        final SqlJetDb repCache = SqlJetDb.open(copyFile(new File(REP_CACHE_DB), DELETE_COPY), true);
        repCache.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.dropTable(REP_CACHE_TABLE);
                return null;
            }
        });
        final ISqlJetTableDef openTable = repCache.getSchema().getTable(REP_CACHE_TABLE);
        Assert.assertNull(openTable);
    }

    @Test
    public void dropTableTest1() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.dropTable("test1");
                return null;
            }
        });
        final ISqlJetTableDef openTable = db.getSchema().getTable("test1");
        Assert.assertNull(openTable);
    }

    @Test
    public void dropIndex() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {

            public Object run(SqlJetDb db) throws SqlJetException {
                db.dropIndex("test1_name_index");
                db.dropIndex("test1_value_index");
                return null;
            }
        });
        Assert.assertNull(db.getSchema().getIndex("test1_name_index"));
        Assert.assertNull(db.getSchema().getIndex("test1_value_index"));
    }

    @Test
    public void dropAll() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                // /Set<String> indices = db.getSchema().getIndexNames();
                Set<String> tables = db.getSchema().getTableNames();
                for (String tableName : tables) {
                    ISqlJetTableDef tableDef = db.getSchema().getTable(tableName);
                    Set<ISqlJetIndexDef> tableIndices = db.getSchema().getIndexes(tableDef.getName());
                    for (ISqlJetIndexDef indexDef : tableIndices) {
                        if (!indexDef.isImplicit()) {
                            db.dropIndex(indexDef.getName());
                        }
                    }
                    db.dropTable(tableName);
                }
                return null;
            }
        });
    }

    @Test
    public void createDataBase() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                db.createIndex("CREATE INDEX test_index ON test(name);");
                final ISqlJetTable openTable = createDb.getTable(createTable.getName());
                openTable.insert(null, "test");
                openTable.insert(null, "test1");
                return null;
            }
        });
    }

    @Test
    public void changeEncoding() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.getOptions().setEncoding(SqlJetEncoding.UTF16LE);
        createDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                db.createIndex("CREATE INDEX test_index ON test(name);");
                final ISqlJetTable openTable = createDb.getTable(createTable.getName());
                openTable.insert(null, "test");
                openTable.insert(null, "test1");
                try {
                    openTable.insert(null, new String(TEST_UTF8, "UTF8"));
                } catch (UnsupportedEncodingException e) {
                    throw new SqlJetException(e);
                }
                return null;
            }
        });
    }

    @Test(expected = SqlJetException.class)
    public void changeEncodingFail() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                db.createIndex("CREATE INDEX test_index ON test(name);");
                final ISqlJetTable openTable = createDb.getTable(createTable.getName());
                openTable.insert(null, "test");
                openTable.insert(null, "test1");
                try {
                    openTable.insert(null, new String(TEST_UTF8, "UTF8"));
                } catch (UnsupportedEncodingException e) {
                    throw new SqlJetException(e);
                }
                createDb.getOptions().setEncoding(SqlJetEncoding.UTF16LE);
                return null;
            }
        });
    }

    @Test
    public void changePageCacheSize() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                createDb.getOptions().setCacheSize(1000);
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                db.createIndex("CREATE INDEX test_index ON test(name);");
                final ISqlJetTable openTable = createDb.getTable(createTable.getName());
                openTable.insert(null, "test");
                openTable.insert(null, "test1");
                try {
                    openTable.insert(null, new String(TEST_UTF8, "UTF8"));
                } catch (UnsupportedEncodingException e) {
                    throw new SqlJetException(e);
                }
                return null;
            }
        });

        createDb.close();

        final SqlJetDb openDb = SqlJetDb.open(createFile, true);
        final int cacheSize = openDb.getOptions().getCacheSize();
        Assert.assertEquals(1000, cacheSize);

    }

    @Test
    public void changeVacuum() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.getOptions().setAutovacuum(true);
        createDb.getOptions().setIncrementalVacuum(true);
        createDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {

                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                db.createIndex("CREATE INDEX test_index ON test(name);");
                final ISqlJetTable openTable = createDb.getTable(createTable.getName());
                openTable.insert(null, "test");
                openTable.insert(null, "test1");
                try {
                    openTable.insert(null, new String(TEST_UTF8, "UTF8"));
                } catch (UnsupportedEncodingException e) {
                    throw new SqlJetException(e);
                }
                return null;
            }
        });

        createDb.close();

        final SqlJetDb checkDb = SqlJetDb.open(createFile, true);
        Assert.assertTrue(checkDb.getOptions().isAutovacuum());
        Assert.assertTrue(checkDb.getOptions().isIncrementalVacuum());
        checkDb.close();

        SqlJetFileUtil.deleteFile(createFile);

    }

    @Test
    public void changeSchemaVersion() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                createDb.getOptions().setSchemaVersion(123);
                return null;
            }
        });
        createDb.close();

        final SqlJetDb openDb = SqlJetDb.open(createFile, true);
        final int schemaVersion = openDb.getOptions().getSchemaVersion();
        Assert.assertEquals(123, schemaVersion);

    }

    @Test
    public void changeFileFormatMin() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.getOptions().setFileFormat(ISqlJetLimits.SQLJET_MIN_FILE_FORMAT);
        createDb.close();

        final SqlJetDb openDb = SqlJetDb.open(createFile, true);
        final int fileFormat = openDb.getOptions().getFileFormat();
        Assert.assertEquals(ISqlJetLimits.SQLJET_MIN_FILE_FORMAT, fileFormat);

    }

    @Test
    public void changeFileFormatMax() throws SqlJetException, FileNotFoundException, IOException {

        final File createFile = File.createTempFile(SCHEMA_TEST, null);
        if (DELETE_COPY)
            createFile.deleteOnExit();

        final SqlJetDb createDb = SqlJetDb.open(createFile, true);
        createDb.getOptions().setFileFormat(ISqlJetLimits.SQLJET_MAX_FILE_FORMAT);
        createDb.close();

        final SqlJetDb openDb = SqlJetDb.open(createFile, true);
        final int fileFormat = openDb.getOptions().getFileFormat();
        Assert.assertEquals(ISqlJetLimits.SQLJET_MAX_FILE_FORMAT, fileFormat);

    }

    @Test(expected = SqlJetException.class)
    public void createIndexUniqueFail() throws SqlJetException {
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTableDef createTable = db
                        .createTable("create table test( id integer primary key, name text )");
                logger.info(createTable.toString());
                final ISqlJetIndexDef createIndex = db.createIndex("create unique index index_test_text on test(name)");
                logger.info(createIndex.toString());
                return null;
            }
        });
        db.close();
        db.open();
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetTable openTable = db.getTable("test");
                openTable.insert(null, "test");
                openTable.insert(null, "test");
                return null;
            }
        });
        Assert.assertFalse(false);
    }

}
