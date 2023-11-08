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
public class servicioRaices {
    
    Scanner leer = new Scanner(System.in);
    
    //Método para crear puntos
    public Raices crearRaices(){
        
        Raices raices = new Raices();
        
        System.out.print("Ingrese el valor del coeficiente a: ");
        raices.setA(leer.nextInt());
        
        System.out.print("Ingrese el valor del coeficiente b: ");
        raices.setB(leer.nextInt());
        
        System.out.print("Ingrese el valor del coeficiente c: ");
        raices.setC(leer.nextInt());
        
        return raices;
    }
    
    /*public double getDiscriminante(Raices raiz){
        return Math.pow(raiz.getB(), 2)-(4*raiz.getA()*raiz.getC());
    }
    
    public boolean tieneRaices(Raices raiz){
        return getDiscriminante(raiz)>=0;
    }
    
    public boolean tieneRaiz(Raices raiz){
        return getDiscriminante(raiz)==0;
    }
    
    public void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)){
            double raiz1=(-raiz.getB()-(Math.sqrt((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA());
            double raiz2=(-raiz.getB()+(Math.sqrt((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA());
            System.out.println("Las raices de la ecuación son: " + raiz1 + " y " + raiz2);
        }
    }
    
    public void obtenerRaiz(Raices raiz){
        if (tieneRaices(raiz)){
            double raices=(-raiz.getB()+(Math.sqrt((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA());
            System.out.println("Las raiz de la ecuación es: " + raiz);
        }
    }
    
    public void calcular(Raices raiz){
        tieneRaices(raiz);
        tieneRaiz(raiz);
        obtenerRaices(raiz);
        obtenerRaiz(raiz);
    }*/
    
}
