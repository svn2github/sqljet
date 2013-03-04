/**
 * ISqlJetTableDef.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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

/**
 * View Definition.
 * 
 * @author TMate Software Ltd.
 */
public interface ISqlJetViewDef {
    
    /**
     * 
     * @return name of this view
     */
    public String getName();
    
    /**
     * @return SQL used to define this view.
     */
    public String toSQL();
}
