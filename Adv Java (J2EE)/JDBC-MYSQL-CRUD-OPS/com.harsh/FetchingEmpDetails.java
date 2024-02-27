import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchingEmpDetails {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/<database-name>";
  private static final String DB_UNAME = "<user-name>";
  private static final String DB_PWD = "<pwd>";
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Work Location");
    String workLocation = sc.next();
    System.out.println("Enter the Employee Department");
    String empDept = sc.next();
    System.out.println("Enter the Employee Gender");
    char empGender = sc.next().charAt(0);

    StringBuilder selectSqlQuery = new StringBuilder("Select * from EmpTable");
    if(workLocation != null && !workLocation.isEmpty()){
      selectSqlQuery.append(" where Work_location = ?");
    }
    if(empDept != null && !empDept.isEmpty()){
      if(workLocation != null && !workLocation.isEmpty()){
        selectSqlQuery.append(" and Emp_dept = ?");
      }else{
        selectSqlQuery.append(" where Emp_dept = ?");
      }
    }
    if(empGender == 'M' || empGender == 'F'){
      if(workLocation != null && !workLocation.isEmpty() || empDept != null && !empDept.isEmpty()){
        selectSqlQuery.append(" and Emp_gender = ?");
      }else{
        selectSqlQuery.append(" where Emp_gender = ?");
      }
  }
    String sql = selectSqlQuery.toString();
    // System.out.println(sql);
    Connection con= DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
    PreparedStatement pstmt= con.prepareStatement(sql);  
    if(workLocation != null && !workLocation.isEmpty()){
      pstmt.setString(1, workLocation);
    }
    if(empDept != null && !empDept.isEmpty()){
      if(workLocation != null && !workLocation.isEmpty()){
        pstmt.setString(2, empDept);
      }else{
        pstmt.setString(1, empDept);
      }
    }
    if(empGender == 'M' || empGender == 'F'){
      if(workLocation != null && !workLocation.isEmpty() || empDept != null && !empDept.isEmpty()){
        pstmt.setString(3, String.valueOf(empGender));
      }else{
        pstmt.setString(1, String.valueOf(empGender));
      }
    }
    ResultSet rs= pstmt.executeQuery();
    while(rs.next()){
      System.out.println("Emp Id :: "+rs.getInt(1));
      System.out.println("Emp Name :: "+rs.getString(2));
      System.out.println("Emp Salary :: "+rs.getDouble(3));
      System.out.println("Emp Department :: "+rs.getString(4));
      System.out.println("Emp Gender :: "+rs.getString(5));
      System.out.println("Emp Work Location :: "+rs.getString(6));
      System.out.println("************************************");
    }
    con.close();
    sc.close();
  }
}
