/**
 * ISqlJetFile.java
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
package org.tmatesoft.sqljet.core;

import java.util.EnumSet;

/**
 * OS Interface Open File Handle.
 *
 * An ISqlJetFile object represents an open file in the OS
 * interface layer.  Individual OS interface implementations will
 * want to subclass this object by appending additional fields
 * for their own use.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetFile {

    /**
     * Returns assiciated permissions.
     * 
     * @return {@link SqlJetFileOpenPermission}
     */
    EnumSet<SqlJetFileOpenPermission> getPermissions();

    /**
     * Close a file.
     * 
     * @throws SqlJetException
     */
    void close() throws SqlJetException;

    /**
     * Read data from a file into a buffer.
     * 
     * @param buffer
     * @param amount
     * @param offset
     * @return
     * @throws SqlJetException
     */
    int read(final byte[] buffer, final int amount, final long offset) throws SqlJetException;

    /**
     * Write data from a buffer into a file. 
     * 
     * @param buffer
     * @param amount
     * @param offset
     * @return
     * @throws SqlJetException
     */
    int write(final byte[] buffer, final int amount, final long offset) throws SqlJetException;

    /**
     * Truncate an open file to a specified size
     * 
     * @param size
     * @return
     * @throws SqlJetException
     */
    boolean truncate(final long size) throws SqlJetException;

    /**
     * Make sure all writes to a particular file are committed to disk.
     *
     * If dataOnly==false then both the file itself and its metadata (file
     * size, access time, etc) are synced.  If dataOnly==true then only the
     * file data is synced.
     *
     * Also make sure that the directory entry for the file
     * has been created by fsync-ing the directory that contains the file.
     * If we do not do this and we encounter a power failure, the directory
     * entry for the journal might not exist after we reboot.  The next
     * SQLite to access the file will not know that the journal exists (because
     * the directory entry for the journal was never created) and the transaction
     * will not roll back - possibly leading to database corruption.
     *
     * @param dataOnly
     * @param full
     * @throws SqlJetException
     */
    void sync(final boolean dataOnly, final boolean full) throws SqlJetException;

    /**
     * Determine the current size of a file in bytes
     * 
     * @return
     * @throws SqlJetException
     */
    long fileSize() throws SqlJetException;

    /**
     * Lock the file with the lock specified by parameter locktype - one
     * of the following:
     *
     *     (1) SHARED
     *     (2) RESERVED
     *     (3) PENDING
     *     (4) EXCLUSIVE
     *
     * Sometimes when requesting one lock state, additional lock states
     * are inserted in between.  The locking might fail on one of the later
     * transitions leaving the lock state different from what it started but
     * still short of its goal.  The following chart shows the allowed
     * transitions and the inserted intermediate states:
     *
     *    UNLOCKED -> SHARED
     *    SHARED -> RESERVED
     *    SHARED -> (PENDING) -> EXCLUSIVE
     *    RESERVED -> (PENDING) -> EXCLUSIVE
     *    PENDING -> EXCLUSIVE
     *
     * This routine will only increase a lock. 
     * 
     * 
     * @param lockType
     * @throws SqlJetException
     */
    void lock(final SqlJetLockType lockType) throws SqlJetException;

    /**
     * Lower the locking level on file descriptor pFile to locktype.  locktype
     * must be either NONE or SHARED.
     *
     * If the locking level of the file descriptor is already at or below
     * the requested locking level, this routine is a no-op.
     * 
     * @param lockType
     * @throws SqlJetException
     */
    void unlock(final SqlJetLockType lockType) throws SqlJetException;

    /**
     * This routine checks if there is a RESERVED lock held on the specified
     * file by this or any other process. The return value is set 
     * unless an I/O error occurs during lock checking.
     * 
     * @return
     */
    boolean checkReservedLock();

    /**
     * Returns lock type of file.
     * 
     * @return
     * @throws SqlJetException
     */
    SqlJetLockType lockType() throws SqlJetException;

    /**
     * Return the sector size in bytes of the underlying block device for
     * the specified file. This is almost always 512 bytes, but may be
     * larger for some devices.
     *
     * SqlJet code assumes this function cannot fail. It also assumes that
     * if two files are created in the same file-system directory (i.e.
     * a database and its journal file) that the sector size will be the
     * same for both.
     * 
     * @return
     */
    int sectorSize();

    /**
     * Return the device characteristics for the file.
     * 
     * @return
     */
    EnumSet<SqlJetDeviceCharacteristics> deviceCharacteristics();

}
