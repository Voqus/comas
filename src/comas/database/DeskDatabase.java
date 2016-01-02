package comas.database;

import java.sql.SQLException;

public class DeskDatabase extends Database
{
    
    /**
     * Returns the count of records that exist within the database based on the <i>QUERY</i>.
     * @param QUERY
     * @return 
     */
    public int countRecords(final String QUERY)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next())
            {
                return dataResults.getInt(1);
            } // if
            close();
        } // try
        catch(SQLException e)
        {
            e.printStackTrace();
        } // catch
        close();
        return 0;
    } // countRecords
    
    /**
     * Returns the amount of money resulted based on the <i>QUERY</i>.
     * @param QUERY
     * @return 
     */
    public double sumMoney(final String QUERY)
    {
        connect();
        try
        {
            dbStatement = dbConnection.prepareStatement(QUERY);
            dataResults = dbStatement.executeQuery();
            if (dataResults.next())
            {
                return dataResults.getDouble(1);
            } // if
            close();
        } // try
        catch(SQLException e)
        {
            e.printStackTrace();
        } // catch
        close();
 
        return 0.00; 
    } // sumMoney  
}
