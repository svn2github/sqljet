/**
 * SqlJetTableDef.java
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
package org.tmatesoft.sqljet.core.internal.btree.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.ext.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.ext.ISqlJetTableConstraint;
import org.tmatesoft.sqljet.core.ext.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetTableDef implements ISqlJetTableDef {

    private final String name;
    private final String databaseName;
    private final boolean temporary;
    private final boolean ifNotExists;
    private final List<ISqlJetColumnDef> columns;
    private final List<ISqlJetTableConstraint> constraints;
    private final int page;

    public SqlJetTableDef(CommonTree ast, int page) {
        CommonTree optionsNode = (CommonTree) ast.getChild(0);
        temporary = hasOption(optionsNode, "temporary");
        ifNotExists = hasOption(optionsNode, "exists");

        CommonTree nameNode = (CommonTree) ast.getChild(1);
        name = nameNode.getText();
        databaseName = nameNode.getChildCount() > 0 ? nameNode.getChild(0).getText() : null;

        List<ISqlJetColumnDef> columns = new ArrayList<ISqlJetColumnDef>();
        List<ISqlJetTableConstraint> constraints = new ArrayList<ISqlJetTableConstraint>();
        if (ast.getChildCount() > 2) {
            CommonTree defNode = (CommonTree) ast.getChild(2);
            if ("column_defs".equalsIgnoreCase(defNode.getText())) {
                for (int i = 0; i < defNode.getChildCount(); i++) {
                    columns.add(new SqlJetColumnDef((CommonTree) defNode.getChild(i)));
                }
                if (ast.getChildCount() > 4) {
                    CommonTree constraintsNode = (CommonTree) ast.getChild(3);
                    assert "constraints".equalsIgnoreCase(constraintsNode.getText());
                    for (int i = 0; i < constraintsNode.getChildCount(); i++) {
                        constraints.add(new SqlJetTableConstraint((CommonTree) constraintsNode.getChild(i)));
                    }
                }
            } else {
                // TODO: handle select
            }
        }
        this.columns = Collections.unmodifiableList(columns);
        this.constraints = Collections.unmodifiableList(constraints);

        this.page = page;
    }

    private boolean hasOption(CommonTree optionsNode, String name) {
        for (int i = 0; i < optionsNode.getChildCount(); i++) {
            CommonTree optionNode = (CommonTree) optionsNode.getChild(i);
            if (name.equalsIgnoreCase(optionNode.getText())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public boolean isTemporary() {
        return temporary;
    }

    public boolean isKeepExisting() {
        return ifNotExists;
    }

    public List<ISqlJetColumnDef> getColumns() {
        return columns;
    }

    public List<ISqlJetTableConstraint> getConstraints() {
        return constraints;
    }

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(page);
        buffer.append(": CREATE ");
        if (isTemporary()) {
            buffer.append("TEMPORARY ");
        }
        if (isKeepExisting()) {
            buffer.append("IF NOT EXISTS ");
        }
        buffer.append("TABLE ");
        if (getDatabaseName() != null) {
            buffer.append(getDatabaseName());
            buffer.append('.');
        }
        buffer.append(getName());
        buffer.append(" (");
        List<ISqlJetColumnDef> columns = getColumns();
        for (int i = 0; i < columns.size(); i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(columns.get(i).toString());
        }
        List<ISqlJetTableConstraint> constraints = getConstraints();
        for (int i = 0; i < constraints.size(); i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(constraints.get(i).toString());
        }
        buffer.append(')');
        return buffer.toString();
    }
}
