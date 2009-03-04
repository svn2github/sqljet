/**
 * SqlJetMemPage.java
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

import org.tmatesoft.sqljet.core.ISqlJetPage;

/**
 * As each page of the file is loaded into memory, an instance of the following
 * structure is appended and initialized to zero. This structure stores
 * information about the page that is decoded from the raw file page.
 * 
 * The pParent field points back to the parent page. This allows us to walk up
 * the BTree from any leaf to the root. Care must be taken to unref() the parent
 * page pointer when this page is no longer referenced. The pageDestructor()
 * routine handles that chore.
 * 
 * Access to all fields of this structure is controlled by the mutex stored in
 * MemPage.pBt->mutex.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMemPage {

    /** True if previously initialized. MUST BE FIRST! */
    boolean isInit;

    /** Number of overflow cell bodies in aCell[] */
    int nOverflow;

    /** True if intkey flag is set */
    boolean intKey;

    /** True if leaf flag is set */
    boolean leaf;

    /** True if this page stores data */
    boolean hasData;

    /** 100 for page 1. 0 otherwise */
    byte hdrOffset;

    /** 0 if leaf==1. 4 if leaf==0 */
    byte childPtrSize;

    /** Copy of BtShared.maxLocal or BtShared.maxLeaf */
    int maxLocal;

    /** Copy of BtShared.minLocal or BtShared.minLeaf */
    int minLocal;

    /** Index in aData of first cell pointer */
    int cellOffset;

    /** Number of free bytes on the page */
    int nFree;

    /** Number of cells on this page, local and ovfl */
    int nCell;

    /** Mask for page offset */
    int maskPage;

    static class _OvflCell {

        /** Pointers to the body of the overflow cell */
        byte[] pCell;

        /** Insert this cell before idx-th non-overflow cell */
        int idx;

    }

    /** Cells that will not fit on aData[] */
    _OvflCell[] aOvfl = new _OvflCell[5];

    /** Pointer to BtShared that this page is part of */
    SqlJetBtreeShared pBt;

    /** Pointer to disk image of the page data */
    byte[] aData;

    /** Pager page handle */
    ISqlJetPage pDbPage;

    /** Page number for this page */
    int pgno;

}
