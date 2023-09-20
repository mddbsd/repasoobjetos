package Clases;
public class ClaseCasa {
    //ATRIBUTOS
    private Techos techo;
    private String piso;
    private String color;
    private String direccion;
    private int ambientes;
    private double superficie;
    private double temperatura;
    
    //CONSTRUCTOR
    public ClaseCasa(Techos t, String p, String c, String d, int a, double s){
        this.techo = t;
        this.piso = p;
        this.color = c;
        this.direccion = d;
        this.ambientes = a;
        this.superficie = s;
        this.temperatura = 0;
    }
    //Getters
    public Techos getTecho(){
        return this.techo;
    }
    public String getPiso(){
        return this.piso;
    }
    public String getColor(){
        return this.color;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getAmbientes(){
        return this.ambientes;
    }
    public double getSuperficie(){
        return this.superficie;
    }
    public double getTemperatura(){
        return this.temperatura;
    }
    
    //Setter
    public void setTemperatura(double t){
        this.temperatura = t;
    }

    //Metodos
    public void SuenaAlarma(){
        System.out.println("UIIIIUUUUUUIIIIIIIIIIIUUUUUUUU");
    }
    public void DesbloquearPuertas(){
        System.out.println("Aviso: Puertas Desbloqueadas");
    }
    public void EnciendeCalefaccion(){
        /* 
        System.out.println("Que temperatura?");
        this.temperatura = Double.parseDouble(System.console().readLine());
        System.out.println("La temperatura es " + this.temperatura + "grados centigrados");
        */
        if (getTemperatura() != 0){
            System.out.println("La temperatura ya esta encendida");
        }else {
            System.out.println("Que temperatura?");
            setTemperatura(Double.parseDouble(System.console().readLine()));
            System.out.println("La temperatura es " + getTemperatura() + " grados centigrados");
        }
    }

    public String toString(){
        return "El techo es de " + this.techo + "\n" +
               "Con piso de " + this.piso + "\n" +
               "El color exterior es " + this.color + "\n" +
               "Esta ubicada en " + this.direccion + "\n" +
               "Tiene " + this.ambientes + "ambientes y una superficie total de " + this.superficie;
    }
}
