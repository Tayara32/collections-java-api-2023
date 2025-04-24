package map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaEventos {

    private Map<LocalDate, List<Eventos>> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, Eventos evento) {
        List<Eventos> eventosDoDia = agendaEventosMap.get(data);

        if (eventosDoDia == null) {
            eventosDoDia = new ArrayList<>();
        }

        eventosDoDia.add(evento);
        agendaEventosMap.put(data, eventosDoDia);
    }






    
}
