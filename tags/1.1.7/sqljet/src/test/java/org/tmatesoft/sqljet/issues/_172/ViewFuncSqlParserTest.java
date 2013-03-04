package org.tmatesoft.sqljet.issues._172;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractDataCopyTest;
import org.tmatesoft.sqljet.core.schema.ISqlJetSchema;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class ViewFuncSqlParserTest extends AbstractDataCopyTest {

	private static final String DB = "src/test/data/issues/172/metadata.db";

	@Test
	public void testViewFuncSqlParser() throws Exception {
		final File f = copyFile(new File(DB), true);
		final SqlJetDb db = new SqlJetDb(f, true);
		try {
			db.open();
			assertTrue(db.isOpen());
			final ISqlJetSchema schema = db.getSchema();
			assertNotNull(schema);
		} finally {
			db.close();
			f.delete();
		}
	}

}
