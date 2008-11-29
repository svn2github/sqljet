/**
 * SqlJetAbstractFileSystemMockTest.java
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

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public abstract class SqlJetAbstractFileSystemMockTest extends SqlJetAbstractMockTest {

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
    public static final EnumSet<SqlJetFileOpenPermission> PERM_TEMPORARY = EnumSet.of(SqlJetFileOpenPermission.CREATE,
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
        
        if(null!=fileSystem) return;
    
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

}