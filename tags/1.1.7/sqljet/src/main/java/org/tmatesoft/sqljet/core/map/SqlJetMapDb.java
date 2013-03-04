/**
 * SqlJetMapDb.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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

import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.ISqlJetPager;
import org.tmatesoft.sqljet.core.internal.map.SqlJetMap;
import org.tmatesoft.sqljet.core.internal.map.SqlJetMapDef;
import org.tmatesoft.sqljet.core.internal.schema.SqlJetSchema;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
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
    private static final String MAP_EXISTS = "Map '%s' exists";

    /**
     * 
     */
    private volatile Map<String, SqlJetMapDef> mapDefs;

    /**
     * @param file
     *            database file.
     * @param writable
     *            true if caller needs write access to the database.
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
     *            mode in which to run transaction.
     * @param transaction
     *            transaction to run.
     * @return result of {@link ISqlJetMapTransaction#run(SqlJetMapDb)} call.
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
     *            to run.
     * @return result of {@link ISqlJetMapTransaction#run(SqlJetMapDb)} call.
     */
    public Object runWriteTransaction(final ISqlJetMapTransaction transaction) throws SqlJetException {
        return runTransaction(SqlJetTransactionMode.WRITE, transaction);
    }

    /**
     * @param transaction
     *            transaction to run.
     * @return result of {@link ISqlJetMapTransaction#run(SqlJetMapDb)} call.
     */
    public Object runReadTransaction(final ISqlJetMapTransaction transaction) throws SqlJetException {
        return runTransaction(SqlJetTransactionMode.READ_ONLY, transaction);
    }

    /**
     * @param transaction
     *            transaction to run.
     * @return result of {@link ISqlJetMapTransaction#run(SqlJetMapDb)} call.
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
    private Map<String, SqlJetMapDef> getMapDefs() {
        if (mapDefs == null) {
            synchronized (this) {
                if (mapDefs == null) {
                    mapDefs = new TreeMap<String, SqlJetMapDef>(String.CASE_INSENSITIVE_ORDER);
                }
            }
        }
        return mapDefs;
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
            getMapDefs().clear();
            for (final String name : names) {
                final ISqlJetVirtualTableDef vtable = schema.getVirtualTable(name);
                if (MODULE_NAME.equalsIgnoreCase(vtable.getModuleName())) {
                    final ISqlJetIndexDef indexDef = schema.getIndex(getMapIndexName(name));
                    if (indexDef != null) {
                        final SqlJetMapDef mapTableDef = new SqlJetMapDef(name, vtable, indexDef);
                        getMapDefs().put(name, mapTableDef);
                    } else {
                        throw new SqlJetException(SqlJetErrorCode.CORRUPT, 
                                String.format("Map '%s' does not have index",name));
                    }
                }
            }
        }
    }

    /**
     * @return set of the map names stored in this database.
     */
    @SuppressWarnings("unchecked")
    public Set<String> getMapNames() throws SqlJetException {
        return (Set<String>) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                final Set<String> s = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                s.addAll(getMapDefs().keySet());
                return s;
            }
        });
    }

    /**
     * @param mapName
     *            name of the map to get definition for.
     * @return definition of the map with the specified name.
     */
    public ISqlJetMapDef getMapDef(final String mapName) throws SqlJetException {
        return (ISqlJetMapDef) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                return getMapDefs().get(mapName);
            }
        });
    }

    /**
     * @param mapName
     *            name of the map to created.
     * @return map that has been created.
     */
    public ISqlJetMapDef createMap(final String mapName) throws SqlJetException {
        if (getMapDefs().containsKey(mapName)) {
            throw new SqlJetException(String.format(MAP_EXISTS, mapName));
        } else {
            return (ISqlJetMapDef) runWriteTransaction(new ISqlJetMapTransaction() {
                public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                    final int page = btree.createTable(SqlJetSchema.BTREE_CREATE_TABLE_FLAGS);
                    final SqlJetSchema schema = getSchemaInternal();
                    final String create = String.format("create virtual table %s using %s", mapName, MODULE_NAME);
                    final ISqlJetVirtualTableDef vtable = schema.createVirtualTable(create, page);
                    final String indexName = getMapIndexName(mapName);
                    final ISqlJetIndexDef indexDef = schema.createIndexForVirtualTable(mapName, indexName);
                    final SqlJetMapDef mapDef = new SqlJetMapDef(mapName, vtable, indexDef);
                    getMapDefs().put(mapName, mapDef);
                    return mapDef;
                }

            });
        }
    }

    /**
     * @param mapTableName
     * @return
     */
    private String getMapIndexName(final String mapTableName) {
        return String.format("%s_%s_%d", MODULE_NAME, mapTableName, 1);
    }

    /**
     * @param mapName
     *            name of the map to get.
     * @return map table with the name specified.
     */
    public ISqlJetMap getMap(final String mapName) throws SqlJetException {
        checkOpen();
        return (ISqlJetMap) runSynchronized(new ISqlJetMapTransaction() {
            public Object run(SqlJetMapDb mapDb) throws SqlJetException {
                refreshSchema();
                final SqlJetMapDef mapDef = getMapDefs().get(mapName);
                if (mapDef != null) {
                    return new SqlJetMap(mapDb, btree, mapDef, writable);
                } else {
                    throw new SqlJetException(String.format(MAP_TABLE_DOES_NOT_EXIST, mapName));
                }
            }
        });
    }
}
