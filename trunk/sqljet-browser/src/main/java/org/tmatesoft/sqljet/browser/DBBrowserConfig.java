/**
 * DBBrowserConfig.java
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

import java.awt.Window;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DBBrowserConfig {
    
    public static File getLastDirectory() {
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null) {
                try {
                    preferences.sync();
                } catch (BackingStoreException e) {
                }
                String path = preferences.get("directory", null);
                if (path != null) {
                    return new File(path);
                }
            }
        } catch (SecurityException e) {
            //
        }
        return null;
    }
    
    public static void setLastDirectory(File directory) {
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null && directory != null) {
                preferences.put("directory", directory.getAbsolutePath());
                try {
                    preferences.flush();
                } catch (BackingStoreException e) {
                }
            }
        } catch (SecurityException e) {
            //
        }
    }

    public static void saveWindowSize(String windowName, Window w) {
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null && w != null) {
                preferences.put("window." + windowName + ".x", w.getLocation().x + "");
                preferences.put("window." + windowName + ".y", w.getLocation().y + "");
                preferences.put("window." + windowName + ".width", w.getSize().width + "");
                preferences.put("window." + windowName + ".height", w.getSize().height + "");
                try {
                    preferences.flush();
                } catch (BackingStoreException e) {
                }
            }
        } catch (SecurityException e) {
            //
        }
    }

    public static void loadWindowSize(String windowName, Window window) {
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null && window != null) {
                try {
                    preferences.sync();
                } catch (BackingStoreException e) {
                }
                int x = preferences.getInt("window." + windowName + ".x", -1);
                int y = preferences.getInt("window." + windowName + ".y", -1);
                int w = preferences.getInt("window." + windowName + ".width", -1);
                int h = preferences.getInt("window." + windowName + ".height", -1);
                if (x >= 0 && w > 0) {
                    window.setSize(w, h);
                    window.setLocation(x, y);
                } else {
                    window.pack();
                }
            }
        } catch (SecurityException e) {
            window.pack();
        }
        
    }

    public static void setRecentDBs(List<File> paths) {
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null && paths != null) {
                int i = 0;
                for (File path : paths) {
                    preferences.put("recent." + i, path.getAbsolutePath());
                    i++;
                }
                try {
                    preferences.flush();
                } catch (BackingStoreException e) {
                }
            }
        } catch (SecurityException e) {
        }
    }

    public static List<File> getRecentDBs() {
        LinkedList<File> list = new LinkedList<File>();
        try {
            Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
            if (preferences != null) {
                try {
                    preferences.sync();
                } catch (BackingStoreException e) {
                }
                for (int i = 0; i < 5; i++) {
                    String path = preferences.get("recent." + i, null);
                    if (path == null) {
                        break;
                    }
                    list.add(new File(path));
                }
            }
        } catch (SecurityException e) {
        }
        return list;
    }
}
