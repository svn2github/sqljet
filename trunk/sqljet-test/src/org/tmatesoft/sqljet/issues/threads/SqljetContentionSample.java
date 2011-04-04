/**
 * SqljetIContentionTest.java
 * Copyright (C) 2009-2011 TMate Software Ltd
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
package org.tmatesoft.sqljet.issues.threads;

import java.io.File;
import java.io.IOException;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * @author Carl de Marcken (carl@cryodendra.com)
 *
 */
public class SqljetContentionSample {

    public static void main(String[] args) throws IOException, SqlJetException {
        File file = File.createTempFile("database", "sqljet");
        file.delete();
        try {
            new Creator(file).run();
            Thread writer = new Thread(new Writer(file));
            Thread reader = new Thread(new Reader(file));
            writer.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            } // give writer time to write some records
            reader.start();
        } finally {
            file.delete();
        }
    }
}

abstract class Action implements Runnable, ISqlJetTransaction {

    static private int BUSY_WAIT_DURATION_IN_MILLISECONDS = 600;
    static private int BUSY_SLEEP_IN_MILLISECONDS = 50;

    Action(File file, String name, SqlJetTransactionMode mode) throws SqlJetException {
        _name = name;
        _mode = mode;
        _db = SqlJetDb.open(file, mode != SqlJetTransactionMode.READ_ONLY);
        _db.setBusyHandler(new MySqlJetBusyHandler(BUSY_WAIT_DURATION_IN_MILLISECONDS / BUSY_SLEEP_IN_MILLISECONDS,
                BUSY_SLEEP_IN_MILLISECONDS, name));
    }

    abstract public Object run(SqlJetDb db) throws SqlJetException;

    public void run() {
        try {
            _db.runTransaction(this, _mode);
            _db.close();
        } catch (SqlJetException e) {
            System.err.println(_name + " error: " + e);
        }
    }

    protected SqlJetDb _db;
    protected String _name;
    protected SqlJetTransactionMode _mode;
}

abstract class RepeatedAction extends Action {

    RepeatedAction(File file, String name, SqlJetTransactionMode mode) throws SqlJetException {
        super(file, name, mode);
        _table = _db.getTable("record");
    }

    @Override
    abstract public Object run(SqlJetDb db) throws SqlJetException;

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long end = start + _total_millis;
        long now;
        while ((now = System.currentTimeMillis()) < end) {
            try {
                System.out.println("doing " + _name);
                _db.runTransaction(this, _mode);
                System.out.println("done " + _name);
            } catch (SqlJetException e) {
                System.err.println(_name + " error: " + e);
            }
            try {
                Thread.sleep(_between_millis);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(_name + " ran for " + (now - start));
        try {
            _db.close();
        } catch (SqlJetException e) {
        }
    }

    protected long _batch_millis = 300;
    protected long _between_millis = 100;
    protected long _total_millis = 5000;
    protected ISqlJetTable _table;
}

class Creator extends Action {
    Creator(File file) throws SqlJetException {
        super(file, "creator", SqlJetTransactionMode.WRITE);
    }

    @Override
    public Object run(SqlJetDb db) throws SqlJetException {
        db.createTable("CREATE TABLE record (a INTEGER NOT NULL, b INTEGER NOT NULL PRIMARY KEY)");
        return null;
    }
}

class Writer extends RepeatedAction {
    Writer(File file) throws SqlJetException {
        super(file, "writer", SqlJetTransactionMode.WRITE);
    }

    @Override
    public Object run(SqlJetDb db) throws SqlJetException {
        int n_written = 0;
        _batch++;
        long start = System.currentTimeMillis();
        long end = start + _batch_millis;
        long now;
        while ((now = System.currentTimeMillis()) < end) {
            _table.insert(_batch, ++_id);
            n_written++;
        }
        System.out.println("inserted " + n_written + " in " + (now - start));
        return null;
    }

    long _batch = 0;
    long _id = 0;
}

class Reader extends RepeatedAction {

    Reader(File file) throws SqlJetException {
        super(file, "reader", SqlJetTransactionMode.READ_ONLY);
    }

    @Override
    public Object run(SqlJetDb db) throws SqlJetException {
        int n_read = 0;
        long start = System.currentTimeMillis();
        long end = start + _batch_millis;
        long now;
        ISqlJetCursor cursor = _table.open();
        try {
            boolean more = !cursor.eof();
            while ((now = System.currentTimeMillis()) < end && more) {
                n_read++;
                cursor.getInteger(0);
                more = cursor.next();
            }
        } finally {
            cursor.close();
        }
        System.out.println("scanned " + n_read + " in " + (now - start));
        return null;
    }
}

class MySqlJetBusyHandler implements ISqlJetBusyHandler {

    public MySqlJetBusyHandler(final int retries, final int sleep, final String name) {
        this._retries = retries;
        this._sleep = sleep;
        this._name = name;
    }

    public boolean call(int number) {
        System.out.println(_name + " retry " + number);
        if (number > _retries) {
            return false;
        } else {
            try {
                Thread.sleep(_sleep);
            } catch (InterruptedException e) {
                return false;
            }
            return true;
        }
    }

    private int _retries;
    private int _sleep;
    private String _name;

}
