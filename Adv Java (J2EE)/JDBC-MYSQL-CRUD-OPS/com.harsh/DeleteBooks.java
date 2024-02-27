import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteBooks {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<table-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<db-password>";
  public static void main(String[] args)throws Exception {
    // Load Drive 
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Connect Database 
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    
    // Create Statement 
    Statement st = con.createStatement();

    // Execute SQL Query 
    String deleteSQL = "Delete from Book where Book_id=101;";
    int rowsEffected = st.executeUpdate(deleteSQL);

    // show process 
    System.out.println("Rows Effected are :: "+rowsEffected);

    // close connection 
    con.close();
  }
}
