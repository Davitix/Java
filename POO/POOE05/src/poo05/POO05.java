/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo05;

import Entidad.Cuenta;
import Servicio.ServCuenta;
import java.util.Arrays;

/**
 *
 * @author david
 */
public class POO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServCuenta sr = new ServCuenta();
        Cuenta cuenta = sr.crearCuenta();
        
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
        
        cuenta.ingresar(500);
        cuenta.consultarSaldo();
        
        cuenta.retiro(200);
        cuenta.consultarSaldo();
        
        cuenta.extracciónRápida();
        cuenta.consultarSaldo();
    }
    
}
