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
    
    private String description;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

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
    
    public SqlJetException(final SqlJetErrorCode errorCode, 
            final String description) 
    {
        this.errorCode = errorCode;
        this.description = description;
    }

    public static void assertion(final boolean assertion) throws SqlJetException 
    {
        if(!assertion) throw new SqlJetException(SqlJetErrorCode.MISUSE);
    }
    
    public static void assertion(final boolean assertion, 
            final SqlJetErrorCode errorCode) throws SqlJetException 
    {
        if(!assertion) throw new SqlJetException(errorCode);
    }

    public static void assertion(final boolean assertion, 
            final SqlJetErrorCode errorCode, final String description) throws SqlJetException 
    {
        if(!assertion) throw new SqlJetException(errorCode,description);        
    }
    
}
