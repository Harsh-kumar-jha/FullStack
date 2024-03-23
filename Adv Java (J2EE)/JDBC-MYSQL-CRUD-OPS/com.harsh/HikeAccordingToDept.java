import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class HikeAccordingToDept {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";

  public static void main(String[] args) throws Exception{
    Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of dept :: ");
    String dept = sc.nextLine();
    double hike = 2.00;

    if(dept == "Security") hike = 7.00;
    else if(dept == "Admin") hike = 10.00;
    else hike = 5.00;

    String updateQuery = "Update EmpTable set Emp_salary = Emp_salary + (Emp_salary * ?)/100 where Emp_dept = ?;";
    PreparedStatement pstmt = con.prepareStatement(updateQuery);
    pstmt.setDouble(1, hike);
    pstmt.setString(2, dept);
    pstmt.executeUpdate();

    System.out.println("Updation is completed :::::");



    sc.close();
    con.close(); 

  }
}
