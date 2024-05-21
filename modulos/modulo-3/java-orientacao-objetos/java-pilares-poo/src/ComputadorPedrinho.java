public class ComputadorPedrinho {

    public static void main(String[] args) {

        // Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

        // Abrindo Facebook Messenger
        FacebookMessenger fbmessenger = new FacebookMessenger();
        fbmessenger.enviarMensagem();
        fbmessenger.receberMensagem();


	}

}
