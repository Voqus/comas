package comas.database;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SellDatabase extends Database
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
            columns.addElement("Id πώλησης");
            columns.addElement("Id προϊόντος");
            columns.addElement("Όνομα πελάτη");
            columns.addElement("Επίθετο πελάτη");
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
    } //selectTable
    
    /**
     * Insertion method for sell functionality of the GUI.
     *
     * @param productId
     * @param clientId
     * @param stock
     * @return
     */
    public boolean insertSell(final int productId, final int clientId, final int stock)
    {
        float productPrice = 0;
        int productStock = 0;

        connect();
        try
        {
            //select the id, price and stock from product for further modifications
            dbStatement = dbConnection.prepareStatement("SELECT SellingPrice,Stock FROM Products WHERE ProductId=?");
            dbStatement.setInt(1, productId);
            dataResults = dbStatement.executeQuery();

            // if it succeeded finding something, save to local variables
            if (dataResults.next())
            {
                productPrice = dataResults.getFloat("SellingPrice");
                productStock = dataResults.getInt("Stock");
            } // if
            else
            {// if it didn't succeed, terminate this function and return false
                return false;
            } // else
            
            if( (productStock - stock) > 0)
            {
                // update the record for product, since someone bought a product, have to substract the stock counter.
                dbStatement = dbConnection.prepareStatement("UPDATE Products SET Stock=? WHERE ProductId=?");
                dbStatement.setInt(1, productStock - stock);
                dbStatement.setInt(2, productId);
                dbStatement.execute();
            } // if
            else if ( (productStock - stock) == 0)
            {
                dbStatement = dbConnection.prepareStatement("UPDATE Products SET Stock='0' WHERE ProductId=?");
                dbStatement.setInt(1, productId);
                dbStatement.execute();
            } // else if
            else //negative
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκείς τεμάχια προς πώληση", "ΜΗ ΕΠΑΡΚΗΣ ΤΕΜΑΧΙΑ", JOptionPane.ERROR_MESSAGE);
                return false;
            } // else
                        
            // add new record on sell table
            dbStatement = dbConnection.prepareStatement("INSERT INTO Sells(SellId,ProductId,ClientId,Stock,FinalPrice) VALUES (?,?,?,?,?)");
            dbStatement.setInt(1, 0);
            dbStatement.setInt(2, productId);
            dbStatement.setInt(3, clientId);
            dbStatement.setInt(4, stock);
            dbStatement.setFloat(5, productPrice * stock);
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
    } // insertSell
}
