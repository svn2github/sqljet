/**
 * SqlJetPagerFlags.java
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
package org.tmatesoft.sqljet.core.internal;

/**
 * Allowed values for the flags parameter to {@link ISqlJetPager#open()}.
 * 
 * NOTE: This values must match the corresponding BTREE_ values in btree.h.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetPagerFlags {

    /** Do not use a rollback journal */
    OMIT_JOURNAL,

    /** Omit readlocks on readonly files */
    NO_READLOCK

}
