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
import java.util.Collections;

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
     * Read a four-byte big-endian integer value.
     */

    public static int get4byte(byte[] p) {
        return ByteBuffer.wrap(p).getInt();
    }

    /**
     * Write a four-byte big-endian integer value.
     */
    public static byte[] put4byte(int v) {
        return ByteBuffer.wrap(new byte[4]).putInt(0, v).array();
    }

    public static void put4byte(byte[] p, int pos, int v) {
        if (null == p || (p.length - pos) < 4)
            throw new SqlJetError("Wrong destination");
        ByteBuffer.wrap(p).putInt(pos, v);
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
        for(int i = 0; i<count; i++) {
            final Byte b1 = Byte.valueOf(a1[i]);
            final Byte b2 = Byte.valueOf(a2[i]);
            final int c = b1.compareTo(b2);
            if(0!=c) return c;
        }
        return 0;
    }

}
