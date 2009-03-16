/**
 * SqlJetBtreeCursor.java
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
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.ISqlJetUnpackedRecord;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetBtreeCursor implements ISqlJetBtreeCursor {    
    
    SqlJetBtree pBtree;            /* The Btree to which this cursor belongs */
    SqlJetBtreeShared pBt;            /* The BtShared this cursor points to */
    SqlJetBtreeCursor pNext, pPrev;  /* Forms a linked list of all cursors */
    ISqlJetKeyInfo pKeyInfo; /* Argument passed to comparison function */
    int pgnoRoot;            /* The root page of this tree */
    SqlJetBtreeCellInfo info;            /* A parse of the cell we are pointing at */
    boolean wrFlag;                /* True if writable */
    boolean atLast;                /* Cursor pointing to the last entry */
    boolean validNKey;             /* True if info.nKey is valid */
    CursorState eState;                /* One of the CURSOR_XXX constants (see below) */
    Object pKey;      /* Saved key that was cursor's last known position */
    long nKey;        /* Size of pKey, or last integer key */
    int skip;        /* (skip<0) -> Prev() is a no-op. (skip>0) -> Next() is */
    boolean isIncrblobHandle;      /* True if this cursor is an incr. io handle */
    int aOverflow;          /* Cache of overflow page locations */
    boolean pagesShuffled;         /* True if Btree pages are rearranged by balance()*/
    int iPage;                            /* Index of current page in apPage */
    SqlJetMemPage[] apPage = new SqlJetMemPage[BTCURSOR_MAX_DEPTH];  /* Pages from root to current page */
    int[] aiIdx = new int[BTCURSOR_MAX_DEPTH];        /* Current index in apPage[i] */

    /**
    * Potential values for BtCursor.eState.
    *
    * CURSOR_VALID:
    *   Cursor points to a valid entry. getPayload() etc. may be called.
    *
    * CURSOR_INVALID:
    *   Cursor does not point to a valid entry. This can happen (for example) 
    *   because the table is empty or because BtreeCursorFirst() has not been
    *   called.
    *
    * CURSOR_REQUIRESEEK:
    *   The table that this cursor was opened on still exists, but has been 
    *   modified since the cursor was last used. The cursor position is saved
    *   in variables BtCursor.pKey and BtCursor.nKey. When a cursor is in 
    *   this state, restoreCursorPosition() can be called to attempt to
    *   seek the cursor to the saved position.
    *
    * CURSOR_FAULT:
    *   A unrecoverable error (an I/O error or a malloc failure) has occurred
    *   on a different connection that shares the BtShared cache with this
    *   cursor.  The error has left the cache in an inconsistent state.
    *   Do nothing else with this cursor.  Any attempt to use the cursor
    *   should return the error code stored in BtCursor.skip
    */
    static enum CursorState {
        INVALID,           //0
        VALID,             //1
        REQUIRESEEK,       //2
        FAULT             //3
    }

    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#cacheOverflow()
     */
    public void cacheOverflow(){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#clearCursor()
     */
    public void clearCursor(){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#closeCursor()
     */
    public void closeCursor(){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#cursorHasMoved()
     */
    public boolean cursorHasMoved(){
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#data(int, int, byte[])
     */
    public void data(int offset, int amt, byte[] buf){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#dataFetch(int[])
     */
    public byte[] dataFetch(int[] amt){
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#delete()
     */
    public void delete(){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#eof()
     */
    public boolean eof() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#first()
     */
    public boolean first(){
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#flags()
     */
    public byte flags(){
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getCursorDb()
     */
    public ISqlJetDb getCursorDb(){
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getDataSize()
     */
    public int getDataSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#getKeySize()
     */
    public long getKeySize(){
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#insert(byte[], long, byte[], int, int, boolean)
     */
    public void insert(byte[] key, long key2, byte[] data, int data2, int zero, boolean bias){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#key(int, int, byte[])
     */
    public void key(int offset, int amt, byte[] buf){
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#keyFetch(int[])
     */
    public byte[] keyFetch(int[] amt){
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#last()
     */
    public boolean last(){
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveTo(byte[], long, boolean)
     */
    public int moveTo(byte[] key, long key2, boolean bias){
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#moveToUnpacked(org.tmatesoft.sqljet.core.ISqlJetUnpackedRecord, long, boolean)
     */
    public int moveToUnpacked(ISqlJetUnpackedRecord unKey, long intKey, boolean bias){
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#next()
     */
    public boolean next(){
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#previous()
     */
    public boolean previous(){
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBtreeCursor#putData(int, int, byte[])
     */
    public void putData(int offset, int amt, byte[] data){
        // TODO Auto-generated method stub

    }

    /**
     * 
     */
    public void saveCursorPosition() throws SqlJetException {
        // TODO Auto-generated method stub
        
    }

}
