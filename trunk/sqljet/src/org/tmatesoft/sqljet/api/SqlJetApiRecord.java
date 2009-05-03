/**
 * SqlJetCursorRecord.java
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
package org.tmatesoft.sqljet.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.ext.ISqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetBtreeRecord;
import org.tmatesoft.sqljet.core.internal.vdbe.SqlJetVdbeMem;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetApiRecord {

    List<SqlJetApiValue> values;

    /**
     * 
     */
    SqlJetApiRecord(ISqlJetBtreeRecord record) {
        if (record == null)
            return;
        final int fieldsCount = record.getFieldsCount();
        final List<ISqlJetVdbeMem> fields = record.getFields();
        values = new ArrayList<SqlJetApiValue>(fieldsCount);
        for (int i = 0; i < fieldsCount; i++) {
            final ISqlJetVdbeMem mem = fields.get(i);
            values.add(mem != null ? new SqlJetApiValue(mem) : new SqlJetApiValue());
        }
    }

    ISqlJetBtreeRecord getRecord() {
        List<ISqlJetVdbeMem> fields = new ArrayList<ISqlJetVdbeMem>(values.size());
        for (SqlJetApiValue value : values) {
            fields.add(value.getMem());
        }
        return new SqlJetBtreeRecord(fields);
    }

    /**
     * 
     */
    public SqlJetApiRecord(SqlJetApiValue... values) {
        this.values = Arrays.asList(values);
    }

    /**
     * @return the values
     */
    public List<SqlJetApiValue> getValues() {
        return Collections.unmodifiableList(values);
    }

}
