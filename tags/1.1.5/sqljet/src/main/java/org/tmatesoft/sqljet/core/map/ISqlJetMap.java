/**
 * ISqlJetMapTable.java
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
package org.tmatesoft.sqljet.core.map;

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetMap {

    /**
     * @param key
     * @param value
     * 
     * @throws SqlJetException
     */
    void put(Object[] key, Object[] value) throws SqlJetException;

    /**
     * @param key
     * @return data stored with the key specified
     * @throws SqlJetException
     */
    Object[] get(Object[] key) throws SqlJetException;

    /**
     * @return cursor instance
     *  
     * @throws SqlJetException
     */
    ISqlJetMapCursor getCursor() throws SqlJetException;

    /**
     * @throws SqlJetException
     */
    ISqlJetMapTable getMapTable() throws SqlJetException;

    /**
     * @throws SqlJetException
     */
    ISqlJetMapIndex getMapIndex() throws SqlJetException;

}
