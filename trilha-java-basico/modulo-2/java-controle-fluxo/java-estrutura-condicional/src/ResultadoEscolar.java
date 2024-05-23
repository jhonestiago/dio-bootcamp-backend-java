public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 6;

        // Primeiro Cenário -> Estrutura Condicional Composta
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Segundo Cenário -> Estrutura Condicional Encadeada
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Terceiro Cenário -> Operador Ternário (Simples)
        nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Terceiro Cenário -> Operador Ternário (Encandeado)
        nota = 5;
        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";
        System.out.println(resultado);
        
    }

}