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
import org.tmatesoft.sqljet.core.sandbox.memory.SqlJetMemoryBufferType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MemoryBufferTest {

    private static final ISqlJetMemoryManager memoryManager = new SqlJetMemoryManager();

    @Test
    public void testByteArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1, SqlJetMemoryBufferType.ARRAY);
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
    public void testUnsignedByteArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1, SqlJetMemoryBufferType.ARRAY);
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
    public void testShortArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2, SqlJetMemoryBufferType.ARRAY);
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
    public void testUnsignedShortArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2, SqlJetMemoryBufferType.ARRAY);
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
    public void testIntArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4, SqlJetMemoryBufferType.ARRAY);
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
    public void testUnsignedIntArray() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4, SqlJetMemoryBufferType.ARRAY);
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

    @Test
    public void testByteBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1, SqlJetMemoryBufferType.BUFFER);
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
    public void testUnsignedByteBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(1, SqlJetMemoryBufferType.BUFFER);
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
    public void testShortBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2, SqlJetMemoryBufferType.BUFFER);
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
    public void testUnsignedShortBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(2, SqlJetMemoryBufferType.BUFFER);
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
    public void testIntBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4, SqlJetMemoryBufferType.BUFFER);
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
    public void testUnsignedIntBuffer() {
        ISqlJetMemoryBuffer b = memoryManager.allocate(4, SqlJetMemoryBufferType.BUFFER);
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
