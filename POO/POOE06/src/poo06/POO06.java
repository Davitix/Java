/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo06;

import Entidad.Cafetera;
import Servicio.ServCafetera;
import java.util.Arrays;

/**
 *
 * @author david
 */
public class POO06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServCafetera sr = new ServCafetera();
        Cafetera cafe = sr.crearCafetera();
        
        cafe.llenarCafetera();
        cafe.servirTaza(20);
        cafe.vaciarCafetera();
        cafe.agregarCafe(20);
        
    }
    
}
