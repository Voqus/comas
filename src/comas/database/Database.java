package comas.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Database class.
 */
public class Database {

    private static final String dbPath = "jdbc:ucanaccess://" + new File("src/comas/res/EManagementDatabase.accdb").getAbsolutePath();
    protected Connection dbConnection;
    protected ResultSet dataResults;
    protected PreparedStatement dbStatement;

    /**
     * Connects with the database, returns true/false for success/fail.
     *
     * @return
     */
    public boolean connect() {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            dbConnection = DriverManager.getConnection(dbPath);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            //  Terminate program if database not found.
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
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
            }
            if (dbStatement != null) {
                dbStatement.close();
            }
            if (dataResults != null) {
                dataResults.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
