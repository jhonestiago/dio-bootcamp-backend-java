package cadastro;

public class SistemaCadastro {

    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa();

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
    
}
