/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe2;

import Entidad.*;
import ServiciosCircunferencia.*;

/**
 *
 * @author david
 */
public class POOE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servCircunferencia serv = new servCircunferencia();
        Circunferencia circulo = serv.crearCincunferencia();

        System.out.println("El radio del círculo es: " + circulo.getRadio() + ". Su perímetro: " + circulo.perimetro(circulo.getRadio())
                + " y su área " + circulo.area(circulo.getRadio()));
    }

}
