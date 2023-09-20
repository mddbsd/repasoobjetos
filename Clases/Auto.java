package Clases;

public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private String patente;
    private int kilometraje;
    private boolean encendido;
    // Constructor
    public Auto(String ma, String mo, String pa){
        this.marca = ma;
        this.modelo = mo;
        this.patente = pa;
        this.kilometraje = 0;
        this.encendido = false;
    }
    // Getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getPatente(){
        return this.patente;
    }

    public int getKilometraje(){
        return this.kilometraje;
    }

    // Metodos
    public void tocaBocina(){
        if(encendido){
            System.out.println("HONK!");
        }else{
            System.out.println("el vehiculo esta apagado");
        }
        
    }

    public void arranca(){
        System.out.println("BRUUMMM!");
        this.encendido = true;
    }
    public void apaga(){
        this.encendido = false;
    }

    public void recorre(int kilometrosRecorridos){
        if(encendido){
            System.out.println("El vehiculo recorrio " + kilometrosRecorridos + " km");
            this.kilometraje += kilometrosRecorridos; 
        }else{
            System.out.println("Primero encienda el vehiculo");
        }

    }

    public String toString(){
        return "Marca: " + getMarca() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Patente: " + getPatente() + "\n" +
               "Kilometraje: " + getKilometraje() + "\n";
    }
}
