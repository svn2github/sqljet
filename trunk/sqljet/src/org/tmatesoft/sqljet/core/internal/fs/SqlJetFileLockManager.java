/**
 * SqlJetFileLockManager.java
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
package org.tmatesoft.sqljet.core.internal.fs;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetFileLockManager {

    private SqlJetFileLockManager() {
    }

    private static Map<String, List<SqlJetFileLock>> locks = new HashMap<String, List<SqlJetFileLock>>();

    /**
     * @param fileChannel
     * @param position
     * @param size
     * @param shared
     * @return
     * @throws IOException
     */
    public static synchronized FileLock tryLock(String filePath, FileChannel fileChannel, long position, long size,
            boolean shared) throws IOException {
        final SqlJetFileLock lock = getLock(filePath, position, size);
        if (lock != null) {
            lock.addLock();
            return lock;
        } else {
            return addLock(filePath, fileChannel.tryLock(position, size, shared));
        }
    }

    public static synchronized FileLock lock(String filePath, FileChannel fileChannel, long position, long size,
            boolean shared) throws IOException {
        final SqlJetFileLock lock = getLock(filePath, position, size);
        if (lock != null) {
            lock.addLock();
            return lock;
        } else {
            return addLock(filePath, fileChannel.lock(position, size, shared));
        }
    }

    private static SqlJetFileLock getLock(String filePath, long position, long size) {
        if (locks.containsKey(filePath)) {
            for (SqlJetFileLock fl : locks.get(filePath)) {
                if (fl.overlaps(position, size)) {
                    return fl;
                }
            }
        }
        return null;
    }

    /**
     * @param lock
     * @return
     */
    private static SqlJetFileLock addLock(String filePath, FileLock lock) {
        if (lock != null) {
            final SqlJetFileLock l = new SqlJetFileLock(filePath, lock);
            if (!locks.containsKey(filePath)) {
                locks.put(filePath, new ArrayList<SqlJetFileLock>());
            }
            locks.get(filePath).add(l);
            return l;
        } else {
            return null;
        }
    }

    public static synchronized void deleteLock(String filePath, SqlJetFileLock lock) {
        if (locks.containsKey(filePath)) {
            final List<SqlJetFileLock> list = locks.get(filePath);
            list.remove(lock);
            if (list.size() == 0) {
                locks.remove(filePath);
            }
        }
    }
}
