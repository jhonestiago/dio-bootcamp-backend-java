package equipamentos.mutifuncional;

import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;


public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

    public void imprimir() {
        System.out.println("IMPIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    
}
