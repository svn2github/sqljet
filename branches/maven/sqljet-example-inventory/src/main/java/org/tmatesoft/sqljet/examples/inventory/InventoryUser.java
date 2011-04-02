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
package org.tmatesoft.sqljet.examples.inventory;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryUser {

	public String name;
	public String info;
	public double rating;

	public InventoryUser() {
	}

	public InventoryUser(String name, String info, double rating) {
		this.name = name;
		this.info = info;
		this.rating = rating;
	}

	public void read(ISqlJetCursor cursor) throws SqlJetException {
		this.name = cursor.getString("name");
		this.info = cursor.getString("info");
		this.rating = cursor.getFloat("rating");
	}
}
