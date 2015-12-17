package comas.database;

import comas.base.Supplier;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SupplierDatabase extends Database {

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
        
    
    public boolean deleteSupplier(final int supplierTaxReg){
         connect();
        try{
            dbStatement = dbConnection.prepareStatement("DELETE FROM Suppliers WHERE SupplierId= ?");
            dbStatement.setInt(1,supplierTaxReg);
            dbStatement.executeUpdate();
            close();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        close();
        return false;
    }
}
