package org.tmatesoft.sqljet.examples.inventory;

import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

public class InventoryItemsResponder {

	public void showInventory(StringBuffer buffer) throws SqlJetException {
		buffer.append("<h2>Inventory</h2>");
		ISqlJetCursor cursor = InventoryDB.getAllItems();
		try {
			printItems(buffer, cursor);
		} finally {
			cursor.close();
		}
		buffer.append("<p><a href='/add_item'>Add Item</a>");
	}

	private void printItems(StringBuffer buffer, ISqlJetCursor cursor) throws SqlJetException {
		buffer.append("<table border='1'><tr>" + "<th>Article</th>" + "<th>Name</th>" + "<th>Description</th>"
				+ "<th>Image</th>" + "<th>Room</th>" + "<th>Shelf</th>" + "<th>Borrowed To</th>"
				+ "<th>Borrowed From</th>" + "<th>Edit</th>" + "<th>Delete</th>" + "<tr>");
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

	public void showAddForm(StringBuffer buffer) {
		buffer.append("<h2>Add Item</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Name:</td><td><input type='text' name='name'/></td></tr>");
		buffer.append("<tr><td>Description:</td><td><input type='text' name='description'/></td></tr>");
		buffer.append("<tr><td>Image:</td><td></td></tr>");
		buffer.append("<tr><td>Room:</td><td><input type='text' name='room'/></td></tr>");
		buffer.append("<tr><td>Shelf:</td><td><input type='text' name='shelf'/></td></tr>");
		buffer.append("</table><input type='submit' value='Submit'></form>");
		addReturnToInventory(buffer);
	}

	public void processAddForm(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
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

	private InventoryItem findItem(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
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

	public void editItem(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
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

	public void showEditForm(StringBuffer buffer, InventoryItem item) throws SqlJetException {
		buffer.append("<h2>Edit Item</h2><p>");
		buffer.append("<form><table>");
		buffer.append("<tr><td>Name:</td><td><input type='text' name='name'");
		if (item.name != null) {
			buffer.append(" value='");
			buffer.append(item.name);
			buffer.append("'");
		}
		buffer.append("/></td></tr>");
		buffer.append("<tr><td>Description:</td><td><input type='text' name='description'");
		if (item.description != null) {
			buffer.append(" value='");
			buffer.append(item.description);
			buffer.append("'");
		}
		buffer.append("/></td></tr>");
		buffer.append("<tr><td>Image:</td><td></td></tr>");
		buffer.append("<tr><td>Room:</td><td><input type='text' name='room' value='");
		buffer.append(item.room);
		buffer.append("'/></td></tr>");
		buffer.append("<tr><td>Shelf:</td><td><input type='text' name='shelf' value='");
		buffer.append(item.shelf);
		buffer.append("'/></td></tr>");
		buffer.append("</table><input type='submit' value='Submit'/>");
		buffer.append("<input type='hidden' name='article' value='");
		buffer.append(item.article);
		buffer.append("'/></form>");
	}

	public void processEditForm(StringBuffer buffer, InventoryItem item, Map<String, String> params)
			throws SqlJetException {
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

	public void removeItem(StringBuffer buffer, Map<String, String> params) throws SqlJetException {
		InventoryItem item = findItem(buffer, params);
		if (item != null) {
			InventoryDB.removeItem(item.article);
			buffer.append("Item was removed.");
			addReturnToInventory(buffer);
		}
	}
}
