
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
  private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";  
  private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";  
  private static final String USERNAME = "JAVA2021"; 
  private static final String PASSWORD = "1616";  
  
  public Connection conn_method()
  {
      Connection connection = null;
      try{
          Class.forName(DRIVER);
          connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
              if(connection != null){
                  System.out.println("Connected");
              } else{
                  System.out.println(" Not Connected");
              }
      } catch(Exception e){
                System.out.println(e);
      }
      return connection;
  }
  public static void main(String []args){
      DataBase obj = new DataBase();
       System.out.println(obj.conn_method());

  }
}
