/**
 * AbstractDataCopyTest.java
 * Copyright (C) 2009-2010 TMate Software Ltd
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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

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
    public File copyFile(File from, boolean deleteCopy) throws IOException, FileNotFoundException {
        return copyFile(from, File.createTempFile(this.getClass().getSimpleName(), null), deleteCopy);
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
        try {
            FileChannel fromCh = in.getChannel();
            FileChannel toCh = out.getChannel();
            long size = fromCh.size();
            long toCopy = size;
            while (toCopy > 0) {
                toCopy -= toCh.transferFrom(fromCh, size - toCopy, toCopy);
            }
        } finally {
            try {
                in.close();
            } catch (IOException e) {
            }
            try {
                out.close();
            } catch (IOException e) {
            }
        }
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

    public static void deflate(File archive, String entryName, File to, boolean deleteCopy) throws IOException {
        ZipInputStream zis = null;
        InputStream is = null;

        byte[] buffer = new byte[16 * 1024];

        ZipFile zipFile = null;
        try {
            is = new BufferedInputStream(new FileInputStream(archive));
            zipFile = new ZipFile(archive);
            zis = new ZipInputStream(is);
            while (true) {
                ZipEntry entry = zis.getNextEntry();
                if (entry == null) {
                    break;
                }
                if (entry.isDirectory() || !entryName.equals(entry.getName())) {
                    zis.closeEntry();
                    continue;
                }
                InputStream fis = null;
                OutputStream fos = null;
                try {
                    fis = new BufferedInputStream(zipFile.getInputStream(entry));
                    fos = new BufferedOutputStream(new FileOutputStream(to));
                    while (true) {
                        int r = fis.read(buffer);
                        if (r < 0) {
                            break;
                        } else if (r == 0) {
                            continue;
                        }
                        fos.write(buffer, 0, r);
                    }
                } finally {
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                        }
                    }
                }
                if (deleteCopy) {
                    to.deleteOnExit();
                }
                zis.closeEntry();
                break;
            }
        } finally {
            if (zis != null) {
                try {
                    zis.close();
                } catch (IOException e) {
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e) {
                }
            }
        }
    }

}
