package org.tmatesoft.sqljet.core.internal.db;

import org.tmatesoft.sqljet.core.internal.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 *
 */
public class SqlJetDefautBusyHandler implements ISqlJetBusyHandler {
    
    private int retries = SqlJetUtility.getIntSysProp("SQLJET_BUSY_RETRIES", 1000);
    private int sleep = SqlJetUtility.getIntSysProp("SQLJET_BUSY_SLEEP", 10);

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public boolean call(int number) {
        if (number > retries) {
            return false;
        } else {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
            }
            return true;
        }
    }

}