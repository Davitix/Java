/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe9;

import Entidad.Matematica;
import Servicio.ServMatematica;

/**
 *
 * @author david
 */
public class POOE9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServMatematica serv = new ServMatematica();
        
        serv.crearNumeros();
        serv.imprimirNumeros();
        System.out.println(String.format("%.2f",serv.devolverMayor()));
        System.out.println(serv.calcularPotencia());
        System.out.println(String.format("%.4f",serv.calcularRaiz()));
        
    }
    
}
