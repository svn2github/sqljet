package org.tmatesoft.sqljet.issues._129;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tmatesoft.sqljet.core.SqlJetEncoding;
import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetOptions;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class RowCountExampleTest
{
  private static final Logger classLogger = Logger.getLogger(RowCountExampleTest.class.getName());
  private static final String GROUP_TABLE_NAME = "Group";
  private static final String CUSTOMER_TABLE_NAME = "Customer";
  private static final String GROUP_TABLE_DDL = "CREATE TABLE Group(ID INTEGER NOT NULL, lastUpdate DATE NOT NULL, statusCode TEXT, sequence INTEGER, enabled BOOLEAN NOT NULL, CONSTRAINT Group_pk PRIMARY KEY (ID))";
  private static final String CUSTOMER_TABLE_DDL = "CREATE TABLE Customer(ID INTEGER NOT NULL, Group INTEGER NOT NULL REFERENCES Group(ID) ON DELETE CASCADE ON UPDATE CASCADE, lastUpdate DATE NOT NULL, statusCode TEXT, email TEXT NOT NULL, customerCode TEXT NOT NULL, sequence INTEGER, enabled BOOLEAN NOT NULL, CONSTRAINT Customer_pk PRIMARY KEY (Group, ID))";
  private static final int SQLJET_PAGE_CACHE_SIZE = 4906;
  private static final int SQLJET_SCHEMA_VERSION = 1;
  private static final int SQLJET_USER_VERSION_COOKIE = 1;
  private SqlJetDb persistenceDb = null;

  @BeforeClass
  public static void setUpClass() throws Exception
  {
  }

  @AfterClass
  public static void tearDownClass() throws Exception
  {
  }

  @Before
  public void setUp() throws SqlJetException
  {
    persistenceDb = SqlJetDb.open(SqlJetDb.IN_MEMORY, true);
    persistenceDb.getOptions().setAutovacuum(true);
    persistenceDb.getOptions().setEncoding(SqlJetEncoding.UTF8);
    persistenceDb.beginTransaction(SqlJetTransactionMode.WRITE);
    try
    {
      ISqlJetOptions newOptions = persistenceDb.getOptions();
      newOptions.setUserVersion(SQLJET_USER_VERSION_COOKIE);
      newOptions.setSchemaVersion(SQLJET_SCHEMA_VERSION);
      newOptions.setCacheSize(SQLJET_PAGE_CACHE_SIZE);
      persistenceDb.createTable(GROUP_TABLE_DDL);
      persistenceDb.createTable(CUSTOMER_TABLE_DDL);
      classLogger.log(Level.CONFIG, "2 tables created in a new data file {0}.", new Object[] {SqlJetDb.IN_MEMORY, persistenceDb.getSchema().getTableNames()});
      ISqlJetTable groupTable = persistenceDb.getTable(GROUP_TABLE_NAME);
      ISqlJetTable customerTable = persistenceDb.getTable(CUSTOMER_TABLE_NAME);
      Date update = new Date();
      groupTable.insert(1, update.getTime(), "ACTIVE", 0, true);
      groupTable.insert(2, update.getTime(), "INACTIVE", 1, false);
      customerTable.insert(1, 1, update.getTime(), "SERVING", "nobody@example.com", "ENCOM1", 0, true);
      customerTable.insert(2, 1, update.getTime(), "SERVING", "nobody@example.com", "ENCOM2", 1, true);
      customerTable.insert(3, 1, update.getTime(), "SERVING", "nobody@example.com", "ENCOM3", 3, true);
      customerTable.insert(4, 1, update.getTime(), "SERVING", "nobody@example.com", "ENCOM4", 2, true);
    }
    finally
    {
      persistenceDb.commit();
    }
  }

  @After
  public void tearDown()
  {
  }

  @Test
  public void testRowCount() throws SqlJetException
  {
    // open all the tables here so we aren't opening tables repeatedly in the loops.
    persistenceDb.getTable(GROUP_TABLE_NAME);
    ISqlJetTable customerTable = persistenceDb.getTable(CUSTOMER_TABLE_NAME);
    // begin a read transaction before reading data (this is required by SqlJet).
    persistenceDb.beginTransaction(SqlJetTransactionMode.READ_ONLY);
    try
    {
      classLogger.log(Level.CONFIG, "Getting Group ID {0} to merge Customer ID {1}.", new Object[] {1, 1});
      ISqlJetCursor foundRow = customerTable.lookup(customerTable.getPrimaryKeyIndexName(), 1);
      if(foundRow != null && foundRow.first())
      {
        int rowCount = intFromLong(foundRow.getRowCount());
        classLogger.log(Level.CONFIG, "Reading {0} Customers.", rowCount);
      }
    }
    finally
    {
      persistenceDb.commit();
    }
  }

  @Test
  public void testDelete() throws SqlJetException
  {
    // open all the tables here so we aren't opening tables repeatedly in the loops.
    persistenceDb.getTable(GROUP_TABLE_NAME);
    ISqlJetTable customerTable = persistenceDb.getTable(CUSTOMER_TABLE_NAME);
    // begin a read transaction before reading data (this is required by SqlJet).
    persistenceDb.beginTransaction(SqlJetTransactionMode.WRITE);
    try
    {
      classLogger.log(Level.CONFIG, "Getting Group ID {0} to merge Customer ID {1}.", new Object[] {1, 1});
      ISqlJetCursor foundRow = customerTable.lookup(customerTable.getPrimaryKeyIndexName(), 1);
      if(foundRow != null && foundRow.first())
      {
        foundRow.delete();
      }
    }
    finally
    {
      persistenceDb.commit();
    }
  }

  /**
   * Very simple hack method to turn a long into an int without allocating
   * objects or calling complex functions.  It's horribly inaccurate once
   * the value starts to "wrap", but it avoids issues associated with a straight
   * cast, and it's almost as fast.
   * @param input a long that is expected to be between 0 and Integer.MAX_VALUE.
   * @return an int guaranteed to be between 0 and Integer.MAX_VALUE.
   */
  private static final int intFromLong(long input)
  {
    return input >= 0 ? (int)(input % Integer.MAX_VALUE) : 0;
  }

}
