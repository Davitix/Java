/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex6;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;

/**
 *
 * @author david
 */
public class POOEX6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado ahorcado = sa.crearJuego();
        
        //System.out.println(ahorcado.getPalabra());
        sa.juego(ahorcado);
    }
    
}
