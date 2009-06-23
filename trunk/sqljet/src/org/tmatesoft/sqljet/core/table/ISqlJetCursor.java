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
 * contact TMate Software at support@svnkit.com
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
     * @return True if cursor was moved successfully.
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
     * Go to next record.
     * 
     * @return true if there is at least one record and end of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean next() throws SqlJetException;

    /**
     * Go to previous record.
     * 
     * @return true if there is at least one record and begin of cursor is not
     *         reached yet
     * @throws SqlJetException
     */
    boolean previous() throws SqlJetException;

    // Record Access

    /**
     * Get count of fields in current record.
     * 
     * @return count of fields
     * @throws SqlJetException
     */
    int getFieldsCount() throws SqlJetException;

    /**
     * Get type of field.
     * 
     * @param field
     *            number of field begin from zero
     * @return type of field
     * @throws SqlJetException
     */
    SqlJetValueType getFieldType(int field) throws SqlJetException;

    /**
     * Check to field has null value.
     * 
     * @param field
     *            number of field begin from zero
     * @return true if field value is null
     * @throws SqlJetException
     */
    boolean isNull(int field) throws SqlJetException;

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
     * Get field's value as integer.
     * 
     * @param field
     *            number of field begin from zero
     * @return field's value as integer
     * @throws SqlJetException
     */
    long getInteger(int field) throws SqlJetException;

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
     * @param field
     *            number of field begin from zero
     * @return field's value as BLOB
     * @throws SqlJetException
     */
    InputStream getBlobAsStream(int field) throws SqlJetException;

    /**
     * Get value of field by name.
     * 
     * @param fieldName
     * @return
     * @throws SqlJetException
     */
    Object getValueByFieldName(String fieldName) throws SqlJetException;

    /**
     * Get values of records fields with their names.
     * 
     * @return
     * @throws SqlJetException
     */
    Map<String, Object> getValuesWithFieldNames() throws SqlJetException;
    
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
     * @param values
     * @throws SqlJetException
     */
    void update(Map<String, Object> values) throws SqlJetException;
    
    /**
     * Delete the current record.
     * 
     * @throws SqlJetException
     */
    void delete() throws SqlJetException;
}
