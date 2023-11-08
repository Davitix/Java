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
public class servicioPuntos {
    
    Scanner leer = new Scanner(System.in);
    
    //Método para crear puntos
    public Puntos crearPuntos(){
        
        Puntos puntos = new Puntos();
        
        System.out.println("Ingrese las coordenadas del punto 1: ");
        System.out.print("Coordenada x: ");puntos.setX1(leer.nextInt());
        System.out.print("Coordenada y: ");puntos.setY1(leer.nextInt());
        
        System.out.println("Ingrese las coordenadas del punto 2: ");
        System.out.print("Coordenada x: ");puntos.setX2(leer.nextInt());
        System.out.print("Coordenada y: ");puntos.setY2(leer.nextInt());
        
        return puntos;
    }
    
    /*public double distanciaPuntos(Puntos punto){
        double distancia = Math.sqrt(Math.pow(punto.getX2()-punto.getX1(), 2)+Math.pow(punto.getY2()-punto.getY1(), 2));
        return distancia;
    }*/
    
}
