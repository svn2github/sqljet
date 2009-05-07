/**
 * SqlJetUpackedRecordFlags.java
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
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public enum SqlJetUpackedRecordFlags {

    /** Memory is from sqlite3Malloc() */
    NEED_FREE,  //     0x0001  
    
    /** apMem[]s should all be destroyed */    
    NEED_DESTROY,   //  0x0002  
    
    /** Ignore trailing rowid on key1 */    
    IGNORE_ROWID,   //  0x0004  
    
    /** Make this key an epsilon larger */
    INCRKEY,    //       0x0008  
    
    /** A prefix match is considered OK */
    PREFIX_MATCH    //  0x0010  
    
}
