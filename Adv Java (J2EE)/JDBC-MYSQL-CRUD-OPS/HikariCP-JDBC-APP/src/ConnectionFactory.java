import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionFactory {
  private static DataSource ds = null;
  static {
    try {
      File f = new File("DB.properties");
      FileInputStream fis = new FileInputStream(f);

      Properties p = new Properties();
      p.load(fis);

      String url = p.getProperty("url");
      String user = p.getProperty("user");
      String password = p.getProperty("password");
      String poolSize = p.getProperty("db.poolSize");
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(url);
      config.setUsername(user);
      config.setPassword(password);
      config.setMaximumPoolSize(Integer.parseInt(poolSize));

       ds = new HikariDataSource(config);
      
    }catch(Exception e) {
      e.printStackTrace();
    } 
  }

  public static Connection getDBConnection() throws Exception {
    return ds.getConnection();
  }
}
