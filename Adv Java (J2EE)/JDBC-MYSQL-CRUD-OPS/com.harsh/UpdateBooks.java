import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateBooks {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<table-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<db-password>";
  public static void main(String[] args) throws Exception{
    // step 1 : load Mysql Driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // step 2 : Establish Database Connection
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

    // step 3 : create Statement 
    Statement st = con.createStatement();

    // step 4 : Execute Query 
    String updateRecordQuery = "Update Book set Book_name = 'Django + RestAPI' where Book_id = 1;";
    int rowsEffected = st.executeUpdate(updateRecordQuery);

    // step 5 : Print the number of rows Effected 
    System.out.println("No of Rows effected :: "+rowsEffected);

    // step 6 : close Connection 
    con.close();
  }
}
