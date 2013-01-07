/**
 * DataComponent.java
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
package org.tmatesoft.sqljet.browser.core.data;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.nio.ByteBuffer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;
import org.tmatesoft.sqljet.browser.core.IBrowserComponent;
import org.tmatesoft.sqljet.browser.core.IBrowserRunnable;
import org.tmatesoft.sqljet.browser.core.IProgress;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DataComponent implements IBrowserComponent, ItemListener, ActionListener {

    private JComponent myComponent;
    private JComboBox myTableNamesCombo;
    
    private JButton myNextButton;
    private JButton myPreviousButton;
    private JLabel myRangeLabel;
    
    private JTable myDataTable;    
    
    private File myDBFile;
    private Object myLastSelectedItem;
    
    private BrowserComponentManager myManager;
    private int myPageSize;
    
    public DataComponent(BrowserComponentManager manager, int pageSize) {
        myManager = manager;
        myPageSize = pageSize;
    }

    public void open(File dbFile) throws SqlJetException {
        myDBFile = dbFile;
        if (dbFile == null) {
            myTableNamesCombo.setModel(new DefaultComboBoxModel(new Object[] {"<empty>"}));
            myTableNamesCombo.setEnabled(false);
        } else {
            SqlJetDb db = null;
            try {
                db = SqlJetDb.open(dbFile, true);
                myTableNamesCombo.setModel(new DefaultComboBoxModel(db.getSchema().getTableNames().toArray()));
                myTableNamesCombo.setEnabled(myTableNamesCombo.getModel().getSize() > 0);
            } finally {
                if (db != null) {
                    db.close();
                }
            }
        }
        if (myTableNamesCombo.isEnabled()) {
            myTableNamesCombo.setSelectedIndex(0);
        }
        itemStateChanged(null);
    }

    public JComponent getComponent() {
        if (myComponent != null) {
            return myComponent;
        }
        myComponent = new JPanel(new BorderLayout());
        
        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboPanel.add(new JLabel("Table:"));
        myTableNamesCombo = new JComboBox();
        myTableNamesCombo.addItemListener(this);
        comboPanel.add(myTableNamesCombo);
        
        myPreviousButton = new JButton("<");
        myNextButton = new JButton(">");
        myRangeLabel = new JLabel();
        myRangeLabel.setMinimumSize(new Dimension(100, 0));
        
        myPreviousButton.addActionListener(this);
        myNextButton.addActionListener(this);

        JPanel rangePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rangePanel.add(myPreviousButton);
        rangePanel.add(myRangeLabel);
        rangePanel.add(myNextButton);
        
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(comboPanel, BorderLayout.WEST);
        topPanel.add(rangePanel, BorderLayout.EAST);
        
        myComponent.add(topPanel, BorderLayout.NORTH);
        myDataTable = new JTable();
        myDataTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                if (value instanceof ByteBuffer) {
                    String strValue = null;
                    ByteBuffer buffer = (ByteBuffer) value;
                    int toGet = Math.min(16, buffer.limit());
                    byte[] dst = new byte[toGet];
                    buffer.get(dst);
                    buffer.rewind();
                    strValue = new String(dst, 0, dst.length);
                    if (dst.length < buffer.limit()) {
                        strValue += "... [" + (buffer.limit() - toGet) + " bytes more]";
                    }
                    value = strValue;
                } 
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
            
        });
        
        JScrollPane scrollPane = new JScrollPane(myDataTable);
        scrollPane.getViewport().setBackground(myDataTable.getBackground());
        scrollPane.getViewport().setOpaque(true);
        myComponent.add(scrollPane, BorderLayout.CENTER);
        
        return myComponent;
    }

    public String getTip() {
        return getTitle();
    }
    public String getTitle() {
        return "Browse Data";
    }

    public void itemStateChanged(ItemEvent e) {
        if (myTableNamesCombo.getSelectedItem() == myLastSelectedItem) {
            return;
        }
        myLastSelectedItem = myTableNamesCombo.getSelectedItem();
        loadData(myDBFile, (String) myLastSelectedItem, 0);
    }

    public void actionPerformed(ActionEvent e) {
        TableModel model = myDataTable.getModel();
        if (model instanceof DataTableModel) {
            long start = ((DataTableModel) model).getFirstIndex();
            if (e.getSource() == myPreviousButton) {
                start -= myPageSize;
            } else {
                start += myPageSize;
            }
            loadData(myDBFile, (String) myTableNamesCombo.getSelectedItem(), start);
        }
    }
    
    private void loadData(final File dbFile, final String tableName, final long row) {
        myManager.schedule(new IBrowserRunnable() {
            public void run(IProgress progress) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        myPreviousButton.setEnabled(false);
                        myNextButton.setEnabled(false);
                        myRangeLabel.setEnabled(false);
                    }
                });
                TableModel model = null;
                if (dbFile == null) {
                    model = new DefaultTableModel();
                } else {
                    // open db and read schema.
                    progress.start("Loading Data...", myPageSize);
                    SqlJetDb db = null;
                    try {
                        db = SqlJetDb.open(dbFile, true);
                        ISqlJetTable table = db.getTable(tableName);
                        model = DataTableModel.createInstance(table, row, myPageSize, progress);
                    } catch (final Throwable th) {
                        model = new DefaultTableModel();
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                myManager.showErrorDialog(th);
                            }
                        });
                    } finally {
                        if (db != null) {
                            try {
                                db.close();
                            } catch (SqlJetException e) {
                            }
                        }
                        progress.finish();
                    }                   
                }
                installModel(model);
            }
        }, true);
    }
    
    private void installModel(final TableModel model) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                myDataTable.setModel(model);
                myNextButton.setEnabled(model.getRowCount() == myPageSize);
                long start = 0;
                if (model instanceof DataTableModel) {
                    start = ((DataTableModel) model).getFirstIndex();
                    if (start == 0 && model.getRowCount() == 0) {
                        myRangeLabel.setText("empty");
                        myRangeLabel.setEnabled(false);
                    } else {
                        myRangeLabel.setText((start + 1) + " - " + (start + model.getRowCount()));
                        myRangeLabel.setEnabled(true);
                    }
                } else {
                    myRangeLabel.setText("empty");
                    myRangeLabel.setEnabled(false);
                }
                myPreviousButton.setEnabled(start > 0);                
            }
        });
    }

}
