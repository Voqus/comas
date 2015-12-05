package comas.database;

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
    public boolean insertClient(String BusinessName,
                                String FirstName,
                                String LastName,
                                String TelephoneA,
                                String TelephoneB,
                                String Fax,
                                String Address,
                                String City,
                                String PostalCode,
                                String TaxRegister,
                                String ProfessionCode,
                                String Profession){
         connect();
         try{
             dbStatement = dbConnection.prepareStatement("INSERT INTO Clients (clientId,BusinessName,FirstName,LastName,TelephoneA,TelephoneB,Fax,Address,City,PostalCode,TaxRegister,ProfessionCode,Profession) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                dbStatement.setInt(1, 0);
                dbStatement.setString(2, BusinessName);
                dbStatement.setString(3, FirstName);
                dbStatement.setString(4, LastName);
                dbStatement.setString(5, TelephoneA);
                dbStatement.setString(6, TelephoneB);
                dbStatement.setString(7, Fax);
                dbStatement.setString(8, Address);
                dbStatement.setString(9, City);
                dbStatement.setString(10, PostalCode);
                dbStatement.setString(11, TaxRegister);
                dbStatement.setString(12, ProfessionCode);
                dbStatement.setString(13, Profession);
             dbStatement.execute();
             return true;
         }catch(SQLException e){
             e.printStackTrace();
         }
         close();
        return false;
    }
    
    
    
}
