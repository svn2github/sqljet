/**
 * ISqlJetTableSchema.java
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
package org.tmatesoft.sqljet.core.internal.table;

import java.util.List;
import java.util.Map;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetTableSchema {

    /**
     * @return the isRowIdPrimaryKey
     */
    boolean isRowIdPrimaryKey();

    /**
     * @return the isAutoincrement
     */
    boolean isAutoincrement();

    /**
     * @return the columnsConstraintsIndexes
     */
    Map<String, String> getColumnsConstraintsIndexes();

    /**
     * @return the tableConstraintsIndexes
     */
    Map<String, List<String>> getTableConstraintsIndexes();

    /**
     * @return the primaryKeyIndex
     */
    String getPrimaryKeyIndex();

    /**
     * @return the rowIdPrimaryKeyColumn
     */
    String getRowIdPrimaryKeyColumn();

    /**
     * @return the rowIdPrimaryKeyColumnIndex
     */
    int getRowIdPrimaryKeyColumnIndex();

    /**
     * @return the primaryKeyColumns
     */
    List<String> getPrimaryKeyColumns();

}