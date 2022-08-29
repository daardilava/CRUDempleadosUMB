package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author diego
 */
public class Conexion {
    
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/empresa","root","123456");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
