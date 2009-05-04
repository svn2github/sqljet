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
 */
package org.tmatesoft.sqljet.api.repcache;

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
        boolean passed = false;
        dao.first();
        while (dao.next()) {
            final RepCache repCache = dao.getRepCache();
            Assert.assertNotNull(repCache.getHash());
            Assert.assertNotNull(repCache.getRevision());
            Assert.assertNotNull(repCache.getOffset());
            Assert.assertNotNull(repCache.getSize());
            Assert.assertNotNull(repCache.getExpanded_size());
            logger.info(repCache.toString());
            passed = true;
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void searchAll() throws SqlJetException {
        boolean passed = false;
        dao.first();
        while (dao.next()) {
            final RepCache repCache = dao.getRepCache();
            final String hash = repCache.getHash();
            Assert.assertNotNull(hash);
            final RepCache byHash = daoCopy.getByHash(hash);
            Assert.assertNotNull(byHash);
            Assert.assertNotNull(byHash.getHash());
            Assert.assertNotNull(byHash.getRevision());
            Assert.assertNotNull(byHash.getOffset());
            Assert.assertNotNull(byHash.getSize());
            Assert.assertNotNull(byHash.getExpanded_size());
            Assert.assertEquals(byHash.getHash(),repCache.getHash());
            Assert.assertEquals(byHash.getRevision(),repCache.getRevision());
            Assert.assertEquals(byHash.getOffset(),repCache.getOffset());
            Assert.assertEquals(byHash.getSize(),repCache.getSize());
            Assert.assertEquals(byHash.getExpanded_size(),repCache.getExpanded_size());
            passed = true;
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void deleteAll() throws SqlJetException {
        boolean passed = false;
        dao.first();
        while (dao.next()) {
            final RepCache repCache = dao.getRepCache();
            final String hash = repCache.getHash();
            Assert.assertNotNull(hash);
            passed = daoCopy.deleteByHash(hash);
            Assert.assertTrue(passed);
        }
        daoCopy.first();
        Assert.assertFalse(daoCopy.next());
        Assert.assertTrue(passed);
    }

    @Test
    public void updateAll() throws SqlJetException {
        boolean passed = false;
        while (dao.next()) {
            final RepCache repCache = dao.getRepCache();
            final String hash = repCache.getHash();
            Assert.assertNotNull(hash);
            repCache.setRevision(repCache.getRevision()+1);
            passed = daoCopy.update(repCache);
            Assert.assertTrue(passed);
            final RepCache byHash = daoCopy.getByHash(hash);
            Assert.assertNotNull(byHash);
            Assert.assertNotNull(byHash.getHash());
            Assert.assertNotNull(byHash.getRevision());
            Assert.assertNotNull(byHash.getOffset());
            Assert.assertNotNull(byHash.getSize());
            Assert.assertNotNull(byHash.getExpanded_size());
            Assert.assertEquals(repCache.getHash(),byHash.getHash());
            Assert.assertEquals(new Long(repCache.getRevision()+1),byHash.getRevision());
            Assert.assertEquals(repCache.getOffset(),byHash.getOffset());
            Assert.assertEquals(repCache.getSize(),byHash.getSize());
            Assert.assertEquals(repCache.getExpanded_size(),byHash.getExpanded_size());
        }
        Assert.assertTrue(passed);
    }

    @Test
    public void insert() throws SqlJetException {
        boolean passed = false;
        Random random = new Random();
        RepCache repCache = new RepCache(
                    Long.toString(random.nextLong()),
                    random.nextLong(),
                    random.nextLong(),
                    random.nextLong(),
                    random.nextLong()
                );
        passed = daoCopy.insert(repCache);
        Assert.assertTrue(passed);        
    }
    
}
