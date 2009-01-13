/**
 * SqlJetUtility.java
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
package org.tmatesoft.sqljet.core;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetUtility {

    public static int getIntSysProp(final String propName, final int defValue) throws SqlJetError{
        if(null==propName) 
            throw new SqlJetError( "Undefined property name" );
        try{
            return Integer.valueOf(System.getProperty(propName, Integer.toString(defValue)));
        } catch(Throwable t){
            throw new SqlJetError( "Error while get int value for property " + propName, t );
        }
    }
    
}
