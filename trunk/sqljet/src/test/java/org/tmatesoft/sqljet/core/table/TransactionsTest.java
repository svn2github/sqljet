package org.tmatesoft.sqljet.core.table;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

public class TransactionsTest extends AbstractNewDbTest {

	@Test
	public void testWriteInRead() throws SqlJetException {
		assertEquals(Boolean.TRUE,
				db.runReadTransaction(new ISqlJetTransaction() {

					public Object run(SqlJetDb db) throws SqlJetException {
						return db.runWriteTransaction(new ISqlJetTransaction() {

							public Object run(SqlJetDb db)
									throws SqlJetException {
								return true;
							}
						});
					}
				}));
	}

	@Test
	public void testReadInRead() throws SqlJetException {
		assertEquals(Boolean.TRUE,
				db.runReadTransaction(new ISqlJetTransaction() {

					public Object run(SqlJetDb db) throws SqlJetException {
						return db.runReadTransaction(new ISqlJetTransaction() {

							public Object run(SqlJetDb db)
									throws SqlJetException {
								return true;
							}
						});
					}
				}));
	}

	@Test
	public void testReadInWrite() throws SqlJetException {
		assertEquals(Boolean.TRUE,
				db.runWriteTransaction(new ISqlJetTransaction() {

					public Object run(SqlJetDb db) throws SqlJetException {
						return db.runReadTransaction(new ISqlJetTransaction() {

							public Object run(SqlJetDb db)
									throws SqlJetException {
								return true;
							}
						});
					}
				}));
	}

	@Test
	public void testWriteInWrite() throws SqlJetException {
		assertEquals(Boolean.TRUE,
				db.runWriteTransaction(new ISqlJetTransaction() {

					public Object run(SqlJetDb db) throws SqlJetException {
						return db.runWriteTransaction(new ISqlJetTransaction() {

							public Object run(SqlJetDb db)
									throws SqlJetException {
								return true;
							}
						});
					}
				}));
	}

}
