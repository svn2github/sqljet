/**
 * SchemaTreeModel.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetColumnDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SchemaTreeModel implements TreeModel {

    private Object myRoot;
    private Collection<TreeModelListener> myListeners = new HashSet<TreeModelListener>();
    
    public static SchemaTreeModel createInstance(ISqlJetSchema schema) throws SqlJetException {
        SchemaTreeNode root = new SchemaTreeNode();
        if (schema == null) {
            return new SchemaTreeModel(root);
        }
        try {
            Set<String> tableNames = schema.getTableNames();
            for (String tableName : tableNames) {
                ISqlJetTableDef table = schema.getTable(tableName);
                SchemaTreeNode node = new SchemaTreeNode(table);                
                List<ISqlJetColumnDef> columns = table.getColumns();
                for (ISqlJetColumnDef column : columns) {
                    node.addChild(new SchemaTreeNode(table, column));
                }
                root.addChild(node);
            }
            Set<String> indexNames = schema.getIndexNames();
            for (String indexName : indexNames) {
                ISqlJetIndexDef index = schema.getIndex(indexName);
                root.addChild(new SchemaTreeNode(index));
            }
        } catch (SqlJetException e) {
            root = new SchemaTreeNode();
            throw e;
        }
        return new SchemaTreeModel(root);
    }

    private SchemaTreeModel(SchemaTreeNode root) {
        myRoot = root;
    }
    
    public int getChildCount(Object parent) {
        return ((SchemaTreeNode) parent).getChildCount();
    }
    
    public int getIndexOfChild(Object parent, Object child) {
        return ((SchemaTreeNode) parent).getIndexOfChild((SchemaTreeNode) child);
    }

    public Object getChild(Object parent, int index) {
        return ((SchemaTreeNode) parent).getChildAt(index);
    }
    
    public Object getRoot() {
        return myRoot;
    }
    
    public boolean isLeaf(Object node) {
        return ((SchemaTreeNode) node).isLeaf();
    }

    public void addTreeModelListener(TreeModelListener l) {
        synchronized(myListeners) {
            myListeners.add(l);
        }
    }
    public void removeTreeModelListener(TreeModelListener l) {
        synchronized(myListeners) {
            myListeners.remove(l);
        }
    }    

    public void valueForPathChanged(TreePath path, Object newValue) {
    }
}
