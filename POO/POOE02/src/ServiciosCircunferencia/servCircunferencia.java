/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosCircunferencia;

import Entidad.Circunferencia;
import java.util.*;

/**
 *
 * @author david
 */
public class servCircunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCincunferencia(){
        
        System.out.print("Ingrese el radio: ");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
}
