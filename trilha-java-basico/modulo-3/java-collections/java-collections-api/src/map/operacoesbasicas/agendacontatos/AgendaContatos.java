package map.operacoesbasicas.agendacontatos;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!(this.agendaContatos.isEmpty())) {
            this.agendaContatos.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!(this.agendaContatos.isEmpty())) {
            numeroPorNome = this.agendaContatos.get(nome);
        }
        return numeroPorNome;
    }

    public void exibirContatos() {
        System.out.println(this.agendaContatos);
    }

}
