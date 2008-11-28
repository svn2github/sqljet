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
import java.security.SecureRandom;
import java.util.EnumSet;

import org.easymock.EasyMock;
import org.easymock.IAnswer;
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
public class SqlJetFileSystemMockTest extends SqlJetAbstractMockTest {

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
    protected File pathReadonly;

    protected ISqlJetFileSystem fileSystem;

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
     * Set up external environment for testing. For example creates files.
     * 
     * @throws Exception
     */
    protected void setUpEnvironment() throws Exception {
        super.setUpEnvironment();

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
        
        pathReadonly = File.createTempFile(TEST_FILE, null);
        if (null == pathReadonly)
            throw cantCreate;
        pathReadonly.deleteOnExit();
        pathReadonly.setReadOnly();
        
    }

    /**
     * Clean up external environment. For example deletes temporary files.
     * 
     */
    protected void cleanUpEnvironment() throws Exception {
        super.cleanUpEnvironment();

        if (null != path)
            path.delete();
        path = null;

        if (null != pathNew)
            pathNew.delete();
        pathNew = null;

        if (null != pathReadonly)
            pathReadonly.delete();
        pathReadonly = null;
        
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
        super.setUpInstances();

        fileSystem = EasyMock.createMock(ISqlJetFileSystem.class);
        final ISqlJetFile file = EasyMock.createMock(ISqlJetFile.class);

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

        EasyMock.expect(fileSystem.delete( 
                (File) EasyMock.or( EasyMock.eq(pathNew), EasyMock.eq(pathReadonly) ), 
                EasyMock.anyBoolean() )).andReturn(false);
        
        // access()

        final SqlJetException cantAccess = new SqlJetIOException(SqlJetIOErrorCode.IOERR_ACCESS);

        EasyMock.expect(fileSystem.access(null,null)).andThrow(cantAccess);
        
        EasyMock.expect(fileSystem.access(
                (File) EasyMock.isNull(), (SqlJetFileAccesPermission) EasyMock.anyObject() )
            ).andThrow(cantAccess);

        EasyMock.expect(fileSystem.access(
                (File) EasyMock.anyObject(), (SqlJetFileAccesPermission) EasyMock.isNull() )
            ).andThrow(cantAccess);

        EasyMock.expect(fileSystem.access( 
                EasyMock.eq(path), (SqlJetFileAccesPermission) EasyMock.anyObject() ) 
            ).andReturn(true);

        EasyMock.expect(fileSystem.access( 
                EasyMock.eq(pathNew), (SqlJetFileAccesPermission) EasyMock.anyObject() ) 
            ).andReturn(false);

        EasyMock.expect(fileSystem.access( 
                pathReadonly, SqlJetFileAccesPermission.EXISTS ) 
            ).andReturn(true);

        EasyMock.expect(fileSystem.access( 
                pathReadonly, SqlJetFileAccesPermission.READONLY ) 
            ).andReturn(true);
        
        EasyMock.expect(fileSystem.access( 
                pathReadonly, SqlJetFileAccesPermission.READWRITE ) 
            ).andReturn(false);
        
        // randomness()

        final SqlJetException misuse = new SqlJetException(SqlJetErrorCode.MISUSE);
        
        EasyMock.expect( fileSystem.randomness(EasyMock.anyInt()) ).andAnswer(
                new IAnswer<byte[]>() {
                    final SecureRandom random = new SecureRandom();
                    public byte[] answer() throws Throwable {
                        final Object[] args = EasyMock.getCurrentArguments();
                        if(null==args||0==args.length) throw misuse;
                        final Object arg = args[0];
                        if(null==arg)  throw misuse;
                        if( arg instanceof Integer ){
                            final Integer numBytes = (Integer) arg;
                            if( 0>=numBytes ) throw misuse;
                            final byte[] bytes = new byte[numBytes];
                            random.nextBytes(bytes);
                            return bytes;
                        } else throw misuse;
                    }
                }
            );

        // sleep()
        
        EasyMock.expect( fileSystem.sleep(EasyMock.anyInt()) ).andAnswer(
                new IAnswer<Integer>(){
                    public Integer answer() throws Throwable {
                        final Object[] args = EasyMock.getCurrentArguments();
                        if(null==args||0==args.length) throw misuse;
                        final Object arg = args[0];
                        if(null==arg)  throw misuse;
                        if( arg instanceof Integer ){
                            final Integer microseconds = (Integer) arg;
                            if( 0>=microseconds ) throw misuse;
                            final long t1 = System.currentTimeMillis();
                            try {
                                Thread.sleep(microseconds);
                            } catch (InterruptedException e) {
                            } finally{
                                final long t2 = System.currentTimeMillis();
                                return (new Long(t2 - t1)).intValue();
                            }
                        } else throw misuse;
                    }
                }
            );

        // currentTime()
        
        EasyMock.expect( fileSystem.currentTime() ).andReturn(1.);
        
        // Run mocks
        
        EasyMock.replay(fileSystem);

    }

