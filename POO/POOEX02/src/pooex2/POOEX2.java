/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex2;

import Entidad.Puntos;
import Servicio.servicioPuntos;

/**
 *
 * @author david
 */
public class POOEX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicioPuntos serv = new servicioPuntos();
        Puntos punto = serv.crearPuntos();

        System.out.println("Los puntos ingresados son: " + punto.toString());
        System.out.println("La distancia entre sus puntos es: " + punto.distanciaPuntos());
    }
    
}
