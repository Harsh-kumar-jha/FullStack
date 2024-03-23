import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class WorkingWithCallableStatement {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  private static final String procedure = "call getBookById(?)";

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Book Id to get :: ");
    int id = sc.nextInt();
    Connection con =   DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
     CallableStatement cstmt = con.prepareCall(procedure);
     cstmt.setInt(1, id);

     ResultSet rs = cstmt.executeQuery();

     while(rs.next()){
      System.out.println(rs.getInt(1));
      System.out.println(rs.getString(2));
      System.out.println(rs.getDouble(3));
     }
    
     con.close();
     sc.close();

  }
}
