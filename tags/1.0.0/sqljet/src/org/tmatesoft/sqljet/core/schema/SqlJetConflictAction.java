/**
 * SqlJetConflictAction.java
 * Copyright (C) 2009 TMate Software Ltd
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
package org.tmatesoft.sqljet.core.schema;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public enum SqlJetConflictAction {
    ROLLBACK, ABORT, FAIL, IGNORE, REPLACE;

    public static SqlJetConflictAction decode(String s) {
        if ("rollback".equalsIgnoreCase(s)) {
            return ROLLBACK;
        } else if ("abort".equalsIgnoreCase(s)) {
            return ABORT;
        } else if ("fail".equalsIgnoreCase(s)) {
            return FAIL;
        } else if ("ignore".equalsIgnoreCase(s)) {
            return IGNORE;
        } else if ("replace".equalsIgnoreCase(s)) {
            return REPLACE;
        }
        return null;
    }

    public String toString() {
        switch (this) {
        case ROLLBACK:
            return "ROLLBACK";
        case ABORT:
            return "ABORT";
        case FAIL:
            return "FAIL";
        case IGNORE:
            return "IGNORE";
        case REPLACE:
            return "REPLACE";
        }
        return "";
    }
}
