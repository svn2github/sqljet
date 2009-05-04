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
    private final boolean temporary;
    private final List<ISqlJetColumnDef> columns;
    private final List<ISqlJetTableConstraint> constraints;
    private final int page;

    public SqlJetTableDef(CommonTree ast, int page) {
        int childIndex = 0;
        CommonTree child = (CommonTree) ast.getChild(childIndex++);
        if ("temporary".equalsIgnoreCase(child.getText())) {
            temporary = true;
            child = (CommonTree) ast.getChild(childIndex++);
        } else {
            temporary = false;
        }
        name = child.getText();
        child = (CommonTree) ast.getChild(childIndex++);
        List<ISqlJetColumnDef> columns = new ArrayList<ISqlJetColumnDef>();
        if ("column_defs".equalsIgnoreCase(child.getText())) {
            for (int columnIndex = 0; columnIndex < child.getChildCount(); columnIndex++) {
                columns.add(new SqlJetColumnDef((CommonTree) child.getChild(columnIndex)));
            }
            child = (CommonTree) ast.getChild(childIndex++);
        }
        this.columns = Collections.unmodifiableList(columns);
        List<ISqlJetTableConstraint> constraints = new ArrayList<ISqlJetTableConstraint>();
        if ("table_constraints".equalsIgnoreCase(child.getText())) {
            for (int constraintIndex = 0; constraintIndex < child.getChildCount(); constraintIndex++) {
                constraints.add(new SqlJetTableConstraint((CommonTree) child.getChild(constraintIndex)));
            }
            child = (CommonTree) ast.getChild(childIndex++);
        }
        this.constraints = Collections.unmodifiableList(constraints);
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public boolean isTemporary() {
        return temporary;
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
        buffer.append("TABLE ");
        buffer.append(getName());
        buffer.append(" ( ");
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
        buffer.append(")");
        return buffer.toString();
    }
}
