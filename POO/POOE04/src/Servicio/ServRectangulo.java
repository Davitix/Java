/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.*;

/**
 *
 * @author david
 */
public class ServRectangulo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rect = new Rectangulo();
        
        System.out.print("Ingrese la base del rectángulo: ");
        rect.setBase(leer.nextInt());
        
        System.out.print("Ingrese la altura del rectángulo: ");
        rect.setAltura(leer.nextInt());
        
        return rect;
    }
    
}
