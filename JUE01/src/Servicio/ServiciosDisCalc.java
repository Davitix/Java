/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServiciosDisCalc {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public DiscountCalculator createDiscount(){
        
        DiscountCalculator discount = new DiscountCalculator();
        
        System.out.print("Ingrese el precio del producto: $");
        discount.setPrecio(Double.parseDouble(leer.nextLine()));
        
        System.out.print("Ingrese el descuento (%): ");
        discount.setDiscount(Double.parseDouble(leer.nextLine()));
        
        return discount;
    }
    
    public double discount(DiscountCalculator discount){
        return discount.getPrecio()*discount.getDiscount()/100;
    }
    
}
