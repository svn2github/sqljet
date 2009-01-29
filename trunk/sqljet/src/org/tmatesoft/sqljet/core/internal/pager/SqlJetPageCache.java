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

import static org.tmatesoft.sqljet.core.SqlJetException.assertion;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCache;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetPageFlags;
import org.tmatesoft.sqljet.core.SqlJetUtility;

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

    private static final int N_SORT_BUCKET_ALLOC = 25;
    private static final int N_SORT_BUCKET = 25;
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
    Map<Integer, SqlJetPage> apHash = new HashMap<Integer, SqlJetPage>();
    /** List of clean pages in use */
    SqlJetPage pClean;

    static class PCacheGlobal {
        /** True when initialized */
        boolean isInit;

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
    }

    static PCacheGlobal pcache_g = new PCacheGlobal();

    SqlJetPageCache() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#initialize()
     */
    public void initialize() throws SqlJetException {
        assertion(!pcache_g.isInit);
        pcache_g.isInit = true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#shutdown()
     */
    public void shutdown() {
        pcache_g = new PCacheGlobal();
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
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#malloc(int)
     */
    public byte[] malloc(int sz) {
        return new byte[sz];
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#free(byte[])
     */
    public void free(byte[] p) {
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
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#setPageSize(int)
     */
    public void setPageSize(int pageSize) throws SqlJetException {
        assertion(nPage == 0);
        this.szPage = szPage;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#fetch(int, boolean)
     */
    public ISqlJetPage fetch(int pageNumber, boolean createFlag) throws SqlJetException {

        assertion(pageNumber > 0);

        SqlJetPage pPage = null;

        // pcacheEnterMutex();
        synchronized (pcache_g) {

            /*
             * Search the hash table for the requested page. Exit early if it is
             * found.
             */
            if (apHash != null) {
                pPage = apHash.get(pageNumber);
                if (pPage != null && pPage.getPageNumber() == pageNumber) {
                    if (pPage.nRef == 0) {
                        if (!(pPage.flags.contains(SqlJetPageFlags.DIRTY))) {
                            removeFromLruList(pPage);
                            nPinned++;
                        }
                        nRef++;
                    }
                    pPage.nRef++;
                }
            }

            if (pPage == null && createFlag) {
                pPage = new SqlJetPage(szPage,szExtra);
                pPage.pPager = null;
                pPage.pDirty = null;
                pPage.pgno = pageNumber;
                pPage.pCache = this;
                pPage.nRef = 1;
                nRef++;
                nPinned++;
                pClean=addToList(pClean, pPage);
                addToHash(pPage);
            }

        }
        // pcacheExitMutex();

        return pPage;

    }

    /**
     * Insert a page into the hash table
     * 
     * The mutex must be held by the caller.
     * 
     * @param page
     */
    private void addToHash(SqlJetPage page) {
        apHash.put(page.pgno, page);
        nPage++;
    }

    /**
     * Add a page from a linked list that is headed by *ppHead. *ppHead is
     * either PCache.pClean or PCache.pDirty.
     * 
     * @param clean
     * @param page
     * @throws SqlJetException
     */
    private SqlJetPage addToList(SqlJetPage ppHead, SqlJetPage pPage) throws SqlJetException {
        boolean isDirtyList = (ppHead == pPage.pCache.pDirty);
        assertion(ppHead == pPage.pCache.pClean || ppHead == pPage.pCache.pDirty);

        if (ppHead != null) {
            ppHead.pPrev = pPage;
        }
        pPage.pNext = ppHead;
        pPage.pPrev = null;
        ppHead = pPage;

        if (isDirtyList) {
            SqlJetPageCache pCache = pPage.pCache;
            if (pCache.pDirtyTail == null) {
                assertion(pPage.pNext == null);
                pCache.pDirtyTail = pPage;
            }
            if (pCache.pSynced == null && !pPage.flags.contains(SqlJetPageFlags.NEED_SYNC)) {
                pCache.pSynced = pPage;
            }
        }
        return ppHead;
    }

    /**
     * Remove a page from the global LRU list
     * 
     * @param page
     */
    private void removeFromLruList(SqlJetPage pPage) throws SqlJetException {
        // assertion( sqlite3_mutex_held(pcache_g.mutex) );
        assertion(!(pPage.flags.contains(SqlJetPageFlags.DIRTY)));
        if (!pPage.pCache.bPurgeable)
            return;
        if (pPage.pNextLru != null) {
            assertion(pcache_g.pLruTail != pPage);
            pPage.pNextLru.pPrevLru = pPage.pPrevLru;
        } else {
            assertion(pcache_g.pLruTail == pPage);
            pcache_g.pLruTail = pPage.pPrevLru;
        }
        if (pPage.pPrevLru != null) {
            assertion(pcache_g.pLruHead != pPage);
            pPage.pPrevLru.pNextLru = pPage.pNextLru;
        } else {
            assertion(pcache_g.pLruHead == pPage);
            pcache_g.pLruHead = pPage.pNextLru;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#cleanAll()
     */
    public void cleanAll() throws SqlJetException {
        SqlJetPage p;
        // pcacheEnterMutex();
        synchronized (pcache_g) {
            while ((p = pDirty) != null) {
                assertion(p.apSave[0] == null && p.apSave[1] == null);
                pDirty=removeFromList(pDirty, p);
                p.flags.remove(SqlJetPageFlags.DIRTY);
                pClean=addToList(pClean, p);
                if (p.nRef == 0) {
                    addToLruList(p);
                    nPinned--;
                }
            }

        }
        // pcacheExitMutex();
    }

    /**
     * Add a page to the global LRU list. The page is normally added to the
     * front of the list so that it will be the last page recycled. However, if
     * the PGHDR_REUSE_UNLIKELY bit is set, the page is added to the end of the
     * LRU list so that it will be the next to be recycled.
     * 
     * @param p
     * @throws SqlJetException
     */
    private void addToLruList(SqlJetPage pPage) throws SqlJetException {
        // assertion( sqlite3_mutex_held(pcache_g.mutex) );
        assertion(!pPage.flags.contains(SqlJetPageFlags.DIRTY));
        if (!pPage.pCache.bPurgeable)
            return;
        if (pcache_g.pLruTail != null && pPage.flags.contains(SqlJetPageFlags.REUSE_UNLIKELY)) {
            /*
             * If reuse is unlikely. Put the page at the end of the LRU list
             * where it will be recycled sooner rather than later.
             */
            assertion(pcache_g.pLruHead != null);
            pPage.pNextLru = null;
            pPage.pPrevLru = pcache_g.pLruTail;
            pcache_g.pLruTail.pNextLru = pPage;
            pcache_g.pLruTail = pPage;
            pPage.flags.remove(SqlJetPageFlags.REUSE_UNLIKELY);
        } else {
            /*
             * If reuse is possible. the page goes at the beginning of the LRU
             * list so that it will be the last to be recycled.
             */
            if (pcache_g.pLruHead != null) {
                pcache_g.pLruHead.pPrevLru = pPage;
            }
            pPage.pNextLru = pcache_g.pLruHead;
            pcache_g.pLruHead = pPage;
            pPage.pPrevLru = null;
            if (pcache_g.pLruTail == null) {
                pcache_g.pLruTail = pPage;
            }
        }
    }

    /**
     * Remove a page from a linked list that is headed by ppHead. ppHead is
     * either PCache.pClean or PCache.pDirty.
     * 
     * @param dirty
     * @param p
     * @throws SqlJetException
     */
    private SqlJetPage removeFromList(SqlJetPage ppHead, SqlJetPage pPage) throws SqlJetException {
        boolean isDirtyList = (ppHead == pPage.pCache.pDirty);
        assertion(ppHead == pPage.pCache.pClean || ppHead == pPage.pCache.pDirty);

        if (pPage.pPrev != null) {
            pPage.pPrev.pNext = pPage.pNext;
        } else {
            assertion(ppHead == pPage);
            ppHead = pPage.pNext;
        }
        if (pPage.pNext != null) {
            pPage.pNext.pPrev = pPage.pPrev;
        }

        if (isDirtyList) {
            SqlJetPageCache pCache = pPage.pCache;
            assertion(pPage.pNext != null || pCache.pDirtyTail == pPage);
            if (pPage.pNext == null) {
                pCache.pDirtyTail = pPage.pPrev;
            }
            if (pCache.pSynced == pPage) {
                SqlJetPage pSynced = pPage.pPrev;
                while (pSynced != null && (pSynced.flags.contains(SqlJetPageFlags.NEED_SYNC))) {
                    pSynced = pSynced.pPrev;
                }
                pCache.pSynced = pSynced;
            }
        }
        return ppHead;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#clear()
     */
    public void clear() throws SqlJetException {
        assertion(nRef == 0);
        // pcacheEnterMutex();
        synchronized (pcache_g) {
            SqlJetPage p, pNext;
            // assert( sqlite3_mutex_held(pcache_g.mutex) );
            for (p = pClean; p != null; p = pNext) {
                pNext = p.pNext;
                removeFromLruList(p);
                pageFree(p);
                if(p.pNext==p) break;
            }
            for (p = pDirty; p != null; p = pNext) {
                pNext = p.pNext;
                pageFree(p);
                if(p.pNext==p) break;
            }
            pClean = null;
            pDirty = null;
            pDirtyTail = null;
            nPage = 0;
            nPinned = 0;
            apHash.clear();
        }
        // pcacheExitMutex();
    }

    /**
     * Deallocate a page
     * 
     * @param p
     */
    private void pageFree(SqlJetPage p) {
        // assert( sqlite3_mutex_held(pcache_g.mutex) );
        if (p.pCache.bPurgeable) {
            pcache_g.nCurrentPage--;
        }
        p.apSave[0] = null;
        p.apSave[1] = null;
        // pcacheFree(p);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#clearFlags(java.util.EnumSet)
     */
    public void clearFlags(EnumSet<SqlJetPageFlags> flags) throws SqlJetException {
        SqlJetPage p;

        /*
         * Obtain the global mutex before modifying any PgHdr.flags variables or
         * traversing the LRU list.
         */
        synchronized (pcache_g) {

            for (p = pDirty; p != null; p = p.pNext) {
                p.flags.removeAll(flags);
                if(p==p.pNext) break;
            }
            for (p = pClean; p != null; p = p.pNext) {
                p.flags.removeAll(flags);
                if(p==p.pNext) break;
            }

            if (!flags.contains(SqlJetPageFlags.NEED_SYNC)) {
                pSynced = pDirtyTail;
                assertion(pSynced == null || !pSynced.flags.contains(SqlJetPageFlags.NEED_SYNC));
            }

        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#close()
     */
    public void close() throws SqlJetException {

        synchronized (pcache_g) {
            /*
             * Free all the pages used by this pager and remove them from the
             * LRU list.
             */
            clear();
            if (bPurgeable) {
                pcache_g.nMaxPage -= nMax;
                pcache_g.nMinPage -= nMin;
                enforceMaxPage();
            }
            apHash = null;
        }
    }

    /**
     * If there are currently more than pcache.nMaxPage pages allocated, try to
     * recycle pages to reduce the number allocated to pcache.nMaxPage.
     * 
     * @throws SqlJetException
     * 
     */
    private void enforceMaxPage() throws SqlJetException {
        SqlJetPage p = null;
        // assert( sqlite3_mutex_held(pcache_g.mutex) );
        while (pcache_g.nCurrentPage > pcache_g.nMaxPage && (p = recyclePage()) != null) {
            pageFree(p);
        }
    }

    /**
     * Attempt to 'recycle' a page from the global LRU list. Only clean,
     * unreferenced pages from purgeable caches are eligible for recycling.
     * 
     * This function removes page pcache.pLruTail from the global LRU list, and
     * from the hash-table and PCache.pClean list of the owner pcache. There
     * should be no other references to the page.
     * 
     * A pointer to the recycled page is returned, or NULL if no page is
     * eligible for recycling.
     * 
     * @return
     * @throws SqlJetException
     */
    private SqlJetPage recyclePage() throws SqlJetException {
        SqlJetPage p = null;
        // assert( sqlite3_mutex_held(pcache_g.mutex) );

        if ((p = pcache_g.pLruTail) != null) {
            assertion(!p.flags.contains(SqlJetPageFlags.DIRTY));
            removeFromLruList(p);
            removeFromHash(p);
            pClean=removeFromList(pClean, p);
        }

        return p;
    }

    /**
     * @param p
     */
    private void removeFromHash(SqlJetPage pPage) {
        // assert( pcacheMutexHeld() );
        pPage.pCache.apHash.remove(pPage.getPageNumber());
        pPage.pCache.nPage--;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#commit(boolean)
     */
    public void commit(boolean isStatementJournal) {
        SqlJetPage p;

        /* Mutex is required to call pcacheFree() */
        synchronized (pcache_g) {

            for (p = pDirty; p != null; p = p.pNext) {
                if (p.apSave[isStatementJournal ? 0 : 1] != null) {
                    p.apSave[isStatementJournal ? 0 : 1] = null;
                }
                if (isStatementJournal)
                    p.flags.remove(SqlJetPageFlags.IN_JOURNAL);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#drop(org.tmatesoft.sqljet.
     * core.ISqlJetPage)
     */
    public void drop(ISqlJetPage page) throws SqlJetException {
        assertion(page instanceof SqlJetPage);
        final SqlJetPage p = (SqlJetPage) page;
        assertion(p.nRef == 1);
        assertion(!p.flags.contains(SqlJetPageFlags.DIRTY));

        nRef--;
        nPinned--;
        synchronized (pcache_g) {
            pClean=removeFromList(pClean, p);
            removeFromHash(p);
            pageFree(p);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getCachesize()
     */
    public int getCachesize() {
        return nMax;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getDirtyList()
     */
    public ISqlJetPage getDirtyList() {
        SqlJetPage p;
        for (p = pDirty; p != null; p = p.pNext) {
            p.pDirty = p.pNext;
            if(p==p.pNext) break;            
        }
        return sortDirtyList(pDirty);
    }

    /**
     * Sort the list of pages in accending order by pgno. Pages are connected by
     * pDirty pointers. The pPrevDirty pointers are corrupted by this sort.
     * 
     * @param dirty
     * @return
     */
    private ISqlJetPage sortDirtyList(SqlJetPage pIn) {
        SqlJetPage p;
        SqlJetPage[] a = new SqlJetPage[N_SORT_BUCKET_ALLOC];
        int i;
        Arrays.fill(a, null);
        while (pIn != null) {
            p = pIn;
            pIn = p.pDirty;
            p.pDirty = null;
            for (i = 0; i < N_SORT_BUCKET - 1; i++) {
                if (a[i] == null) {
                    a[i] = p;
                    break;
                } else {
                    p = mergeDirtyList(a[i], p);
                    a[i] = null;
                }
            }
            if (i == N_SORT_BUCKET - 1) {
                /*
                 * Coverage: To get here, there need to be 2^(N_SORT_BUCKET)
                 * elements in the input list. This is possible, but
                 * impractical. Testing this line is the point of global
                 * variable sqlite3_pager_n_sort_bucket.
                 */
                a[i] = mergeDirtyList(a[i], p);
            }
        }
        p = a[0];
        for (i = 1; i < N_SORT_BUCKET; i++) {
            p = mergeDirtyList(p, a[i]);
        }
        return p;
    }

    /**
     * Merge two lists of pages connected by pDirty and in pgno order. Do not
     * both fixing the pPrevDirty pointers.
     * 
     * @param p
     * @param sqlJetPage
     * @return
     */
    private SqlJetPage mergeDirtyList(SqlJetPage pA, SqlJetPage pB) {
        SqlJetPage pTail = new SqlJetPage(szPage,szExtra);
        while (pA != null && pB != null) {
            if (pA.pgno < pB.pgno) {
                pTail.pDirty = pA;
                pTail = pA;
                pA = pA.pDirty;
            } else {
                pTail.pDirty = pB;
                pTail = pB;
                pB = pB.pDirty;
            }
        }
        if (pA != null) {
            pTail.pDirty = pA;
        } else if (pB != null) {
            pTail.pDirty = pB;
        } else {
            pTail.pDirty = null;
        }
        return pTail.pDirty;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getPageCount()
     */
    public int getPageCount() {
        return nPage;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#getRefCount()
     */
    public int getRefCount() {
        return nRef;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#iterate(org.tmatesoft.sqljet
     * .core.ISqlJetPageCallback)
     */
    public void iterate(ISqlJetPageCallback iter) throws SqlJetException {
        SqlJetPage p;
        for (p = pClean; p != null; p = p.pNext) {
            iter.pageCallback(p);
        }
        for (p = pDirty; p != null; p = p.pNext) {
            iter.pageCallback(p);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#makeClean(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void makeClean(ISqlJetPage page) throws SqlJetException {
        if (page.getFlags().contains(SqlJetPageFlags.DIRTY)) {
            // pcacheEnterMutex();
            synchronized (pcache_g) {
                SqlJetPage p = (SqlJetPage) page;
                assert (p.apSave[0] == null && p.apSave[1] == null);
                pDirty=removeFromList(pDirty, p);
                pClean=addToList(pClean, p);
                p.flags.remove(SqlJetPageFlags.DIRTY);
                if (nRef == 0) {
                    addToLruList(p);
                    nPinned--;
                }
            }
            // pcacheExitMutex();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#makeDirty(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void makeDirty(ISqlJetPage page) throws SqlJetException {
        SqlJetPage p = (SqlJetPage) page;
        p.flags.remove(SqlJetPageFlags.DONT_WRITE);
        if (p.flags.contains(SqlJetPageFlags.DIRTY))
            return;
        assert (p.nRef > 0);
        // pcacheEnterMutex();
        synchronized (pcache_g) {
            pClean=removeFromList(pClean, p);
            pDirty=addToList(pDirty, p);
        }
        // pcacheExitMutex();
        p.flags.add(SqlJetPageFlags.DIRTY);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#move(org.tmatesoft.sqljet.
     * core.ISqlJetPage, int)
     */
    public void move(ISqlJetPage page, int pageNumber) throws SqlJetException {
        SqlJetPage p = (SqlJetPage) page;
        assertion(p.nRef > 0);
        // pcacheEnterMutex();
        synchronized (pcache_g) {
            removeFromHash(p);
            p.pgno = pageNumber;
            if (pageNumber == 0) {
                p.apSave[0] = null;
                p.apSave[1] = null;
                if ((p.flags.contains(SqlJetPageFlags.DIRTY))) {
                    makeClean(p);
                }
                p.flags = EnumSet.of(SqlJetPageFlags.REUSE_UNLIKELY);
            }
            addToHash(p);
        }
        // pcacheExitMutex();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#preserve(org.tmatesoft.sqljet
     * .core.ISqlJetPage, boolean)
     */
    public void preserve(ISqlJetPage page, boolean isStatementJournal) throws SqlJetException {
        SqlJetPage p = (SqlJetPage) page;
        assertion(!p.pCache.bPurgeable);
        final int idJournal = isStatementJournal ? 1 : 0;
        assert (p.apSave[idJournal] == null);
        byte[] x;
        int sz;
        sz = p.pCache.szPage;
        p.apSave[idJournal] = x = malloc(sz);
        SqlJetUtility.memcpy(x, p.pData, sz);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetPageCache#release(org.tmatesoft.sqljet
     * .core.ISqlJetPage)
     */
    public void release(ISqlJetPage page) throws SqlJetException {
        SqlJetPage p = (SqlJetPage) page;
        assertion(p.nRef > 0);
        p.nRef--;
        if (p.nRef == 0) {
            SqlJetPageCache pCache = p.pCache;
            if (pCache.xDestroy != null) {
                pCache.xDestroy.pageCallback(p);
            }
            pCache.nRef--;
            if (!p.flags.contains(SqlJetPageFlags.DIRTY)) {
                pCache.nPinned--;
                // pcacheEnterMutex();
                synchronized (pcache_g) {
                    if (pcache_g.nCurrentPage > pcache_g.nMaxPage) {
                        pCache.pClean=removeFromList(pCache.pClean, p);
                        removeFromHash(p);
                        pageFree(p);
                    } else {
                        addToLruList(p);
                    }
                }
                // pcacheExitMutex();
            } else {
                /* Move the page to the head of the caches dirty list. */
                removeFromList(pCache.pDirty, p);
                pCache.pDirty=addToList(pCache.pDirty, p);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#rollback(boolean,
     * org.tmatesoft.sqljet.core.ISqlJetPageCallback)
     */
    public void rollback(boolean isStatementJournal, ISqlJetPageCallback reiniter) throws SqlJetException {
        SqlJetPage p;
        int sz;
        // pcacheEnterMutex(); /* Mutex is required to call pcacheFree() */
        synchronized (pcache_g) {
            sz = szPage;
            for (p = pDirty; p != null; p = p.pNext) {
                if (p.apSave[isStatementJournal ? 1 : 0] != null) {
                    SqlJetUtility.memcpy(p.pData, p.apSave[isStatementJournal ? 1 : 0], sz);
                    p.apSave[isStatementJournal ? 1 : 0] = null;
                    if (reiniter != null) {
                        reiniter.pageCallback(p);
                    }
                }
                if (isStatementJournal)
                    p.flags.remove(SqlJetPageFlags.IN_JOURNAL);
            }
        }
        // pcacheExitMutex();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#setCachesize(int)
     */
    public void setCacheSize(int cacheSize) throws SqlJetException {
        if (cacheSize < 10) {
            cacheSize = 10;
        }
        if (bPurgeable) {
            // pcacheEnterMutex();
            synchronized (pcache_g) {
                pcache_g.nMaxPage -= nMax;
                pcache_g.nMaxPage += cacheSize;
                enforceMaxPage();
            }
            // pcacheExitMutex();
        }
        nMax = cacheSize;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetPageCache#truncate(int)
     */
    public void truncate(int pageNumber) throws SqlJetException {
        SqlJetPage p, pNext;
        SqlJetPage pDirty = this.pDirty;
        //pcacheEnterMutex();
        synchronized (pcache_g) {
            
        for(p=pClean; p!=null||pDirty!=null; p=pNext){
          if( p==null ){
            p = pDirty;
            pDirty = null;
          }
          pNext = p.pNext;
          if( p.pgno>pageNumber ){
            if( p.nRef==0 ){
              removeFromHash(p);
              if( p.flags.contains(SqlJetPageFlags.DIRTY) ){
                pDirty=removeFromList(pDirty, p);
                nPinned--;
              }else{
                removeFromList(pClean, p);
                removeFromLruList(p);
              }
              pageFree(p);
            }else{
              /* If there are references to the page, it cannot be freed. In this
              ** case, zero the page content instead.
              */
              SqlJetUtility.memset(p.pData,(byte)0, szPage);
            }
          }
        }
        }
        //pcacheExitMutex();
    }

}
