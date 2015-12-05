package comas.database;

import comas.base.Client;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClientDatabase extends Database {

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
            e.printStackTrace();
        }
        close();
        return null;
    }
    
    // Executes Insert Query in order to insert new client on database
    // returns true or false for success or fail message for JOptionPane.
    public boolean insertClient(Client client){
         connect();
         try{
             dbStatement = dbConnection.prepareStatement("INSERT INTO Clients (clientId,BusinessName,FirstName,LastName,TelephoneA,TelephoneB,Fax,Address,City,PostalCode,TaxRegister,ProfessionCode,Profession) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                dbStatement.setInt(1, 0);
                dbStatement.setString(2, client.getBusinessName());
                dbStatement.setString(3, client.getFirstName());
                dbStatement.setString(4, client.getLastName());
                dbStatement.setString(5, client.getTelephoneA());
                dbStatement.setString(6, client.getTelephoneB());
                dbStatement.setString(7, client.getFax());
                dbStatement.setString(8, client.getAddress());
                dbStatement.setString(9, client.getCity());
                dbStatement.setString(10, client.getPostalCode());
                dbStatement.setString(11, client.getTaxRegister());
                dbStatement.setString(12, client.getProfessionCode());
                dbStatement.setString(13, client.getProfession());
             dbStatement.execute();
             close();
             return true;
         }catch(SQLException e){
             e.printStackTrace();
         }
         close();
        return false;
    }
    
    
    
}
