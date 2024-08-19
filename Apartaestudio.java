
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class Apartaestudio extends Apartamento {
    // Atributo que identifica el valor por área de un apartaestudio
    protected static double valorArea = 1500000;

    public Apartaestudio(int identificadorInmobiliario, int área, String dirección,
                         int númeroHabitaciones, int númeroBaños) {
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }

    /**
     * Método que muestra en pantalla los datos de un apartaestudio
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}

