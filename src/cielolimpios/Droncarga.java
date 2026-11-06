package cielolimpios;

public class Droncarga extends Dronbase {
    private double cargaMaxima;
    private double cargaActual;

    public Droncarga(String serie, double energia, boolean enLinea, double cargaMaxima) {
        super(serie, energia, enLinea);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }

     public boolean calcularPeso(double pesoNuevo) {
        if ((cargaActual + pesoNuevo) > cargaMaxima) {
            return true; 
        } 
        else {
            return false; 
        }
    }

    public void enganchardesecho(double pesoNuevo) {
        System.out.println("Dron " + getSerie() + " enganchando el obejeto:  " + pesoNuevo + "kg.");
        
        if (calcularPeso(pesoNuevo) == true) {
            System.out.println("no se puede enganchar el objeto");
        } 
        else {
            cargaActual = cargaActual + pesoNuevo;
            System.out.println("objeto enganchado su peso es :" + cargaActual + "kg.");
        }
    }

      public void contenedor() {
        System.out.println(getSerie() + "liberando desechos.");
        cargaActual = 0; 
    }
}