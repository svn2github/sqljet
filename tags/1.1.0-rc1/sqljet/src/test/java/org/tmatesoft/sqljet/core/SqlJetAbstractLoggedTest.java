/**
 * SqlJetAbstractLoggedTest.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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

import java.util.logging.Level;
import java.util.logging.Logger;

import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
abstract public class SqlJetAbstractLoggedTest {

    public static final String SQLJET_TEST_LOGGER = "SQLJET_TEST";
    public static final boolean SQLJET_TESTS_LOGGING = SqlJetUtility.getBoolSysProp("SQLJET_TESTS_LOGGING", true);
    protected static Logger logger = Logger.getLogger(SQLJET_TEST_LOGGER);
    static {
        logger.setLevel(SQLJET_TESTS_LOGGING ? Level.ALL : Level.OFF);
    }
    
    
}
