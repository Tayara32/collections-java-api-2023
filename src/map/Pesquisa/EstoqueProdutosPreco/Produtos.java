package map.Pesquisa.EstoqueProdutosPreco;

public class Produtos {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "Produtos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
