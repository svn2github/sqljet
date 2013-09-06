/**
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.examples.inventory;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryDB {

	private static final int VERSION = 2;

	private static final String FILE_NAME = "inventory.db";

	private SqlJetDb db;

	public InventoryDB() throws SqlJetException {
		db = SqlJetDb.open(new File(FILE_NAME), true);
		upgrade(VERSION);
	}

	public void close() throws SqlJetException {
		db.close();
		db = null;
	}

	public void beginTransaction(boolean write) throws SqlJetException {
		db.beginTransaction( write ? SqlJetTransactionMode.WRITE : SqlJetTransactionMode.READ_ONLY);
	}
	
	public void commit() throws SqlJetException {
		db.commit();
	}
	
	public int getVersion() throws SqlJetException {
		return db.getOptions().getUserVersion();
	}

	private void upgrade(int targetVersion) throws SqlJetException {
		if (targetVersion < 1) {
			return;
		}
		if (getVersion() < 1) {
			db.runWriteTransaction(new ISqlJetTransaction() {

				public Object run(SqlJetDb db) throws SqlJetException {
					db.createTable("create table items (article integer primary key, name text not null, description blob, "
							+ "room int, shelf int, borrowed_from text, borrowed_to text)");
					db.createIndex("create index items_name on items (name asc)");
					db.createIndex("create index items_name_rev on items (name desc)");
					db.createIndex("create index items_location on items (room, shelf)");
					db.getOptions().setUserVersion(1);
					prefillItems();
					return null;
				}
			});
		}
		if (targetVersion < 2) {
			return;
		}
		if (getVersion() < 2) {
			db.runWriteTransaction(new ISqlJetTransaction() {

				public Object run(SqlJetDb db) throws SqlJetException {
					db.createTable("create table users (name text primary key, info text, rating real)");
					db.getOptions().setUserVersion(2);
					prefillUsers();
					return null;
				}
			});
		}
		if (targetVersion > 2) {
			throw new IllegalArgumentException("Unsupported version: " + targetVersion);
		}
	}

	private void prefillItems() throws SqlJetException {
		addItem(new InventoryItem(-1, "MacBook", "Unibody 2GHz", 7, 23, "Dmitry Stadnik", null));
		addItem(new InventoryItem(-1, "iPhone 3G", "8Mb", 7, 24, "Dmitry Stadnik", null));
		addItem(new InventoryItem(-1, "Cup", "Big & White", 3, 1, null, "MG"));
	}

	private void prefillUsers() throws SqlJetException {
		addUser(new InventoryUser("Dmitry Stadnik", "Prague", 0.99));
		addUser(new InventoryUser("James Bond", "Classified", 0));
		addUser(new InventoryUser("MG", null, 0.11));
	}

	// Items

	public ISqlJetCursor getAllItems() throws SqlJetException {
		return db.getTable("items").open();
	}

	public ISqlJetCursor getAllItemsInRoomOnShelf(long room, long shelf) throws SqlJetException {
		return db.getTable("items").lookup("items_location", room, shelf);
	}

	public ISqlJetCursor getAllItemsSortedByName(boolean asc) throws SqlJetException {
		return db.getTable("items").order(asc ? "items_name" : "items_name_rev");
	}

	public InventoryItem getItem(final long article) throws SqlJetException {
		return (InventoryItem) db.runReadTransaction(new ISqlJetTransaction() {
			
			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetCursor cursor = db.getTable("items").open();
				try {
					if (cursor.goTo(article)) {
						InventoryItem item = new InventoryItem();
						item.read(cursor);
						return item;
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	public long addItem(final InventoryItem item) throws SqlJetException {
		return item.article = (Long) db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				byte[] blob = null;
				if (item.description != null) {
					try {
						blob = item.description.getBytes("UTF-8");
					} catch (UnsupportedEncodingException e) {
						throw new IllegalArgumentException(e);
					}
				}
				return db.getTable("items").insert(null, item.name, blob, item.room, item.shelf, item.borrowedTo,
						item.borrowedFrom);
			}
		});
	}

	public void updateItem(final long article, final Map<String, Object> values) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetCursor cursor = db.getTable("items").open();
				try {
					if (cursor.goTo(article)) {
						cursor.updateByFieldNames(values);
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	public void removeItem(final long article) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetCursor cursor = db.getTable("items").open();
				try {
					if (cursor.goTo(article)) {
						cursor.delete();
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	// Users

	public ISqlJetCursor getAllUsers() throws SqlJetException {
		return db.getTable("users").open();
	}

	public InventoryUser getUser(final String name) throws SqlJetException {
		return (InventoryUser) db.runReadTransaction(new ISqlJetTransaction() {
			
			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetTable users = db.getTable("users");
				ISqlJetCursor cursor = users.lookup(users.getPrimaryKeyIndexName(), name);
				try {
					if (!cursor.eof()) {
						InventoryUser user = new InventoryUser();
						user.read(cursor);
						return user;
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	public void addUser(final InventoryUser user) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				return db.getTable("users").insert(user.name, user.info, user.rating);
			}
		});
	}

	public void updateUser(final String name, final Map<String, Object> values) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetTable users = db.getTable("users");
				ISqlJetCursor cursor = users.lookup(users.getPrimaryKeyIndexName(), name);
				try {
					if (!cursor.eof()) {
						cursor.updateByFieldNames(values);
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}

	public void removeUser(final String name) throws SqlJetException {
		db.runWriteTransaction(new ISqlJetTransaction() {

			public Object run(SqlJetDb db) throws SqlJetException {
				ISqlJetTable users = db.getTable("users");
				ISqlJetCursor cursor = users.lookup(users.getPrimaryKeyIndexName(), name);
				try {
					if (!cursor.eof()) {
						cursor.delete();
					}
				} finally {
					cursor.close();
				}
				return null;
			}
		});
	}
}
