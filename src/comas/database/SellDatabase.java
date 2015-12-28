package comas.database;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SellDatabase extends Database {

    /**
     * Insertion method for sell functionality of the GUI.
     *
     * @param productId
     * @param clientId
     * @param stock
     * @return
     */
    public boolean insertSell(final int productId, final int clientId, final int stock) {
        float productPrice = 0;
        int productStock = 0;

        connect();
        try {
            //select the id, price and stock from product for further modifications
            dbStatement = dbConnection.prepareStatement("SELECT SellingPrice,Stock FROM Products WHERE ProductId=?");
            dbStatement.setInt(1, productId);
            dataResults = dbStatement.executeQuery();

            // if it succeeded finding something, save to local variables
            if (dataResults.next()) {
                productPrice = dataResults.getFloat("SellingPrice");
                productStock = dataResults.getInt("Stock");
            } else {// if it didn't succeed, terminate this function and return false
                return false;
            }
            
            if( (productStock - stock) > 0)
            {
                // update the record for product, since someone bought a product, have to substract the stock counter.
                dbStatement = dbConnection.prepareStatement("UPDATE Products SET Stock=? WHERE ProductId=?");
                dbStatement.setInt(1, productStock - stock);
                dbStatement.setInt(2, productId);
                dbStatement.execute();
            }else if ( (productStock - stock) == 0)
            {
                dbStatement = dbConnection.prepareStatement("UPDATE Products SET Stock='0' WHERE ProductId=?");
                dbStatement.setInt(1, productId);
                dbStatement.execute();
            }
            else //negative
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκείς τεμάχια προς πώληση", "ΜΗ ΕΠΑΡΚΗΣ ΤΕΜΑΧΙΑ", JOptionPane.ERROR_MESSAGE);
                return false;
            }
                        
            // add new record on sell table
            dbStatement = dbConnection.prepareStatement("INSERT INTO Sells(SellId,ProductsId,ClientId,Stock,FinalPrice) VALUES (?,?,?,?,?)");
            dbStatement.setInt(1, 0);
            dbStatement.setInt(2, productId);
            dbStatement.setInt(3, clientId);
            dbStatement.setInt(4, stock);
            dbStatement.setFloat(5, productPrice * stock);
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
