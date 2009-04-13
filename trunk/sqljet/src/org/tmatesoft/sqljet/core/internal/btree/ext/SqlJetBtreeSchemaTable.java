/**
 * SqlJetBtreeShemaTable.java
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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchemaTable;
import org.tmatesoft.sqljet.core.ext.ISqlJetRecord;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeSchemaTable implements ISqlJetBtreeSchemaTable {

    private static final int TYPE_FIELD = 0;
    private static final int NAME_FIELD = 1;
    private static final int TABLE_FIELD = 2;
    private static final int PAGE_FIELD = 3;
    private static final int SQL_FIELD = 4;

    private static final String TABLE_TYPE = "table";
    private static final String INDEX_TYPE = "index";

    private SqlJetEncoding enc;
    
    private Map<String, Integer> tables = new HashMap<String, Integer>();
    private Map<String, Integer> indexes = new HashMap<String, Integer>();

    private ISqlJetBtree btree;

    /**
     * @param btree
     * @throws SqlJetException
     */
    public SqlJetBtreeSchemaTable(ISqlJetBtree btree) throws SqlJetException {
        init(btree, SqlJetEncoding.UTF8);
    }

    /**
     * @param btree
     * @throws SqlJetException
     */
    public SqlJetBtreeSchemaTable(ISqlJetBtree btree, SqlJetEncoding enc) throws SqlJetException {
        init(btree, enc);
    }
    
    /**
     * @param btree
     * @throws SqlJetException
     */
    private void init(ISqlJetBtree btree, SqlJetEncoding enc) throws SqlJetException {
        this.enc = enc;
        this.btree = btree;
        final SqlJetBtreeTable bt = new SqlJetBtreeTable(btree, ISqlJetDb.MASTER_ROOT, false, false);
        try {
            readShema(bt);
        } finally {
            bt.close();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaTable
     * #getBtree()
     */
    public ISqlJetBtree getBtree() {
        return btree;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaTable
     * #getTableNames()
     */
    public Set<String> getTableNames() {
        return tables.keySet();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaTable
     * #getTablePage(java.lang.String)
     */
    public Integer getTablePage(String name) {
        return tables.get(name);
    }

    /**
     * @throws SqlJetException
     * 
     */
    private void readShema(SqlJetBtreeTable bt) throws SqlJetException {
        for (ISqlJetRecord r = bt.getRecord(); !bt.eof(); bt.next(), r = bt.getRecord()) {
            final String t = SqlJetUtility.trim(r.getStringField(TYPE_FIELD, enc));
            if (null == t)
                continue;
            final Map<String, Integer> m = TABLE_TYPE.equals(t) ? tables : (INDEX_TYPE.equals(t) ? indexes : null);
            if (null == m)
                continue;
            final String n = SqlJetUtility.trim(r.getStringField(NAME_FIELD, enc));
            if (null == n)
                continue;
            final int p = (int) r.getIntField(PAGE_FIELD);
            if (0 == p)
                continue;
            m.put(n, p);
        }
    }

}
