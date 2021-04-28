package model;

public class Filmes {
    private int idTipoFilme;
    private String nome;

    public Filmes() {
    }

    public idTipoFilme(String nome) {
        this.nome = nome;
    }

    public int getIdTipoFilme() {
        return idTipoFilme;
    }

    public void setIdTipoFilme(int idTipoProduto) {
        this.idTipoFilme = idTipoFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoFilme{" +
                "idTipoFilme=" + idTipoFilme +
                ", nome='" + nome + '\'' +
                '}';
    }
}