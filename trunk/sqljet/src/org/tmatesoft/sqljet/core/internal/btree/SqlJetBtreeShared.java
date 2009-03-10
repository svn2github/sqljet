/**
 * SqlJetBtShared.java
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
package org.tmatesoft.sqljet.core.internal.btree;

import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetMutex;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree.TransMode;
import org.tmatesoft.sqljet.core.internal.mutex.SqlJetMutex;

/**
 * An instance of this object represents a single database file.
 * 
 * A single database file can be in use as the same time by two or more database
 * connections. When two or more connections are sharing the same database file,
 * each connection has it own private Btree object for the file and each of
 * those Btrees points to this one BtShared object. BtShared.nRef is the number
 * of connections currently sharing this database file.
 * 
 * Fields in this structure are accessed under the BtShared.mutex mutex, except
 * for nRef and pNext which are accessed under the global
 * SQLITE_MUTEX_STATIC_MASTER mutex. The pPager field may not be modified once
 * it is initially set as long as nRef>0. The pSchema field may be set once
 * under BtShared.mutex and thereafter is unchanged as long as nRef>0.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeShared {

    /** The page cache */
    ISqlJetPager pPager;

    /** Database connection currently using this Btree */
    ISqlJetDb db;

    /** A list of all open cursors */
    SqlJetBtreeCursor pCursor;

    /** First page of the database */
    SqlJetMemPage pPage1;

    /** True if we are in a statement subtransaction */
    boolean inStmt;

    /** True if the underlying file is readonly */
    boolean readOnly;

    /** True if the page size can no longer be changed */
    boolean pageSizeFixed;

    /** True if auto-vacuum is enabled */
    boolean autoVacuum;

    /** True if incr-vacuum is enabled */
    boolean incrVacuum;

    /** Total number of bytes on a page */
    int pageSize;

    /** Number of usable bytes on each page */
    int usableSize;

    /** Maximum local payload in non-LEAFDATA tables */
    int maxLocal;

    /** Minimum local payload in non-LEAFDATA tables */
    int minLocal;

    /** Maximum local payload in a LEAFDATA table */
    int maxLeaf;

    /** Minimum local payload in a LEAFDATA table */
    int minLeaf;

    /** Transaction state */
    TransMode inTransaction;

    /** Number of open transactions (read + write) */
    int nTransaction;

    /** Pointer to space allocated by sqlite3BtreeSchema() */
    Object pSchema;

    /** Non-recursive mutex required to access this struct */    
    ISqlJetMutex mutex = new SqlJetMutex();
    
    /** Number of references to this structure */
    int nRef;

    /** Next on a list of sharable BtShared structs */
    SqlJetBtreeShared pNext;

    /** List of locks held on this shared-btree struct */
    SqlJetBtreeLock pLock;

    /** Btree with an EXCLUSIVE lock on the whole db */
    SqlJetBtree pExclusive;

    /** BtShared.pageSize bytes of space for tmp use */
    byte[] pTmpSpace;

}
