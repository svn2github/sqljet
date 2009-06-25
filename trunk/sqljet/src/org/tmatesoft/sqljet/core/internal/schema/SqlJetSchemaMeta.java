/**
 * SqlJetSchemaMeta.java
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
package org.tmatesoft.sqljet.core.internal.schema;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetLimits;
import org.tmatesoft.sqljet.core.internal.SqlJetAutoVacuumMode;
import org.tmatesoft.sqljet.core.internal.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.pager.SqlJetPageCache;
import org.tmatesoft.sqljet.core.schema.ISqlJetOptions;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetSchemaMeta implements ISqlJetOptions {

    private static final int SCHEMA_COOKIE = 1;

    private static final int FILE_FORMAT = 2;

    private static final int PAGE_CACHE_SIZE = 3;

    private static final int AUTOVACUUM = 4;

    private static final int ENCODING = 5;

    private static final int USER_COOKIE = 6;

    private static final int INCREMENTAL_VACUUM = 7;

    private ISqlJetBtree btree;

    /**
     * Schema cookie. Changes with each schema change.
     */
    private int schemaCookie;

    /**
     * File format of schema layer.
     */
    private int fileFormat = ISqlJetLimits.SQLJET_MAX_FILE_FORMAT;

    /**
     * Size of the page cache.
     */
    private int pageCacheSize = SqlJetPageCache.PAGE_CACHE_SIZE_DEFAULT;

    /**
     * Use freelist if false. Autovacuum if true.
     */
    private boolean autovacuum = ISqlJetBtree.SQLJET_DEFAULT_AUTOVACUUM != SqlJetAutoVacuumMode.NONE;

    /**
     * Db text encoding.
     */
    private SqlJetEncoding encoding = SqlJetUtility.getEnumSysProp("SQLJET_DEFAULT_ENCODING", SqlJetEncoding.UTF8);

    /**
     * The user cookie. Used by the application.
     */
    private int userCookie;

    /**
     * Incremental-vacuum flag.
     */
    private boolean incrementalVacuum = ISqlJetBtree.SQLJET_DEFAULT_AUTOVACUUM == SqlJetAutoVacuumMode.INCR;

    /**
     * @param btree
     * 
     * @throws SqlJetException
     */
    public SqlJetSchemaMeta(ISqlJetBtree btree) throws SqlJetException {
        this.btree = btree;
        readMeta();
        if (schemaCookie == 0)
            initMeta();
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
    private void readMeta() throws SqlJetException {
        schemaCookie = readSchemaCookie();
        autovacuum = readAutoVacuum();
        fileFormat = readFileFormat();
        incrementalVacuum = readIncrementalVacuum();
        userCookie = readUserCookie();
        pageCacheSize = readPageCacheSize();
        encoding = readEncoding();
    }

    /**
     * @throws SqlJetException
     */
    private SqlJetEncoding readEncoding() throws SqlJetException {
        switch (btree.getMeta(ENCODING)) {
        case 0:
            if (readSchemaCookie() != 0)
                throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        case 1:
            return SqlJetEncoding.UTF8;
        case 2:
            return SqlJetEncoding.UTF16LE;
        case 3:
            return SqlJetEncoding.UTF16BE;
        default:
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        }
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private boolean readIncrementalVacuum() throws SqlJetException {
        return btree.getMeta(INCREMENTAL_VACUUM) != 0;
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private int readUserCookie() throws SqlJetException {
        return btree.getMeta(USER_COOKIE);
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private boolean readAutoVacuum() throws SqlJetException {
        return btree.getMeta(AUTOVACUUM) != 0;
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private int readPageCacheSize() throws SqlJetException {
        return btree.getMeta(PAGE_CACHE_SIZE);
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private int readFileFormat() throws SqlJetException {
        final int fileFormat = btree.getMeta(FILE_FORMAT);
        checkFileFormat(fileFormat);
        return fileFormat;
    }

    /**
     * @param fileFormat
     * @throws SqlJetException
     */
    private void checkFileFormat(final int fileFormat) throws SqlJetException {
        if (fileFormat > ISqlJetLimits.SQLJET_MAX_FILE_FORMAT)
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
    }

    /**
     * @return
     * @throws SqlJetException
     */
    private int readSchemaCookie() throws SqlJetException {
        return btree.getMeta(SCHEMA_COOKIE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #getSchemaCookie()
     */
    public int getSchemaVersion() {
        return schemaCookie;
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.schema.ISqlJetOptions#setSchemaVersion(int)
     */
    public void setSchemaVersion(int version) {
        // TODO Auto-generated method stub
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #getFileFormat()
     */
    public int getFileFormat() {
        return fileFormat;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #getPageCacheSize()
     */
    public int getCacheSize() {
        return pageCacheSize;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #isAutovacuum()
     */
    public boolean isAutovacuum() {
        return autovacuum;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #getEncoding()
     */
    public SqlJetEncoding getEncoding() {
        return encoding;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #getUserCookie()
     */
    public int getUserVersion() {
        return userCookie;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.btree.table.ISqlJetBtreeSchemaMeta
     * #isIncrementalVacuum()
     */
    public boolean isIncrementalVacuum() {
        return incrementalVacuum;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.schema.ISqlJetSchemaMeta#
     * verifySchemaCookie(boolean)
     */
    public boolean verifySchemaVersion(boolean throwIfStale) throws SqlJetException {
        final boolean stale = (schemaCookie != btree.getMeta(1));
        if (stale && throwIfStale)
            throw new SqlJetException(SqlJetErrorCode.SCHEMA);
        return !stale;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.tmatesoft.sqljet.core.internal.schema.ISqlJetSchemaMeta#
     * changeSchemaCookie()
     */
    public void changeSchemaVersion() throws SqlJetException {
        verifySchemaVersion(true);
        schemaCookie++;
        writeSchemaCookie(schemaCookie);
    }

    /**
     * @param btree2
     * @throws SqlJetException
     */
    private void initMeta() throws SqlJetException {
        btree.beginTrans(SqlJetTransactionMode.EXCLUSIVE);
        try {
            schemaCookie = 1;
            writeSchemaCookie(schemaCookie);
            writeFileFormat(fileFormat);
            writePageCacheSize(pageCacheSize);
            writeAutoVacuum(autovacuum);
            writeIncrementalVacuum(incrementalVacuum);
            writeEncoding(encoding);
            btree.commit();
        } catch (SqlJetException e) {
            btree.rollback();
            throw e;
        }
    }

    /**
     * @param schemaCookie 
     * @throws SqlJetException
     */
    private void writeSchemaCookie(int schemaCookie) throws SqlJetException {
        btree.updateMeta(SCHEMA_COOKIE, schemaCookie);
    }

    /**
     * @param encoding 
     * @throws SqlJetException
     */
    private void writeEncoding(SqlJetEncoding encoding) throws SqlJetException {
        switch (encoding) {
        case UTF8:
            btree.updateMeta(ENCODING, 1);
            break;
        case UTF16LE:
            btree.updateMeta(ENCODING, 2);
            break;
        case UTF16BE:
            btree.updateMeta(ENCODING, 3);
            break;
        default:
            throw new SqlJetException(SqlJetErrorCode.CORRUPT);
        }
    }

    /**
     * @param incrementalVacuum 
     * @throws SqlJetException
     */
    private void writeIncrementalVacuum(boolean incrementalVacuum) throws SqlJetException {
        btree.updateMeta(INCREMENTAL_VACUUM, incrementalVacuum ? 1 : 0);
    }

    /**
     * @param autovacuum 
     * @throws SqlJetException
     */
    private void writeAutoVacuum(boolean autovacuum) throws SqlJetException {
        btree.updateMeta(AUTOVACUUM, autovacuum ? 1 : 0);
    }

    /**
     * @param pageCacheSize 
     * @throws SqlJetException
     */
    private void writePageCacheSize(int pageCacheSize) throws SqlJetException {
        checkPageCacheSize();
        btree.updateMeta(PAGE_CACHE_SIZE, pageCacheSize);
    }

    /**
     * @param pageCacheSize
     * @throws SqlJetException 
     */
    private void checkPageCacheSize() throws SqlJetException {
        if(pageCacheSize<SqlJetPageCache.PAGE_CACHE_SIZE_MINIMUM)
            pageCacheSize = SqlJetPageCache.PAGE_CACHE_SIZE_DEFAULT;
    }

    /**
     * @param fileFormat 
     * @throws SqlJetException
     */
    private void writeFileFormat(int fileFormat) throws SqlJetException {
        checkFileFormat(fileFormat);
        btree.updateMeta(FILE_FORMAT, fileFormat);
    }

    /**
     * @param userCookie the userCookie to set
     * 
     * @throws SqlJetException 
     */
    public void setUserVersion(int userCookie) throws SqlJetException {
        this.userCookie = userCookie;
        writeUserCookie(userCookie);
    }

    /**
     * @param userCookie
     * 
     * @throws SqlJetException 
     */
    private void writeUserCookie(int userCookie) throws SqlJetException {
        btree.updateMeta(USER_COOKIE, userCookie);
    }

    /**
     * @throws SqlJetException
     */
    private void checkSchema() throws SqlJetException {
        if(readSchemaCookie()!=1)
            throw new SqlJetException(SqlJetErrorCode.MISUSE);
    }
    
    /**
     * @param fileFormat the fileFormat to set
     * 
     * @throws SqlJetException 
     */
    public void setFileFormat(int fileFormat) throws SqlJetException {
        checkSchema();
        writeFileFormat(fileFormat);
        this.fileFormat = fileFormat;
    }
    
    /**
     * @param pageCacheSize the pageCacheSize to set
     * 
     * @throws SqlJetException 
     */
    public void setCacheSize(int pageCacheSize) throws SqlJetException {
        checkSchema();
        writePageCacheSize(pageCacheSize);
        this.pageCacheSize = pageCacheSize;
    }
    
    /**
     * @param autovacuum the autovacuum to set
     * @throws SqlJetException 
     */
    public void setAutovacuum(boolean autovacuum) throws SqlJetException {
        checkSchema();
        writeAutoVacuum(autovacuum);
        this.autovacuum = autovacuum;
    }
    
    /**
     * @param encoding the encoding to set
     * @throws SqlJetException 
     */
    public void setEncoding(SqlJetEncoding encoding) throws SqlJetException {
        checkSchema();
        writeEncoding(encoding);
        this.encoding = encoding;
    }
    
    /**
     * @param incrementalVacuum the incrementalVacuum to set
     * @throws SqlJetException 
     */
    public void setIncrementalVacuum(boolean incrementalVacuum) throws SqlJetException {
        checkSchema();
        writeIncrementalVacuum(incrementalVacuum);
        this.incrementalVacuum = incrementalVacuum;
    }

}
