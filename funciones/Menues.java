package funciones; 
import clases.Auto;
public class Menues {
    public static void menuPrincipal(){
        System.out.println("\033[31m ****************************");
        System.out.println("\033[31m **\033[30m1: Agregar Auto         \033[31m**");
        System.out.println("\033[31m **\033[30m2: Listar Autos         \033[31m**");
        System.out.println("\033[31m **\033[30m3: Eliminar Auto        \033[31m**");
        System.out.println("\033[31m **\033[30m4: Seleccionar Auto     \033[31m**");
        System.out.println("\033[31m **\033[30m5: Editar Auto          \033[31m**");
        System.out.println("\033[31m **\033[30m6: Salir                \033[31m**");
        System.out.println("\033[31m ****************************\033[31m");
    }
    public static void menuAuto(){
        System.out.println("\033[31m ****************************");
        System.out.println("\033[31m **\033[30m1: Encender Auto        \033[31m**");
        System.out.println("\033[31m **\033[30m2: Apagar Auto          \033[31m**");
        System.out.println("\033[31m **\033[30m3: Tocar bocina         \033[31m**");
        System.out.println("\033[31m **\033[30m4: Recorrer             \033[31m**");
        System.out.println("\033[31m **\033[30m5: Mostrar Info         \033[31m**");
        System.out.println("\033[31m **\033[30m6: Volver               \033[31m**");
        System.out.println("\033[31m ****************************\033[31m");
    }
}
