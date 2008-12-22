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
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

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
    protected ISqlJetFile file3;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.SqlJetAbstractFileSystemMockTest#setUpInstances
     * ()
     */
    @Override
    protected void setUpInstances() throws Exception {
        super.setUpInstances();
        file = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_CREATE);
        file2 = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_CREATE);
        file3 = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_CREATE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.SqlJetAbstractFileSystemMockTest#cleanUpInstances
     * ()
     */
    @Override
    protected void cleanUpInstances() throws Exception {
        try {
            try {
                if (file != null)
                    file.close();
            } finally {
                try{
                    if (file2 != null)
                        file2.close();
                } finally {
                    if (file3 != null)
                        file3.close();
                }
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

    @Test(expected = SqlJetException.class)
    public void testClose() throws Exception {
        file.close();
        file.sync(false, false);
        Assert.fail("Closed file should not allow perform any input-output");

    }

    @Test
    public void testReadEmpty() throws Exception {
        Assert.assertTrue(0 == path.length());
        final byte[] b = { 0 };
        final int r = file.read(b, 1, 0);
        Assert.assertEquals("Read empty file should return empty data", 0, r);
    }

    @Test
    public void testWriteRead() throws Exception {
        Assert.assertTrue(0 == path.length());
        final byte[] wb = { 1 };
        file.write(wb, 1, 0);
        final byte[] rb = { 0 };
        final int r = file.read(rb, 1, 0);
        Assert.assertArrayEquals("Reading should get the same data as it was written", wb, rb);
    }

    @Test
    public void testSize() throws Exception {
        final long fileSize = file.fileSize();
        final byte[] wb = { 1 };
        file.write(wb, wb.length, fileSize);
        Assert.assertTrue("File size should be increased after writing after end of file", file.fileSize() > fileSize);
    }

    @Test
    public void testTruncate() throws Exception {
        Assert.assertTrue(0 == path.length());
        final byte[] wb = { 1 };
        final long fileSize = file.fileSize();
        file.write(wb, wb.length, fileSize);
        file.truncate(0);
        Assert.assertTrue("File size should be decreased after truncating", 0 == file.fileSize());
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
        Assert.assertTrue(file.lock(SqlJetLockType.EXCLUSIVE));
        Assert.assertTrue(file.checkReservedLock());
    }

    @Test
    public void testLockSharedThreads() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file2.lock(SqlJetLockType.SHARED);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertTrue(lock2.get());
    }

    @Test
    public void testLockReservedThreads() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED) && file.lock(SqlJetLockType.RESERVED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file2.lock(SqlJetLockType.SHARED) && file2.lock(SqlJetLockType.RESERVED);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertFalse(lock2.get());
    }

    @Test
    public void testLockExclusiveThreads() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file2.lock(SqlJetLockType.SHARED) && file2.lock(SqlJetLockType.RESERVED) && 
                    file2.lock(SqlJetLockType.EXCLUSIVE);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertFalse(lock2.get());
    }

    @Test
    public void testLockCheckReservedThreads() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED) && file.lock(SqlJetLockType.RESERVED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file2.checkReservedLock();
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertTrue(lock2.get());
    }

    @Test
    public void testLockSharedThreads2() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertTrue(lock2.get());
    }

    @Test
    public void testLockReservedThreads2() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED) && file.lock(SqlJetLockType.RESERVED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED) && file2.lock(SqlJetLockType.RESERVED);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertFalse(lock2.get());
    }

    @Test
    public void testLockExclusiveThreads2() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file2.lock(SqlJetLockType.SHARED) && file2.lock(SqlJetLockType.RESERVED) && 
                    file.lock(SqlJetLockType.EXCLUSIVE);
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertFalse(lock2.get());
    }

    @Test
    public void testLockCheckReservedThreads2() throws Exception {
        final Future<Boolean> lock = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.lock(SqlJetLockType.SHARED) && file.lock(SqlJetLockType.RESERVED);
            }
        });
        final Future<Boolean> lock2 = execThread(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return file.checkReservedLock();
            }
        });
        Assert.assertTrue(lock.get());
        Assert.assertTrue(lock2.get());
    }
    
    @Test
    public void testLockClose() throws Exception {
        Assert.assertTrue(file.lock(SqlJetLockType.SHARED));
        Assert.assertTrue(file.lock(SqlJetLockType.RESERVED));
        Assert.assertTrue(file.lock(SqlJetLockType.EXCLUSIVE));
        file2.close();
        Assert.assertFalse(file3.lock(SqlJetLockType.SHARED));
    }
}
