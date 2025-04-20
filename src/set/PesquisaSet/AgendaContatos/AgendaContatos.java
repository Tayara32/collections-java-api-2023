package set.PesquisaSet.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        if(!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;

        for(Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
               contato.setTelefone(novoNumero);
               contatoAtualizado = contato;
               break;
            }
           
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Maria Joana", 987654311);
        agenda.adicionarContato("Pedro", 456789123);
        
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();
        
        System.out.println("\nPesquisando contatos :");
        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("Maria");
        System.out.println(contatosEncontrados);
        
        System.out.println("\nAtualizando número do contato 'Maria' para 111222333:");
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Maria", 111222333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
        
        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContatos();
    }
    
}
