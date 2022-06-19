import java.sql.SQLException;

public class SaveFilms {
    public static void main(String[] args) throws SQLException {

        FilmsDAO filmesDAO = new FilmsDAO();
        Films filme = new Films();

        // Aqui só ir alterando o nome, descricao e ano de lançamento dos filmes para registrar os 20.
        // Outra alternativa seria repetir o código as 20x e executar o método main apenas uma vez.
        // Ou também cadastrar via MySQL ou via linha de comando.

        filme.setNome("Pulp Fiction: Tempo de Violência");
        filme.setDescricao("Drama");
        filme.setAno_Lancamento(1995);
        FilmsDAO.saveFilms(filme);


        // Vizualizar os registros do banco.

        //Essa listagem não está funcionando
        //for(Films f : FilmsDAO.getFilms()){
           //System.out.println("Filmes: " + f.getAno_Lancamento());
        //}
    }
}
