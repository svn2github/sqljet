/**
 * SqlJetFileTest.java
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

import static org.junit.Assert.*;

import java.util.EnumSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetFileMockTest extends SqlJetFileSystemMockTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#checkReservedLock()}.
     */
    @Test
    public final void testCheckReservedLock() {
        boolean c = file.checkReservedLock();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#close()}.
     * @throws Exception 
     */
    @Test
    public final void testClose() throws Exception {
        file.close();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#deviceCharacteristics()}.
     */
    @Test
    public final void testDeviceCharacteristics() {
        EnumSet<SqlJetDeviceCharacteristics> c = file.deviceCharacteristics();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#fileSize()}.
     * @throws Exception 
     */
    @Test
    public final void testFileSize() throws Exception {
        long s = file.fileSize();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#getPermissions()}.
     */
    @Test
    public final void testGetPermissions() {
        EnumSet<SqlJetFileOpenPermission> p = file.getPermissions();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#lock(org.tmatesoft.sqljet.core.SqlJetLockType)}.
     * @throws Exception 
     */
    @Test
    public final void testLock() throws Exception {
        file.lock(SqlJetLockType.NONE);
        file.lock(SqlJetLockType.SHARED);
        file.lock(SqlJetLockType.RESERVED);
        file.lock(SqlJetLockType.PENDING);
        file.lock(SqlJetLockType.EXCLUSIVE);
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#lockType()}.
     * @throws Exception 
     */
    @Test
    public final void testLockType() throws Exception {
        SqlJetLockType lockType = file.lockType();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#read(byte[], int, long)}.
     * @throws Exception 
     */
    @Test
    public final void testRead() throws Exception {
        int amount = 10;
        long offset = 0;
        byte[] buffer = new byte[amount];
        int read = file.read(buffer, amount, offset);
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#sectorSize()}.
     */
    @Test
    public final void testSectorSize() {
        int s = file.sectorSize();
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#sync(boolean, boolean)}.
     * @throws Exception 
     */
    @Test
    public final void testSync() throws Exception {
        boolean dataOnly = false;
        boolean full = false;
        file.sync(dataOnly, full);
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#truncate(long)}.
     * @throws Exception 
     */
    @Test
    public final void testTruncate() throws Exception {
        long size = 0;
        file.truncate(size);
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#unlock(org.tmatesoft.sqljet.core.SqlJetLockType)}.
     * @throws Exception 
     */
    @Test
    public final void testUnlock() throws Exception {
        file.unlock(SqlJetLockType.EXCLUSIVE);
        file.unlock(SqlJetLockType.PENDING);
        file.unlock(SqlJetLockType.RESERVED);
        file.unlock(SqlJetLockType.SHARED);
        file.unlock(SqlJetLockType.NONE);
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.tmatesoft.sqljet.core.internal.fs.SqlJetFile#write(byte[], int, long)}.
     * @throws Exception 
     */
    @Test
    public final void testWrite() throws Exception {
        int amount = 10;
        long offset = 0;
        byte[] buffer = new byte[amount];
        file.write(buffer, amount, offset);
        fail("Not yet implemented");
    }

}
