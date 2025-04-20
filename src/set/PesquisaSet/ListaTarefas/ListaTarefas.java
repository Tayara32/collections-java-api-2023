package set.PesquisaSet.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaARemover = tarefa;
                break;
            }
        }
        tarefasSet.remove(tarefaARemover);
    }

    public void exibirTarefas(){
        if(!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
                tarefaConcluida = tarefa;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
                tarefaPendente = tarefa;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Limpar a casa");
        
        System.out.println("Total de tarefas: " + lista.contarTarefas());
        
        lista.exibirTarefas();
        
        lista.marcarTarefaConcluida("Estudar Java");
        
        System.out.println("Tarefas concluídas: " + lista.obterTarefasConcluidas());
        
        System.out.println("Tarefas pendentes: " + lista.obterTarefasPendentes());
        
        lista.removerTarefa("Fazer compras");
        
        System.out.println("Total de tarefas após remoção: " + lista.contarTarefas());
        
        lista.exibirTarefas();
        lista.limparListaTarefas();
        System.out.println("Total de tarefas após limpeza: " + lista.contarTarefas());
    }








}
