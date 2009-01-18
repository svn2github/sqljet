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
        if(null==p||(p.length-pos)<4) 
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
        System.arraycopy(src, dstPos, dest, srcPos, length);
    }
    
}