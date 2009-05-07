/**
 * SqlJetBackend.java
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
package org.tmatesoft.sqljet.core.internal.db;

import org.tmatesoft.sqljet.core.internal.ISqlJetBackend;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetSchema;
import org.tmatesoft.sqljet.core.internal.SqlJetSafetyLevel;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionState;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetBackend implements ISqlJetBackend {

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBackend#getBtree()
     */
    public ISqlJetBtree getBtree() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBackend#getName()
     */
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBackend#getSafetyLevel()
     */
    public SqlJetSafetyLevel getSafetyLevel() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBackend#getSchema()
     */
    public ISqlJetSchema getSchema() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ISqlJetBackend#getTransactionState()
     */
    public SqlJetTransactionState getTransactionState() {
        // TODO Auto-generated method stub
        return null;
    }

}
