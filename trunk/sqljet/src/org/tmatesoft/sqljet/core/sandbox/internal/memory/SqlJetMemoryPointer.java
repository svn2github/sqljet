/**
 * SqlJetMemoryPointer.java
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
package org.tmatesoft.sqljet.core.sandbox.internal.memory;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryBuffer;
import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryPointer;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMemoryPointer implements ISqlJetMemoryPointer {

    private ISqlJetMemoryBuffer buffer;
    private int pointer;

    /**
     * 
     */
    public SqlJetMemoryPointer(ISqlJetMemoryBuffer buffer, int pointer) {
        assert (buffer != null);
        assert (buffer.isAllocated());
        assert (pointer >= 0);
        assert (pointer < buffer.getSize());

        this.buffer = buffer;
        this.pointer = pointer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getBuffer()
     */
    public ISqlJetMemoryBuffer getBuffer() {
        return buffer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getPointer()
     */
    public int getPointer() {
        return pointer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setPointer(int)
     */
    public void setPointer(int pointer) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        this.pointer = pointer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #movePointer(int)
     */
    public void movePointer(int count) {
        assert (buffer != null);
        assert (buffer.isAllocated());
        assert (pointer + count >= 0);
        assert (pointer + count < buffer.getSize());

        pointer += count;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getByte()
     */
    public byte getByte() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getByte(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getInt()
     */
    public int getInt() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getInt(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getLong()
     */
    public long getLong() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getLong(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getShort()
     */
    public short getShort() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getShort(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getUnsignedByte()
     */
    public int getByteUnsigned() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getByteUnsigned(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getUnsignedInt()
     */
    public long getIntUnsigned() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getIntUnsigned(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #getUnsignedShort()
     */
    public int getShortUnsigned() {
        assert (buffer != null);
        assert (buffer.isAllocated());

        return buffer.getShortUnsigned(pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setByte(byte)
     */
    public void setByte(byte value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setByte(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setInt(int)
     */
    public void setInt(int value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setInt(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setLong(long)
     */
    public void setLong(long value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setLong(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setShort(short)
     */
    public void setShort(short value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setShort(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setUnsignedByte(int)
     */
    public void setByteUnsigned(int value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setByteUnsigned(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setUnsignedInt(long)
     */
    public void setIntUnsigned(long value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setIntUnsigned(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #setUnsignedShort(int)
     */
    public void setShortUnsigned(int value) {
        assert (buffer != null);
        assert (buffer.isAllocated());

        buffer.setShortUnsigned(pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #read(java.io.RandomAccessFile, long, int)
     */
    public int readFromFile(RandomAccessFile file, long position, int count) throws IOException {
        assert (buffer != null);
        assert (buffer.isAllocated());
        assert (file != null);
        assert (position >= 0);
        assert (count > 0);
        assert (pointer + count < buffer.getSize());

        return buffer.readFromFile(pointer, file, position, count);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryPointer
     * #write(java.io.RandomAccessFile, long, int)
     */
    public int writeToFile(RandomAccessFile file, long position, int count) throws IOException {
        assert (buffer != null);
        assert (file != null);
        assert (position >= 0);
        assert (count > 0);
        assert (pointer + count < buffer.getSize());

        return buffer.writeToFile(pointer, file, position, count);
    }

}
