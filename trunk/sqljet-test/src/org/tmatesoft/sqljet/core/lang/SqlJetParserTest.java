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
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}}", "select * from t;");
        assertParses("select{select_core{result_columns{*{x}}}{from{alias{t}}}}", "select x.* from t;");
        assertParses("select{select_core{result_columns{alias{a}}}{from{alias{t}}}}", "select a from t;");
        assertParses("select{select_core{result_columns{alias{+{a}{*{b}{c}}}}}{from{alias{d}}}}", "select a+b * c from d;");
        assertParses("select{select_core{result_columns{alias{a}}{alias{b}}}{from{alias{t}}}}", "select a,b from t;");
        assertParses("select{select_core{result_columns{alias{a}}}{from{alias{t}}}}", "select all a from t;");
        assertParses("select{select_core{distinct}{result_columns{alias{a}}}{from{alias{t}}}}", "select distinct a from t;");
        assertParses("select{select_core{result_columns{alias{a}{b}}}{from{alias{t}}}}", "select a as b from t;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{where{z}}}", "select * from t where z;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{group{ordering{n}}}}", "select * from t group by n;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{group{ordering{n}}{ordering{r}}}}", "select * from t group by n,r;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{group{ordering{a}{asc}}}}", "select * from t group by a asc;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{group{ordering{d}{desc}}}}", "select * from t group by d desc;");
        assertParses("select{select_core{result_columns{*}}{from{alias{t}}}{group{ordering{x}}{having{y}}}}", "select * from t group by x having y;");
        assertParses("select{select_core{result_columns{alias{+{a}{b}}}{alias{c}{n}}{alias{-{d}{e}}}}{from{alias{t}}}{where{<{i}{j}}}{group{ordering{x}{desc}}{ordering{y}}{having{*{z}{z}}}}}",
            "select a+b,c as n,d-e from t where i<j group by x desc,y having z*z;");
    }

    public void testSelect() throws Exception {
        assertParses("select{except{select_core{result_columns{*}}{from{alias{x}}}}{select_core{result_columns{*}}{from{alias{y}}}}}",
            "select * from x except select * from y;");
        assertParses("select{union{all}{select_core{result_columns{*}}{from{alias{x}}}}{select_core{result_columns{*}}{from{alias{y}}}}}",
            "select * from x union all select * from y;");
        assertParses("select{union{intersect{select_core{result_columns{*}}{from{alias{x}}}}{select_core{result_columns{*}}{from{alias{y}}}}}{select_core{result_columns{*}}{from{alias{z}}}}}",
            "select * from x intersect select * from y union select * from z;");
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
