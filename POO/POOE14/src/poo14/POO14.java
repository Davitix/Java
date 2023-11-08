/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo14;

import Entidad.Movil;
import Servicio.ServMovil;
import java.util.Arrays;

/**
 *
 * @author david
 */
public class POO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServMovil servicio = new ServMovil();
        Movil persona = servicio.crearPersona();
        
        System.out.println(persona.toString());
        //System.out.println(Arrays.toString(persona.getAlumnos()));
        
    }
    
}
