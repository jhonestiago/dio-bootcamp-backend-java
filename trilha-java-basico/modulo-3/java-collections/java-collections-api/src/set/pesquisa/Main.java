package set.pesquisa;

import set.pesquisa.agendacontatos.AgendaContatos;

public class Main {
    
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Maria Silva", 5555555));

        agendaContatos.exibirContatos();
        
    }

}
