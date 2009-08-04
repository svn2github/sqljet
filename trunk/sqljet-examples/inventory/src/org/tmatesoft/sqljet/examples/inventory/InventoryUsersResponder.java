/**
 * Copyright (C) 2009 TMate Software Ltd
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
			ISqlJetCursor cursor = db.getAllUsers();
			try {
				printUsers(db, buffer, cursor);
			} finally {
				cursor.close();
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
			buffer.append("<td><a href='/edit_user?name=");
			buffer.append(user.name);
			buffer.append("'>Edit</a></td>");
			buffer.append("<td><a href='/remove_user?name=");
			buffer.append(user.name);
			buffer.append("'>Remove</a></td>");
			buffer.append("</tr>");
			cursor.next();
		}
		buffer.append("<tr><td colspan='3'></td><td colspan='2'><a href='/add_user'>Add User</a></td></tr>");
		buffer.append("</table>");
		printReturnToInventory(buffer);
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

	private void printReturnToInventory(StringBuffer buffer) {
		buffer.append("<hr><a href='/'>Return to inventory</a>");
	}
}
