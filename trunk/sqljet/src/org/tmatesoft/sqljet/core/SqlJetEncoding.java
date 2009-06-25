/**
 * SqlJetEncoding.java
 * Copyright (C) 2009 TMate Software Ltd
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
 * contact TMate Software at support@svnkit.com
 */
package org.tmatesoft.sqljet.core;

/**
 * These constant define integer codes that represent the various text encodings
 * supported by SQLite.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public enum SqlJetEncoding {

    UTF8("UTF-8"), // 1
    UTF16LE("UTF-16LE"), // 2
    UTF16BE("UTF-16BE"), // 3

    /** Use native byte order */
    UTF16("UTF-16"), // 4

    /** sqlite3_create_function only */
    ANY, // 5

    /** sqlite3_create_collation only */
    UTF16_ALIGNED; // 8

    private String charsetName = "error";

    private SqlJetEncoding() {
    }

    private SqlJetEncoding(String charsetName) {
        this.charsetName = charsetName;
    }

    /**
     * @return the charsetName
     */
    public String getCharsetName() {
        return charsetName;
    }

    public static SqlJetEncoding decode(String s) {
        s = s.toUpperCase();
        if ("UTF-8".equals(s)) {
            return UTF8;
        } else if ("UTF-16".equals(s)) {
            return UTF16;
        } else if ("UTF-16LE".equals(s)) {
            return UTF16LE;
        } else if ("UTF-16BE".equals(s)) {
            return UTF16BE;
        }
        return null;
    }
}
