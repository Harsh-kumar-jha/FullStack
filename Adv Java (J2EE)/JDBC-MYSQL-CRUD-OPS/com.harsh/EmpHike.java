import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmpHike {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Hike :: ");
    double hike = sc.nextDouble();
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    String updateSal = "Update EmpTable set Emp_salary = Emp_salary + (Emp_salary * ?)/100;";
    PreparedStatement pstmt = con.prepareStatement(updateSal);
    pstmt.setDouble(1, hike);
    pstmt.executeUpdate();
     System.out.println("Updatetion Completed ... " );

     sc.close();
     con.close();
  }
}
