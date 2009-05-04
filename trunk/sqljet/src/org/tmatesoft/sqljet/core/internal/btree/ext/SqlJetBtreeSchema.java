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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.ISqlJetBtree;
import org.tmatesoft.sqljet.core.ISqlJetDb;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchema;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.ext.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeSchema implements ISqlJetBtreeSchema {

    private static final int TYPE_FIELD = 0;
    private static final int NAME_FIELD = 1;
    private static final int TABLE_FIELD = 2;
    private static final int PAGE_FIELD = 3;
    private static final int SQL_FIELD = 4;

    private static final String TABLE_TYPE = "table";
    private static final String INDEX_TYPE = "index";

    private final ISqlJetBtree btree;
    private final SqlJetEncoding enc;
    
    private final Map<String, Integer> tables = new HashMap<String, Integer>();
    private final Map<String, ISqlJetTableDef> tableDefs = new HashMap<String, ISqlJetTableDef>();
    private final Map<String, Integer> indexes = new HashMap<String, Integer>();
    private final Map<String, Set<String>> indexesOfTables = new HashMap<String, Set<String>>();


    /**
     * @param btree
     * @throws SqlJetException
     */
    public SqlJetBtreeSchema(ISqlJetBtree btree) throws SqlJetException {
        this.btree = btree;
        this.enc = SqlJetEncoding.UTF8;
        init();
    }

    /**
     * @param btree
     * @throws SqlJetException
     */
    public SqlJetBtreeSchema(ISqlJetBtree btree, SqlJetEncoding enc) throws SqlJetException {
        this.btree = btree;
        this.enc = enc;
        init();
    }
    
    /**
     * @param btree
     * @throws SqlJetException
     */
    private void init() throws SqlJetException {
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

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchema#getTable(java.lang.String)
     */
    public ISqlJetTableDef getTable(String name) {
        return tableDefs.get(name);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaTable
     * #getTablePage(java.lang.String)
     */
    public int getTablePage(String tableName) {
        final Integer p = tables.get(tableName);
        if(null==p) return 0;
        return p;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchemaTable#getIndexesOfTable(java.lang.String)
     */
    public Set<String> getIndexesOfTable(String tableName) {
        final Set<String> i = indexesOfTables.get(tableName);
        if(null==i) return Collections.emptySet();
        return Collections.unmodifiableSet(i);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ext.ISqlJetBtreeSchemaTable#getIndexePage(java.lang.String)
     */
    public int getIndexePage(String indexName) {
        final Integer p = indexes.get(indexName);
        if(null==p) return 0;
        return p;
    }
    
    private void readShema(SqlJetBtreeTable table) throws SqlJetException {
        for (ISqlJetBtreeRecord record = table.getRecord(); !table.eof(); table.next(), record = table.getRecord()) {
            final String type = SqlJetUtility.trim(record.getStringField(TYPE_FIELD, enc));
            if (null == type) {
                continue;
            }
            final String name = SqlJetUtility.trim(record.getStringField(NAME_FIELD, enc));
            if (null == name) {
                continue;
            }
            final int page = (int) record.getIntField(PAGE_FIELD);
            if (0 == page) {
                continue;
            }

            if (TABLE_TYPE.equals(type)) {
                tables.put(name, page);
                /* not ready yet
                String sql = record.getStringField(SQL_FIELD, enc);
                System.err.println(sql);
                CommonTree ast = parse(sql);
                ISqlJetTableDef tableDef = new SqlJetTableDef(ast, page);
                if (!name.equals(tableDef.getName())) {
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT);
                }
                tableDefs.put(name, tableDef);
                */
            } else if (INDEX_TYPE.equals(type)) {
                indexes.put(name, page);
                final String indexTableName = SqlJetUtility.trim(record.getStringField(TABLE_FIELD, enc));
                if (null == type) {
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT);
                }
                Set<String> indexNames = indexesOfTables.get(indexTableName);
                if (null == indexNames) {
                    indexesOfTables.put(indexTableName, indexNames = new HashSet<String>());
                }
                indexNames.add(name);
            }
        }
    }

    private CommonTree parse(String sql) throws SqlJetException {
        try {
            CharStream chars = new ANTLRStringStream(sql);
            SqlLexer lexer = new SqlLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(tokens);
            return (CommonTree) parser.create_table_stmt().getTree();
        } catch (RecognitionException re) {
            throw new SqlJetException(SqlJetErrorCode.ERROR, "Invalid sql statement: " + sql);
        }
    }
    
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Tables:\n");
        for (ISqlJetTableDef tableDef: tableDefs.values()) {
            buffer.append(tableDef.toString());
            buffer.append('\n');
        }
        buffer.append("Indexes:\n");
        for (String name: indexes.keySet()) {
            buffer.append(indexes.get(name));
            buffer.append(": ");
            buffer.append(name);
            buffer.append('\n');
        }
        return buffer.toString();
    }
}
