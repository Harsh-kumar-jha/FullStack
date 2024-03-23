import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOpsEx {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception {
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    Statement stmt = con.createStatement();

    stmt.addBatch("Insert into Book values(106,'AI',2000.00)");
    stmt.addBatch("Insert into Book values(107,'DS',3000.00)");
    stmt.addBatch("Insert into Book values(108,'DE',4000.00)");

    int [] arr = stmt.executeBatch();

    for(int i = 0; i<arr.length ; i++){
      System.out.println(arr[i]);
    }

    con.close();
  }
}
