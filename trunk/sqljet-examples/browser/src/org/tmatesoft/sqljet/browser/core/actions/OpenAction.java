/**
 * OpenAction.java
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
package org.tmatesoft.sqljet.browser.core.actions;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

import org.tmatesoft.sqljet.browser.DBBrowserConfig;
import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class OpenAction extends AbstractAction {
    
    private static final long serialVersionUID = 1L;
    
    private BrowserComponentManager myManager;

    public OpenAction(BrowserComponentManager manager) {
        super("Open...");
        myManager = manager;
    }

    public void actionPerformed(ActionEvent e) {
        
        JFileChooser chooser = new JFileChooser();
        File directory = DBBrowserConfig.getLastDirectory();
        if (directory != null) {
            chooser.setCurrentDirectory(directory);            
        }
        chooser.setFileHidingEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setMultiSelectionEnabled(false);
        
        int result = chooser.showOpenDialog(myManager.getOwner());
        if (chooser.getCurrentDirectory() != null) {
            DBBrowserConfig.setLastDirectory(chooser.getCurrentDirectory());
        }
        if (result != JFileChooser.APPROVE_OPTION || chooser.getSelectedFile() == null) {
            return;
        }

        File dbFile = chooser.getSelectedFile();
        myManager.open(null);
        myManager.open(dbFile);
    }
}
