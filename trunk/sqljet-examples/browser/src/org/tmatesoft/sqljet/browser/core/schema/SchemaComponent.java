/**
 * SchemaComponent.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.browser.core.schema;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.netbeans.swing.outline.DefaultOutlineModel;
import org.netbeans.swing.outline.Outline;
import org.netbeans.swing.outline.OutlineModel;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SchemaComponent {
    
    public static JComponent createSchemaComponent(SqlJetDb db) throws SqlJetException {
        SchemaTreeModel model = SchemaTreeModel.createInstance(db.getSchema());
        SchemaRowModel rowModel = new SchemaRowModel();
        OutlineModel outlineModel = DefaultOutlineModel.createOutlineModel(model, rowModel, false, "Name");
        Outline outline = new Outline();
        outline.setRootVisible(false);
        outline.setShowGrid(false);
        outline.setColumnHidingAllowed(false);
        outline.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        outline.getColumnModel().setColumnSelectionAllowed(false);
        outline.setModel(outlineModel);
        JScrollPane scrollPane = new JScrollPane(outline, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getViewport().setBackground(outline.getBackground());
        scrollPane.getViewport().setOpaque(true);
        return scrollPane;
    }

}
