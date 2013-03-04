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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.ISqlJetFile;
import org.tmatesoft.sqljet.core.internal.SqlJetFileAccesPermission;
import org.tmatesoft.sqljet.core.internal.SqlJetFileType;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
@SuppressWarnings("unused")
@Ignore
public class SqlJetFileSystemMockTest extends SqlJetAbstractFileSystemMockTest {

    @Test
    public void testName(){
        final String name = fileSystem.getName();
        Assert.assertTrue("File system should have some unempty name",
                null!=name && !"".equals(name.trim()));
    }
    
    // open()
    
    @Test(expected = SqlJetException.class)
    public void testOpenFileNullPermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, null, null);
        f.close();
        Assert.fail("File shouldn't be opened without permissions");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFilePermNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(path, null, null);
        f.close();
        Assert.fail("File shouldn't be opened without permissions");
    }

    @Test(expected = SqlJetException.class)
    public void testOpenFileTypeNull() throws Exception {
        final ISqlJetFile f = fileSystem.open(path, null, PERM_TEMPORARY);
        f.close();
        Assert.fail("File shouldn't be opened without permissions");
    }
    
    @Test
    public void testOpenFileNullTemporary() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, SqlJetFileType.TEMP_DB, PERM_TEMPORARY);
        f.close();
        Assert.assertNotNull("File should be opened without path if permissions include values:"
                + " CREATE, READWRITE, DELETEONCLOSE", f);
    }

    @Test(expected = AssertionError.class )
    public void testOpenFileNullReadonly() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, SqlJetFileType.TEMP_DB, PERM_READONLY);
        f.close();
        Assert.fail("File shouldn't be opened without path if permission is READONLY");
    }

    @Test
    public void testOpenReadonly() throws Exception {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.exists());
        final ISqlJetFile f = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_READONLY);
        f.close();
        Assert.assertNotNull("File which exists should be opened with permission READONLY", f);
    }

    @Test(expected = SqlJetException.class)
    public void testOpenNewReadonly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_READONLY);
        f.close();
        Assert.fail("File which doesn't exists shouldn't be opened with permission READONLY");
    }
    
    @Test(expected = AssertionError.class)
    public void testOpenReadonlyAndWrite() throws Exception {
        Assert.assertNotNull(path);
        final ISqlJetFile f = fileSystem.open(path, SqlJetFileType.MAIN_DB, PERM_READONLY_AND_WRITE);
        f.close();
        Assert.fail("File shouldn't be opened with permissions READONLY and READWRITE");
    }

    @Test(expected = AssertionError.class)
    public void testOpenNullReadonlyAndWrite() throws Exception {
        final ISqlJetFile f = fileSystem.open(null, SqlJetFileType.TEMP_DB, PERM_READONLY_AND_WRITE);
        f.close();
        Assert.fail("File shouldn't be opened with permissions READONLY and READWRITE");
    }
    
    
    @Test(expected = AssertionError.class)
    public void testOpenCreateOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_CREATE_ONLY );
        f.close();
        Assert.fail("File shouldn't be opened with permission CREATE only");
    }

    @Test(expected = AssertionError.class)
    public void testOpenCreateReadonly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_CREATE_READONLY );
        f.close();
        Assert.fail("File shouldn't be opened with permissions CREATE and READONLY");
    }

    @Test
    public void testOpenCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_CREATE);
        f.close();
        Assert.assertNotNull("File should be created with permission CREATE and READWRITE", f);
    }

    @Test(expected = AssertionError.class)
    public void testOpenExclusiveOnly() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_EXCLUSIVE_ONLY );
        f.close();
        Assert.fail("File shouldn't be created with permission EXCLUSIVE only");
    }

    @Test
    public void testOpenExclusiveCreate() throws Exception {
        Assert.assertNotNull(pathNew);
        Assert.assertFalse(pathNew.exists());
        final ISqlJetFile f = fileSystem.open(pathNew, SqlJetFileType.MAIN_DB, PERM_EXCLUSIVE_CREATE);
        f.close();
        Assert.assertNotNull("File should be created with permission EXCLUSIVE, CREATE and READWRITE", f);
    }

    // delete()
    
    @Test(expected = AssertionError.class)
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

    // access()
    
    @Test(expected = AssertionError.class)
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
    
    @Test(expected = AssertionError.class)
    public void testRandomnessZero() throws Exception {
        final byte[] zero = fileSystem.randomness(0);
        Assert.fail("It should be not allowed to call get zero bytes count from randomness() function");
    }

    @Test(expected = AssertionError.class)
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
    
    @Test(expected = AssertionError.class)
    public void testSleepZero() throws Exception {
        final long s = fileSystem.sleep(0);
        Assert.fail("Sleeping to zero time is impossible");
    }

    @Test(expected = AssertionError.class)
    public void testSleepNegative() throws Exception {
        final long s = fileSystem.sleep(-1);
        Assert.fail("Sleeping to negative time is impossible");
    }
    
    @Test
    public void testSleepOne() throws Exception {
        final long t1 = System.currentTimeMillis();
        final long s = fileSystem.sleep(1);
        final long t2 = System.currentTimeMillis();
        Assert.assertTrue("sleep() should return sleeped time", 0<s);
        Assert.assertTrue("Sleeping shoulds take some time", 0<(t2-t1));
    }

    // currentTime()
    
    @Test
    public void testCurrentTime() throws Exception {
        final long t = fileSystem.currentTime();
        Assert.assertTrue("Current time should return some no empty value", .0!=t );
    }
    
}
