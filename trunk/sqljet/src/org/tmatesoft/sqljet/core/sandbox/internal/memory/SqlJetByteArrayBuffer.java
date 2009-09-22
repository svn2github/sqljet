/**
 * SqlJetByteArrayBuffer.java
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
public class SqlJetByteArrayBuffer implements ISqlJetMemoryBuffer {

    private byte[] buffer;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #allocate(int)
     */
    public void allocate(final int size) {
        assert (size > 0);
        
        buffer = new byte[size];
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #free()
     */
    public void free() {
        assert (buffer != null);

        buffer = null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #isAllocated()
     */
    public boolean isAllocated() {
        return buffer != null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getSize()
     */
    public int getSize() {
        assert (buffer != null);

        return buffer.length;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getPointer(int)
     */
    public ISqlJetMemoryPointer getPointer(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return new SqlJetMemoryPointer(this, pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getByte(int)
     */
    public byte getByte(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return buffer[pointer];
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getInt(int)
     */
    public int getInt(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.getInt(buffer, pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getLong(int)
     */
    public long getLong(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.getLong(buffer, pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getShort(int)
     */
    public short getShort(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.getShort(buffer, pointer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getUnsignedByte(int)
     */
    public int getByteUnsigned(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.toUnsignedByte(getByte(pointer));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getUnsignedInt(int)
     */
    public long getIntUnsigned(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.toUnsignedInt(getInt(pointer));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #getUnsignedShort(int)
     */
    public int getShortUnsigned(final int pointer) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        return SqlJetBytesUtility.toUnsignedShort(getShort(pointer));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setByte(int, byte)
     */
    public void setByte(final int pointer, final byte value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        buffer[pointer] = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setInt(int, int)
     */
    public void setInt(final int pointer, final int value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        SqlJetBytesUtility.putInt(buffer, pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setLong(int, long)
     */
    public void setLong(final int pointer, final long value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        SqlJetBytesUtility.putLong(buffer, pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setShort(int, short)
     */
    public void setShort(final int pointer, final short value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        SqlJetBytesUtility.putShort(buffer, pointer, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setUnsignedByte(int, int)
     */
    public void setByteUnsigned(final int pointer, final int value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        setByte(pointer, (byte) SqlJetBytesUtility.toUnsignedByte(value));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setUnsignedInt(int, long)
     */
    public void setIntUnsigned(final int pointer, final long value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        setInt(pointer, (int) SqlJetBytesUtility.toUnsignedInt(value));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #setUnsignedShort(int, int)
     */
    public void setShortUnsigned(final int pointer, final int value) {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);

        setShort(pointer, (short) SqlJetBytesUtility.toUnsignedShort(value));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #read(int, java.io.RandomAccessFile, long, int)
     */
    public int readFromFile(final int pointer, final RandomAccessFile file, final long position, final int count)
            throws IOException {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);
        assert (file != null);
        assert (position >= 0);
        assert (count > 0);

        file.seek(position);
        return file.read(buffer, pointer, count);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer
     * #write(int, java.io.RandomAccessFile, long, int)
     */
    public int writeToFile(final int pointer, final RandomAccessFile file, final long position, final int count)
            throws IOException {
        assert (buffer != null);
        assert (pointer >= 0);
        assert (pointer < buffer.length);
        assert (file != null);
        assert (position >= 0);
        assert (count > 0);

        file.seek(position);
        file.write(buffer, pointer, count);
        return count;
    }

}
