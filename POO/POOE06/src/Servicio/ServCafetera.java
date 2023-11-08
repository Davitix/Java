/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.*;

/**
 *
 * @author david
 */
public class ServCafetera {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        
        Cafetera cafe = new Cafetera();
        
        System.out.print("Ingrese la cantidad maxima de la cafetera: ");
        cafe.setCapacidadMaxima(leer.nextInt());
        
        System.out.print("Ingrese la cantidad actual de café: ");
        cafe.setCantidadActual(leer.nextInt());
        
        return cafe;
    }
    
}
