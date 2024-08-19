
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */

public class LocalComercial extends Local {
    // Atributo que define el valor por área de un local comercial
    protected static double valorArea = 3000000;

    // Atributo que define el centro comercial donde está ubicado el local comercial
    protected String centroComercial;

    /**
     * Constructor de la clase LocalComercial
     * @param identificadorInmobiliario Parámetro que define el identificador inmobiliario del local comercial
     * @param area Parámetro que define el área del local comercial
     * @param direccion Parámetro que define la dirección donde se encuentra el local comercial
     * @param tipoLocal Parámetro que define el tipo de local
     * @param centroComercial Parámetro que define el centro comercial donde está ubicado el local comercial
     */
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, String centroComercial) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    /**
     * Método que muestra en pantalla los datos de un local comercial
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}

