/**
 * ISqlJetBtreeSchemaMeta.java
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
package org.tmatesoft.sqljet.core.internal.table;

import org.tmatesoft.sqljet.core.SqlJetEncoding;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetBtreeSchemaMeta {

    /**
     * Schema cookie. Changes with each schema change.
     * 
     * @return the schemaCookie
     */
    int getSchemaCookie();

    /**
     * File format of schema layer.
     * 
     * @return the fileFormat
     */
    int getFileFormat();

    /**
     * Size of the page cache.
     * 
     * @return the pageCacheSize
     */
    int getPageCacheSize();

    /**
     * Use freelist if false. Autovacuum if true.
     * 
     * @return the autovacuum
     */
    boolean isAutovacuum();

    /**
     * Db text encoding. 
     * 
     * @return the encoding
     */
    SqlJetEncoding getEncoding();

    /**
     * The user cookie. Used by the application.
     * 
     * @return the userCookie
     */
    int getUserCookie();

    /**
     * Incremental-vacuum flag.
     * 
     * @return the incrementalVacuum
     */
    boolean isIncrementalVacuum();

}