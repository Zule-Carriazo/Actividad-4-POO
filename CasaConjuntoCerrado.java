
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    // Atributo que define el valor por área de una casa en conjunto cerrado
    protected static double valorArea = 2500000;
    // Atributo que define el valor de administración de una casa en conjunto cerrado
    protected int valorAdministracion;
    // Atributo que define si una casa en conjunto cerrado tiene piscina
    protected boolean tienePiscina;
    // Atributo que define si una casa en conjunto cerrado tiene campos deportivos
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area,
                               String direccion, int numeroHabitaciones, int numeroBanos,
                               int numeroPisos, int valorAdministracion, boolean tienePiscina,
                               boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
              numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}

