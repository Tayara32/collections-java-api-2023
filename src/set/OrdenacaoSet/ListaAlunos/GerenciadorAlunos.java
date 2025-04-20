package set.OrdenacaoSet.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Alunos alunoARemover = null;
        for (Alunos aluno : alunosSet) {
            if (aluno.getMatricula() == matricula) {
                alunoARemover = aluno;
                break;
            }
        }
       alunosSet.remove(alunoARemover);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        //TreeSet ordena automaticamente os alunos pelo nome, pois implementa a interface Comparable
        Set<Alunos> alunosOrdenados = new TreeSet<>(alunosSet);
        return alunosOrdenados;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosOrdenados = new TreeSet<>(new ComparatorNota());
        alunosOrdenados.addAll(alunosSet);
        return alunosOrdenados;
    }

    public Set<Alunos> exibirAlunos(){
        return alunosSet;
    }

    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("João", 123456789L, 8.5);
        gerenciador.adicionarAluno("Maria", 987654321L, 9.0);
        gerenciador.adicionarAluno("Pedro", 456789123L, 7.5);
        gerenciador.adicionarAluno("Ana", 321654987L, 8.0);
        gerenciador.adicionarAluno("Lucas", 654321789L, 9.5);
        gerenciador.adicionarAluno("Fernanda", 789123456L, 8.2);
        gerenciador.adicionarAluno("Carlos", 159753456L, 7.8);
        gerenciador.adicionarAluno("Juliana", 753159852L, 9.1);


        System.out.println("Alunos ordenados por nome:");
        System.out.println(gerenciador.exibirAlunosPorNome());

        System.out.println("Alunos ordenados por nota:");
        System.out.println(gerenciador.exibirAlunosPorNota());

        System.out.println("Alunos cadastrados:");
        System.out.println(gerenciador.exibirAlunos());

        gerenciador.removerAluno(123456789L);
        System.out.println("Alunos após remoção:");
        System.out.println(gerenciador.exibirAlunos());

    }


}
