/**
 * SqlJetPragmasTest.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.lang;

import junit.framework.TestCase;

import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.internal.table.SqlJetPragmasHandler;
import org.tmatesoft.sqljet.core.table.ISqlJetOptions;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 * 
 */
public class SqlJetPragmasTest extends TestCase {

    private TestOptions options;
    private SqlJetPragmasHandler handler;

    public SqlJetPragmasTest() {
        super("Pragmas Test");
    }

    @Override
    protected void setUp() throws Exception {
        options = new TestOptions();
        handler = new SqlJetPragmasHandler(options);
    }

    @Override
    protected void tearDown() throws Exception {
        options = null;
        handler = null;
    }

    public void testAutovacuum() throws SqlJetException {
        assertFalse(options.isAutovacuum());
        assertFalse(options.isIncrementalVacuum());

        handler.pragma("pragma auto_vacuum=1;");
        assertTrue(options.isAutovacuum());
        assertFalse(options.isIncrementalVacuum());

        Object result = handler.pragma("pragma auto_vacuum;");
        assertTrue(result instanceof Integer);
        assertEquals(1, ((Integer) result).intValue());

        handler.pragma("pragma auto_vacuum = 2;");
        assertFalse(options.isAutovacuum());
        assertTrue(options.isIncrementalVacuum());

        result = handler.pragma("pragma auto_vacuum;");
        assertTrue(result instanceof Integer);
        assertEquals(2, ((Integer) result).intValue());

        handler.pragma("pragma auto_vacuum(0);");
        assertFalse(options.isAutovacuum());
        assertFalse(options.isIncrementalVacuum());

        result = handler.pragma("pragma auto_vacuum;");
        assertTrue(result instanceof Integer);
        assertEquals(0, ((Integer) result).intValue());

        handler.pragma("pragma auto_vacuum=full;");
        assertTrue(options.isAutovacuum());
        assertFalse(options.isIncrementalVacuum());

        handler.pragma("PRAGMA auto_vacuum = INCREMENTAL;");
        assertFalse(options.isAutovacuum());
        assertTrue(options.isIncrementalVacuum());

        handler.pragma("pragma auto_vacuum(NONE);");
        assertFalse(options.isAutovacuum());
        assertFalse(options.isIncrementalVacuum());

        boolean ex = false;
        try {
            handler.pragma("pragma auto_vacuum = 3;");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);

        result = handler.pragma("pragma auto_vacuum;");
        assertTrue(result instanceof Integer);
        assertEquals(0, ((Integer) result).intValue());
    }

    public void testCacheSize() throws SqlJetException {
        assertEquals(0, options.getCacheSize());

        handler.pragma("pragma cache_size = 100;");
        assertEquals(100, options.getCacheSize());

        Object result = handler.pragma("pragma cache_size;");
        assertTrue(result instanceof Integer);
        assertEquals(100, ((Integer) result).intValue());

        boolean ex = false;
        try {
            handler.pragma("pragma cache_size = alpha;");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    public void testEncoding() throws SqlJetException {
        assertEquals(null, options.getEncoding());

        handler.pragma("pragma encoding('UTF-8');");
        assertEquals(SqlJetEncoding.UTF8, options.getEncoding());
        assertEquals(SqlJetEncoding.UTF8, handler.pragma("pragma encoding;"));

        handler.pragma("pragma encoding(\"UTF-16\");");
        assertEquals(SqlJetEncoding.UTF16, options.getEncoding());
        assertEquals(SqlJetEncoding.UTF16, handler.pragma("pragma encoding;"));

        handler.pragma("pragma encoding='UTF-16le';");
        assertEquals(SqlJetEncoding.UTF16LE, options.getEncoding());
        assertEquals(SqlJetEncoding.UTF16LE, handler.pragma("pragma encoding;"));

        handler.pragma("pragma encoding = 'UTF-16be';");
        assertEquals(SqlJetEncoding.UTF16BE, options.getEncoding());
        assertEquals(SqlJetEncoding.UTF16BE, handler.pragma("pragma encoding;"));

        boolean ex = false;
        try {
            handler.pragma("pragma encoding('UTF-4');");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    public void testLegacyFileFormat() throws SqlJetException {
        assertEquals(false, options.isLegacyFileFormat());

        handler.pragma("pragma legacy_file_format = true;");
        assertEquals(true, options.isLegacyFileFormat());

        Object result = handler.pragma("pragma legacy_file_format;");
        assertTrue(result instanceof Boolean);
        assertEquals(true, ((Boolean) result).booleanValue());

        boolean ex = false;
        try {
            handler.pragma("pragma legacy_file_format = new;");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    public void testSchemaVersion() throws SqlJetException {
        assertEquals(0, options.getSchemaVersion());

        handler.pragma("pragma schema_version = 3;");
        assertEquals(3, options.getSchemaVersion());

        Object result = handler.pragma("pragma schema_version;");
        assertTrue(result instanceof Integer);
        assertEquals(3, ((Integer) result).intValue());

        boolean ex = false;
        try {
            handler.pragma("pragma schema_version = beta;");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    public void testUserVersion() throws SqlJetException {
        assertEquals(0, options.getUserVersion());

        handler.pragma("pragma user_version = 3;");
        assertEquals(3, options.getUserVersion());

        Object result = handler.pragma("pragma user_version;");
        assertTrue(result instanceof Integer);
        assertEquals(3, ((Integer) result).intValue());

        boolean ex = false;
        try {
            handler.pragma("pragma user_version = gamma;");
        } catch (SqlJetException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    private static class TestOptions implements ISqlJetOptions {

        private int fileFormat;
        private boolean autovacuum, ivacuum;
        private SqlJetEncoding encoding;
        private boolean legacy;
        private int cacheSize;
        private int schemaVersion, userVersion;

        public int getFileFormat() {
            return fileFormat;
        }

        public void setFileFormat(int fileFormat) throws SqlJetException {
            this.fileFormat = fileFormat;
        }

        public boolean isAutovacuum() {
            return autovacuum;
        }

        public void setAutovacuum(boolean autovacuum) throws SqlJetException {
            this.autovacuum = autovacuum;
        }

        public boolean isIncrementalVacuum() {
            return ivacuum;
        }

        public void setIncrementalVacuum(boolean incrementalVacuum) throws SqlJetException {
            this.ivacuum = incrementalVacuum;
        }

        public int getCacheSize() {
            return cacheSize;
        }

        public void setCacheSize(int pageCacheSize) throws SqlJetException {
            this.cacheSize = pageCacheSize;
        }

        public SqlJetEncoding getEncoding() {
            return encoding;
        }

        public void setEncoding(SqlJetEncoding encoding) throws SqlJetException {
            this.encoding = encoding;
        }

        public boolean isLegacyFileFormat() throws SqlJetException {
            return legacy;
        }

        public void setLegacyFileFormat(boolean flag) throws SqlJetException {
            this.legacy = flag;
        }

        public int getSchemaVersion() {
            return schemaVersion;
        }

        public void setSchemaVersion(int version) {
            this.schemaVersion = version;
        }

        public void changeSchemaVersion() throws SqlJetException {
            schemaVersion++;
        }

        public boolean verifySchemaVersion(boolean throwIfStale) throws SqlJetException {
            return false;
        }

        public int getUserVersion() {
            return userVersion;
        }

        public void setUserVersion(int userCookie) throws SqlJetException {
            this.userVersion = userCookie;
        }
    }
}
