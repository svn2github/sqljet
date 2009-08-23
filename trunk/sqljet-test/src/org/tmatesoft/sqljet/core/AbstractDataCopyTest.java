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
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;

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
    public static File copyFile(File from, boolean deleteCopy) throws IOException, FileNotFoundException {
        return copyFile(from, File.createTempFile("copy", null), deleteCopy);
    }

    public static File copyFile(File from, File to, boolean deleteCopy) throws IOException, FileNotFoundException {
        if (deleteCopy) {
            to.deleteOnExit();
        }
        return copyFile(from, to);
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static File copyFile(File from, File to) throws IOException, FileNotFoundException {
        RandomAccessFile in = new RandomAccessFile(from, "r");
        RandomAccessFile out = new RandomAccessFile(to, "rw");
        byte[] b = new byte[4096];
        for (int i = in.read(b); i > 0; i = in.read(b))
            out.write(b, 0, i);
        in.close();
        out.close();
        return to;
    }

    public static boolean compareFiles(File f1, File f2) throws Exception {
        RandomAccessFile i1 = new RandomAccessFile(f1, "r");
        try {
            RandomAccessFile i2 = new RandomAccessFile(f2, "r");
            try {
                final MappedByteBuffer m1 = i1.getChannel().map(MapMode.READ_ONLY, 0, i1.length());
                final MappedByteBuffer m2 = i2.getChannel().map(MapMode.READ_ONLY, 0, i2.length());
                while (m1.hasRemaining() && m2.hasRemaining()) {
                    final byte b1 = m1.get();
                    final byte b2 = m2.get();
                    if (b1 != b2)
                        return false;

                }
                if (m1.hasRemaining() || m2.hasRemaining())
                    return false;
            } finally {
                i2.close();
            }
        } finally {
            i1.close();
        }
        return true;
    }

}
