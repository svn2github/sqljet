/**
 * FSRepresentationCacheRecord.java
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
package org.tmatesoft.sqljet.repcache.fs;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class FSRepresentationCacheRecord {

    public static int HASH_FIELD = 0;
    public static int REVISION_FIELD = 1;
    public static int OFFSET_FIELD = 2;
    public static int SIZE_FIELD = 3;
    public static int EXPANDED_SIZE_FIELD = 4;

    private String myHash = "";
    private long myRevision = 0L;
    private long myOffset = 0L;
    private long mySize = 0L;
    private long myExpandedSize = 0L;

    public FSRepresentationCacheRecord(String hash, long revision, long offset, long size, long expandedSize) {
        myHash = hash;
        myRevision = revision;
        myOffset = offset;
        mySize = size;
        myExpandedSize = expandedSize;
    }

    FSRepresentationCacheRecord(ISqlJetCursor cursor) throws SqlJetException {
        final int fieldsCount = cursor.getFieldsCount();
        if (fieldsCount == 0) {
            return;
        }
        
        if (!cursor.isNull(HASH_FIELD)) {
            myHash = cursor.getString(HASH_FIELD);
        }
        
        if (fieldsCount == 1) {
            return;
        }
        
        if (!cursor.isNull(REVISION_FIELD)) {
            myRevision = cursor.getInteger(REVISION_FIELD);
        }
        
        if (fieldsCount == 2) {
            return;
        }
        
        if (!cursor.isNull(OFFSET_FIELD)) {
            myOffset = cursor.getInteger(OFFSET_FIELD);
        }
        
        if (fieldsCount == 3) {
            return;
        }
        
        if (!cursor.isNull(SIZE_FIELD)) {
            mySize = cursor.getInteger(SIZE_FIELD);
        }
        
        if (fieldsCount == 4) {
            return;
        }
        
        if (!cursor.isNull(EXPANDED_SIZE_FIELD)) {
            myExpandedSize = cursor.getInteger(EXPANDED_SIZE_FIELD);
        }
    }

    public String toString() {
        final StringBuffer b = new StringBuffer();
        b.append("rep_cache( ");
        b.append("hash: ").append(myHash);
        b.append(", revision: ").append(myRevision);
        b.append(", offset: ").append(myOffset);
        b.append(", size: ").append(mySize);
        b.append(", expanded_size: ").append(myExpandedSize);
        b.append(" )");
        return b.toString();
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return myHash;
    }

    /**
     * @param hash
     *            the hash to set
     */
    public void setHash(String hash) {
        myHash = hash;
    }

    /**
     * @return the revision
     */
    public long getRevision() {
        return myRevision;
    }

    /**
     * @param revision
     *            the revision to set
     */
    public void setRevision(long revision) {
        myRevision = revision;
    }

    /**
     * @return the offset
     */
    public long getOffset() {
        return myOffset;
    }

    /**
     * @param offset
     *            the offset to set
     */
    public void setOffset(long offset) {
        myOffset = offset;
    }

    /**
     * @return the size
     */
    public long getSize() {
        return mySize;
    }

    /**
     * @param size
     *            the size to set
     */
    public void setSize(long size) {
        mySize = size;
    }

    /**
     * @return the expanded_size
     */
    public long getExpandedSize() {
        return myExpandedSize;
    }

    /**
     * @param expanded_size
     *            the expanded_size to set
     */
    public void setExpandedSize(long expandedSize) {
        myExpandedSize = expandedSize;
    }

    
}
