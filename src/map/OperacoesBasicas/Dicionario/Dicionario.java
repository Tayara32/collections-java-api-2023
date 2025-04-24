package map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
           dicionarioMap.remove(palavra);
        }
        else{
            System.out.println("Dicionário vazio!");
        }
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }
        else{
            System.out.println("Dicionário vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisaPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }
        else{
            System.out.println("Dicionário vazio!");
            return null;
        }
        return pesquisaPorPalavra;
    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Python", "Linguagem de programação de alto nível.");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Java"));
        dicionario.removerPalavra("Python");
        dicionario.exibirPalavras();
    }





}
