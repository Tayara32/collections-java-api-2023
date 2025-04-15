package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefasRemovidas = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemovidas.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasRemovidas);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();
       
        System.out.println(" O número total de elementos tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios de programação");

        System.out.println(" O número total de elementos tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Estudar Java");
        System.out.println(" O número total de elementos tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();



    }


   
}
