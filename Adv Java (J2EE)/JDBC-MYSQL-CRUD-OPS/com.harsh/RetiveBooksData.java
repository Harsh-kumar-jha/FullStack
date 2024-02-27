import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class RetiveBooksData {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    Statement stmt = con.createStatement();
    String SelectQuery = "Select * from Book";
    ResultSet rs = stmt.executeQuery(SelectQuery);
    ResultSetMetaData metaData = rs.getMetaData();
    System.out.println("Column Counts : "+ metaData.getColumnCount());
    for(int i =1 ; i<=metaData.getColumnCount(); i++){
      System.out.println(metaData.getColumnName(i));
    }

    while(rs.next()){
      int recordNumber = rs.getInt("Book_id");
      String recordName = rs.getString("Book_name");
      double recordPrice = rs.getDouble("Book_price");

      System.out.println(recordName + " --- " + recordNumber + " --- " + recordPrice);
    }
    con.close();
  }
}
