/**
 * SqlJetConsole.java
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
package org.tmatesoft.sqljet.console;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.lang.SqlJetConnection;
import org.tmatesoft.sqljet.core.lang.SqlJetExecCallback;
import org.tmatesoft.sqljet.core.lang.SqlJetPreparedStatement;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetConsole implements SqlJetExecCallback {

    private boolean firstRow;

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Exactly one database file name should be specified.");
            return;
        }
        SqlJetConnection conn = SqlJetConnection.open(args[0]);
        System.out.println("Connected to " + args[0]);
        try {
            new SqlJetConsole().repl(conn);
        } finally {
            conn.close();
        }
    }

    private void repl(SqlJetConnection conn) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        String line;
        System.out.print("sqljet> ");
        while ((line = in.readLine()) != null) {
            buffer.append(line);
            if (line.trim().endsWith(";")) {
                firstRow = true;
                try {
                    conn.exec(buffer.toString(), this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                buffer.setLength(0);
                System.out.print("sqljet> ");
            } else {
                System.out.print("> ");
            }
        }
    }

    public void processRow(SqlJetPreparedStatement stmt) throws SqlJetException {
        StringBuffer buffer = new StringBuffer();
        if (firstRow) {
            for (int i = 0; i < 80; i++) {
                buffer.append('-');
            }
            System.out.println(buffer.toString());
            buffer.setLength(0);
            firstRow = false;
        }
        for (int i = 0; i < stmt.getColumnsCount(); i++) {
            switch (stmt.getColumnType(i)) {
            case BLOB:
                buffer.append(getHexedBLOB(stmt.getBLOB(i)));
                break;
            case DOUBLE:
                buffer.append(stmt.getDouble(i));
                break;
            case INTEGER:
                buffer.append(stmt.getInteger(i));
                break;
            case LONG:
                buffer.append(stmt.getLong(i));
                break;
            case TEXT:
                buffer.append(String.valueOf(stmt.getText(i)));
                break;
            }
            buffer.append(" \t");
        }
        System.out.println(buffer.toString());
    }

    private String getHexedBLOB(byte[] data) {
        if (data == null) {
            return "null";
        }
        StringBuffer buffer = new StringBuffer("x'");
        for (int i = 0; i < data.length; i++) {
            byte b = data[i];
            buffer.append((char) (b / 16 > 9 ? 'a' + b / 16 - 10 : '0' + b / 16));
            buffer.append((char) (b % 16 > 9 ? 'a' + b % 16 - 10 : '0' + b % 16));
        }
        buffer.append("'");
        return buffer.toString();
    }
}
