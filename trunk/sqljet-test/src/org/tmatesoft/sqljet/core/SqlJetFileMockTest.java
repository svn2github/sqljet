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

import java.util.EnumSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetFileMockTest extends SqlJetAbstractFileSystemMockTest {

    protected ISqlJetFile file;
    protected ISqlJetFile file2;
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.SqlJetAbstractFileSystemMockTest#setUpInstances()
     */
    @Override
    protected void setUpInstances() throws Exception {
        super.setUpInstances();
        file = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_CREATE);
        file2 = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_CREATE);
    }
    
    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.SqlJetAbstractFileSystemMockTest#cleanUpInstances()
     */
    @Override
    protected void cleanUpInstances() throws Exception {
        try{ 
            try{ 
                if(file!=null) 
                    file.close(); 
            } finally {
                if(file2!=null) 
                    file2.close(); 
            }
        } finally { 
            super.cleanUpInstances(); 
        }
    }

    
    @Test
    public void testPermissions() throws Exception {
        final String msg = "File must have permissions to which was opened";
        final EnumSet<SqlJetFileOpenPermission> p = file.getPermissions();
        Assert.assertNotNull(msg, p);
        Assert.assertTrue(msg, p.containsAll(PERM_CREATE));
        
    }

    @Test(expected=SqlJetException.class)
    public void testClose() throws Exception {
        file.close();
        file.sync(false, false);
        Assert.fail("Closed file should not allow perform any input-output");
        
    }
    
    @Test
    public void testReadEmpty() throws Exception {
        Assert.assertTrue(0==path.length());
        final byte[] b = { 0 };
        final int r = file.read(b, 1, 0);
        Assert.assertEquals("Read empty file should return empty data",0,r);
    }

    @Test
    public void testWriteRead() throws Exception {
        Assert.assertTrue(0==path.length());
        final byte[] wb = { 1 };
        file.write(wb, 1, 0);
        final byte[] rb = { 0 };
        final int r = file.read(rb, 1, 0);
        Assert.assertArrayEquals("Reading should get the same data as it was written",wb,rb);
    }

    @Test
    public void testSize() throws Exception {
        final long fileSize = file.fileSize();
        final byte[] wb = { 1 };
        file.write(wb, wb.length, fileSize);
        Assert.assertTrue("File size should be increased after writing after end of file",
                file.fileSize()>fileSize );
    }
    
    @Test
    public void testTruncate() throws Exception {
        Assert.assertTrue(0==path.length());
        final byte[] wb = { 1 };
        final long fileSize = file.fileSize();
        file.write(wb, wb.length, fileSize);
        file.truncate(0);
        Assert.assertTrue("File size should be decreased after truncating",
                0==file.fileSize() );
    }
    
    @Test
    public void testLockShared() throws Exception {
        Assert.assertTrue(file.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file2.lock(SqlJetLockType.SHARED));
    }

    @Test
    public void testLockReserved() throws Exception {
        Assert.assertTrue(file.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file.lock(SqlJetLockType.RESERVED));
        Assert.assertTrue(file2.lock(SqlJetLockType.SHARED));
        Assert.assertFalse(file2.lock(SqlJetLockType.RESERVED));
    }
    
    @Test
    public void testLockExclusive() throws Exception {
        Assert.assertTrue(file.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file2.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file.lock(SqlJetLockType.RESERVED));
        Assert.assertFalse(file.lock(SqlJetLockType.EXCLUSIVE));
    }

    @Test
    public void testCheckReserved() throws Exception {
        Assert.assertTrue(file.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file.lock(SqlJetLockType.RESERVED));
        Assert.assertTrue(file.checkReservedLock());
        Assert.assertFalse(file.lock(SqlJetLockType.EXCLUSIVE));
        Assert.assertTrue(file.checkReservedLock());
    }
    
    
}
