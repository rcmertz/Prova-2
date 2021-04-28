package model;

public class Cinema {

    private int idSala;
    private String nome;
    private double preco;


    public Cinema() {}

    public Cinema(String nome, double preco, idSala tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.idSala = tipoProduto;
    }

    public int getIdProduto() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public idSala getCinema() {
        return Cinema;
    }

    public void setCinema(idSala idSala) {
        this.idSala = idSala;
    }

    @Override
    public String toString() {
        return "idSala{" +
                "idSala=" + idSala +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}