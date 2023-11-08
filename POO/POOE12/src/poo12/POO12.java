/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo12;

import Entidad.Persona;
import Servicio.ServPersona;

/**
 *
 * @author david
 */
public class POO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServPersona servicio = new ServPersona();
        Persona persona = servicio.crearPersona();
        
        System.out.println("La persona tiene una edad de " + persona.calcularEdad() + " años");
        int compara = 18;
        System.out.println("Es " + persona.menorQue(compara) + " decir que la persona es menor de " + compara + " años");
        persona.mostrarPersona();
        
    }
    
}
