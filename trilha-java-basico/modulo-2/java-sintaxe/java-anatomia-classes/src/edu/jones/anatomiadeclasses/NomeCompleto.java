package edu.jones.anatomiadeclasses;

public class NomeCompleto {

    public static void main(String[] args) {
        
        String nome = "JOSÉ";
        String sobrenome = "SILVA";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
    
}