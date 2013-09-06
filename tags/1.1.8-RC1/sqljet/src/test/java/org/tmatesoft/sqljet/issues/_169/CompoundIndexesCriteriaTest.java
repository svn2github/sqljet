package org.tmatesoft.sqljet.issues._169;

import java.io.File;

import org.junit.*;
import org.tmatesoft.sqljet.core.table.*;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;

public class CompoundIndexesCriteriaTest {

	protected File file;
	protected SqlJetDb db;

	@Before
	public void setUp() throws Exception {
		file = File.createTempFile(this.getClass().getSimpleName(), null);
		file.deleteOnExit();
		db = SqlJetDb.open(file, true);
	}

	@After
	public void tearDown() throws Exception {
		if (db != null) {
			db.close();
		}
	}

	@Test
	public void testCompoundIndexesCriteriaABC() throws Exception {

		final ISqlJetTableDef t = db.createTable("create table t(a,b,c);");
		db.createIndex("create index i on t(a,b)");
		final ISqlJetTable table = db.getTable(t.getName());
		
		table.insert("a", "b", "c");
		table.insert("d", "e", "f");
		table.insert("a", "c", "b");
		table.insert("d", "f", "e");
		table.insert("a", "b", "c");
		table.insert("d", "e", "f");
		
		db.runReadTransaction(new ISqlJetTransaction() {
			public Object run(SqlJetDb db) throws SqlJetException {
				final ISqlJetCursor lookup = table.lookup("i", "a", "b");
				Assert.assertEquals(2, lookup.getRowCount());
				return null;
			}
		});

		db.runReadTransaction(new ISqlJetTransaction() {
			public Object run(SqlJetDb db) throws SqlJetException {
				final ISqlJetCursor lookup = table.lookup("i", "d", "e");
				Assert.assertEquals(2, lookup.getRowCount());
				return null;
			}
		});

	}

	@Test
	public void testCompoundIndexesCriteria123() throws Exception {
		final ISqlJetTableDef t = db.createTable("create table t(a,b,c);");
		db.createIndex("create index i on t(a,b)");
		final ISqlJetTable table = db.getTable(t.getName());
		table.insert(1, 2, 3);
		table.insert(4, 5, 6);
		table.insert(1, 3, 2);
		table.insert(4, 7, 7);
		table.insert(1, 2, 3);
		table.insert(4, 5, 6);
		db.runReadTransaction(new ISqlJetTransaction() {
			public Object run(SqlJetDb db) throws SqlJetException {
				final ISqlJetCursor lookup = table.lookup("i", 1, 2);
				Assert.assertEquals(2, lookup.getRowCount());
				return null;
			}
		});
		db.runReadTransaction(new ISqlJetTransaction() {
			public Object run(SqlJetDb db) throws SqlJetException {
				final ISqlJetCursor lookup = table.lookup("i", 4, 5);
				Assert.assertEquals(2, lookup.getRowCount());
				return null;
			}
		});
	}

}
