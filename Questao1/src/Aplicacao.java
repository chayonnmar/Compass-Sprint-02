import java.sql.*;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Essa aplicação oferece 4 opções.");
        System.out.println("0: finalizar a aplicação");
        System.out.println("1: cadastrar 3 produtos.");
        System.out.println("2: atualizar o primeiro produto cadastrado.");
        System.out.println("3: excluir o segundo produto cadastrado");
        System.out.println("Digite sua opção.");
        int escolhaOpção = entrada.nextInt();

        switch (escolhaOpção) {
            case 0:
                break;
            case 1:
                ConnectionFactory factory = new ConnectionFactory();
                Connection connection = factory.createConnection();
                Statement stm = connection.createStatement();
                stm.execute("INSERT INTO PRODUTOS (nome, descricao, quantidade, preco) VALUES ('Iphone','Iphone 13 Pro Max Apple 256GB',1,9199.0)", Statement.RETURN_GENERATED_KEYS );
                stm.execute("INSERT INTO PRODUTOS (nome, descricao, quantidade, preco) VALUES ('Cama','Cama Box Queen Size UmaFlex Itália',1,2199.0)", Statement.RETURN_GENERATED_KEYS);
                stm.execute("INSERT INTO PRODUTOS (nome, descricao, quantidade, preco) VALUES ('Fogão','Fogão Brastemp 6 bocas',1,2139.0)", Statement.RETURN_GENERATED_KEYS);
                System.out.println("Foi realizada a opção 1.");
                connection.close();
                break;
            case 2:
                ConnectionFactory factory1 = new ConnectionFactory();
                Connection connection1 = factory1.createConnection();
                PreparedStatement stm1 = connection1.prepareStatement("UPDATE produtos SET descricao = 'Iphone 11 Apple 64GB', quantidade=3, preco=3899.0 WHERE ID = ?");
                stm1.setInt(1, 1);
                stm1.execute();
                System.out.println("Foi realizada a opção 2.");
                connection1.close();
                break;
            case 3:
                ConnectionFactory factory2 = new ConnectionFactory();
                Connection connection2 = factory2.createConnection();
                PreparedStatement stm2 = connection2.prepareStatement("DELETE FROM PRODUTOS WHERE ID = ?");
                stm2.setInt(1,2);
                stm2.execute();
                System.out.println("Foi realizada a opção 3.");
                connection2.close();
                break;
            default:
                System.out.println("Número digitado inválido");
                break;
        }
    }
}
