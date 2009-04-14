/**
 * ISqlJetVdbeMem.java
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
package org.tmatesoft.sqljet.core;

import java.nio.ByteBuffer;


/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetVdbeMem {

    /**
     * Release any memory held by the Mem. This may leave the Mem in an
     * inconsistent state, for example with (Mem.z==0) and
     * (Mem.type==SQLITE_TEXT).
     * 
     */
    void release();

    /**
     * This function is only available internally, it is not part of the
     * external API. It works in a similar way to sqlite3_value_text(), except
     * the data returned is in the encoding specified by the second parameter,
     * which must be one of SQLITE_UTF16BE, SQLITE_UTF16LE or SQLITE_UTF8.
     * 
     * (2006-02-16:) The enc value can be or-ed with SQLITE_UTF16_ALIGNED. If
     * that is the case, then the result must be aligned on an even byte
     * boundary.
     * 
     * @param enc
     * @return
     */
    ByteBuffer valueText(SqlJetEncoding enc);

    /**
     * Make sure pMem->z points to a writable allocation of at least n bytes.
     * 
     * If the memory cell currently contains string or blob data and the third
     * argument passed to this function is true, the current content of the cell
     * is preserved. Otherwise, it may be discarded.
     * 
     * This function sets the MEM_Dyn flag and clears any xDel callback. It also
     * clears MEM_Ephem and MEM_Static. If the preserve flag is not set, Mem.n
     * is zeroed.
     * 
     * @param n
     * @param preserve
     */
    void grow(int n, boolean preserve);

    /**
     * Move data out of a btree key or data field and into a Mem structure. The
     * data or key is taken from the entry that pCur is currently pointing to.
     * offset and amt determine what portion of the data or key to retrieve. key
     * is true to get the key or false to get data. The result is written into
     * the pMem element.
     * 
     * The pMem structure is assumed to be uninitialized. Any prior content is
     * overwritten without being freed.
     * 
     * If this routine fails for any reason (malloc returns NULL or unable to
     * read from the disk) then the pMem is left in an inconsistent state.
     * 
     * @param pCur
     * @param offset
     *            Offset from the start of data to return bytes from.
     * @param amt
     *            Number of bytes to return.
     * @param key
     *            If true, retrieve from the btree key, not data.
     * @return
     * @throws SqlJetException
     */
    void fromBtree(ISqlJetBtreeCursor pCur, int offset, int amt, boolean key) throws SqlJetException;

    /**
     * Make the given Mem object MEM_Dyn. In other words, make it so that any
     * TEXT or BLOB content is stored in memory obtained from malloc(). In this
     * way, we know that the memory is safe to be overwritten or altered.
     */
    void makeWriteable();

    /**
     * Return some kind of integer value which is the best we can do
     * at representing the value that *pMem describes as an integer.
     * If pMem is an integer, then the value is exact.  If pMem is
     * a floating-point then the value returned is the integer part.
     * If pMem is a string or blob, then we make an attempt to convert
     * it into a integer and return that.  If pMem is NULL, return 0.
     *
     * If pMem is a string, its encoding might be changed.
     */
     long intValue();
    
     void setNull();
     
     void setStr( ByteBuffer z, SqlJetEncoding enc ) throws SqlJetException;

     
}