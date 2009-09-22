/**
 * ISqlJetPointer.java
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
package org.tmatesoft.sqljet.core.sandbox.memory;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Pointer in SqlJet's memory buffer.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetMemoryPointer {

    /**
     * Get buffer which contains pointer.
     * 
     * @return
     */
    ISqlJetMemoryBuffer getBuffer();

    /**
     * Get pointer address (offset in buffer).
     * 
     * @return
     */
    int getPointer();

    /**
     * Set pointer address (offset in buffer).
     * 
     * @param pointer
     */
    void setPointer(int pointer);

    /**
     * Move pointer. Add some count to pointer address. Count may be negative.
     * 
     * @param count
     *            count which added to address. May be negative.
     */
    void movePointer(int count);

    /**
     * Read byte at current address.
     * 
     * @return
     */
    byte getByte();

    /**
     * Write byte at current address.
     * 
     * @param value
     */
    void setByte(byte value);

    /**
     * Read short at current address.
     * 
     * @return
     */
    short getShort();

    /**
     * Write short at current address.
     * 
     * @param value
     */
    void setShort(short value);

    /**
     * Read int at current address.
     * 
     * @return
     */
    int getInt();

    /**
     * Write int at current address.
     * 
     * @param value
     */
    void setInt(int value);

    /**
     * Read long at current address.
     * 
     * @return
     */
    long getLong();

    /**
     * Write long at current address.
     * 
     * @param value
     */
    void setLong(long value);

    /**
     * Read unsigned byte at current address.
     * 
     * @return
     */
    int getByteUnsigned();

    /**
     * Write unsigned byte at current address.
     * 
     * @param value
     */
    void setByteUnsigned(int value);

    /**
     * Read unsigned short at current address.
     * 
     * @return
     */
    int getShortUnsigned();

    /**
     * Write unsigned short at current address.
     * 
     * @param value
     */
    void setShortUnsigned(int value);

    /**
     * Read unsigned int at current address.
     * 
     * @return
     */
    long getIntUnsigned();

    /**
     * Write unsigned int at current address.
     * 
     * @param value
     */
    void setIntUnsigned(long value);

    /**
     * Read from file at current address.
     * 
     * @param file
     * @param position
     * @param count
     * @return
     * @throws IOException
     */
    int readFromFile(RandomAccessFile file, long position, int count) throws IOException;

    /**
     * Write to file at current address.
     * 
     * @param file
     * @param position
     * @param count
     * @return
     * @throws IOException
     */
    int writeToFile(RandomAccessFile file, long position, int count) throws IOException;

}
