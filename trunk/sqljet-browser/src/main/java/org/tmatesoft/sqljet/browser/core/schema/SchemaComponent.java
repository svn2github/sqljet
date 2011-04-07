/**
 * SchemaComponent.java
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

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.netbeans.swing.outline.DefaultOutlineModel;
import org.netbeans.swing.outline.Outline;
import org.netbeans.swing.outline.OutlineModel;
import org.tmatesoft.sqljet.browser.core.IBrowserComponent;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SchemaComponent implements IBrowserComponent {

    private JScrollPane myComponent;
    private Outline myOutline;

    public void open(File dbFile) throws SqlJetException {
        // create model and set to the outline.
        SchemaTreeModel model;
        if (dbFile != null) {
            // open db and read schema.
            SqlJetDb db = null;
            try {
                db = SqlJetDb.open(dbFile, true);
                model = SchemaTreeModel.createInstance(db.getSchema());
            } finally {
                if (db != null) {
                    db.close();
                }
            }
        } else {
            model = SchemaTreeModel.createInstance(null);
        }
        SchemaRowModel rowModel = new SchemaRowModel();
        OutlineModel outlineModel = DefaultOutlineModel.createOutlineModel(model, rowModel, false, "Name");
        myOutline.setModel(outlineModel);
    }

    public JComponent getComponent() {
        if (myComponent != null) {
            return myComponent;
        }

        SchemaTreeModel model = null;
        try {
            model = SchemaTreeModel.createInstance(null);
        } catch (SqlJetException e) {
            // will not happen.
        }
        SchemaRowModel rowModel = new SchemaRowModel();
        OutlineModel outlineModel = DefaultOutlineModel.createOutlineModel(model, rowModel, false, "Name");
        
        myOutline = new Outline();
        myOutline.setRootVisible(false);
        myOutline.setShowGrid(false);
        myOutline.setColumnHidingAllowed(false);
        myOutline.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        myOutline.getColumnModel().setColumnSelectionAllowed(false);
        for (int i = 0; i < myOutline.getColumnModel().getColumnCount() - 1; i++) {
            myOutline.getColumnModel().getColumn(i).setMinWidth(100);
        }
        myOutline.setModel(outlineModel);

        myComponent = new JScrollPane(myOutline, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        myComponent.getViewport().setBackground(myOutline.getBackground());
        myComponent.getViewport().setOpaque(true);
        
        return myComponent;
    }

    public String getTip() {
        return getTitle();
    }
    public String getTitle() {
        return "Database Structure";
    }

}
