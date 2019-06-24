import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ScannerSQL {
    public static void main(String[] args) throws SQLException {
        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Actor name:");
        String catName = s.nextLine();
        Connection conn = null;
        PreparedStatement stmt = null;
        try{ conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ftn","password");
            String sql="insert into TESTJAVAUX(text) values(?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, catName);
            stmt.execute(); }
        catch (SQLException se)
        { System.out.println(se.getMessage()); }
        finally { conn.close(); }
    }
}
