package cadastro;

public class SistemaCadastro {

    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("MARCOS SILVA", "01078900178");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
    
}
