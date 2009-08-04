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

    private String filePath;
    private FileChannel fileChannel;

    public SqlJetFileLockManager(String filePath, FileChannel fileChannel) {
        this.filePath = filePath;
        this.fileChannel = fileChannel;
    }

    private static final Map<String, List<SqlJetFileLock>> locks = new HashMap<String, List<SqlJetFileLock>>();

    /**
     * @param fileChannel
     * @param position
     * @param size
     * @param shared
     * @return
     * @throws IOException
     */
    public synchronized FileLock tryLock(long position, long size, boolean shared) throws IOException {
        final SqlJetFileLock lock = getLock(position, size);
        if (lock != null) {
            lock.addLock();
            return lock;
        } else {
            return addLock(fileChannel.tryLock(position, size, shared));
        }
    }

    public synchronized FileLock lock(long position, long size, boolean shared) throws IOException {
        final SqlJetFileLock lock = getLock(position, size);
        if (lock != null) {
            lock.addLock();
            return lock;
        } else {
            return addLock(fileChannel.lock(position, size, shared));
        }
    }

    private SqlJetFileLock getLock(long position, long size) {
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
    private SqlJetFileLock addLock(FileLock lock) {
        if (lock != null) {
            final SqlJetFileLock l = new SqlJetFileLock(this, lock);
            if (!locks.containsKey(filePath)) {
                locks.put(filePath, new ArrayList<SqlJetFileLock>());
            }
            locks.get(filePath).add(l);
            return l;
        } else {
            return null;
        }
    }

    public synchronized void deleteLock(SqlJetFileLock lock) {
        if (locks.containsKey(filePath)) {
            final List<SqlJetFileLock> list = locks.get(filePath);
            list.remove(lock);
            if (list.size() == 0) {
                locks.remove(filePath);
            }
        }
    }
}
