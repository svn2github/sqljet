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
public class SqlJetFileSystemMockTest {

    /**
     * 
     */
    public static final String MOCK_FILE_SYSTEM = "MockFileSystem";

    /**
     * Permissions for read only access
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_READONLY = EnumSet
            .of(SqlJetFileOpenPermission.READONLY);
    
    /**
     * Permissions for temporary file
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_TEMPORARY = 
        EnumSet.of(SqlJetFileOpenPermission.CREATE,
                SqlJetFileOpenPermission.READWRITE, 
                SqlJetFileOpenPermission.DELETEONCLOSE);

    /**
     * Permissions for both read only and write access - one wrong combination
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_READONLY_AND_WRITE = EnumSet
            .of(SqlJetFileOpenPermission.READONLY, SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for only create access - other wrong combination
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE_ONLY = EnumSet
            .of(SqlJetFileOpenPermission.CREATE);

    /**
     * Permissions for create and readonly access - wrong
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE_READONLY = EnumSet
            .of(SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READONLY);
    
    /**
     * Permissions for create and write access - right
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_CREATE = EnumSet
            .of(SqlJetFileOpenPermission.CREATE, SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for exclusive, create and write access - right
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_EXCLUSIVE_CREATE = EnumSet
            .of( SqlJetFileOpenPermission.EXCLUSIVE, SqlJetFileOpenPermission.CREATE, 
                    SqlJetFileOpenPermission.READWRITE);

    /**
     * Permissions for exclusive, create and write access - right
     */
    public static final EnumSet<SqlJetFileOpenPermission> PERM_EXCLUSIVE_ONLY = EnumSet
            .of( SqlJetFileOpenPermission.EXCLUSIVE);
    
    
    /**
     * Test file path;
     */
    public static final String TEST_FILE = "SqlJetFileSystemTest";

    protected File path;
    protected File pathNew;

    protected ISqlJetFileSystem fileSystem;
    protected ISqlJetFile file;

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
    @SuppressWarnings("unchecked")
    protected void setUpInstances() throws Exception {

        fileSystem = EasyMock.createMock(ISqlJetFileSystem.class);
        file = EasyMock.createMock(ISqlJetFile.class);

        /* Setup mocks rules */
        
        EasyMock.expect(fileSystem.getName()).andReturn(MOCK_FILE_SYSTEM);
        
        // open()

        final SqlJetException cantOpen = new SqlJetException(SqlJetErrorCode.CANTOPEN);
        
        EasyMock.expect(fileSystem.open(null, null)).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                (EnumSet<SqlJetFileOpenPermission>)EasyMock.isNull())).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(null, PERM_TEMPORARY)).andReturn(file);

        EasyMock.expect(fileSystem.open(null, PERM_READONLY)).andThrow(cantOpen);

        EasyMock.expect(fileSystem.open(path,PERM_READONLY)).andReturn(file);

        EasyMock.expect(fileSystem.open(pathNew,PERM_READONLY)).andThrow(cantOpen);

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

        EasyMock.expect(fileSystem.open(EasyMock.isA(File.class), 
                EasyMock.eq(PERM_EXCLUSIVE_CREATE))).andReturn(file);

        // delete()

        final SqlJetException cantDelete = new SqlJetIOException(SqlJetIOErrorCode.IOERR_DELETE);

        EasyMock.expect(fileSystem.delete( 
                (File) EasyMock.isNull(), EasyMock.anyBoolean() )
            ).andThrow(cantDelete);
        
        EasyMock.expect(fileSystem.delete( EasyMock.eq(path), 
                EasyMock.anyBoolean() )).andReturn(true);

        EasyMock.expect(fileSystem.delete( EasyMock.eq(pathNew), 
                EasyMock.anyBoolean() )).andReturn(false);
        
        // access()

        
        
        // Run mocks
        
        EasyMock.replay(fileSystem);
        EasyMock.replay(file);

    }

    /**
     * Clean up instances of tested classes.
     */
    protected void cleanUpInstances() throws Exception {
        fileSystem = null;
        file = null;
    }

    // Tests
    
    @Test
    public void testName(){
        final String name = fileSystem.getName();
        Assert.assertTrue("File system should have some unempty name",
                null!=name && !"".equals(name.trim()));
    }
    
    // open()
    
    @Test(expected = SqlJetException.class)
    public void testOpenFileNullPermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, null);
        Assert.fail("File shouldn't be opened without permissions");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFilePermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(path, null);
        Assert.fail("File shouldn't be opened without permissions");
    }

    @Test
    public void testOpenFileNullTemporary() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, PERM_TEMPORARY);
        Assert.assertNotNull("File should be opened without path if permissions include values:"
                + " CREATE, READWRITE, DELETEONCLOSE", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFileNullReadonly() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, PERM_READONLY);
        Assert.fail("File shouldn't be opened without path if permission is READONLY");
    }

    @Test
    public void testOpenReadonly() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.exists());
        final ISqlJetFile f = fileSystem.open(path, PERM_READONLY);
        Assert.assertNotNull("File which exists should be opened with permission READONLY", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenNewReadonly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_READONLY);
        Assert.fail("File which doesn't exists shouldn't be opened with permission READONLY");
    }
    
    @Test(expected = SqlJetException.class)
    public void testOpenReadonlyAndWrite() throws Exception {
        {final ISqlJetFile f = fileSystem.open(null, PERM_READONLY_AND_WRITE);}
        Assert.assertNotNull(path);
        {final ISqlJetFile f = fileSystem.open(path, PERM_READONLY_AND_WRITE);}
        Assert.fail("File shouldn't be opened with permissions READONLY and READWRITE");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenCreateOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE_ONLY );
        Assert.fail("File shouldn't be opened with permission CREATE only");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenCreateReadonly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE_READONLY );
        Assert.fail("File shouldn't be opened with permissions CREATE and READONLY");
    }

    @Test
    public void testOpenCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_CREATE);
        Assert.assertNotNull("File should be created with permission CREATE and READWRITE", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenExclusiveOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_EXCLUSIVE_ONLY );
        Assert.fail("File shouldn't be created with permission EXCLUSIVE only");
    }

    @Test
    public void testOpenExclusiveCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, PERM_EXCLUSIVE_CREATE);
        Assert.assertNotNull("File should be created with permission EXCLUSIVE, CREATE and READWRITE", f);
    }

    // delete()
    
    @Test(expected = SqlJetException.class)
    public void testDeleteNull() throws Exception {

        final boolean d = fileSystem.delete(null, false);
        Assert.fail("It shouldn't delete unknown files denoted by null");
    }
    
    @Test
    public void testDelete() throws Exception {

        {
            Assert.assertNotNull(path);
            Assert.assertTrue(path.exists());
            final boolean d = fileSystem.delete(path, false);
            Assert.assertTrue("If file exists then delete() should return true" +
            		" when success deletes file", d);
        }
        
        {
            Assert.assertNotNull(pathNew);
            Assert.assertFalse(pathNew.exists());
            final boolean d = fileSystem.delete(pathNew, false);
            Assert.assertFalse("If file exists then delete() should return false", d);
        }
        
    }
    
}
