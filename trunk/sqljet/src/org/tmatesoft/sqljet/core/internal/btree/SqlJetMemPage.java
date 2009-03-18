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

import static org.tmatesoft.sqljet.core.SqlJetUtility.get2byte;
import static org.tmatesoft.sqljet.core.SqlJetUtility.get4byte;
import static org.tmatesoft.sqljet.core.SqlJetUtility.getVarint;
import static org.tmatesoft.sqljet.core.SqlJetUtility.getVarint32;
import static org.tmatesoft.sqljet.core.SqlJetUtility.put4byte;
import static org.tmatesoft.sqljet.core.SqlJetUtility.slice;

import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.ISqlJetPage;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetUtility;

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

    /**
     * Page type flags. An ORed combination of these flags appear as the first
     * byte of on-disk image of every BTree page.
     */
    public static final byte PTF_INTKEY = 0x01;
    public static final byte PTF_ZERODATA = 0x02;
    public static final byte PTF_LEAFDATA = 0x04;
    public static final byte PTF_LEAF = 0x08;

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
    ByteBuffer aData;

    /** Pager page handle */
    ISqlJetPage pDbPage;

    /** Page number for this page */
    int pgno;

    /**
     * Decode the flags byte (the first byte of the header) for a page and
     * initialize fields of the MemPage structure accordingly.
     * 
     * Only the following combinations are supported. Anything different
     * indicates a corrupt database files:
     * 
     * PTF_ZERODATA PTF_ZERODATA | PTF_LEAF PTF_LEAFDATA | PTF_INTKEY
     * PTF_LEAFDATA | PTF_INTKEY | PTF_LEAF
     */
    public void decodeFlags(int flagByte) throws SqlJetException {
        assert(hdrOffset == (pgno == 1 ? 100 : 0));
        assert(pBt.mutex.held());
        leaf = (flagByte >> 3) > 0;
        assert(PTF_LEAF == 1 << 3);
        flagByte &= ~PTF_LEAF;
        childPtrSize = (byte) (4 - 4 * (leaf ? 1 : 0));
        if (flagByte == (PTF_LEAFDATA | PTF_INTKEY)) {
            intKey = true;
            hasData = leaf;
            maxLocal = pBt.maxLeaf;
            minLocal = pBt.minLeaf;
        } else if (flagByte == PTF_ZERODATA) {
            intKey = false;
            hasData = false;
            maxLocal = pBt.maxLocal;
            minLocal = pBt.minLocal;
        } else {
            throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
        }
        return;
    }

    /**
     * Initialize the auxiliary information for a disk block.
     * 
     * Return SQLITE_OK on success. If we see that the page does not contain a
     * well-formed database page, then return SQLITE_CORRUPT. Note that a return
     * of SQLITE_OK does not guarantee that the page is well-formed. It only
     * shows that we failed to detect any corruption.
     */
    public void initPage() throws SqlJetException {

        assert(pBt != null);
        assert(pBt.mutex.held());
        assert(pgno == pDbPage.getPageNumber());
        assert(this == pDbPage.getExtra());
        assert(aData.array() == pDbPage.getData());

        if (!isInit) {
            int pc; /* Address of a freeblock within pPage->aData[] */
            byte hdr; /* Offset to beginning of page header */
            byte[] data; /* Equal to pPage->aData */
            int usableSize; /* Amount of usable space on each page */
            int cellOffset; /* Offset from start of page to first cell pointer */
            int nFree; /* Number of unused bytes on the page */
            int top; /* First byte of the cell content area */

            hdr = hdrOffset;
            data = aData.array();
            decodeFlags(data[hdr]);
            assert(pBt.pageSize >= 512 && pBt.pageSize <= 32768);
            maskPage = pBt.pageSize - 1;
            nOverflow = 0;
            usableSize = pBt.usableSize;
            this.cellOffset = cellOffset = hdr + 12 - 4 * (leaf ? 1 : 0);
            top = get2byte(data, hdr + 5);
            nCell = get2byte(data, hdr + 3);
            if (nCell > pBt.MX_CELL()) {
                /* To many cells for a single page. The page must be corrupt */
                throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
            }

            /* Compute the total free space on the page */
            pc = get2byte(data, hdr + 1);
            nFree = data[hdr + 7] + top - (cellOffset + 2 * nCell);
            while (pc > 0) {
                int next, size;
                if (pc > usableSize - 4) {
                    /* Free block is off the page */
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
                }
                next = get2byte(data, pc);
                size = get2byte(data, pc + 2);
                if (next > 0 && next <= pc + size + 3) {
                    /* Free blocks must be in accending order */
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
                }
                nFree += size;
                pc = next;
            }
            this.nFree = nFree;
            if (nFree >= usableSize) {
                /* Free space cannot exceed total page size */
                throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
            }

            isInit = true;
        }
    }

    /**
     * Release a MemPage. This should be called once for each prior call to
     * sqlite3BtreeGetPage.
     * 
     * @throws SqlJetException 
     */
    public static void releasePage(SqlJetMemPage pPage) throws SqlJetException{
        if (pPage != null) {
            assert(pPage.nOverflow == 0 || pPage.pDbPage.getRefCount() > 1);
            assert(pPage.aData!=null);
            assert(pPage.pBt!=null);
            assert(pPage.pDbPage.getExtra() == pPage);
            assert(pPage.pDbPage.getData() == pPage.aData.array());
            assert(pPage.pBt.mutex.held());
            pPage.pDbPage.unref();
        }
    }

    /**
     * Set the pointer-map entries for all children of page pPage. Also, if
     * pPage contains cells that point to overflow pages, set the pointer map
     * entries for the overflow pages as well.
     * @throws SqlJetException 
     */
    public void setChildPtrmaps() throws SqlJetException {
        int i; /* Counter variable */
        int nCell; /* Number of cells in page pPage */

        boolean isInitOrig = isInit;

        assert(pBt.mutex.held());
        try {
            initPage();
            nCell = this.nCell;

            for (i = 0; i < nCell; i++) {
                ByteBuffer pCell = findCell(i);

                ptrmapPutOvflPtr(pCell);

                if (!leaf) {
                    int childPgno = get4byte(pCell);
                    pBt.ptrmapPut(childPgno, SqlJetBtreeShared.PTRMAP_BTREE, pgno);
                }
            }

            if (!leaf) {
                int childPgno = get4byte(aData, hdrOffset + 8);
                pBt.ptrmapPut(childPgno, SqlJetBtreeShared.PTRMAP_BTREE, pgno);
            }
        } catch (SqlJetException e) {
            // set_child_ptrmaps_out:
            isInit = isInitOrig;
            throw e;
        }
    }

    /**
     * Somewhere on pPage, which is guarenteed to be a btree page, not an
     * overflow page, is a pointer to page iFrom. Modify this pointer so that it
     * points to iTo. Parameter eType describes the type of pointer to be
     * modified, as follows:
     * 
     * PTRMAP_BTREE: pPage is a btree-page. The pointer points at a child page
     * of pPage.
     * 
     * PTRMAP_OVERFLOW1: pPage is a btree-page. The pointer points at an
     * overflow page pointed to by one of the cells on pPage.
     * 
     * PTRMAP_OVERFLOW2: pPage is an overflow-page. The pointer points at the
     * next overflow page in the list.
     * 
     * @throws SqlJetExceptionRemove
     */
    public void modifyPagePointer(int iFrom, int iTo, byte eType) throws SqlJetException {
        assert(pBt.mutex.held());
        if (eType == SqlJetBtreeShared.PTRMAP_OVERFLOW2) {
            /* The pointer is always the first 4 bytes of the page in this case. */
            if (get4byte(aData) != iFrom) {
                throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
            }
            put4byte(aData, iTo);
        } else {
            boolean isInitOrig = this.isInit;
            int i;
            int nCell;

            initPage();
            nCell = this.nCell;

            for (i = 0; i < nCell; i++) {
                ByteBuffer pCell = findCell(i);
                if (eType == SqlJetBtreeShared.PTRMAP_OVERFLOW1) {
                    SqlJetBtreeCellInfo info;
                    info = parseCellPtr(pCell);
                    if (info.iOverflow > 0) {
                        if (iFrom == get4byte(pCell, info.iOverflow)) {
                            put4byte(pCell, info.iOverflow, iTo);
                            break;
                        }
                    }
                } else {
                    if (get4byte(pCell) == iFrom) {
                        put4byte(pCell, iTo);
                        break;
                    }
                }
            }

            if (i == nCell) {
                if (eType != SqlJetBtreeShared.PTRMAP_BTREE || get4byte(aData, hdrOffset + 8) != iFrom) {
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT_BKPT);
                }
                put4byte(aData, hdrOffset + 8, iTo);
            }

            this.isInit = isInitOrig;
        }
    }

    /**
     * Given a btree page and a cell index (0 means the first cell on the page,
     * 1 means the second cell, and so forth) return a pointer to the cell
     * content.
     * 
     * This routine works only for pages that do not contain overflow cells.
     */
    private ByteBuffer findCell(int i) {
        return slice(aData, maskPage & get2byte(aData, cellOffset + 2 * i));
    }

    /**
     * If the cell pCell, part of page pPage contains a pointer to an overflow
     * page, insert an entry into the pointer-map for the overflow page.
     * @throws SqlJetException 
     */
    private void ptrmapPutOvflPtr(ByteBuffer pCell) throws SqlJetException {
        assert(pCell != null);
        SqlJetBtreeCellInfo info = parseCellPtr(pCell);
        assert((info.nData + (intKey ? 0 : info.nKey)) == info.nPayload);
        if ((info.nData + (intKey ? 0 : info.nKey)) > info.nLocal) {
            int ovfl = get4byte(pCell, info.iOverflow);
            pBt.ptrmapPut(ovfl, SqlJetBtreeShared.PTRMAP_OVERFLOW1, pgno);
        }
    }

    /**
     * Parse a cell content block and fill in the CellInfo structure. There are
     * two versions of this function. sqlite3BtreeParseCell() takes a cell index
     * as the second argument and sqlite3BtreeParseCellPtr() takes a pointer to
     * the body of the cell as its second argument.
     * 
     * Within this file, the parseCell() macro can be called instead of
     * sqlite3BtreeParseCellPtr(). Using some compilers, this will be faster.
     * 
     * @param pCell
     *            Pointer to the cell text.
     * @return
     */
    private SqlJetBtreeCellInfo parseCellPtr(ByteBuffer pCell)  {

        int n; /* Number bytes in cell content header */
        int[] nPayload = new int[1]; /* Number of bytes of cell payload */

        assert(pBt.mutex.held());

        SqlJetBtreeCellInfo pInfo = new SqlJetBtreeCellInfo();
        pInfo.pCell = pCell;
        n = childPtrSize;
        assert(n == 4 - 4 * (leaf ? 1 : 0));
        if (intKey) {
            if (hasData) {
                n += getVarint32(slice(pCell, n), nPayload);
            } else {
                nPayload[0] = 0;
            }
            long[] pInfo_nKey = new long[1];
            n += getVarint(slice(pCell, n), pInfo_nKey);
            pInfo.nKey = pInfo_nKey[0];
            pInfo.nData = nPayload[0];
        } else {
            pInfo.nData = 0;
            n += getVarint32(slice(pCell, n), nPayload);
            pInfo.nKey = nPayload[0];
        }
        pInfo.nPayload = nPayload[0];
        pInfo.nHeader = n;
        if (nPayload[0] <= this.maxLocal) {
            /*
             * This is the (easy) common case where the entire payload fits on
             * the local page. No overflow is required.
             */
            int nSize; /* Total size of cell content in bytes */
            nSize = nPayload[0] + n;
            pInfo.nLocal = nPayload[0];
            pInfo.iOverflow = 0;
            if ((nSize & ~3) == 0) {
                nSize = 4; /* Minimum cell size is 4 */
            }
            pInfo.nSize = nSize;
        } else {
            /*
             * If the payload will not fit completely on the local page, we have
             * to decide how much to store locally and how much to spill onto
             * overflow pages. The strategy is to minimize the amount of unused
             * space on overflow pages while keeping the amount of local storage
             * in between minLocal and maxLocal.
             * 
             * Warning: changing the way overflow payload is distributed in any
             * way will result in an incompatible file format.
             */
            int minLocal; /* Minimum amount of payload held locally */
            int maxLocal; /* Maximum amount of payload held locally */
            int surplus; /* Overflow payload available for local storage */

            minLocal = this.minLocal;
            maxLocal = this.maxLocal;
            surplus = minLocal + (nPayload[0] - minLocal) % (pBt.usableSize - 4);
            if (surplus <= maxLocal) {
                pInfo.nLocal = surplus;
            } else {
                pInfo.nLocal = minLocal;
            }
            pInfo.iOverflow = pInfo.nLocal + n;
            pInfo.nSize = pInfo.iOverflow + 4;
        }

        return pInfo;

    }

    /**
     * Set up a raw page so that it looks like a database page holding no
     * entries.
     * 
     * @param sqlJetBtree TODO
     * @param flags TODO
     * @throws SqlJetException
     */
    void zeroPage(int flags) throws SqlJetException {
        byte[] data = aData.array();
        byte hdr = hdrOffset;
        int first;
    
        assert (pDbPage.getPageNumber() == pgno);
        assert (pDbPage.getExtra() == this);
        assert (pDbPage.getData() == data);
        assert (pBt.mutex.held());
    
        data[hdr] = (byte) flags;
        first = hdr + 8 + 4 * ((flags & SqlJetMemPage.PTF_LEAF) == 0 ? 1 : 0);
        SqlJetUtility.memset(data, hdr + 1, (byte) 0, 4);
        data[hdr + 7] = 0;
        SqlJetUtility.put2byte(data, hdr + 5, pBt.usableSize);
        nFree = pBt.usableSize - first;
        decodeFlags(flags);
        hdrOffset = hdr;
        cellOffset = first;
        nOverflow = 0;
        assert (pBt.pageSize >= 512 && pBt.pageSize <= 32768);
        maskPage = pBt.pageSize - 1;
        nCell = 0;
        isInit = true;
    }

}
