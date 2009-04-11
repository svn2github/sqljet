/*
 * sqlite_test.c
 *
 *  Created on: 06.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#include "sqlite_test.h"

void cleanup(){
	unlink(WRITE_FILE);
	unlink(DELETE_FILE);
	unlink(UPDATE_FILE);
}

int main(void) {

	cleanup();

	testRead();
	testWrite();
	testDelete();
	testUpdate();

	testReadMaster(REP_CACHE_DB);

	return EXIT_SUCCESS;

}
