/*
 * test_delete.c
 *
 *  Created on: 06.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#include "sqlite_test.h"

void testDelete() {

	puts("testDelete()");

	sqlite3 *db;

	char * file = DELETE_FILE;

	int rc = sqlite3_open(file, &db);

	if (rc != SQLITE_OK) {
		printf("failed open: %d \n", rc);
		return;
	}

	if (db->nDb == 0) {
		puts("backends count is zero");
		goto close;
	}

	Btree *pBt = db->aDb[0].pBt;

	rc = sqlite3BtreeBeginTrans(pBt, 1);
	if (rc != SQLITE_OK) {
		printf("failed begin transaction: %d", rc);
		goto close;
	}

	char* pData = "Test data";
	int nData = strlen(pData);

	BtCursor cur;
	int x = 0;

	for (x = 1; x <= 3; x++) {

		int table = 0;
		rc = sqlite3BtreeCreateTable(pBt, &table, BTREE_INTKEY
						| BTREE_LEAFDATA);
		if (rc != SQLITE_OK) {
			printf("failed create table: %d", rc);
			goto close;
		}

		memset(&cur, 0, sizeof(BtCursor));
		rc = sqlite3BtreeCursor(pBt, table, 0, 0, &cur);
		if (rc != SQLITE_OK) {
			printf("failed get cursor: %d", rc);
			goto close;
		}

		int y = 0;
		for (y = 1; y <= 3; y++) {
			rc = sqlite3BtreeInsert(&cur, NULL, y, pData, nData, 0, 0);
			if (rc != SQLITE_OK) {
				printf("failed insert data: %d", rc);
				goto close;
			}
		}

		rc = sqlite3BtreeCloseCursor(&cur);
		if (rc != SQLITE_OK) {
			printf("failed close cursor: %d", rc);
			goto close;
		}

	}

	rc = sqlite3BtreeCommit(pBt);
	if (rc != SQLITE_OK) {
		printf("failed commit transaction: %d", rc);
	} else {
		puts("success commit transaction");
	}

	sqlite3_close(db);

	rc = sqlite3_open(file, &db);

	if (rc != SQLITE_OK) {
		printf("failed open: %d \n", rc);
		return;
	}

	if (db->nDb == 0) {
		puts("backends count is zero");
		goto close;
	}

	pBt = db->aDb[0].pBt;

	rc = sqlite3BtreeBeginTrans(pBt, 1);
	if (rc != SQLITE_OK) {
		printf("failed begin transaction: %d", rc);
		goto close;
	}

	int pages = 0;

	rc = sqlite3PagerPagecount(pBt->pBt->pPager, &pages);

	if (rc != SQLITE_OK) {
		printf("failed get pages count: %d \n", rc);
		goto close;
	}

	if (pages == 0) {
		puts("pages count is zero");
		goto close;
	}

	printf("pages count: %d \n", pages);


	x = 0;

	for (x = 1; x <= pages; x++) {

		memset(&cur, 0, sizeof(BtCursor));
		rc = sqlite3BtreeCursor(pBt, x, 0, 0, &cur);
		if (rc != SQLITE_OK) {
			printf("failed get cursor: %d", rc);
			goto close;
		}

		int next = 0;
		rc = sqlite3BtreeFirst(&cur, &next);
		if (rc != SQLITE_OK) {
			printf("failed first(): %d \n", rc);
			goto closeCursor;
		}

		if (next != 0) {
			puts("cursor is empty");
			goto closeCursor;
		}

		do {

			rc = sqlite3BtreeDelete(&cur);
			if (rc != SQLITE_OK) {
				printf("failed delete(): %d \n", rc);
				goto closeCursor;
			}


		} while (!sqlite3BtreeEof(&cur));

		closeCursor:
		rc = sqlite3BtreeCloseCursor(&cur);
		if (rc != SQLITE_OK) {
			printf("failed close cursor: %d", rc);
			goto close;
		}

	}

	rc = sqlite3BtreeCommit(pBt);
	if (rc != SQLITE_OK) {
		printf("failed commit transaction: %d", rc);
	} else {
		puts("success commit transaction");
	}

	close: sqlite3_close(db);

}
