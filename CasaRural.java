
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class CasaRural extends Casa {
    // Atributo que identifica el valor por área para una casa rural
    protected static double valorArea = 1500000;
    /* Atributo que identifica la distancia a la que se encuentra la casa
    rural de la cabecera municipal */
    protected int distanciaCabecera;
    // Atributo que identifica la altitud a la que se encuentra una casa rural
    protected int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion,
                     int numeroHabitaciones, int numeroBaños,
                     int numeroPisos, int distanciaCabecera, int altitud) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
              numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    /**
     * Método que muestra en pantalla los datos de una casa rural
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia a la cabecera municipal = " + distanciaCabecera + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }
}
