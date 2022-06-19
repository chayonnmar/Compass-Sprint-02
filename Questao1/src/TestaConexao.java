import java.sql.Connection;
import java.sql.SQLException;


public class TestaConexao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.createConnection();
        System.out.println("Fechando conexão");
        connection.close();
    }
}











