/**
 * SqlJetSelectTest.java
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

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetSelectTest extends SqlJetAbstractParserTest {

    public SqlJetSelectTest() {
        super("SELECT Test");
    }

    public void testSelectCore() throws Exception {
        assertParses("select{select_core{columns{*}}{from{alias{t}}}}", "select * from t;");
        assertParses("select{select_core{columns{*{x}}}{from{alias{t}}}}", "select x.* from t;");
        assertParses("select{select_core{columns{alias{column_expression{a}}}}{from{alias{t}}}}", "select a from t;");
        assertParses(
                "select{select_core{columns{alias{+{column_expression{a}}{*{column_expression{b}}{column_expression{c}}}}}}{from{alias{d}}}}",
                "select a+b * c from d;");
        assertParses(
                "select{select_core{columns{alias{column_expression{a}}}{alias{column_expression{b}}}}{from{alias{t}}}}",
                "select a,b from t;");
        assertParses("select{select_core{columns{alias{column_expression{a}}}}{from{alias{t}}}}",
                "select all a from t;");
        assertParses("select{select_core{distinct}{columns{alias{column_expression{a}}}}{from{alias{t}}}}",
                "select distinct a from t;");
        assertParses("select{select_core{columns{alias{column_expression{a}}{b}}}{from{alias{t}}}}",
                "select a as b from t;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{where{column_expression{z}}}}",
                "select * from t where z;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_expression{n}}}}}",
                "select * from t group by n;");
        assertParses(
                "select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_expression{n}}}{ordering{column_expression{r}}}}}",
                "select * from t group by n,r;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_expression{a}}{asc}}}}",
                "select * from t group by a asc;");
        assertParses("select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_expression{d}}{desc}}}}",
                "select * from t group by d desc;");
        assertParses(
                "select{select_core{columns{*}}{from{alias{t}}}{group{ordering{column_expression{x}}}{having{column_expression{y}}}}}",
                "select * from t group by x having y;");
        assertParses(
                "select{select_core{columns{alias{+{column_expression{a}}{column_expression{b}}}}{alias{column_expression{c}}{n}}{alias{-{column_expression{d}}{column_expression{e}}}}}{from{alias{t}}}{where{<{column_expression{i}}{column_expression{j}}}}{group{ordering{column_expression{x}}{desc}}{ordering{column_expression{y}}}{having{*{column_expression{z}}{column_expression{z}}}}}}",
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
}
