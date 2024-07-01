/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class CuentaCorriente extends datosCuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, 0, 0, tasaAnual, 0.0f);
        this.sobregiro = 0;
    }

    public void retirar(float cantidad) {
        if (cantidad > getSaldo()) {
            sobregiro += (cantidad - getSaldo());
            setSaldo(0);
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        super.consignar(cantidad);
    }

    public void generarExtractoMensual() {
        super.generarExtractoMensual();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Número de transacciones: " + (getNumeroConsignacion() + getNumeroRetiros()));
    }
}
