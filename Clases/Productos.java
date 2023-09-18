package Clases;

public class Productos {
    private String cod;
    private String nombre;
    private String descripcion;
    private int precio;

    public Productos(String c, String n, String d, int p){
        this.cod = c;
        this.nombre = n;
        this.descripcion = d;
        this.precio = p;
    }

    public String getNombre(){
        return this.nombre;
    }
}
