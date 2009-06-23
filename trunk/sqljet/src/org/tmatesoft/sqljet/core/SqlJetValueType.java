/**
 * SqlJetValueType.java
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
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core;

/**
 * Fundamental Datatypes
 * 
 * Every value in SQLJet has one of five fundamental datatypes:
 * 
 * <ul>
 * <li>64-bit signed integer
 * <li>64-bit IEEE floating point number
 * <li>string
 * <li>BLOB
 * <li>NULL
 * </ul>
 * 
 * These constants are codes for each of those types.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetValueType {

    INTEGER,    // 1
    FLOAT,      // 2
    TEXT,       // 3
    BLOB,       // 4
    NULL        // 5

}
