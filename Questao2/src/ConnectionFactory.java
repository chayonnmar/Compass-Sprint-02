import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Nome do usuário do banco de dados.
    private static final String USERNAME = "root";
    // Senha do usuário do banco de dados.
    private static final String PASSWORD = "oceano08";
    //Caminho do banco de dados, porta e database.
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/catalogo_de_filmes?useTimezone=true&serverTimezone=UTC";

    // Criando a conexão com o banco.

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        // Classe é carregada pela JVM.
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Recuperar conexão com o banco de dados.
        Connection connection = createConnection();

        // Testar se a conexão é nula.
        if(connection != null){
            System.out.println("Conexão estabelecida com sucesso");
            connection.close();
        }
    }
}
