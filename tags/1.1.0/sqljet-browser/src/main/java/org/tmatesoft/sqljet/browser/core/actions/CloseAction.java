/**
 * CloseAction.java
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
package org.tmatesoft.sqljet.browser.core.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class CloseAction extends AbstractAction implements ChangeListener {
    
    private static final long serialVersionUID = 1L;
    
    private BrowserComponentManager myManager;

    public CloseAction(BrowserComponentManager manager) {
        super("Close Database");
        myManager = manager;
        myManager.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        myManager.open(null);
    }

    public void stateChanged(ChangeEvent e) {
        setEnabled(myManager.getDBFile() != null);
    }

}
