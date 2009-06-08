/**
 * SqlJetParserTest.java
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
package org.tmatesoft.sqljet.core.lang;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.lang.CommonTreeDumper;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetParserTest extends TestCase {

    public SqlJetParserTest() {
        super("Parser Test");
    }

    public void testSelectCore() throws Exception {
        assertParses("select{select_core{columns{*}}{from{alias{t}}}}", "select * from t;");
        assertParses("select{select_core{columns{*{x}}}{from{alias{t}}}}", "select x.* from t;");
        assertParses("select{select_core{columns{alias{column_literal{a}}}}{from{alias{t}}}}", "select a from t;");
        assertParses(
                "select{select_core{columns{alias{+{column_literal{a}}{*{column_literal{b}}{column_literal{c}}}}}}{from{alias{d}}}}",
                "select a+b * c from d;");
        assertParses(
                "select{select_core{columns{alias{column_literal{a}}}{alias{column_literal{b}}}}{from{alias{t}}}}",
                "select a,b from t;");
        assertParses("select{select_core{columns{alias{column_literal{a}}}}{from{alias{t}}}}", "select all a from t;");
        assertParses("select{select_core{distinct}{columns{alias{column_literal{a}}}}{from{alias{t}}}}",
                "select distinct a from t;");
        assertParses("select{select_core{columns{alias{column_literal{a}}{b}}}{from{alias{t}}}}",
                "select a as b from t;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{where{column_literal{z}}}}",
                "select * from t where z;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_literal{n}}}}}",
                "select * from t group by n;");
        assertParses(
                "select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_literal{n}}}{ordering{column_literal{r}}}}}",
                "select * from t group by n,r;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_literal{a}}{asc}}}}",
                "select * from t group by a asc;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_literal{d}}{desc}}}}",
                "select * from t group by d desc;");
        assertParses(
                "select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_literal{x}}}{having{column_literal{y}}}}}",
                "select * from t group by x having y;");
        assertParses(
                "select{select_core{columns{alias{+{column_literal{a}}{column_literal{b}}}}{alias{column_literal{c}}{n}}{alias{-{column_literal{d}}{column_literal{e}}}}}{from{alias{t}}}{where{<{column_literal{i}}{column_literal{j}}}}{group{ordering{column_literal{x}}{desc}}{ordering{column_literal{y}}}{having{*{column_literal{z}}{column_literal{z}}}}}}",
                "select a+b,c as n,d-e from t where i<j group by x desc,y having z*z;");
    }

    public void testSelect() throws Exception {
        assertParses(
                "select{except{select_core{columns{*}}{from{alias{x}}}}{select_core{columns{*}}{from{alias{y}}}}}",
                "select * from x except select * from y;");
        assertParses(
                "select{union{all}{select_core{columns{*}}{from{alias{x}}}}{select_core{columns{*}}{from{alias{y}}}}}",
                "select * from x union all select * from y;");
        assertParses(
                "select{union{intersect{select_core{columns{*}}{from{alias{x}}}}{select_core{columns{*}}{from{alias{y}}}}}{select_core{columns{*}}{from{alias{z}}}}}",
                "select * from x intersect select * from y union select * from z;");
    }

    public void testCreateTable() throws Exception {
        assertParses("create_table{options}{emps}{columns{name{constraints}{type{type_params}{int}}}}",
                "create table emps (name int);");
        assertParses("create_table{options}{emps}{columns{name{constraints}{type{type_params}{int}}}}",
                "create table emps( name int);");
    }

    public void testCreateIndex() throws Exception {
        assertParses("create_index{options}{idx}{tbl}{columns{name}}", "create index idx on tbl (name);");
        assertParses("create_index{options{unique}}{idx{db}}{tbl}{columns{name}{age}}",
                "create unique index db.idx on tbl (name, age);");
        assertParses("create_index{options{exists}}{idx}{tbl}{columns{name{collate{aaa}}{asc}}}",
                "create index if not exists idx on tbl (name collate aaa asc);");
    }

    protected void assertParses(String curlyDump, String sql) throws Exception {
        CommonTree tree = parse(sql);
        String treeDump = dump(tree);
        assertEquals("Parsed SQL doesn't match", curlyDump, treeDump.toLowerCase());
    }

    protected CommonTree parse(String sql) throws SqlJetException, RecognitionException {
        CharStream chars = new ANTLRStringStream(sql);
        SqlLexer lexer = new SqlLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        return (CommonTree) parser.sql_stmt().getTree();
    }

    protected String dump(CommonTree tree) {
        StringBuffer buffer = new StringBuffer();
        new CurlyCommonTreeDumper().addTree(buffer, tree, 0);
        return buffer.toString();
    }

    protected static class CurlyCommonTreeDumper extends CommonTreeDumper {

        @Override
        protected void addPrefix(StringBuffer buffer, int length) {
            buffer.append("{");
        }

        @Override
        protected void addSuffix(StringBuffer buffer, int length) {
            buffer.append("}");
        }
    }
}
