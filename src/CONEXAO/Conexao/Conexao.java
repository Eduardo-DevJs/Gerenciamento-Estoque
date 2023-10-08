
package CONEXAO.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    private static final String DATABASE = "jdbc:mysql://localhost:3306/bd_hamburgueria";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";
    
    public static Connection createConnectionSQL() throws Exception{
        Connection connection = DriverManager.getConnection(DATABASE, USER, PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        Connection connection = createConnectionSQL();
       
        if(connection != null){
            JOptionPane.showMessageDialog(null, "Conexão obtida com sucesso!");
            connection.close();
        }
    }
}
