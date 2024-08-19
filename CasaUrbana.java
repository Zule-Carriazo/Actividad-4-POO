
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion,
                      int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
              numeroHabitaciones, numeroBaños, numeroPisos);
    }

    /**
     * Método que muestra en pantalla los datos de una casa urbana
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}

