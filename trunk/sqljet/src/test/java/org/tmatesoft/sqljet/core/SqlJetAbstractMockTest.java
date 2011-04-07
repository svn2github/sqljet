/**
 * SqlJetMockTest.java
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
package org.tmatesoft.sqljet.core;


import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Before;

/**
 * Mock tests abstract base class.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public abstract class SqlJetAbstractMockTest {
    
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
     * Set up instances of tested classes. It can be mock or true implementation. 
     * 
     * @throws Exception
     */
    protected void setUpInstances() throws Exception {
        
    }

    /**
     * Set up external environment for testing. For example creates files.
     * 
     * @throws Exception
     */
    protected void setUpEnvironment() throws Exception {
        
    }

    /**
     * Clean up external environment. For example deletes temporary files.
     * 
     * @throws Exception 
     */
    protected void cleanUpEnvironment() throws Exception {
        
    }

    /**
     * Set up instances of tested classes.
     * 
     * @throws Exception
     */
    protected void cleanUpInstances() throws Exception {
        
    }

    protected <T> Future<T> execThread(final Callable<T> thread) {
        return Executors.newCachedThreadPool().submit(thread);
    }

}
