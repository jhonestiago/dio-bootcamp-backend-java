public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada? " + smartTv.ligada + "\n");

        smartTv.ligar();
        
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume + "\n");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println();

        smartTv.mudarCanal(13);
        smartTv.voltarCanal();
        smartTv.avancarCanal();

        System.out.println();

        smartTv.mudarCanal(1);
        smartTv.voltarCanal();
        smartTv.avancarCanal();

        System.out.println();

        smartTv.desligar();
        System.out.println("\nTV Ligada? " + smartTv.ligada);
        System.out.println("Canal registrado: " + smartTv.canal);
        System.out.println("Volume registrado: " + smartTv.volume);
    }

}
