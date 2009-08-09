/**
 * DBBrowserConfig.java
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
package org.tmatesoft.sqljet.browser;

import java.io.File;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DBBrowserConfig {
    
    public static File getLastDirectory() {
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
        return null;
    }
    
    public static void setLastDirectory(File directory) {
        Preferences preferences = Preferences.userNodeForPackage(DBBrowserConfig.class);
        if (preferences != null && directory != null) {
            preferences.put("directory", directory.getAbsolutePath());
            try {
                preferences.flush();
            } catch (BackingStoreException e) {
            }
        }
    }

}
