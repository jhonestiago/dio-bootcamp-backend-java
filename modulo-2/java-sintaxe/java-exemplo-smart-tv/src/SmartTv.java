public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A TV está desligada");
    }

    public void mudarCanal(int canal) {
        if (canal >= 1) {
            this.canal = canal;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("Canal: " + this.canal);
        }
    }

    public void avancarCanal() {
        if (canal < 69) {
            canal++;
            System.out.println("Canal: " + canal);
        } else {
            canal = 1;
            System.out.println("Canal: " + canal);
        }
    }

    public void voltarCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        } else {
            canal = 69;
            System.out.println("Canal: " + canal);
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume: " + volume);
        }
    }

}