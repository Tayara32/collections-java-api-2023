package list.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas  {
    
    private List<Pessoa> pessoasLista;

    public OrdenacaoPessoas() {
        this.pessoasLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoasLista);
        //Forma de chamar o Comparable
        Collections.sort(listaOrdenada);
        return listaOrdenada;

    }  

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoasLista);
        //forma de chamar o comparator
        Collections.sort(listaOrdenada, new ComparatorPorAltura());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("João", 25, 1.75);
        ordenacao.adicionarPessoa("Maria", 30, 1.65);
        ordenacao.adicionarPessoa("Pedro", 20, 1.80);
        
        System.out.println("Lista ordenada por idade:");
        System.out.println(ordenacao.ordernarPorIdade());
        
        System.out.println("\nLista ordenada por altura:");
        System.out.println(ordenacao.ordernarPorAltura());
    }
    
}

//Comparator precisa de uma nova classe para ser implementada, pois não pode ser uma classe interna
// e não pode ser uma classe anônima, pois não pode ter construtor padrão
class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
