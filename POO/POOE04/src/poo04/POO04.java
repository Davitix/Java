/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo04;

import Entidad.Rectangulo;
import Servicio.ServRectangulo;
import java.util.Arrays;

/**
 *
 * @author david
 */
public class POO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServRectangulo sr = new ServRectangulo();
        Rectangulo rect = sr.crearRectangulo();
        
        System.out.println("La superficie es: " + rect.superficie());
        System.out.println("El perimetro es: " + rect.perimetro());
        
        rect.imprimirRectangulo();
        
    }
    
}
