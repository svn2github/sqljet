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
 */
package org.tmatesoft.sqljet.api.repcache;

import java.util.List;

import org.tmatesoft.sqljet.api.SqlJetApiRecord;
import org.tmatesoft.sqljet.api.SqlJetApiValue;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCache {

    private String hash;
    private Long revision;
    private Long offset;
    private Long size;
    private Long expanded_size;

    public RepCache() {
    }

    public RepCache(String hash, Long revision, Long offset, Long size, Long expanded_size) {
        this.hash = hash;
        this.revision = revision;
        this.offset = offset;
        this.size = size;
        this.expanded_size = expanded_size;
    }
    
    RepCache(SqlJetApiRecord record) throws SqlJetException {
        final List<SqlJetApiValue> values = record.getValues();
        this.hash = values.get(0).getString();
        this.revision = values.get(1).getInteger();
        this.offset = values.get(2).getInteger();
        this.size = values.get(3).getInteger();
        this.expanded_size = values.get(4).getInteger();
    }

    SqlJetApiRecord getRecord() throws SqlJetException {
        return new SqlJetApiRecord(
                new SqlJetApiValue(hash),
                new SqlJetApiValue(revision),
                new SqlJetApiValue(offset),
                new SqlJetApiValue(size),
                new SqlJetApiValue(expanded_size)
        );
    }
    
    /* (non-Javadoc)
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
     * @param hash the hash to set
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
     * @param revision the revision to set
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
     * @param offset the offset to set
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
     * @param size the size to set
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return the expanded_size
     */
    public Long getExpanded_size() {
        return expanded_size;
    }

    /**
     * @param expanded_size the expanded_size to set
     */
    public void setExpanded_size(Long expanded_size) {
        this.expanded_size = expanded_size;
    }

}
