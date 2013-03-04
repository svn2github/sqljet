/*
 * sqlite_test.h
 *
 *  Created on: 06.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#ifndef SQLITE_TEST_H_
#define SQLITE_TEST_H_

#include <stdio.h>
#include <stdlib.h>

#include "./tsrc/sqlite3.h"
#include "./tsrc/sqliteInt.h"
#include "./tsrc/btree.h"
#include "./tsrc/btreeInt.h"
#include "./tsrc/pager.h"
#include "./tsrc/vdbe.h"
#include "./tsrc/vdbeInt.h"


#define SQLJET_ROOT "/home/sergey/work2/sqljet/workspace/org.tmatesoft.sqljet.trunk/"

#define TEST_DB SQLJET_ROOT "src/test/data/db/testdb.sqlite"

#define REP_CACHE_DB SQLJET_ROOT "src/test/data/db/rep-cache/rep-cache.db"

#define WRITE_FILE "/tmp/write.native"
#define DELETE_FILE "/tmp/delete.native"
#define UPDATE_FILE "/tmp/update.native"


void testRead(void);
void testWrite(void);
void testDelete(void);
void testUpdate(void);

void testReadMaster(char * file);

#endif /* SQLITE_TEST_H_ */
