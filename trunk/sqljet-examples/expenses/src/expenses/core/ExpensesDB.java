/**
 * Copyright (C) 2009-2010 TMate Software Ltd
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
package expenses.core;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class ExpensesDB {

	private static final String FILE_NAME = "expenses.db";
	private static final String DF_PATTERN = "yyyy-MM-dd";

	private static SqlJetDb db;

	public static DateFormat getDateFormat() {
		return new SimpleDateFormat(DF_PATTERN, Locale.ENGLISH);
	}

	public static SqlJetDb open() throws SqlJetException {
		db = SqlJetDb.open(new File(FILE_NAME), true);
		if (db.getSchema().getTable("payments") == null) {
			db.runWriteTransaction(new ISqlJetTransaction() {

				public Object run(SqlJetDb arg0) throws SqlJetException {
					db.createTable(
									"create table payments (date int not null, amount int not null, currency text, info text)");
					db.createIndex(
							"create index payments_date on payments (date)");
					prefillDB();
					return null;
				}
			});
		}
		return db;
	}

	public static void close() throws SqlJetException {
		db.close();
		db = null;
	}
	
	public static void beginReadTransaction() throws SqlJetException {
		db.beginTransaction(SqlJetTransactionMode.READ_ONLY);		
	}
	
	public static void commitTransaction() throws SqlJetException {
		db.commit();
	}	

	public static ISqlJetCursor getAllPayments() throws SqlJetException {
		return db.getTable("payments").order("payments_date");
	}

	public static ISqlJetCursor getAllPayments(long from, long to) throws SqlJetException {
        return db.getTable("payments").scope("payments_date", new Object[] {Math.min(from, to)}, new Object[] {Math.max(from, to)});
    }

	public static Payment getPayment(long rowid) throws SqlJetException {
		ISqlJetCursor cursor = db.getTable("payments").open();
		try {
			if (cursor.goTo(rowid)) {
				Payment p = Payment.read(cursor);
				return p;
			}
		} finally {
			cursor.close();
		}
		return null;
	}

	public static long addPayment(final Payment p) throws SqlJetException {
		return (Long) db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				return db.getTable("payments").insert(p.date, p.amount,
						p.currency, p.info);
			}
		});
	}

	public static void updatePayment(final long rowid, final Payment p)
			throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetCursor cursor = db.getTable("payments").open();
				try {
					if (cursor.goTo(rowid)) {
						String dateString = getDateFormat().format(p.date);
						cursor.update(dateString, p.amount, p.currency, p.info);
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	public static void removePayment(final long rowid) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetCursor cursor = db.getTable("payments").open();
				try {
					if (cursor.goTo(rowid)) {
						cursor.delete();
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	private static void prefillDB() throws SqlJetException {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2009, 6, 28);
		addPayment(new Payment(cal.getTime().getTime(), -999, "USD", "New MacBook"));
		cal.set(2009, 6, 29);
		addPayment(new Payment(cal.getTime().getTime(), 2000, "EUR", "Salary"));
        cal.set(2009, 6, 27);
        addPayment(new Payment(cal.getTime().getTime(), -199, "USD", "New iPhone"));
	}
}
