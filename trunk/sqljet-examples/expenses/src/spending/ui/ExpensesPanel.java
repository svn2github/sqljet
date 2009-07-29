/**
 * ExpensesPanel.java
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
package spending.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.Date;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

import spending.core.Payment;
import spending.core.SpendingDB;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class ExpensesPanel extends JPanel {
    
    private static final long serialVersionUID = 7943680283035396093L;
    
    private JTable myTable;
    private ExpsensesTableModel myTableModel;
    private JTextArea myInfoText;

    public ExpensesPanel() {
        super(new BorderLayout(), true);
        // create subcomponents.
        // table and text area
        myTable = new JTable();
        
        myTableModel = new ExpsensesTableModel();
        myInfoText = new JTextArea();
        myTable.setModel(myTableModel);
        myTable.setCellEditor(null);
        myInfoText.setRows(7);
        myInfoText.setEditable(false);
        
        myTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int index = myTable.getSelectedRow();
                if (index < 0) {
                    myInfoText.setText("");
                    return;
                }
                Payment p =  myTableModel.getPayment(index);
                myInfoText.setText(p != null ? p.info : "");
            }
        });

        myTable.setDefaultRenderer(Date.class, new DefaultTableCellRenderer() {
            private static final long serialVersionUID = 1L;

            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                String strValue = SpendingDB.getDateFormat().format(value);
                return super.getTableCellRendererComponent(table, strValue, isSelected, hasFocus, row, column);
            }
        });

        myTable.setDefaultRenderer(Long.TYPE, new DefaultTableCellRenderer() {
            private static final long serialVersionUID = 1L;

            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                Long v = (Long) value;
                if (v != null && v.longValue() > 0) {
                    comp.setForeground(Color.GREEN.darker());
                } else if (v != null && v.longValue() < 0) {
                    comp.setForeground(Color.RED.darker());
                }
                return comp;
            }
        });

        JSplitPane splitter = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        JScrollPane left = new JScrollPane(myTable);
        JScrollPane right = new JScrollPane(myInfoText);
        left.setBorder(new TitledBorder("Expenses Table"));
        right.setBorder(new TitledBorder("Comment"));

        splitter.add(left, JSplitPane.LEFT);
        splitter.add(right, JSplitPane.RIGHT);
        add(splitter, BorderLayout.CENTER);
    }
    
    public void load() {
        // clear.
        myInfoText.setText("");
        myTableModel.load();
    }

}
