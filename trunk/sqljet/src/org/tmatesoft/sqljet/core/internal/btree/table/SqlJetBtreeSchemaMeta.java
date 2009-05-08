/**
 * SqlJetBtreeSchemaMeta.java
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
package org.tmatesoft.sqljet.core.internal.btree.table;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.table.ISqlJetBtreeSchemaMeta;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeSchemaMeta implements ISqlJetBtreeSchemaMeta {

    /**
     * Schema cookie. Changes with each schema change.
     */
    private int schemaCookie;
    
    /**
     * File format of schema layer.
     */
    private int fileFormat;
    
    /**
     * Size of the page cache.
     */
    private int pageCacheSize;
    
    /**
     * Use freelist if false. Autovacuum if true.
     */
    private boolean autovacuum;
    
    /**
     * Db text encoding. 
     */
    private SqlJetEncoding encoding = SqlJetEncoding.UTF8;
    
    /**
     * The user cookie. Used by the application.
     */
    private int userCookie;
    
    /**
     * Incremental-vacuum flag.
     */
    private boolean incrementalVacuum;

    /**
     * @param btree
     * 
     * @throws SqlJetException 
     */
    public SqlJetBtreeSchemaMeta(ISqlJetBtree btree) throws SqlJetException {
        readMeta(btree);
    }

    /**
     * Get the database meta information.
     * 
     * Meta values are as follows:
     * 
     * <table border="1">
     * <tr>
     * <td>meta[1]</td>
     * <td>Schema cookie. Changes with each schema change.</td>
     * </tr>
     * <tr>
     * <td>meta[2]</td>
     * <td>File format of schema layer.</td>
     * </tr>
     * <tr>
     * <td>meta[3]</td>
     * <td>Size of the page cache.</td>
     * </tr>
     * <tr>
     * <td>meta[4]</td>
     * <td>Use freelist if 0. Autovacuum if greater than zero.</td>
     * </tr>
     * <tr>
     * <td>meta[5]</td>
     * <td>Db text encoding. 1:UTF-8 2:UTF-16LE 3:UTF-16BE</td>
     * </tr>
     * <tr>
     * <td>meta[6]</td>
     * <td>The user cookie. Used by the application.</td>
     * </tr>
     * <tr>
     * <td>meta[7]</td>
     * <td>Incremental-vacuum flag.</td>
     * </tr>
     * </table>
     * 
     * @throws SqlJetException
     * 
     */
    private void readMeta(ISqlJetBtree btree) throws SqlJetException {
        schemaCookie = btree.getMeta(1);
        fileFormat = btree.getMeta(2);
        pageCacheSize = btree.getMeta(3);
        autovacuum = btree.getMeta(4) != 0;
        switch (btree.getMeta(5)) {
        case 1:
            encoding = SqlJetEncoding.UTF8;
            break;
        case 2:
            encoding = SqlJetEncoding.UTF16LE;
            break;
        case 3:
            encoding = SqlJetEncoding.UTF16BE;
            break;
        default:
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        }
        userCookie = btree.getMeta(6);
        incrementalVacuum = btree.getMeta(7) != 0;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#getSchemaCookie()
     */
    public int getSchemaCookie() {
        return schemaCookie;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#getFileFormat()
     */
    public int getFileFormat() {
        return fileFormat;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#getPageCacheSize()
     */
    public int getPageCacheSize() {
        return pageCacheSize;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#isAutovacuum()
     */
    public boolean isAutovacuum() {
        return autovacuum;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#getEncoding()
     */
    public SqlJetEncoding getEncoding() {
        return encoding;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#getUserCookie()
     */
    public int getUserCookie() {
        return userCookie;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta#isIncrementalVacuum()
     */
    public boolean isIncrementalVacuum() {
        return incrementalVacuum;
    }

}
