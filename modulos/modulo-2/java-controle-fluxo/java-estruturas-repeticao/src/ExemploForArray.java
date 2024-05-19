public class ExemploForArray {

    public static void main(String[] args) {

        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};
        // Modelo 1 -> Iteração simples
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice " + i + " é " + alunos[i]);
        }
        System.out.println();
        
        //Modelo 2 -> For Each
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }

}
