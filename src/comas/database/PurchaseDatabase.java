package comas.database;

import comas.base.Product;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PurchaseDatabase extends Database
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
            columns.addElement("Id αγοράς");
            columns.addElement("Id προϊόντος");
            columns.addElement("Όνομα προμηθευτή");
            columns.addElement("Επίθετο προμηθευτή");
            columns.addElement("Όνομα προϊόντος");
            columns.addElement("Τεμάχια");
            columns.addElement("Τιμή");

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
     * Insertion method for purchase functionality of the GUI.
     * @param product
     * @param supplierId
     * @return 
     */
    public boolean insertPurchase(Product product, final int supplierId)
    {
        int productId = 0;
        connect();
        try
        {            
            //add the new product on product table
            dbStatement = dbConnection.prepareStatement("INSERT INTO Products(ProductId, ProductName, ProductDescription, MeasurementUnit, Weight, Stock, PurchasePrice, SellingPrice)"
                    + " VALUES (?,?,?,?,?,?,?,?)");
            dbStatement.setInt(1, 0);
            dbStatement.setString(2, product.getProductName());
            dbStatement.setString(3, product.getProductDescription());
            dbStatement.setString(4, product.getMeasurementUnit());
            dbStatement.setFloat(5, product.getWeight());
            dbStatement.setInt(6, product.getStock());
            dbStatement.setFloat(7, product.getPurchasePrice());
            dbStatement.setFloat(8, product.getSellingPrice());
            dbStatement.execute();
            
            //get the id of product so i can associate the tables
            dbStatement = dbConnection.prepareStatement("SELECT ProductId FROM PRODUCTS WHERE ProductName=? AND ProductDescription=?");
            dbStatement.setString(1, product.getProductName());
            dbStatement.setString(2, product.getProductDescription());
            dataResults = dbStatement.executeQuery();
            
            //if succeeded, save it to a local variable
            if(dataResults.next())
            {
                productId = dataResults.getInt("ProductId");
            } // if
            else // if it didn't, terminate the program and return false
            {
                return false;
            } // else
            
            //add foreign keys to table
            dbStatement = dbConnection.prepareStatement("INSERT INTO SuppliersProducts (SuppliersProductsId, SupplierId, ProductId) VALUES(?,?,?)");
            dbStatement.setInt(1,0);
            dbStatement.setInt(2, supplierId);
            dbStatement.setInt(3, productId);
            dbStatement.execute();
            
            //add foreign keys to table
            dbStatement = dbConnection.prepareStatement("INSERT INTO Storage (StorageId, ProductId) VALUES(?,?)");
            dbStatement.setInt(1,0);
            dbStatement.setInt(2, productId);
            dbStatement.execute();
            
            //finally insert to purchase table the product
            dbStatement = dbConnection.prepareStatement("INSERT INTO Purchases (purchaseId, ProductId, SupplierId, Stock, FinalPrice) VALUES (?,?,?,?,?)");
            dbStatement.setInt(1,0);
            dbStatement.setInt(2, productId);
            dbStatement.setInt(3, supplierId);
            dbStatement.setInt(4, product.getStock());
            dbStatement.setFloat(5, (float)(product.getPurchasePrice() * product.getStock()));
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
    } // insertPurchase
}
