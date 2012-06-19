/**
 * BuffersPerformanceTest.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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

import java.nio.ByteBuffer;

import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetAbstractLoggedTest;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryBuffer;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryManager;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.memory.SqlJetMemoryManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class BuffersBenchmarks extends SqlJetAbstractLoggedTest {

    public static final int CAPACITY = Short.MAX_VALUE;
    public static final int MUCH = Integer.MAX_VALUE;

    public static final int UBYTE_MASK = 0x000000FF;
    public static final int USHORT_MASK = 0x0000FFFF;
    public static final long UINT_MASK = 0xFFFFFFFF;

    private static final ISqlJetMemoryManager memoryManager = new SqlJetMemoryManager();

    public static int more(int i) {
        return (i & 1) == 0 ? 1 : -1;
    }

    public static int more(long i) {
        return (i & 1) == 0 ? 1 : -1;
    }

    public static int ubyte(int value) {
        return UBYTE_MASK & value;
    }

    public static int ushort(int value) {
        return USHORT_MASK & value;
    }

    public static long uint(long value) {
        return UINT_MASK & value;
    }

    @Test
    public void byteArray() {
        final byte[] b = new byte[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(i);
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void shortArray() {
        final short[] b = new short[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(i);
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void intArray() {
        final int[] b = new int[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(i);
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void longArray() {
        final long[] b = new long[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(i);
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void byteArrayUnsigned() {
        final short[] b = new short[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(ubyte(i));
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void shortArrayUnsigned() {
        final int[] b = new int[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(ushort(i));
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void intArrayUnsigned() {
        final long[] b = new long[CAPACITY];
        for (int i = 0; i < MUCH; i++) {
            b[MUCH % CAPACITY] += more(uint(i));
        }
        logger.info(String.format("%d\n", b[0]));
    }

    @Test
    public void byteBuffer() {
        final ByteBuffer b = ByteBuffer.allocate(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            byte x = b.get(index);
            x += more(i);
            b.put(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferUnsigned() {
        final ByteBuffer b = ByteBuffer.allocate(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            byte x = b.get(index);
            x += more(ubyte(i));
            b.put(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferAsInt() {
        final ByteBuffer b = ByteBuffer.allocate(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            int x = b.getInt(index);
            x += more(i);
            b.putInt(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferAsIntUnsigned() {
        final ByteBuffer b = ByteBuffer.allocate(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            int x = b.getInt(index);
            x += more(ubyte(i));
            b.putInt(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferAsLong() {
        final ByteBuffer b = ByteBuffer.allocate(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            long x = b.getLong(index);
            x += more(i);
            b.putLong(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferDirect() {
        final ByteBuffer b = ByteBuffer.allocateDirect(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            byte x = b.get(index);
            x += more(i);
            b.put(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferDirectUnsigned() {
        final ByteBuffer b = ByteBuffer.allocateDirect(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            byte x = b.get(index);
            x += more(ubyte(i));
            b.put(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferDirectAsInt() {
        final ByteBuffer b = ByteBuffer.allocateDirect(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            int x = b.getInt(index);
            x += more(i);
            b.putInt(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferDirectAsIntUnsigned() {
        final ByteBuffer b = ByteBuffer.allocateDirect(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            int x = b.getInt(index);
            x += more(ubyte(i));
            b.putInt(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }

    @Test
    public void byteBufferDirectAsLong() {
        final ByteBuffer b = ByteBuffer.allocateDirect(CAPACITY);
        for (int i = 0; i < MUCH; i++) {
            final int index = MUCH % CAPACITY;
            long x = b.getLong(index);
            x += more(i);
            b.putLong(index, x);
        }
        logger.info(String.format("%d\n", b.get(0)));
    }
    
    @Test
    public void sqlJetPointerByte() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY);
        final ISqlJetMemoryPointer p = b.getPointer(0);
        for (int i = 0; i < MUCH; i++) {
            p.setPointer(MUCH % CAPACITY);
            byte v = p.getByte();
            v += more(i);
            p.putByte(v);
        }
        logger.info(String.format("%d\n", p.getByte()));
        memoryManager.free(b);
    }

    @Test
    public void sqlJetPointerInt() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY);
        final ISqlJetMemoryPointer p = b.getPointer(0);
        for (int i = 0; i < MUCH; i++) {
            p.setPointer(MUCH % (CAPACITY - ISqlJetMemoryManager.INT_SIZE));
            int v = p.getInt();
            v += more(i);
            p.putInt(v);
        }
        logger.info(String.format("%d\n", p.getInt()));
        memoryManager.free(b);
    }

    @Test
    public void sqlJetPointerLong() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY);
        final ISqlJetMemoryPointer p = b.getPointer(0);
        for (int i = 0; i < MUCH; i++) {
            p.setPointer(MUCH % (CAPACITY - ISqlJetMemoryManager.LONG_SIZE));
            long v = p.getLong();
            v += more(i);
            p.putLong(v);
        }
        logger.info(String.format("%d\n", p.getInt()));
        memoryManager.free(b);
    }

    @Test
    public void sqlJetPointerByteUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY);
        final ISqlJetMemoryPointer p = b.getPointer(0);
        for (int i = 0; i < MUCH; i++) {
            p.setPointer(MUCH % CAPACITY);
            int v = p.getByteUnsigned();
            v += more(i);
            p.putByteUnsigned(v);
        }
        logger.info(String.format("%d\n", p.getByte()));
        memoryManager.free(b);
    }

    @Test
    public void sqlJetPointerIntUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY);
        final ISqlJetMemoryPointer p = b.getPointer(0);
        for (int i = 0; i < MUCH; i++) {
            p.setPointer(MUCH % (CAPACITY - ISqlJetMemoryManager.INT_SIZE));
            long v = p.getIntUnsigned();
            v += more(i);
            p.putIntUnsigned(v);
        }
        logger.info(String.format("%d\n", p.getInt()));
        memoryManager.free(b);
    }

}
