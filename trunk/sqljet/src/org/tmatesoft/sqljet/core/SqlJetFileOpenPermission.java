/**
 * SqlJetFileOpenPermission.java
 * Copyright (C) 2008 TMate Software Ltd
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

/**
 * Flags For File Open Operations.
 *
 * These values are intended for use in the
 * parameter to the ISqlJet.open() interface and
 * in the parameter to the open() method of the
 * {@link ISqlJetFileSystem} interface.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public enum SqlJetFileOpenPermission {

    READONLY,
    READWRITE,
    CREATE,
    DELETEONCLOSE,
    EXCLUSIVE,
    MAIN_DB,
    TEMP_DB,
    TRANSIENT_DB,
    MAIN_JOURNAL,
    TEMP_JOURNAL,
    SUBJOURNAL,
    MASTER_JOURNAL,
    NOMUTEX,
    FULLMUTEX
    
}
