/*
 * test_read.c
 *
 *  Created on: 10.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#include "sqlite_test.h"

#define MASTER_COLUMNS 5

/*
 ** The master database table has a structure like this
 */
static const char master_schema[] = "CREATE TABLE sqlite_master(\n"
	"  type text,\n"
	"  name text,\n"
	"  tbl_name text,\n"
	"  rootpage integer,\n"
	"  sql text\n"
	")";

int readRecordColumn(
	sqlite3 *db, /* The database */
	BtCursor *pCrsr, /* The BTree cursor */
	int column, /* column number to retrieve */
	Bool isIndex, /* True if an index containing keys only - no data */
	u32 *aType, /* Type values for all entries in the record */
	u32 *aOffset, /* Cached offsets to the start of each columns data */
	Mem *pDest /* Where to write the extracted value */
);

int readRecordHeader(
	sqlite3 *db, /* The database */
	BtCursor *pCrsr, /* The BTree cursor */
	Bool isIndex, /* True if an index containing keys only - no data */
	int *nField, /* number of fields in the record */
	u32 *aType, /* Type values for all entries in the record */
	u32 *aOffset /* Cached offsets to the start of each columns data */
);

int readTable(
	sqlite3 *db,
	Btree *pBt,
	int table,
	int deepLevel,
	Bool index
);

void testReadMaster(
	char * file) {

	puts("\ntestReadMaster()");

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

	rc = readTable(db, pBt, MASTER_ROOT, 1, 0);

	close:

	sqlite3_close(db);

}