    /**
     * Clean up instances of tested classes.
     */
    protected void cleanUpInstances() throws Exception {
        super.cleanUpInstances();
        fileSystem = null;
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
    public void testDeleteExist() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.exists());
        final boolean d = fileSystem.delete(path, false);
        Assert.assertTrue("If file exists then delete() should return true" +
                " when success deletes file", d);
    }
        
    @Test
    public void testDeleteNotExist() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final boolean d = fileSystem.delete(pathNew, false);
        Assert.assertFalse("If file exists then delete() should return false", d);
    }

    @Test
    public void testDeleteReadonly() throws Exception {
        Assert.assertNotNull(pathReadonly);
        Assert.assertFalse(pathReadonly.canWrite());
        final boolean d = fileSystem.delete(pathReadonly, false);
        Assert.assertFalse("If file can't be deleted then delete() should return false", d);
    }
    
    // TODO delete() with sync true
    
    // access()
    
    @Test(expected = SqlJetException.class)
    public void testAccessNull() throws Exception {
        Assert.assertNotNull(path);
        fileSystem.access(null, null);
        fileSystem.access(path, null);
        fileSystem.access(null, SqlJetFileAccesPermission.EXISTS);
        Assert.fail("It shouldn't access unknown files or permissions denoted by nulls");
    }

    @Test
    public void testAccessExists() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.exists());
        final boolean a = fileSystem.access(path, SqlJetFileAccesPermission.EXISTS);
        Assert.assertTrue("It should be able to access file which exists", a);
    }

    @Test
    public void testAccessExistsNew() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final boolean a = fileSystem.access(pathNew, SqlJetFileAccesPermission.EXISTS);
        Assert.assertFalse("It should be unable to access file which doesnt exist", a);        
    }

    @Test
    public void testAccessExistsReadonly() throws Exception {
        Assert.assertNotNull(pathReadonly);
        Assert.assertFalse(pathReadonly.canWrite());
        final boolean a = fileSystem.access(pathReadonly, SqlJetFileAccesPermission.EXISTS);
        Assert.assertTrue("It should be able to access file which is readonly", a);
    }
    
    @Test
    public void testAccessReadonly() throws Exception {
        Assert.assertNotNull(pathReadonly);
        Assert.assertFalse(pathReadonly.canWrite());
        final boolean a = fileSystem.access(pathReadonly, SqlJetFileAccesPermission.READONLY);
        Assert.assertTrue("It should be unable to access file which doesnt exist", a);        
    }

    @Test
    public void testAccessReadwrite() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.canWrite());
        final boolean a = fileSystem.access(path, SqlJetFileAccesPermission.READWRITE);
        Assert.assertTrue("It should be able to write access to plain file", a);        
    }

    @Test
    public void testAccessReadwriteNew() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final boolean a = fileSystem.access(pathNew, SqlJetFileAccesPermission.READWRITE);
        Assert.assertFalse("It should be unable to write access file which doesnt exist", a);        
    }
    
    @Test
    public void testAccessReadwriteReadonly() throws Exception {
        Assert.assertNotNull(pathReadonly);
        Assert.assertFalse(pathReadonly.canWrite());
        final boolean a = fileSystem.access(pathReadonly, SqlJetFileAccesPermission.READWRITE);
        Assert.assertFalse("It should be unable to write access file which is readonly", a);        
    }
    
    // randomness()
    
    @Test(expected = SqlJetException.class)
    public void testRandomnessZero() throws Exception {
        final byte[] zero = fileSystem.randomness(0);
        Assert.fail("It should be not allowed to call get zero bytes count from randomness() function");
    }

    @Test(expected = SqlJetException.class)
    public void testRandomnessNegative() throws Exception {
        final byte[] negativ = fileSystem.randomness(-1);
        Assert.fail("It should be not allowed to call get negative bytes count from randomness() function");
    }

    @Test(expected = AssertionError.class)
    public void testRandomnessOne() throws Exception {
        final byte[] one1 = fileSystem.randomness(1);
        Assert.assertTrue( "Result size is wrong", 1==one1.length );
        final byte[] one2 = fileSystem.randomness(1);
        Assert.assertTrue( "Result size is wrong", 1==one2.length );
        Assert.assertArrayEquals(one1, one2);
        Assert.fail("The function randomness() should return at least different values on each call");
    }

    @Test(expected = AssertionError.class)
    public void testRandomnessTwo() throws Exception {
        final byte[] two1 = fileSystem.randomness(2);
        Assert.assertTrue( "Result size is wrong", 2==two1.length );
        final byte[] two2 = fileSystem.randomness(2);
        Assert.assertTrue( "Result size is wrong", 2==two1.length );
        Assert.assertArrayEquals(two1, two2);
        Assert.fail("The function randomness() should return at least different values on each call");
    }

    // sleep()
    
    @Test(expected = SqlJetException.class)
    public void testSleepZero() throws Exception {
        final int s = fileSystem.sleep(0);
        Assert.fail("Sleeping to zero time is impossible");
    }

    @Test(expected = SqlJetException.class)
    public void testSleepNegative() throws Exception {
        final int s = fileSystem.sleep(-1);
        Assert.fail("Sleeping to negative time is impossible");
    }
    
    @Test
    public void testSleepOne() throws Exception {
        final long t1 = System.currentTimeMillis();
        final int s = fileSystem.sleep(1);
        final long t2 = System.currentTimeMillis();
        Assert.assertTrue("sleep() should return sleeped time", 0<s);
        Assert.assertTrue("Sleeping shoulds take some time", 0<(t2-t1));
    }

    // currentTime()
    
    @Test
    public void testCurrentTime() throws Exception {
        final double t = fileSystem.currentTime();
        Assert.assertTrue("Current time should return some no empty value", .0!=t );
    }
    
}
