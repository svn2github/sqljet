/**
 * SqlJetNullLiteral.java
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
package org.tmatesoft.sqljet.core.internal.schema;

import org.antlr.runtime.tree.CommonTree;
import org.tmatesoft.sqljet.core.schema.ISqlJetNullLiteral;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public class SqlJetBoolLiteral extends SqlJetExpression implements
		ISqlJetNullLiteral {

	private final boolean bool;

	public SqlJetBoolLiteral(CommonTree ast) {
		assert (Boolean.TRUE.toString().equalsIgnoreCase(ast.getText()) || Boolean.FALSE
				.toString().equalsIgnoreCase(ast.getText()));
		bool = Boolean.parseBoolean(ast.getText());
	}

	public boolean getBoolean() {
		return bool;
	}

	@Override
	public String toString() {
		return Boolean.toString(bool);
	}
}
