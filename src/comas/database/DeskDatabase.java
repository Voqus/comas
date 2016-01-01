package comas.database;

import java.sql.SQLException;

public class DeskDatabase extends Database{
    
    public int countRecords(final String QUERY){
        connect();
        try {
             dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next()) {
                return dataResults.getInt(1);
            } 
            close();
        }catch(SQLException e){
            e.printStackTrace();
        }   
        close();
        return 0;
    }
    
    public double sumMoney(final String QUERY){
        connect();
        try {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next()) {
                return dataResults.getDouble(1);
            } 
            close();
        }catch(SQLException e){
            e.printStackTrace();
        }   
        close();
 
        return 0.00; 
    }
    
    
}
