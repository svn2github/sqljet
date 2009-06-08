/**
 * SqlJetBinaryExpression.java
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
package org.tmatesoft.sqljet.core.internal.schema;

import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetBinaryExpression;
import org.tmatesoft.sqljet.core.schema.ISqlJetExpression;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetBinaryExpression extends SqlJetExpression implements ISqlJetBinaryExpression {

    private final Operation operation;
    private final ISqlJetExpression leftSubexpression, rightSubexpression;

    public SqlJetBinaryExpression(CommonTree ast) throws SqlJetException {
        operation = Operation.decode(ast.getText());
        assert operation != null;
        leftSubexpression = create((CommonTree) ast.getChild(0));
        rightSubexpression = create((CommonTree) ast.getChild(1));
    }

    public Operation getOperation() {
        return operation;
    }

    public ISqlJetExpression getLeftSubexpression() {
        return leftSubexpression;
    }

    public ISqlJetExpression getRightSubexpression() {
        return rightSubexpression;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(leftSubexpression);
        buffer.append(' ');
        buffer.append(operation);
        buffer.append(' ');
        buffer.append(rightSubexpression);
        return buffer.toString();
    }
}
