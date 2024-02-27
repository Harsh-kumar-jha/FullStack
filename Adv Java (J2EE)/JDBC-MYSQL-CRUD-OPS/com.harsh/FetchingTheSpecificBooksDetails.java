import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class FetchingTheSpecificBooksDetails  {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Price of Book");
    double bookPrice = sc.nextDouble();

   Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    StringBuilder selectSqlQuery = new StringBuilder("Select * from Book");
    if(bookPrice > 0){
      selectSqlQuery.append(" where Book_price >= ?");
    }
    String sql = selectSqlQuery.toString();
    PreparedStatement pstmt = con.prepareStatement(sql);
    if(bookPrice > 0){
      pstmt.setDouble(1, bookPrice);
    }

    ResultSet rs = pstmt.executeQuery();
    while(rs.next()){
      System.out.println("Book Id :: "+rs.getInt(1));
      System.out.println("Book Name :: "+rs.getString(2));
      System.out.println("Book Price :: "+rs.getDouble(3));
      System.out.println("************************************");
    }
    con.close();
    sc.close();
  }
}