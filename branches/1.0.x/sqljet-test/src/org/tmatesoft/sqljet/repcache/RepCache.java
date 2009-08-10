/**
 * RepCache.java
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
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.repcache;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCache {
    
    public static int HASH_FIELD = 0;
    public static int REVISION_FIELD = 1;
    public static int OFFSET_FIELD = 2;
    public static int SIZE_FIELD = 3;
    public static int EXPANDED_SIZE_FIELD = 4;

    private String hash = "";
    private Long revision = 0L;
    private Long offset = 0L;
    private Long size = 0L;
    private Long expanded_size = 0L;

    public RepCache() {
    }

    public RepCache(String hash, Long revision, Long offset, Long size, Long expanded_size) {
        this.hash = hash;
        this.revision = revision;
        this.offset = offset;
        this.size = size;
        this.expanded_size = expanded_size;
    }

    RepCache(ISqlJetCursor cursor) throws SqlJetException {
        final int fieldsCount = cursor.getFieldsCount();
        if(fieldsCount==0) return;
        if(!cursor.isNull(HASH_FIELD))
        this.hash = cursor.getString(HASH_FIELD);
        if(fieldsCount==1) return;
        if(!cursor.isNull(REVISION_FIELD))
        this.revision = cursor.getInteger(REVISION_FIELD);
        if(fieldsCount==2) return;
        if(!cursor.isNull(OFFSET_FIELD))
        this.offset = cursor.getInteger(OFFSET_FIELD);
        if(fieldsCount==3) return;
        if(!cursor.isNull(SIZE_FIELD))
        this.size = cursor.getInteger(SIZE_FIELD);
        if(fieldsCount==4) return;
        if(!cursor.isNull(EXPANDED_SIZE_FIELD))
        this.expanded_size = cursor.getInteger(EXPANDED_SIZE_FIELD);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder b = new StringBuilder();
        b.append("rep_cache( ");
        b.append("hash: ").append(hash);
        b.append(", revision: ").append(revision);
        b.append(", offset: ").append(offset);
        b.append(", size: ").append(size);
        b.append(", expanded_size: ").append(expanded_size);
        b.append(" )");
        return b.toString();
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash
     *            the hash to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return the revision
     */
    public Long getRevision() {
        return revision;
    }

    /**
     * @param revision
     *            the revision to set
     */
    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * @return the offset
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * @param offset
     *            the offset to set
     */
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
     * @return the size
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size
     *            the size to set
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return the expanded_size
     */
    public Long getExpandedSize() {
        return expanded_size;
    }

    /**
     * @param expanded_size
     *            the expanded_size to set
     */
    public void setExpanded_size(Long expanded_size) {
        this.expanded_size = expanded_size;
    }

}
