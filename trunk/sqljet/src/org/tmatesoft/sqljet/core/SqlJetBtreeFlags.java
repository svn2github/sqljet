/**
 * SqlJetBtreeFlags.java
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

/**
 * The flags parameter to sqlite3BtreeOpen can be the bitwise or of the
 * following values.
 * 
 * NOTE: These values must match the corresponding PAGER_ values in pager.h.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetBtreeFlags {

    /** Do not use journal. No argument */
    OMIT_JOURNAL(SqlJetPagerFlags.OMIT_JOURNAL),

    /** Omit readlocks on readonly files */
    NO_READLOCK(SqlJetPagerFlags.NO_READLOCK),

    /** In-memory DB. No argument */
    MEMORY,

    /** Open the database in read-only mode */
    READONLY,

    /** Open for both reading and writing */
    READWRITE,

    /** Create the database if it does not exist */
    CREATE;

    private SqlJetPagerFlags pagerFlag;

    /**
     * 
     */
    private SqlJetBtreeFlags() {
    }
    
    /**
     * 
     */
    private SqlJetBtreeFlags(SqlJetPagerFlags pagerFlag) {
        this.pagerFlag = pagerFlag;
    }
    
    /**
     * @return the pagerFlag
     */
    public SqlJetPagerFlags getPagerFlag() {
        return pagerFlag;
    }
    
    public static EnumSet<SqlJetPagerFlags> toPagerFlags(final EnumSet<SqlJetBtreeFlags> btreeFlags){
        if(null==btreeFlags) return null;
        final EnumSet<SqlJetPagerFlags> enumSet = EnumSet.noneOf(SqlJetPagerFlags.class);
        for(SqlJetBtreeFlags flag:btreeFlags) {
            final SqlJetPagerFlags f = flag.getPagerFlag();
            if(null!=f) enumSet.add(f);
        }
        return enumSet;
    }
    
}
