/**
 * DataComponent.java
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
package org.tmatesoft.sqljet.browser.core.data;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DataComponent {

    public static JComponent createDataComponent(SqlJetDb db) throws SqlJetException {
        Set<String> names = db.getSchema().getTableNames();

        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(new JLabel("Table:"));
        topPanel.add(new JComboBox(db.getSchema().getTableNames().toArray()));
        panel.add(topPanel, BorderLayout.NORTH);
        
        // for now for the first table.
        if (names.size() > 0) {
            String tableName = names.iterator().next();
            ISqlJetTable table = db.getTable(tableName);
            
            DataTableModel model = DataTableModel.createInstance(table, 0);
            JTable jTable = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(jTable);
            panel.add(scrollPane, BorderLayout.CENTER);
            return panel;
        }
        return new JPanel();
    }

}
