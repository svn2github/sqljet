package org.tmatesoft.sqljet.issues._174;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

@Ignore
public class NullPKTest extends AbstractNewDbTest {

	@Test
	public void testNulPK() throws SqlJetException {
		final SqlJetDb sqlJetDb = db;
		sqlJetDb.createTable("CREATE TABLE MY_TABLE (id INTEGER NOT NULL PRIMARY KEY, field1 TEXT, field2 TEXT)");

		sqlJetDb.beginTransaction(SqlJetTransactionMode.WRITE);

		ISqlJetTable table = sqlJetDb.getTable("MY_TABLE");
		table.insert("value1", "value2");
		table.insert(null, "value2");
		sqlJetDb.commit();

		sqlJetDb.beginTransaction(SqlJetTransactionMode.READ_ONLY);
		table = sqlJetDb.getTable("MY_TABLE");
		final ISqlJetCursor cursor = table.open();
		int i = 0;
		while (!cursor.eof()) {
			final String value1 = cursor.getString(1);
			final String value2 = cursor.getString(2);

			switch (i) {
			case 0:
				Assert.assertEquals("value1", value1);
				Assert.assertEquals("value2", value2);
				break;
			case 1:
				Assert.assertEquals(null, value1);
				Assert.assertEquals("value2", value2);
				break;
			default:
				break;
			}

			cursor.next();
			i++;
		}
		sqlJetDb.commit();
	}

}
