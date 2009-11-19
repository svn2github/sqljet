package org.tmatesoft.sqljet.core.table;

import org.tmatesoft.sqljet.core.internal.ISqlJetBusyHandler;
import org.tmatesoft.sqljet.core.internal.SqlJetUtility;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public class SqlJetDefaultBusyHandler implements ISqlJetBusyHandler {

    public static final String SQLJET_BUSY_RETRIES_PROPERTY = "SQLJET_BUSY_RETRIES";
    public static final String SQLJET_BUSY_SLEEP_PROPERTY = "SQLJET_BUSY_SLEEP";
    private static final int DEFAULT_RETRIES = 10;
    private static final int DEFAULT_SLEEP = 100;

    private int retries;
    private int sleep;
    private boolean cancel = false;

    public SqlJetDefaultBusyHandler() {
        retries = SqlJetUtility.getIntSysProp(SQLJET_BUSY_RETRIES_PROPERTY, DEFAULT_RETRIES);
        sleep = SqlJetUtility.getIntSysProp(SQLJET_BUSY_SLEEP_PROPERTY, DEFAULT_SLEEP);
    }

    public SqlJetDefaultBusyHandler(final int retries, final int sleep) {
        if (retries > 0) {
            this.retries = retries;
        } else {
            this.retries = SqlJetUtility.getIntSysProp(SQLJET_BUSY_RETRIES_PROPERTY, DEFAULT_RETRIES);
        }
        if (sleep > 0) {
            this.sleep = sleep;
        } else {
            this.sleep = SqlJetUtility.getIntSysProp(SQLJET_BUSY_SLEEP_PROPERTY, DEFAULT_SLEEP);
        }
    }

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

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public boolean call(int number) {
        if (cancel) {
            cancel = false;
            return false;
        } else if (number > retries) {
            return false;
        } else {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                return false;
            }
            return true;
        }
    }

}