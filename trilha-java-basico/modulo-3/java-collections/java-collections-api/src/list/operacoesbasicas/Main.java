package list.operacoesbasicas;

import list.operacoesbasicas.listatarefas.ListaTarefas;

public class Main {

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        System.out.println("O número total de tarefas é: " + tarefas.obterNumeroTotalDeTarefas());
        
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de tarefas é: " + tarefas.obterNumeroTotalDeTarefas());

        tarefas.removerTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + tarefas.obterNumeroTotalDeTarefas());

        tarefas.obterDescricoesTarefa();
    
    }
}
