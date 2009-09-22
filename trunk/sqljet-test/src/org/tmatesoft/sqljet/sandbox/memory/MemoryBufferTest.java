/**
 * Memory.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.sandbox.memory;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.sandbox.internal.memory.SqlJetMemoryManager;
import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryBuffer;
import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MemoryBufferTest {

    private static final ISqlJetMemoryManager memoryManager = new SqlJetMemoryManager();

    @Test
    public void testByte() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1);
        b.setByte(0, (byte) 1);
        Assert.assertEquals(1, b.getByte(0));
        b.setByte(0, (byte) -1);
        Assert.assertEquals(-1, b.getByte(0));
        b.setByte(0, Byte.MAX_VALUE);
        Assert.assertEquals(Byte.MAX_VALUE, b.getByte(0));
        b.setByte(0, Byte.MIN_VALUE);
        Assert.assertEquals(Byte.MIN_VALUE, b.getByte(0));
        memoryManager.free(b);
    }

    @Test
    public void testUnsignedByte() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1);
        b.setByteUnsigned(0, 0xFF);
        Assert.assertEquals(0xFF, b.getByteUnsigned(0));
        b.setByteUnsigned(0, (byte) 1);
        Assert.assertEquals(1, b.getByteUnsigned(0));
        Assert.assertEquals(1, b.getByte(0));
        b.setByte(0, (byte) 1);
        Assert.assertEquals(1, b.getByteUnsigned(0));
        Assert.assertEquals(1, b.getByte(0));
        memoryManager.free(b);
    }

    @Test
    public void testShort() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2);
        b.setShort(0, (short) 1);
        Assert.assertEquals(1, b.getShort(0));
        b.setShort(0, (short) -1);
        Assert.assertEquals(-1, b.getShort(0));
        b.setShort(0, Short.MAX_VALUE);
        Assert.assertEquals(Short.MAX_VALUE, b.getShort(0));
        b.setShort(0, Short.MIN_VALUE);
        Assert.assertEquals(Short.MIN_VALUE, b.getShort(0));
        memoryManager.free(b);
    }

    @Test
    public void testUnsignedShort() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2);
        b.setShortUnsigned(0, 0xFFFF);
        Assert.assertEquals(0xFFFF, b.getShortUnsigned(0));
        b.setShortUnsigned(0, (short) 1);
        Assert.assertEquals(1, b.getShortUnsigned(0));
        Assert.assertEquals(1, b.getShort(0));
        b.setShort(0, (short) 1);
        Assert.assertEquals(1, b.getShortUnsigned(0));
        Assert.assertEquals(1, b.getShort(0));
        memoryManager.free(b);
    }

    @Test
    public void testInt() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4);
        b.setInt(0, 1);
        Assert.assertEquals(1, b.getInt(0));
        b.setInt(0, -1);
        Assert.assertEquals(-1, b.getInt(0));
        b.setInt(0, Integer.MAX_VALUE);
        Assert.assertEquals(Integer.MAX_VALUE, b.getInt(0));
        b.setInt(0, Integer.MIN_VALUE);
        Assert.assertEquals(Integer.MIN_VALUE, b.getInt(0));
        memoryManager.free(b);
    }

    @Test
    public void testUnsignedInt() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4);
        b.setIntUnsigned(0, 0xFFFFFFFFL);
        Assert.assertEquals(0xFFFFFFFFL, b.getIntUnsigned(0));
        b.setIntUnsigned(0, 1);
        Assert.assertEquals(1, b.getIntUnsigned(0));
        Assert.assertEquals(1, b.getInt(0));
        b.setInt(0, 1);
        Assert.assertEquals(1, b.getIntUnsigned(0));
        Assert.assertEquals(1, b.getInt(0));
        memoryManager.free(b);
    }

}
