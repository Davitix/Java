/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex1;

import Entidad.Cancion;
import Servicio.serviciosCancion;

/**
 *
 * @author david
 */
public class POOEX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciosCancion serv = new serviciosCancion();
        Cancion cancion = serv.crearCancion();

        System.out.println("Los datos de la cancion son: " + cancion.toString());
        
    }
    
}
