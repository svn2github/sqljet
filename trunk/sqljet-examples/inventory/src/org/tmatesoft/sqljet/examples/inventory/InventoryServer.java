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

import java.net.ServerSocket;
import java.net.SocketTimeoutException;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryServer {

	private static final int PORT = 8333;

	public static void main(String[] args) throws Exception {
		ServerSocket socket = new ServerSocket(PORT);
		socket.setSoTimeout(1000);
		System.out
				.println("Inventory is listening at http://127.0.0.1:" + PORT);
		InventoryDB.open();
		try {
			while (true) {
				try {
					new InventoryServlet(socket.accept()).processRequestAsync();
				} catch (SocketTimeoutException ste) {
				}
				if (System.in.available() > 0) {
					System.out.println("Exit.");
					break;
				}
			}
		} finally {
			InventoryDB.close();
		}
	}
}
