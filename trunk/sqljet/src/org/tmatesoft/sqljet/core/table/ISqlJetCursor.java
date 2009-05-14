/**
 * ISqlJetCursor.java
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
package org.tmatesoft.sqljet.core.table;

import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetCursor {

    void close() throws SqlJetException;

    boolean eof();

    boolean first() throws SqlJetException;

    boolean last() throws SqlJetException;

    boolean next() throws SqlJetException;

    boolean previous() throws SqlJetException;

    int getFieldsCount() throws SqlJetException;

    SqlJetValueType getFieldType(int field) throws SqlJetException;
    
    boolean isNull(int field) throws SqlJetException;
    
    String getString(int field) throws SqlJetException;
    
    long getInteger(int field) throws SqlJetException;
    
    double getReal(int field) throws SqlJetException;

    ByteBuffer getBlob(int field) throws SqlJetException;
}