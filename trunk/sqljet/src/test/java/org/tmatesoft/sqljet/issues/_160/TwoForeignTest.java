package org.tmatesoft.sqljet.issues._160;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

public class TwoForeignTest extends AbstractNewDbTest {

	@Test
	public void testWithoutComma() throws SqlJetException {
		db.createTable("CREATE TABLE dummy_table ("
				+ "id integer PRIMARY KEY AUTOINCREMENT NOT NULL,"
				+ "content_id INTEGER," + "content_page_id INTEGER,"
				+ "FOREIGN KEY(content_id) REFERENCES content(id)"
				+ "FOREIGN KEY(content_page_id) REFERENCES content_page(id)"
				+ ")");
	}

	@Test
	public void testWithComma() throws SqlJetException {
		db.createTable("CREATE TABLE dummy_table ("
				+ "id integer PRIMARY KEY AUTOINCREMENT NOT NULL,"
				+ "content_id INTEGER," + "content_page_id INTEGER,"
				+ "FOREIGN KEY(content_id) REFERENCES content(id),"
				+ "FOREIGN KEY(content_page_id) REFERENCES content_page(id)"
				+ ")");
	}
}
