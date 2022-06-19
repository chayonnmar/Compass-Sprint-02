import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Paginacao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.createConnection();
        Statement stm = connection.createStatement();

        System.out.println("Usuário, quantos filmes você deseja filtrar?");
        int numFilmes= entrada1.nextInt();
        System.out.println("Usuário, qual página você quer acessar?");
        int pagina= entrada2.nextInt();

        String sql = "SELECT * FROM filmes LIMIT " +  numFilmes + " OFFSET " + (pagina - 1) * numFilmes;
        stm.execute(sql);

    }
}
