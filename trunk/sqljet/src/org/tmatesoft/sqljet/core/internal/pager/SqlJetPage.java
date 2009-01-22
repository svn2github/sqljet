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

import java.util.EnumSet;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetPageFlags;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetPage implements ISqlJetPage {

    byte[] pData;                   /* Content of this page */
    byte[] pExtra;                  /* Extra content */
    SqlJetPage pDirty;                 /* Transient list of dirty pages */
    int pgno;                     /* Page number for this page */
    ISqlJetPager pPager;                 /* The pager this page is part of */
    long pageHash;                  /* Hash of page content */
    EnumSet<SqlJetPageFlags> flags = EnumSet.noneOf(SqlJetPageFlags.class); /* PGHDR flags defined below */
    /**********************************************************************
    ** Elements above are public.  All that follows is private to pcache.c
    ** and should not be accessed by other modules.
    */
    int nRef;                      /* Number of users of this page */
    SqlJetPageCache pCache;                /* Cache that owns this page */
    byte[][] apSave = new byte[2][];               /* Journal entries for in-memory databases */
    /**********************************************************************
    ** Elements above are accessible at any time by the owner of the cache
    ** without the need for a mutex.  The elements that follow can only be
    ** accessed while holding the SQLITE_MUTEX_STATIC_LRU mutex.
    */
    SqlJetPage pNextHash, pPrevHash;  /* Hash collision chain for PgHdr.pgno */
    SqlJetPage pNext, pPrev;          /* List of clean or dirty pages */
    SqlJetPage pNextLru, pPrevLru;    /* Part of global LRU list */
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#dontRollback()
     */
    public void dontRollback() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#dontWrite()
     */
    public void dontWrite() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getData()
     */
    public byte[] getData() {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getExtra()
     */
    public byte[] getExtra() {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#move(int, boolean)
     */
    public void move(int pageNumber, boolean isCommit) throws SqlJetException {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#ref()
     */
    public void ref() {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#unref()
     */
    public void unref() {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#write()
     */
    public void write() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getFlags()
     */
    public EnumSet<SqlJetPageFlags> getFlags() {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getHash()
     */
    public long getHash() {
        // TODO Auto-generated method stub
        return 0;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getPager()
     */
    public ISqlJetPager getPager() {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#setFlags(java.util.EnumSet)
     */
    public void setFlags(EnumSet<SqlJetPageFlags> flags) {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#setHash(long)
     */
    public void setHash(long hash) {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#setPager(org.tmatesoft.sqljet.core.ISqlJetPager)
     */
    public void setPager(ISqlJetPager pager) {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getPageNumber()
     */
    public int getPageNumber() {
        // TODO Auto-generated method stub
        return 0;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#setPageNumber(long)
     */
    public void setPageNumber(int pageNumber) {
        // TODO Auto-generated method stub
        
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getNext()
     */
    public ISqlJetPage getNext() {
        return pNext;
    }
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getPrev()
     */
    public ISqlJetPage getPrev() {
        return pPrev;
    }
    
}
