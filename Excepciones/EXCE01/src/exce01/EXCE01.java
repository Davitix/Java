/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce01;

import Entidad.Persona;
import Servicio.ServPersonas;

/**
 *
 * @author david
 */
public class EXCE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double bajo = 0, ideal = 0, sobrepeso = 0, mayores = 0, menores = 0, IMC;
        boolean mayorEdad;
        
        ServPersonas serv = new ServPersonas();
        
        Persona personita = new Persona();
        
        try{
            serv.esMayorDeEdad(personita.getEdad());
        } catch (NullPointerException a){
            System.out.println("Por favor escriba una edad válida.");
        }
        
    }
    
}
