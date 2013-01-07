/**
 * SqlJetDDLTest.java
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
package org.tmatesoft.sqljet.core.lang;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetDDLTest extends SqlJetAbstractParserTest {

    public SqlJetDDLTest() {
        super("DDL Test");
    }

    public void testCreateTable() throws Exception {
        assertParses("create_table{options}{emps}{columns{name{constraints}{type{type_params}{int}}}}",
                "create table emps (name int);");
        assertParses("create_table{options}{emps}{columns{name{constraints}{type{type_params}{int}}}}",
                "create table emps( name int);");
    }

    public void testColumnFK() throws Exception {
        assertParses("create_table{options}{t}{columns{c{constraints{column_constraint{references{f}{columns{z}}}}}{type{type_params}{integer}}}}",
                "create table t (c integer references f(z));");
    }
    
    public void testDropTable() throws Exception {
        assertParses("drop_table{options}{tbl{db}}", "drop table db.tbl;");
        assertParses("drop_table{options{exists}}{tbl}", "drop table if exists tbl;");
    }

    public void testCreateIndex() throws Exception {
        assertParses("create_index{options}{idx}{tbl}{columns{name}}", "create index idx on tbl (name);");
        assertParses("create_index{options{unique}}{idx{db}}{tbl}{columns{name}{age}}",
                "create unique index db.idx on tbl (name, age);");
        assertParses("create_index{options{exists}}{idx}{tbl}{columns{name{collate{aaa}}{asc}}}",
                "create index if not exists idx on tbl (name collate aaa asc);");
    }

    public void testDropIndex() throws Exception {
        assertParses("drop_index{options}{idx{tbl}}", "drop index tbl.idx;");
        assertParses("drop_index{options{exists}}{idx}", "drop index if exists idx;");
    }
}
