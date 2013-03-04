/**
 * AboutAction.java
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

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class AboutAction extends AbstractAction {
    
    private static final long serialVersionUID = 1L;
    private BrowserComponentManager myManager;
    
    public AboutAction(BrowserComponentManager manager) {
        super("About SQLJet");
        myManager = manager;
    }

    public void actionPerformed(ActionEvent e) {
        String message = "<html><body><p>SQLJet is a pure Java implementation of SQLite DBMS."
            + "<br>&copy; 2009-2013, TMate Software, <a href=\"http://sqljet.com/\">http://sqljet.com/</a></p></body></html>";
        
        JOptionPane.showMessageDialog(myManager.getOwner(), message, "About SQLJet", JOptionPane.PLAIN_MESSAGE, null);
    }
}
