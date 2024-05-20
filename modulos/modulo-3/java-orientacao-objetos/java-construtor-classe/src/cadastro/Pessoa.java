package cadastro;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    // metodo contrutor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // nome.getter
    public String getNome() {
        return nome;
    }

    // nome.setter
    // ?

    // cpf.getter
    public String getCpf(){
        return cpf;
    }

    // cpf.setter
    // ?

    // endereco.getter
    public String getEndereco() {
        return endereco;
    }

    // endereco.setter
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}