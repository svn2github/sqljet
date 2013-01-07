package org.tmatesoft.sqljet.issues.threads;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class SharedLockNullTest extends AbstractNewDbTest {

	@Test
	public void sharedLockNullTest() throws SqlJetException {
		db.createTable("create table t(t text);");
		final SqlJetDb connect1 = SqlJetDb.open(file, false);
		final SqlJetDb connect2 = SqlJetDb.open(file, true);
		final SqlJetDb connect3 = SqlJetDb.open(file, false);
		try {
			connect1.beginTransaction(SqlJetTransactionMode.READ_ONLY);
			connect2.beginTransaction(SqlJetTransactionMode.WRITE);
			connect2.getTable("t").insert("t");
			try {
				connect2.commit();
			} catch (SqlJetException e) {
				connect3.beginTransaction(SqlJetTransactionMode.READ_ONLY);
			} finally {
				try {
					connect1.rollback();
					connect2.rollback();
					connect3.rollback();
				} catch (Throwable e) {

				}
			}
		} finally {
			try {
				connect1.close();
				connect2.close();
				connect3.close();
			} catch (Throwable e) {

			}
		}
	}

}
