package set.OrdenacaoSet.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;
    
    public Produtos(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public long getCod() {
        return cod;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override   
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produtos produto)) return false;
        return getCod() == produto.getCod();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    
    }
    @Override
    public int compareTo(Produtos produto) {
        return this.nome.compareToIgnoreCase(produto.getNome());
    }
}

class ComparatorPreco implements Comparator<Produtos> {
    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}   
