package org.tmatesoft.sqljet.core.table;

public class SqlJetTimeoutBusyHandler implements ISqlJetBusyHandler {
    
    private static final int[] delays = { 1, 2, 5, 10, 15, 20, 25, 25,  25,  50,  50, 100 };
    private static final int[] totals = { 0, 1, 3,  8, 18, 33, 53, 78, 103, 128, 178, 228 };

    private final int timeout;
    
    public SqlJetTimeoutBusyHandler(int timeout) {
        this.timeout = timeout;
    }

    public boolean call(int number) {
        int delay;
        int prior;
        if (number < delays.length) {
            delay = delays[number];
            prior = totals[number];
        } else {
            delay = delays[delays.length - 1];
            prior = totals[delays.length - 1] + delay*(number - (delays.length - 1));
        }
        if (prior + delay > timeout) {
            delay = timeout - prior;
            if (delay <= 0) {
                return false;
            }
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            //
        }
        return true;
    }

}
