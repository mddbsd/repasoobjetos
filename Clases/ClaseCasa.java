package Clases;
public class ClaseCasa {
    //ATRIBUTOS
    private String techo;
    private String piso;
    private String color;
    private String direccion;
    private int ambientes;
    private double superficie;
    private double temperatura;
    
    //CONSTRUCTOR
    public ClaseCasa(String t, String p, String c, String d, int a, double s){
        this.techo = t;
        this.piso = p;
        this.color = c;
        this.direccion = d;
        this.ambientes = a;
        this.superficie = s;
        this.temperatura = 0;
    }
    //Getters
    public String getTecho(){
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
        int temp;
        System.out.println("Que temperatura?");
        temp = Integer.parseInt(System.console().readLine());
        System.out.println("La temperatura es " + temp + "grados centigrados");
    }

}
