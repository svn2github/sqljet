/**
 * FSRepresentationCacheTest.java
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
package org.tmatesoft.sqljet.repcache.fs;

import java.io.File;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class FSRepresentationCacheTest {

    /**
     * 
     */
    private static final int REPEATS = 10;
    private File dbFile;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        dbFile = File.createTempFile("repcache", null);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        if (dbFile != null && dbFile.exists()) {
            dbFile.delete();
        }
    }

    @Test
    public void justCreate() throws SqlJetException {
        FSRepresentationCacheManager.createRepresentationCache(dbFile);
    }

    @Test
    public void insertRandomOne() throws SqlJetException {
        FSRepresentationCacheManager.createRepresentationCache(dbFile);
        FSRepresentationCacheManager cache = FSRepresentationCacheManager.openRepresentationCache(dbFile);
        Random rand = new Random();
        FSRepresentation rep = new FSRepresentation();
        rep.setSHA1HexDigest(String.valueOf(Math.abs(rand.nextLong())));
        rep.setMD5HexDigest(String.valueOf(Math.abs(rand.nextLong())));
        rep.setTxnId(String.valueOf(Math.abs(rand.nextLong())));
        rep.setUniquifier(String.valueOf(Math.abs(rand.nextLong())));
        rep.setExpandedSize(Math.abs(rand.nextLong()));
        rep.setOffset(Math.abs(rand.nextLong()));
        rep.setRevision(Math.abs(rand.nextLong()));
        rep.setSize(Math.abs(rand.nextLong()));
        cache.insert(rep, true);
    }

    @Test
    public void insertRandomMany() throws SqlJetException {
        FSRepresentationCacheManager.createRepresentationCache(dbFile);
        FSRepresentationCacheManager cache = FSRepresentationCacheManager.openRepresentationCache(dbFile);
        Random rand = new Random();
        for (int i = 0; i < REPEATS; i++) {
            FSRepresentation rep = new FSRepresentation();
            rep.setSHA1HexDigest(String.valueOf(Math.abs(rand.nextLong())));
            rep.setMD5HexDigest(String.valueOf(Math.abs(rand.nextLong())));
            rep.setTxnId(String.valueOf(Math.abs(rand.nextLong())));
            rep.setUniquifier(String.valueOf(Math.abs(rand.nextLong())));
            rep.setExpandedSize(Math.abs(rand.nextLong()));
            rep.setOffset(Math.abs(rand.nextLong()));
            rep.setRevision(Math.abs(rand.nextLong()));
            rep.setSize(Math.abs(rand.nextLong()));
            cache.insert(rep, true);
        }
    }
}
