public enum EstadosBrasileiros {

    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    PIAUI ("Piauí", "PI"),
    MARANHAO ("Maranhão", "MA");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}

