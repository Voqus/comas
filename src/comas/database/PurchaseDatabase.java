package comas.database;

import comas.base.Product;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PurchaseDatabase extends Database {
    
    /**
     * Insertion method for purchase functionality of the GUI.
     * @param product
     * @param supplierId
     * @return 
     */
    public boolean insertPurchase(Product product, final int supplierId) {
        int productId = 0;
        //TODO: validation check if supplierId actually exists.
        connect();
        try {
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
            }
            else // if it didn't, terminate the program and return false
            {
                return false;
            }
            
            //add foreign keys to table
            dbStatement = dbConnection.prepareStatement("INSERT INTO SuppliersProducts (SuppliersProductsId, SuppliersId, ProductsId) VALUES(?,?,?)");
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
            dbStatement = dbConnection.prepareStatement("INSERT INTO Purchases (purchaseId, ProductsId, SupplierId, Stock, FinalPrice) VALUES (?,?,?,?,?)");
            dbStatement.setInt(1,0);
            dbStatement.setInt(2, productId);
            dbStatement.setInt(3, supplierId);
            dbStatement.setInt(4, product.getStock());
            dbStatement.setFloat(5, (float)(product.getPurchasePrice() * product.getStock()));
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
}
