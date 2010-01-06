/**
 * SqlJetMapDef.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal.map;

import org.tmatesoft.sqljet.core.map.ISqlJetMapTableDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetVirtualTableDef;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetMapTableDef implements ISqlJetMapTableDef {

    private final String mapTableName;
    private final ISqlJetVirtualTableDef virtualTableDef;

    /**
     * 
     */
    public SqlJetMapTableDef(final String mapTableName, final ISqlJetVirtualTableDef virtualTableDef) {
        this.mapTableName = mapTableName;
        this.virtualTableDef = virtualTableDef;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.map.ISqlJetMapTableDef#getMapTableName()
     */
    public String getMapTableName() {
        return mapTableName;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.map.ISqlJetMapTableDef#getVirtualTableDef()
     */
    public ISqlJetVirtualTableDef getVirtualTableDef() {
        return virtualTableDef;
    }
}
