/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DELL
 */
public class datosCuenta {
    private float saldo;
    private int numeroConsignacion;
    private int numeroRetiros;
    private float tasaAnual;
    private float comisionMensual;

    public datosCuenta() {
    }
//Consignar una cantidad de dinero en la cuenta actualizando su saldo.
//Retirar una cantidad de dinero en la cuenta actualizando su saldo.El valor a retirar no debe superar el saldo.
//Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
//Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual correspondiente (invoca el método anterior).
//Imprimir: muestra en pantalla los valores de los atributos.
    public datosCuenta(float saldo, int numeroConsignacion, int numeroRetiros, float tasaAnual, float comisionMnesual) {
        this.saldo = saldo;
        this.numeroConsignacion = 0;
        this.numeroRetiros = 0;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = 0.0f;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignacion() {
        return numeroConsignacion;
    }

    public void setNumeroConsignacion(int numeroConsignacion) {
        this.numeroConsignacion = numeroConsignacion;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMnesual() {
        return comisionMensual;
    }

    public void setComisionMnesual(float comisionMnesual) {
        this.comisionMensual = comisionMnesual;
    }
    
     public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignacion++;
        }
     }
    
    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }
    
    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12 / 100);
        saldo += interesMensual;
    }
    
     public void generarExtractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
     }
     
     public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignacion);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa Anual: " + tasaAnual);
        System.out.println("Comisión Mensual: " + comisionMensual);
    }
}
