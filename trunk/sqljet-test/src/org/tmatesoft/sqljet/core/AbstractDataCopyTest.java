/**
 * AbstractDataCopyTest.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public abstract class AbstractDataCopyTest extends SqlJetAbstractLoggedTest {

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    protected File copyFile(File from, boolean deleteCopy) throws IOException, FileNotFoundException {
        File to = File.createTempFile("copy", null);
        if (deleteCopy)
            to.deleteOnExit();
        RandomAccessFile in = new RandomAccessFile(from, "r");
        RandomAccessFile out = new RandomAccessFile(to, "rw");
        byte[] b = new byte[4096];
        for (int i = in.read(b); i > 0; i = in.read(b))
            out.write(b, 0, i);
        in.close();
        out.close();
        return to;
    }

}
