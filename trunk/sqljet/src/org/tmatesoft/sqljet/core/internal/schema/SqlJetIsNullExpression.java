/**
 * SqlJetIsNullExpression.java
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
import org.tmatesoft.sqljet.core.schema.ISqlJetIsNullExpression;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetIsNullExpression extends SqlJetExpression implements ISqlJetIsNullExpression {

    private final boolean not;

    public SqlJetIsNullExpression(CommonTree ast) {
        not = "notnull".equalsIgnoreCase(ast.getText());
        assert not || "isnull".equalsIgnoreCase(ast.getText());
    }

    public boolean isNot() {
        return not;
    }

    @Override
    public String toString() {
        return not ? "IS NOT NULL" : "IS NULL";
    }
}
