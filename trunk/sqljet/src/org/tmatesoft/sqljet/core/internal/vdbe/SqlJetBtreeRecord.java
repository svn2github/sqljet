/**
 * SqlJetRawTable.java
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
package org.tmatesoft.sqljet.core.internal.vdbe;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetLimits;
import org.tmatesoft.sqljet.core.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetErrorCode;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * Implements {@link ISqlJetBtreeRecord}.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetBtreeRecord implements ISqlJetBtreeRecord {

    private ISqlJetBtreeCursor cursor;
    private boolean isIndex;

    private int fieldsCount = 0;
    private List<Integer> aType = new ArrayList<Integer>();
    private List<Integer> aOffset = new ArrayList<Integer>();
    private List<ISqlJetVdbeMem> fields = new ArrayList<ISqlJetVdbeMem>();

    private int file_format = 4;

    /**
     * @return the fields
     */
    public List<ISqlJetVdbeMem> getFields() {
        return Collections.unmodifiableList(fields);
    }

    /**
     * 
     * 
     * @throws SqlJetException
     * 
     */
    public SqlJetBtreeRecord(ISqlJetBtreeCursor cursor, boolean isIndex) throws SqlJetException {
        this.cursor = cursor;
        this.isIndex = isIndex;
        read();
    }

    public SqlJetBtreeRecord(List<ISqlJetVdbeMem> values) {
        fields.addAll(values);
        fieldsCount = values.size();
    }
    
    /**
     * 
     */
    public SqlJetBtreeRecord(ISqlJetVdbeMem[] values, int file_format) {
        this.file_format = file_format;
        initFields(values);
    }

    public SqlJetBtreeRecord(ISqlJetVdbeMem... values) {
        initFields(values);
    }

    /**
     * @param values
     */
    private void initFields(ISqlJetVdbeMem[] values) {
        fields.addAll(Arrays.asList(values));
        fieldsCount = values.length;
    }
    
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.tmatesoft.sqljet.core.internal.vdbe.ISqlJetRecord#getFieldsCount()
     */
    public int getFieldsCount() {
        return fieldsCount;
    }

    /**
     * Read and parse the table header. Store the results of the parse into the
     * record header cache fields of the cursor.
     * 
     * @throws SqlJetException
     */
    private void read() throws SqlJetException {

        long payloadSize; /* Number of bytes in the record */

        cursor.enterCursor();
        try {
            /*
             * This block sets the variable payloadSize to be the total number
             * of* bytes in the record.
             */
            if (isIndex) {
                payloadSize = cursor.getKeySize();
            } else {
                payloadSize = cursor.getDataSize();
            }
            /* If payloadSize is 0, then just store a NULL */
            if (payloadSize == 0) {
                return;
            }

            int i; /* Loop counter */
            ByteBuffer zData; /* Part of the record being decoded */
            /* For storing the record being decoded */
            SqlJetVdbeMem sMem = new SqlJetVdbeMem();

            ByteBuffer zIdx; /* Index into header */
            ByteBuffer zEndHdr; /* Pointer to first byte after the header */
            int[] offset = { 0 }; /* Offset into the data */
            int szHdrSz; /* Size of the header size field at start of record */
            int[] avail = { 0 }; /* Number of bytes of available data */

            assert (aType != null);
            assert (aOffset != null);

            /* Figure out how many bytes are in the header */
            if (isIndex) {
                zData = cursor.keyFetch(avail);
            } else {
                zData = cursor.dataFetch(avail);
            }
            /*
             * The following assert is true in all cases accept when* the
             * database file has been corrupted externally.* assert( zRec!=0 ||
             * avail>=payloadSize || avail>=9 );
             */
            szHdrSz = SqlJetUtility.getVarint32(zData, offset);

            /*
             * The KeyFetch() or DataFetch() above are fast and will get the
             * entire* record header in most cases. But they will fail to get
             * the complete* record header if the record header does not fit on
             * a single page* in the B-Tree. When that happens, use
             * sqlite3VdbeMemFromBtree() to* acquire the complete header text.
             */
            if (avail[0] < offset[0]) {
                sMem.fromBtree(cursor, 0, offset[0], isIndex);
                zData = sMem.z;
            }
            zEndHdr = SqlJetUtility.slice(zData, offset[0]);
            zIdx = SqlJetUtility.slice(zData, szHdrSz);

            /*
             * Scan the header and use it to fill in the aType[] and aOffset[]*
             * arrays. aType[i] will contain the type integer for the i-th*
             * column and aOffset[i] will contain the offset from the beginning*
             * of the record to the start of the data for the i-th column
             */
            fieldsCount = 0;
            for (i = 0; i < ISqlJetLimits.SQLJET_MAX_COLUMN && zIdx.arrayOffset() < zEndHdr.arrayOffset()
                    && offset[0] < payloadSize; i++, fieldsCount++) {
                aOffset.add(i, offset[0]);
                int[] a = { 0 };
                zIdx = SqlJetUtility.slice(zIdx, SqlJetUtility.getVarint32(zIdx, a));
                aType.add(i, a[0]);
                offset[0] += SqlJetVdbeSerialType.serialTypeLen(a[0]);

                fields.add(i, getField(i));

            }
            sMem.release();
            sMem.flags = EnumSet.of(SqlJetVdbeMemFlags.Null);

            /*
             * If we have read more header data than was contained in the
             * header,* or if the end of the last field appears to be past the
             * end of the* record, or if the end of the last field appears to be
             * before the end* of the record (when all fields present), then we
             * must be dealing* with a corrupt database.
             */
            if (zIdx.arrayOffset() > zEndHdr.arrayOffset() || offset[0] > payloadSize
                    || (zIdx.arrayOffset() == zEndHdr.arrayOffset() && offset[0] != payloadSize)) {
                throw new SqlJetException(SqlJetErrorCode.CORRUPT);
            }

        } finally {
            cursor.leaveCursor();
        }
    }

    /**
     * Opcode: Column P1 P2 P3 P4 *
     * 
     * Interpret the data that cursor P1 points to as a structure built using
     * the MakeRecord instruction. (See the MakeRecord opcode for additional
     * information about the format of the data.) Extract the P2-th column from
     * this record. If there are less that (P2+1) values in the record, extract
     * a NULL.
     * 
     * The value extracted is stored in register P3.
     * 
     * If the column contains fewer than P2 fields, then extract a NULL. Or, if
     * the P4 argument is a P4_MEM use the value of the P4 argument as the
     * result.
     * 
     * @param pCrsr
     *            The BTree cursor
     * @param fieldNum
     *            column number to retrieve
     * @param isIndex
     *            True if an index containing keys only - no data
     * @param aType
     *            Type values for all entries in the record
     * @param aOffset
     *            Cached offsets to the start of each columns data
     * @param pDest
     * @throws SqlJetException
     */
    private ISqlJetVdbeMem getField(int column) throws SqlJetException {

        long payloadSize; /* Number of bytes in the record */
        int len; /* The length of the serialized data for the column */
        ByteBuffer zData; /* Part of the record being decoded */
        /* For storing the record being decoded */
        SqlJetVdbeMem sMem = new SqlJetVdbeMem();
        SqlJetVdbeMem pDest = new SqlJetVdbeMem();
        pDest.flags = EnumSet.of(SqlJetVdbeMemFlags.Null);

        cursor.enterCursor();
        try {
            /*
             * This block sets the variable payloadSize to be the total number
             * of* bytes in the record.
             */
            if (isIndex) {
                payloadSize = cursor.getKeySize();
            } else {
                payloadSize = cursor.getDataSize();
            }

            /* If payloadSize is 0, then just store a NULL */
            if (payloadSize == 0) {
                return pDest;
            }

            /*
             * Get the column information. If aOffset[p2] is non-zero, then*
             * deserialize the value from the record. If aOffset[p2] is zero,*
             * then there are not enough fields in the record to satisfy the*
             * request. In this case, set the value NULL or to P4 if P4 is* a
             * pointer to a Mem object.
             */
            final Integer aOffsetColumn = aOffset.get(column);
            final Integer aTypeColumn = aType.get(column);
            if (aOffsetColumn != null && aTypeColumn != null && aOffsetColumn != 0) {
                len = SqlJetVdbeSerialType.serialTypeLen(aTypeColumn);
                sMem.fromBtree(cursor, aOffset.get(column), len, isIndex);
                zData = sMem.z;
                SqlJetVdbeSerialType.serialGet(zData, aTypeColumn, pDest);
                pDest.enc = cursor.getCursorDb().getEnc();
            }

        } finally {
            cursor.leaveCursor();
        }

        /*
         * If we dynamically allocated space to hold the data (in the*
         * sqlite3VdbeMemFromBtree() call above) then transfer control of that*
         * dynamically allocated space over to the pDest structure.* This
         * prevents a memory copy.
         */
        if (sMem.zMalloc != null) {
            assert (sMem.z == sMem.zMalloc);
            assert (!pDest.flags.contains(SqlJetVdbeMemFlags.Dyn));
            assert (!(pDest.flags.contains(SqlJetVdbeMemFlags.Blob) || pDest.flags.contains(SqlJetVdbeMemFlags.Str)) || pDest.z == sMem.z);
            pDest.flags.remove(SqlJetVdbeMemFlags.Ephem);
            pDest.flags.remove(SqlJetVdbeMemFlags.Static);
            pDest.flags.add(SqlJetVdbeMemFlags.Term);
            pDest.z = sMem.z;
            pDest.zMalloc = sMem.zMalloc;
        }

        pDest.makeWriteable();

        return pDest;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetRecord#getStringField(int)
     */
    public String getStringField(int field, SqlJetEncoding enc) throws SqlJetException {
        final ISqlJetVdbeMem f = fields.get(field);
        if (null == f)
            return null;
        final ByteBuffer v = f.valueText(enc);
        if (null == v)
            return null;
        return SqlJetUtility.toString(v);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tmatesoft.sqljet.core.ISqlJetRecord#getIntField(int)
     */
    public long getIntField(int field) {
        final ISqlJetVdbeMem f = fields.get(field);
        if (null == f)
            return 0;
        return f.intValue();
    }

    /* (non-Javadoc)
     * @see org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord#getRealField(int)
     */
    public double getRealField(int field) {
        final ISqlJetVdbeMem f = fields.get(field);
        if (null == f)
            return 0;
        return f.realValue();
    }
    
    /**
     * Assuming the record contains N fields, the record format looks like this:
     * 
     * <table border="1">
     * <tr>
     * <td>hdr-size</td>
     * <td>type 0</td>
     * <td>type 1</td>
     * <td>...</td>
     * <td>type N-1</td>
     * <td>data0</td>
     * <td>...</td>
     * <td>data N-1</td>
     * </tr>
     * </table>
     * 
     * Each type field is a varint representing the serial type of the
     * corresponding data element (see sqlite3VdbeSerialType()). The hdr-size
     * field is also a varint which is the offset from the beginning of the
     * record to data0.
     */
    public ByteBuffer getRawRecord() {

        ByteBuffer zNewRecord; /* A buffer to hold the data for the new record */
        int nData = 0; /* Number of bytes of data space */
        int nHdr = 0; /* Number of bytes of header space */
        int nByte = 0; /* Data space required for this record */
        int nZero = 0; /* Number of zero bytes at the end of the record */
        int nVarint; /* Number of bytes in a varint */
        int serial_type; /* Type field */
        int i; /* Space used in zNewRecord[] */

        /*
         * Loop through the elements that will make up the record to figure* out
         * how much space is required for the new record.
         */
        for (ISqlJetVdbeMem value : fields) {
            SqlJetVdbeMem pRec = (SqlJetVdbeMem) value;

            int len;
            if (pRec.flags.contains(SqlJetVdbeMemFlags.Zero) && pRec.n > 0) {
                pRec.expandBlob();
            }
            serial_type = SqlJetVdbeSerialType.serialType(pRec, file_format);
            len = SqlJetVdbeSerialType.serialTypeLen(serial_type);
            nData += len;
            nHdr += SqlJetUtility.varintLen(serial_type);
            if (pRec.flags.contains(SqlJetVdbeMemFlags.Zero)) {
                /*
                 * Only pure zero-filled BLOBs can be input to this Opcode.* We
                 * do not allow blobs with a prefix and a zero-filled tail.
                 */
                nZero += pRec.nZero;
            } else if (len != 0) {
                nZero = 0;
            }
        }

        /* Add the initial header varint and total the size */
        nHdr += nVarint = SqlJetUtility.varintLen(nHdr);
        if (nVarint < SqlJetUtility.varintLen(nHdr)) {
            nHdr++;
        }
        nByte = nHdr + nData - nZero;

        /*
         * Make sure the output register has a buffer large enough to store* the
         * new record. The output register (pOp->p3) is not allowed to* be one
         * of the input registers (because the following call to*
         * sqlite3VdbeMemGrow() could clobber the value before it is used).
         */
        zNewRecord = ByteBuffer.allocate(nByte);

        /* Write the record */
        i = SqlJetUtility.putVarint32(zNewRecord, nHdr);
        for (ISqlJetVdbeMem value : fields) {
            SqlJetVdbeMem pRec = (SqlJetVdbeMem) value;
            serial_type = SqlJetVdbeSerialType.serialType(pRec, file_format);
            /* serial type */
            i += SqlJetUtility.putVarint32(SqlJetUtility.slice(zNewRecord, i), serial_type);
        }
        for (ISqlJetVdbeMem value : fields) {
            SqlJetVdbeMem pRec = (SqlJetVdbeMem) value;
            /* serial data */
            i += SqlJetVdbeSerialType.serialPut(SqlJetUtility.slice(zNewRecord, i), (int) (nByte - i), pRec,
                    file_format);
        }
        assert (i == nByte);

        return zNewRecord;
    }
}
