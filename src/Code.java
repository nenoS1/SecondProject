import java.sql.*;
import java.util.Scanner;


public class Code{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Family name:");
            String text =s.next();
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ftn", "password");
            PreparedStatement pst = con.prepareStatement("insert into TESTJAVAUX(text) values(?)");


            pst.setString(1,text);

            int i = pst.executeUpdate();
            if(i!=0){
                System.out.println("added");
            }
            else{
                System.out.println("failed to add");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
