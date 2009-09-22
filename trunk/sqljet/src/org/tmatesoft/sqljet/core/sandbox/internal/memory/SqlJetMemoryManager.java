/**
 * SqlJetMemoryManager.java
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

import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryBuffer;
import org.tmatesoft.sqljet.core.sandbox.memory.ISqlJetMemoryManager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMemoryManager implements ISqlJetMemoryManager {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryManager
     * #allocate(int)
     */
    public ISqlJetMemoryBuffer allocate(final int size) {
        if (size > 0) {
            SqlJetByteArrayBuffer buffer = new SqlJetByteArrayBuffer();
            buffer.allocate(size);
            return buffer;
        } else {
            return null;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryManager
     * #free
     * (org.tmatesoft.sqljet.core.sandbox.internal.memory.ISqlJetMemoryBuffer)
     */
    public void free(final ISqlJetMemoryBuffer buffer) {
        if (buffer != null) {
            buffer.free();
        }
    }

}
