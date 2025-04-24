package map.Ordenacao.AgendaEventos;

import java.util.List;

public class Eventos {

    private String nomeEvento;
    private List<String> nomeAtracao;

    public Eventos(String nomeEvento, List<String> nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public List<String> getNomeAtracao() {
        return nomeAtracao;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }

    @Override
    public String toString() {
        return "Eventos [nomeEvento=" + nomeEvento + ", nomeAtracao=" + nomeAtracao + "]";
    }
    

}