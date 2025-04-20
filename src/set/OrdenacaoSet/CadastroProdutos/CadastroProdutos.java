package set.OrdenacaoSet.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(nome, cod, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome(){
        //TreeSet ordena automaticamente os produtos pelo nome, pois implementa a interface Comparable
        Set<Produtos> produtosOrdenados = new TreeSet<>(produtosSet);
        return produtosOrdenados;

    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosOrdenados = new TreeSet<>(new ComparatorPreco());
        produtosOrdenados.addAll(produtosSet);
        return produtosOrdenados;
    }

    public static void main(String[] args) {
        
       
        CadastroProdutos cadastro = new CadastroProdutos();
        
        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 20.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 15.0, 8);
        
        System.out.println(cadastro.exibirProdutosPorNome());
        
        System.out.println(cadastro.exibirProdutosPorPreco());
      
    }



}
