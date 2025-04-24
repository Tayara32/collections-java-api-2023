package map.Pesquisa.EstoqueProdutosPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(estoqueProdutosMap.isEmpty()){
            System.out.println("Estoque vazio!");
            return 0;
        }
        for (Produtos produto : estoqueProdutosMap.values()) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }
    
    public Produtos obterProdutoMaisCaro(){
        double maiorPreco = Double.MIN_VALUE;
        Produtos produtoMaisCaro = null;
        for (Produtos produto : estoqueProdutosMap.values()) {
            if(produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato(){
        double menorPreco = Double.MAX_VALUE;
        Produtos produtoMaisBarato = null;
        for (Produtos produto : estoqueProdutosMap.values()) {
            if(produto.getPreco() < menorPreco){
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }



    public static void main(String[] args) {
        
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2, "Produto B", 20, 3.0);
        estoque.adicionarProduto(3, "Produto C", 15, 7.0);
        
        estoque.exibirProduto();
        
        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
        
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
    }

}
