/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rele03;

import Servicio.Baraja;

/**
 *
 * @author david
 */
public class RELE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baraja bj = new Baraja();
        bj.baraja();
        bj.barajar();
        System.out.print(bj.getBaraja());
    }
    
}
