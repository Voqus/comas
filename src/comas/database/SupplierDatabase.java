package comas.database;

import comas.base.Supplier;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SupplierDatabase extends Database
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
            columns.addElement("Id προμηθευτή");
            columns.addElement("Όνομα");
            columns.addElement("Επίθετο");
            columns.addElement("Τηλέφωνο Α");
            columns.addElement("Τηλέφωνο Β");
            columns.addElement("Διεύθυνση");
            columns.addElement("Πόλη");
            columns.addElement("Ταχ. Κώδικας");
            columns.addElement("Α.Φ.Μ");

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
    
    /**
     * Executes select query in order to select a supplier from the database.
     * Returns the supplier object-record with data from database if it succeeded, or null if it failed following with JOptionPane error.
     * @param QUERY
     * @return 
     */
    public Supplier selectSupplier(final String QUERY){
        Supplier supplier = null;
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next())
            {
                supplier = new Supplier(dataResults.getString("FirstName"),
                                        dataResults.getString("LastName"),
                                        dataResults.getString("Address"),
                                        dataResults.getString("City"),
                                        dataResults.getString("TelephoneA"),                
                                        dataResults.getString("TelephoneB"),
                                        dataResults.getString("PostalCode"),
                                        dataResults.getString("TaxRegister"));
            } // if
            else
            {
                JOptionPane.showMessageDialog(null, "No result found.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } // else
            close();
        } // try
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } // catch

        close();
        return supplier;
    } // selectSupplier
    
    /**
     * Executes insert query in order to insert a new supplier in the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplier
     * @return 
     */
    public boolean insertSupplier(Supplier supplier)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement("INSERT INTO Suppliers (SupplierId,FirstName,LastName,TelephoneA,TelephoneB,Address,City,PostalCode,TaxRegister) VALUES (?,?,?,?,?,?,?,?,?)");
            dbStatement.setInt(1, 0);
            dbStatement.setString(2, supplier.getFirstName());
            dbStatement.setString(3, supplier.getLastName());
            dbStatement.setString(4, supplier.getTelephoneA());
            dbStatement.setString(5, supplier.getTelephoneB());
            dbStatement.setString(6, supplier.getAddress());
            dbStatement.setString(7, supplier.getCity());
            dbStatement.setString(8, supplier.getPostalCode());
            dbStatement.setString(9, supplier.getTaxRegister());
            dbStatement.execute();
            close();
            return true;
        } // try
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } // catch
        close();
        return false;
    } // insertSupplier
    
    /**
     * Executes update query in order to update an already existing supplier in the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplier
     * @param supplierId
     * @return 
     */
    public boolean updateSupplier(Supplier supplier, final int supplierId)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement("UPDATE Suppliers SET "
                                                      + "FirstName = ?, LastName=?,TelephoneA=?,TelephoneB=?,"
                                                      + "Address = ?, City = ?, PostalCode = ? ,TaxRegister = ? WHERE SupplierId = ?");
            dbStatement.setString(1, supplier.getFirstName());
            dbStatement.setString(2, supplier.getLastName());
            dbStatement.setString(3, supplier.getTelephoneA());
            dbStatement.setString(4, supplier.getTelephoneB());
            dbStatement.setString(5, supplier.getAddress());
            dbStatement.setString(6, supplier.getCity());
            dbStatement.setString(7, supplier.getPostalCode());
            dbStatement.setString(8, supplier.getTaxRegister());
            dbStatement.setInt(9, supplierId);
            dbStatement.executeUpdate();
            close();
            return true;
        } // try
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } // catch
        close();
        return false;
    } // updateSupplier
        
    /**
     * Executes delete query in order to delete a supplier from the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplierTaxReg
     * @return 
     */
    public boolean deleteSupplier(final int supplierTaxReg)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement("DELETE FROM Suppliers WHERE SupplierId= ?");
            dbStatement.setInt(1,supplierTaxReg);
            dbStatement.executeUpdate();
            close();
            return true;
        } // try
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        } // catch
        close();
        return false;
    } // deleteSupplier
}
