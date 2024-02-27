import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class WorkingWithPreparedStatements {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the book id");
    int bookId = sc.nextInt();
    System.out.println("Enter the book name");
    String bookName = sc.next();
    System.out.println("Enter the book price");
    double bookPrice = sc.nextDouble();

    //Class.forName("com.mysql.cj.jdbc.Driver");
    Connection  con = DriverManager.getConnection(DB_URL, DB_UNAME , DB_PWD);
    String insertSqlQuery = "Insert into Book value(?,?,?)";
    PreparedStatement pstmt= con.prepareStatement(insertSqlQuery);
    pstmt.setInt(1, bookId);
    pstmt.setString(2, bookName);
    pstmt.setDouble(3, bookPrice);

    int count = pstmt.executeUpdate();
    System.out.println("Rows Effected :: "+count);
    con.close();
    sc.close();

  }
}
