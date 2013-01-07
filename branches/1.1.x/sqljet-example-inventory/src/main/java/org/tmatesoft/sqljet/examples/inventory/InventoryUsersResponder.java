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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryUsersResponder {

	public void showUsers(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		buffer.append("<h2>Users</h2>");
		InventoryDB db = new InventoryDB();
		try {
			db.beginTransaction(false);
			try {
				ISqlJetCursor cursor = db.getAllUsers();
				try {
					printUsers(db, buffer, cursor);
				} finally {
					cursor.close();
				}
			} finally {
				db.commit();
			}
		} finally {
			db.close();
		}
	}

	private void printUsers(InventoryDB db, StringBuffer buffer, ISqlJetCursor cursor) throws SqlJetException {
		buffer.append("<table class='users'><tr><th>Name</th><th>Info</th><th>Rating</th>");
		buffer.append("<th colspan='2'>Action</th><tr>");
		InventoryUser user = new InventoryUser();
		while (!cursor.eof()) {
			user.read(cursor);
			buffer.append("<tr>");
			printValue(buffer, user.name);
			printValue(buffer, user.info);
			printValue(buffer, user.rating);
			if (user.name == null) {
				buffer.append("<td></td>");
			} else {
				try {
					String name = URLEncoder.encode(user.name, "UTF-8");
					buffer.append("<td><a href='/edit_user?name=");
					buffer.append(name);
					buffer.append("'>Edit</a></td>");
					buffer.append("<td><a href='/remove_user?name=");
					buffer.append(name);
					buffer.append("'>Remove</a></td>");
				} catch (UnsupportedEncodingException e) {
					throw new IllegalStateException(e);
				}
			}
			buffer.append("</tr>");
			cursor.next();
		}
		buffer.append("<tr><td colspan='3'></td><td colspan='2'><a href='/add_user'>Add User</a></td></tr>");
		buffer.append("</table>");
		buffer.append("<hr><a href='/'>Show inventory</a>");
	}

	private void printValue(StringBuffer buffer, Object value) {
		buffer.append("<td");
		if (value instanceof Number) {
			buffer.append(" style='text-align: right;'");
		}
		buffer.append(">");
		if (value != null) {
			buffer.append(value);
		} else {
			buffer.append("&nbsp;");
		}
		buffer.append("</td>");
	}

	private void printReturnToUsers(StringBuffer buffer) {
		buffer.append("<hr><a href='/users'>Return to users</a>");
	}

	public void showAddForm(StringBuffer buffer) {
		buffer.append("<h2>Add User</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Name:</td><td><input type='text' name='name'/></td></tr>");
		buffer.append("<tr><td>Info:</td><td><input type='text' name='info'/></td></tr>");
		buffer.append("<tr><td>Rating:</td><td><input type='text' name='rating' style='text-align: right;'/></td></tr>");
		buffer.append("</table><input type='submit' value='Add'></form>");
		printReturnToUsers(buffer);
	}

	public void processAddForm(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		try {
			InventoryUser user = new InventoryUser();
			user.name = params.get("name");
			if (user.name == null) {
				throw new IllegalArgumentException("Name is not specified.");
			}
			user.info = params.get("info");
			String rating = params.get("rating");
			try {
				if (rating != null) {
					user.rating = Double.parseDouble(rating);
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("Rating is invalid: " + rating);
			}
			InventoryDB db = new InventoryDB();
			try {
				if (db.getUser(user.name) != null) {
					throw new IllegalArgumentException("User '" + user.name + "' already exists.");
				}
				db.addUser(user);
			} finally {
				db.close();
			}
			buffer.append("User was added.");
		} catch (IllegalArgumentException e) {
			buffer.append("Invalid input! " + e.getMessage());
		}
		printReturnToUsers(buffer);
	}

	private InventoryUser findUser(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		if (!params.containsKey("name")) {
			buffer.append("Name is not specified.");
			printReturnToUsers(buffer);
			return null;
		}
		String name;
		try {
			name = params.get("name");
		} catch (Exception e) {
			buffer.append("User name is not specified.");
			printReturnToUsers(buffer);
			return null;
		}
		InventoryUser user;
		InventoryDB db = new InventoryDB();
		try {
			user = db.getUser(name);
		} finally {
			db.close();
		}
		if (user == null) {
			buffer.append("User with name '");
			buffer.append(name);
			buffer.append("' is not found.");
			printReturnToUsers(buffer);
			return null;
		}
		return user;
	}

	public void editUser(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		InventoryUser user = findUser(buffer, params);
		if (user != null) {
			if (params.size() == 1) {
				showEditForm(buffer, user);
			} else {
				processEditForm(buffer, user, params);
			}
			printReturnToUsers(buffer);
		}
	}

	public void showEditForm(StringBuffer buffer, InventoryUser user) throws SqlJetException {
		buffer.append("<h2>Edit User ");
		buffer.append(user.name);
		buffer.append("</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Info:</td><td><input type='text' name='info'");
		if (user.info != null) {
			buffer.append(" value='");
			buffer.append(user.info);
			buffer.append("'");
		}
		buffer.append("/></td></tr>");
		buffer.append("<tr><td>Rating:</td><td><input type='text' name='rating' value='");
		buffer.append(user.rating);
		buffer.append("' style='text-align: right;'/></td></tr>");
		buffer.append("</table><input type='submit' value='Update'/>");
		buffer.append("<input type='hidden' name='name' value='");
		buffer.append(user.name);
		buffer.append("'/></form>");
	}

	public void processEditForm(StringBuffer buffer, InventoryUser user, Map<String, String> params)
			throws SqlJetException {
		try {
			Map<String, Object> values = new HashMap<String, Object>();
			String name = params.get("name");
			if (name == null) {
				throw new IllegalArgumentException("Name is not specified.");
			} else {
				values.put("name", name);
			}
			values.put("info", params.get("info"));
			String rating = params.get("rating");
			if (rating != null) {
				try {
					values.put("rating", Double.parseDouble(rating));
				} catch (Exception e) {
					throw new IllegalArgumentException("Rating is invalid: " + rating);
				}
			}
			InventoryDB db = new InventoryDB();
			try {
				db.updateUser(user.name, values);
			} finally {
				db.close();
			}
			buffer.append("User was updated.");
		} catch (IllegalArgumentException e) {
			buffer.append("Invalid input! " + e.getMessage());
		}
	}

	public void removeUser(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		InventoryUser user = findUser(buffer, params);
		if (user != null) {
			InventoryDB db = new InventoryDB();
			try {
				db.removeUser(user.name);
			} finally {
				db.close();
			}
			buffer.append("User was removed.");
			printReturnToUsers(buffer);
		}
	}
}
