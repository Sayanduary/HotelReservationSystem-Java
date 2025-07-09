import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseUtil {
     private static final String PROPERTIES_FILE = "db.properties";

     /**
      * Establishes and returns a database connection
      * @return Connection object
      * @throws SQLException if database connection fails
      * @throws IOException if properties file cannot be read
      * @throws ClassNotFoundException if JDBC driver is not found
      */
     public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException {
          // Load MySQL JDBC driver
          Class.forName("com.mysql.cj.jdbc.Driver");

          // Load database properties
          Properties props = new Properties();
          try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
               props.load(fis);

               String url = props.getProperty("db.url");
               String username = props.getProperty("db.username");
               String password = props.getProperty("db.password");

               // Validate properties
               if (url == null || username == null || password == null) {
                    throw new IllegalArgumentException("Database properties are incomplete");
               }

               return DriverManager.getConnection(url, username, password);
          }
     }

     /**
      * Test database connection
      * @return true if connection is successful, false otherwise
      */
     public static boolean testConnection() {
          try (Connection connection = getConnection()) {
               return connection != null && !connection.isClosed();
          } catch (Exception e) {
               System.err.println("Connection test failed: " + e.getMessage());
               return false;
          }
     }
}