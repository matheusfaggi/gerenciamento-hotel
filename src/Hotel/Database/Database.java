/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author matheusfaggi
 */
public class Database {
    public static String database, user, password, host;
    public static int port = 3306;
    private static Connection connection;  
    
    static {
        database = "gerenciamento_hotel";
        user = "root";
        password = "Faggi@123";
        host = "localhost";        
    }
    
    public static Connection getConnection(){
        return connection;
    }
    
    public static void open() throws SQLException{
        String url = "jdbc:mysql://" + host +
                     ":" + port + "/" + database;
        
        connection = DriverManager.getConnection(url, user, password);
    }
    
    public static void close() throws SQLException{
        connection.close();
    }
}
