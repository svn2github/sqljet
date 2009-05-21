/**
 * SqlJetSchema.java
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
package org.tmatesoft.sqljet.core.internal.schema;

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
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.lang.SqlLexer;
import org.tmatesoft.sqljet.core.internal.lang.SqlParser;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.table.SqlJetBtreeTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetSchema implements ISqlJetSchema {

    private static final int TYPE_FIELD = 0;
    private static final int NAME_FIELD = 1;
    private static final int TABLE_FIELD = 2;
    private static final int PAGE_FIELD = 3;
    private static final int SQL_FIELD = 4;

    private static final String TABLE_TYPE = "table";
    private static final String INDEX_TYPE = "index";

    private final ISqlJetBtree btree;
    private final SqlJetSchemaMeta meta;

    private final Map<String, ISqlJetTableDef> tableDefs = new HashMap<String, ISqlJetTableDef>();
    private final Map<String, Integer> indexPages = new HashMap<String, Integer>();
    private final Map<String, Set<String>> tableIndexes = new HashMap<String, Set<String>>();

    public SqlJetSchema(ISqlJetDbHandle db,ISqlJetBtree btree) throws SqlJetException {
        this.btree = btree;
        
        /* TODO meta seems as must be moved to ISqlJetDbHandle
         * because ISqlJetDbHandle must be initialized by proper encoding
         * before to any reads from ISqlJetDbHandle, 
         * otherwise it will fail on charsets handling.
         */
        this.meta = new SqlJetSchemaMeta(btree);
        db.setEnc(this.meta.getEncoding());
        
        init();
    }

    private void init() throws SqlJetException {
        final SqlJetBtreeTable bt = new SqlJetBtreeTable(btree, ISqlJetDbHandle.MASTER_ROOT, false, false, meta.getEncoding());
        try {
            readShema(bt);
        } finally {
            bt.close();
        }
    }
    
    public ISqlJetBtree getBtree() {
        return btree;
    }

    /**
     * @return the meta
     */
    public SqlJetSchemaMeta getMeta() {
        return meta;
    }
    
    public Set<String> getTableNames() {
        return tableDefs.keySet();
    }

    public ISqlJetTableDef getTable(String name) {
        return tableDefs.get(name);
    }

    public Set<String> getIndexNames(String tableName) {
        final Set<String> indexNames = tableIndexes.get(tableName);
        if (indexNames == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(indexNames);
    }

    public int getIndexPage(String indexName) {
        final Integer page = indexPages.get(indexName);
        return page == null ? 0 : page;
    }

    private void readShema(SqlJetBtreeTable table) throws SqlJetException {
        for (ISqlJetBtreeRecord record = table.getRecord(); !table.eof(); table.next(), record = table.getRecord()) {
            final String type = SqlJetUtility.trim(record.getStringField(TYPE_FIELD, meta.getEncoding() ));
            if (null == type) {
                continue;
            }
            final String name = SqlJetUtility.trim(record.getStringField(NAME_FIELD, meta.getEncoding() ));
            if (null == name) {
                continue;
            }
            final int page = (int) record.getIntField(PAGE_FIELD);
            if (0 == page) {
                continue;
            }

            if (TABLE_TYPE.equals(type)) {
                String sql = record.getStringField(SQL_FIELD, meta.getEncoding() );
                // System.err.println(sql);
                CommonTree ast = parse(sql);
                ISqlJetTableDef tableDef = new SqlJetTableDef(ast, page);
                if (!name.equals(tableDef.getName())) {
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT);
                }
                tableDefs.put(name, tableDef);
            } else if (INDEX_TYPE.equals(type)) {
                indexPages.put(name, page);
                final String indexTableName = SqlJetUtility.trim(record.getStringField(TABLE_FIELD, meta.getEncoding() ));
                if (null == type) {
                    throw new SqlJetException(SqlJetErrorCode.CORRUPT);
                }
                Set<String> indexNames = tableIndexes.get(indexTableName);
                if (null == indexNames) {
                    tableIndexes.put(indexTableName, indexNames = new HashSet<String>());
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
        for (ISqlJetTableDef tableDef : tableDefs.values()) {
            buffer.append(tableDef.toString());
            buffer.append('\n');
        }
        buffer.append("Indexes:\n");
        for (String name : indexPages.keySet()) {
            buffer.append(indexPages.get(name));
            buffer.append(": ");
            buffer.append(name);
            buffer.append('\n');
        }
        return buffer.toString();
    }
}
