package cielolimpios;

/**
 *
 * @author jose.rodriguez
 */
public class CielosLimpios {

    public static void main(String[] args) {
        System.out.println("CIELOS LIMPIOS\n");

    
       Reconocimientodron[] tactica = new Reconocimientodron[3];
        Droncarga[] escuadronPesado = new Droncarga[2];

        tactica[0] = new Reconocimientodron("Reconocimiento #1", 100.0, true);
        tactica[1] = new Reconocimientodron("Reconocimiento #1", 100.0, true);
        tactica[2] = new Reconocimientodron("Reconocimiento #1", 100.0, true);

        escuadronPesado[0] = new Droncarga("Carga #1", 100.0, true, 50.0);
        escuadronPesado[1] = new Droncarga("Carga #2", 100.0, true, 80.0);

        System.out.println("\n RUTINAS DE TACTICA");
            for (int i = 0; i < 3; i++) {
            tactica[i].Mapeo();
            tactica[i].Amenazas();
        }

        System.out.println("\n RUTINAS DE CARGA");
          for (int i = 0; i < 2; i++) {
            escuadronPesado[i].enganchardesecho(60.0); 
            escuadronPesado[i].contenedor();
        }

        System.out.println("\n VALIDACION DE SEGURIDAD ");
        tactica[0].setEnergia(60.0); 
        tactica[1].setEnergia(-25.0); 
        tactica[2].setEnergia(150.0);

        escuadronPesado[0].setEnergia(45.0); 
        escuadronPesado[1].setEnergia(0.0);  

        System.out.println("\n REPORTE FINAL ");
        for (int i = 0; i < 3; i++) {
            tactica[i].estadoRed();
        }
        for (int i = 0; i < 2; i++) {
            escuadronPesado[i].estadoRed();
        }
    }
}