/**
 * RepCacheDaoTest.java
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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.repcache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCacheDaoTest {

    public static final String REP_CACHE_DAO_TEST = "RepCacheDaoTest";

    private static final Logger logger = Logger.getLogger("REP_CACHE_DAO_TEST");
    public static final boolean REP_CACHE_DAO_TEST_LOGGING = SqlJetUtility.getBoolSysProp(REP_CACHE_DAO_TEST
            + ".LOGGING", false);
    static {
        logger.setLevel(REP_CACHE_DAO_TEST_LOGGING ? Level.ALL : Level.OFF);
    }

    public static final String REP_CACHE_DB = SqlJetUtility.getSysProp(REP_CACHE_DAO_TEST + ".REP_CACHE_DB",
            "sqljet-test/db/rep-cache/rep-cache.db");

    private static final boolean DELETE_COPY = SqlJetUtility.getBoolSysProp(REP_CACHE_DAO_TEST + ".DELETE_COPY", true);
    private static final boolean CHECK_PASS_COUNT = SqlJetUtility.getBoolSysProp(REP_CACHE_DAO_TEST + ".CHECK_PASS_COUNT", true);
    private static final int PASS_COUNT = SqlJetUtility.getIntSysProp(REP_CACHE_DAO_TEST + ".PASS_COUNT", 100);

    private File repCache = new File(REP_CACHE_DB);
    private File repCacheCopy;
    private RepCacheDao dao;
    private RepCacheDao daoCopy;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        copyRepCache();
        dao = new RepCacheDao(repCache, false);
        daoCopy = new RepCacheDao(repCacheCopy, true);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        dao.close();
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    private void copyRepCache() throws IOException, FileNotFoundException {
        repCacheCopy = File.createTempFile("rep-cache", null);
        if (DELETE_COPY)
            repCacheCopy.deleteOnExit();
        RandomAccessFile in = new RandomAccessFile(repCache, "r");
        RandomAccessFile out = new RandomAccessFile(repCacheCopy, "rw");
        byte[] b = new byte[4096];
        for (int i = in.read(b); i > 0; i = in.read(b))
            out.write(b, 0, i);
        in.close();
        out.close();
    }

    @Test
    public void readAll() throws SqlJetException {
        int pass = 0;
        boolean passed = false;
        if (dao.first()) {
            do {
                final RepCache repCache = dao.getRepCache();
                Assert.assertNotNull(repCache);
                Assert.assertNotNull(repCache.getHash());
                Assert.assertNotNull(repCache.getRevision());
                Assert.assertNotNull(repCache.getOffset());
                Assert.assertNotNull(repCache.getSize());
                Assert.assertNotNull(repCache.getExpandedSize());
                logger.info(repCache.toString());
                passed = true;
                if(CHECK_PASS_COUNT&&pass++>PASS_COUNT) break;
            } while (dao.next());
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void searchAll() throws SqlJetException {
        int pass = 0;
        boolean passed = false;
        if (dao.first()) {
            do {
                final RepCache repCache = dao.getRepCache();
                Assert.assertNotNull(repCache);
                final String hash = repCache.getHash();
                Assert.assertNotNull(hash);
                final RepCache byHash = daoCopy.getByHash(hash);
                Assert.assertNotNull(byHash);
                Assert.assertNotNull(byHash.getHash());
                Assert.assertNotNull(byHash.getRevision());
                Assert.assertNotNull(byHash.getOffset());
                Assert.assertNotNull(byHash.getSize());
                Assert.assertNotNull(byHash.getExpandedSize());
                Assert.assertEquals(byHash.getHash(), repCache.getHash());
                Assert.assertEquals(byHash.getRevision(), repCache.getRevision());
                Assert.assertEquals(byHash.getOffset(), repCache.getOffset());
                Assert.assertEquals(byHash.getSize(), repCache.getSize());
                Assert.assertEquals(byHash.getExpandedSize(), repCache.getExpandedSize());
                passed = true;
                if(CHECK_PASS_COUNT&&pass++>PASS_COUNT) break;
            } while (dao.next());
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void deleteAll() throws SqlJetException {
        int pass = 0;
        boolean passed = false;
        if (dao.first()) {
            do {
                final RepCache repCache = dao.getRepCache();
                Assert.assertNotNull(repCache);
                final String hash = repCache.getHash();
                Assert.assertNotNull(hash);
                passed = daoCopy.deleteByHash(hash);
                Assert.assertTrue(passed);
                if(CHECK_PASS_COUNT&&pass++>PASS_COUNT) break;
            } while (dao.next());
        }
        Assert.assertTrue(passed);
        if(!CHECK_PASS_COUNT) {
            daoCopy.first();
            Assert.assertFalse(daoCopy.next());
        }
    }

    @Test
    public void update() throws SqlJetException {
        boolean passed = false;
        if (dao.first()) {
            final RepCache repCache = dao.getRepCache();
            Assert.assertNotNull(repCache);
            final String hash = repCache.getHash();
            Assert.assertNotNull(hash);
            repCache.setRevision(repCache.getRevision() + 1);
            passed = daoCopy.update(repCache);
            Assert.assertTrue(passed);
            final RepCache byHash = daoCopy.getByHash(hash);
            Assert.assertNotNull(byHash);
            Assert.assertNotNull(byHash.getHash());
            Assert.assertNotNull(byHash.getRevision());
            Assert.assertNotNull(byHash.getOffset());
            Assert.assertNotNull(byHash.getSize());
            Assert.assertNotNull(byHash.getExpandedSize());
            Assert.assertEquals(repCache.getHash(), byHash.getHash());
            Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
            Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
            Assert.assertEquals(repCache.getSize(), byHash.getSize());
            Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void updateAll() throws SqlJetException {
        int pass = 0;
        boolean passed = false;
        if (dao.first()) {
            do {
                final RepCache repCache = dao.getRepCache();
                Assert.assertNotNull(repCache);
                final String hash = repCache.getHash();
                Assert.assertNotNull(hash);
                repCache.setRevision(repCache.getRevision() + 1);
                passed = daoCopy.update(repCache);
                Assert.assertTrue(passed);
                final RepCache byHash = daoCopy.getByHash(hash);
                Assert.assertNotNull(byHash);
                Assert.assertNotNull(byHash.getHash());
                Assert.assertNotNull(byHash.getRevision());
                Assert.assertNotNull(byHash.getOffset());
                Assert.assertNotNull(byHash.getSize());
                Assert.assertNotNull(byHash.getExpandedSize());
                Assert.assertEquals(repCache.getHash(), byHash.getHash());
                Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
                Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
                Assert.assertEquals(repCache.getSize(), byHash.getSize());
                Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
                if(CHECK_PASS_COUNT&&pass++>PASS_COUNT) break;
            } while (dao.next());
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void insert() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        for (int i = 0; i < PASS_COUNT; i++) {
            RepCache repCache = new RepCache(
                    Long.toString(SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE))), SqlJetUtility
                            .toUnsigned(random.nextInt(Integer.MAX_VALUE)), SqlJetUtility.toUnsigned(random
                            .nextInt(Integer.MAX_VALUE)), SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE)),
                    SqlJetUtility.toUnsigned(random.nextInt(Integer.MAX_VALUE)));
            passed = daoCopy.insert(repCache);
            Assert.assertTrue(passed);
            final RepCache byHash = daoCopy.getByHash(repCache.getHash());
            Assert.assertNotNull(byHash);
            Assert.assertNotNull(byHash.getHash());
            Assert.assertNotNull(byHash.getRevision());
            Assert.assertNotNull(byHash.getOffset());
            Assert.assertNotNull(byHash.getSize());
            Assert.assertNotNull(byHash.getExpandedSize());
            Assert.assertEquals(repCache.getHash(), byHash.getHash());
            Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
            Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
            Assert.assertEquals(repCache.getSize(), byHash.getSize());
            Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
        }
    }

    @Test
    public void insertUnsignedLong() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long unsignedLong = Long.MAX_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), unsignedLong,
                unsignedLong, unsignedLong, unsignedLong);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    @Test
    public void insertUnsignedInt() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long unsignedInt = Integer.MAX_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), unsignedInt,
                unsignedInt, unsignedInt, unsignedInt);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    @Test
    public void insertSignedByte() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long signedByte = Byte.MIN_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), signedByte,
                signedByte, signedByte, signedByte);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    @Test
    public void insertSignedShort() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long signedShort = Short.MIN_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), signedShort,
                signedShort, signedShort, signedShort);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    @Test
    public void insertSignedInt() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long signedInt = Integer.MIN_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), signedInt,
                signedInt, signedInt, signedInt);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    @Test
    public void insertSignedLong() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long signedLong = Long.MIN_VALUE;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), signedLong,
                signedLong, signedLong, signedLong);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }

    // 5722908

    @Test
    public void insertWeird() throws SqlJetException {
        boolean passed = false;
        final Random random = new Random();
        final long weird = 5722908;
        RepCache repCache = new RepCache(Long.toString(SqlJetUtility.toUnsigned(random.nextInt())), weird,
                weird, weird, weird);
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);
        final RepCache byHash = daoCopy.getByHash(repCache.getHash());
        Assert.assertNotNull(byHash);
        Assert.assertNotNull(byHash.getHash());
        Assert.assertNotNull(byHash.getRevision());
        Assert.assertNotNull(byHash.getOffset());
        Assert.assertNotNull(byHash.getSize());
        Assert.assertNotNull(byHash.getExpandedSize());
        Assert.assertEquals(repCache.getHash(), byHash.getHash());
        Assert.assertEquals(repCache.getRevision(), byHash.getRevision());
        Assert.assertEquals(repCache.getOffset(), byHash.getOffset());
        Assert.assertEquals(repCache.getSize(), byHash.getSize());
        Assert.assertEquals(repCache.getExpandedSize(), byHash.getExpandedSize());
    }
    
    
}
