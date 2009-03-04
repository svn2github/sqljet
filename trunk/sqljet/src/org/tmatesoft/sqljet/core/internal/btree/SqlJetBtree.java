/**
 * SqlJetBtree.java
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

import static org.tmatesoft.sqljet.core.SqlJetException.*;

import java.io.File;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetBackend;
import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.ISqlJetConfig;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.ISqlJetPageCallback;
import org.tmatesoft.sqljet.core.ISqlJetPager;
import org.tmatesoft.sqljet.core.SqlJetAutoVacuumMode;
import org.tmatesoft.sqljet.core.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.SqlJetBtreeTableCreateFlags;
import org.tmatesoft.sqljet.core.SqlJetDbFlags;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;
import org.tmatesoft.sqljet.core.SqlJetSafetyLevel;
import org.tmatesoft.sqljet.core.SqlJetSavepointOperation;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.pager.SqlJetPager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtree implements ISqlJetBtree {

    /** The database connection holding this btree */
    ISqlJetDb db;

    /** Sharable content of this btree */
    SqlJetBtreeShared pBt;

    /*
    ** Btree.inTrans may take one of the following values.
    **
    ** If the shared-data extension is enabled, there may be multiple users
    ** of the Btree structure. At most one of these may open a write transaction,
    ** but any number may have active read transactions.
    */
    static enum TransMode { 
        NONE, READ, WRITE
    }
    
    /** TRANS_NONE, TRANS_READ or TRANS_WRITE */
    TransMode inTrans;

    /** True if we can share pBt with another db */
    boolean sharable;

    /** True if db currently has pBt locked */
    boolean locked;

    /** Number of nested calls to sqlite3BtreeEnter() */
    int wantToLock;

    /** List of other sharable Btrees from the same db */
    SqlJetBtree pNext;

    /** Back pointer of the same list */
    SqlJetBtree pPrev;
    
    /**
    * A list of BtShared objects that are eligible for participation in shared cache.  
    */
    static List<SqlJetBtreeShared> sharedCacheList = new LinkedList<SqlJetBtreeShared>();

    int get2byte( byte[] x, int off ) { return x[off]<<8 | x[off+1]; }
    void put2byte(byte[] p, int off, int v) { p[off]=(byte)(v>>8); p[off+1]=(byte)(v); }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#open(java.io.File, org.tmatesoft.sqljet.core.ISqlJetDb, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)
     */
    public void open(File filename, ISqlJetDb db, EnumSet<SqlJetBtreeFlags> flags,
            final SqlJetFileType type, final EnumSet<SqlJetFileOpenPermission> permissions) throws SqlJetException {

        ISqlJetFileSystem pVfs;         /* The VFS to use for this btree */
        SqlJetBtreeShared pBt = null;   /* Shared part of btree structure */
        SqlJetException rc = null;
        int nReserve;
        byte[] zDbHeader = new byte[100];

        /* Set the variable isMemdb to true for an in-memory database, or 
        ** false for a file-based database. This symbol is only required if
        ** either of the shared-data or autovacuum features are compiled 
        ** into the library.
        */
        final boolean isMemdb = filename!=null &&
            ISqlJetPager.MEMORY_DB.equals(filename.getPath());

        assertion( db!=null );

        pVfs = db.getFileSystem();
        this.inTrans = TransMode.NONE;
        this.db = db;

        /*
        ** If this Btree is a candidate for shared cache, try to find an
        ** existing BtShared object that we can share with
        */
        if( !isMemdb
         && !db.getFlags().contains(SqlJetDbFlags.Vtab)
         && filename!=null && !"".equals(filename.getPath())
        ){
          if( db.getConfig().isSharedCacheEnabled() ){
            this.sharable = true;
            db.getFlags().add(SqlJetDbFlags.SharedCache);
            final String fullPathname = pVfs.getFullPath(filename);
            synchronized (sharedCacheList) {
                for( final Iterator<SqlJetBtreeShared> i = 
                    sharedCacheList.iterator(); i.hasNext(); pBt = i.next() ) 
                {
                    assertion(pBt.nRef>0);
                    final String pagerFilename = pVfs.getFullPath(pBt.pPager.getFileName());
                    if( fullPathname.equals(pagerFilename) && 
                            pVfs == pBt.pPager.getFileSystem() ) {
                        this.pBt = pBt;
                        pBt.nRef++;
                        break;
                    }
                }
            }
          }
        }
        
        try {
        if( pBt==null ) {
          /*
          ** The following asserts make sure that structures used by the btree are
          ** the right size.  This is to guard against size changes that result
          ** when compiling on a different architecture.
          */
          //assert( sizeof(i64)==8 || sizeof(i64)==4 );
          //assert( sizeof(u64)==8 || sizeof(u64)==4 );
          //assert( sizeof(u32)==4 );
          //assert( sizeof(u16)==2 );
          //assert( sizeof(Pgno)==4 );
        
          pBt = new SqlJetBtreeShared();
          pBt.pPager = new SqlJetPager();
          pBt.pPager.open(pVfs, filename, SqlJetBtreeFlags.toPagerFlags(flags), type, permissions);
          pBt.pPager.readFileHeader(zDbHeader.length, zDbHeader);
          pBt.pPager.setBusyhandler(new ISqlJetBusyHandler() {
            public boolean call(int number) { return invokeBusyHandler(number);  }
          });
          this.pBt = pBt;
          pBt.pPager.setReiniter(new ISqlJetPageCallback(){
            public void pageCallback(ISqlJetPage page) throws SqlJetException { pageReinit(page); }
          });

          pBt.pCursor = null;
          pBt.pPage1 = null;
          pBt.readOnly = pBt.pPager.isReadOnly();
          pBt.pageSize = get2byte(zDbHeader,16);
          
          if( pBt.pageSize < ISqlJetLimits.SQLJET_MIN_PAGE_SIZE 
             || pBt.pageSize > ISqlJetLimits.SQLJET_MAX_PAGE_SIZE
             || ((pBt.pageSize-1)&pBt.pageSize)!=0 )
          {
            pBt.pageSize = 0;
            pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);
            /* If the magic name ":memory:" will create an in-memory database, then
            ** leave the autoVacuum mode at 0 (do not auto-vacuum), even if
            ** SQLITE_DEFAULT_AUTOVACUUM is true. On the other hand, if
            ** SQLITE_OMIT_MEMORYDB has been defined, then ":memory:" is just a
            ** regular file-name. In this case the auto-vacuum applies as per normal.
            */
            if( null!=filename && !isMemdb ){
              pBt.autoVacuum = SQLJET_DEFAULT_AUTOVACUUM!=SqlJetAutoVacuumMode.NONE;
              pBt.incrVacuum = SQLJET_DEFAULT_AUTOVACUUM==SqlJetAutoVacuumMode.FULL;
            }
            nReserve = 0;
          }else{
            nReserve = zDbHeader[20];
            pBt.pageSizeFixed = true;
            pBt.autoVacuum = (SqlJetUtility.get4byte(zDbHeader, 36 + 4*4)!=0);
            pBt.incrVacuum = (SqlJetUtility.get4byte(zDbHeader, 36 + 7*4)!=0);
          }
          pBt.usableSize = pBt.pageSize - nReserve;
          assertion( (pBt.pageSize & 7)==0 );  /* 8-byte alignment of pageSize */
          pBt.pageSize = pBt.pPager.setPageSize(pBt.pageSize);
         
          /* Add the new BtShared object to the linked list sharable BtShareds.
          */
          if( this.sharable ){
            pBt.nRef = 1;
            synchronized (sharedCacheList) {
                sharedCacheList.add(pBt);
            }
          }
        }

        /* If the new Btree uses a sharable pBtShared, then link the new
        ** Btree into the list of all sharable Btrees for the same connection.
        ** The list is kept in ascending order by pBt address.
        */
        if( this.sharable ){
          for( final ISqlJetBackend backend : db.getBackends() ){
            final ISqlJetBtree btree = backend.getBtree();
            if(btree==null||!(btree instanceof SqlJetBtree)) continue;
            SqlJetBtree pSib = (SqlJetBtree) btree;
            if( pSib.sharable ){
              while( pSib.pPrev!=null ){ pSib = pSib.pPrev; }
              if( this.pBt.hashCode() < pSib.pBt.hashCode() ){
                this.pNext = pSib;
                this.pPrev = null;
                pSib.pPrev = this;
              }else{
                while( pSib.pNext!=null && pSib.pNext.pBt.hashCode() < this.pBt.hashCode() ){
                  pSib = pSib.pNext;
                }
                this.pNext = pSib.pNext;
                this.pPrev = pSib;
                if( this.pNext!=null ){
                  this.pNext.pPrev = this;
                }
                pSib.pNext = this;
              }
              break;
            }
          }
        }


    } catch(SqlJetException e) {

      //btree_open_out:
          if( pBt!=null && pBt.pPager!=null ){
              pBt.pPager.close();
          }
        throw e;
    }

    }

    /**
     * @param page
     */
    protected void pageReinit(ISqlJetPage page) {
        // TODO Auto-generated method stub
        
    }

    protected boolean invokeBusyHandler(int number) {
        // TODO Auto-generated method stub
        return false;
    }
    

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#beginStmt()
     */
    public void beginStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#beginTrans(org.tmatesoft.sqljet
     * .core.SqlJetTransactionMode)
     */
    public void beginTrans(SqlJetTransactionMode mode) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#clearTable(int, int[])
     */
    public void clearTable(int table, int[] change) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#close()
     */
    public void close() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commit()
     */
    public void commit() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#commitPhaseOne(java.lang.String)
     */
    public void commitPhaseOne(String master) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commitPhaseTwo()
     */
    public void commitPhaseTwo() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#commitStmt()
     */
    public void commitStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#copyFile(org.tmatesoft.sqljet.
     * core.ISqlJetBtree)
     */
    public void copyFile(ISqlJetBtree from) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#createTable(java.util.EnumSet)
     */
    public int createTable(EnumSet<SqlJetBtreeTableCreateFlags> flags) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#dropTable(int)
     */
    public int dropTable(int table) throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getAutoVacuum()
     */
    public SqlJetAutoVacuumMode getAutoVacuum() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getCursor(int, boolean,
     * org.tmatesoft.sqljet.core.ISqlJetKeyInfo)
     */
    public ISqlJetBtreeCursor getCursor(int table, boolean wrFlag, ISqlJetKeyInfo keyInfo) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getDirname()
     */
    public File getDirname() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getFilename()
     */
    public File getFilename() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getJournalname()
     */
    public File getJournalname() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getMeta(int)
     */
    public int[] getMeta(int idx) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getPageSize()
     */
    public int getPageSize() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getPager()
     */
    public ISqlJetPager getPager() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getReserve()
     */
    public int getReserve() throws SqlJetException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#getSchema()
     */
    public Object getSchema() throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#incrVacuum()
     */
    public void incrVacuum() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#integrityCheck(int[], int,
     * int, int[])
     */
    public String integrityCheck(int[] root, int root2, int mxErr, int[] err) throws SqlJetException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInReadTrans()
     */
    public void isInReadTrans() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInStmt()
     */
    public void isInStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isInTrans()
     */
    public void isInTrans() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isSchemaLocked()
     */
    public boolean isSchemaLocked() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#isSyncDisabled()
     */
    public boolean isSyncDisabled() throws SqlJetException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#lockTable(int, boolean)
     */
    public void lockTable(int table, boolean isWriteLock) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#rollback()
     */
    public void rollback() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#rollbackStmt()
     */
    public void rollbackStmt() throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#savepoint(org.tmatesoft.sqljet
     * .core.SqlJetSavepointOperation, int)
     */
    public void savepoint(SqlJetSavepointOperation op, int savepoint) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#setAutoVacuum(org.tmatesoft.sqljet
     * .core.SqlJetAutoVacuumMode)
     */
    public void setAutoVacuum(SqlJetAutoVacuumMode autoVacuum) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setCacheSize(int)
     */
    public void setCacheSize(int mxPage) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setMaxPageCount(int)
     */
    public void setMaxPageCount(int mxPage) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setPageSize(int, int)
     */
    public void setPageSize(int pageSize, int reserve) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#setSafetyLevel(org.tmatesoft.sqljet
     * .core.SqlJetSafetyLevel)
     */
    public void setSafetyLevel(SqlJetSafetyLevel level) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#setSchema(java.lang.Object)
     */
    public void setSchema(Object schema) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.ISqlJetBtree#tripAllCursors(org.tmatesoft.sqljet
     * .core.SqlJetErrorCode)
     */
    public void tripAllCursors(SqlJetErrorCode errCode) throws SqlJetException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetBtree#updateMeta(int, int[])
     */
    public void updateMeta(int idx, int[] value) throws SqlJetException {
        // TODO Auto-generated method stub

    }

}
