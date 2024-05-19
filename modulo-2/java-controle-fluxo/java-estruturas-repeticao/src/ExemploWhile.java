import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        
        double mesada = 50.00;
        int contador = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + String.format("%.2f", valorDoce) + " adicionado no carrinho");
            mesada -= valorDoce;
            contador++;
        }
        System.out.println("Mesada: " + String.format("%.2f", mesada));
        System.out.println("Joãozinho comprou " + contador + " doces, gastando toda a sua mesada");

    }

    private static double valorAleatorio() {
        double valorAleatorio = ThreadLocalRandom.current().nextDouble(2, 8);
        return valorAleatorio;
    }

}
