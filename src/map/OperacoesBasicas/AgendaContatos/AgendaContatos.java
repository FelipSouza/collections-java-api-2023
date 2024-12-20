package map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe", 9999);
        agendaContatos.adicionarContato("Ana Beatriz", 5555);
        agendaContatos.adicionarContato("Késsia", 2222);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ana Beatriz");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Késsia"));
    }
}
