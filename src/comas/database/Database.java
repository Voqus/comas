package comas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Database class.
*/
public class Database {
    
    protected static final String dbPath = "jdbc:ucanaccess://C:\\Users\\gabri\\Desktop\\EManagementDatabase.accdb";
    protected Connection dbConnection;
    protected ResultSet dataResults;
    protected PreparedStatement dbStatement;

    /**
     * Connects with the database, returns true/false for success/fail.
     * @return
     */
    public boolean connect(){

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            dbConnection = DriverManager.getConnection(dbPath);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * Closes the database
     */
    public void close() {

        try {
            if (dbConnection != null) {
                dbConnection.close();
            } else if (dataResults != null) {
                dataResults.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
