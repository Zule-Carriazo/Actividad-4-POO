
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones; // Atributo que identifica el número de habitaciones de un inmueble para vivienda
    protected int numeroBaños; // Atributo que identifica el número de baños de un inmueble para vivienda

    /**
     * Constructor de la clase InmuebleVivienda
     * @param identificadorInmobiliario Parámetro que define el
     * identificador inmobiliario de un inmueble para la vivienda
     * @param area Parámetro que define el área de un inmueble para la
     * vivienda
     * @param direccion Parámetro que define la dirección donde se
     * encuentra localizado un inmueble para la vivienda
     * @param numeroHabitaciones Parámetro que define el número de
     * habitaciones que tiene un inmueble para la vivienda
     * @param numeroBaños Parámetro que define el número de baños
     * que tiene un inmueble para la vivienda
     */
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion); // Invoca al constructor de la clase padre
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    /**
     * Método que muestra en pantalla los datos de un inmueble para la
     * vivienda
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
}

