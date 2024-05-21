package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Impressora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.mutifuncional.EquipamentoMultifuncional;

public class Fabrica {
    
    public static void main(String[] args) {
        
        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

        Copiadora copiadora = new EquipamentoMultifuncional();
        copiadora.copiar();

        Digitalizadora scanner = new EquipamentoMultifuncional();
        scanner.digitalizar();

    }

}
