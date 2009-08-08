/**
 * DBBrowser.java
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
package org.tmatesoft.sqljet.browser;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import org.tmatesoft.sqljet.browser.core.data.DataComponent;
import org.tmatesoft.sqljet.browser.core.schema.SchemaComponent;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetVersion;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DBBrowser {

    public static void main(String[] args) {
        JFrame frame = new JFrame("SQLJet Database Browser");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }            
        });
        frame.getContentPane().setLayout(new BorderLayout());
        
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        File dbFile = chooser.getSelectedFile();
        if (result == JFileChooser.CANCEL_OPTION || dbFile == null) {
            System.exit(0);
        }
        frame.setTitle("SQLJet Database Browser :: " + dbFile.getName());
        SqlJetDb db = null;
        JComponent schema = null;
        JComponent data = null;
        try {
            db = SqlJetDb.open(dbFile, false);
            schema = SchemaComponent.createSchemaComponent(db);
            data = DataComponent.createDataComponent(db);
        } catch (SqlJetException e1) {
            JOptionPane.showMessageDialog(new JFrame(), e1.toString(), "Error Opening DB",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } finally {
            if (db != null) {
                try {
                    db.close();
                } catch (SqlJetException e1) {
                    e1.printStackTrace();
                }
            }
        }
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.insertTab("Database Structure", null, schema, "Database Structure", 0);
        tabbedPane.insertTab("Browse Data", null, data, "Browse Data", 1);
        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        JLabel status = new JLabel("<html><body>Powered by SQLJet v" + SqlJetVersion.getVersionString() + " (c) 2009, TMate Software, <a href=\"http://sqljet.com/\">http://sqljet.com/</a></body></html>");
        frame.getContentPane().add(status, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
    }

}
