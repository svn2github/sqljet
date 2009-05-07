/**
 * SqlJetMemType.java
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
package org.tmatesoft.sqljet.core.internal;

/**
 * Fundamental Datatypes
 * 
 * Every value in SQLite has one of five fundamental datatypes:
 * 
 * <ul>
 * <li>64-bit signed integer
 * <li>64-bit IEEE floating point number
 * <li>string
 * <li>BLOB
 * <li>NULL
 * </ul>
 * {END}
 * 
 * These constants are codes for each of those types.
 * 
 * Note that the SQLITE_TEXT constant was also used in SQLite version 2 for a
 * completely different meaning. Software that links against both SQLite version
 * 2 and SQLite version 3 should use SQLITE3_TEXT, not SQLITE_TEXT.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetMemType {

    INTEGER,    // 1
    FLOAT,      // 2
    TEXT,       // 3
    BLOB,       // 4
    NULL        // 5

}
