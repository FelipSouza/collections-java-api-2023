package map.OperacoesBasicas.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/
        //eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaEvento = entry.getValue();
                proximaData = entry.getKey();
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data" + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.AUGUST, 5), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2005, Month.JANUARY, 18), "Evento 4", "Atração 4");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


    }
}
