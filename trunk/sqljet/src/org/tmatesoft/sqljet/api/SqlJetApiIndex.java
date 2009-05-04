/**
 * SqlJetDataTableCursor.java
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
package org.tmatesoft.sqljet.api;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeIndexTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetApiIndex extends SqlJetApiCursor {

    private ISqlJetBtreeIndexTable indexTable;

    /**
     * 
     */
    SqlJetApiIndex(ISqlJetBtreeIndexTable indexTable) {
        super(indexTable);
        this.indexTable = indexTable;
    }

    public SqlJetApiRecord lookup(SqlJetApiRecord key) throws SqlJetException{
        return new SqlJetApiRecord(indexTable.lookup(key.getRecord()));
    }
    
    public Long getRecordRowId(SqlJetApiRecord record) {
        if(null == record || null == record.values || 0 == record.values.size()) return null;
        return record.values.get(record.values.size()-1).getInteger();
    }

    /**
     * Writes key into the index.
     *  
     * @param key
     * @throws SqlJetException
     */
    public void insert(SqlJetApiRecord key) throws SqlJetException {
        indexTable.insert(key.getRecord(), true);
    }

    public void delete(SqlJetApiRecord key) throws SqlJetException {
        indexTable.delete(key.getRecord());
    }
    
}
