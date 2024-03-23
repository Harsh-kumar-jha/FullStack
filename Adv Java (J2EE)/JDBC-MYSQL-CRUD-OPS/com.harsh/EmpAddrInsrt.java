import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpAddrInsrt {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  private static final String EMP_INSERT = "INSERT INTO EMP VALUES(?,?,?)";
  private static final String EMP_ADDR_INSERT = "INSERT INTO EMP_ADDRESS VALUES(?,?,?,?)";
  public static void main(String[] args)throws Exception {

    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    con.setAutoCommit(false);
    try{
    PreparedStatement pstmt = con.prepareStatement(EMP_INSERT);
    pstmt.setInt(1, 101);
    pstmt.setString(2, "Joe");
    pstmt.setDouble(3, 1000.00);

    pstmt.addBatch();

    pstmt = con.prepareStatement(EMP_ADDR_INSERT);
    pstmt.setString(1, "Hyd");
    pstmt.setString(2, "TG");
    pstmt.setString(3, "India");
    pstmt.setInt(4, 101);

    pstmt.addBatch();

    int []arr = pstmt.executeBatch();
    con.commit();

    }catch(Exception e){
      con.rollback();
    }
    
    con.close();
  }
}