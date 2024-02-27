import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBooks {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<table-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<db-password>";
  public static void main(String[] args) throws Exception{
    // step 1 : load Drivers
    Class.forName("com.mysql.cj.jdbc.Driver");

    // step 2 : connect database
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    System.out.println(con);

    // step 3 : Create the statement
    Statement st = con.createStatement();

    // step 4 : Execute Query
    String insertQueries = "Insert into Book value(101,'Python Book',200);";
    int rowsEffected = st.executeUpdate(insertQueries);

    // step 5 : Process Result
    System.out.println("Rows inserted in column " + rowsEffected);

    // step 6 : close connection
    con.close();
  }
}
