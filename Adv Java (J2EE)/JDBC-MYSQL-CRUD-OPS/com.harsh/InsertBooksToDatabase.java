import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBooksToDatabase {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection(DB_URL, DB_UNAME , DB_PWD);
     String insertSqlQuery = "Insert into Book value(?,?,?)";
     PreparedStatement psmt = con.prepareStatement(insertSqlQuery);
     psmt.setInt(1, 104);
     psmt.setString(2, "AWS");
     psmt.setDouble(3, 3500.00);

     int count = psmt.executeUpdate();

     System.out.println("Rows Effected :: "+count);
     
     
     con.close();
  }
}
