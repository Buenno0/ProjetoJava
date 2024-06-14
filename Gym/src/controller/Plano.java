package controller;

public class Plano {
    private int idPlano;
    private String nome;
    private double preco;
    private String descricao;
    public int getIdPlano() {
        return idPlano;
    }
    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
