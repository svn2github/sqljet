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

import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.ISqlJetPageCache;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetPageFlags;

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
public class SqlJetPageCache implements ISqlJetPageCache {

    /*
     * The first group of elements may be read or written at any time by the
     * cache owner without holding the mutex. No thread other than the cache
     * owner is permitted to access these elements at any time.
     */
    /** List of dirty pages in LRU order */
    SqlJetPage pDirty, pDirtyTail;
    /** Last synced page in dirty page list */
    SqlJetPage pSynced;
    /** Number of pinned pages */
    int nRef;
    /** Number of pinned and/or dirty pages */
    int nPinned;
    /** Configured cache size */
    int nMax;
    /** Configured minimum cache size */
    int nMin;
    /*
     * The next group of elements are fixed when the cache is created and may
     * not be changed afterwards. These elements can read at any time by the
     * cache owner or by any thread holding the the mutex. Non-owner threads
     * must hold the mutex when reading these elements to prevent the entire
     * PCache object from being deleted during the read.
     */
    /** Size of every page in this cache */
    int szPage;
    /** Size of extra space for each page */
    int szExtra;
    /** True if pages are on backing store */
    boolean bPurgeable;
    /** Called when refcnt goes 1->0 */
    ISqlJetPageCallback xDestroy;
    /** Call to try make a page clean */
    ISqlJetPageCallback xStress;
    /*
     * The final group of elements can only be accessed while holding the mutex.
     * Both the cache owner and any other thread must hold the mutex to read or
     * write any of these elements.
     */
    /** Total number of pages in apHash */
    int nPage;
    /** Number of slots in apHash[] */
    int nHash;
    /** Hash table for fast lookup by pgno */
    Map<Integer, SqlJetPage> apHash;
    /** List of clean pages in use */
    List<SqlJetPage> pClean;

    static class PCacheGlobal {
        /** True when initialized */
        boolean isInit;
        // sqlite3_mutex *mutex; /* static mutex MUTEX_STATIC_LRU */

        /** Sum of nMaxPage for purgeable caches */
        int nMaxPage;
        /** Sum of nMinPage for purgeable caches */
        int nMinPage;
        /** Number of purgeable pages allocated */
        int nCurrentPage;
        /** LRU list of unused clean pgs */
        SqlJetPage pLruHead, pLruTail;

        /* Variables related to SQLITE_CONFIG_PAGECACHE settings. */
        /** Size of each free slot */
        int szSlot;
        // void *pStart, *pEnd; /* Bounds of pagecache malloc range */
        // PgFreeslot *pFree; /* Free page blocks */
    }

    static PCacheGlobal pcache_g = new PCacheGlobal();

    SqlJetPageCache() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#open(int, int, boolean,
     * org.tmatesoft.sqljet.core.ISqlJetPageCallback,
     * org.tmatesoft.sqljet.core.ISqlJetPageCallback)
     */
    public void open(final int szPage, final int szExtra, final boolean purgeable, final ISqlJetPageCallback destroy,
            final ISqlJetPageCallback stress) {
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

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#bufferSetup(byte[], int,
     * int)
     */
    public void bufferSetup(byte[] buffer, int sz, int n) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#cleanAll()
     */
    public void cleanAll() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#clear()
     */
    public void clear() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#clearFlags(java.util.EnumSet)
     */
    public void clearFlags(EnumSet<SqlJetPageFlags> flags) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#close()
     */
    public void close() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#commit(boolean)
     */
    public void commit(boolean isStatementJournal) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#drop(org.tmatesoft.sqljet.
     * core.ISqlJetPage)
     */
    public void drop(ISqlJetPage page) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#fetch(int, boolean)
     */
    public ISqlJetPage fetch(int pageNumber, boolean createFlag) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#free(byte[])
     */
    public void free(byte[] p) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getCachesize()
     */
    public int getCachesize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getDirtyList()
     */
    public List<ISqlJetPage> getDirtyList() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getPageCount()
     */
    public int getPageCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getRefCount()
     */
    public int getRefCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#initialize()
     */
    public int initialize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#isZeroOrOneDirtyPages()
     */
    public boolean isZeroOrOneDirtyPages() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#iterate(org.tmatesoft.sqljet
     * .core.ISqlJetPageCallback)
     */
    public void iterate(ISqlJetPageCallback iter) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#makeClean(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void makeClean(ISqlJetPage page) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#makeDirty(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void makeDirty(ISqlJetPage page) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#malloc(int)
     */
    public byte[] malloc(int sz) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#move(org.tmatesoft.sqljet.
     * core.ISqlJetPage, int)
     */
    public void move(ISqlJetPage page, int pageNumber) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#preserve(org.tmatesoft.sqljet
     * .core.ISqlJetPage, boolean)
     */
    public void preserve(ISqlJetPage page, boolean isStatementJournal) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#release(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void release(ISqlJetPage page) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#rollback(boolean,
     * org.tmatesoft.sqljet.core.ISqlJetPageCallback)
     */
    public void rollback(boolean isStatementJournal, ISqlJetPageCallback reiniter) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#setCachesize(int)
     */
    public void setCachesize(int cacheSize) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#setPageSize(int)
     */
    public void setPageSize(int pageSize) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#shutdown()
     */
    public void shutdown() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#truncate(int)
     */
    public void truncate(int pageNumber) {
        // TODO Auto-generated method stub

    }

}
