/**
 * SqlJetMapDb.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.map;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.ISqlJetPager;
import org.tmatesoft.sqljet.core.internal.map.SqlJetMapTable;
import org.tmatesoft.sqljet.core.internal.map.SqlJetMapTableDef;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetVirtualTableDef;
import org.tmatesoft.sqljet.core.table.engine.ISqlJetEngineSynchronized;
import org.tmatesoft.sqljet.core.table.engine.ISqlJetEngineTransaction;
import org.tmatesoft.sqljet.core.table.engine.SqlJetEngine;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMapDb extends SqlJetEngine {

    /**
     * 
     */
    private static final String MAP_TABLE_DOES_NOT_EXIST = "Map table '%s' does not exist";

    /**
     * File name for in memory database.
     */
    public static final File IN_MEMORY = new File(ISqlJetPager.MEMORY_DB);

    /**
     * 
     */
    public static final String MODULE_NAME = "sqljetmap";

    /**
     * 
     */
    private static final String MAP_TABLE_EXISTS = "Map table '%s' exists";

    /**
     * 
     */
    private volatile Map<String, SqlJetMapTableDef> mapTableDefs;

    /**
     * @param file
     * @param writable
     */
    public SqlJetMapDb(File file, boolean writable) {
        super(file, writable);
    }

    public static SqlJetMapDb open(File file, boolean writable) throws SqlJetException {
        final SqlJetMapDb mapDb = new SqlJetMapDb(file, writable);
        mapDb.open();
        return mapDb;
    }

    /**
     * @param mode
     * @param transaction
     * @return
     * @throws SqlJetException
     */
    public Object runTransaction(final SqlJetTransactionMode mode, final ISqlJetMapTransaction transaction)
            throws SqlJetException {
        checkOpen();
        return runEngineTransaction(new ISqlJetEngineTransaction() {
            public Object run(SqlJetEngine engine) throws SqlJetException {
                return transaction.run(SqlJetMapDb.this);
            }
        }, mode);
    }

    /**
     * @param transaction
     * @return
     * @throws SqlJetException
     */
    public Object runWriteTransaction(final ISqlJetMapTransaction transaction) throws SqlJetException {
        return runTransaction(SqlJetTransactionMode.WRITE, transaction);
    }

    /**
     * @param transaction
     * @return
     * @throws SqlJetException
     */
    public Object runReadTransaction(final ISqlJetMapTransaction transaction) throws SqlJetException {
        return runTransaction(SqlJetTransactionMode.READ_ONLY, transaction);
    }

    /**
     * @param transaction
     * @return
     * @throws SqlJetException
     */
    public Object runSynchronized(final ISqlJetMapTransaction transaction) throws SqlJetException {
        return runSynchronized(new ISqlJetEngineSynchronized() {
            public Object runSynchronized(SqlJetEngine engine) throws SqlJetException {
                return transaction.run(SqlJetMapDb.this);
            }
        });
    }

    /**
     * 
     */
    private Map<String, SqlJetMapTableDef> getMapTableDefs() {
        if (mapTableDefs == null) {
            synchronized (this) {
                if (mapTableDefs == null) {
                    mapTableDefs = new TreeMap<String, SqlJetMapTableDef>(String.CASE_INSENSITIVE_ORDER);
                }
            }
        }
        return mapTableDefs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.table.engine.SqlJetEngine#readSchema()
     */
    @Override
    protected void readSchema() throws SqlJetException {
        super.readSchema();
        readMapDefs();
    }

    /**
     * @throws SqlJetException
     * 
     */
    private void readMapDefs() throws SqlJetException {
        final SqlJetSchema schema = getSchemaInternal();
        final Set<String> names = schema.getVirtualTableNames();
        if (names != null && names.size() > 0) {
            getMapTableDefs().clear();
            for (final String name : names) {
                final ISqlJetVirtualTableDef vtable = schema.getVirtualTable(name);
                if (MODULE_NAME.equalsIgnoreCase(vtable.getModuleName())) {
                    final SqlJetMapTableDef mapTableDef = new SqlJetMapTableDef(name, vtable);
                    getMapTableDefs().put(name, mapTableDef);
                }
            }
        }
    }

    /**
     * @return
     * @throws SqlJetException
     */
    @SuppressWarnings("unchecked")
    public Set<String> getMapTableNames() throws SqlJetException {
        return (Set<String>) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                final Set<String> s = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                s.addAll(getMapTableDefs().keySet());
                return s;
            }
        });
    }

    /**
     * @param mapTableName
     * @return
     * @throws SqlJetException
     */
    public ISqlJetMapTableDef getMapTableDef(final String mapTableName) throws SqlJetException {
        return (ISqlJetMapTableDef) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                return getMapTableDefs().get(mapTableName);
            }
        });
    }

    /**
     * @param mapTableName
     * @return
     * @throws SqlJetException
     */
    public ISqlJetMapTableDef createMapTable(final String mapTableName) throws SqlJetException {
        if (getMapTableDefs().containsKey(mapTableName)) {
            throw new SqlJetException(String.format(MAP_TABLE_EXISTS, mapTableName));
        } else {
            return (ISqlJetMapTableDef) runWriteTransaction(new ISqlJetMapTransaction() {
                public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                    final int page = btree.createTable(SqlJetSchema.BTREE_CREATE_TABLE_FLAGS);
                    final String create = String.format("create virtual table %s using %s", mapTableName, MODULE_NAME);
                    final ISqlJetVirtualTableDef vtable = getSchemaInternal().createVirtualTable(create, page);
                    final SqlJetMapTableDef mapTableDef = new SqlJetMapTableDef(mapTableName, vtable);
                    getMapTableDefs().put(mapTableName, mapTableDef);
                    return mapTableDef;
                }
            });
        }
    }

    /**
     * @param mapTableName
     * @return
     * @throws SqlJetException
     */
    public ISqlJetMapTable getMapTable(final String mapTableName) throws SqlJetException {
        checkOpen();
        return (SqlJetMapTable) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                refreshSchema();
                final SqlJetMapTableDef mapTableDef = getMapTableDefs().get(mapTableName);
                if (mapTableDef != null) {
                    return new SqlJetMapTable(mapDb, btree, mapTableDef, writable);
                } else {
                    throw new SqlJetException(String.format(MAP_TABLE_DOES_NOT_EXIST, mapTableName));
                }
            }
        });
    }
}
