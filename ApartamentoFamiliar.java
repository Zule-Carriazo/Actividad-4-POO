
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor por área de un apartamento familiar
    protected static double valorArea = 2000000;

    /* Atributo que identifica el valor de la administración de un
       apartamento familiar */
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
                               String direccion, int numeroHabitaciones, int numeroBaños,
                               int valorAdministracion) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
              numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    /**
     * Método que muestra en pantalla los datos de un apartamento familiar
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();
    }
}

