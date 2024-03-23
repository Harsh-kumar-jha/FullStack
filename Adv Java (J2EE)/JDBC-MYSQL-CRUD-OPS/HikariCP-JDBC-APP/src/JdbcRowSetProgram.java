import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetProgram {
  public static void main(String[] args) throws Exception {
    JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
      rowSet.setUrl("jdbc:mysql://localhost:3306/<DB>");
      rowSet.setUsername("");
      rowSet.setPassword("");
      rowSet.setCommand("select * from employee");
      rowSet.execute();
      
      while(rowSet.next()) {
        System.out.println(rowSet.getInt(1) + " " + rowSet.getString(2) + " " + rowSet.getString(3));
      }
      rowSet.close();

  }
}
