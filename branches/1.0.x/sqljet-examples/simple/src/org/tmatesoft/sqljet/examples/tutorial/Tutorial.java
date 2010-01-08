/**
 * Example.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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
package org.tmatesoft.sqljet.examples.tutorial;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.schema.ISqlJetIndexDef;
import org.tmatesoft.sqljet.core.schema.ISqlJetTableDef;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class Tutorial {
    
    private static final String DB_NAME = "db.sqlite";
    private static final String TABLE_NAME = "employees";

    private static final String FIRST_NAME_FIELD = "first_name";
    private static final String SECOND_NAME_FIELD = "second_name";
    private static final String DOB_FIELD = "date_of_birth";
    private static final String FULL_NAME_INDEX = "full_name_index";
    private static final String DOB_INDEX = "dob_index";

    public static void main(String[] args) throws SqlJetException {
        File dbFile = new File(DB_NAME);
        dbFile.delete();
        
        // create database, table and two indices:
        SqlJetDb db = SqlJetDb.open(dbFile, true);
        // set DB option that have to be set before running any transactions: 
        db.getOptions().setAutovacuum(true);
        // set DB option that have to be set in a transaction: 
        db.runTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                db.getOptions().setUserVersion(1);
                return true;
            }
        }, SqlJetTransactionMode.WRITE);
       
            
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {            
            String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" + SECOND_NAME_FIELD + " TEXT NOT NULL PRIMARY KEY , " + FIRST_NAME_FIELD + " TEXT NOT NULL, " + DOB_FIELD + " INTEGER NOT NULL)";
            String createFirstNameIndexQuery = "CREATE INDEX " + FULL_NAME_INDEX + " ON " + TABLE_NAME + "(" +  FIRST_NAME_FIELD + "," + SECOND_NAME_FIELD + ")";
            String createDateIndexQuery = "CREATE INDEX " + DOB_INDEX + " ON " + TABLE_NAME + "(" +  DOB_FIELD + ")";
            System.out.println();
            System.out.println(">DB schema queries:");
            System.out.println();
            System.out.println(createTableQuery);
            System.out.println(createFirstNameIndexQuery);
            System.out.println(createDateIndexQuery);
            
            db.createTable(createTableQuery);
            db.createIndex(createFirstNameIndexQuery);
            db.createIndex(createDateIndexQuery);
        } finally {
            db.commit();
        }
        // close DB and open it again (as part of example code)
        
        db.close();        
        db = SqlJetDb.open(dbFile, true);

        System.out.println();
        System.out.println(">Database schema objects:");
        System.out.println();
        System.out.println(db.getSchema());
        System.out.println(db.getOptions());        
        
        // insert rows:
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            Calendar calendar = Calendar.getInstance();
            ISqlJetTable table = db.getTable(TABLE_NAME);
            calendar.clear();
            calendar.set(1981, 4, 19);
            table.insert("Prochaskova", "Elena", calendar.getTimeInMillis());
            calendar.set(1967, 5, 19);
            table.insert("Scherbina", "Sergei", calendar.getTimeInMillis());
            calendar.set(1987, 6, 19);
            table.insert("Vadishev", "Semen", calendar.getTimeInMillis());
            calendar.set(1982, 7, 19);
            table.insert("Sinjushkin", "Alexander", calendar.getTimeInMillis());
            calendar.set(1979, 8, 19);
            table.insert("Stadnik", "Dmitry", calendar.getTimeInMillis());
            calendar.set(1977, 9, 19);
            table.insert("Kitaev", "Alexander", calendar.getTimeInMillis());
        } finally {
            db.commit();
        }

        ISqlJetTable table = db.getTable(TABLE_NAME);

        // getting all rows in table, sorted by PK.        
        System.out.println();
        System.out.println(">All employees in order defined by PK (" + table.getPrimaryKeyIndexName() + "):");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.order(table.getPrimaryKeyIndexName()));
        } finally {
            db.commit();
        }

        // getting all rows in table, sorted by PK.        
        System.out.println();
        System.out.println(">All employees in order defined by " + DOB_INDEX + ", reversed:");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.order(table.getPrimaryKeyIndexName()).reverse());
        } finally {
            db.commit();
        }
        
        // getting all rows in table, sorted by index.        
        System.out.println();
        System.out.println(">All employees in order defined by " + FULL_NAME_INDEX + " :");
        System.out.println();

        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.order(FULL_NAME_INDEX));
        } finally {
            db.commit();
        }

        // getting rows in table with exact indexed field value.
        System.out.println();
        System.out.println(">Alexanders:");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.lookup(FULL_NAME_INDEX, "Alexander"));
        } finally {
            db.commit();
        }
        
        // getting rows in table with indexed field value in certain scope.        
        System.out.println();
        System.out.println(">Employees with full name in scope [B, I]:");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.scope(FULL_NAME_INDEX, new Object[] {"B"}, new Object[] {"I"}));
        } finally {
            db.commit();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        calendar.add(Calendar.YEAR, -30);

        System.out.println();
        System.out.println(">Deleting rows of employees older than 30 years old.");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            ISqlJetCursor deleteCursor = table.scope(DOB_INDEX, 
                     new Object[] {Long.MIN_VALUE}, 
                     new Object[] {calendar.getTimeInMillis()});
            while (!deleteCursor.eof()) {
                System.out.println("Deleting: " + 
                        deleteCursor.getRowId() + " : " + 
                        deleteCursor.getString(FIRST_NAME_FIELD) + " " + 
                        deleteCursor.getString(SECOND_NAME_FIELD) + " was born on " + 
                        formatDate(deleteCursor.getInteger(DOB_FIELD)));
                deleteCursor.delete();
            }
            deleteCursor.close();
        } finally {
            db.commit();
        }

        System.out.println();
        System.out.println(">After deletion in row id order:");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.open());
        } finally {
            db.commit();
        }

        db.beginTransaction(SqlJetTransactionMode.WRITE);
        ISqlJetCursor updateCursor = null;
        try {
            table.insert("Smith", "John", 0);
            calendar.setTime(new Date(System.currentTimeMillis()));
            updateCursor = table.open();
            do {
                updateCursor.update(updateCursor.getValue(SECOND_NAME_FIELD), updateCursor.getValue(FIRST_NAME_FIELD), calendar.getTimeInMillis());
            } while(updateCursor.next());
        } finally {
            updateCursor.close();
            db.commit();
        }

        System.out.println();
        System.out.println(">After insertion of a new record and updating dates (by PK):");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        try {
            printRecords(table.order(table.getPrimaryKeyIndexName()));
            System.out.println();
            System.out.println(">Same in order defined by " + FULL_NAME_INDEX + " :");
            System.out.println();
            printRecords(table.order(FULL_NAME_INDEX));
        } finally {
            db.commit();
        }
       
        System.out.println();
        System.out.println(">Dropping tables and indices:");
        System.out.println();
        db.beginTransaction(SqlJetTransactionMode.WRITE);
        try {
            Set<String> tables = db.getSchema().getTableNames();
            for (String tableName : tables) {
                ISqlJetTableDef tableDef = db.getSchema().getTable(tableName);
                Set<ISqlJetIndexDef> tableIndices = db.getSchema().getIndexes(tableDef.getName());
                
                for (ISqlJetIndexDef indexDef : tableIndices) {
                    
                    if (!indexDef.isImplicit()) {
                        System.out.println("dropping index: " + indexDef.getName());
                        db.dropIndex(indexDef.getName());
                    }
                }
                System.out.println("dropping table: " + tableDef.getName());
                db.dropTable(tableDef.getName());
            }
        } finally {
            db.commit();
        }

        db.close();
    }
    
    private static void printRecords(ISqlJetCursor cursor) throws SqlJetException {
        try {
            if (!cursor.eof()) {
                do {
                    System.out.println(cursor.getRowId() + " : " + 
                            cursor.getString(FIRST_NAME_FIELD) + " " + 
                            cursor.getString(SECOND_NAME_FIELD) + " was born on " + 
                            formatDate(cursor.getInteger(DOB_FIELD)));
                } while(cursor.next());
            }
        } finally {
            cursor.close();
        }
    }
    
    private static String formatDate(long time) {
        return SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM).format(new Date(time));
    }

}
