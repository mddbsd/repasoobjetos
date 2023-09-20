import Clases.ClaseCasa;
import Clases.Productos;
import Clases.Techos;

public class Repaso2 {
    public static void main(String[] args){
        ClaseCasa casa1 = new ClaseCasa(Techos.CHAPA,"porcelanato","azul","calle falsa 123", 4, 30.5 );
        ClaseCasa casa2 = new ClaseCasa(Techos.TEJA,"flotante","verde","callefalsa 124",6,45.3);

        System.out.println(casa1);
        System.out.println();
        System.out.println(casa2);

        System.out.println("Temp Actual " + casa1.getTemperatura());
        casa1.EnciendeCalefaccion();
        System.out.println("Temp Actual " + casa1.getTemperatura());

        System.out.println(casa1.getTecho());

    }
}
