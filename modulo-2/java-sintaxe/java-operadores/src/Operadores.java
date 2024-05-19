public class Operadores {
    
    public static void main(String[] args) throws Exception {
        int primeiroTermo = 4;
        int segundoTermo = 6;
        String concatenacao;
        boolean verdadeiro = true;
        boolean falso = false;

        // Operadores Aritméticos
        int soma = primeiroTermo + segundoTermo;        
        System.out.println(soma); // Saída: 10
        int diferenca = primeiroTermo - segundoTermo;
        System.out.println(diferenca); // Saída: -2
        int produto = primeiroTermo * segundoTermo;
        System.out.println(produto); // Saída: 24
        double quociente = (double) primeiroTermo / segundoTermo;
        System.out.println(quociente); // Saída: 0.6666666666666666
        int resto = primeiroTermo % 2;
        System.out.println(resto); // Saída: 0
        System.out.println();

        // Exemplos de Concatenação (fonte: Gleyson Sampaio | Dio)
        String palavra = "LINGUAGEM " + "JAVA";
        System.out.println(palavra); // Saída: LINGUAGEM JAVA
      
        concatenacao = 1 + 1 + 1 + "1"; 
        System.out.println(concatenacao); // Saída: 31
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // Saída: 1111
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // Saída: 1111
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // Saída: 1111
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // Saída: 13
        System.out.println();

        // Operadores Unarios
        int numeroPositivo = primeiroTermo;
        System.out.println(numeroPositivo); // Saída: 4
        int numeroNegativo = -numeroPositivo;
        System.out.println(numeroNegativo); // Saída: -4
        numeroPositivo = -numeroNegativo;
        System.out.println(numeroPositivo); // Saída: 4
        System.out.println();

        System.out.println(numeroPositivo++); // Saída: 4
        System.out.println(numeroPositivo); // Saída: 5
        System.out.println(++numeroPositivo); // Saída: 6
        System.out.println();

        System.out.println(numeroNegativo--); // Saída: -4;
        System.out.println(numeroNegativo); // Saída: -5
        System.out.println(--numeroNegativo); // Saída: -6
        System.out.println();

        System.out.println(!verdadeiro); // Saída: false
        System.out.println(!falso); // Saída: true
        System.out.println();

        // Operadores Relacionais
        boolean valorLogico = primeiroTermo == segundoTermo;
        System.out.println(valorLogico); // Saída: false
        valorLogico = primeiroTermo != segundoTermo;
        System.out.println(valorLogico); // Saída: true
        valorLogico = primeiroTermo > segundoTermo;
        System.out.println(valorLogico); // Saída: false
        valorLogico = primeiroTermo >= segundoTermo;
        System.out.println(valorLogico); // Saída: false
        valorLogico = primeiroTermo < segundoTermo;
        System.out.println(valorLogico); // Saída: true
        valorLogico = primeiroTermo <= segundoTermo;
        System.out.println(valorLogico); // Saída: true
        System.out.println();

        // Operadores booleandos
        valorLogico = primeiroTermo < segundoTermo && numeroPositivo > numeroNegativo;
        System.out.println(valorLogico); // Saída: true
        valorLogico = primeiroTermo < segundoTermo && numeroPositivo < numeroNegativo;
        System.out.println(valorLogico); // Saída: false
        valorLogico = primeiroTermo < segundoTermo || numeroPositivo < numeroNegativo;
        System.out.println(valorLogico); // Saída: true
        valorLogico = !valorLogico;
        System.out.println(valorLogico); // aída: false
        System.out.println();

        // Operador ternário
        valorLogico = primeiroTermo < segundoTermo ? true : false;
        System.out.println(valorLogico); // Saída: true

    }

}