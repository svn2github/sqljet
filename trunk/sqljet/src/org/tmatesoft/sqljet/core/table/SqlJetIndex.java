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
package org.tmatesoft.sqljet.core.table;

import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValue;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetIndex extends SqlJetCursor implements ISqlJetIndex {

    private ISqlJetBtreeIndexTable indexTable;

    /**
     * 
     */
    protected SqlJetIndex(ISqlJetBtreeIndexTable indexTable) {
        super(indexTable);
        this.indexTable = indexTable;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetIndex#lookup(org.tmatesoft.sqljet.core.table.SqlJetRecord)
     */
    public ISqlJetRecord lookup(SqlJetRecord key) throws SqlJetException{
        final ISqlJetBtreeRecord lookup = indexTable.lookup(key.getRecord());
        if(null==lookup) return null;
        return new SqlJetRecord(lookup);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetIndex#getRecordRowId(org.tmatesoft.sqljet.core.table.SqlJetRecord)
     */
    public Long getKeyRowId(ISqlJetRecord record) {
        if(null == record) return null;
        final List<SqlJetValue> values = record.getValues();
        if( null == values || 0 == values.size()) return null;
        return values.get(values.size()-1).getInteger();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetIndex#insert(org.tmatesoft.sqljet.core.table.SqlJetRecord)
     */
    public void insert(SqlJetRecord key) throws SqlJetException {
        indexTable.insert(key.getRecord(), true);
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.table.ISqlJetIndex#delete(org.tmatesoft.sqljet.core.table.SqlJetRecord)
     */
    public void delete(SqlJetRecord key) throws SqlJetException {
        indexTable.delete(key.getRecord());
    }
    
}
