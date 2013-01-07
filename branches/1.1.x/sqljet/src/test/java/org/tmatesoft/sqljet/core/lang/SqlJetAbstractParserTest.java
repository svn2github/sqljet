/**
 * SqlJetAbstractParserTest.java
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
public abstract class SqlJetAbstractParserTest extends TestCase {

    public SqlJetAbstractParserTest(String name) {
        super(name);
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
