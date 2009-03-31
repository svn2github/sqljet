/**
 * SqlJetConfig.java
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
 */
package org.tmatesoft.sqljet.core.internal.db;

import org.tmatesoft.sqljet.core.ISqlJetConfig;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetConfig implements ISqlJetConfig {

    private boolean sharedCacheEnabled = true;

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetConfig#isSharedCacheEnabled()
     */
    public boolean isSharedCacheEnabled() {
        // TODO Auto-generated method stub
        return sharedCacheEnabled;
    }

}
