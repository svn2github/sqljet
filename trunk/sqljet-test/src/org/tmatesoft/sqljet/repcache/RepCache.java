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
package org.tmatesoft.sqljet.repcache;

import java.util.List;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValue;
import org.tmatesoft.sqljet.core.table.SqlJetRecord;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class RepCache {

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

    RepCache(SqlJetRecord record) throws SqlJetException {
        final List<SqlJetValue> values = record.getValues();
        if(values.size()==0) return;
        final SqlJetValue hash = values.get(0);
        if (null != hash)
            this.hash = hash.getString();
        if(values.size()==1) return;
        final SqlJetValue revision = values.get(1);
        if (null != revision)
            this.revision = revision.getInteger();
        if(values.size()==2) return;
        final SqlJetValue offset = values.get(2);
        if (null != offset)
            this.offset = offset.getInteger();
        if(values.size()==3) return;
        final SqlJetValue size = values.get(3);
        if (null != size)
            this.size = size.getInteger();
        if(values.size()==4) return;
        final SqlJetValue expanded_size = values.get(4);
        if (null != expanded_size)
            this.expanded_size = expanded_size.getInteger();
    }

    SqlJetRecord getRecord() throws SqlJetException {
        return new SqlJetRecord(new SqlJetValue(hash), new SqlJetValue(revision), new SqlJetValue(offset),
                new SqlJetValue(size), new SqlJetValue(expanded_size));
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
