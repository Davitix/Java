/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo;

import ServicioVehiculo.ServicioVehiculo;

/**
 *
 * @author david
 */
public class DesafioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioVehiculo serv = new ServicioVehiculo();
        
        serv.crearVehiculo();
        serv.frenar(serv.moverse());
        
    }
    
}
