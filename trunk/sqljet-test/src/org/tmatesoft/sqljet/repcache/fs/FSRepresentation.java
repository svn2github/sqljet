/**
 * FSRepresentation.java
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
package org.tmatesoft.sqljet.repcache.fs;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class FSRepresentation {
    public static final String REP_DELTA = "DELTA";
    public static final String REP_PLAIN = "PLAIN";
    public static final String REP_TRAILER = "ENDREP";

    private long myRevision;
    private long myOffset;
    private long mySize;
    private long myExpandedSize;
    private String myMD5HexDigest;
    private String mySHA1HexDigest;
    private String myTxnId;
    private String myUniquifier;
    
    public FSRepresentation(FSRepresentation representation) {
        myRevision = representation.myRevision;
        myOffset = representation.myOffset;
        mySize = representation.mySize;
        myExpandedSize = representation.myExpandedSize;
        myMD5HexDigest = representation.myMD5HexDigest;
        mySHA1HexDigest = representation.mySHA1HexDigest;
        myUniquifier = representation.myUniquifier;
        myTxnId = representation.myTxnId;
    }

    public FSRepresentation() {
        myRevision = -1;
        myOffset = -1;
        mySize = -1;
        myExpandedSize = -1;
    }

    public void setRevision(long rev) {
        myRevision = rev;
    }

    public void setOffset(long offset) {
        myOffset = offset;
    }

    public void setSize(long size) {
        mySize = size;
    }

    public void setExpandedSize(long expandedSize) {
        myExpandedSize = expandedSize;
    }

    public void setMD5HexDigest(String hexDigest) {
        myMD5HexDigest = hexDigest;
    }

    public String getSHA1HexDigest() {
        return mySHA1HexDigest;
    }
    
    public void setSHA1HexDigest(String hexDigest) {
        mySHA1HexDigest = hexDigest;
    }

    public String getUniquifier() {
        return myUniquifier;
    }

    
    public void setUniquifier(String uniquifier) {
        myUniquifier = uniquifier;
    }

    public long getRevision() {
        return myRevision;
    }

    public long getOffset() {
        return myOffset;
    }

    public long getSize() {
        return mySize;
    }

    public long getExpandedSize() {
        return myExpandedSize;
    }

    public String getMD5HexDigest() {
        return myMD5HexDigest;
    }

    public static boolean compareRepresentations(FSRepresentation r1, FSRepresentation r2) {
        if (r1 == r2) {
            return true;
        } else if (r1 == null) {
            return false;
        }
        return r1.equals(r2);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != FSRepresentation.class) {
            return false;
        }
        FSRepresentation rep = (FSRepresentation) obj;
        if (myRevision != rep.myRevision) {
            return false;
        }
        if (myOffset != rep.myOffset) {
            return false;
        }
        if (myUniquifier == null && rep.myUniquifier != null) {
            return false;
        } else if (myUniquifier != null) {
            return myUniquifier.equals(rep.myUniquifier);
        }
        return true;
    }

    public String getStringRepresentation(int dbFormat) {
        if ( mySHA1HexDigest == null || myUniquifier == null) {
            return myRevision + " " + myOffset + " " + mySize + " " + myExpandedSize + " " + myMD5HexDigest;
        }
        return myRevision + " " + myOffset + " " + mySize + " " + myExpandedSize + " " + myMD5HexDigest + " " + 
               mySHA1HexDigest + " " + myUniquifier;
    }
    
    public String getTxnId() {
        return myTxnId;
    }

    public void setTxnId(String txnId) {
        myTxnId = txnId;
    }

    public boolean isTxn() {
        return myTxnId != null;
    }

}
