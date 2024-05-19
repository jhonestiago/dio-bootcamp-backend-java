public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        //Texto
        char letra = 'J'; 
        String nome = "José Silva";

        System.out.println(letra);
        System.out.println(nome);
        System.out.println();

        //Números Inteiros
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333;
        long cpf = 98765432109L;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println();

        //Números Decimais
        final float PI = 3.14F; //Constante
        double salario = 1275.33;

        System.out.println(PI);
        System.out.println(salario);
        System.out.println();

        //Reatribuição de Variavel e Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Casting

        System.out.println(numeroCurto2);
        System.out.println();

        //Booleno
        boolean valorLogico = true;

        System.out.println(valorLogico);

    }
}