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

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryItem {

	public long article;
	public String name;
	public String description;
	public byte[] image;
	public long room;
	public long shelf;
	public String borrowedFrom;
	public String borrowedTo;

	public InventoryItem() {
	}

	public InventoryItem(long article, String name, String description,
			byte[] image, long room, long shelf, String borrowedFrom,
			String borrowedTo) {
		this.article = article;
		this.name = name;
		this.description = description;
		this.image = image;
		this.room = room;
		this.shelf = shelf;
		this.borrowedFrom = borrowedFrom;
		this.borrowedTo = borrowedTo;
	}

	public void read(ISqlJetCursor cursor) throws SqlJetException {
		article = cursor.getInteger(0);
		name = cursor.getString(1);
		description = cursor.getString(2);
		image = cursor.getBlobAsArray(3);
		room = cursor.getInteger(4);
		shelf = cursor.getInteger(5);
		borrowedFrom = cursor.getString(6);
		borrowedTo = cursor.getString(7);
	}
}
