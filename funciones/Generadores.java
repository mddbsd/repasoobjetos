package funciones;

public class Generadores {
    public static String CodCliente(){
        int rand;
        String cod;
        rand = (int)((Math.random()*101) + 100);
        cod = "EMP" + rand;
        return cod;
    }        
    
    public static void LetraRandom(){
        double rand;
        double randRango;
        double randSumado;
        int ascii;
        for (int i = 0; i < 10; i++){
            /*rand = Math.random();
            System.out.println("Numero generado: " + rand);
            randRango = rand * (90 - 65);
            System.out.println("Numero multiplicado: " + randRango);
            randSumado = randRango + 65;
            System.out.println("Numero sumado: " + randSumado);
            ascii = (int)randSumado;
            System.out.println("Valor Ascii: " + ascii);
            System.out.println("Letra: " + (char)ascii);
            System.out.println();*/
            System.out.println((char)((int)(Math.random() * (90 - 65)) + 65));
        }
    }
}
