/**
 * ISqlJetSchema.java
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
package org.tmatesoft.sqljet.core.internal;

/**
 * An instance of the following structure stores a database schema.
 *
 * If there are no virtual tables configured in this schema, the
 * Schema.db variable is set to NULL. After the first virtual table
 * has been added, it is set to point to the database connection 
 * used to create the connection. Once a virtual table has been
 * added to the Schema structure and the Schema.db variable populated, 
 * only that database connection may use the Schema to prepare 
 * statements.
 * 
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface ISqlJetSchema {

//    int schema_cookie;   /* Database schema version number for this file */
//    Hash tblHash;        /* All tables indexed by name */
//    Hash idxHash;        /* All (named) indices indexed by name */
//    Hash trigHash;       /* All triggers indexed by name */
//    Hash aFKey;          /* Foreign keys indexed by to-table */
//    Table *pSeqTab;      /* The sqlite_sequence table used by AUTOINCREMENT */
//    u8 file_format;      /* Schema format version for this file */
//    u8 enc;              /* Text encoding used by this database */
//    u16 flags;           /* Flags associated with this schema */
//    int cache_size;      /* Number of pages to use in the cache */
//    sqlite3 *db;         /* "Owner" connection. See comment above */
    
}
