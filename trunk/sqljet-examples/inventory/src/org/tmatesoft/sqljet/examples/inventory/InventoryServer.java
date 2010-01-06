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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class InventoryServer {

	private static final int PORT = 8333;
	private static final byte[] EOL = { (byte) '\r', (byte) '\n' };
	private static final InventoryItemsResponder itemsResponder = new InventoryItemsResponder();
	private static final InventoryUsersResponder usersResponder = new InventoryUsersResponder();

	public static void main(String[] args) throws Exception {
		ServerSocket socket = new ServerSocket(PORT);
		socket.setSoTimeout(1000);
		System.out.println("Inventory is listening at http://127.0.0.1:" + PORT);
		System.out.println("Enter any text to shutdown.");
		try {
			while (true) {
				try {
					processRequestAsync(socket.accept());
				} catch (SocketTimeoutException ste) {
				}
				if (System.in.available() > 0) {
					System.out.println("Exit.");
					break;
				}
			}
		} finally {
			socket.close();
		}
	}

	private static void processRequestAsync(final Socket socket) {
		new Thread("Worker") {

			@Override
			public void run() {
				try {
					processRequest(socket);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

	private static void processRequest(Socket socket) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = reader.readLine();
		System.out.println(line);
		String[] lineParts = line.split(" ", 0);
		String reqType = lineParts[0];
		String reqURI = lineParts[1];

		PrintStream writer = new PrintStream(socket.getOutputStream());
		try {
			byte[] response = generateResponse(reqType, new URI(reqURI)).getBytes("UTF-8");
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

	private static String generateResponse(String reqType, URI reqURI) throws SqlJetException {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>Inventory</title></head><body>");
		buffer.append("<style type='text/css'>");
		buffer.append("table.items, table.users { border-width: 0px; border-spacing: 0px; border-collapse: collapse; }");
		buffer.append("table.items th, table.users th { border-style: solid; border-width: 1px; padding: 4px; border-color: gray; background-color: #DDD; }");
		buffer.append("table.items td, table.users td { border-style: solid; border-width: 1px; padding: 4px; border-color: gray; background-color: #FFF; }");
		buffer.append("table.items td.filter, table.users td.filter { background-color: #EEE; }");
		buffer.append("</style>");
		String path = reqURI.getPath();
		if ("GET".equals(reqType)) {
			if ("/".equals(path)) {
				itemsResponder.showInventory(buffer, parseQuery(reqURI));
			} else if ("/add_item".equals(path)) {
				if (reqURI.getQuery() == null) {
					itemsResponder.showAddForm(buffer);
				} else {
					itemsResponder.processAddForm(buffer, parseQuery(reqURI));
				}
			} else if ("/edit_item".equals(path)) {
				itemsResponder.editItem(buffer, parseQuery(reqURI));
			} else if ("/remove_item".equals(path)) {
				itemsResponder.removeItem(buffer, parseQuery(reqURI));
			} else if ("/users".equals(path)) {
				usersResponder.showUsers(buffer, parseQuery(reqURI));
			} else if ("/add_user".equals(path)) {
				if (reqURI.getQuery() == null) {
					usersResponder.showAddForm(buffer);
				} else {
					usersResponder.processAddForm(buffer, parseQuery(reqURI));
				}
			} else if ("/edit_user".equals(path)) {
				usersResponder.editUser(buffer, parseQuery(reqURI));
			} else if ("/remove_user".equals(path)) {
				usersResponder.removeUser(buffer, parseQuery(reqURI));
			}
		}
		buffer.append("</body></html>");
		return buffer.toString();
	}

	private static Map<String, String> parseQuery(URI uri) {
		String uriQuery = uri.getRawQuery();
		Map<String, String> result = new HashMap<String, String>();
		if (uriQuery != null) {
			for (String param : uriQuery.split("&")) {
				String[] parts = param.split("=");
				if (parts.length > 1) {
					try {
						result.put(parts[0], URLDecoder.decode(parts[1], "UTF-8"));
					} catch (UnsupportedEncodingException e) {
						throw new IllegalArgumentException(e);
					}
				}
			}
		}
		return result;
	}
}
