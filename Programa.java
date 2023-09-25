import clases.Auto;
import funciones.*;
import java.util.Scanner;
import java.util.ArrayList;

public  class Programa{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Auto> listaAutos = new ArrayList<Auto>();
        listaAutos.add(new Auto("VW","gol",Generadores.generaPatente()));
        listaAutos.add(new Auto("BMW","Q5",Generadores.generaPatente()));
        listaAutos.add(new Auto("Ford","falcon",Generadores.generaPatente()));
        listaAutos.add(new Auto("Ford","focus",Generadores.generaPatente()));
        String marca;
        String modelo;

        String opMpC1 = "";
        boolean opMp = false;
        
        do{
            Menues.menuPrincipal();
            switch(s.nextLine()){
                case "1":
                    do{
                        System.out.println("Ingrese datos del auto");
                        System.out.print("Marca: ");
                        marca = s.nextLine();
                        System.out.print("Modelo: ");
                        modelo = s.nextLine();
                        listaAutos.add(new Auto(marca, modelo, Generadores.generaPatente()));
                        System.out.println("¿Desea agregar otro auto? (s/n)");
                        opMpC1 = s.nextLine();
                    }while (Validaciones.siNo(opMpC1));
                    opMpC1 = "";
                    break;
                case "2":
                    int i = 0;
                    for (Auto aux : listaAutos){
                        System.out.println("Auto N°: " + i);
                        System.out.println("Patente: " + aux.getPatente());
                        i ++;
                    }
                    break;
                case "3":
                    System.out.println("que vehiculo quiere eliminar?");
                    listaAutos.remove(Integer.parseInt(s.nextLine()));
                    break;
                case "4":
                    int sel;
                    opMpC1="n";
                    System.out.println("Seleccione Auto");
                    sel = Integer.parseInt(s.nextLine());
                    do{
                        Menues.menuAuto();
                        switch(s.nextLine()){
                            case "1":
                                listaAutos.get(sel).arranca();
                                break;
                            case "2":
                                listaAutos.get(sel).apaga();
                                break;
                            case "3":
                                listaAutos.get(sel).tocaBocina();
                                break;
                            case "4":
                                System.out.print("Cuantos kilometros): ");
                                listaAutos.get(sel).recorre(Integer.parseInt(s.nextLine()));
                                break;
                            case "5":
                                System.out.println(listaAutos.get(sel));
                                break;
                            case "6":
                                System.out.println("Desea volver?");
                                opMpC1 = s.nextLine();
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                        }
                    }while (!Validaciones.siNo(opMpC1));
                    opMpC1 = "";
                    break;
                case "5":
                    
    ;               break;
                case "6":
                    opMp = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(!opMp);
    }
}