import java.sql.*;

/**
 * JdbcInsert1.java - Demonstrates how to INSERT data into an SQL
 *                    database using Java JDBC.
 */
class JdbcInsert1 {

    public static void main (String[] args) {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection conn = DriverManager.getConnection(url,"ftn","password");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO TESTJAVAUX " +
                    "VALUES (1, 'Simpson')");

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
} 