/**
 * SqlJetMem.java
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
package org.tmatesoft.sqljet.core.internal.vdbe;

import static org.tmatesoft.sqljet.core.internal.SqlJetUtility.*;

import java.nio.ByteBuffer;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetCallback;
import org.tmatesoft.sqljet.core.ISqlJetCollSeq;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetFuncDef;
import org.tmatesoft.sqljet.core.ISqlJetRowSet;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetMemType;
import org.tmatesoft.sqljet.core.internal.SqlJetCloneable;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * Internally, the vdbe manipulates nearly all SQL values as Mem structures.
 * Each Mem struct may cache multiple representations (string, integer etc.) of
 * the same value. A value (and therefore Mem structure) has the following
 * properties:
 * 
 * Each value has a manifest type. The manifest type of the value stored in a
 * Mem struct is returned by the MemType(Mem*) macro. The type is one of
 * SQLITE_NULL, SQLITE_INTEGER, SQLITE_REAL, SQLITE_TEXT or SQLITE_BLOB.
 * 
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetVdbeMem extends SqlJetCloneable {

    // union {
    
    /** Integer value. */
    long i;
    
    /** Used when bit MEM_Zero is set in flags */
    int nZero;
    
    /** Used only when flags==MEM_Agg */
    ISqlJetFuncDef pDef;
    
    /** Used only when flags==MEM_RowSet */
    ISqlJetRowSet pRowSet;
    
    // } u;

    /** Real value */
    double r;
    
    /** The associated database connection */
    ISqlJetDb db; 
    
    /** String or BLOB value */
    ByteBuffer z; 
    
    /** Number of characters in string value, excluding '\0' */
    int n; 
    
    /** Some combination of MEM_Null, MEM_Str, MEM_Dyn, etc. */
    EnumSet<SqlJetVdbeMemFlags> flags;
    
    /** One of SQLITE_NULL, SQLITE_TEXT, SQLITE_INTEGER, etc */
    SqlJetMemType type;
    
    /** SQLITE_UTF8, SQLITE_UTF16BE, SQLITE_UTF16LE */
    SqlJetEncoding enc; 
    
    /** If not null, call this function to delete Mem.z */
    ISqlJetCallback xDel; 
    
    /** Dynamic buffer allocated by sqlite3_malloc() */
    ByteBuffer zMalloc; 

    /**
     * Release any memory held by the Mem. This may leave the Mem in an
     * inconsistent state, for example with (Mem.z==0) and
     * (Mem.type==SQLITE_TEXT).
     * 
     */
    public void release() {
        releaseExternal();
        // sqlite3DbFree(p->db, p->zMalloc);
        z = null;
        zMalloc = null;
        xDel = null;
    }

    /**
     * If the memory cell contains a string value that must be freed by invoking
     * an external callback, free it now. Calling this function does not free
     * any Mem.zMalloc buffer.
     * 
     */
    private void releaseExternal() {

    }

    /*
     * Compare the values contained by the two memory cells, returning negative,
     * zero or positive if pMem1 is less than, equal to, or greater than pMem2.
     * Sorting order is NULL's first, followed by numbers (integers and reals)
     * sorted numerically, followed by text ordered by the collating sequence
     * pColl and finally blob's ordered by memcmp().Two NULL values are
     * considered equal by this function.
     */
    public static int compare(SqlJetVdbeMem pMem1, SqlJetVdbeMem pMem2, ISqlJetCollSeq pColl) throws SqlJetException {

        int rc;

        /*
         * Interchange pMem1 and pMem2 if the collating sequence specifies* DESC
         * order.
         */
        EnumSet<SqlJetVdbeMemFlags> f1 = pMem1.flags;
        EnumSet<SqlJetVdbeMemFlags> f2 = pMem2.flags;
        EnumSet<SqlJetVdbeMemFlags> combined_flags = EnumSet.copyOf(f1);
        combined_flags.addAll(f2);
        assert (!combined_flags.contains(SqlJetVdbeMemFlags.RowSet));

        /*
         * If one value is NULL, it is less than the other. If both values* are
         * NULL, return 0.
         */
        if (combined_flags.contains(SqlJetVdbeMemFlags.Null)) {
            return (f2.contains(SqlJetVdbeMemFlags.Null) ? 1 : 0) - (f1.contains(SqlJetVdbeMemFlags.Null) ? 1 : 0);
        }

        /*
         * If one value is a number and the other is not, the number is less.*
         * If both are numbers, compare as reals if one is a real, or as
         * integers* if both values are integers.
         */
        if (combined_flags.contains(SqlJetVdbeMemFlags.Int) || combined_flags.contains(SqlJetVdbeMemFlags.Real)) {
            if (!(f1.contains(SqlJetVdbeMemFlags.Int) || f1.contains(SqlJetVdbeMemFlags.Real))) {
                return 1;
            }
            if (!(f2.contains(SqlJetVdbeMemFlags.Int) || f2.contains(SqlJetVdbeMemFlags.Real))) {
                return -1;
            }
            if (!f1.contains(SqlJetVdbeMemFlags.Int) && !f2.contains(SqlJetVdbeMemFlags.Int)) {
                double r1, r2;
                if (!f1.contains(SqlJetVdbeMemFlags.Real)) {
                    r1 = (double) pMem1.i;
                } else {
                    r1 = pMem1.r;
                }
                if (!f2.contains(SqlJetVdbeMemFlags.Real)) {
                    r2 = (double) pMem2.i;
                } else {
                    r2 = pMem2.r;
                }
                if (r1 < r2)
                    return -1;
                if (r1 > r2)
                    return 1;
                return 0;
            } else {
                assert (f1.contains(SqlJetVdbeMemFlags.Int));
                assert (f2.contains(SqlJetVdbeMemFlags.Int));
                if (pMem1.i < pMem2.i)
                    return -1;
                if (pMem1.i > pMem2.i)
                    return 1;
                return 0;
            }
        }

        /*
         * If one value is a string and the other is a blob, the string is less.
         * * If both are strings, compare using the collating functions.
         */
        if (combined_flags.contains(SqlJetVdbeMemFlags.Str)) {
            if (!f1.contains(SqlJetVdbeMemFlags.Str)) {
                return 1;
            }
            if (!f2.contains(SqlJetVdbeMemFlags.Str)) {
                return -1;
            }

            assert (pMem1.enc == pMem2.enc);
            assert (pMem1.enc == SqlJetEncoding.UTF8 || pMem1.enc == SqlJetEncoding.UTF16LE || pMem1.enc == SqlJetEncoding.UTF16BE);

            /*
             * The collation sequence must be defined at this point, even if*
             * the user deletes the collation sequence after the vdbe program is
             * * compiled (this was not always the case).
             */
            if (pColl != null) {
                if (pMem1.enc == pColl.getEnc()) {
                    /*
                     * The strings are already in the correct encoding. Call the
                     * * comparison function directly
                     */
                    return pColl.cmp(pColl.getUserData(), pMem1.n, pMem1.z, pMem2.n, pMem2.z);
                } else {

                    // TODO
                    
                    ByteBuffer v1, v2;
                    int n1, n2;
                      
                    SqlJetVdbeMem c1 = pMem1.shallowCopy( SqlJetVdbeMemFlags.Ephem );
                    SqlJetVdbeMem c2 = pMem2.shallowCopy( SqlJetVdbeMemFlags.Ephem );
                    v1 = c1.valueText( pColl.getEnc() );
                    n1 = v1==null ? 0 : c1.n;
                    v2 = c2.valueText( pColl.getEnc() );
                    n2 = v2==null ? 0 : c2.n;
                    c1.release();
                    c2.release();
                    return pColl.cmp( pColl.getUserData(), n1, v1, n2, v2 );

                }
            }
            /*
             * If a NULL pointer was passed as the collate function, fall
             * through to the blob case and use memcmp().
             */
        }

        /* Both values must be blobs. Compare using memcmp(). */
        rc = SqlJetUtility.memcmp(pMem1.z, pMem2.z, (pMem1.n > pMem2.n) ? pMem2.n : pMem1.n);
        if (rc == 0) {
            rc = pMem1.n - pMem2.n;
        }
        return rc;
    }

    /**
     ** Make an shallow copy.  The pFrom->z field is not duplicated.  If
     ** pFrom->z is used, then pTo->z points to the same thing as pFrom->z
     ** and flags gets srcType (either MEM_Ephem or MEM_Static).
     * 
     * @param srcType
     * 
     * @throws SqlJetException 
     */
    private SqlJetVdbeMem shallowCopy(SqlJetVdbeMemFlags srcType) throws SqlJetException {
        final SqlJetVdbeMem pFrom = this;
        assert( !pFrom.flags.contains(SqlJetVdbeMemFlags.RowSet) );
        final SqlJetVdbeMem pTo = memcpy(pFrom);
        if( pFrom.flags.contains(SqlJetVdbeMemFlags.Dyn) || pFrom.z==pFrom.zMalloc ){
          pTo.flags.removeAll( EnumSet.of(SqlJetVdbeMemFlags.Dyn, 
                  SqlJetVdbeMemFlags.Static, SqlJetVdbeMemFlags.Ephem));
          assert( srcType==SqlJetVdbeMemFlags.Ephem || srcType==SqlJetVdbeMemFlags.Static );
          pTo.flags.add(srcType);
        }
        return pTo;
    }
    
    /**
     * This function is only available internally, it is not part of the
     * external API. It works in a similar way to sqlite3_value_text(),
     * except the data returned is in the encoding specified by the second
     * parameter, which must be one of SQLITE_UTF16BE, SQLITE_UTF16LE or
     * SQLITE_UTF8.
     *
     * (2006-02-16:)  The enc value can be or-ed with SQLITE_UTF16_ALIGNED.
     * If that is the case, then the result must be aligned on an even byte
     * boundary.
     * 
     * @param enc
     * @return
     */
    private ByteBuffer valueText(SqlJetEncoding enc) {
        //if( !pVal ) return 0;
        
        final SqlJetVdbeMem pVal = this;

        assert( pVal.db==null || mutex_held(pVal.db.getMutex()) );
        //assert( (enc&3)==(enc&~SQLITE_UTF16_ALIGNED) );
        assert( !pVal.flags.contains(SqlJetVdbeMemFlags.RowSet) );

        if( pVal.flags.contains(SqlJetVdbeMemFlags.Null) ){
          return null;
        }
        //assert( (MEM_Blob>>3) == MEM_Str );
        //pVal.flags |= (pVal.flags & MEM_Blob)>>3;
        if(pVal.flags.contains(SqlJetVdbeMemFlags.Blob))
        {
            pVal.flags.add(SqlJetVdbeMemFlags.Str);
        }
        pVal.expandBlob();
        if( pVal.flags.contains(SqlJetVdbeMemFlags.Str) ){
          pVal.changeEncoding(enc);
        /*
          if( (enc & SQLITE_UTF16_ALIGNED)!=0 && 1==(1&SQLITE_PTR_TO_INT(pVal->z)) ){
            assert( (pVal->flags & (MEM_Ephem|MEM_Static))!=0 );
            if( sqlite3VdbeMemMakeWriteable(pVal)!=SQLITE_OK ){
              return 0;
            }
          }
        */
          pVal.nulTerminate();
        }else{
          assert( !pVal.flags.contains(SqlJetVdbeMemFlags.Blob) );
          pVal.stringify(enc);
          //assert( 0==(1&SQLITE_PTR_TO_INT(pVal->z)) );
        }
        /*assert(pVal->enc==(enc & ~SQLITE_UTF16_ALIGNED) || pVal->db==0
                    || pVal->db->mallocFailed );
        if( pVal->enc==(enc & ~SQLITE_UTF16_ALIGNED) ){
          return pVal->z;
        }else{
          return 0;
        }*/
        return pVal.z;
    }

    /**
     * Add MEM_Str to the set of representations for the given Mem.  Numbers
     * are converted using sqlite3_snprintf().  Converting a BLOB to a string
     * is a no-op.
     *
     * Existing representations MEM_Int and MEM_Real are *not* invalidated.
     *
     * A MEM_Null value will never be passed to this function. This function is
     * used for converting values to text for returning to the user (i.e. via
     * sqlite3_value_text()), or for ensuring that values to be used as btree
     * keys are strings. In the former case a NULL pointer is returned the
     * user and the later is an internal programming error.
     * 
     * @param enc2
     */
    private void stringify(SqlJetEncoding enc2) {
        
        final SqlJetVdbeMem pMem = this;

        final EnumSet<SqlJetVdbeMemFlags> fg = pMem.flags;
        final int nByte = 32;

        assert( pMem.db==null || mutex_held(pMem.db.getMutex()) );
        assert( !fg.contains(SqlJetVdbeMemFlags.Zero) );
        assert( !(fg.contains(SqlJetVdbeMemFlags.Str) || fg.contains(SqlJetVdbeMemFlags.Blob)) );
        assert( fg.contains(SqlJetVdbeMemFlags.Int) || fg.contains(SqlJetVdbeMemFlags.Real) );
        assert( !pMem.flags.contains(SqlJetVdbeMemFlags.RowSet) );


        pMem.grow(nByte, false);

        /* For a Real or Integer, use sqlite3_mprintf() to produce the UTF-8
        ** string representation of the value. Then, if the required encoding
        ** is UTF-16le or UTF-16be do a translation.
        ** 
        ** FIX ME: It would be better if sqlite3_snprintf() could do UTF-16.
        */
        if( fg.contains(SqlJetVdbeMemFlags.Int) ){
          //sqlite3_snprintf(nByte, pMem->z, "%lld", pMem->u.i);
          pMem.z.put( Long.toString(pMem.i).getBytes() );
        }else{
          assert( fg.contains(SqlJetVdbeMemFlags.Real) );
          //sqlite3_snprintf(nByte, pMem->z, "%!.15g", pMem->r);
          pMem.z.put( Double.toString(pMem.r).getBytes() );
        }
        pMem.n = strlen30(pMem.z);
        pMem.enc = SqlJetEncoding.UTF8;
        pMem.flags.addAll( EnumSet.of(SqlJetVdbeMemFlags.Str,SqlJetVdbeMemFlags.Term) );
        pMem.changeEncoding(enc);
    }

    /**
     * Make sure pMem->z points to a writable allocation of at least 
     * n bytes.
     *
     * If the memory cell currently contains string or blob data
     * and the third argument passed to this function is true, the 
     * current content of the cell is preserved. Otherwise, it may
     * be discarded.  
     *
     * This function sets the MEM_Dyn flag and clears any xDel callback.
     * It also clears MEM_Ephem and MEM_Static. If the preserve flag is 
     * not set, Mem.n is zeroed.
     * 
     * @param n
     * @param preserve
     */
    private void grow(int n, boolean preserve) {
        
        final SqlJetVdbeMem pMem = this;
        
        assert( 1 >=
            ((pMem.zMalloc!=null && pMem.zMalloc==pMem.z) ? 1 : 0) +
            ((pMem.flags.contains(SqlJetVdbeMemFlags.Dyn)&&pMem.xDel!=null) ? 1 : 0) + 
            (pMem.flags.contains(SqlJetVdbeMemFlags.Ephem) ? 1 : 0) + 
            (pMem.flags.contains(SqlJetVdbeMemFlags.Static) ? 1 : 0)
          );
        assert(!pMem.flags.contains(SqlJetVdbeMemFlags.RowSet));

          if( n<32 ) n = 32;
          /*
          if( sqlite3DbMallocSize(pMem->db, pMem->zMalloc)<n ){
            if( preserve && pMem->z==pMem->zMalloc ){
              pMem->z = pMem->zMalloc = sqlite3DbReallocOrFree(pMem->db, pMem->z, n);
              preserve = 0;
            }else{
              sqlite3DbFree(pMem->db, pMem->zMalloc);
              pMem->zMalloc = sqlite3DbMallocRaw(pMem->db, n);
            }
          }*/
          
          pMem.zMalloc = ByteBuffer.allocate(n);

          if( preserve && pMem.z!=null ){
            memcpy(pMem.zMalloc, pMem.z, pMem.n);
          }
          if( pMem.flags.contains(SqlJetVdbeMemFlags.Dyn) && pMem.xDel!=null ){
            pMem.xDel.call(pMem.z);
          }
          pMem.z = pMem.zMalloc;
          if( pMem.z==null ){ // WTF? /sergey/
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Null);
          }else{
            pMem.flags.removeAll(EnumSet.of(SqlJetVdbeMemFlags.Ephem,SqlJetVdbeMemFlags.Static));
          }
          pMem.xDel = null;
    }

    /**
     * Make sure the given Mem is nul terminated.
     * 
     */
    private void nulTerminate() {
        final SqlJetVdbeMem pMem = this;
        assert( pMem.db==null || mutex_held(pMem.db.getMutex()) );
        if( pMem.flags.contains(SqlJetVdbeMemFlags.Term) || 
                !pMem.flags.contains(SqlJetVdbeMemFlags.Str) ){
          return;   /* Nothing to do */
        }
        pMem.grow(pMem.n+2, true);
        SqlJetUtility.putUnsignedByte(pMem.z, pMem.n, (byte)0);
        SqlJetUtility.putUnsignedByte(pMem.z, pMem.n+1, (byte)0);
        pMem.flags.add(SqlJetVdbeMemFlags.Term);
    }

    /**
     * If pMem is an object with a valid string representation, this routine
     * ensures the internal encoding for the string representation is
     * 'desiredEnc', one of SQLITE_UTF8, SQLITE_UTF16LE or SQLITE_UTF16BE.
     *
     * If pMem is not a string object, or the encoding of the string
     * representation is already stored using the requested encoding, then this
     * routine is a no-op.
     *
     * SQLITE_OK is returned if the conversion is successful (or not required).
     * SQLITE_NOMEM may be returned if a malloc() fails during conversion
     * between formats.
     * 
     * @param enc
     */
    private void changeEncoding(SqlJetEncoding desiredEnc) {
        final SqlJetVdbeMem pMem = this;        
        assert( !pMem.flags.contains(SqlJetVdbeMemFlags.RowSet) );
        assert( desiredEnc==SqlJetEncoding.UTF8 || desiredEnc==SqlJetEncoding.UTF16LE
                 || desiredEnc==SqlJetEncoding.UTF16BE );
        if( !pMem.flags.contains(SqlJetVdbeMemFlags.Str) || pMem.enc==desiredEnc ){
          return;
        }
        assert( pMem.db==null || mutex_held(pMem.db.getMutex()) );

        /* MemTranslate() may return SQLITE_OK or SQLITE_NOMEM. If NOMEM is returned,
        ** then the encoding of the value may not have changed.
        */
        pMem.translate(desiredEnc);
    }

    /**
     * @param desiredEnc
     */
    private void translate(SqlJetEncoding desiredEnc) {
        // TODO Auto-generated method stub
        
    }

    /**
     * If the given Mem* has a zero-filled tail, turn it into an ordinary
     * blob stored in dynamically allocated space.
     * 
     */
    private void expandBlob() {
        final SqlJetVdbeMem pMem = this;        
        if( pMem.flags.contains(SqlJetVdbeMemFlags.Zero) ){
            int nByte;
            assert( pMem.flags.contains(SqlJetVdbeMemFlags.Blob) );
            assert( !pMem.flags.contains(SqlJetVdbeMemFlags.RowSet));
            assert( pMem.db==null || mutex_held(pMem.db.getMutex()) );

            /* Set nByte to the number of bytes required to store the expanded blob. */
            nByte = pMem.n + pMem.nZero;
            if( nByte<=0 ){
              nByte = 1;
            }
            pMem.grow(nByte, true);
            memset( slice(pMem.z,pMem.n), (byte)0, pMem.nZero);
            pMem.n += pMem.nZero;
            pMem.flags.removeAll(EnumSet.of(SqlJetVdbeMemFlags.Zero,SqlJetVdbeMemFlags.Term));
          }
    }
    
}
