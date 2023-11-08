/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.*;

/**
 *
 * @author david
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int base, int altura) {
        this.capacidadMaxima = base;
        this.cantidadActual = altura;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("Ahora tiene una cantidad de :" + cantidadActual + " onzas.");
    }

    public void servirTaza(int taza) {
        if (cantidadActual < taza) {
            System.out.println("No se llenó la taza. Faltó por llenar un total de " + (taza - cantidadActual) + " onzas");
            cantidadActual = 0;
        } else {
            cantidadActual -= taza;
            System.out.println("Se llenó la taza");
        }
        System.out.println("Ahora tiene una cantidad de " + cantidadActual + " onzas.");
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Ahora tiene una cantidad de " + cantidadActual + " onzas.");
    }

    public void agregarCafe(int cafe) {
        cantidadActual += cafe;
        System.out.println("Ahora tiene una cantidad de " + cantidadActual + " onzas.");
    }

}
