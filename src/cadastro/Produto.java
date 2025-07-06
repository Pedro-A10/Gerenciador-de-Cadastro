package cadastro;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String perecivel;

    public Produto() {
    }

    public Produto(String name, double preco, int quantidade, String perecivel) {
        this.nome = name;
        this.preco = preco;
        this.quantidade = quantidade;
        this.perecivel = perecivel;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(String perecivel) {
        this.perecivel = perecivel;
    }

    @Override
    public String toString() {
        return nome + ", " + preco + "$, quantidade:" + quantidade + ", perecível: " + perecivel;
    }
}
