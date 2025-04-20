package set.OrdenacaoSet.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    
    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return "Alunos [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());

    
    }
    @Override
    public int compareTo(Alunos aluno) {
        return this.nome.compareToIgnoreCase(aluno.getNome());
    }


}

class ComparatorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
