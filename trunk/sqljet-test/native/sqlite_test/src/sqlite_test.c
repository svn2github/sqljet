/*
 * sqlite_test.c
 *
 *  Created on: 06.04.2009
 *      Author: TMate Software Ltd.
 *      Author: Sergey Scherbina (sergey.scherbina@gmail.com)
 */

#include "sqlite_test.h"

int main(void) {
	testRead();
	testWrite();
	testDelete();
	return EXIT_SUCCESS;
}
