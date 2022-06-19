import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmsDAO {

    // Aqui será feito o CRUD.
    public static void saveFilms(Films filmes) throws SQLException {

        String sql = "INSERT INTO FILMES (nome, descricao, ano_lancamento) VALUES (?, ?, ?)";
        Connection connection = null;
        PreparedStatement pstm = null;

        try {
            // Cria uma conexão com o banco de dados.
            connection = ConnectionFactory.createConnection();

            // Cria uma PreparedStatemnt para executar uma query.
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, filmes.getNome());
            pstm.setString(2, filmes.getDescricao());
            pstm.setInt(3, filmes.getAno_Lancamento());

            // Executa a PreparedStatement.
            pstm.execute();
            System.out.println("Filme registrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();

                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Films> getFilms() {

        String sql = "SELECT * FROM filmes";
        List<Films> listaDeFilmes = new ArrayList<Films>();
        Connection connection = null;
        PreparedStatement pstm = null;

        // Recupera os dados do banco de dados.
        ResultSet rst = null;

        try{
            connection = ConnectionFactory.createConnection();
            pstm = connection.prepareStatement(sql);
            rst = pstm.executeQuery();

            while(rst.next()){
                Films filmes = new Films();
                filmes.setId(rst.getInt("id"));
                filmes.setNome(rst.getString("nome"));
                filmes.setDescricao(rst.getString("descricao"));
                filmes.setAno_Lancamento(rst.getInt("ano_lancamento"));

                listaDeFilmes.add(filmes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if(rst != null){
                    rst.close();
                }if(pstm != null){
                    pstm.close();
                }if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaDeFilmes;
    }

}
