package comas.database;

import comas.base.Supplier;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SupplierDatabase extends Database {

    /**
     * Executes select query in order to select a supplier from the database.
     * Returns the supplier object-record with data from database if it succeeded, or null if it failed following with JOptionPane error.
     * @param QUERY
     * @return 
     */
    public Supplier selectSupplier(final String QUERY){
        Supplier supplier = null;
        connect();
        try {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next()) {
                supplier = new Supplier(dataResults.getString("FirstName"),
                                        dataResults.getString("LastName"),
                                        dataResults.getString("Address"),
                                        dataResults.getString("City"),
                                        dataResults.getString("TelephoneA"),                
                                        dataResults.getString("TelephoneB"),
                                        dataResults.getString("PostalCode"),
                                        dataResults.getString("TaxRegister"));
            } else {
                JOptionPane.showMessageDialog(null, "No result found.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }

        close();
        return supplier;
    }
    
    /**
     * Executes insert query in order to insert a new supplier in the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplier
     * @return 
     */
    public boolean insertSupplier(Supplier supplier) {
        connect();
        try {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
        close();
        return false;
    }
    /**
     * Executes update query in order to update an already existing supplier in the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplier
     * @param supplierId
     * @return 
     */
    public boolean updateSupplier(Supplier supplier, final int supplierId){
        connect();
        try {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
        close();
        return false;
    }
        
    /**
     * Executes delete query in order to delete a supplier from the database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param supplierTaxReg
     * @return 
     */
    public boolean deleteSupplier(final int supplierTaxReg){
        connect();
        try{
            dbStatement = dbConnection.prepareStatement("DELETE FROM Suppliers WHERE SupplierId= ?");
            dbStatement.setInt(1,supplierTaxReg);
            dbStatement.executeUpdate();
            close();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
        close();
        return false;
    }
}
