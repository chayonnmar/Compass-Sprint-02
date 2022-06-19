import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaAtualizacao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.createConnection();
        Statement stm = connection.createStatement();
        String sql = ("UPDATE produto SET descricao = Iphone 11 Apple, quantidade=3, preco=3899 WHERE ID=1");
    }
}
