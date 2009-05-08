/**
 * SqlJetPreparedStatement.java
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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.btree.table.SqlJetBtreeDataTable;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;
import org.tmatesoft.sqljet.core.internal.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeTable;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetPreparedStatement {

    private final ISqlJetBtree btree;
    private final String sql;
    private CommonTree ast;
    private ISqlJetBtreeTable table;

    public SqlJetPreparedStatement(ISqlJetBtree btree, String sql) {
        this.btree = btree;
        this.sql = sql;
    }

    public void close() throws SqlJetException {
        if (table != null) {
            table.close();
            table = null;
        }
    }

    // Bindings

    public int getParametersCount() throws SqlJetException {
        return 0;
    }

    public void setBLOB(int paramIndex, byte[] value) throws SqlJetException {
    }

    public void setDouble(int paramIndex, double value) throws SqlJetException {
    }

    public void setInteger(int paramIndex, int value) throws SqlJetException {
    }

    public void setLong(int paramIndex, long value) throws SqlJetException {
    }

    public void setText(int paramIndex, String value) throws SqlJetException {
    }

    public void setNull(int paramIndex) throws SqlJetException {
    }

    public void setBLOB(String paramName, byte[] value) throws SqlJetException {
    }

    public void setDouble(String paramName, double value) throws SqlJetException {
    }

    public void setInteger(String paramName, int value) throws SqlJetException {
    }

    public void setLong(String paramName, long value) throws SqlJetException {
    }

    public void setText(String paramName, String value) throws SqlJetException {
    }

    public void setNull(String paramName) throws SqlJetException {
    }

    public void clearBindings() throws SqlJetException {
    }

    // Execution

    /**
     * Executes the statement or advances to the next row of the query results.
     * 
     * @returns true if query results are available
     */
    public boolean step() throws SqlJetException {
        if (ast == null) {
            try {
                ast = parse();
                // System.out.println(CommonTreeDumper.toString(ast));
                String stmtName = ast.getText();
                if (stmtName != null) {
                    stmtName = stmtName.toLowerCase();
                }
                if ("select".equals(stmtName)) {
                    handleSelect();
                } else {
                    throw new SqlJetException(SqlJetErrorCode.ERROR, "Unsupported statement.");
                }
            } catch (RecognitionException e) {
                throw new SqlJetException(SqlJetErrorCode.ERROR, e);
            }
        } else {
            if (table != null) {
                table.next();
            }
        }
        if (table != null) {
            return !table.eof();
        }
        return false;
    }

    private CommonTree parse() throws SqlJetException, RecognitionException {
        CharStream chars = new ANTLRStringStream(sql);
        SqlLexer lexer = new SqlLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        return (CommonTree) parser.sql_stmt().getTree();
    }

    private void handleSelect() throws SqlJetException {
        // SELECT starts with a tree of SELECT_CORE statements
        // For now we support only single SELECT_CORE
        CommonTree selectCore = (CommonTree) ast.getChild(0);
        if (!"select_core".equalsIgnoreCase(selectCore.getText())) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Compound select is not supported yet.");
        }
        int i = 0;
        CommonTree child = (CommonTree) selectCore.getChild(i++);
        // SELECT_CORE may start with DISTINCT
        boolean distinct = false;
        if ("distinct".equalsIgnoreCase(child.getText())) {
            distinct = true;
            child = (CommonTree) selectCore.getChild(i++);
        }
        if (distinct) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Distinct select modifier is not supported yet.");
        }
        // All columns are grouped by RESULT_COLUMNS
        // For now we support only *
        assert "columns".equalsIgnoreCase(child.getText());
        if (child.getChildCount() != 1 && !"*".equals(child.getChild(0).getText())) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Can select only * for now.");
        }
        child = (CommonTree) selectCore.getChild(i++);
        // We require FROM to refer to a single table
        if (!"from".equalsIgnoreCase(child.getText())) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Select source should be specified.");
        }
        child = (CommonTree) child.getChild(0);
        if (!"alias".equalsIgnoreCase(child.getText())) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Compound select source is not supported yet.");
        }
        child = (CommonTree) child.getChild(0);
        if ("select".equalsIgnoreCase(child.getText())) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Select as select source is not supported yet.");
        }
        String tableName = child.getText();
        if (selectCore.getChildCount() > i) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Unsupported select syntax.");
        }
        ISqlJetSchema schema = new SqlJetSchema(btree);
        //System.err.println(schema.toString());
        if (schema.getTableNames().contains(tableName)) {
            table = new SqlJetBtreeDataTable(schema, tableName, false);
        }
    }

    public int getColumnsCount() throws SqlJetException {
        ISqlJetBtreeRecord record = table.getRecord();
        return record.getFieldsCount();
    }

    public SqlJetColumnType getColumnType(int columnIndex) throws SqlJetException {
        return SqlJetColumnType.TEXT;
    }

    public byte[] getBLOB(int columnIndex) throws SqlJetException {
        return null;
    }

    public double getDouble(int columnIndex) throws SqlJetException {
        return 0.0;
    }

    public int getInteger(int columnIndex) throws SqlJetException {
        return 0;
    }

    public long getLong(int columnIndex) throws SqlJetException {
        return 0;
    }

    public String getText(int columnIndex) throws SqlJetException {
        ISqlJetBtreeRecord record = table.getRecord();
        return record.getStringField(columnIndex, SqlJetEncoding.UTF8);
    }

    public void reset() throws SqlJetException {
    }
}
