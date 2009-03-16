/**
 * SqlJetUtility.java
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
import java.util.Arrays;
import java.util.BitSet;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetUtility {

    public static int getIntSysProp(final String propName, final int defValue) throws SqlJetError {
        if (null == propName)
            throw new SqlJetError("Undefined property name");
        try {
            return Integer.valueOf(System.getProperty(propName, Integer.toString(defValue)));
        } catch (Throwable t) {
            throw new SqlJetError("Error while get int value for property " + propName, t);
        }
    }

    /**
     * @param string
     * @param b
     * @return
     */
    public static boolean getBoolSysProp(String propName, boolean defValue) {
        if (null == propName)
            throw new SqlJetError("Undefined property name");
        try {
            return Boolean.valueOf(System.getProperty(propName, Boolean.toString(defValue)));
        } catch (Throwable t) {
            throw new SqlJetError("Error while get int value for property " + propName, t);
        }
    }

    /**
     * @param <T>
     * @param propName
     * @param defValue
     * @return
     */
    public static <T extends Enum<T>> T getEnumSysProp(String propName, T defValue) {
        if (null == propName)
            throw new SqlJetError("Undefined property name");
        if (null == defValue)
            throw new SqlJetError("Undefined default value");
        try {
            return defValue.valueOf(defValue.getDeclaringClass(), System.getProperty(propName, defValue.toString()));
        } catch (Throwable t) {
            throw new SqlJetError("Error while get int value for property " + propName, t);
        }
    }

    /**
     * Read a two-byte big-endian integer values.
     */
    public static int get2byte(byte[] x, int off) {
        return x[off] << 8 | x[off + 1];
    }

    /**
     * Write a two-byte big-endian integer values.
     */
    public static void put2byte(byte[] p, int off, int v) {
        p[off] = (byte) (v >> 8);
        p[off + 1] = (byte) (v);
    }

    /**
     * Read a two-byte big-endian integer values.
     */
    public static int get2byte(ByteBuffer x, int off) {
        return x.get(off) << 8 | x.get(off + 1);
    }

    /**
     * Write a two-byte big-endian integer values.
     */
    public static void put2byte(ByteBuffer p, int off, int v) {
        p.put(off, (byte) (v >> 8));
        p.put(off + 1, (byte) (v));
    }

    /**
     * Read a four-byte big-endian integer value.
     */
    public static int get4byte(byte[] p) {
        return ByteBuffer.wrap(p).getInt();
    }

    /**
     * Read a four-byte big-endian integer value.
     */
    public static int get4byte(byte[] p, int pos) {
        return ByteBuffer.wrap(p).getInt(pos);
    }

    /**
     * Write a four-byte big-endian integer value.
     */
    public static byte[] put4byte(int v) {
        return ByteBuffer.wrap(new byte[4]).putInt(0, v).array();
    }

    /**
     * Write a four-byte big-endian integer value.
     */
    public static void put4byte(byte[] p, int pos, int v) {
        if (null == p || (p.length - pos) < 4)
            throw new SqlJetError("Wrong destination");
        ByteBuffer.wrap(p).putInt(pos, v);
    }

    /**
     * Read a four-byte big-endian integer value.
     */
    public static int get4byte(ByteBuffer p) {
        return p.getInt();
    }

    /**
     * Read a four-byte big-endian integer value.
     */
    public static int get4byte(ByteBuffer p, int pos) {
        return p.getInt(pos);
    }

    /**
     * Write a four-byte big-endian integer value.
     */
    public static void put4byte(ByteBuffer p, int pos, int v) {
        if (null == p || (p.capacity() - pos) < 4)
            throw new SqlJetError("Wrong destination");
        p.putInt(pos, v);
    }

    /**
     * Write a four-byte big-endian integer value.
     */
    public static void put4byte(ByteBuffer p, int v) {
        if (null == p || p.capacity() < 4)
            throw new SqlJetError("Wrong destination");
        p.putInt(v);
    }

    /**
     * @param dest
     * @param src
     * @param length
     */
    public static void memcpy(byte[] dest, byte[] src, int length) {
        System.arraycopy(src, 0, dest, 0, length);
    }

    public static void memcpy(byte[] dest, int dstPos, byte[] src, int srcPos, int length) {
        System.arraycopy(src, srcPos, dest, dstPos, length);
    }

    public static void memcpy(Object[] dest, Object[] src, int length) {
        System.arraycopy(src, 0, dest, 0, length);
    }

    public static void memcpy(ByteBuffer dest, ByteBuffer src, int length) {
        System.arraycopy(src.array(), 0, dest.array(), 0, length);
    }

    public static void memcpy(ByteBuffer dest, int dstPos, ByteBuffer src, int srcPos, int length) {
        System.arraycopy(src.array(), srcPos, dest.array(), dstPos, length);
    }

    /**
     * @param data
     * @param value
     * @param count
     */
    public static void memset(byte[] data, byte value, int count) {
        Arrays.fill(data, 0, count, value);
    }

    /**
     * @param data
     * @param value
     */
    public static void memset(byte[] data, byte value) {
        memset(data, value, data.length);
    }

    /**
     * @param data
     * @param value
     * @param count
     */
    public static void memset(byte[] data, int from, byte value, int count) {
        Arrays.fill(data, from, count, value);
    }

    /**
     * @param s
     * @param from
     * @return
     */
    public static int strlen(byte[] s, int from) {
        int p = from;
        /* Loop over the data in s. */
        while (p < s.length && s[p] != 0)
            p++;
        return (p - from);
    }

    /**
     * Check to see if the i-th bit is set. Return true or false. If p is NULL
     * (if the bitmap has not been created) or if i is out of range, then return
     * false.
     * 
     * @param bitSet
     * @param index
     * @return
     */
    public static boolean bitSetTest(BitSet bitSet, int index) {
        if (bitSet == null)
            return false;
        if (index < 0)
            return false;
        return bitSet.get(index);
    }

    /**
     * @param magic
     * @param journalMagic
     * @param i
     * @return
     */
    public static int memcmp(byte[] a1, byte[] a2, int count) {
        for (int i = 0; i < count; i++) {
            final Byte b1 = Byte.valueOf(a1[i]);
            final Byte b2 = Byte.valueOf(a2[i]);
            final int c = b1.compareTo(b2);
            if (0 != c)
                return c;
        }
        return 0;
    }

    public static int memcmp(byte[] a1, int from1, byte[] a2, int from2, int count) {
        for (int i = 0; i < count; i++) {
            final Byte b1 = Byte.valueOf(a1[from1 + i]);
            final Byte b2 = Byte.valueOf(a2[from2 + i]);
            final int c = b1.compareTo(b2);
            if (0 != c)
                return c;
        }
        return 0;
    }

    /**
     * @param sqliteFileHeader
     * @return
     */
    public static byte[] getBytes(String string) {
        if (null == string)
            throw new SqlJetError("Undefined string");
        try {
            return string.getBytes("US-ASCII");
        } catch (Throwable t) {
            throw new SqlJetError("Error while get bytes for string \"" + string + "\"", t);
        }
    }

    public static ByteBuffer slice(ByteBuffer b, int pos) {
        synchronized (b) {
            try {
                b.position(pos);
                return b.slice();
            } finally {
                b.reset();
            }
        }
    }

    /**
     * The variable-length integer encoding is as follows:
     * 
     * KEY: A = 0xxxxxxx 7 bits of data and one flag bit B = 1xxxxxxx 7 bits of
     * data and one flag bit C = xxxxxxxx 8 bits of data
     * 
     * 7 bits - A 14 bits - BA 21 bits - BBA 28 bits - BBBA 35 bits - BBBBA 42
     * bits - BBBBBA 49 bits - BBBBBBA 56 bits - BBBBBBBA 64 bits - BBBBBBBBC
     */

    /**
     * Write a 64-bit variable-length integer to memory starting at p[0]. The
     * length of data write will be between 1 and 9 bytes. The number of bytes
     * written is returned.
     * 
     * A variable-length integer consists of the lower 7 bits of each byte for
     * all bytes that have the 8th bit set and one byte with the 8th bit clear.
     * Except, if we get to the 9th byte, it stores the full 8 bits and is the
     * last byte.
     */
    public static int putVarint(ByteBuffer p, long v) {
        int i, j, n;
        byte[] buf = new byte[10];
        if ((v & (((long) 0xff000000) << 32)) != 0) {
            p.put(8, (byte) v);
            v >>= 8;
            for (i = 7; i >= 0; i--) {
                p.put(i, (byte) ((v & 0x7f) | 0x80));
                v >>= 7;
            }
            return 9;
        }
        n = 0;
        do {
            buf[n++] = (byte) ((v & 0x7f) | 0x80);
            v >>= 7;
        } while (v != 0);
        buf[0] &= 0x7f;
        assert (n <= 9);
        for (i = 0, j = n - 1; j >= 0; j--, i++) {
            p.put(i, buf[j]);
        }
        return n;
    }

    /**
     * This routine is a faster version of sqlite3PutVarint() that only works
     * for 32-bit positive integers and which is optimized for the common case
     * of small integers. A MACRO version, putVarint32, is provided which
     * inlines the single-byte case. All code should use the MACRO version as
     * this function assumes the single-byte case has already been handled.
     */
    public static int putVarint32(ByteBuffer p, int v) {
        if ((v & ~0x7f) == 0) {
            p.put(0, (byte) v);
            return 1;
        }
        if ((v & ~0x3fff) == 0) {
            p.put(0, (byte) ((v >> 7) | 0x80));
            p.put(1, (byte) (v & 0x7f));
            return 2;
        }
        return putVarint(p, v);
    }

    /**
     * Read a 64-bit variable-length integer from memory starting at p[0].
     * Return the number of bytes read. The value is stored in *v.
     */
    public static byte getVarint(ByteBuffer p, long[] v) {
        int a, b, s;
        int i = 0;

        a = p.getInt(i);
        /* a: p0 (unmasked) */
        if ((a & 0x80) == 0) {
            v[0] = a;
            return 1;
        }

        i++;
        b = p.getInt(i);
        /* b: p1 (unmasked) */
        if ((b & 0x80) == 0) {
            a &= 0x7f;
            a = a << 7;
            a |= b;
            v[0] = a;
            return 2;
        }

        i++;
        a = a << 14;
        a |= p.getInt(i);
        /* a: p0<<14 | p2 (unmasked) */
        if ((a & 0x80) == 0) {
            a &= (0x7f << 14) | (0x7f);
            b &= 0x7f;
            b = b << 7;
            a |= b;
            v[0] = a;
            return 3;
        }

        /* CSE1 from below */
        a &= (0x7f << 14) | (0x7f);
        i++;
        b = b << 14;
        b |= p.getInt(i);
        /* b: p1<<14 | p3 (unmasked) */
        if ((b & 0x80) == 0) {
            b &= (0x7f << 14) | (0x7f);
            /* moved CSE1 up */
            /* a &= (0x7f<<14)|(0x7f); */
            a = a << 7;
            a |= b;
            v[0] = a;
            return 4;
        }

        /* a: p0<<14 | p2 (masked) */
        /* b: p1<<14 | p3 (unmasked) */
        /* 1:save off p0<<21 | p1<<14 | p2<<7 | p3 (masked) */
        /* moved CSE1 up */
        /* a &= (0x7f<<14)|(0x7f); */
        b &= (0x7f << 14) | (0x7f);
        s = a;
        /* s: p0<<14 | p2 (masked) */

        i++;
        a = a << 14;
        a |= p.getInt(i);
        /* a: p0<<28 | p2<<14 | p4 (unmasked) */
        if ((a & 0x80) == 0) {
            /*
             * we can skip these cause they were (effectively) done above in
             * calc'ing s
             */
            /* a &= (0x7f<<28)|(0x7f<<14)|(0x7f); */
            /* b &= (0x7f<<14)|(0x7f); */
            b = b << 7;
            a |= b;
            s = s >> 18;
            v[0] = ((long) s) << 32 | a;
            return 5;
        }

        /* 2:save off p0<<21 | p1<<14 | p2<<7 | p3 (masked) */
        s = s << 7;
        s |= b;
        /* s: p0<<21 | p1<<14 | p2<<7 | p3 (masked) */

        i++;
        b = b << 14;
        b |= p.getInt(i);
        /* b: p1<<28 | p3<<14 | p5 (unmasked) */
        if ((b & 0x80) == 0) {
            /*
             * we can skip this cause it was (effectively) done above in
             * calc'ing s
             */
            /* b &= (0x7f<<28)|(0x7f<<14)|(0x7f); */
            a &= (0x7f << 14) | (0x7f);
            a = a << 7;
            a |= b;
            s = s >> 18;
            v[0] = ((long) s) << 32 | a;
            return 6;
        }

        i++;
        a = a << 14;
        a |= p.getInt(i);
        /* a: p2<<28 | p4<<14 | p6 (unmasked) */
        if ((a & 0x80) == 0) {
            a &= (0x7f << 28) | (0x7f << 14) | (0x7f);
            b &= (0x7f << 14) | (0x7f);
            b = b << 7;
            a |= b;
            s = s >> 11;
            v[0] = ((long) s) << 32 | a;
            return 7;
        }

        /* CSE2 from below */
        a &= (0x7f << 14) | (0x7f);
        i++;
        b = b << 14;
        b |= p.getInt(i);
        /* b: p3<<28 | p5<<14 | p7 (unmasked) */
        if ((b & 0x80) == 0) {
            b &= (0x7f << 28) | (0x7f << 14) | (0x7f);
            /* moved CSE2 up */
            /* a &= (0x7f<<14)|(0x7f); */
            a = a << 7;
            a |= b;
            s = s >> 4;
            v[0] = ((long) s) << 32 | a;
            return 8;
        }

        i++;
        a = a << 15;
        a |= p.getInt(i);
        /* a: p4<<29 | p6<<15 | p8 (unmasked) */

        /* moved CSE2 up */
        /* a &= (0x7f<<29)|(0x7f<<15)|(0xff); */
        b &= (0x7f << 14) | (0x7f);
        b = b << 8;
        a |= b;

        s = s << 4;
        b = p.getInt(i - 4);
        b &= 0x7f;
        b = b >> 3;
        s |= b;

        v[0] = ((long) s) << 32 | a;

        return 9;
    }

    /**
     * Read a 32-bit variable-length integer from memory starting at p[0].
     * Return the number of bytes read. The value is stored in *v. A MACRO
     * version, getVarint32, is provided which inlines the single-byte case. All
     * code should use the MACRO version as this function assumes the
     * single-byte case has already been handled.
     * 
     * @throws SqlJetExceptionRemove
     */
    public static byte getVarint32(ByteBuffer p, int[] v){
        int a, b;
        int i = 0;

        a = p.getInt(i);
        /* a: p0 (unmasked) */
        if ((a & 0x80) == 0) {
            v[0] = a;
            return 1;
        }

        i++;
        b = p.getInt(i);
        /* b: p1 (unmasked) */
        if ((b & 0x80) == 0) {
            a &= 0x7f;
            a = a << 7;
            v[0] = a | b;
            return 2;
        }

        i++;
        a = a << 14;
        a |= p.getInt(i);
        /* a: p0<<14 | p2 (unmasked) */
        if ((a & 0x80) == 0) {
            a &= (0x7f << 14) | (0x7f);
            b &= 0x7f;
            b = b << 7;
            v[0] = a | b;
            return 3;
        }

        i++;
        b = b << 14;
        b |= p.getInt(i);
        /* b: p1<<14 | p3 (unmasked) */
        if ((b & 0x80) == 0) {
            b &= (0x7f << 14) | (0x7f);
            a &= (0x7f << 14) | (0x7f);
            a = a << 7;
            v[0] = a | b;
            return 4;
        }

        i++;
        a = a << 14;
        a |= p.getInt(i);
        /* a: p0<<28 | p2<<14 | p4 (unmasked) */
        if ((a & 0x80) == 0) {
            a &= (0x7f << 28) | (0x7f << 14) | (0x7f);
            b &= (0x7f << 28) | (0x7f << 14) | (0x7f);
            b = b << 7;
            v[0] = a | b;
            return 5;
        }

        /*
         * We can only reach this point when reading a corrupt database file. In
         * that case we are not in any hurry. Use the (relatively slow)
         * general-purpose sqlite3GetVarint() routine to extract the value.
         */
        {
            long[] v64 = new long[1];
            byte n;

            i -= 4;
            n = getVarint(p, v64);
            assert(n > 5 && n <= 9);
            v[0] = (int) v64[0];
            return n;
        }
    }

    /**
     * Return the number of bytes that will be needed to store the given 64-bit
     * integer.
     */
    public static int sqlite3VarintLen(long v) {
        int i = 0;
        do {
            i++;
            v >>= 7;
        } while (v != 0 && i < 9);
        return i;
    }

}
