package org.tmatesoft.sqljet.issues._172;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;

public class FuncSqlParserTest extends AbstractNewDbTest {

	@Test
	public void testFuncSqlParser() throws Exception {
		//db.createTable("create table t(a string, b string, c string);");
		db.createView("create view v as select func(a) from t");
		db.getSchema();
	}

	@Test
	public void testFuncSqlParser2() throws Exception {
		//db.createTable("create table t(a string, b string, c string);");
		db.createView("CREATE VIEW meta AS " +
        " SELECT id, title, " +
        "       (SELECT sortconcat(bal.id, name) FROM books_authors_link AS bal JOIN authors ON(author = authors.id) WHERE book = books.id) authors, " +
        "       (SELECT name FROM publishers WHERE publishers.id IN (SELECT publisher from books_publishers_link WHERE book=books.id)) publisher, " +
        "       uuid " +
        " FROM books ");
		db.getSchema();
	}

}
