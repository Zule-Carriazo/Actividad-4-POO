package com.mycompany.pruebacuenta;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo = cantidad - sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisiónMensual);
        System.out.println("Número de transacciones = " + (númeroConsignaciones + númeroRetiros));
        System.out.println("Valor de sobregiro = $" + sobregiro);
        System.out.println();
    }
}

    
