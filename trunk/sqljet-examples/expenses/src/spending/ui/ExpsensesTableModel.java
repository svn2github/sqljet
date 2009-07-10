/**
 * ExpsensesTableModel.java
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

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

import spending.core.Payment;
import spending.core.SpendingDB;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class ExpsensesTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    private static final String[] COLUMN_NAMES = {"Date", "Amount", "Currency"};
    
    private List<Payment> myPayments = new LinkedList<Payment>();
    
    public void load() {
        if (getRowCount() > 0) {
            myPayments.clear();
            fireTableRowsDeleted(0, getRowCount() - 1);
        }
        try {
            SpendingDB.open();
            ISqlJetCursor cursor = SpendingDB.getAllPayments();
            while(!cursor.eof()) {
                Payment p = Payment.read(cursor);
                if (p != null) {
                    myPayments.add(p);
                }
                cursor.next();
            }
        } catch (SqlJetException e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                SpendingDB.close();
            } catch (SqlJetException e) {
                e.printStackTrace();
            }
        }
        if (getRowCount() > 0) {
            fireTableRowsInserted(0, getRowCount() - 1);
        }
    }

    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public int getRowCount() {
        return myPayments.size();
    }

    public Payment getPayment(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < getRowCount()) {
            return myPayments.get(rowIndex);
        }
        return null;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Payment payment = getPayment(rowIndex);
        if (payment != null) {
            if (columnIndex == 0) {
                Date d = payment.date;
                String date = SpendingDB.getDateFormat().format(d);
                return date;
            } else if (columnIndex == 1) {
                return payment.amount;
            } else if (columnIndex == 2) {
                return payment.currency;
            }
        }
        return null;
    }
}
