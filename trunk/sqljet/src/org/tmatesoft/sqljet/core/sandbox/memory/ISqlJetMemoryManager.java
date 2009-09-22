/**
 * ISqlJetMemoryManager.java
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

/**
 * Default implementation of SQLJet's memory manager. It allows allocate memory
 * chunk {@link ISqlJetMemoryBuffer}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetMemoryManager {

    int BYTE_SIZE = 1;
    int SHORT_SIZE = 2;
    int INT_SIZE = 4;
    int LONG_SIZE = 8;

    /**
     * Allocates memory chunk {@link ISqlJetMemoryBuffer}.
     * 
     * @param size
     *            size of buffer in bytes
     * @return allocated buffer
     */
    ISqlJetMemoryBuffer allocate(int size);

    /**
     * Fries memory.
     * 
     * @param buffer
     *            buff
     */
    void free(ISqlJetMemoryBuffer buffer);

}
