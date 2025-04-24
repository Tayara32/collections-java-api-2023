package map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!contatosMap.isEmpty()){
           contatosMap.remove(nome);
        }
        else{
            System.out.println("Agenda vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(contatosMap);
    }

    //Integer é o value da chave nome
    public Integer pesquisarPorNome(String nome){
        Integer pesquisaPorNome = null;
        if(!contatosMap.isEmpty()){
            pesquisaPorNome = contatosMap.get(nome);
        }
        else{
            System.out.println("Agenda vazia!");
            return null;
        }
        return pesquisaPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("João"));
        agenda.removerContato("Maria");
        agenda.exibirContatos();
    }


}
