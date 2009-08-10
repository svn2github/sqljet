/**
 * ISqlJetCursor.java
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
package org.tmatesoft.sqljet.core.table;

import java.io.InputStream;
import java.util.Map;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetValueType;

/**
 * Cursor's interface.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetCursor {

    /**
     * Close the cursor.
     * 
     * @throws SqlJetException
     */
    void close() throws SqlJetException;

    // Positioning

    /**
     * Get rowid of the current record.
     * 
     * @throws SqlJetException
     */
    long getRowId() throws SqlJetException;

    /**
     * Go to the record with the specified rowid.
     * 
     * @return true if cursor was moved successfully.
     * @throws SqlJetException
     */
    boolean goTo(long rowId) throws SqlJetException;

    /**
     * Check that the cursor is not positioned on the record.
     * 
     * @return true if the cursor is not on a record and fields can't be read.
     * @throws SqlJetException
     */
    boolean eof() throws SqlJetException;

    /**
     * Go to the first record.
     * 
     * @return true if there is at least one record.
     * @throws SqlJetException
     */
    boolean first() throws SqlJetException;

    /**
     * Go to the last record.
     * 
     * @return true if there is at least one record.
     * @throws SqlJetException
     */
    boolean last() throws SqlJetException;

    /**
     * Go to the next record.
     * 
     * @return true if there is at least one record and end of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean next() throws SqlJetException;

    /**
     * Go to the previous record.
     * 
     * @return true if there is at least one record and begin of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean previous() throws SqlJetException;

    // Record Access

    /**
     * Get number of fields in the current record.
     * 
     * @throws SqlJetException
     */
    int getFieldsCount() throws SqlJetException;

    /**
     * Get field type.
     * 
     * @param field
     *            number of field begin from zero
     * @return type of field
     * @throws SqlJetException
     */
    SqlJetValueType getFieldType(int field) throws SqlJetException;

    /**
     * Get field type.
     * 
     * @return type of field
     * @throws SqlJetException
     */
    SqlJetValueType getFieldType(String fieldName) throws SqlJetException;

    /**
     * Check if field value is null.
     * 
     * @param field
     *            number of field begin from zero
     * @return true if field value is null
     * @throws SqlJetException
     */
    boolean isNull(int field) throws SqlJetException;

    /**
     * Check if field value is null.
     * 
     * @return true if field value is null
     * @throws SqlJetException
     */
    boolean isNull(String fieldName) throws SqlJetException;

    /**
     * Get field's value as string.
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as string
     * @throws SqlJetException
     */
    String getString(int field) throws SqlJetException;

    /**
     * Get field's value as string.
     * 
     * @return field's value as string
     * @throws SqlJetException
     */
    String getString(String fieldName) throws SqlJetException;

    /**
     * Get field's value as integer.
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as integer
     * @throws SqlJetException
     */
    long getInteger(int field) throws SqlJetException;

    /**
     * Get field's value as integer.
     * 
     * @return field's value as integer
     * @throws SqlJetException
     */
    long getInteger(String fieldName) throws SqlJetException;

    /**
     * Get field's value as real (float).
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as real
     * @throws SqlJetException
     */
    double getFloat(int field) throws SqlJetException;

    /**
     * Get field's value as real (float).
     * 
     * @return field's value as real
     * @throws SqlJetException
     */
    double getFloat(String fieldName) throws SqlJetException;

    /**
     * Get field as boolean.
     * 
     * @param field
     * @return
     * @throws SqlJetException
     */
    boolean getBoolean(int field) throws SqlJetException;

    /**
     * Get field as boolean.
     * 
     * @param fieldName
     * @return
     * @throws SqlJetException
     */
    boolean getBoolean(String fieldName) throws SqlJetException;

    /**
     * Get field's value as BLOB.
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as BLOB
     * @throws SqlJetException
     */
    byte[] getBlobAsArray(int field) throws SqlJetException;

    /**
     * Get field's value as BLOB.
     * 
     * @return field's value as BLOB
     * @throws SqlJetException
     */
    byte[] getBlobAsArray(String fieldName) throws SqlJetException;

    /**
     * Get field's value as BLOB.
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as BLOB
     * @throws SqlJetException
     */
    InputStream getBlobAsStream(int field) throws SqlJetException;

    /**
     * Get field's value as BLOB.
     * 
     * @return field's value as BLOB
     * @throws SqlJetException
     */
    InputStream getBlobAsStream(String fieldName) throws SqlJetException;

    /**
     * Get field's value.
     * 
     * @throws SqlJetException
     */
    Object getValue(int field) throws SqlJetException;

    /**
     * Get field's value by name.
     * 
     * @throws SqlJetException
     */
    Object getValue(String fieldName) throws SqlJetException;

    // Modification

    /**
     * Update the current record.
     * 
     * @param values
     *            New record values.
     * @throws SqlJetException
     */
    void update(Object... values) throws SqlJetException;

    /**
     * Update rowId and values in the current record.
     * 
     * @param values
     *            New record values.
     * @throws SqlJetException
     */
    long updateWithRowId(long rowId, Object... values) throws SqlJetException;

    /**
     * Update the current record.
     * 
     * @param values
     *            New record values mapped by field names.
     * @throws SqlJetException
     */
    void updateByFieldNames(Map<String, Object> values) throws SqlJetException;

    /**
     * Delete the current record.
     * 
     * @throws SqlJetException
     */
    void delete() throws SqlJetException;
}
