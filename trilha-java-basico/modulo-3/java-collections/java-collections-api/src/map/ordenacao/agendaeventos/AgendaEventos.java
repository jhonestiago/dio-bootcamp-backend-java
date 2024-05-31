package map.ordenacao.agendaeventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<LocalDate, Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        this.eventos.put(data, evento);
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<LocalDate, Evento>(this.eventos);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<LocalDate, Evento>(this.eventos);
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data:" + entry.getKey());
                break;
            }
        }
    }
}
