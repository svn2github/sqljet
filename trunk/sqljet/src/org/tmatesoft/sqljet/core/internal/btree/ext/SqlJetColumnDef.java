/**
 * SqlJetColumnDef.java
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
package org.tmatesoft.sqljet.core.internal.btree.ext;

import java.util.Collections;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.ext.ISqlJetColumnConstraint;
import org.tmatesoft.sqljet.core.ext.ISqlJetColumnDef;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetColumnDef implements ISqlJetColumnDef {

    public SqlJetColumnDef(CommonTree ast) {
    }

    public String getName() {
        return null;
    }

    public List<ISqlJetColumnConstraint> getConstraints() {
        return Collections.emptyList();
    }
}
