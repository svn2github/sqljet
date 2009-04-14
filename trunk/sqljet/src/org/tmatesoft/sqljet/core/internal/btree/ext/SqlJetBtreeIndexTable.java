/**
 * SqlJetBtreeDataTable.java
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
package org.tmatesoft.sqljet.core.internal.btree.ext;

import java.nio.ByteBuffer;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeIndexTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.ext.ISqlJetRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeIndexTable extends SqlJetBtreeTable implements ISqlJetBtreeIndexTable {

    /**
     * Open index by name
     * 
     * @throws SqlJetException
     * 
     */
    public SqlJetBtreeIndexTable(ISqlJetBtreeSchema schema, String indexName, boolean write)
            throws SqlJetException {
        super(schema.getBtree(), schema.getIndexePage(indexName), write, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.ext.ISqlJetBtreeIndexTable#lookup
     * (org.tmatesoft.sqljet.core.ext.ISqlJetRecord)
     */
    public int lookup(ISqlJetRecord key) throws SqlJetException {
        lock();
        try {
            adjustKeyInfo(key);
            final ByteBuffer r = key.getRawRecord();
            return cursor.moveTo(r, r.remaining(), false);
        } finally {
            unlock();
        }
    }

    /**
     * @param key
     */
    private void adjustKeyInfo(ISqlJetRecord key) {
        if(null!=keyInfo) {
            keyInfo.setNField(key.getFieldsCount());
        }
    }
}
