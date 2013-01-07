/**
 * ISqlJetMapIterator.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
public interface ISqlJetMapIterator {

    /**
     * Tests whether this cursor is positioned behind the last record.
     * 
     * @return true if the cursor is not on a record and fields can't be read.
     * @throws SqlJetException
     */
    boolean eof() throws SqlJetException;

    /**
     * Goes to the first record.
     * 
     * @return true if there is at least one record.
     * @throws SqlJetException
     */
    boolean first() throws SqlJetException;

    /**
     * Goes to the last record.
     * 
     * @return true if there is at least one record.
     * @throws SqlJetException
     */
    boolean last() throws SqlJetException;

    /**
     * Goes to the next record.
     * 
     * @return true if there is at least one record and end of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean next() throws SqlJetException;

    /**
     * Goes to the previous record.
     * 
     * @return true if there is at least one record and begin of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean previous() throws SqlJetException;

}
