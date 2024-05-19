import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main(String[] args) {

        String valor = "1.75";
        Number numero;
        //numero = Double.valueOf(valor);
        //System.out.println(numero);
        
        try {
            numero = NumberFormat.getInstance().parse(valor);
            System.out.println(numero);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}