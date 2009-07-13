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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryServlet {

	private static final byte[] EOL = { (byte) '\r', (byte) '\n' };

	private final Socket socket;

	public InventoryServlet(Socket socket) {
		this.socket = socket;
	}

	public void processRequestAsync() {
		new Thread("Inventory Servlet") {

			@Override
			public void run() {
				try {
					processRequest();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

	public void processRequest() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket
				.getInputStream()));
		String line = reader.readLine();
		System.out.println("Processing request " + line);
		String[] lineParts = line.split(" ", 0);
		String reqType = lineParts[0];
		String reqURI = lineParts[1];

		PrintStream writer = new PrintStream(socket.getOutputStream());
		try {
			byte[] response = generateResponse(reqType, new URI(reqURI))
					.getBytes("UTF-8");
			writer.print("HTTP/1.1 200 OK");
			writer.write(EOL);
			writer.print("Content-Type: text/html");
			writer.write(EOL);
			writer.print("Content-Length: " + response.length);
			writer.write(EOL);
			writer.write(EOL);
			writer.write(response);
		} catch (Exception e) {
			writer.print("HTTP/1.1 500 Internal Server Error");
			writer.write(EOL);
			writer.write(EOL);
			e.printStackTrace(writer);
			e.printStackTrace();
		}
		writer.flush();
		writer.close();
	}

	protected String generateResponse(String reqType, URI reqURI)
			throws SqlJetException {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>Inventory</title></head><body>");
		if ("GET".equals(reqType)) {
			if ("/".equals(reqURI.getPath())) {
				showInventory(buffer);
			} else if ("/add_item".equals(reqURI.getPath())) {
				if (reqURI.getQuery() == null) {
					showAddForm(buffer);
				} else {
					processAddForm(buffer, parseQuery(reqURI.getQuery()));
				}
			} else if ("/edit_item".equals(reqURI.getPath())) {
				editItem(buffer, parseQuery(reqURI.getQuery()));
			} else if ("/remove_item".equals(reqURI.getPath())) {
				removeItem(buffer, parseQuery(reqURI.getQuery()));
			}
		}
		buffer.append("</body></html>");
		return buffer.toString();
	}

	private Map<String, String> parseQuery(String uriQuery) {
		Map<String, String> result = new HashMap<String, String>();
		if (uriQuery != null) {
			for (String param : uriQuery.split("&")) {
				String[] parts = param.split("=");
				if (parts.length > 1) {
					result.put(parts[0], parts[1]);
				}
			}
		}
		return result;
	}

	private void showInventory(StringBuffer buffer) throws SqlJetException {
		buffer.append("<h2>Inventory</h2>");
		ISqlJetCursor cursor = InventoryDB.getAllItems();
		try {
			printItems(buffer, cursor);
		} finally {
			cursor.close();
		}
		buffer.append("<p><a href='/add_item'>Add Item</a>");
	}

	protected void printItems(StringBuffer buffer, ISqlJetCursor cursor)
			throws SqlJetException {
		buffer.append("<table border='1'><tr>" + "<th>Article</th>"
				+ "<th>Name</th>" + "<th>Description</th>" + "<th>Image</th>"
				+ "<th>Room</th>" + "<th>Shelf</th>" + "<th>Borrowed To</th>"
				+ "<th>Borrowed From</th>" + "<th>Edit</th>"
				+ "<th>Delete</th>" + "<tr>");
		while (!cursor.eof()) {
			buffer.append("<tr>");
			for (int i = 0; i < cursor.getFieldsCount(); i++) {
				buffer.append("<td>");
				Object value = cursor.getValue(i);
				if (value != null) {
					buffer.append(value);
				} else {
					buffer.append("&nbsp;");
				}
				buffer.append("</td>");
			}
			buffer.append("<td><a href='/edit_item?article=");
			buffer.append(cursor.getInteger("article"));
			buffer.append("'>Edit</a></td>");
			buffer.append("<td><a href='/remove_item?article=");
			buffer.append(cursor.getInteger("article"));
			buffer.append("'>Remove</a></td>");
			buffer.append("</tr>");
			cursor.next();
		}
		buffer.append("</table>");
	}

	private void addReturnToInventory(StringBuffer buffer) {
		buffer.append("<hr><a href='/'>Return to inventory</a>");
	}

	private void showAddForm(StringBuffer buffer) {
		buffer.append("<h2>Add Item</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Name:</td>"
				+ "<td><input type='text' name='name'/></td></tr>");
		buffer.append("<tr><td>Description:</td>"
				+ "<td><input type='text' name='description'/></td></tr>");
		buffer.append("<tr><td>Image:</td><td></td></tr>");
		buffer.append("<tr><td>Room:</td>"
				+ "<td><input type='text' name='room'/></td></tr>");
		buffer.append("<tr><td>Shelf:</td>"
				+ "<td><input type='text' name='shelf'/></td></tr>");
		buffer.append("</table><input type='submit' value='Submit'></form>");
		addReturnToInventory(buffer);
	}

	private void processAddForm(StringBuffer buffer, Map<String, String> params)
			throws SqlJetException {
		try {
			InventoryItem item = new InventoryItem();
			item.name = params.get("name");
			if (item.name == null) {
				throw new NullPointerException("Name is not specified.");
			}
			item.description = params.get("description");
			String room = params.get("room");
			try {
				if (room != null) {
					item.room = Long.parseLong(room);
				}
			} catch (NumberFormatException nfe) {
				throw new Exception("Room number is invalid: " + room);
			}
			String shelf = params.get("shelf");
			try {
				if (shelf != null) {
					item.shelf = Long.parseLong(shelf);
				}
			} catch (NumberFormatException nfe) {
				throw new Exception("Shelf number is invalid: " + shelf);
			}
			InventoryDB.addItem(item);
			buffer.append("Item was added.");
		} catch (Exception e) {
			buffer.append("Invalid input! " + e.getMessage());
		}
		addReturnToInventory(buffer);
	}

	private InventoryItem findItem(StringBuffer buffer,
			Map<String, String> params) throws SqlJetException {
		if (!params.containsKey("article")) {
			buffer.append("Article is not specified.");
			addReturnToInventory(buffer);
			return null;
		}
		long article;
		try {
			article = Long.parseLong(params.get("article"));
		} catch (Exception e) {
			buffer.append("Invalid article: '");
			buffer.append(params.get("article"));
			buffer.append("'");
			addReturnToInventory(buffer);
			return null;
		}
		InventoryItem item = InventoryDB.getItem(article);
		if (item == null) {
			buffer.append("Item with article '");
			buffer.append(article);
			buffer.append("' not found.");
			addReturnToInventory(buffer);
			return null;
		}
		return item;
	}

	private void editItem(StringBuffer buffer, Map<String, String> params)
			throws SqlJetException {
		InventoryItem item = findItem(buffer, params);
		if (item != null) {
			if (params.size() == 1) {
				showEditForm(buffer, item);
			} else {
				processEditForm(buffer, item, params);
			}
			addReturnToInventory(buffer);
		}
	}

	private void showEditForm(StringBuffer buffer, InventoryItem item)
			throws SqlJetException {
		buffer.append("<h2>Edit Item</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Name:</td><td><input type='text' name='name'");
		if (item.name != null) {
			buffer.append(" value='");
			buffer.append(item.name);
			buffer.append("'");
		}
		buffer.append("/></td></tr>");
		buffer.append("<tr><td>Description:</td>"
				+ "<td><input type='text' name='description'");
		if (item.description != null) {
			buffer.append(" value='");
			buffer.append(item.description);
			buffer.append("'");
		}
		buffer.append("/></td></tr>");
		buffer.append("<tr><td>Image:</td><td></td></tr>");
		buffer.append("<tr><td>Room:</td>"
				+ "<td><input type='text' name='room' value='");
		buffer.append(item.room);
		buffer.append("'/></td></tr>");
		buffer.append("<tr><td>Shelf:</td>"
				+ "<td><input type='text' name='shelf' value='");
		buffer.append(item.shelf);
		buffer.append("'/></td></tr>");
		buffer.append("</table><input type='submit' value='Submit'/>");
		buffer.append("<input type='hidden' name='article' value='");
		buffer.append(item.article);
		buffer.append("'/></form>");
	}

	private void processEditForm(StringBuffer buffer, InventoryItem item,
			Map<String, String> params) throws SqlJetException {
		try {
			Map<String, Object> values = new HashMap<String, Object>();
			String name = params.get("name");
			if (name == null) {
				throw new NullPointerException("Name is not specified.");
			} else {
				values.put("name", name);
			}
			if (params.containsKey("description")) {
				values.put("description", params.get("description"));
			}
			String room = params.get("room");
			if (room != null) {
				try {
					values.put("room", Long.parseLong(room));
				} catch (Exception e) {
					throw new Exception("Room number is invalid: " + room);
				}
			}
			String shelf = params.get("shelf");
			if (shelf != null) {
				try {
					values.put("shelf", Long.parseLong(shelf));
				} catch (Exception e) {
					throw new Exception("Shelf number is invalid: " + shelf);
				}
			}
			InventoryDB.updateItem(item.article, values);
			buffer.append("Item was updated.");
		} catch (Exception e) {
			buffer.append("Invalid input! " + e.getMessage());
		}
	}

	private void removeItem(StringBuffer buffer, Map<String, String> params)
			throws SqlJetException {
		InventoryItem item = findItem(buffer, params);
		if (item != null) {
			InventoryDB.removeItem(item.article);
			buffer.append("Item was removed.");
			addReturnToInventory(buffer);
		}
	}
}
