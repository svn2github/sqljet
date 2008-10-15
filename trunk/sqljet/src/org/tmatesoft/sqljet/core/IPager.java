/**
 * IPager.java
 * Copyright (C) 2008 TMate Software Ltd
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
package org.tmatesoft.sqljet.core;

/**
 * This header file defines the interface that the sqlite page cache
 * subsystem.  The page cache subsystem reads and writes a file a page
 * at a time and provides a journal for rollback.
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public interface IPager {

    /*
    ** If defined as non-zero, auto-vacuum is enabled by default. Otherwise
    ** it must be turned on for each database using "PRAGMA auto_vacuum = 1".
    */
    int SQLITE_DEFAULT_JOURNAL_SIZE_LIMIT = -1;

    /*
    ** Allowed values for the flags parameter to sqlite3PagerOpen().
    **
    ** NOTE: This values must match the corresponding BTREE_ values in btree.h.
    */
    int PAGER_OMIT_JOURNAL =  0x0001;    /* Do not use a rollback journal */
    int PAGER_NO_READLOCK =   0x0002;    /* Omit readlocks on readonly files */

    /*
    ** Valid values for the second argument to sqlite3PagerLockingMode().
    */
    int PAGER_LOCKINGMODE_QUERY     =  -1;
    int PAGER_LOCKINGMODE_NORMAL    =  0;
    int PAGER_LOCKINGMODE_EXCLUSIVE =  1;

    /*
    ** Valid values for the second argument to sqlite3PagerJournalMode().
    */
    int PAGER_JOURNALMODE_QUERY    =  -1;
    int PAGER_JOURNALMODE_DELETE   =   0;   /* Commit by deleting journal file */
    int PAGER_JOURNALMODE_PERSIST  =   1;   /* Commit by zeroing journal header */
    int PAGER_JOURNALMODE_OFF      =   2;   /* Journal omitted.  */
    
   /*    
   * int sqlite3PagerOpen(sqlite3_vfs *, Pager **ppPager, const char*, void(*)(DbPage*), int,int,int);
   */

    void open(
        String fileName,        /* Name of the database file to open */
        IPageDestructor xDesc,  /* Page destructor function */
        int nExtra,             /* Extra bytes append to each in-memory page */
        int flags               /* flags controlling this file */
    );
    
}