int readTable(
	sqlite3 *db,
	Btree *pBt,
	int table,
	int deepLevel,
	Bool index
)
{
	int rc = SQLITE_OK;

	BtCursor cur;
	memset(&cur, 0, sizeof(BtCursor));
	rc = sqlite3BtreeCursor(pBt, table, 0, 0, &cur);
	if (rc != SQLITE_OK) {
		printf("failed get cursor: %d", rc);
		return rc;
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
	u32 aType[SQLITE_MAX_COLUMN];
	u32 aOffset[SQLITE_MAX_COLUMN];
	int nField;
	int i;
	Mem mem;
	i64 key;
	do {

		memset(&key, 0, sizeof(i64));
		rc = sqlite3BtreeKeySize(&cur, &key);
		if (rc != SQLITE_OK) {
			printf("failed read key: %d\n", rc);
			return rc;
		}
		printf("key: \"%lld\"\n", key);

		nField = 0;
		memset(&aType, 0, sizeof(aType));
		memset(&aOffset, 0, sizeof(aOffset));
		rc = readRecordHeader(db, &cur, index, &nField, aType, aOffset);
		if (rc != SQLITE_OK) {
			printf("failed read header: %d\n", rc);
			return rc;
		}

		int deepIndex = 0;
		int deepPage = 0;

		for (i = 0; i < nField; i++) {
			memset(&mem, 0, sizeof(Mem));
			rc = readRecordColumn(db, &cur, i, index, aType, aOffset, &mem);
			if (rc != SQLITE_OK) {
				printf("failed read column: %d\n", rc);
				return rc;
			}
			const unsigned char *text = sqlite3_value_text(&mem);
			printf("value: \"%s\"\n", text);

			if(deepLevel>0){
				if(i==0 && text!=NULL){
					if(strcmp("index",text)==0)
						deepIndex = 1;
				}
				if(i==3){
					deepPage = sqlite3_value_int(&mem);
				}
				if(i==4){
					char* shema = mem.z;
				}
			}

		}

		if(deepLevel>0 && deepPage>0)
			readTable(db, pBt, deepPage, deepLevel-1, deepIndex );


	} while (SQLITE_OK == sqlite3BtreeNext(&cur, &next) && next == 0);

	closeCursor: sqlite3BtreeCloseCursor(&cur);

	return rc;
}

/* Opcode: Column P1 P2 P3 P4 *
 **
 ** Interpret the data that cursor P1 points to as a structure built using
 ** the MakeRecord instruction.  (See the MakeRecord opcode for additional
 ** information about the format of the data.)  Extract the P2-th column
 ** from this record.  If there are less that (P2+1)
 ** values in the record, extract a NULL.
 **
 ** The value extracted is stored in register P3.
 **
 ** If the column contains fewer than P2 fields, then extract a NULL.  Or,
 ** if the P4 argument is a P4_MEM use the value of the P4 argument as
 ** the result.
 */
int readRecordColumn(
	sqlite3 *db, /* The database */
	BtCursor *pCrsr, /* The BTree cursor */
	int column, /* column number to retrieve */
	Bool isIndex, /* True if an index containing keys only - no data */
	u32 *aType, /* Type values for all entries in the record */
	u32 *aOffset, /* Cached offsets to the start of each columns data */
	Mem *pDest /* Where to write the extracted value */
) {

	int rc = SQLITE_OK; /* Value to return */

	int payloadSize; /* Number of bytes in the record */
	int len; /* The length of the serialized data for the column */
	char *zData; /* Part of the record being decoded */
	Mem sMem; /* For storing the record being decoded */

	memset(&sMem, 0, sizeof(sMem));
	MemSetTypeFlag(pDest, MEM_Null);

	/* This block sets the variable payloadSize to be the total number of
	 ** bytes in the record.
	 */
	if (isIndex) {
		i64 payloadSize64;
		sqlite3BtreeKeySize(pCrsr, &payloadSize64);
		payloadSize = (int) payloadSize64;
	} else {
		sqlite3BtreeDataSize(pCrsr, (u32 *) &payloadSize);
	}

	/* If payloadSize is 0, then just store a NULL */
	if (payloadSize == 0) {
		assert( pDest->flags&MEM_Null );
		return rc;
	}
	if (payloadSize > db->aLimit[SQLITE_LIMIT_LENGTH]) {
		return SQLITE_TOOBIG;
	}

	/* Get the column information. If aOffset[p2] is non-zero, then
	 ** deserialize the value from the record. If aOffset[p2] is zero,
	 ** then there are not enough fields in the record to satisfy the
	 ** request.  In this case, set the value NULL or to P4 if P4 is
	 ** a pointer to a Mem object.
	 */
	if (aOffset[column]) {
		assert( rc==SQLITE_OK );
		len = sqlite3VdbeSerialTypeLen(aType[column]);
		sqlite3VdbeMemMove(&sMem, pDest);
		rc = sqlite3VdbeMemFromBtree(pCrsr, aOffset[column], len, isIndex,
				&sMem);
		if (rc != SQLITE_OK) {
			return rc;
		}
		zData = sMem.z;
		sqlite3VdbeSerialGet((u8*) zData, aType[column], pDest);
		pDest->enc = ENC(db);
	}

	/* If we dynamically allocated space to hold the data (in the
	 ** sqlite3VdbeMemFromBtree() call above) then transfer control of that
	 ** dynamically allocated space over to the pDest structure.
	 ** This prevents a memory copy.
	 */
	if (sMem.zMalloc) {
		assert( sMem.z==sMem.zMalloc );
		assert( !(pDest->flags & MEM_Dyn) );
		assert( !(pDest->flags & (MEM_Blob|MEM_Str)) || pDest->z==sMem.z );
		pDest->flags &= ~(MEM_Ephem | MEM_Static);
		pDest->flags |= MEM_Term;
		pDest->z = sMem.z;
		pDest->zMalloc = sMem.zMalloc;
	}

	return sqlite3VdbeMemMakeWriteable(pDest);

}

/* Read and parse the table header.  Store the results of the parse
 ** into the record header cache fields of the cursor.
 */
int readRecordHeader(
	sqlite3 *db, /* The database */
	BtCursor *pCrsr, /* The BTree cursor */
	Bool isIndex, /* True if an index containing keys only - no data */
	int *nField, /* number of fields in the record */
	u32 *aType, /* Type values for all entries in the record */
	u32 *aOffset /* Cached offsets to the start of each columns data */
) {

	int rc = SQLITE_OK; /* Value to return */

	int payloadSize; /* Number of bytes in the record */

	/* This block sets the variable payloadSize to be the total number of
	 ** bytes in the record.
	 */
	if (isIndex) {
		i64 payloadSize64;
		sqlite3BtreeKeySize(pCrsr, &payloadSize64);
		payloadSize = (int) payloadSize64;
	} else {
		sqlite3BtreeDataSize(pCrsr, (u32 *) &payloadSize);
	}
	/* If payloadSize is 0, then just store a NULL */
	if (payloadSize == 0) {
		return rc;
	}
	if (payloadSize > db->aLimit[SQLITE_LIMIT_LENGTH]) {
		return SQLITE_TOOBIG;
	}

	char *zRec; /* Pointer to complete record-data */
	int len; /* The length of the serialized data for the column */
	int i; /* Loop counter */
	char *zData; /* Part of the record being decoded */
	Mem sMem; /* For storing the record being decoded */

	memset(&sMem, 0, sizeof(sMem));

	u8 *zIdx; /* Index into header */
	u8 *zEndHdr; /* Pointer to first byte after the header */
	int offset; /* Offset into the data */
	int szHdrSz; /* Size of the header size field at start of record */
	int avail = 0; /* Number of bytes of available data */

	assert(aType);
	assert(aOffset);

	/* Figure out how many bytes are in the header */
	if (isIndex) {
		zData = (char*) sqlite3BtreeKeyFetch(pCrsr, &avail);
	} else {
		zData = (char*) sqlite3BtreeDataFetch(pCrsr, &avail);
	}
	/* The following assert is true in all cases accept when
	 ** the database file has been corrupted externally.
	 **    assert( zRec!=0 || avail>=payloadSize || avail>=9 ); */
	szHdrSz = getVarint32((u8*)zData, offset);

	/* The KeyFetch() or DataFetch() above are fast and will get the entire
	 ** record header in most cases.  But they will fail to get the complete
	 ** record header if the record header does not fit on a single page
	 ** in the B-Tree.  When that happens, use sqlite3VdbeMemFromBtree() to
	 ** acquire the complete header text.
	 */
	if (avail < offset) {
		sMem.flags = 0;
		sMem.db = 0;
		rc = sqlite3VdbeMemFromBtree(pCrsr, 0, offset, isIndex, &sMem);
		if (rc != SQLITE_OK) {
			return rc;
		}
		zData = sMem.z;
	}
	zEndHdr = (u8 *) &zData[offset];
	zIdx = (u8 *) &zData[szHdrSz];

	/* Scan the header and use it to fill in the aType[] and aOffset[]
	 ** arrays.  aType[i] will contain the type integer for the i-th
	 ** column and aOffset[i] will contain the offset from the beginning
	 ** of the record to the start of the data for the i-th column
	 */
	*nField = 0;
	for (i = 0; i < SQLITE_MAX_COLUMN && zIdx < zEndHdr && offset < payloadSize; i++, *nField
			+= 1) {
		aOffset[i] = offset;
		zIdx += getVarint32(zIdx, aType[i]);
		offset += sqlite3VdbeSerialTypeLen(aType[i]);
	}
	sqlite3VdbeMemRelease(&sMem);
	sMem.flags = MEM_Null;

	/* If we have read more header data than was contained in the header,
	 ** or if the end of the last field appears to be past the end of the
	 ** record, or if the end of the last field appears to be before the end
	 ** of the record (when all fields present), then we must be dealing
	 ** with a corrupt database.
	 */
	if (zIdx > zEndHdr || offset > payloadSize || (zIdx == zEndHdr && offset
			!= payloadSize)) {
		return SQLITE_CORRUPT;
	}

	return rc;
}
