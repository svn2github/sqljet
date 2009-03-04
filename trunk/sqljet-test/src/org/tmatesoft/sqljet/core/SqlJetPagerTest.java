/**
 * SqlJetPagerTest.java
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

import java.io.File;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.internal.fs.SqlJetFileSystemsManager;
import org.tmatesoft.sqljet.core.internal.pager.SqlJetPager;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetPagerTest {
    
    private Logger logger = Logger.getLogger(SqlJetAbstractMockTest.SQLJET_TEST_LOGGER);

    private ISqlJetFileSystem fileSystem;
    private ISqlJetPager pager;
    private File file;
    private File testDataBase = new File("sqljet-test/db/testdb.sqlite");

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        fileSystem = SqlJetFileSystemsManager.getManager().find(null);
        pager = new SqlJetPager();
        file = fileSystem.getTempFile();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        if(pager!=null) {
//            if(pager.getRefCount()>0) {
//                pager.rollback();
//            }
//            pager.close();
            pager = null;
        }
        fileSystem = null;
        if (null != file)
            file.delete();
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testOpenTemp() throws Exception {
        pager.open(fileSystem, null, null, SqlJetFileType.TEMP_DB, EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.DELETEONCLOSE, SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testOpenMain() throws Exception {
        pager.open(fileSystem, file, null, SqlJetFileType.MAIN_DB, EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testOpenMemory() throws Exception {
        pager.open(fileSystem, new File(ISqlJetPager.MEMORY_DB), null, SqlJetFileType.MAIN_DB, EnumSet.of(
                SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testReadDataBase() throws Exception {
        pager.open(fileSystem, testDataBase, null, SqlJetFileType.MAIN_DB, EnumSet
                .of(SqlJetFileOpenPermission.READONLY));
        byte[] zDbHeader = new byte[100];
        pager.readFileHeader(zDbHeader.length, zDbHeader);
        final int pageCount = pager.getPageCount();
        for (int pageNumber = 1; pageNumber <= pageCount; pageNumber++) {
            final ISqlJetPage page = pager.acquirePage(pageNumber, true);
            final byte[] data = page.getData();
            logger.info("page#"+pageNumber+":"+Arrays.toString(data));
            page.unref();
        }
    }
    
    @Test
    public final void testWriteTemp() throws Exception {
        pager.open(fileSystem, null, null, SqlJetFileType.TEMP_DB, EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.DELETEONCLOSE, SqlJetFileOpenPermission.READWRITE));
        final ISqlJetPage page = pager.acquirePage(1, true);
        pager.begin(true);
        page.write();
        SqlJetUtility.memset(page.getData(), (byte)1, pager.getPageSize());
        pager.commitPhaseOne(null, false);
        pager.commitPhaseTwo();
        page.unref();
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testWriteMain() throws Exception {
        
        pager.open(fileSystem, file, null, SqlJetFileType.MAIN_DB, 
                EnumSet.of(SqlJetFileOpenPermission.CREATE,
                        SqlJetFileOpenPermission.READWRITE));
        int pageSize = pager.getPageSize();
        final int pageNumber = 2;
        ISqlJetPage page = pager.acquirePage(pageNumber, true);
        pager.begin(true);
        page.write();
        SqlJetUtility.memset(page.getData(), (byte)1, pageSize);
        ISqlJetPage page2 = pager.acquirePage(pageNumber+1, true);
        page2.write();
        SqlJetUtility.memset(page2.getData(), (byte)2, pageSize);
        pager.commitPhaseOne(null, false);
        pager.commitPhaseTwo();
        page.unref();
        page2.unref();
        pager.close();

        pager.open(fileSystem, file, null, SqlJetFileType.MAIN_DB, 
                EnumSet.of(SqlJetFileOpenPermission.CREATE,
                        SqlJetFileOpenPermission.READWRITE));
        int pageCount = pager.getPageCount();
        long fileSize = pager.getFile().fileSize();
        logger.info("pages count "+Integer.toString(pageCount));
        logger.info("file size "+Long.toString(fileSize));
        page = pager.acquirePage(pageNumber, true);
        byte[] data = page.getData();
        logger.info("page#"+pageNumber+":"+Arrays.toString(data));
        page2 = pager.acquirePage(pageNumber+1, true);
        byte[] data2 = page2.getData();
        logger.info("page#"+(pageNumber+1)+":"+Arrays.toString(data2));

        pager.begin(true);
        page.write();
        SqlJetUtility.memset(page.getData(), (byte)2, pageSize);
        page2.write();
        SqlJetUtility.memset(page2.getData(), (byte)1, pageSize);
        pager.rollback();
        page.unref();
        page2.unref();
        pager.close();

        pager.open(fileSystem, file, null, SqlJetFileType.MAIN_DB, 
                EnumSet.of(SqlJetFileOpenPermission.CREATE,
                        SqlJetFileOpenPermission.READWRITE));
        pageCount = pager.getPageCount();
        fileSize = pager.getFile().fileSize();
        logger.info("pages count "+Integer.toString(pageCount));
        logger.info("file size "+Long.toString(fileSize));
        page = pager.acquirePage(pageNumber, true);
        data = page.getData();
        logger.info("page#"+pageNumber+":"+Arrays.toString(data));
        page2 = pager.acquirePage(pageNumber+1, true);
        data2 = page2.getData();
        logger.info("page#"+(pageNumber+1)+":"+Arrays.toString(data2));
        
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testWriteMemory() throws Exception {
        pager.open(fileSystem, new File(ISqlJetPager.MEMORY_DB), null, SqlJetFileType.MAIN_DB, EnumSet.of(
                SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READWRITE));
        final ISqlJetPage page = pager.acquirePage(1, true);
        pager.begin(true);
        page.write();
        SqlJetUtility.memset(page.getData(), (byte)1, pager.getPageSize());
        pager.commitPhaseOne(null, false);
        pager.commitPhaseTwo();
        page.unref();
    }
    
}
