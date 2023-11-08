/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.*;

/**
 *
 * @author david
 */
public class ServPersona {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona persona = new Persona();
        
        System.out.print("Ingrese su nombre: ");
        persona.setName(leer.nextLine());
        
        System.out.print("Ingrese su fecha de nacimiento (mm/dd/aaaa): ");
        persona.setBirthDate(new Date(leer.nextLine()));
        
        return persona;
    }
    
    /*public int calcularEdad(Persona persona){
        return persona.calcularEdad();
    }
    
    public boolean menorQue(Persona persona){
        return persona.menorQue(18);
    }
    
    public void mostrarPersona(Persona persona){
        persona.mostrarPersona();
    }*/
    
}
