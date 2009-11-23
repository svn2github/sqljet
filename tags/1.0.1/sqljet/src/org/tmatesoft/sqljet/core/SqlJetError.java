/**
 * SqlJetError.java
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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetError extends Error {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public SqlJetError() {
    }

    /**
     * @param message
     */
    public SqlJetError(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public SqlJetError(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public SqlJetError(String message, Throwable cause) {
        super(message, cause);
    }

}
