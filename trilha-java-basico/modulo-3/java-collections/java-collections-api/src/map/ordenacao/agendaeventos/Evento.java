package map.ordenacao.agendaeventos;

public class Evento {

    // Atributos
    private String nome;
    private String atracao;

    // Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getAtracao() {
        return this.atracao;
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        return "Evento: " + this.getNome() + ", atração: " + this.getAtracao();
    }
    
}
