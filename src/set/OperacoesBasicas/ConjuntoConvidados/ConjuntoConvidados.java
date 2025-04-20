package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
   private Set<Convidado> convidadosSet;

   public ConjuntoConvidados() {
       this.convidadosSet = new HashSet<>();
   }

   public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
   }

   public void removerConvidadoPorCodigoConvite(int codigoConvite){
        //convidadosSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);

        Convidado convidadoARemover = null;
        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoARemover = convidado;
                break;
            }
        }
     
        convidadosSet.remove(convidadoARemover);
   }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
       System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("João", 1234);
        conjunto.adicionarConvidado("Maria", 1234);
        conjunto.adicionarConvidado("Pedro", 3412);
        
        System.out.println("Total de convidados: " + conjunto.contarConvidados());
        
        conjunto.exibirConvidados();
        
        //conjunto.removerConvidadoPorCodigoConvite(2341);
        
        //System.out.println("Total de convidados após remoção: " + conjunto.contarConvidados());
        
        //conjunto.exibirConvidados();
    }


}
