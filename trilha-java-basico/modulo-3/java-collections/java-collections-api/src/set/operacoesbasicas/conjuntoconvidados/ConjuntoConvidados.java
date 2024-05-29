package set.operacoesbasicas.conjuntoconvidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>(); 
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidados.add(new Convidado(nome, codigoConvite));
    }    

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        this.convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return this.convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidados);
    }

}
