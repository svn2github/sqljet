/**
 * ISqlJetSchemaMeta.java
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
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core.schema;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetSchemaMeta {

    /**
     * File format of schema layer.
     * 
     * @return the fileFormat
     */
    int getFileFormat();

    /**
     * Set file format. It's allowed only on new empty data base.
     * 
     * @param fileFormat
     * @throws SqlJetException
     */
    void setFileFormat(int fileFormat) throws SqlJetException;

    // Pragmas to modify library operation

    /**
     * Use freelist if false. Autovacuum if true.
     * 
     * @return the autovacuum
     */
    boolean isAutovacuum();

    /**
     * Set autovacuum flag. It's allowed only on new empty data base.
     * 
     * @param autovacuum
     * @throws SqlJetException
     */
    void setAutovacuum(boolean autovacuum) throws SqlJetException;

    /**
     * Incremental-vacuum flag.
     * 
     * @return the incrementalVacuum
     */
    boolean isIncrementalVacuum();

    /**
     * Set incremental vacuum flag. It's allowed only on new empty data base.
     * 
     * @param incrementalVacuum
     * @throws SqlJetException
     */
    void setIncrementalVacuum(boolean incrementalVacuum) throws SqlJetException;

    /**
     * Size of the page cache.
     * 
     * @return the pageCacheSize
     */
    int getCacheSize();

    /**
     * Set page cache's size. It's allowed only on new empty data base.
     * 
     * @param pageCacheSize
     * @throws SqlJetException
     */
    void setCacheSize(int pageCacheSize) throws SqlJetException;

    // case_sensitive_like
    // count_changes
    // default_cache_size

    /**
     * Db text encoding.
     * 
     * @return the encoding
     */
    SqlJetEncoding getEncoding();

    /**
     * Set encoding. It's allowed only on new empty data base.
     * 
     * @param encoding
     * @throws SqlJetException
     */
    void setEncoding(SqlJetEncoding encoding) throws SqlJetException;

    // full_column_names
    // fullfsync
    // incremental_vacuum
    // journal_mode
    // journal_size_limit
    // legacy_file_format
    // locking_mode
    // page_size
    // max_page_count
    // read_uncommitted
    // reverse_unordered_selects
    // short_column_names
    // synchronous
    // temp_store
    // temp_store_directory

    // Pragmas to query the database schema

    // collation_list
    // database_list
    // foreign_key_list
    // freelist_count
    // index_info
    // index_list
    // page_count
    // table_info

    // Pragmas to query/modify version values

    /**
     * Schema cookie. Changes with each schema change.
     * 
     * @return the schemaCookie
     */
    int getSchemaVersion();

    void setSchemaVersion(int version);

    /**
     * Change SchemaCookie.
     */
    void changeSchemaVersion() throws SqlJetException;

    /**
     * Verify schema cookie and return true if it is unchanged by other process.
     * If throwIfStale is true then throw exception if cookie is changed by
     * other process.
     * 
     * @param throwIfStale
     * @return
     * @throws SqlJetException
     */
    boolean verifySchemaVersion(boolean throwIfStale) throws SqlJetException;

    /**
     * The user cookie. Used by the application.
     * 
     * @return the userCookie
     */
    int getUserVersion();

    /**
     * Set user's cookie.
     * 
     * @param userCookie
     * @throws SqlJetException
     */
    void setUserVersion(int userCookie) throws SqlJetException;

    // Pragmas to debug the library

    // integrity_check
    // quick_check
    // parser_trace
    // vdbe_trace
    // vdbe_listing
}