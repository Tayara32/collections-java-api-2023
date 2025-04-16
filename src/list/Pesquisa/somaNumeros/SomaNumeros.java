package list.Pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosLista.add(numero);
    }

    public int somarNumeros() {
        int soma = 0;
        for (int numero : numerosLista) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : numerosLista) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (int numero : numerosLista) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numerosLista.isEmpty()) {
          System.out.println(this.numerosLista);
        } else {
          System.out.println("A lista está vazia!");
        }
    }
    

    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();
    

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        
        somaNumeros.exibirNumeros();
        System.out.println("Soma dos números: " + somaNumeros.somarNumeros());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
