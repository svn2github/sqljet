/**
 * SqlJetAffinity.java
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
package org.tmatesoft.sqljet.core.internal.vdbe;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetAffinity {

    /**
     * @see SqlJetAffinity#AFF_NUMERIC
     */
    AFF_INTEGER,

    /**
     * @see SqlJetAffinity#AFF_NUMERIC
     */
    AFF_REAL,

    /**
     * Try to convert value to an integer representation or a floating-point
     * representation if an integer representation is not possible. Note that
     * the integer representation is always preferred, even if the affinity is
     * REAL, because an integer representation is more space efficient on disk.
     */
    AFF_NUMERIC,

    /**
     * Convert value to a text representation.
     */
    AFF_TEXT,

    /**
     * No-op. Value is unchanged.
     */
    AFF_NONE

}
