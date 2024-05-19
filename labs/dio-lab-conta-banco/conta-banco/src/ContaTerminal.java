import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita ao usuário que digite o código da agência
        System.out.println("Por favor, digite o código da Agência:");
        String agencia = scanner.next();

        // Solicita ao usuário que digite o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        // Solicita ao usuário que digite o seu Nome e Sobrenome
        System.out.println("Por favor, digite o seu Nome e Sobrenome:");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que digite o seu saldo
        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o objeto Scanner
        scanner.close();

        // Imprime a mensagem padrão de agradecimento ao usuário
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.print(" sua agência é " + agencia +", conta " + numero + ", e seu saldo " + saldo);
        System.out.print(" já esá disponível para saque.");

    }

}
