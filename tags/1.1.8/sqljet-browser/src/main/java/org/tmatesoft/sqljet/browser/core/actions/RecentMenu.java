/**
 * RecentMenu.java
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
package org.tmatesoft.sqljet.browser.core.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import org.tmatesoft.sqljet.browser.DBBrowserConfig;
import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class RecentMenu implements MenuListener, ChangeListener {
    
    private JMenu myMenu;
    private BrowserComponentManager myManager;

    public RecentMenu(BrowserComponentManager manager, JMenu owner) {
        myMenu = owner;
        myManager = manager;
        myManager.addChangeListener(this);
    }

    public void menuCanceled(MenuEvent e) {
        myMenu.removeAll();
    }

    public void menuDeselected(MenuEvent e) {
        myMenu.removeAll();
    }

    public void menuSelected(MenuEvent e) {
        List<File> recent = DBBrowserConfig.getRecentDBs();
        if (recent.isEmpty()) {
            JMenuItem item = myMenu.add("<empty>");
            item.setEnabled(false);
        } else {
            int index = 1;
            for (final File file : recent) {
                JMenuItem item = myMenu.add(index + " " + file.getPath());
                char indexChar = (index + "").charAt(0);
                item.setMnemonic(indexChar);
                index++;
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       myManager.open(file);
                    }
                });
            }
        }
    }

    public void stateChanged(ChangeEvent e) {
        File openDB = myManager.getDBFile();
        if (openDB == null) {
            return;
        }
        List<File> recent = DBBrowserConfig.getRecentDBs();
        int count = recent.size();
        for (Iterator<File> files = recent.iterator(); files.hasNext();) {
            File file = (File) files.next();
            if (file.equals(openDB)) {
                files.remove();
                break;
            }
        }
        if (count == recent.size() && recent.size() > 0 && recent.size() > 5) {
            recent.remove(recent.size() - 1);
        }
        recent.add(0, openDB);
        DBBrowserConfig.setRecentDBs(recent);
    }

}
