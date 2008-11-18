/**
 * SqlJetException.java
 * Copyright (C) 2008 TMate Software Ltd
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
package org.tmatesoft.sqljet.core;

/**
 * SqlJet exception wraps error code {@link SqlJetErrorCode}
 * 
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetException extends Exception {

    private static final long serialVersionUID = -7132771040442635370L;

    private SqlJetErrorCode errorCode;

    /**
     * @return the errorCode
     */
    public SqlJetErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Create SqlJet exception.
     * 
     * @param errorCode
     * 
     */
    public SqlJetException(final SqlJetErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
