/**
 * Page.java
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

import org.tmatesoft.sqljet.core.ISqlJetPage;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetPage implements ISqlJetPage {

    byte[] pData;                   /* Content of this page */
    byte[] pExtra;                  /* Extra content */
    List<SqlJetPage> pDirty;                 /* Transient list of dirty pages */
    long pgno;                     /* Page number for this page */
    SqlJetPager pPager;                 /* The pager this page is part of */
    long pageHash;                  /* Hash of page content */
    int flags;                     /* PGHDR flags defined below */
    /**********************************************************************
    ** Elements above are public.  All that follows is private to pcache.c
    ** and should not be accessed by other modules.
    */
    int nRef;                      /* Number of users of this page */
    SqlJetPageCache pCache;                /* Cache that owns this page */
    Object[] apSave = new Object[2];               /* Journal entries for in-memory databases */
    /**********************************************************************
    ** Elements above are accessible at any time by the owner of the cache
    ** without the need for a mutex.  The elements that follow can only be
    ** accessed while holding the SQLITE_MUTEX_STATIC_LRU mutex.
    */
    SqlJetPage pNextHash, pPrevHash;  /* Hash collision chain for PgHdr.pgno */
    SqlJetPage pNext, pPrev;          /* List of clean or dirty pages */
    SqlJetPage pNextLru, pPrevLru;    /* Part of global LRU list */
    
    
}
