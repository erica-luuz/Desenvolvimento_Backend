package models;

public class Produto {
    private int codigoDeBarras;
    private String nome;
    private boolean preco;

    public Produto() {
    }

    public Produto(int codigoDeBarras, String nome, boolean preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPreco() {
        return preco;
    }

    public void setPreco(boolean preco) {
        this.preco = preco;
    }
}
