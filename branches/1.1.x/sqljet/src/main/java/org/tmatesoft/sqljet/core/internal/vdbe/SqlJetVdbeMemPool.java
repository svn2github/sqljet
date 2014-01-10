package org.tmatesoft.sqljet.core.internal.vdbe;

import java.util.LinkedList;
import java.util.Queue;

public class SqlJetVdbeMemPool {
    
    private static final int MAX_POOL_SIZE = 1024;
    
    private Queue<SqlJetVdbeMem> queue = new LinkedList<SqlJetVdbeMem>();
    public static int obtained = 0;
    public static int released = 0;
    public static int created = 0;
    
    public synchronized SqlJetVdbeMem obtain() {
        obtained++;
        if (!queue.isEmpty()) {
            return queue.remove();
        } else {
            created++;
            return new SqlJetVdbeMem(this);
        }
    }
    
    public synchronized void release(SqlJetVdbeMem mem) {
        released++;
        if (queue.size() < MAX_POOL_SIZE) {
            queue.add(mem);
        }
    }
    
    public String toString() {
        return "\ncreated: " + created + 
                "\n" + "obtained: " + obtained + 
                "\n" + "released: " + released +
                "\n" + "in pool:  " + queue.size();
    }
}
