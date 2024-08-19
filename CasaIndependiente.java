
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area,
                             String direccion, int numeroHabitaciones, int numeroBanos, int
                             numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
              numeroHabitaciones, numeroBanos, numeroPisos);
    }

    /**
     * Método que muestra en pantalla los datos de una casa independiente
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}

