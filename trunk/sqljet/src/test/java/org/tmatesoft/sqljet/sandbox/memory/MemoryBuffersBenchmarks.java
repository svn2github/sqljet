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

import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetAbstractLoggedTest;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryBuffer;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryManager;
import org.tmatesoft.sqljet.core.internal.ISqlJetMemoryPointer;
import org.tmatesoft.sqljet.core.internal.SqlJetMemoryBufferType;
import org.tmatesoft.sqljet.core.internal.memory.SqlJetMemoryManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class MemoryBuffersBenchmarks extends SqlJetAbstractLoggedTest {

    public static final int CAPACITY = Short.MAX_VALUE;
    public static final int MUCH = Integer.MAX_VALUE;

    private static final ISqlJetMemoryManager memoryManager = new SqlJetMemoryManager();

    public static int more(int i) {
        return (i & 1) == 0 ? 1 : -1;
    }

    public static int more(long i) {
        return (i & 1) == 0 ? 1 : -1;
    }

    @Test
    public void arrayByte() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.ARRAY);
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
    public void arrayInt() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.ARRAY);
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
    public void arrayLong() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.ARRAY);
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
    public void arrayByteUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.ARRAY);
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
    public void arrayIntUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.ARRAY);
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

    @Test
    public void bufferByte() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.BUFFER);
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
    public void bufferInt() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.BUFFER);
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
    public void bufferLong() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.BUFFER);
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
    public void bufferByteUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.BUFFER);
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
    public void bufferIntUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.BUFFER);
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

    @Test
    public void directByte() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.DIRECT);
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
    public void directInt() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.DIRECT);
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
    public void directLong() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.DIRECT);
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
    public void directByteUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.DIRECT);
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
    public void directIntUnsigned() {
        final ISqlJetMemoryBuffer b = memoryManager.allocate(CAPACITY, SqlJetMemoryBufferType.DIRECT);
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
