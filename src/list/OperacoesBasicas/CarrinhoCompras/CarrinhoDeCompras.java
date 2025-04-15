package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public List<Item> getItensList() {
        return itensList;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for(Item item: itensList){
            if(item.getNome().equals(nome)){
                itensRemovidos.add(item);
            }
        }
        itensList.removeAll(itensRemovidos);
    }

    public double cacularValorTotal(){
        double valorTotal = 0.0;
        for(Item item: itensList){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println("Itens no carrinho:");
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        System.out.println("Quantidade de itens no carrinho: " + carrinho.getItensList().size());
        
        carrinho.adicionarItem("Produto 1", 10.0, 2);
        carrinho.adicionarItem("Produto 2", 20.0, 1);
        carrinho.adicionarItem("Produto 3", 5.0, 5);
        
        carrinho.exibirItens();
        
        System.out.println("Valor total: " + carrinho.cacularValorTotal());
        
        carrinho.removerItem("Produto 2");
        
        carrinho.exibirItens();
        
        System.out.println("Valor total: " + carrinho.cacularValorTotal());
    }


}
