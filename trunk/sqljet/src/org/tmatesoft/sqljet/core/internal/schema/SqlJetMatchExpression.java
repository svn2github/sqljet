/**
 * SqlJetMatchExpression.java
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
import org.tmatesoft.sqljet.core.schema.ISqlJetExpression;
import org.tmatesoft.sqljet.core.schema.ISqlJetMatchExpression;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetMatchExpression extends SqlJetExpression implements ISqlJetMatchExpression {

    private final Operation operation;
    private final boolean not;
    private final ISqlJetExpression matchExpression, escapeExpression;

    public SqlJetMatchExpression(CommonTree ast) throws SqlJetException {
        operation = Operation.decode(ast.getText());
        assert operation != null;
        matchExpression = create((CommonTree) ast.getChild(0));
        if (ast.getChildCount() > 1) {
            CommonTree child = (CommonTree) ast.getChild(1);
            if ("not".equalsIgnoreCase(child.getText())) {
                not = true;
                if (ast.getChildCount() > 2) {
                    child = (CommonTree) ast.getChild(2);
                    assert "escape".equalsIgnoreCase(child.getText());
                    escapeExpression = create((CommonTree) child.getChild(0));
                } else {
                    escapeExpression = null;
                }
            } else {
                not = false;
                assert "escape".equalsIgnoreCase(child.getText());
                escapeExpression = create((CommonTree) child.getChild(0));
            }
        } else {
            not = false;
            escapeExpression = null;
        }
    }

    public Operation getOperation() {
        return operation;
    }

    public boolean isNot() {
        return not;
    }

    public ISqlJetExpression getMatchExpression() {
        return matchExpression;
    }

    public ISqlJetExpression getEscapeExpression() {
        return escapeExpression;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        if (isNot()) {
            buffer.append("NOT ");
        }
        buffer.append(getOperation());
        buffer.append(' ');
        buffer.append(getMatchExpression());
        if (getEscapeExpression() != null) {
            buffer.append(" ESCAPE");
            buffer.append(getEscapeExpression());
        }
        return buffer.toString();
    }
}
