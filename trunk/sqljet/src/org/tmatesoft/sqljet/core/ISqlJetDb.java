/**
 * ISqlJet.java
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
package org.tmatesoft.sqljet.core;

import java.util.EnumSet;
import java.util.List;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetDb {

    /**
     * Get config
     * 
     * @return
     */
    ISqlJetConfig getConfig();
    
    /**
     * Set config
     * 
     * @param config
     */
    void setConfig(ISqlJetConfig config);
    
    /**
     * @return
     */
    ISqlJetFileSystem getFileSystem();
    
    /**
     * @return
     */
    EnumSet<SqlJetDbFlags> getFlags();
    
    List<ISqlJetBackend> getBackends();
    
    ISqlJetMutex getMutex();

    /**
     * @return
     */
    ISqlJetBusyHandler getBusyHaldler();

    /**
     * @return
     */
    int getSavepointNum();
    
}
