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

import java.nio.ByteBuffer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;
import org.tmatesoft.sqljet.core.internal.table.SqlJetTable;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetPreparedStatement {

    private final SqlJetDb db;
    private final String sql;
    private CommonTree ast;
    private ISqlJetTable table;
    private ISqlJetCursor cursor;

    public SqlJetPreparedStatement(SqlJetDb db, String sql) {
        this.db = db;
        this.sql = sql;
    }

    public void close() throws SqlJetException {
        if (table != null) {
            table = null;
        }
        if (cursor != null) {
            cursor.close();
            cursor = null;
        }
    }

    // Bindings

    public int getParametersCount() throws SqlJetException {
        return 0;
    }

    public void setInteger(int paramIndex, long value) throws SqlJetException {
    }

    public void setFloat(int paramIndex, double value) throws SqlJetException {
    }

    public void setText(int paramIndex, String value) throws SqlJetException {
    }

    public void setBlob(int paramIndex, byte[] value) throws SqlJetException {
    }

    public void setNull(int paramIndex) throws SqlJetException {
    }

    public void setInteger(String paramName, long value) throws SqlJetException {
    }

    public void setFloat(String paramName, double value) throws SqlJetException {
    }

    public void setText(String paramName, String value) throws SqlJetException {
    }

    public void setBlob(String paramName, byte[] value) throws SqlJetException {
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
                } else if ("create_table".equals(stmtName)) {
                    db.getSchema().createTable(sql);
                } else if ("drop_table".equals(stmtName)) {
                    handleDropTable();
                } else if ("create_index".equals(stmtName)) {
                    db.getSchema().createIndex(sql);
                } else if ("drop_index".equals(stmtName)) {
                    handleDropIndex();
                } else {
                    throw new SqlJetException(SqlJetErrorCode.ERROR, "Unsupported statement.");
                }
            } catch (RecognitionException e) {
                throw new SqlJetException(SqlJetErrorCode.ERROR, e);
            }
        } else {
            if (cursor != null) {
                cursor.next();
            }
        }
        if (cursor != null) {
            return !cursor.eof();
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
        table = db.openTable(tableName);
        if (table != null) {
            cursor = (SqlJetTable) table;
        }
    }

    private void handleDropTable() throws SqlJetException {
        CommonTree options = (CommonTree) ast.getChild(0);
        boolean ifExists = options.getChildCount() > 0 && "exists".equalsIgnoreCase(options.getChild(0).getText());
        String tableName = ast.getChild(1).getText();
        ISqlJetTableDef tableDef = db.getSchema().getTable(tableName);
        if (tableDef != null) {
            tableDef.drop();
        } else if (!ifExists) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Table does not exists.");
        }
    }

    private void handleDropIndex() throws SqlJetException {
        CommonTree options = (CommonTree) ast.getChild(0);
        boolean ifExists = options.getChildCount() > 0 && "exists".equalsIgnoreCase(options.getChild(0).getText());
        String indexName = ast.getChild(1).getText();
        ISqlJetIndexDef indexDef = db.getSchema().getIndex(indexName);
        if (indexDef != null) {
            indexDef.drop();
        } else if (!ifExists) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Index does not exists.");
        }
    }

    public int getColumnsCount() throws SqlJetException {
        return cursor.getFieldsCount();
    }

    public SqlJetValueType getColumnType(int columnIndex) throws SqlJetException {
        return cursor.getFieldType(columnIndex);
    }

    public long getInteger(int columnIndex) throws SqlJetException {
        return cursor.getInteger(columnIndex);
    }

    public double getFloat(int columnIndex) throws SqlJetException {
        return cursor.getFloat(columnIndex);
    }

    public String getText(int columnIndex) throws SqlJetException {
        return cursor.getString(columnIndex);
    }

    public ByteBuffer getBlob(int columnIndex) throws SqlJetException {
        return cursor.getBlob(columnIndex);
    }

    public boolean isNull(int columnIndex) throws SqlJetException {
        return cursor.isNull(columnIndex);
    }

    public void reset() throws SqlJetException {
    }
}
