/**
 * ISqlJetBtreeTable.java
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
 */
package org.tmatesoft.sqljet.core.ext;

import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.SqlJetException;


/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetBtreeTable {

    ISqlJetBtree getBtree();
    
    void close() throws SqlJetException;

    void lock();
    
    void unlock();
    
    boolean eof();

    boolean first() throws SqlJetException;

    boolean last() throws SqlJetException;

    boolean next() throws SqlJetException;

    boolean previous() throws SqlJetException;

    ISqlJetBtreeRecord getRecord() throws SqlJetException;
    
    ISqlJetBtreeCursor getCursor();
 
    void lockTable(boolean write);
}