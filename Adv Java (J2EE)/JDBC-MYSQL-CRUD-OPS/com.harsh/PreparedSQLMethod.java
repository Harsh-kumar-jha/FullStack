import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class PreparedSQLMethod {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  private static final String procedure = "call getBooksData();";

  public static void main(String[] args) throws Exception{
    Connection con =  DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
     CallableStatement cstmt= con.prepareCall(procedure);
     ResultSet rs = cstmt.executeQuery();

     while(rs.next()){
      System.out.println(rs.getInt(1) + " --- " + rs.getString(2) + " --- " + rs.getDouble(3));
     }

    con.close();
  }
}
