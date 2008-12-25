/**
 * SqlJetPagerJournalMode.java
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
 * Valid values for the second argument to {@link ISqlJetPager#setJournalMode()}
 * .
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetPagerJournalMode {

    /** Commit by deleting journal file */
    DELETE,

    /** Commit by zeroing journal header */
    PERSIST,

    /** Journal omitted. */
    OFF

}
