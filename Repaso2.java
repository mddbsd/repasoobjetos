import Clases.ClaseCasa;
import Clases.Productos;

public class Repaso2 {
    public static void main(String[] args){
        ClaseCasa casa1 = new ClaseCasa("chapa","porcelanato","azul","calle falsa 123", 4, 30.5 );
        ClaseCasa casa2 = new ClaseCasa("teja","flotante","verde","callefalsa 124",6,45.3);

        System.out.println(casa1.getTecho());
        System.out.println(casa1.getTemperatura());
        
    }
}
