/**
 * SqlJetFileSystemTest.java
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
import java.util.EnumSet;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tmatesoft.sqljet.core.ISqlJetFileSystem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFileSystemTest {

    /**
     * Permissions for read only access
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_READONLY = EnumSet
            .of(SqlJetFileOpenPermission.READONLY);
    
    /**
     * Permissions for temporary file
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_TEMPORARY = 
        EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.READWRITE, 
                SqlJetFileOpenPermission.DELETEONCLOSE);

    /**
     * Permissions for both read only and write access - one wrong combination
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_READONLY_AND_WRITE = EnumSet
            .of(SqlJetFileOpenPermission.READONLY, SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for only create access - other wrong combination
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE_ONLY = EnumSet
            .of(SqlJetFileOpenPermission.CREATE);

    /**
     * Permissions for create and readonly access - wrong
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE_READONLY = EnumSet
            .of(SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READONLY);
    
    /**
     * Permissions for create and write access - right
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE = EnumSet
            .of(SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for exclusive, create and write access - right
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_EXCLUSIVE_CREATE = EnumSet
            .of( SqlJetFileOpenPermission.EXCLUSIVE, SqlJetFileOpenPermission.CREATE, 
                    SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for exclusive, create and write access - right
     */
    private static final EnumSet<SqlJetFileOpenPermission> PERM_EXCLUSIVE_ONLY = EnumSet
            .of( SqlJetFileOpenPermission.EXCLUSIVE);
    
    
    /**
     * Test file path;
     */
    private static final String TEST_FILE = "SqlJetFileSystemTest";

    private File path;
    private File pathNew;

    private ISqlJetFileSystem fileSystem;
    private ISqlJetFile file;

    /**
     * @return the pathPrivateExists
     */
    public File getPathPrivateExists() {
        return path;
    }

    /**
     * @param pathPrivateExists
     *            the pathPrivateExists to set
     */
    public void setPathPrivateExists(File pathPrivateExists) {
        this.path = pathPrivateExists;
    }

    /**
     * @return the pathNew
     */
    public File getPathNew() {
        return pathNew;
    }

    /**
     * @param pathNew the pathNew to set
     */
    public void setPathNew(File pathNew) {
        this.pathNew = pathNew;
    }
    
    /**
     * @return the fileSystem
     */
    public ISqlJetFileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * @param fileSystem
     *            the fileSystem to set
     */
    public void setFileSystem(ISqlJetFileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * @return the file
     */
    public ISqlJetFile getFile() {
        return file;
    }

    /**
     * @param file
     *            the file to set
     */
    public void setFile(ISqlJetFile file) {
        this.file = file;
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        setUpEnvironment();
        setUpInstances();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        cleanUpInstances();
        cleanUpEnvironment();
    }

    /**
     * Set up external environment for testing. For example creates files.
     * 
     * @throws Exception
     */
    protected void setUpEnvironment() throws Exception {

        final Exception cantCreate = new Exception("Can't create temporary file for test");

        path = File.createTempFile(TEST_FILE, null);
        if (null == path)
            throw cantCreate;
        path.deleteOnExit();

        pathNew = File.createTempFile(TEST_FILE, null);
        if (null == pathNew)
            throw cantCreate;
        pathNew.deleteOnExit();
        pathNew.delete();
        
    }

    /**
     * Clean up external environment. For example deletes temporary files.
     * 
     */
    protected void cleanUpEnvironment() throws Exception {

        if (null != path)
            path.delete();
        path = null;

        if (null != pathNew)
            pathNew.delete();
        pathNew = null;
        
    }

    /**
     * Set up instances of tested classes.
     * 
     * May be overriden for true implementations.
     * 
     * @throws Exception
     */
    protected void setUpInstances() throws Exception {

        final SqlJetException cantOpen = new SqlJetException(SqlJetErrorCode.CANTOPEN);

        fileSystem = EasyMock.createMock(ISqlJetFileSystem.class);
        file = EasyMock.createMock(ISqlJetFile.class);
        
        EasyMock.expect(fileSystem.open(null, null)).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                (EnumSet<SqlJetFileOpenPermission>)EasyMock.isNull())).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(null, PERM_TEMPORARY)).andReturn(file);

        EasyMock.expect(fileSystem.open(null, PERM_READONLY)).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_READONLY))).andReturn(file);

        EasyMock.expect(fileSystem.open(
                EasyMock.or((File)EasyMock.isNull(),EasyMock.isA(File.class)), 
                EasyMock.eq(PERM_READONLY_AND_WRITE))).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_CREATE_ONLY))).andThrow(cantOpen);
        
        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_CREATE_READONLY))).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_CREATE))).andReturn(file);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_EXCLUSIVE_ONLY))).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_EXCLUSIVE_CREATE))).andReturn(file);
        
        EasyMock.replay(fileSystem);
        EasyMock.replay(file);

    }

    /**
     * Clean up instances of tested classes.
     */
    protected void cleanUpInstances() throws Exception {
        fileSystem = null;
    }

    /*
     * @param path {@link File} or NULL. If NULL then open() must invite its own
     * temporary name for the file. Whenever the filename parameter is NULL it
     * will also be the case that the flags parameter will include {@link
     * SqlJetFileOpenPermission#DELETEONCLOSE}.
     * 
     * @param permissions Exactly one of the {@link
     * SqlJetFileOpenPermission#READWRITE} and {@link
     * SqlJetFileOpenPermission#READONLY} flags must be set, and if {@link
     * SqlJetFileOpenPermission#CREATE} is set, then {@link
     * SqlJetFileOpenPermission#READWRITE} must also be set, and if {@link
     * SqlJetFileOpenPermission#EXCLUSIVE} is set, then {@link
     * SqlJetFileOpenPermission#CREATE} must also be set. if {@link
     * SqlJetFileOpenPermission#DELETEONCLOSE} is set, then {@link
     * SqlJetFileOpenPermission#CREATE} must also be set.
     */

    @Test(expected = SqlJetException.class)
    public void testOpenFileNullPermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, null);
        Assert.fail("File cannot be opened without pemissions");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFilePermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(path, null);
        Assert.fail("File cannot be opened without pemissions");
    }

    @Test
    public void testOpenFileNullTemporary() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, PERM_TEMPORARY);
        Assert.assertNotNull("File can be opened without path if permissions include values:"
                + " CREATE, READWRITE, DELETEONCLOSE", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFileNullReadonly() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, PERM_READONLY);
        Assert.fail("File cannot be opened without path if permission is READONLY");
    }

    @Test
    public void testOpenReadonly() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.exists());
        final ISqlJetFile f = fileSystem.open(path, PERM_READONLY);
        Assert.assertNotNull("File which exists can be opened with permission READONLY", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenReadonlyAndWrite() throws Exception {
        {final ISqlJetFile f = fileSystem.open(null, PERM_READONLY_AND_WRITE);}
        Assert.assertNotNull(path);
        {final ISqlJetFile f = fileSystem.open(path, PERM_READONLY_AND_WRITE);}
        Assert.fail("File cannot be opened with permissions READONLY and READWRITE");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenCreateOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertTrue(!pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE_ONLY );
        Assert.fail("File cannot be opened with permission CREATE only");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenCreateReadonly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertTrue(!pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE_READONLY );
        Assert.fail("File cannot be opened with permissions CREATE and READONLY");
    }

    @Test
    public void testOpenCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertTrue(!pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE);
        Assert.assertNotNull("File can be created with permission CREATE and READWRITE", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenExclusiveOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertTrue(!pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_EXCLUSIVE_ONLY );
        Assert.fail("File cannot be opened with permission EXCLUSIVE only");
    }

    @Test
    public void testOpenExclusiveCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertTrue(!pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_EXCLUSIVE_CREATE);
        Assert.assertNotNull("File can be open with permission EXCLUSIVE, CREATE and READWRITE", f);
    }
    
}
