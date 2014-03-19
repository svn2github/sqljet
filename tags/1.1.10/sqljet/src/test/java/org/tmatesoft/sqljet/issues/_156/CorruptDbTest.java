package org.tmatesoft.sqljet.issues._156;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;

public class CorruptDbTest extends AbstractNewDbTest {

	private static final int TAILLE = 15000;

	private Random random = new Random();
	private byte[] tab = new byte[TAILLE];

	@Test
	public void testCorruptDB() throws SqlJetException {

		db.createTable("CREATE TABLE test ("
				+ "    pk INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
				+ "    preview BLOB)");

		addRows();
		removeAllRows();
		addRows();

	}

	private void addRows() throws SqlJetException {
		final int rowCount = 100;

		db.beginTransaction(SqlJetTransactionMode.EXCLUSIVE);

		try {

			// Create X rows
			final ISqlJetTable testTable = db.getTable("test");
			for (int i = 0; i < rowCount; i++) {
				final Map<String, Object> values = new HashMap<String, Object>();
				values.put("preview", createByte());

				final long pkTestTable = testTable.insertByFieldNames(values);
				System.out.println("PK : " + pkTestTable);
			}

			// Commit & Close
			db.commit();

		} catch (SqlJetException e) {
			db.rollback();
			throw e;
		}
	}

	private byte[] createByte() {
		random.nextBytes(tab);
		return tab;
	}

	private void removeAllRows() throws SqlJetException {
		db.beginTransaction(SqlJetTransactionMode.EXCLUSIVE);

		try {

			// Remove all rows
			ISqlJetCursor curseur = null;
			final ISqlJetTable tableDossiers = db.getTable("test");
			curseur = tableDossiers.open();
			while (!curseur.eof()) {
				curseur.delete();
			}
			curseur.close();

			// Commit & close
			db.commit();

		} catch (SqlJetException e) {
			db.rollback();
			throw e;
		}

	}

}
