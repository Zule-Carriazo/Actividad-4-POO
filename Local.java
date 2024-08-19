
package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */

public class Local extends Inmueble {
    // Enum que define los tipos posibles de local
    public enum Tipo { INTERNO, CALLE }

    // Atributo que define el tipo de local
    protected Tipo tipoLocal;

    /**
     * Constructor de la clase Local
     * @param identificadorInmobiliario Parámetro que define el identificador inmobiliario del local
     * @param area Parámetro que define el área del local
     * @param direccion Parámetro que define la dirección donde se encuentra el local
     * @param tipoLocal Parámetro que define el tipo de local
     */
    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    /**
     * Método que muestra en pantalla los datos de un local
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
}

