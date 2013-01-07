/**
 * DBBrowser.java
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
package org.tmatesoft.sqljet.browser;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import org.tmatesoft.sqljet.browser.core.BrowserComponentManager;
import org.tmatesoft.sqljet.browser.core.actions.AboutAction;
import org.tmatesoft.sqljet.browser.core.actions.CloseAction;
import org.tmatesoft.sqljet.browser.core.actions.ExitAction;
import org.tmatesoft.sqljet.browser.core.actions.OpenAction;
import org.tmatesoft.sqljet.browser.core.actions.RecentMenu;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class DBBrowser {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        DBBrowserConfig.saveWindowSize("main", e.getWindow());
                        
                        e.getWindow().setVisible(false);
                        e.getWindow().dispose();
                        System.exit(0);
                    }
                });
                frame.getContentPane().setLayout(new BorderLayout());

                BrowserComponentManager manager = BrowserComponentManager.create(frame);
                frame.setContentPane(manager.getComponent());
                
                JMenuBar mainMenu = createMainMenu(manager);
                frame.setJMenuBar(mainMenu);

                manager.open(null);

                DBBrowserConfig.loadWindowSize("main", frame);
                frame.setVisible(true);
            }
        });
    }

    private static JMenuBar createMainMenu(BrowserComponentManager manager) {
        JMenuBar mainMenu = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        JMenuItem openItem = fileMenu.add(new OpenAction(manager));
        openItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        openItem.setMnemonic('O');
        JMenu recentMenu = new JMenu("Open Recent");
        recentMenu.addMenuListener(new RecentMenu(manager, recentMenu));
        JMenuItem recentItem = fileMenu.add(recentMenu);        
        recentItem.setMnemonic('R');
        
        JMenuItem closeItem = fileMenu.add(new CloseAction(manager));
        closeItem.setMnemonic('C');
        fileMenu.add(new JSeparator());
        JMenuItem exitItem = fileMenu.add(new ExitAction(manager));
        exitItem.setAccelerator(KeyStroke.getKeyStroke("alt X"));
        exitItem.setMnemonic('x');
        
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');
        JMenuItem aboutItem = helpMenu.add(new AboutAction(manager));
        aboutItem.setMnemonic('A');
        
        mainMenu.add(fileMenu);
        mainMenu.add(helpMenu);
        return mainMenu;
    }

}
