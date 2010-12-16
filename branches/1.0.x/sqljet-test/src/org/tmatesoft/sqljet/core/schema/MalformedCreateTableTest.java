/**
 * MalformedCreateTable.java
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

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.lang.SqlJetParserException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MalformedCreateTableTest extends AbstractNewDbTest {

    @Test
    public void malformedCreateTable() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE TESTXX (a int, b int, c int, " + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.commit();

        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db != null);
    }

    @Test
    public void malformedCreateTableIfNotExists() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE IF NOT EXISTS TESTXX (a int, b int, c int, "
                + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IF NOT EXISTS IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.commit();

        db.close();
        db = SqlJetDb.open(file, true);
        Assert.assertTrue(db != null);

    }

    @Test
    public void malformedCreateTableExistsFail() throws Exception {

        db.getOptions().setAutovacuum(true);
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE IF NOT EXISTS TESTXX (a int, b int, c int, "
                + "d int, blob blob, PRIMARY KEY (a,b,c,d))";
        String sql2 = "CREATE INDEX IF NOT EXISTS IND on TESTXX (a,b,c,d)";
        db.createTable(sql1);
        db.createIndex(sql2);
        db.createTable(sql1);// twice
        db.createIndex(sql2);
        db.commit();
        Assert.assertTrue(true);

    }

    @Test
    public void nullTableFieldConstraintTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE world_countries (Name varchar(300) NULL, ID int NULL)";
        db.createTable(sql1);
        db.commit();
        Assert.assertTrue(true);
    }

    @Test
    public void fieldsSquareNamesTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE [dimensions_2] ( [id] int NOT NULL, [Dimension_Name] varchar(30) NULL,"
                + "[Type_ID] int NOT NULL ) ";
        db.createTable(sql1);
        db.commit();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("dimensions_2");
        Assert.assertNotNull(table);
    }

    @Test
    public void tableNameWithWhitespaceTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE \"name with whitespace\" ( \"id\" int NOT NULL, \"Dimension_Name\" varchar(30) NULL,"
                + "\"Type_ID\" int NOT NULL ) ";
        db.createTable(sql1);
        db.commit();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("name with whitespace");
        Assert.assertNotNull(table);
    }

    @Test
    public void fieldsDoubleQuotesNamesTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE TABLE FUSION_MAP_COUNTRIES ( ID VARCHAR2(20) NOT NULL,"
                + " \"SHORT_NAME\" VARCHAR2(20) NOT NULL," + "\"ISO_CODE\" VARCHAR2(10) NOT NULL,"
                + "\"COUNTRY_NAME\" VARCHAR2(100) NOT NULL," + "\"MAP\" VARCHAR2(100) NOT NULL,"
                + "\"DRILLDOWN\" VARCHAR2(100),"
                + "CONSTRAINT \"PK_FUSION_MAP_COUNTRIES\" PRIMARY KEY (\"ID\", \"MAP\")" + ")";
        db.createTable(sql1);
        db.commit();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("FUSION_MAP_COUNTRIES");
        Assert.assertNotNull(table);
    }

    @Test
    public void fieldSize() throws Exception {
        final String sql = "CREATE TABLE SITE_VARS (SITEID VARCHAR (10) NOT NULL,"
                + " VARNAME VARCHAR (50) NOT NULL, VALUE VARCHAR (500))";
        final ISqlJetTableDef t = db.createTable(sql);
        final String sql2 = t.toSQL();
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void dollarInName() throws Exception {
        final String sql = "create table my$table(a$ integer primary key, b$ integer)";
        final ISqlJetTableDef def = db.createTable(sql);
        Assert.assertNotNull(def);
        final ISqlJetTable t = db.getTable("my$table");
        Assert.assertNotNull(t);
    }

    @Test(expected = SqlJetParserException.class)
    public void dollarInNameFail() throws Exception {
        final String sql = "create table $mytable($a integer primary key, $b integer)";
        @SuppressWarnings("unused")
        final ISqlJetTableDef def = db.createTable(sql);
        Assert.fail();
    }

    @Test
    public void parseExceptionMessage() throws Exception {
        final String sql = "it's wrong sql";
        try {
            @SuppressWarnings("unused")
            final ISqlJetTableDef def = db.createTable(sql);
            Assert.fail();
        } catch (SqlJetParserException e) {
            final String msg = e.getMessage();
            Assert.assertTrue(msg.contains(sql));
        }
    }

    @Test
    public void tableNameWithWhitespaceTest2() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE \"name with whitespace\" ( \"id\" int NOT NULL,"
                + " \"Dimension Name\" varchar(30) NULL," + "\"Type ID\" int NOT NULL )  ; ";
        db.createTable(sql1);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("name with whitespace");
        Assert.assertNotNull(table);
    }

    @Test
    public void indexNameWithWhitespaceTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE \"name with whitespace\" ( \"id\" int NOT NULL,"
                + " \"Dimension Name\" varchar(30) NULL," + "\"Type ID\" int NOT NULL )  ; ";
        db.createTable(sql1);
        String sql2 = "CREATE \n INDEX \"name with whitespace 2\" on \"name with whitespace\" ( "
                + " \"Dimension Name\")  ; ";
        db.createIndex(sql2);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("name with whitespace");
        Assert.assertNotNull(table);
        final ISqlJetIndexDef indexDef = table.getIndexDef("name with whitespace 2");
        Assert.assertNotNull(indexDef);
    }

    @Test
    public void virtualTableNameWithWhitespaceTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n VIRTUAL TABLE \"name with whitespace\" using \"module name\" ( \"id\" int NOT NULL,"
                + " \"Dimension Name\" varchar(30) NULL," + "\"Type ID\" int NOT NULL )  ; ";
        db.createVirtualTable(sql1);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetSchema schema = db.getSchema();
        final ISqlJetVirtualTableDef virtualTable = schema.getVirtualTable("name with whitespace");
        Assert.assertNotNull(virtualTable);
    }

    @Test
    public void alterTableAddColumnNameWithWhitespaceTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE \"name with whitespace\" ( \"id\" int NOT NULL,"
                + " \"Dimension Name\" varchar(30) NULL," + "\"Type ID\" int NOT NULL )  ; ";
        db.createTable(sql1);
        String sql2 = "CREATE \n INDEX \"name with whitespace 2\" on \"name with whitespace\" ( "
                + " \"Dimension Name\")  ; ";
        db.createIndex(sql2);
        db.commit();
        db.alterTable("alter table \"name with whitespace\" add column \"column with space\"");
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable("name with whitespace");
        Assert.assertNotNull(table);
        final ISqlJetIndexDef indexDef = table.getIndexDef("name with whitespace 2");
        Assert.assertNotNull(indexDef);
    }

    @Test
    public void alterTableRenameNameWithWhitespaceTest() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE \"name with whitespace\" ( \"id\" int NOT NULL,"
                + " \"Dimension Name\" varchar(30) NULL," + "\"Type ID\" int NOT NULL )  ; ";
        db.createTable(sql1);
        String sql2 = "CREATE \n INDEX \"name with whitespace 2\" on \"name with whitespace\" ( "
                + " \"Dimension Name\")  ; ";
        db.createIndex(sql2);
        db.commit();
        db.alterTable("alter table \"name with whitespace\" rename to \"name with whitespace 3\"");
        db.close();
        db.open();
        final ISqlJetTable table = db.getTable("name with whitespace 3");
        Assert.assertNotNull(table);
        Assert.assertTrue(true);
        final ISqlJetTable table2 = db.getTable("name with whitespace 3");
        Assert.assertNotNull(table2);
        final ISqlJetIndexDef indexDef = table.getIndexDef("name with whitespace 2");
        Assert.assertNotNull(indexDef);
    }

    @Test
    public void tableNameWithWhitespaceTest3() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE \" name with \n whitespace \" ( \" id \" int NOT NULL,"
                + " \" Dimension, Name\" varchar(30) NULL," + "\" Type; ID \" int NOT NULL )  ; ";
        db.createTable(sql1);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable(" name with \n whitespace ");
        Assert.assertNotNull(table);
    }

    @Test
    public void tableNameQuotedApostrophe() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE ` [name with \" \n whitespace] ` ( ` id ` int NOT NULL,"
                + " ` Dimension, Name ` varchar(30) NULL, ` Type; ID ` int NOT NULL )  ; ";
        db.createTable(sql1);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable(" [name with \" \n whitespace] ");
        Assert.assertNotNull(table);
    }

    @Test
    public void tableNameQuotedSingle() throws Exception {
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        String sql1 = "CREATE \n TABLE ' [name with \" \n whitespace] ' ( ' id ' int NOT NULL,"
                + " ' Dimension, Name ' varchar(30) NULL, ' Type; ID ' int NOT NULL )  ; ";
        db.createTable(sql1);
        db.commit();
        db.close();
        db.open();
        Assert.assertTrue(true);
        final ISqlJetTable table = db.getTable(" [name with \" \n whitespace] ");
        Assert.assertNotNull(table);
    }

    @Test(expected = SqlJetException.class)
    public void tableNameConflict() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b text)");
        db.createTable("create table t(a integer primary key, b text)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void indexNameConflict() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b text)");
        db.createIndex("create index i on t(b)");
        db.createIndex("create index i on t(b)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void tableIndexNameConflict1() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b text)");
        db.createIndex("create index t on t(b)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void tableIndexNameConflict2() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b text)");
        db.createIndex("create index i on t(b)");
        db.createTable("create table i(a integer primary key, b text)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void tableNameReserved() throws SqlJetException {
        db.createTable("create table sqlite_master(a integer primary key, b text)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void indexNameReserved() throws SqlJetException {
        db.createTable("create table t(b text)");
        db.createIndex("create index sqlite_autoindex_t_1 on t(b)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void tableVirtualNameReserved() throws SqlJetException {
        db.createTable("create virtual table sqlite_master using sqljetmap");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void virtualTableNameConflict() throws SqlJetException {
        db.createTable("create table t(a integer primary key, b text)");
        db.createVirtualTable("create virtual table t using sqljetmap");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void virtualTableNameConflict2() throws SqlJetException {
        db.createVirtualTable("create virtual table t using sqljetmap");
        db.createTable("create table t(a integer primary key, b text)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void virtualTableNameConflict3() throws SqlJetException {
        db.createVirtualTable("create virtual table t using sqljetmap");
        db.createIndex("create index t on t(b)");
        Assert.fail();
    }

    @Test(expected = SqlJetException.class)
    public void virtualTableNameConflict4() throws SqlJetException {
        db.createIndex("create index t on t(b)");
        db.createVirtualTable("create virtual table t using sqljetmap");
        Assert.fail();
    }

}
