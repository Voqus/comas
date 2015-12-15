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
}
