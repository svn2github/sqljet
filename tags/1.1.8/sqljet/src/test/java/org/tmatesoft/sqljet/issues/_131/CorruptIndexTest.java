/**
 * CorruptIndexTest.java
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
package org.tmatesoft.sqljet.issues._131;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.SqlJetConflictAction;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class CorruptIndexTest extends AbstractNewDbTest {

    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS child_beans_many (child_bean_many_id INTEGER PRIMARY KEY AUTOINCREMENT,note TEXT,test_bean_id INTEGER );";
    public static final String CREATE_INDEX = "CREATE INDEX IF NOT EXISTS child_beans_many_test_bean_id_idx ON child_beans_many(test_bean_id);";

    @Test
    public void testCorruptIndex() throws Exception {
      db.createTable(CREATE_TABLE);
      db.createIndex(CREATE_INDEX);

      ISqlJetTable table = db.getTable("child_beans_many");
      db.beginTransaction(SqlJetTransactionMode.WRITE);

      try {
        for (int i = 0; i < 5; i++) {
          table.insertOr(SqlJetConflictAction.REPLACE, null, "test note", 1);
        }
      } finally {
        db.commit();
      }

      /// and after that disappears row with pk 1
      table.insertOr(SqlJetConflictAction.REPLACE, 2, "test note", 1);

      db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
      try {
        ISqlJetCursor cursor = table.lookup(table.getPrimaryKeyIndexName(), 1);
        assertFalse(cursor.eof());
      } finally {
        db.commit();
      }

    }

}
