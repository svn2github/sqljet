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
        pager = null;
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
        pager.open(fileSystem, null, null, 0, null, SqlJetFileType.TEMP_DB, EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.DELETEONCLOSE, SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testOpenMain() throws Exception {
        pager.open(fileSystem, file, null, 0, null, SqlJetFileType.MAIN_DB, EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testOpenMemory() throws Exception {
        pager.open(fileSystem, new File(ISqlJetPager.MEMORY_DB), null, 0, null, SqlJetFileType.MAIN_DB, EnumSet.of(
                SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READWRITE));
    }

    /**
     * Test method for
     * {@link org.tmatesoft.sqljet.core.internal.pager.SqlJetPager#open(org.tmatesoft.sqljet.core.ISqlJetFileSystem, java.io.File, org.tmatesoft.sqljet.core.ISqlJetPageDestructor, int, java.util.EnumSet, org.tmatesoft.sqljet.core.SqlJetFileType, java.util.EnumSet)}
     * .
     */
    @Test
    public final void testReadDataBase() throws Exception {
        pager.open(fileSystem, testDataBase, null, 0, null, SqlJetFileType.MAIN_DB, EnumSet
                .of(SqlJetFileOpenPermission.READONLY));
        byte[] zDbHeader = new byte[100];
        pager.readFileHeader(zDbHeader.length, zDbHeader);
        final int pageCount = pager.getPageCount();
        for (int pageNumber = 1; pageNumber <= pageCount; pageNumber++) {
            final ISqlJetPage page = pager.acquirePage(pageNumber, true);
            final byte[] data = page.getData();
            System.out.println( Arrays.toString(data) );
        }
    }
}
