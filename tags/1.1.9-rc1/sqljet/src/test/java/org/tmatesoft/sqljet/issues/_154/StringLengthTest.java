package org.tmatesoft.sqljet.issues._154;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

public class StringLengthTest extends AbstractNewDbTest {

	@Test
	public void stringLengthTest() throws SqlJetException {
		db.createTable("CREATE TABLE record (a NONE NOT NULL)");
		ISqlJetTable table = db.getTable("record");
		table.insert("10");
		db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
		try {
			ISqlJetCursor cursor = table.open();
			boolean more = !cursor.eof();
			while (more) {
				String s = cursor.getString(0);
				Assert.assertEquals(2, s.length());
				more = cursor.next();
			}
		} finally {
			db.commit();
		}
	}

}
