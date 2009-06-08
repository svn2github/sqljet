/**
 * SqlJetExpressionsTest.java
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

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetExpressionsTest extends SqlJetAbstractParserTest {

    public SqlJetExpressionsTest() {
        super("Expressions Test");
    }

    public void testLiterals() throws Exception {
        assertParses("integer_literal{10}", "10");
        assertParses("float_literal{10.1}", "10.1");
        assertParses("float_literal{.55}", ".55");
        assertParses("float_literal{2e3}", "2e3");
        assertParses("float_literal{66e-5}", "66E-5");
        assertParses("float_literal{.7e+33}", ".7e+33");
        assertParses("string_literal{'abc'}", "'abc'");
        assertParses("blob_literal{x'05f6a0'}", "x'05f6a0'");
        assertParses("null", "null");
        assertParses("function_literal{current_date}", "current_date");
        assertParses("function_literal{current_time}", "current_time");
        assertParses("function_literal{current_timestamp}", "current_timestamp");
    }

    public void testBindParameters() throws Exception {
        assertParses("bind", "?");
        assertParses("bind{1}", "?1");
        assertParses("bind_name{john}", ":john");
        assertParses("bind_name{smith}", "@smith");
    }

    public void testAtoms() throws Exception {
        assertParses("column_expression{romeo}", "romeo");
        assertParses("column_expression{ben{big}}", "big.ben");
        assertParses("column_expression{money{more{send}}}", "send.more.money");
        assertParses("null", "(null)");
        assertParses("is_null", "isnull");
        assertParses("not_null", "notnull");
        assertParses("is_null", "is null");
        assertParses("not_null", "is not null");
    }

    public void testBinaryExpressions() throws Exception {
        assertParses("or{integer_literal{2}}{integer_literal{3}}", "2 or 3");
        assertParses("or{or{integer_literal{2}}{integer_literal{3}}}{integer_literal{4}}", "2 or 3 or 4");
        assertParses("and{integer_literal{5}}{integer_literal{6}}", "5 and 6");
        assertParses("or{integer_literal{4}}{and{integer_literal{5}}{integer_literal{6}}}", "4 or 5 and 6");
        assertParses("={float_literal{.2}}{float_literal{.3}}", ".2=.3");
        assertParses("=={float_literal{.2}}{float_literal{.3}}", ".2==.3");
        assertParses("!={float_literal{.2}}{float_literal{.3}}", ".2!=.3");
        assertParses("<>{float_literal{.2}}{float_literal{.3}}", ".2<>.3");
        assertParses("<{string_literal{'me'}}{string_literal{'you'}}", "'me'<'you'");
        assertParses("<={string_literal{'me'}}{string_literal{'you'}}", "'me'<='you'");
        assertParses(">{string_literal{'me'}}{string_literal{'you'}}", "'me'>'you'");
        assertParses(">={string_literal{'me'}}{string_literal{'you'}}", "'me'>='you'");
        assertParses(">>{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'>>x'def'");
        assertParses("<<{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'<<x'def'");
        assertParses("&{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'&x'def'");
        assertParses("|{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'|x'def'");
        assertParses("+{integer_literal{2}}{integer_literal{3}}", "2+3");
        assertParses("-{integer_literal{2}}{integer_literal{3}}", "2-3");
        assertParses("*{integer_literal{2}}{integer_literal{3}}", "2*3");
        assertParses("/{integer_literal{2}}{integer_literal{3}}", "2/3");
        assertParses("%{integer_literal{2}}{integer_literal{3}}", "2%3");
        assertParses("||{string_literal{'me'}}{string_literal{'you'}}", "'me'||'you'");
    }

    protected void assertParses(String curlyDump, String sql) throws Exception {
        curlyDump = "select{select_core{columns{alias{" + curlyDump + "}}}}";
        sql = "select " + sql + ";";
        super.assertParses(curlyDump, sql);
    }
}
