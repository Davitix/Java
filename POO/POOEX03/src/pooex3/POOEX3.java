/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex3;

import Entidad.Raices;
import Servicio.servicioRaices;

/**
 *
 * @author david
 */
public class POOEX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicioRaices sr = new servicioRaices();
        Raices raiz = sr.crearRaices();

        raiz.calcular();
    }
    
}
