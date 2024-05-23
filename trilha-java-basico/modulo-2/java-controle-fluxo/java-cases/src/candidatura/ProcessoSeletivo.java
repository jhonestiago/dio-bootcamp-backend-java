package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static double salarioBase = 2000.00;
    
    public static void main(String[] args) {
        //Case 1
        System.out.println("Processo Seletivo");
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);
        System.out.println();
        
        // Case 2
        selecaoCandidatos();
        System.out.println();
        
        // Case 3
        imprimirSelecionados();
        System.out.println();

        // Case 4
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            ligarParaCanditato(candidato);
        }
        System.out.println();
    }
    
    // Case 1
    private static void analisarCandidato(double salarioPretendido) {
        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

    // Case 2
    private static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"}; 
        int candidatosSelecionados = 0;
        for (String canditato : candidatos) {
            double salarioPretendido = salarioPretendido();
            System.out.println("O candidato " + canditato + ", soliciou este valor de salário: " + String.format("%.2f", salarioPretendido));
            if (candidatosSelecionados < 5) {
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidanto " + canditato + ", foi selecionado para a vaga");
                    candidatosSelecionados++;
                } else {
                    System.out.println("O candidanto " + canditato + ", não foi selecionado para a vaga");
                }
            }
        }
        System.out.println("Total de candidatos selecionados: " + candidatosSelecionados);
    }

    private static double salarioPretendido() {
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        return valor; 
    }

    // Case 3
    private static void imprimirSelecionados() {
        String[] candidatosSelecionados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        
        System.out.println("Imprimindo a lista de seleção pelo indíce do candidato");
        System.out.println("| Indíce \t| Candidato");
        for (int i = 0; i < candidatosSelecionados.length; i++) {
            System.out.println("| " + (i + 1) +"\t\t| " + candidatosSelecionados[i]);
        }
    }

    //Case 4
    private static void ligarParaCanditato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentanto = !atendeu;
            if (continuarTentanto) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentanto  && tentativasRealizadas < 3);

        if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        } else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
		
	}

    private static boolean atender() {
        boolean atendeu = new Random().nextInt(3) == 1;
        return atendeu;
    }

}