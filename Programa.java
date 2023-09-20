import Clases.Auto;
import java.util.Scanner;

public  class Programa{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        Auto auto1 = new Auto("VW","Gol", "AFK123");
        boolean op = false;
        do{
            System.out.println("OPCIONES DEL VEHICULO " + auto1.getMarca() + " " + auto1.getModelo());
            System.out.println("1: Encender");
            System.out.println("2: Apagar");
            System.out.println("3: Recorrer");
            System.out.println("4: Tocar bocina");
            System.out.println("5: Mostrar kilometraje");
            System.out.println("6: Salir");
            switch(s.nextLine()){
                case "1":
                    auto1.arranca();
                    break;
                case "2":
                    auto1.apaga();
                    break;
                case "3":
                    System.out.println("Ingrese la cantidad de kilometros");
                    auto1.recorre(Integer.parseInt(s.nextLine()));
                    break;
                case "4":
                    auto1.tocaBocina();
                    break;
                case "5":
                    System.out.println("Kilometraje: " + auto1.getKilometraje() + " km")
    ;               break;
                case "6":
                    op = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(!op);
    }
}