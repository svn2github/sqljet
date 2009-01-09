/**
 * ISqlJetPageCache.java
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

import java.util.EnumSet;
import java.util.List;

/**
 * The page cache subsystem
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetPageCache {

    /**
     * Initialize the page cache subsystem
     */
    int initialize();

    /**
     * Shutdown the page cache subsystem
     */
    void shutdown();

    /**
     * Initialize the page cache memory pool.
     * 
     * This must be called at start-time when no page cache lines are checked
     * out. This function is not threadsafe.
     * 
     * @param buffer
     * @param sz
     * @param n
     */
    void bufferSetup(final byte[] buffer, final int sz, final int n);

    /**
     ** Allocate a page cache line. Look in the page cache memory pool first and
     * use an element from it first if available. If nothing is available in the
     * page cache memory pool, go to the general purpose memory allocator.
     * 
     * @param sz
     * @return
     */
    byte[] malloc(final int sz);

    /**
     * Release a pager memory allocation
     * 
     * @param p
     */
    void free(final byte[] p);

    /**
     * Create a new pager cache. Under memory stress, invoke xStress to try to
     * make pages clean. Only clean and unpinned pages can be reclaimed.
     * 
     * @param szPage
     *            Size of every page
     * @param szExtra
     *            Extra space associated with each page
     * @param bPurgeable
     *            True if pages are on backing store
     * @param xDestroy
     *            Called to destroy a page
     * @param xStress
     *            Call to try to make pages clean
     */
    void open(final int szPage, final int szExtra, final boolean bPurgeable, final ISqlJetPageCallback xDestroy,
            final ISqlJetPageCallback xStress);

    /**
     * Modify the page-size after the cache has been created. Change the page
     * size for PCache object. This can only happen when the cache is empty.
     * 
     * @param pageSize
     */
    void setPageSize(final int pageSize);

    /**
     * Try to obtain a page from the cache.
     * 
     * 
     * @param pgno
     *            Page number to obtain
     * @param createFlag
     *            If true, create page if it does not exist already
     * @return
     */
    ISqlJetPage fetch(final int pageNumber, final boolean createFlag) throws SqlJetException;

    /**
     * Dereference a page. When the reference count reaches zero, move the page
     * to the LRU list if it is clean. One release per successful fetch. Page is
     * pinned until released. Reference counted.
     * 
     * @param page
     */
    void release(final ISqlJetPage page);

    /**
     * Remove page from cache
     * 
     * Drop a page from the cache. There must be exactly one reference to the
     * page. This function deletes that reference, so after it returns the page
     * pointed to by p is invalid.
     * 
     * @param page
     */
    void drop(final ISqlJetPage page);

    /**
     * Make sure the page is marked as dirty. If it isn't dirty already, make it
     * so.
     * 
     * @param page
     */
    void makeDirty(final ISqlJetPage page);

    /**
     * Make sure the page is marked as clean. If it isn't clean already, make it
     * so.
     * 
     * @param page
     */
    void makeClean(final ISqlJetPage page);

    /**
     * Mark all dirty list pages as clean Make every page in the cache clean.
     * 
     */
    void cleanAll();

    /**
     * Change a page number. Used by incr-vacuum.
     * 
     * Change the page number of page p to newPgno. If newPgno is 0, then the
     * page object is added to the clean-list and the PGHDR_REUSE_UNLIKELY flag
     * set.
     * 
     * @param page
     * @param pageNumber
     */
    void move(final ISqlJetPage page, final int pageNumber);

    /**
     * Remove all pages with page numbers more than pageNumber. Reset the cache
     * if pageNumber==0
     * 
     * Drop every cache entry whose page number is greater than "pgno".
     * 
     * @param pageNumber
     */
    void truncate(final int pageNumber);

    /**
     * Preserve the content of the page. It is assumed that the content has not
     * been preserved already.
     * 
     * If isStatementJournal==false then this is for the overall transaction. If
     * isStatementJournal==true then this is for the statement journal.
     * 
     * This routine is used for in-memory databases only. Routine used to
     * implement transactions on memory-only databases.
     * 
     * @param page
     * @param isStatementJournal
     * @throws SqlJetException
     */
    void preserve(final ISqlJetPage page, final boolean isStatementJournal) throws SqlJetException;

    /**
     * Drop preserved copy. Commit a change previously preserved.
     * 
     * Routine used to implement transactions on memory-only databases.
     * 
     * @param isStatementJournal
     */
    void commit(final boolean isStatementJournal);

    /**
     * Rollback a change previously preserved.
     * 
     * Routine used to implement transactions on memory-only databases.
     * 
     * @param isStatementJournal
     *            Which copy to rollback to
     * @param xReiniter
     *            Called on each rolled back page
     */
    void rollback(final boolean isStatementJournal, final ISqlJetPageCallback xReiniter);

    /**
     * Get a list of all dirty pages in the cache, sorted by page number
     * 
     * @return
     */
    List<ISqlJetPage> getDirtyList();

    /**
     * Reset and close the cache object
     * 
     */
    void close();

    /**
     * Clear flags from pages of the page cache
     * 
     * @param flags
     */
    void clearFlags(final EnumSet<SqlJetPageFlags> flags);

    /**
     * Return true if the number of dirty pages is 0 or 1
     */
    boolean isZeroOrOneDirtyPages();

    /**
     * Discard the contents of the cache
     */
    void clear() throws SqlJetException;

    /**
     * Return the total number of outstanding page references
     */
    int getRefCount();

    /**
     * Return the total number of pages stored in the cache
     */
    int getPageCount();

    /**
     * Iterate through all pages currently stored in the cache.
     * 
     * @param xIter
     */
    void iterate(final ISqlJetPageCallback xIter);

    /**
     * Get the cache-size for the pager-cache.
     * 
     * @return
     */
    int getCachesize();

    /**
     * Set the suggested cache-size for the pager-cache.
     * 
     * If no global maximum is configured, then the system attempts to limit the
     * total number of pages cached by purgeable pager-caches to the sum of the
     * suggested cache-sizes.
     * 
     * @param cacheSize
     */
    void setCacheSize(final int cacheSize);

    /* Try to return memory used by the pcache module to the main memory heap */
    // int ReleaseMemory(int);
    // void Stats(int*,int*,int*,int*);
}
