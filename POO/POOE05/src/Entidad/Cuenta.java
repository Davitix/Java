/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.*;

/**
 *
 * @author david
 */
public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double ingresar(double ingreso) {
        return saldoActual += ingreso;
    }

    public double retiro(double retiro) {
        if (saldoActual > retiro) {
            return saldoActual -= retiro;
        } else {
            return saldoActual = 0;
        }
    }
    
    public double extracciónRápida() {
        double retiro = saldoActual * 0.2;
        saldoActual -= retiro;
        return retiro;
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es: " + saldoActual);
    }
    
    public void consultarDatos() {
        System.out.println("Su número de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + DNI);
    }
    
}
