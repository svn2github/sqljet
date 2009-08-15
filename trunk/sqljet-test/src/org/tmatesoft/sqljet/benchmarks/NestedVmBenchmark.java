/**
 * NestedVmBenchmark.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.benchmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class NestedVmBenchmark extends AbstractBenchmark {

    @Override
    public void selectAll() throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile.getAbsolutePath());
        Statement stat = conn.createStatement();

        ResultSet rs = stat.executeQuery(String.format("select * from %s;", TABLE_NAME));
        final ResultSetMetaData metaData = rs.getMetaData();
        final int columnCount = metaData.getColumnCount();
        int rows = 0;
        while (rs.next()) {
            final StringBuilder s = new StringBuilder();
            for (int column = 1; column <= columnCount; column++) {
                final Object value = rs.getObject(column);
                s.append(value).append(" ");
            }
            logger.info(s.toString());
            rows++;
        }
        logger.info(String.format("rows %d", rows));
        rs.close();
        conn.close();
    }

}
