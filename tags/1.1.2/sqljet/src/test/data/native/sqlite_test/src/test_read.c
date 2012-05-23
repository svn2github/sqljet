/*
 * test_read.c
 *
 *  Created on: 06.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#include "sqlite_test.h"

void testRead() {

	puts("testRead()");

	char * file = TEST_DB;

	sqlite3 *db;

	int rc = sqlite3_open(file, &db);

	if (rc != SQLITE_OK) {
		printf("failed open: %d \n", rc);
		printf("file: %s \n", file);
		return;
	}

	if (db->nDb == 0) {
		puts("backends count is zero");
		goto close;
	}

	Btree *pBt = db->aDb[0].pBt;

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

	BtCursor cur;
	i64 keySize;
	int i;
	int next;
	int flags;
	int intKey;
	u32 dataSize;
	u8 *data;
	int y;

	for (i = 1; i <= pages; i++) {
		printf("\npage: %d \n", i);

		memset(&cur, 0, sizeof(BtCursor));
		rc = sqlite3BtreeCursor(pBt, i, 0, 0, &cur);
		if (rc != SQLITE_OK) {
			printf("failed get cursor: %d", rc);
			goto close;
		}

		flags = sqlite3BtreeFlags(&cur);
		intKey = flags | BTREE_INTKEY;

		if (intKey) {
			puts("intKey");
		}

		next = 0;
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

			keySize = 0;
			rc = sqlite3BtreeKeySize(&cur, &keySize);
			if (rc != SQLITE_OK) {
				printf("failed get keySize: %d \n", rc);
				goto closeCursor;
			}

			printf("keySize %lld \n", keySize);

			dataSize = 0;
			sqlite3BtreeDataSize(&cur, &dataSize);
			printf("dataSize %d \n", dataSize);

			if (dataSize > 0) {

				data = malloc(dataSize);

				rc = sqlite3BtreeData(&cur, 0, dataSize, data);

				if (rc != SQLITE_OK) {
					printf("failed get data: %d \n", rc);
				} else {
					puts("data:[");
					for (y = 0; y < dataSize; y++) {
						putchar(data[y]);
					}
					puts("]");
				}

				free(data);

			}

		} while (SQLITE_OK == sqlite3BtreeNext(&cur, &next) && next == 0);

		closeCursor: sqlite3BtreeCloseCursor(&cur);

	}

	close:

	sqlite3_close(db);

}
