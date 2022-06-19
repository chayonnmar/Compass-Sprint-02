import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.createConnection();
        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricao, quantidade, preco) VALUES ('Iphone','Iphone 13 Pro Max Apple 256GB',1,9199.0)", Statement.RETURN_GENERATED_KEYS);
        stm.execute("INSERT INTO PRODUTO (nome, descricao, quantidade, preco) VALUES ('Cama','Cama Box Queen Size UmaFlex Itália',1,2199.0)", Statement.RETURN_GENERATED_KEYS);
        stm.execute("INSERT INTO PRODUTO (nome, descricao, quantidade, preco) VALUES ('Fogão','Fogão Brastemp 6 bocas',1,2139.0)", Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("O ID criado foi: " + id);
        }
        System.out.println("Fechando conexão");
        connection.close();
    }
}