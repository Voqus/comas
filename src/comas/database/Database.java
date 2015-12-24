package comas.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * Database class.
 */
public class Database {

    private static final String dbPath = "jdbc:ucanaccess://" + new File("src/comas/res/EManagementDatabase2.accdb").getAbsolutePath();
    protected Connection dbConnection;
    protected ResultSet dataResults;
    protected PreparedStatement dbStatement;

    /**
     * Connects with the database, returns true/false for success/fail.
     *
     * @return
     */
    protected boolean connect() {

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
    protected void close() {

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
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
     /**
     * Loads the table with data then returns the tablemodel.
     * @param Query
     * @return TableModel
     */
    public TableModel selectTable(final String Query) {
        connect();
        try {
            dbStatement = dbConnection.prepareStatement(Query);
            dataResults = dbStatement.executeQuery();
            int columnNumber = dataResults.getMetaData().getColumnCount();

            Vector columns = new Vector();
            for (int i = 1; i <= columnNumber; i++) {
                columns.addElement(dataResults.getMetaData().getColumnName(i));
            }

            Vector rows = new Vector();
            while (dataResults.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= columnNumber; i++) {
                    newRow.addElement(dataResults.getString(i));
                }
                rows.addElement(newRow);
            }

            close();
            return new DefaultTableModel(rows, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
        close();
        return null;
    }
}
