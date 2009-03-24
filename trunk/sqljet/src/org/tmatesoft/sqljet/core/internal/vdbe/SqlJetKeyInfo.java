/**
 * SqlJetKeyInfo.java
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

import org.tmatesoft.sqljet.core.ISqlJetCollSeq;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.ISqlJetKeyInfo;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetUpackedRecordFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetKeyInfo implements ISqlJetKeyInfo {

    /* The database connection */
    ISqlJetDb db;

    /* Text encoding - one of the TEXT_Utf* values */
    SqlJetEncoding enc;

    /* Number of entries in aColl[] */
    int nField;

    /* If defined an aSortOrder[i] is true, sort DESC */
    boolean[] aSortOrder;

    /* Collating sequence for each term of the key */
    ISqlJetCollSeq[] aColl;

    public SqlJetUnpackedRecord recordUnpack(int nKey, ByteBuffer pKey) {
        SqlJetKeyInfo pKeyInfo = this;
        int d;
        int idx;
        int u;
        int[] szHdr = new int[1];
        SqlJetVdbeMem[] pMem;

        SqlJetUnpackedRecord p = new SqlJetUnpackedRecord();

        p.flags = EnumSet.of(SqlJetUpackedRecordFlags.NEED_DESTROY);
        p.pKeyInfo = pKeyInfo;
        p.nField = pKeyInfo.nField + 1;
        p.aMem = pMem = new SqlJetVdbeMem[p.nField];
        idx = SqlJetUtility.getVarint32(pKey, szHdr);
        d = szHdr[0];
        u = 0;

        while (idx < szHdr[0] && u < p.nField) {
            int[] serial_type = new int[1];

            idx += SqlJetUtility.getVarint32(SqlJetUtility.slice(pKey, idx), serial_type);
            if (d >= nKey && SqlJetVdbeSerialType.serialTypeLen(serial_type[0]) > 0)
                break;
            pMem[u].enc = pKeyInfo.enc;
            pMem[u].db = pKeyInfo.db;
            pMem[u].flags = EnumSet.noneOf(SqlJetVdbeMemFlags.class);
            pMem[u].zMalloc = null;
            d += SqlJetVdbeSerialType.serialGet(SqlJetUtility.slice(pKey, d), serial_type[0], pMem[u]);
            u++;
        }
        assert (u <= pKeyInfo.nField + 1);
        p.nField = u;
        return p;
    }

}
