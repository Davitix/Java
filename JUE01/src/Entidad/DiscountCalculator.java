/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author david
 */
public class DiscountCalculator {
    
    private double precio;
    private double discount;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precio, double discount) {
        this.precio = precio;
        this.discount = discount;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "DiscountCalculator{" + "precio=" + precio + ", discount=" + discount + '}';
    }    
    
}
