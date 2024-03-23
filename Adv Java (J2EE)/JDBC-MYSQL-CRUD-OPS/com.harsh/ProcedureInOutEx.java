import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureInOutEx {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  private static final String procedure = "call getBookNameByPrice(?,?)";

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Book Price :: ");
    double price = sc.nextDouble();
    Connection con =   DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
     CallableStatement cstmt = con.prepareCall(procedure);
     cstmt.setDouble(1, price);
     cstmt.registerOutParameter(2,Types.VARCHAR);
     ResultSet rs = cstmt.executeQuery();

     while(rs.next()){
      
      System.out.println(rs.getString(1));
      
     }

     sc.close();
     con.close();
  }
}
