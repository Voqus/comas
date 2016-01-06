package comas.database;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * Database class.
 */
public class StorageDatabase extends Database
{
    
     /**
     * Loads the table with data then returns the tablemodel.
     * @param Query
     * @return TableModel
     */
    public TableModel selectTable(final String Query)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement(Query);
            dataResults = dbStatement.executeQuery();
            int columnNumber = dataResults.getMetaData().getColumnCount();

            Vector columns = new Vector();
            columns.addElement("Id αποθήκης");
            columns.addElement("Id προϊόντος");
            columns.addElement("Α.Φ.Μ Προμηθευτή");
            columns.addElement("Όνομα προϊόντος");
            columns.addElement("Περιγραφή προϊόντος");
            columns.addElement("Μονάδα Μέτρησης");
            columns.addElement("Βάρος");
            columns.addElement("Τεμάχια");
            columns.addElement("Τιμή πώλησης");

            Vector rows = new Vector();
            while (dataResults.next())
            {
                Vector newRow = new Vector();
                for (int i = 1; i <= columnNumber; i++)
                {
                    newRow.addElement(dataResults.getString(i));
                } // for
                rows.addElement(newRow);
            } // while

            close();
            return new DefaultTableModel(rows, columns)
            {
                @Override
                public boolean isCellEditable(int row, int column)
                {
                    return false;
                } // isCellEditable
            }; // return
        } // try
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } // catch
        close();
        return null;
    } // selectTable
}
