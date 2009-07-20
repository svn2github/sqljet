/**
 * ISqlJetTableDef.java
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
package org.tmatesoft.sqljet.core.schema;

import java.util.List;

/**
 * Table Definition.
 * 
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public interface ISqlJetTableDef {

    /**
     * Returns table name.
     */
    public String getName();

    /**
     * True if table was created temporarily.
     */
    public boolean isTemporary();

    /**
     * Definitions of table columns.
     */
    public List<ISqlJetColumnDef> getColumns();

    /**
     * Returns column definition with a given name or null if there is no such
     * definition.
     */
    public ISqlJetColumnDef getColumn(String name);

    /**
     * Returns position of the specified column within the table definition.
     */
    public int getColumnNumber(String name);

    /**
     * Returns all table constraints.
     */
    public List<ISqlJetTableConstraint> getConstraints();
}
