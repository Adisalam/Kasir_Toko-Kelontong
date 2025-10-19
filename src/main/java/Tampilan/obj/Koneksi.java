package tampilan.obj;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
     
    public static Connection Go(){
        try {
            MysqlDataSource M = new MysqlDataSource();
            M.setServerName("localhost"); 
            M.setDatabaseName("Toko_Kelontong");
            M.setUser("root");               
            M.setPassword(""); 
            M.setPort(3306); 
            M.setServerTimezone("Asia/Jakarta");
            Connection C = M.getConnection();
            return C;
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return null;        
    }
    
}
