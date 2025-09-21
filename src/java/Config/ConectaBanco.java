package Config;
import java.sql.*;

public class ConectaBanco {
    // método para abrir uma conecção
    public static Connection conectar() throws ClassNotFoundException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes?useSSL=false&serverTimezone=UTC"
,"root","");
        }catch(SQLException ex){
            System.out.println("Erro - SQL: " + ex);
        }
        return conn;
    }
}