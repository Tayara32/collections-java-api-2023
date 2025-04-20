package list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    

    private List<Integer> numerosLista;

    public OrdenacaoNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosLista.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(this.numerosLista);

        if (!numerosLista.isEmpty()) {
            Collections.sort(listaOrdenada);
            return listaOrdenada;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public  List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenada = new ArrayList<>(numerosLista);

        if (!numerosLista.isEmpty()) {
            Collections.sort(listaOrdenada, Collections.reverseOrder());
            return listaOrdenada;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public void exibirNumeros() {
        if (!numerosLista.isEmpty()) {
          System.out.println(this.numerosLista);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    public static void main(String[] args) {
            
            OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
            ordenacao.adicionarNumero(5);
            ordenacao.adicionarNumero(2);
            ordenacao.adicionarNumero(8);
            ordenacao.adicionarNumero(1);
            ordenacao.adicionarNumero(4);

            ordenacao.exibirNumeros();

            System.out.println(ordenacao.ordenarAscendente());
            System.out.println(ordenacao.ordenarDescendente());


    }
}
