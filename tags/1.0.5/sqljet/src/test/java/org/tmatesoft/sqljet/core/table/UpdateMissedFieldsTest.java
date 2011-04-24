/**
 * UpdateTest.java
 * Copyright (C) 2009-2011 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.table;

import java.util.Collections;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class UpdateMissedFieldsTest extends AbstractNewDbTest {

    private final static Map<String, Object> EMPTY = Collections.emptyMap();

    private final static Map<String, Object> B = Collections.singletonMap("b", (Object) new Long(10));

    private final static Map<String, Object> C = Collections.singletonMap("c", (Object) "c");

    private interface CursorOperation {
        void operation(ISqlJetCursor cursor) throws SqlJetException;
    }

    private ISqlJetTable table;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        db.createTable("create table t(a integer primary key, b integer, c text)");
        table = db.getTable("t");
        table.insert(null, 1, "a");
        table.insert(null, 2, "b");
    }

    private void assertNotNulls() throws SqlJetException {
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = table.open();
                try {
                    int fieldsCount = c.getFieldsCount();
                    while (!c.eof()) {
                        for (int field = 0; field < fieldsCount; field++) {
                            Assert.assertFalse(c.isNull(field));
                            Assert.assertNotNull(c.getValue(field));
                        }
                        c.next();
                    }
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

    private void doOperationTest(final CursorOperation op) throws SqlJetException {
        assertNotNulls();
        db.runWriteTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                ISqlJetCursor c = table.open();
                try {
                    while (!c.eof()) {
                        op.operation(c);
                        c.next();
                    }
                } finally {
                    c.close();
                }
                return null;
            }
        });
        assertNotNulls();
    }

    @Test
    public void testUpdate() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.update();
            }
        });
    }

    @Test
    public void testUpdateOr() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateOr(SqlJetConflictAction.REPLACE);
            }
        });
    }

    @Test
    public void testUpdateWithRowId() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateWithRowId(cursor.getRowId());
            }
        });
    }

    @Test
    public void testUpdateWithRowIdOr() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateWithRowIdOr(SqlJetConflictAction.REPLACE, cursor.getRowId());
            }
        });
    }

    @Test
    public void testUpdateByFieldNames() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNames(EMPTY);
            }
        });
    }

    @Test
    public void testUpdateByFieldNamesOr() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNamesOr(SqlJetConflictAction.REPLACE, EMPTY);
            }
        });
    }

    @Test
    public void testUpdateB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.update(cursor.getRowId(), 10);
            }
        });
    }

    @Test
    public void testUpdateOrB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateOr(SqlJetConflictAction.REPLACE, 10);
            }
        });
    }

    @Test
    public void testUpdateWithRowIdB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateWithRowId(cursor.getRowId(), 10);
            }
        });
    }

    @Test
    public void testUpdateWithRowIdOrB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateWithRowIdOr(SqlJetConflictAction.REPLACE, cursor.getRowId(), 10);
            }
        });
    }

    @Test
    public void testUpdateByFieldNamesB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNames(B);
            }
        });
    }

    @Test
    public void testUpdateByFieldNamesOrB() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNamesOr(SqlJetConflictAction.REPLACE, B);
            }
        });
    }

    @Test
    public void testUpdateByFieldNamesC() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNames(C);
            }
        });
    }

    @Test
    public void testUpdateByFieldNamesOrC() throws SqlJetException {
        doOperationTest(new CursorOperation() {
            public void operation(ISqlJetCursor cursor) throws SqlJetException {
                cursor.updateByFieldNamesOr(SqlJetConflictAction.REPLACE, C);
            }
        });
    }

}
