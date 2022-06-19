public class Films {

    private int id;
    private String nome;
    private String descricao;
    private Integer ano_lancamento;

    public int getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public Integer getAno_Lancamento() {

        return ano_lancamento;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public void setAno_Lancamento(Integer anoLancamento) {

        this.ano_lancamento = ano_lancamento;
    }
}
