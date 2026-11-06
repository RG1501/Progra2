package cielolimpios;

import java.util.Random;

public class Reconocimientodron extends Dronbase {

    private int[] cuadrantes;

    public Reconocimientodron(String serie, double energia, boolean enLinea) {
        super(serie, energia, enLinea);
        this.cuadrantes = new int[7];
    }

    public void Mapeo() {
        Random rand = new Random();
        System.out.println("Generando mapeo estocastico para unidad " + getSerie() + "...");
        for (int i = 0; i < 7; i++) {
            cuadrantes[i] = rand.nextInt(51); 
        }
    }

     public void Amenazas() {
        for (int i = 0; i < 7; i++) {
            if (cuadrantes[i] > 35) {
                alertaIncendio();
                break; 
            }
        }
    }

    private void alertaIncendio() {
        System.out.println("Posible incendio detectado por el dron " + getSerie());
    }
}