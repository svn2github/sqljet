/**
 * SqlJetValue.java
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
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMemFlags;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetValue implements ISqlJetValue {

    private ISqlJetVdbeMem mem;
    private SqlJetEncoding encoding = SqlJetEncoding.UTF8;

    /**
     * 
     */
    public SqlJetValue(ISqlJetVdbeMem mem) {
        this.mem = mem;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#getMem()
     */
    public ISqlJetVdbeMem getMem() {
        return mem;
    }
    
    /**
     * 
     */
    public SqlJetValue() {
        mem = new SqlJetVdbeMem();
        mem.setNull();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#isNull()
     */
    public boolean isNull() {
        if(null==mem) return true;
        final EnumSet<SqlJetVdbeMemFlags> flags = mem.getFlags();
        if(null==flags) return false;
        return flags.contains(SqlJetVdbeMemFlags.Null);
    }
    
    public SqlJetValue(String value, SqlJetEncoding encoding ) throws SqlJetException {
        this.encoding =  encoding;
        mem = new SqlJetVdbeMem();
        mem.setStr(ByteBuffer.wrap(SqlJetUtility.getBytes(value)), encoding);
    }
    
    public SqlJetValue(Long value) {
        mem = new SqlJetVdbeMem();
        mem.setInt64(value);
    }

    public SqlJetValue(Double value) {
        mem = new SqlJetVdbeMem();
        mem.setDouble(value);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#getString()
     */
    public String getString() throws SqlJetException {
        if(isNull()) return null;
        return SqlJetUtility.toString(mem.valueText(encoding));
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#getInteger()
     */
    public Long getInteger() {
        if(isNull()) return null;
        return mem.intValue();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#getReal()
     */
    public Double getReal() {
        if(isNull()) return null;
        return mem.realValue();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetValue#toString()
     */
    @Override
    public String toString() {
        try {
            return !isNull()?getString().trim():"<null>";
        } catch (SqlJetException e) {
            return "<error>";
        }
    }
    
}
