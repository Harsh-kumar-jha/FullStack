import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectBooks {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args)throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    // Statement stmt = con.createStatement();
    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

    String selectSqlQuery = "Select * from Book";
     ResultSet rs = stmt.executeQuery(selectSqlQuery);

    rs.absolute(2);
    rs.updateDouble(3,1500);
    rs.updateRow();
       int recordNumber = rs.getInt("Book_id");
       String name = rs.getString("Book_name");
       double price = rs.getDouble("Book_price");

       System.out.println(recordNumber + " ---- " + name + " ---- " + price);

       rs.previous();

        recordNumber = rs.getInt("Book_id");
        name = rs.getString("Book_name");
        price = rs.getDouble("Book_price");

       System.out.println(recordNumber + " ---- " + name + " ---- " + price);
     
    //  System.out.println(rs);
     con.close();
  }
}
