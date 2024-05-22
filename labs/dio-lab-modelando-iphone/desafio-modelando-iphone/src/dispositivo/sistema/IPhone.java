package dispositivo.sistema;

import dispositivo.aplicativos.ReprodutorMusical;
import dispositivo.aplicativos.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico {
    
    @Override
    public void ligar(String numero) {
        System.out.println("Chamando " + numero);
    }
   
    @Override
    public void atenderChamada() {
        System.out.println("Atendendo Chamada");
    }
    
    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    } 
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamando Correio de Voz");
    } 

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Em pausa");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

}
