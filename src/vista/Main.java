/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
/**
 *
 * @author DELL
 */
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000.0f, 5.0f);

        System.out.println("Cuenta de Ahorros - Valores iniciales:");
        cuentaAhorros.imprimir();

        cuentaAhorros.consignar(5000.0f);
        System.out.println("\nDespués de consignar 5000:");
        cuentaAhorros.imprimir();

        cuentaAhorros.retirar(2000.0f);
        System.out.println("\nDespués de retirar 2000:");
        cuentaAhorros.imprimir();

        cuentaAhorros.generarExtractoMensual();
        System.out.println("\nDespués de generar el extracto mensual:");
        cuentaAhorros.imprimir();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000.0f, 3.0f);

        System.out.println("\nCuenta Corriente - Valores iniciales:");
        cuentaCorriente.imprimir();

        cuentaCorriente.retirar(7000.0f);
        System.out.println("\nDespués de retirar 7000:");
        cuentaCorriente.imprimir();

        cuentaCorriente.consignar(3000.0f);
        System.out.println("\nDespués de consignar 3000:");
        cuentaCorriente.imprimir();

        cuentaCorriente.generarExtractoMensual();
        System.out.println("\nDespués de generar el extracto mensual:");
        cuentaCorriente.imprimir();
    }
}
