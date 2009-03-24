/**
 * SqlJetSerialType.java
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

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetVdbeSerialType {

    private static final byte aSize[] = { 0, 1, 2, 3, 4, 6, 8, 8, 0, 0, 0, 0 };

    /**
     ** Return the length of the data corresponding to the supplied serial-type.
     */
    public static int serialTypeLen(int serial_type) {
        if (serial_type >= 12) {
            return (serial_type - 12) / 2;
        } else {
            return aSize[serial_type];
        }
    }

    /**
     * Deserialize the data blob pointed to by buf as serial type serial_type
     * and store the result in pMem. Return the number of bytes read.
     * 
     * @param buf
     *            Buffer to deserialize from
     * @param serial_type
     *            Serial type to deserialize
     * @param pMem
     *            Memory cell to write value into
     * @return
     */
    public static int serialGet(ByteBuffer buf, int serial_type, SqlJetVdbeMem pMem) {
        switch (serial_type) {
        case 10: /* Reserved for future use */
        case 11: /* Reserved for future use */
        case 0: { /* NULL */
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Null);
            break;
        }
        case 1: { /* 1-byte signed integer */
            pMem.i = buf.get(0);
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 1;
        }
        case 2: { /* 2-byte signed integer */
            pMem.i = (buf.get(0) << 8) | buf.get(1);
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 2;
        }
        case 3: { /* 3-byte signed integer */
            pMem.i = (buf.get(0) << 16) | (buf.get(1) << 8) | buf.get(2);
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 3;
        }
        case 4: { /* 4-byte signed integer */
            pMem.i = (buf.get(0) << 24) | (buf.get(1) << 16) | (buf.get(2) << 8) | buf.get(3);
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 4;
        }
        case 5: { /* 6-byte signed integer */
            long x = (buf.get(0) << 8) | buf.get(1);
            int y = (buf.get(2) << 24) | (buf.get(3) << 16) | (buf.get(4) << 8) | buf.get(5);
            x = (x << 32) | y;
            pMem.i = x;
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 6;
        }
        case 6: /* 8-byte signed integer */
        case 7: { /* IEEE floating point */
            long x;
            int y;
            x = (buf.get(0) << 24) | (buf.get(1) << 16) | (buf.get(2) << 8) | buf.get(3);
            y = (buf.get(4) << 24) | (buf.get(5) << 16) | (buf.get(6) << 8) | buf.get(7);
            x = (x << 32) | y;
            if (serial_type == 6) {
                pMem.i = x;
                pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            } else {
                // assert( sizeof(x)==8 && sizeof(pMem->r)==8 );
                // swapMixedEndianFloat(x);
                // memcpy(&pMem->r, &x, sizeof(x));
                pMem.r = ByteBuffer.allocate(8).putLong(x).getDouble();
                pMem.flags = EnumSet.of(pMem.r == Double.NaN ? SqlJetVdbeMemFlags.Null : SqlJetVdbeMemFlags.Real);
            }
            return 8;
        }
        case 8: /* Integer 0 */
        case 9: { /* Integer 1 */
            pMem.i = serial_type - 8;
            pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Int);
            return 0;
        }
        default: {
            int len = (serial_type - 12) / 2;
            pMem.z = buf;
            pMem.n = len;
            pMem.xDel = null;
            if ((serial_type & 0x01) != 0) {
                pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Str, SqlJetVdbeMemFlags.Ephem);
            } else {
                pMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Blob, SqlJetVdbeMemFlags.Ephem);
            }
            return len;
        }
        }
        return 0;
    }

}
