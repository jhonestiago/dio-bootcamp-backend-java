package usuario;

import dispositivo.sistema.IPhone;

public class Usuario {

    public static void main(String[] args) {
        
        IPhone meuIPhone = new IPhone();

        meuIPhone.ligarDispositivo();

        meuIPhone.selecionarMusica("O Mundo é um moinho");
        meuIPhone.aumentarVolume();

        meuIPhone.exibirPagina("https://dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://www.youtube.com");

        meuIPhone.pausarMusica();

        meuIPhone.atenderChamada();
        meuIPhone.encerrarChamada();

        meuIPhone.tocarMusica();
        meuIPhone.diminuirVolume();

        meuIPhone.desligarDispositivo();



        

    }
}
