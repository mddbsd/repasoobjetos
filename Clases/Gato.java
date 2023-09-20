package Clases;
public class Gato {
    // ATRIBUTOS
    private String sexo;
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private double peso;
    // CONSTRUCTOR
    public Gato (String s, String n, String c, String r, int e, double p){
        this.sexo = s;
        this.nombre = n;
        this.color = c;
        this.raza = r;
        this.edad = e;
        this.peso = p;
    }
    // GETTERS
    public String getSexo(){
        return this.sexo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getColor(){
        return this.color;
    }
    public String getRaza(){
        return this.raza;
    }
    public int getEdad(){
        return this.edad;
    }
    public double getPeso(){
        return this.peso;
    }

    // METODOS
    public void maulla(){
        System.out.println("MIAU!");
    }

    public void salta(){
        if(this.peso > 100){
            System.out.println("No puedo saltar");
        }else{
            System.out.println("Que tan alto?");
        }
    }

    public void come(String comida){
        if(comida.equals("pescado")){
            System.out.println("Gracias humano");
            this.peso = this.peso + 1;
        }else{
            System.out.println("Yo no como " + comida);
        }
    }

    public String toString(){
        return "*****************************\n" +
               "*Nombre: " + getNombre() + "\n" +
               "*Color: " + getColor() + "\n" +
               "*Raza: " + getRaza() + "\n" +
               "*Peso: " + getPeso() + "\n" +
               "*Sexo: " + getSexo() + "\n" +
               "*Edada: " + getEdad() + "\n" + 
               "****************************"; 
    }
}
