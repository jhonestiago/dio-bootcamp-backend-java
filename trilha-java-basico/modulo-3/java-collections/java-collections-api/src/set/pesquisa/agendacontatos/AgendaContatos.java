package set.pesquisa.agendacontatos;

import java.util.Set;
import java.util.HashSet;
import set.pesquisa.agendacontatos.Contato;

public class AgendaContatos {
    
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(this.contatos);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<Contato>();
        if (!this.contatos.isEmpty()) {
            for (Contato contato : this.contatos) {
                if (contato.getNome().startsWith(nome)) {
                    contatosPorNome.add(contato);
                }
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!this.contatos.isEmpty()) {
            for (Contato contato : this.contatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    contatoAtualizado = contato;
                }
            }
        }
        return contatoAtualizado;
    }

}
