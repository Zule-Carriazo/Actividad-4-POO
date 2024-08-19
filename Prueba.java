/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inmuebles;

/**
 *
 * @author zuzul
 */
public class Prueba {
    /**
     * Método main que crea dos inmuebles, calcula su precio de
     * acuerdo al área y muestra sus datos en pantalla.
     * @param args
     */
    public static void main(String[] args) {
        // Crear un apartamento familiar
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        
        System.out.println("Datos apartamento familiar");
        apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apto1.imprimir();
        
        // Crear un apartaestudio
        Apartaestudio aptestudio1 = new Apartaestudio(12354,50, "Avenida Caracas 30-15",1,1);
        
        System.out.println("Datos apartaestudio");
        aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
        aptestudio1.imprimir();
    }
}

