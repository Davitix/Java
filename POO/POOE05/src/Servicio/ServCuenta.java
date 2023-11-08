/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.*;

/**
 *
 * @author david
 */
public class ServCuenta {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        
        Cuenta cuenta = new Cuenta();
        
        System.out.print("Ingrese el número de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        
        System.out.print("Ingrese el DNI del cliente: ");
        cuenta.setDNI(leer.nextLong());
        
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuenta.setSaldoActual(leer.nextInt());
        
        return cuenta;
    }
    
    
    
}
