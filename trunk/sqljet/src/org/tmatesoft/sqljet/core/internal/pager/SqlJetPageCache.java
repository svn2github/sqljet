/**
 * PCache.java
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
package org.tmatesoft.sqljet.core.internal.pager;

import java.util.List;
import java.util.Map;

import org.tmatesoft.sqljet.core.ISqlJetPageDestructor;

/**
 * A complete page cache is an instance of this structure.
 * 
 * A cache may only be deleted by its owner and while holding the
 * SQLITE_MUTEX_STATUS_LRU mutex.
 * 
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetPageCache {

    /*********************************************************************
     ** The first group of elements may be read or written at any time by the
     * cache owner without holding the mutex. No thread other than the cache
     * owner is permitted to access these elements at any time.
     */
    SqlJetPage pDirty, pDirtyTail; /* List of dirty pages in LRU order */
    SqlJetPage pSynced; /* Last synced page in dirty page list */
    int nRef; /* Number of pinned pages */
    int nPinned; /* Number of pinned and/or dirty pages */
    int nMax; /* Configured cache size */
    int nMin; /* Configured minimum cache size */
    /**********************************************************************
     ** The next group of elements are fixed when the cache is created and may
     * not be changed afterwards. These elements can read at any time by the
     * cache owner or by any thread holding the the mutex. Non-owner threads
     * must hold the mutex when reading these elements to prevent the entire
     * PCache object from being deleted during the read.
     */
    int szPage; /* Size of every page in this cache */
    int szExtra; /* Size of extra space for each page */
    boolean bPurgeable; /* True if pages are on backing store */
    ISqlJetPageDestructor xDestroy; /* Called when refcnt goes 1->0 */
    // int (*xStress)(void*,PgHdr*); /* Call to try make a page clean */
    // void *pStress; /* Argument to xStress */
    ISqlJetPageDestructor xStress;
    /**********************************************************************
     ** The final group of elements can only be accessed while holding the mutex.
     * Both the cache owner and any other thread must hold the mutex to read or
     * write any of these elements.
     */
    int nPage; /* Total number of pages in apHash */
    int nHash; /* Number of slots in apHash[] */
    Map<Integer, SqlJetPage> apHash; /* Hash table for fast lookup by pgno */
    List<SqlJetPage> pClean; /* List of clean pages in use */

    static class PCacheGlobal {
        boolean isInit; /* True when initialized */
        // sqlite3_mutex *mutex; /* static mutex MUTEX_STATIC_LRU */

        int nMaxPage; /* Sum of nMaxPage for purgeable caches */
        int nMinPage; /* Sum of nMinPage for purgeable caches */
        int nCurrentPage; /* Number of purgeable pages allocated */
        SqlJetPage pLruHead, pLruTail; /* LRU list of unused clean pgs */

        /* Variables related to SQLITE_CONFIG_PAGECACHE settings. */
        int szSlot; /* Size of each free slot */
        // void *pStart, *pEnd; /* Bounds of pagecache malloc range */
        // PgFreeslot *pFree; /* Free page blocks */
    }

    static PCacheGlobal pcache_g = new PCacheGlobal();

    public SqlJetPageCache(int szPage, /* Size of every page */
    int szExtra, /* Extra space associated with each page */
    boolean bPurgeable, /* True if pages are on backing store */
    ISqlJetPageDestructor xDestroy, /* Called to destroy a page */
    // int (*xStress)(void*,PgHdr*),/* Call to try to make pages clean */
            // void *pStress, /* Argument to xStress */
            ISqlJetPageDestructor xStress) {
        assert (pcache_g.isInit);
        this.szPage = szPage;
        this.szExtra = szExtra;
        this.bPurgeable = bPurgeable;
        this.xDestroy = xDestroy;
        this.xStress = xStress;
        this.nMax = 100;
        this.nMin = 10;

        synchronized (pcache_g) {
            if (bPurgeable) {
                pcache_g.nMaxPage += this.nMax;
                pcache_g.nMinPage += this.nMin;
            }

        }
    }

}
