/**
 * SqlJetBtreeTest.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetAbstractLoggedTest;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtree;
import org.tmatesoft.sqljet.core.internal.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.internal.ISqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetBtreeTableCreateFlags;
import org.tmatesoft.sqljet.core.internal.SqlJetCloneable;
import org.tmatesoft.sqljet.core.internal.SqlJetFileOpenPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;
import org.tmatesoft.sqljet.core.internal.btree.SqlJetBtree;
import org.tmatesoft.sqljet.core.internal.db.SqlJetDbHandle;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFileSystemsManager;
import org.tmatesoft.sqljet.core.internal.fs.util.SqlJetFileUtil;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeTest extends SqlJetAbstractLoggedTest {

    private ISqlJetFileSystem fileSystem = SqlJetFileSystemsManager.getManager().find(null);
    private File testDataBase = new File("src/test/data/db/testdb.sqlite");
    private File testWriteNativeFile = new File("src/test/data/db/write.native");
    private File testDeleteNativeFile = new File("src/test/data/db/delete.native");
    private File testUpdateNativeFile = new File("src/test/data/db/update.native");
    private File testTempFile;
    private ISqlJetBtree btree;
    private ISqlJetDbHandle db = new SqlJetDbHandle();

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        testTempFile = fileSystem.getTempFile();
        btree = new SqlJetBtree();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        if (testTempFile != null) {
            SqlJetFileUtil.deleteFile(testTempFile);
        }
    }

    static class _OvflCell extends SqlJetCloneable {
        ByteBuffer pCell;
        int idx;
    }

    @Test
    public void testClone() throws Exception {

        _OvflCell c1 = new _OvflCell();
        c1.pCell = ByteBuffer.allocate(1);
        c1.idx = 1;
        c1.pCell.put((byte) 1);

        _OvflCell c2 = SqlJetUtility.memcpy(c1);

        Assert.assertNotNull(c2);
        Assert.assertNotNull(c2.pCell);
        Assert.assertEquals(c2.idx, c1.idx);
        Assert.assertSame(c2.pCell, c1.pCell);
        Assert.assertNotSame(c2, c1);

    }

    @Test
    public void testRead() throws Exception {
        db.getMutex().enter();
        try {
            btree.open(testDataBase, db, SqlJetUtility.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB,
                    SqlJetUtility.of(SqlJetFileOpenPermission.READONLY));
            try {
                btree.beginTrans(SqlJetTransactionMode.READ_ONLY);
                final int pageCount = btree.getPager().getPageCount();
                for (int i = 1; i <= pageCount; i++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(i, false, null);
                    c.enterCursor();
                    try {
                        final short flags = c.flags();
                        boolean intKey = SqlJetBtreeTableCreateFlags.INTKEY.hasFlag(flags);
                        if (!intKey)
                            continue;
                        logger.info("table " + i);
                        if (c.first()) {
                            logger.info("empty");
                        } else {
                            do {
                                final long key = c.getKeySize();
                                final int dataSize = c.getDataSize();
                                ISqlJetMemoryPointer data = SqlJetUtility.allocatePtr(dataSize);
                                c.data(0, dataSize, data);
                                final String str = SqlJetUtility.toString(data, SqlJetEncoding.UTF8).replaceAll(
                                        "[^\\p{Print}]", "?");
                                logger.info("record " + key + " : \"" + str + "\"");
                            } while (!c.next());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
            } finally {
                btree.close();
            }
        } finally {
            db.getMutex().leave();
        }
    }

    @Test
    public void testWrite() throws Exception {
        db.getMutex().enter();
        try {

            final String data = "Test data";
            final byte[] bytes = SqlJetUtility.getBytes(data);
            ISqlJetMemoryPointer pData = SqlJetUtility.wrapPtr(bytes);

            final Set<SqlJetBtreeFlags> btreeFlags = SqlJetUtility.of(SqlJetBtreeFlags.CREATE,
                    SqlJetBtreeFlags.READWRITE);
            final Set<SqlJetFileOpenPermission> fileFlags = SqlJetUtility.of(SqlJetFileOpenPermission.CREATE,
                    SqlJetFileOpenPermission.READWRITE);
            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                btree.beginTrans(SqlJetTransactionMode.WRITE);
                for (int x = 1; x <= 3; x++) {
                    final int table = btree.createTable(SqlJetUtility.of(SqlJetBtreeTableCreateFlags.INTKEY,
                            SqlJetBtreeTableCreateFlags.LEAFDATA));
                    final ISqlJetBtreeCursor c = btree.getCursor(table, true, null);
                    c.enterCursor();
                    try {
                        for (int y = 1; y <= 3; y++) {
                            c.insert(null, y, pData, pData.remaining(), 0, false);
                        }
                        c.closeCursor();
                    } finally {
                        c.leaveCursor();
                    }
                }
                btree.commit();
            } finally {
                btree.close();
            }

            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                final int pageCount = btree.getPager().getPageCount();
                for (int i = 1; i <= pageCount; i++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(i, false, null);
                    c.enterCursor();
                    try {
                        if (!c.first()) {
                            logger.info("table " + i);
                            do {
                                StringBuilder s = new StringBuilder();
                                final long key = c.getKeySize();
                                if (key != 0)
                                    s.append("record ").append(key).append(" : ");
                                final int dataSize = c.getDataSize();
                                if (dataSize > 0) {
                                    ISqlJetMemoryPointer b = SqlJetUtility.allocatePtr(dataSize);
                                    c.data(0, dataSize, b);
                                    final String str = SqlJetUtility.toString(b, SqlJetEncoding.UTF8);
                                    s.append("\"").append(str.replaceAll("[^\\p{Print}]", "?")).append("\"");
                                    Assert.assertEquals(data, str);
                                }
                                if (s.length() > 0)
                                    logger.info(s.toString());
                            } while (!c.next());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
            } finally {
                btree.close();
            }

        } finally {
            db.getMutex().leave();
        }

        Assert.assertTrue("output file is'nt equal to native", compareFiles(testTempFile, testWriteNativeFile));
        logger.info("Output is equal to native");

    }

    /**
     * @param testTempFile2
     * @param testNativeTmpFile2
     */
    private boolean compareFiles(File f1, File f2) throws Exception {
        RandomAccessFile i1 = new RandomAccessFile(f1, "r");
        try {
            RandomAccessFile i2 = new RandomAccessFile(f2, "r");
            try {
                final MappedByteBuffer m1 = i1.getChannel().map(MapMode.READ_ONLY, 0, i1.length());
                final MappedByteBuffer m2 = i2.getChannel().map(MapMode.READ_ONLY, 0, i2.length());
                while (m1.hasRemaining() && m2.hasRemaining()) {
                    final byte b1 = m1.get();
                    final byte b2 = m2.get();
                    if (b1 != b2)
                        return false;

                }
                if (m1.hasRemaining() || m2.hasRemaining())
                    return false;
            } finally {
                i2.close();
            }
        } finally {
            i1.close();
        }
        return true;
    }

    @Test
    public void testDelete() throws Exception {
        db.getMutex().enter();
        try {

            final Set<SqlJetBtreeFlags> btreeFlags = SqlJetUtility.of(SqlJetBtreeFlags.CREATE,
                    SqlJetBtreeFlags.READWRITE);
            final Set<SqlJetFileOpenPermission> fileFlags = SqlJetUtility.of(SqlJetFileOpenPermission.CREATE,
                    SqlJetFileOpenPermission.READWRITE);
            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                final ISqlJetMemoryPointer pData = SqlJetUtility.wrapPtr(SqlJetUtility.getBytes("Test data"));
                btree.beginTrans(SqlJetTransactionMode.WRITE);
                for (int x = 1; x <= 3; x++) {
                    final int table = btree.createTable(SqlJetUtility.of(SqlJetBtreeTableCreateFlags.INTKEY,
                            SqlJetBtreeTableCreateFlags.LEAFDATA));
                    final ISqlJetBtreeCursor c = btree.getCursor(table, true, null);
                    c.enterCursor();
                    try {
                        for (int y = 1; y <= 3; y++) {
                            c.insert(null, y, pData, pData.remaining(), 0, false);
                        }
                        c.closeCursor();
                    } finally {
                        c.leaveCursor();
                    }
                }
                btree.commit();
            } finally {
                btree.close();
            }

            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                btree.beginTrans(SqlJetTransactionMode.WRITE);
                final int pageCount = btree.getPager().getPageCount();
                for (int x = 1; x <= pageCount; x++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(x, true, null);
                    c.enterCursor();
                    try {
                        if (!c.first()) {
                            do {
                                c.delete();
                            } while (!c.eof());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
                btree.commit();
            } finally {
                btree.close();
            }

            btree.open(testTempFile, db, SqlJetUtility.of(SqlJetBtreeFlags.READONLY), SqlJetFileType.MAIN_DB,
                    SqlJetUtility.of(SqlJetFileOpenPermission.READONLY));
            try {
                btree.beginTrans(SqlJetTransactionMode.READ_ONLY);
                final int pageCount = btree.getPager().getPageCount();
                for (int i = 1; i <= pageCount; i++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(i, false, null);
                    c.enterCursor();
                    try {
                        final short flags = c.flags();
                        boolean intKey = SqlJetBtreeTableCreateFlags.INTKEY.hasFlag(flags);
                        if (!intKey)
                            continue;
                        logger.info("table " + i);
                        if (c.first()) {
                            logger.info("empty");
                        } else {
                            do {
                                final long key = c.getKeySize();
                                final int dataSize = c.getDataSize();
                                ISqlJetMemoryPointer data = SqlJetUtility.allocatePtr(dataSize);
                                c.data(0, dataSize, data);
                                final String str = SqlJetUtility.toString(data, SqlJetEncoding.UTF8).replaceAll(
                                        "[^\\p{Print}]", "?");
                                logger.info("record " + key + " : \"" + str + "\"");
                            } while (!c.next());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
            } finally {
                btree.close();
            }

        } finally {
            db.getMutex().leave();
        }

        Assert.assertTrue("output file is'nt equal to native", compareFiles(testTempFile, testDeleteNativeFile));
        logger.info("Output is equal to native");

    }

    @Test
    public void testUpdate() throws Exception {
        db.getMutex().enter();
        try {

            String data = "Test data";
            byte[] bytes = SqlJetUtility.getBytes(data);
            ISqlJetMemoryPointer pData = SqlJetUtility.wrapPtr(bytes);

            final Set<SqlJetBtreeFlags> btreeFlags = SqlJetUtility.of(SqlJetBtreeFlags.CREATE,
                    SqlJetBtreeFlags.READWRITE);
            final Set<SqlJetFileOpenPermission> fileFlags = SqlJetUtility.of(SqlJetFileOpenPermission.CREATE,
                    SqlJetFileOpenPermission.READWRITE);
            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                btree.beginTrans(SqlJetTransactionMode.WRITE);
                for (int x = 1; x <= 3; x++) {
                    final int table = btree.createTable(SqlJetUtility.of(SqlJetBtreeTableCreateFlags.INTKEY,
                            SqlJetBtreeTableCreateFlags.LEAFDATA));
                    final ISqlJetBtreeCursor c = btree.getCursor(table, true, null);
                    c.enterCursor();
                    try {
                        for (int y = 1; y <= 3; y++) {
                            c.insert(null, y, pData, pData.remaining(), 0, false);
                        }
                        c.closeCursor();
                    } finally {
                        c.leaveCursor();
                    }
                }
                btree.commit();
            } finally {
                btree.close();
            }

            data = "Data test";
            bytes = SqlJetUtility.getBytes(data);
            pData = SqlJetUtility.wrapPtr(bytes);

            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                btree.beginTrans(SqlJetTransactionMode.WRITE);
                final int pageCount = btree.getPager().getPageCount();
                for (int x = 1; x <= pageCount; x++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(x, true, null);
                    c.enterCursor();
                    try {
                        if (!c.first()) {
                            c.cacheOverflow();
                            do {
                                c.putData(0, pData.remaining(), pData);
                            } while (!c.next());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
                btree.commit();
            } finally {
                btree.close();
            }

            btree.open(testTempFile, db, btreeFlags, SqlJetFileType.MAIN_DB, fileFlags);
            try {
                final int pageCount = btree.getPager().getPageCount();
                for (int i = 1; i <= pageCount; i++) {
                    final ISqlJetBtreeCursor c = btree.getCursor(i, false, null);
                    c.enterCursor();
                    try {
                        if (!c.first()) {
                            logger.info("table " + i);
                            do {
                                StringBuilder s = new StringBuilder();
                                final long key = c.getKeySize();
                                if (key != 0)
                                    s.append("record ").append(key).append(" : ");
                                final int dataSize = c.getDataSize();
                                if (dataSize > 0) {
                                    ISqlJetMemoryPointer b = SqlJetUtility.allocatePtr(dataSize);
                                    c.data(0, dataSize, b);
                                    final String str = SqlJetUtility.toString(b, SqlJetEncoding.UTF8);
                                    s.append("\"").append(str.replaceAll("[^\\p{Print}]", "?")).append("\"");
                                    Assert.assertEquals(data, str);
                                }
                                if (s.length() > 0)
                                    logger.info(s.toString());
                            } while (!c.next());
                        }
                    } finally {
                        c.leaveCursor();
                    }
                }
            } finally {
                btree.close();
            }

        } finally {
            db.getMutex().leave();
        }

        Assert.assertTrue("output file is'nt equal to native", compareFiles(testTempFile, testUpdateNativeFile));
        logger.info("Output is equal to native");

    }

}
