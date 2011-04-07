/**
 * SqlJetExpressionsTest.java
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
package org.tmatesoft.sqljet.core.lang;

import org.tmatesoft.sqljet.core.internal.lang.SqlJetParserException;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetExpressionsTest extends SqlJetAbstractParserTest {

    public SqlJetExpressionsTest() {
        super("Expressions Test");
    }

    public void testErrors() {
        SqlJetParserException error = null;
        try {
            assertParses("", ";");
        } catch (SqlJetParserException e) {
            error = e;
        } catch (Exception e) {
            fail(e.toString());
        }
        assertNotNull(error);
    }

    public void testLiterals() throws Exception {
        assertParses("integer_literal{10}", "10");
        assertParses("float_literal{10.1}", "10.1");
        assertParses("float_literal{.55}", ".55");
        assertParses("float_literal{2e3}", "2e3");
        assertParses("float_literal{66e-5}", "66E-5");
        assertParses("float_literal{.7e+33}", ".7e+33");
        assertParses("string_literal{'abc'}", "'abc'");
        assertParses("string_literal{'ab\\\\c'}", "'ab\\\\c'");
        assertParses("string_literal{'a\\\"bc'}", "'a\\\"bc'");
        assertParses("string_literal{'a\\'bc'}", "'a\\'bc'");
        assertParses("string_literal{\"abc\"}", "\"abc\"");
        assertParses("string_literal{\"ab\\\\c\"}", "\"ab\\\\c\"");
        assertParses("string_literal{'a\\\"bc'}", "'a\\\"bc'");
        assertParses("string_literal{\"a\\'bc\"}", "\"a\\'bc\"");
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
        assertParses("column_expression{romeo}", "(romeo)");
        assertParses("is_null{column_expression{bug}}", "bug isnull");
        assertParses("not_null{column_expression{bug}}", "bug notnull");
        assertParses("is_null{column_expression{bug}}", "bug is null");
        assertParses("not_null{column_expression{bug}}", "bug not null");
        assertParses("not_null{column_expression{bug}}", "bug is not null");
        assertParses("raise{ignore}", "raise (ignore)");
        assertParses("raise{rollback}{'error error'}", "raise (rollback,'error error')");
        assertParses("raise{abort}{'error!'}", "raise ( abort , 'error!' )");
        assertParses("raise{fail}{'error!'}", "raise (fail, 'error!')");
        assertParses("cast{column_expression{a}}{type{type_params}{b}}", "cast (a as b)");
        assertParses("function_expression{fn}", "fn()");
        assertParses("function_expression{fn}{*}", "fn (*)");
        assertParses("function_expression{fn}{column_expression{a}}{column_expression{b}}", "fn(a,b)");
        assertParses("function_expression{fn}{distinct}{column_expression{a}}", "fn(distinct a)");
    }

    public void testConditionalExpressions() throws Exception {
        assertParses("like{column_expression{b}}{column_expression{a}}", "a like b");
        assertParses("glob{column_expression{b}}{column_expression{a}}", "a glob b");
        assertParses("regexp{column_expression{b}}{column_expression{a}}", "a regexp b");
        assertParses("match{column_expression{b}}{escape{column_expression{c}}}{column_expression{a}}",
                "a match b escape c");
        assertParses("in_values{in{column_expression{b}}}{column_expression{a}}", "a in (b)");
        assertParses(
                "in_values{in{column_expression{b}}{column_expression{c}}{column_expression{d}}}{column_expression{a}}",
                "a in (b,c , d)");
        assertParses("in_values{not}{in{column_expression{b}}}{column_expression{a}}", "a not in( b )");
        assertParses("in_table{in{t}}{column_expression{a}}", "a in t");
        assertParses("in_table{not}{in{t}}{column_expression{a}}", "a not in t");
        assertParses("in_table{in{t{d}}}{column_expression{a}}", "a in d.t");
        assertParses("between{and{column_expression{b}}{column_expression{c}}}{column_expression{a}}",
                "a between b and c");
        assertParses("between{not}{and{column_expression{b}}{column_expression{c}}}{column_expression{a}}",
                "a not between b and c");
        assertParses("case{column_expression{a}}{when{column_expression{b}}{column_expression{c}}}",
                "case a when b then c end");
        assertParses(
                "case{column_expression{a}}{when{column_expression{b}}{column_expression{c}}}{column_expression{d}}",
                "case a when b then c else d end");
        assertParses(
                "case{column_expression{a}}{when{column_expression{b}}{column_expression{c}}}{when{column_expression{d}}{column_expression{e}}}",
                "case a when b then c when d then e end");
    }

    public void testBinaryExpressions() throws Exception {
        assertParses("or{integer_literal{2}}{integer_literal{3}}", "2 or 3");
        assertParses("or{or{integer_literal{2}}{integer_literal{3}}}{integer_literal{4}}", "2 or 3 or 4");
        assertParses("and{integer_literal{5}}{integer_literal{6}}", "5 and 6");
        assertParses("or{integer_literal{4}}{and{integer_literal{5}}{integer_literal{6}}}", "4 or 5 and 6");

        // order of eq subexpressions is reversed in grammar
        assertParses("={float_literal{.3}}{float_literal{.2}}", ".2=.3");
        assertParses("=={float_literal{.3}}{float_literal{.2}}", ".2==.3");
        assertParses("!={float_literal{.3}}{float_literal{.2}}", ".2!=.3");
        assertParses("<>{float_literal{.3}}{float_literal{.2}}", ".2<>.3");

        assertParses("<{string_literal{'me'}}{string_literal{'you'}}", "'me'<'you'");
        assertParses("<={string_literal{'me'}}{string_literal{'you'}}", "'me'<='you'");
        assertParses(">{string_literal{'me'}}{string_literal{'you'}}", "'me'>'you'");
        assertParses(">={string_literal{'me'}}{string_literal{'you'}}", "'me'>='you'");
        assertParses(">>{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'>>x'def'");
        assertParses("<<{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'<<x'def'");
        assertParses("&{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'&x'def'");
        assertParses("|{blob_literal{x'abc'}}{blob_literal{x'def'}}", "x'abc'|x'def'");
        assertParses("+{integer_literal{2}}{integer_literal{3}}", "2+3");
        assertParses("+{integer_literal{2}}{integer_literal{3}}", "2 + 3");
        assertParses("-{integer_literal{2}}{integer_literal{3}}", "2-3");
        assertParses("-{integer_literal{2}}{integer_literal{3}}", "2  -  3");
        assertParses("*{integer_literal{2}}{integer_literal{3}}", "2*3");
        assertParses("/{integer_literal{2}}{integer_literal{3}}", "2/3");
        assertParses("%{integer_literal{2}}{integer_literal{3}}", "2%3");
        assertParses("||{string_literal{'me'}}{string_literal{'you'}}", "'me'||'you'");
    }

    public void testUnaryExpressions() throws Exception {
        assertParses("+{integer_literal{9}}", "+9");
        assertParses("+{integer_literal{9}}", "+  9");
        assertParses("-{integer_literal{9}}", "-9");
        assertParses("-{integer_literal{9}}", "- 9");
        assertParses("~{integer_literal{9}}", "~9");
        assertParses("~{integer_literal{9}}", "~  9");
        assertParses("not{integer_literal{9}}", "NOT 9");
    }

    public void testCollate() throws Exception {
        assertParses("collate{column_expression{a}}{b}", "a collate b");
    }

    protected void assertParses(String curlyDump, String sql) throws Exception {
        curlyDump = "select{select_core{columns{alias{" + curlyDump + "}}}}";
        sql = "select " + sql + ";";
        super.assertParses(curlyDump, sql);
    }
}
