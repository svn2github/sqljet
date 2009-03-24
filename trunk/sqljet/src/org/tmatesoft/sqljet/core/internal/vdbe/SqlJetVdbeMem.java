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

import java.nio.ByteBuffer;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetCallback;
import org.tmatesoft.sqljet.core.ISqlJetCollSeq;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetFuncDef;
import org.tmatesoft.sqljet.core.ISqlJetRowSet;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetMemType;
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
public class SqlJetVdbeMem {

    // union {
    long i; /* Integer value. */
    int nZero; /* Used when bit MEM_Zero is set in flags */
    ISqlJetFuncDef pDef; /* Used only when flags==MEM_Agg */
    ISqlJetRowSet pRowSet; /* Used only when flags==MEM_RowSet */
    // } u;

    double r; /* Real value */
    ISqlJetDb db; /* The associated database connection */
    ByteBuffer z; /* String or BLOB value */
    int n; /* Number of characters in string value, excluding '\0' */
    EnumSet<SqlJetVdbeMemFlags> flags; /*
                                        * Some combination of MEM_Null, MEM_Str,
                                        * MEM_Dyn, etc.
                                        */
    SqlJetMemType type; /* One of SQLITE_NULL, SQLITE_TEXT, SQLITE_INTEGER, etc */
    SqlJetEncoding enc; /* SQLITE_UTF8, SQLITE_UTF16BE, SQLITE_UTF16LE */
    ISqlJetCallback xDel; /* If not null, call this function to delete Mem.z */
    byte[] zMalloc; /* Dynamic buffer allocated by sqlite3_malloc() */

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
     * * Compare the values contained by the two memory cells, returning*
     * negative, zero or positive if pMem1 is less than, equal to, or greater*
     * than pMem2. Sorting order is NULL's first, followed by numbers (integers*
     * and reals) sorted numerically, followed by text ordered by the collating*
     * sequence pColl and finally blob's ordered by memcmp().** Two NULL values
     * are considered equal by this function.
     */
    public static int compare(SqlJetVdbeMem pMem1, SqlJetVdbeMem pMem2, ISqlJetCollSeq pColl) {

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

                    /*
                     * const void *v1, *v2; int n1, n2; Mem c1; Mem c2;
                     * memset(&c1, 0, sizeof(c1)); memset(&c2, 0, sizeof(c2));
                     * sqlite3VdbeMemShallowCopy(&c1, pMem1, MEM_Ephem);
                     * sqlite3VdbeMemShallowCopy(&c2, pMem2, MEM_Ephem); v1 =
                     * sqlite3ValueText((sqlite3_value*)&c1, pColl->enc); n1 =
                     * v1==0 ? 0 : c1.n; v2 =
                     * sqlite3ValueText((sqlite3_value*)&c2, pColl->enc); n2 =
                     * v2==0 ? 0 : c2.n; rc = pColl->xCmp(pColl->pUser, n1, v1,
                     * n2, v2); sqlite3VdbeMemRelease(&c1);
                     * sqlite3VdbeMemRelease(&c2); return rc;
                     */
                    return pColl.cmp(pColl.getUserData(), pMem1.n, pMem1.z, pMem2.n, pMem2.z);

                }
            }
            /*
             * If a NULL pointer was passed as the collate function, fall
             * through* to the blob case and use memcmp().
             */
        }

        /* Both values must be blobs. Compare using memcmp(). */
        rc = SqlJetUtility.memcmp(pMem1.z, pMem2.z, (pMem1.n > pMem2.n) ? pMem2.n : pMem1.n);
        if (rc == 0) {
            rc = pMem1.n - pMem2.n;
        }
        return rc;
    }
}
