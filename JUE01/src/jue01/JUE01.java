/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jue01;

import Entidad.DiscountCalculator;
import Servicio.ServiciosDisCalc;

/**
 *
 * @author david
 */
public class JUE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosDisCalc sd = new ServiciosDisCalc();
        DiscountCalculator discount = sd.createDiscount();
        
        System.out.println("El descuento es de: $" + String.format("%.2f", sd.discount(discount)));

    }

}
