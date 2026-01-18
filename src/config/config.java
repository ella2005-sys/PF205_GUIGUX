
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {


    private static Connection conn;

    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:housemasters.db");
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection error: " + e);
        }
        return conn;
    }
}

    
    
 
