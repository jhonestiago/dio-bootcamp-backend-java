package list.operacoesbasicas.listatarefas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {

    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        this.tarefas.removeAll(tarefasParaRemover);    
    }

    public int obterNumeroTotalDeTarefas() {
        return this.tarefas.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefas);
    }

}
