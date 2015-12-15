package comas.database;

import comas.base.Client;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClientDatabase extends Database {

    /**
     * Builds the table with data then returns the tablemodel.
     * @param Query
     * @return TableModel
     */
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

    /**
     * Executes insert query in order to insert a new client on database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param client
     * @return boolean
     */
    public boolean insertClient(Client client) {
        connect();
        try {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return false;
    }

    /**
     * Executes update query in order to update an already existing client on database.
     * Returns true if succeeded or false following with JOptionPane error.
     * @param client
     * @param clientId
     * @return boolean
     */
    public boolean updateClient(Client client, final int clientId) {
        connect();
        try {
            dbStatement = dbConnection.prepareStatement("UPDATE Clients SET "
                    + "BusinessName=? , FirstName=? , LastName=? , TelephoneA=? , TelephoneB=? , "
                    + "Fax=? , Address=? , City=? , PostalCode=? , TaxRegister=? , ProfessionCode=? , Profession=? WHERE ClientId=?");
            dbStatement.setString(1, client.getBusinessName());
            dbStatement.setString(2, client.getFirstName());
            dbStatement.setString(3, client.getLastName());
            dbStatement.setString(4, client.getTelephoneA());
            dbStatement.setString(5, client.getTelephoneB());
            dbStatement.setString(6, client.getFax());
            dbStatement.setString(7, client.getAddress());
            dbStatement.setString(8, client.getCity());
            dbStatement.setString(9, client.getPostalCode());
            dbStatement.setString(10, client.getTaxRegister());
            dbStatement.setString(11, client.getProfessionCode());
            dbStatement.setString(12, client.getProfession());
            dbStatement.setInt(13, clientId);
            dbStatement.executeUpdate();
            close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return false;
    }

    /**
     * Executes select query in order to select a client from the database.
     * Returns the client object-record with data from database if it succeeded, or null if it failed following with JOptionPane error.
     * @param QUERY
     * @return 
     */
    public Client selectClient(final String QUERY) {
        Client client = null;
        connect();
        try {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next()) {
                client = new Client(dataResults.getString("BusinessName"),
                        dataResults.getString("FirstName"),
                        dataResults.getString("LastName"),
                        dataResults.getString("Profession"),
                        dataResults.getString("Address"),
                        dataResults.getString("City"),
                        dataResults.getString("TelephoneA"),
                        dataResults.getString("TelephoneB"),
                        dataResults.getString("Fax"),
                        dataResults.getString("PostalCode"),
                        dataResults.getString("TaxRegister"),
                        dataResults.getString("ProfessionCode"));
            } else {
                JOptionPane.showMessageDialog(null, "No result found.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        close();
        return client;
    }

}
