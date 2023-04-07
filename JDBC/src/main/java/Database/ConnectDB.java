package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection ConnectDB(){
        Connection con=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;database=DaoTaoDB;"
                    +"encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String user="sa";
            String password="12345678";
           con=DriverManager.getConnection(connectionUrl,user,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
          return con;
    }
    public static void DisconnectDB(Connection con){
        try {
            if(con!=null){
                con.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
