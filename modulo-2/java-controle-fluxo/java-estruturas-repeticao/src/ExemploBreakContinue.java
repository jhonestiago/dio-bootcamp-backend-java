public class ExemploBreakContinue {
    
    public static void main(String[] args) {

        // Funcionamento do break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            } else {
                System.out.println("O número é igual a: " + i);
            }
        }

        System.out.println();
        //Funcionamento de continue
        for (int j = 2; j <= 10; j += 2) {
            if (j == 6) {
                continue;
            } else {
                System.out.println("O número é igual a: " + j);
            }
        }

    }

}
