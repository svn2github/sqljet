/**
 * NullPKTest.java
 * Copyright (C) 2009-2013 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.table;

import org.junit.Assert;
import org.junit.Test;
import org.tmatesoft.sqljet.core.AbstractNewDbTest;
import org.tmatesoft.sqljet.core.SqlJetException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class NullPKTest extends AbstractNewDbTest {

    @Test
    public void nullPk() throws SqlJetException {
        db.createTable("create table t(a text primary key, b integer)");
        final ISqlJetTable t = db.getTable("t");
        t.insert(null, 1);
        t.insert(null, 2);
        db.runReadTransaction(new ISqlJetTransaction() {
            public Object run(SqlJetDb db) throws SqlJetException {
                final ISqlJetCursor c = t.open();
                try {
                    Assert.assertTrue(c.isNull(0));
                    Assert.assertTrue(c.next());
                    Assert.assertTrue(c.isNull(0));
                } finally {
                    c.close();
                }
                return null;
            }
        });
    }

}
