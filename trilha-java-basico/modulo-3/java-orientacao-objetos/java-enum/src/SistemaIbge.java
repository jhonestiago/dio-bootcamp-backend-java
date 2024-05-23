public class SistemaIbge {

    public static void main(String[] args) {
        
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println(estado.getNomeMaiusculo());
        }

    }

}
