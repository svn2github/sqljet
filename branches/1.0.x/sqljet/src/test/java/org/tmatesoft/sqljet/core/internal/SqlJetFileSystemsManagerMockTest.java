/**
 * SqlJetFileSystemsManagerTest.java
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
import org.tmatesoft.sqljet.core.internal.ISqlJetFileSystem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
@Ignore
public class SqlJetFileSystemsManagerMockTest extends SqlJetAbstractFileSystemMockTest {

    @Test
    public void testFindDefault() throws SqlJetException{
        fileSystemsManager.register(fileSystem, true);
        final ISqlJetFileSystem fs = fileSystemsManager.find(null);
        Assert.assertSame(fileSystem, fs);
    }

    @Test
    public void testFindByName() throws SqlJetException{
        fileSystemsManager.register(fileSystem, false);
        final ISqlJetFileSystem fs = fileSystemsManager.find(fileSystem.getName());
        Assert.assertSame(fileSystem, fs);
    }

    @Test
    public void testUnregister() throws SqlJetException{
        fileSystemsManager.register(fileSystem, false);
        Assert.assertNotNull(fileSystemsManager.find(fileSystem.getName()));
        fileSystemsManager.unregister(fileSystem);
        final ISqlJetFileSystem fs = fileSystemsManager.find(fileSystem.getName());
        Assert.assertNull(fs);
    }
    
}
