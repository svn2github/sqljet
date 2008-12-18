/**
 * SqlJetFileSystem.java
 * Copyright (C) 2008 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.internal.fs;

import static org.tmatesoft.sqljet.core.SqlJetException.assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.EnumSet;

import org.tmatesoft.sqljet.core.ISqlJetFile;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetFileAccesPermission;
import org.tmatesoft.sqljet.core.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.SqlJetFileType;

/**
 * Default implementation of ISqlJetFileSystem.
 *
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFileSystem implements ISqlJetFileSystem {

    public static final String FS_NAME = SqlJetFileSystem.class.getCanonicalName();

    /**
     * Temporary files are named starting with this prefix followed by random
     * alphanumeric characters, and no file extension. They are stored in the
     * OS's standard temporary file directory, and are deleted prior to exit.
     * 
     * If SqlJet is being embedded in another program, you may wish to change
     * the prefix to reflect your program's name, so that if your program exits
     * prematurely, old temporary files can be easily identified.
     * 
     * TODO - specify a way to change SQLJET_TEMP_FILE_PREFIX ( e.g. may be
     * system property name as SQLJET_TEMP_FILE_PREFIX ) .
     * 
     * ********************************************************************
     * 
     * Below some from SQLite comments:
     * 
     * 2006-10-31: The default prefix used to be "sqlite_". But then Mcafee
     * started using SQLite in their anti-virus product and it started putting
     * files with the "sqlite" name in the c:/temp folder. This annoyed many
     * windows users. Those users would then do a Google search for "sqlite",
     * find the telephone numbers of the developers and call to wake them up at
     * night and complain. For this reason, the default name prefix is changed
     * to be "sqlite" spelled backwards. So the temp files are still identified,
     * but anybody smart enough to figure out the code is also likely smart
     * enough to know that calling the developer will not help get rid of the
     * file.
     */

    private static final String SQLJET_TEMP_FILE_PREFIX = "tejlqs_";

    private final SecureRandom random = new SecureRandom();

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#getName()
     */
    public String getName() {
        return FS_NAME;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#open(java.io.File,
     * java.util.EnumSet)
     */
    public ISqlJetFile open(final File path, final SqlJetFileType type,
            final EnumSet<SqlJetFileOpenPermission> permissions) throws SqlJetException {

        if (null == type)
            throw new SqlJetException(SqlJetErrorCode.BAD_PARAMETER, "File type must not be null to open file");

        if (null == permissions || permissions.isEmpty())
            throw new SqlJetException(SqlJetErrorCode.BAD_PARAMETER,
                    "Permissions must not be null or empty to open file");

        boolean isExclusive = permissions.contains(SqlJetFileOpenPermission.EXCLUSIVE);
        boolean isDelete = permissions.contains(SqlJetFileOpenPermission.DELETEONCLOSE);
        boolean isCreate = permissions.contains(SqlJetFileOpenPermission.CREATE);
        boolean isReadonly = permissions.contains(SqlJetFileOpenPermission.READONLY);
        boolean isReadWrite = permissions.contains(SqlJetFileOpenPermission.READWRITE);

        /*
         * Check the following statements are true:
         * 
         * (a) Exactly one of the READWRITE and READONLY flags must be set, and
         * (b) if CREATE is set, then READWRITE must also be set, and (c) if
         * EXCLUSIVE is set, then CREATE must also be set. (d) if DELETEONCLOSE
         * is set, then CREATE must also be set.
         */
        assertion((!isReadonly || !isReadWrite) && (isReadWrite || isReadonly));
        assertion(!isCreate || isReadWrite);
        assertion(!isExclusive || isCreate);
        assertion(!isDelete || isCreate);

        /*
         * The main DB, main journal, and master journal are never automatically
         * deleted
         */

        assertion(SqlJetFileType.MAIN_DB != type || !isDelete);
        assertion(SqlJetFileType.MAIN_JOURNAL != type || !isDelete);
        assertion(SqlJetFileType.MASTER_JOURNAL != type || !isDelete);

        final File filePath;

        if (null != path) {
            try {
                filePath = path.getCanonicalFile();
            } catch (IOException e) {
                throw new SqlJetException(SqlJetErrorCode.CANTOPEN,e);
            }
        } else {

            assertion(isDelete
                    && !(isCreate && (SqlJetFileType.MASTER_JOURNAL == type || SqlJetFileType.MAIN_JOURNAL == type)));
            try {
                filePath = getTempFile();
            } catch (IOException e) {
                throw new SqlJetException(SqlJetErrorCode.CANTOPEN,e);
            }

            assertion(null != filePath);
        }

        final String mode = isReadWrite ? "rws" : "r";

        final RandomAccessFile file;
        try {
            file = new RandomAccessFile(filePath, mode);
        } catch (FileNotFoundException e) {

            if (isReadWrite && !isExclusive) {
                /* Failed to open the file for read/write access. Try read-only. */
                permissions.remove(SqlJetFileOpenPermission.READWRITE);
                permissions.remove(SqlJetFileOpenPermission.CREATE);
                permissions.add(SqlJetFileOpenPermission.READONLY);
                return open(filePath, type, permissions);
            }

            throw new SqlJetException(SqlJetErrorCode.CANTOPEN);
        }

        if (isDelete) {
            filePath.deleteOnExit();
        }

        boolean noLock = SqlJetFileType.MAIN_DB != type;

        return new SqlJetFile(this, file, filePath, type, permissions, noLock);

    }

    /**
     * @return
     * @throws IOException
     */
    public static File getTempFile() throws IOException {
        return File.createTempFile(SQLJET_TEMP_FILE_PREFIX, null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#delete(java.io.File,
     * boolean)
     */
    public boolean delete(File path, boolean sync) throws SqlJetException {
        assertion(null != path);
        final boolean delete = path.delete();
        // TODO may be it is possible to syncing in some way
        return delete;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#access(java.io.File,
     * org.tmatesoft.sqljet.core.SqlJetFileAccesPermission)
     */
    public boolean access(File path, SqlJetFileAccesPermission permission) throws SqlJetException {

        assertion(null != path);
        assertion(null != permission);

        switch (permission) {
        case EXISTS:
            return path.exists();

        case READONLY:
            return path.canRead() && !path.canWrite();

        case READWRITE:
            return path.canRead() && path.canWrite();

        default:
            throw new SqlJetException(SqlJetErrorCode.INTERNAL, "Unhandled SqlJetFileAccesPermission value :"
                    + permission.name());
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#currentTime()
     */
    public long currentTime() throws SqlJetException {
        return System.currentTimeMillis();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#randomness(int)
     */
    public byte[] randomness(int numBytes) throws SqlJetException {
        assertion(numBytes > 0);
        final byte[] bytes = new byte[numBytes];
        random.nextBytes(bytes);
        return bytes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetFileSystem#sleep(int)
     */
    public long sleep(long microseconds) throws SqlJetException {
        assertion(microseconds > 0);
        final long t = System.currentTimeMillis();
        try {
            Thread.sleep(microseconds);
        } catch (InterruptedException e) {
        }
        return System.currentTimeMillis() - t;
    }

}
