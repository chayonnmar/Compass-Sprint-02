import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.createConnection();

        PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1,1);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println("A quantidade de linhas modificadas foram: " + linhasModificadas);
    }
}

