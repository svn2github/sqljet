/**
 * SqlJetTypeAffinityTest.java
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
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.btree.table.SqlJetTableDef;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTypeAffinity;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetTypeAffinityTest extends TestCase {

    public SqlJetTypeAffinityTest() {
        super("Type Affinity");
    }

    public void testDecode() {
        assertEquals(SqlJetTypeAffinity.INTEGER, SqlJetTypeAffinity.decode("iNTEGER"));
        assertEquals(SqlJetTypeAffinity.INTEGER, SqlJetTypeAffinity.decode("int"));
        assertEquals(SqlJetTypeAffinity.INTEGER, SqlJetTypeAffinity.decode("CHAR FLOAT INT"));

        assertEquals(SqlJetTypeAffinity.TEXT, SqlJetTypeAffinity.decode("VaRCHAR(20)"));
        assertEquals(SqlJetTypeAffinity.TEXT, SqlJetTypeAffinity.decode("  tExt"));
        assertEquals(SqlJetTypeAffinity.TEXT, SqlJetTypeAffinity.decode("CLoB  "));

        assertEquals(SqlJetTypeAffinity.NONE, SqlJetTypeAffinity.decode("  bLOb  "));
        assertEquals(SqlJetTypeAffinity.NONE, SqlJetTypeAffinity.decode("  "));
        assertEquals(SqlJetTypeAffinity.NONE, SqlJetTypeAffinity.decode(null));

        assertEquals(SqlJetTypeAffinity.REAL, SqlJetTypeAffinity.decode("Real"));
        assertEquals(SqlJetTypeAffinity.REAL, SqlJetTypeAffinity.decode("FLOAT"));
        assertEquals(SqlJetTypeAffinity.REAL, SqlJetTypeAffinity.decode("double"));

        assertEquals(SqlJetTypeAffinity.NUMERIC, SqlJetTypeAffinity.decode("BaoBAB"));
        assertEquals(SqlJetTypeAffinity.NUMERIC, SqlJetTypeAffinity.decode("byte"));
    }

    public void testSchema() throws SqlJetException {
        String sql = "create table t (c1 int primary key, c2 varchar, c3 super double, c4 short unique, c5 blob, c6)";
        ISqlJetTableDef table = new SqlJetTableDef(parse(sql), 0);
        ISqlJetColumnDef c1 = table.getColumn("c1");
        assertEquals(SqlJetTypeAffinity.INTEGER, c1.getTypeAffinity());
        ISqlJetColumnDef c2 = table.getColumn("c2");
        assertEquals(SqlJetTypeAffinity.TEXT, c2.getTypeAffinity());
        ISqlJetColumnDef c3 = table.getColumn("c3");
        assertEquals(SqlJetTypeAffinity.REAL, c3.getTypeAffinity());
        ISqlJetColumnDef c4 = table.getColumn("c4");
        assertEquals(SqlJetTypeAffinity.NUMERIC, c4.getTypeAffinity());
        ISqlJetColumnDef c5 = table.getColumn("c5");
        assertEquals(SqlJetTypeAffinity.NONE, c5.getTypeAffinity());
        ISqlJetColumnDef c6 = table.getColumn("c6");
        assertEquals(SqlJetTypeAffinity.NONE, c6.getTypeAffinity());
    }

    private CommonTree parse(String sql) throws SqlJetException {
        try {
            CharStream chars = new ANTLRStringStream(sql);
            SqlLexer lexer = new SqlLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(tokens);
            return (CommonTree) parser.create_table_stmt().getTree();
        } catch (RecognitionException re) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Invalid sql statement: " + sql);
        }
    }
}
