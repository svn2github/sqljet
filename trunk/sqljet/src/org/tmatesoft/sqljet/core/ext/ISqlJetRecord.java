/**
 * ISqlJetRecord.java
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
package org.tmatesoft.sqljet.core.ext;

import java.util.List;

import org.tmatesoft.sqljet.core.ISqlJetBtreeCursor;
import org.tmatesoft.sqljet.core.ISqlJetVdbeMem;
import org.tmatesoft.sqljet.core.SqlJetEncoding;


/**
 * Parses current record in {@link ISqlJetBtreeCursor} and allow acces to fields. 
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetRecord {

    /**
     * @return the fieldsCount
     */
    int getFieldsCount();

    /**
     * @return
     */
    List<ISqlJetVdbeMem> getFields();
    
    /**
     * @param field
     * @return
     */
    String getStringField(int field, SqlJetEncoding enc);
    
    /**
     * @param field
     * @return
     */
    long getIntField(int field);

}