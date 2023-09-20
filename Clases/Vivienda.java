package Clases;

public abstract class Vivienda {
    private String direccion;
    private String colorInt;
    private String cielorraso;
    private int ambientes;
    private String suelo;
    private double superficie;
    private static double temperatura;

    public Vivienda(){

    }
    
    public Vivienda(String d, String ci, String cr, String s, int a, double sup){
        this.direccion = d;
        this.colorInt = ci;
        this.cielorraso = cr;
        this.suelo = s;
        this.ambientes = a;
        this.superficie = sup;
        this.temperatura = 0;
    }
}
