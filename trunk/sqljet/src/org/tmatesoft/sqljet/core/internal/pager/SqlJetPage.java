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

import static org.tmatesoft.sqljet.core.SqlJetException.*;

import java.util.BitSet;
import java.util.EnumSet;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetPageFlags;
import org.tmatesoft.sqljet.core.SqlJetUtility;

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
    SqlJetPager pPager;                 /* The pager this page is part of */
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

        assertion( pPager.state.compareTo(SqlJetPagerState.RESERVED) >= 0 );

        /* If the journal file is not open, or DontWrite() has been called on
        ** this page (DontWrite() sets the alwaysRollback flag), then this
        ** function is a no-op.
        */
        if( !pPager.journalOpen 
         || SqlJetUtility.bitSetTest(pPager.pagesAlwaysRollback, pgno)
         || pgno > pPager.origDbSize
        ){
          return;
        }
        
        assertion( !pPager.memDb );    /* For a memdb, pPager->journalOpen is always 0 */

        if( flags.contains(SqlJetPageFlags.IN_JOURNAL) ){
          return;
        }

        /* If SECURE_DELETE is disabled, then there is no way that this
        ** routine can be called on a page for which sqlite3PagerDontWrite()
        ** has not been previously called during the same transaction.
        ** And if DontWrite() has previously been called, the following
        ** conditions must be met.
        **
        ** (Later:)  Not true.  If the database is corrupted by having duplicate
        ** pages on the freelist (ex: corrupt9.test) then the following is not
        ** necessarily true:
        */

        assertion( pPager.pagesInJournal!=null );
        pPager.pagesInJournal.set(pgno);
        flags.add(SqlJetPageFlags.IN_JOURNAL);
        flags.remove(SqlJetPageFlags.NEED_READ);
        
        if( pPager.stmtInUse ){
          assertion( pPager.stmtSize >= pPager.origDbSize );
          pPager.pagesInStmt.set(pgno);
        }
        
        //PAGERTRACE3("DONT_ROLLBACK page %d of %d\n", pPg->pgno, PAGERID(pPager));
        //IOTRACE(("GARBAGE %p %d\n", pPager, pPg->pgno))
        
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#dontWrite()
     */
    public void dontWrite() throws SqlJetException {

        if( pPager.memDb || pgno > pPager.origDbSize ){
          return;
        }
        
        if( pPager.pagesAlwaysRollback==null ){
          assertion( pPager.pagesInJournal );
          pPager.pagesAlwaysRollback = new BitSet(pPager.origDbSize);
        }
        pPager.pagesAlwaysRollback.set(pgno);
        if( flags.contains(SqlJetPageFlags.DIRTY) && !pPager.stmtInUse ){
          assertion( pPager.state.compareTo(SqlJetPagerState.SHARED) >= 0 );
          if( pPager.dbSize==pgno && pPager.origDbSize < pPager.dbSize ){
            /* If this pages is the last page in the file and the file has grown
            ** during the current transaction, then do NOT mark the page as clean.
            ** When the database file grows, we must make sure that the last page
            ** gets written at least once so that the disk file will be the correct
            ** size. If you do not write this page and the size of the file
            ** on the disk ends up being too small, that can lead to database
            ** corruption during the next transaction.
            */
          }else{
            //PAGERTRACE3("DONT_WRITE page %d of %d\n", pPg->pgno, PAGERID(pPager));
            //IOTRACE(("CLEAN %p %d\n", pPager, pPg->pgno))
            flags.add(SqlJetPageFlags.DONT_WRITE);
            pageHash = pPager.pageHash(this);
          }
        }
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getData()
     */
    public byte[] getData() throws SqlJetException {
        assertion( nRef>0 );
        return pData;
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#getExtra()
     */
    public byte[] getExtra() {
        return (pPager!=null?pExtra:null);
    }
    
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#move(int, boolean)
     */
    public void move(int pageNumber, boolean isCommit) throws SqlJetException {
    
        SqlJetPage pPgOld;  /* The page being overwritten. */
        int needSyncPgno = 0;

        assertion( nRef>0 );

        //PAGERTRACE5("MOVE %d page %d (needSync=%d) moves to %d\n", 
        //    PAGERID(pPager), pPg->pgno, (pPg->flags&PGHDR_NEED_SYNC)?1:0, pgno);
        //IOTRACE(("MOVE %p %d %d\n", pPager, pPg->pgno, pgno))

        pPager.getContent(this);

        /* If the journal needs to be sync()ed before page pPg->pgno can
        ** be written to, store pPg->pgno in local variable needSyncPgno.
        **
        ** If the isCommit flag is set, there is no need to remember that
        ** the journal needs to be sync()ed before database page pPg->pgno 
        ** can be written to. The caller has already promised not to write to it.
        */
        if( flags.contains(SqlJetPageFlags.NEED_SYNC) && !isCommit ){
          needSyncPgno = pgno;
          assertion( flags.contains(SqlJetPageFlags.IN_JOURNAL) || pgno > pPager.origDbSize );
          assertion( flags.contains(SqlJetPageFlags.DIRTY) );
          assertion( pPager.needSync );
        }

        /* If the cache contains a page with page-number pgno, remove it
        ** from its hash chain. Also, if the PgHdr.needSync was set for 
        ** page pgno before the 'move' operation, it needs to be retained 
        ** for the page moved there.
        */
        flags.remove(SqlJetPageFlags.NEED_SYNC);
        flags.remove(SqlJetPageFlags.IN_JOURNAL);
        pPgOld = (SqlJetPage)pPager.lookup(pgno);
        assertion( pPgOld==null || pPgOld.nRef==1 );
        if( pPgOld!=null ){
          if(pPgOld.flags.contains(SqlJetPageFlags.NEED_SYNC))
              flags.add(SqlJetPageFlags.NEED_SYNC);
        }
        if( SqlJetUtility.bitSetTest(pPager.pagesInJournal,pgno) ){
          assertion( ! pPager.memDb );
          flags.add(SqlJetPageFlags.IN_JOURNAL);
        }

        pPager.pageCache.move(this, pgno);
        
        if( pPgOld!=null ){
          pPager.pageCache.move(pPgOld, 0);
          pPager.pageCache.release(pPgOld);
        }

        pPager.pageCache.makeDirty(this);
        pPager.dirtyCache = true;
        pPager.dbModified = true;

        if( needSyncPgno!=0 ){
          /* If needSyncPgno is non-zero, then the journal file needs to be 
          ** sync()ed before any data is written to database file page needSyncPgno.
          ** Currently, no such page exists in the page-cache and the 
          ** "is journaled" bitvec flag has been set. This needs to be remedied by
          ** loading the page into the pager-cache and setting the PgHdr.needSync 
          ** flag.
          **
          ** If the attempt to load the page into the page-cache fails, (due
          ** to a malloc() or IO failure), clear the bit in the pInJournal[]
          ** array. Otherwise, if the page is loaded and written again in
          ** this transaction, it may be written to the database file before
          ** it is synced into the journal file. This way, it may end up in
          ** the journal file twice, but that is not a problem.
          **
          ** The sqlite3PagerGet() call may cause the journal to sync. So make
          ** sure the Pager.needSync flag is set too.
          */
          SqlJetPage pPgHdr;
          assertion( pPager.needSync );
          try {
              pPgHdr=(SqlJetPage)pPager.getPage(needSyncPgno);
          } catch (SqlJetException e) {
              if( pPager.pagesInJournal!=null && needSyncPgno<=pPager.origDbSize ){
                  pPager.pagesInJournal.clear(needSyncPgno);
                }
              throw e;
        }
          
          pPager.needSync = true;
          assertion( !pPager.noSync && !pPager.memDb );
          pPgHdr.flags.add(SqlJetPageFlags.NEED_SYNC);
          pPgHdr.flags.add(SqlJetPageFlags.IN_JOURNAL);
          pPager.pageCache.makeDirty(pPgHdr);
          pPgHdr.unref();
      }
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#ref()
     */
    public void ref() throws SqlJetException {
        assertion(nRef>0);
        nRef++;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetPage#unref()
     */
    public void unref() {
        try {
            pPager.pageCache.release(this);
        } catch (SqlJetException e) {
            // TODO: handle exception
        } finally {
            try {
            pPager.unlockIfUnused();
            } catch (SqlJetException e) {
                // TODO: handle exception
            }
        }
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
