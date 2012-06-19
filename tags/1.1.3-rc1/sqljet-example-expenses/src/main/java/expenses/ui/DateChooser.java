/**
 * DateChooser.java
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
package expenses.ui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ListDataListener;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DateChooser extends JPanel implements ItemListener {

    private static final long serialVersionUID = 1L;
    private JComboBox myDay;
    private JComboBox myMonth;
    private JComboBox myYear;
    private Collection<ItemListener> myListeners;

    public DateChooser(String name) {
        this(name, new Date(System.currentTimeMillis()));
    }

    public DateChooser(String name, Date date) {
        super(new FlowLayout(FlowLayout.LEFT));
        myListeners = new HashSet<ItemListener>();
        
        myDay = new JComboBox(new RangeModel(1, 31));
        myMonth = new JComboBox(new RangeModel(1, 12));
        myYear = new JComboBox(new RangeModel(2000, 2020));
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        myDay.setSelectedItem(calendar.get(Calendar.DAY_OF_MONTH));
        myMonth.setSelectedItem(calendar.get(Calendar.MONTH) + 1);
        myYear.setSelectedItem(calendar.get(Calendar.YEAR));
        
        myDay.addItemListener(this);
        myMonth.addItemListener(this);
        myYear.addItemListener(this);
        
        add(new JLabel(name));
        add(myDay);        
        add(myMonth);
        add(myYear);
        
        doLayout();
    }
    
    public void setEnabled(boolean enabled) {
        myDay.setEnabled(enabled);
        myMonth.setEnabled(enabled);
        myYear.setEnabled(enabled);
    }
    
    public Date getDate() {
        if (!myDay.isEnabled()) {
            return null;
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.DAY_OF_MONTH, (Integer) myDay.getSelectedItem());
        calendar.set(Calendar.MONTH, (Integer) myMonth.getSelectedItem() - 1);
        calendar.set(Calendar.YEAR, (Integer) myYear.getSelectedItem());
        return calendar.getTime();
    }
    
    private static class RangeModel implements ComboBoxModel {
        
        private int myMin;
        private int myMax;
        private Object mySelection;

        public RangeModel(int min, int max) {
            myMin = Math.min(min, max);
            myMax = Math.max(min, max);
            mySelection = myMin;
        }
        public Object getSelectedItem() {
            return mySelection;
        }
        public void setSelectedItem(Object anItem) {
            mySelection = anItem;
        }
        public int getSize() {
            return myMax - myMin + 1;
        }
        public Object getElementAt(int index) {
            return myMin + index;
        }
        public void addListDataListener(ListDataListener l) {
        }
        public void removeListDataListener(ListDataListener l) {
        }
    }
    
    public void addItemListener(ItemListener l) {
        myListeners.add(l);
    }

    public void itemStateChanged(ItemEvent e) {
        for (ItemListener listener : myListeners) {
            listener.itemStateChanged(e);
        }
    }
}
