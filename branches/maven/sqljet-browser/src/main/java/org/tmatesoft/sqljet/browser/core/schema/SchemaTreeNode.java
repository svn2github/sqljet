/**
 * SchemaTreeNode.java
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
package org.tmatesoft.sqljet.browser.core.schema;

import java.util.ArrayList;
import java.util.List;

import org.tmatesoft.sqljet.core.schema.ISqlJetColumnConstraint;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
class SchemaTreeNode {
    
    private String myName;
    private String myObjectType;
    private String myType;
    private String mySchema;

    private List<SchemaTreeNode> myChildren = new ArrayList<SchemaTreeNode>();

    SchemaTreeNode() {
        myName = "<root>";
        myObjectType = "root";
        myType = "";
        mySchema = "";
    }

    SchemaTreeNode(ISqlJetTableDef table) {
        myName = table.getName();
        myObjectType = "table";
        myType = "";
        mySchema = table.toSQL();
    }

    SchemaTreeNode(ISqlJetIndexDef index) {
        myName = index.getName();
        myObjectType = "index";
        myType = "";
        mySchema = index.toSQL();
    }

    SchemaTreeNode(ISqlJetTableDef table, ISqlJetColumnDef column) {
        myName = column.getName();
        myObjectType = "field";
        List<String> names = column.getType() == null ? new ArrayList<String>() : column.getType().getNames();
        List<ISqlJetColumnConstraint> constraints = column.getConstraints();
        StringBuffer type = new StringBuffer();
        for (String name : names) {
            if (type.length() > 0) {
                type.append(' ');
            }
            type.append(name);
        }
        for (ISqlJetColumnConstraint constraint : constraints) {
            if (type.length() > 0) {
                type.append(' ');
            }
            type.append(constraint.toString());
        }
        myType = type.toString();
        mySchema = "";
    }
    
    public void addChild(SchemaTreeNode child) {
        myChildren.add(child);
    }
    
    public int getChildCount() {
        return myChildren.size();
    }
    
    public boolean isLeaf() {
        return myChildren.size() == 0;
    }
    
    public SchemaTreeNode getChildAt(int index) {
        return myChildren.get(index);
    }
    
    public int getIndexOfChild(SchemaTreeNode child) {
        return myChildren.indexOf(child);
    }
    
    public String getName() {
        return myName;
    }

    public String getTypeName() {
        return myObjectType;
    }

    public String getType() {
        return myType;
    }

    public String getSchema() {
        return mySchema;
    }
    
    public String toString() {
        return getName();
    }

}
