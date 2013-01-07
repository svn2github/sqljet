/**
 * DBBrowserUtil.java
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
package org.tmatesoft.sqljet.browser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class DBBrowserUtil {
    
    public static void browse(String url) {
        try {
            Class<?> clazz = DBBrowserUtil.class.getClassLoader().loadClass("java.awt.Desktop");
            if (clazz != null) {
                Method method = clazz.getMethod("getDesktop", new Class[0]);
                Method method2 = clazz.getMethod("browse", URI.class);
                if (method != null && method2 != null) {
                    Object desktop = method.invoke(null, new Object[0]);
                    if (desktop != null) {
                        method2.invoke(desktop, new URI(url));
                    }
                }
            }
        } catch (ClassNotFoundException e) {
        } catch (SecurityException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalArgumentException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        } catch (URISyntaxException e) {
        }
    }

}
