
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */

public class Oficina extends Local {
    // Atributo que identifica el valor por área de una oficina
    protected static double valorArea = 3500000;

    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean esGobierno;

    /**
     * Constructor de la clase Oficina
     * @param identificadorInmobiliario Parámetro que define el identificador inmobiliario de una oficina
     * @param area Parámetro que define el área de una oficina
     * @param direccion Parámetro que define la dirección donde se encuentra una oficina
     * @param tipoLocal Parámetro que define el tipo de local
     * @param esGobierno Parámetro que define si la oficina pertenece o no al gobierno
     */
    public Oficina(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, boolean esGobierno) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    /**
     * Método que muestra en pantalla los datos de una oficina
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}

