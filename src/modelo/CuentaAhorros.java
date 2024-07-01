/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class CuentaAhorros extends datosCuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, 0, 0, tasaAnual, 0.0f);
        this.activa = saldo >= 10000;
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
        if (getSaldo() >= 10000) {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
        if (getSaldo() < 10000) {
            activa = false;
        }
    }

    public void generarExtractoMensual() {
        if (getNumeroRetiros() > 4) {
            setComisionMnesual(getComisionMnesual() + (getNumeroRetiros() - 4) * 1000);
        }
        super.generarExtractoMensual();
        activa = getSaldo() >= 10000;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
        System.out.println("Número de transacciones: " + (getNumeroConsignacion() + getNumeroRetiros()));
    }
}

