package set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
          if (palavrasSet.contains(palavra)) {
            palavrasSet.remove(palavra);
          } else {
            System.out.println("Palavra não encontrada no conjunto!");
          }
        } else {
          System.out.println("O conjunto está vazio!");
        }
      }

    public void verificarPalavra(String palavra){
        if (palavrasSet.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" está no conjunto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não está no conjunto.");
        }
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasSet.isEmpty()) {
          System.out.println(palavrasSet);
        } else {
          System.out.println("O conjunto está vazio!");
        }
      }
    

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("maçã");
        conjunto.adicionarPalavra("banana");
        conjunto.adicionarPalavra("laranja");
        
        System.out.println("Total de palavras únicas: " + conjunto.palavrasSet.size());
        
        conjunto.exibirPalavrasUnicas();
        
        conjunto.verificarPalavra("banana");
        
        conjunto.removerPalavra("banana");
        
        System.out.println("Total de palavras únicas após remoção: " + conjunto.palavrasSet.size());
        
        conjunto.exibirPalavrasUnicas();
    }
}
