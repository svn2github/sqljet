/**
 * AbstractNewDbTest.java
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
package org.tmatesoft.sqljet.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;
import org.tmatesoft.sqljet.core.table.SqlJetScope;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
abstract public class AbstractNewDbTest extends AbstractDataCopyTest {

    protected File file;
    protected SqlJetDb db;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        file = File.createTempFile(this.getClass().getSimpleName(), null);
        file.deleteOnExit();
        db = SqlJetDb.open(file, true);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        try {
            if (db != null) {
                db.close();
            }
        } finally {
            if (file != null) {
                SqlJetFileUtil.deleteFile(file);
            }
        }
    }

    protected void assertScope(SqlJetScope scope, String tableName, String indexName, Object... expectedKeysInScope) throws SqlJetException {
        assertScope(scope, tableName, indexName, false, expectedKeysInScope);
    }

    protected void assertScope(SqlJetScope scope, String tableName, String indexName, boolean allFields, Object... expectedKeysInScope) throws SqlJetException {
        List<?> expected = Arrays.asList(expectedKeysInScope);
        List<?> actualValuesInScope = queryScope(scope, tableName, indexName, allFields);
        Assert.assertTrue(Arrays.deepEquals(expected.toArray(), actualValuesInScope.toArray()));
    }

    private List<?> queryScope(final SqlJetScope scope, final String tableName, final String indexName, final boolean allFields) throws SqlJetException {
        return (List<?>) db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                List<Object> valuesInScope = new ArrayList<Object>();  
                ISqlJetCursor scopeCursor = db.getTable(tableName).scope(indexName, scope);
                Assert.assertNotNull(scopeCursor);
                try {
                    while(!scopeCursor.eof()) {
                        if (scopeCursor.getFieldsCount() == 1 || !allFields) {
                            valuesInScope.add(scopeCursor.getValue(0));
                        } else {
                            Object[] values = new Object[scopeCursor.getFieldsCount()];
                            for (int i = 0; i < values.length; i++) {
                                values[i] = scopeCursor.getValue(i);
                            }
                            valuesInScope.add(values);
                        }
                        scopeCursor.next();
                    }
                } finally {
                    scopeCursor.close();
                }
                return valuesInScope;
            }
        });
    }

}
