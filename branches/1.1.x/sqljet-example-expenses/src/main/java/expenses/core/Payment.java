/**
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
 */
package expenses.core;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;

/**
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class Payment {

	public long date;
	public long amount;
	public String currency, info;
    public long rowID;

    public static Payment read(ISqlJetCursor cursor) throws SqlJetException {
        return new Payment(cursor.getRowId(), cursor.getInteger("date"), cursor.getInteger("amount"), cursor.getString("currency"), cursor.getString("info"));
    }

    public Payment(long date, long amount, String currency, String info) {
        this(-1, date, amount, currency, info);
    }

	private Payment(long rowID, long date, long amount, String currency, String info) {
	    this.rowID = rowID;
		this.date = date;
		this.amount = amount;
		this.currency = currency;
		this.info = info;
	}
}
