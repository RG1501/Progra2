package cielolimpios;

public class Dronbase {
    private String serie;
    private double energia;
    private boolean enLinea;

    public Dronbase(String serie, double energia, boolean enlinea) {
        this.serie = serie;
        this.enLinea = enlinea;
        setEnergia(energia); 
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
            calibradorinterno();
        } else {
            System.out.println("bateria (" + energia + ") invalido  " + serie + ". aun tiene energia.");
        }
    }

    public boolean isEnLinea() {
        return enLinea;
    }

    public void setEnLinea(boolean enLinea) {
        this.enLinea = enLinea;
    }

    private void calibradorinterno() {
        System.out.println("Sistema Interno Calibrado: " + serie);
    }

    public void estadoRed() {
        System.out.println("dron");
        System.out.println("serie: " + serie);
        System.out.println("energia: " + energia + "%");
        if (enLinea) {
            System.out.println("Listo para recibir indicaciones");
        } else {
            System.out.println("Apagado)");
        }
    }
}